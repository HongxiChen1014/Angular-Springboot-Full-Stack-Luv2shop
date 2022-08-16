import { Inject, Injectable } from '@angular/core';
import { HttpEvent,
         HttpHandler,
         HttpInterceptor,
         HttpRequest } from '@angular/common/http';
import { OktaAuthStateService, OKTA_AUTH } from '@okta/okta-angular';
import { OktaAuth } from '@okta/okta-auth-js';
import { from, Observable } from 'rxjs';
import { environment } from 'src/environments/environment';

@Injectable({
  providedIn: 'root'
})

export class AuthInterceptorService implements HttpInterceptor{

  constructor(@Inject(OKTA_AUTH) private oktaAuth: OktaAuth) { }

  intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>> {
    return from(this.handleAccess(request, next));
  }

private async handleAccess(request: HttpRequest<any>, next: HttpHandler): Promise<HttpEvent<any>> {

  // Only add an access token for secured endpoints
  const theEndpoint = environment.luv2shopApiUrl + '/orders';
  const securedEndpoints = [theEndpoint];

  if (securedEndpoints.some(url => request.urlWithParams.includes(url))) {

    // get access token
    const accessToken = await this.oktaAuth.getAccessToken();

    // clone the request and add new header with access token
    request = request.clone({
      setHeaders: {
        Authorization: 'Bearer ' + accessToken
      }
    });

  }

  return next.handle(request).toPromise();
}

}
