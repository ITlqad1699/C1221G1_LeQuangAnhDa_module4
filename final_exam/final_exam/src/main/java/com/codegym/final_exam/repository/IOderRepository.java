package com.codegym.final_exam.repository;


import com.codegym.final_exam.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IOderRepository extends JpaRepository<Order,Integer> {


    Order findFirstByOrderId(Integer id);

    Page<Order> findAllByPurchaseDateAfterAndPurchaseDateBefore(Pageable pageable, String dateStartKey, String dateEndKey);
    Page<Order> findAllByPurchaseDateAfter(String dateStartKey, Pageable pageable);

    Page<Order> findAllByPurchaseDateBefore(String dateEndKey, Pageable pageable);

    @Query(value = "select product.product_id, name, price, status, order_id, purchase_date, quantity, product_type_name from product join order_product op on product.product_id = op.product_id join product_type pt on product.product_type_id = pt.product_type_id order by op.quantity * product.price desc ",
            countQuery = "select product.product_id, name, price, status, order_id, purchase_date, quantity, product_type_name from product join order_product op on product.product_id = op.product_id join product_type pt on product.product_type_id = pt.product_type_id order by op.quantity * product.price desc",
            nativeQuery = true)
    Page<Order> findAllByTotalMoney(Pageable pageable);
}
