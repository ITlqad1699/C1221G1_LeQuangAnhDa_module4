package com.codegym.casestudy.repository.customer;

import com.codegym.casestudy.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ICustomerRepository extends JpaRepository<Customer, Integer> {
    Page<Customer> findAllByNameContaining(String keywordName, Pageable pageable);

    @Query(value = "select customer_code from customer", nativeQuery = true)
    List<String> getCustomerCode();

    Page<Customer> findAllByNameContainingAndCustomerCodeContainingAndCustomerType_Name(String keywordName, String keywordCode, String keywordType, Pageable pageable);

    @Query(value = "select * from customer where `name` like :searchName and customer_code like :searchCode and  customer_type_id like:searchType",
            countQuery = "select * from customer where `name` like :searchName and customer_code like :searchCode and customer_type_id like:searchType",
            nativeQuery = true)
    Page<Customer> findAllByNameCodeType(  @Param("searchName") String keywordName,
                                           @Param("searchCode") String keywordCode,
                                           @Param("searchType")  String keywordType,
                                           Pageable pageable);
}
