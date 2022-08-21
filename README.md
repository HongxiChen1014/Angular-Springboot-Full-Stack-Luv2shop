# ecommerce
Full Stack: Angular and Spring Boot 

Luvshop is a Full-Stack Ecommerce web app that allows users to browse items online, add to a cart and proceed with payments.

<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/landing.png" alt="Landing Page" width="600" height="400">

### Tools and Frameworks
Frontend: Angular
Backend: Spring Boot(Hybernate, spring data JPA)

### Current Features
1. Allow users to browse items by categories or search names.
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/searchByCategory.png" alt="Search By Category" width="600" height="400">
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/searchByName.png" alt="Search By Name" width="600" height="400">

2. Add items to cart, increase or decrease the quantity and remove items directly.
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/cart.png" alt="Cart" width="600" height="400">

3. Display items information through pagination, users can resize the pagesize.
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/changePageSize.png" alt="Pagination" width="600" height="400">

4. Used {FormControl, Validators} to check the validation of checkout form input.Processed payments through Stripe.
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/checkOut1.png" alt="checkout1" width="600" height="400">
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/checkOut2.png" alt="checkout2" width="600">
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/checkInput.png" alt="Check Input" width="600" height="400">

5. Utilized ssl-localhost to secure communication with HTTPS
<img src="https://github.com/HongxiChen1014/ecommerce/blob/master/demoSource/secure.png" alt="Secure">

### Cons
!There are issues using the Registration page with the recent Okta changes for free accounts. Lets hope for the solution in future.
