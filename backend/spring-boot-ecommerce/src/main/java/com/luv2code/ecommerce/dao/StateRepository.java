package com.luv2code.ecommerce.dao;

import com.luv2code.ecommerce.entity.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface StateRepository extends JpaRepository<State, Integer> {
    // To retrieve states for a given country code
    // http://localhost:8080/api/states/search/fingByCountryCode?code=IN
    List<State> findByCountryCode(@Param("code") String code);

}
