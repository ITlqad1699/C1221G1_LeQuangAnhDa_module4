package com.codegym.de_thi_thu.repository;

import com.codegym.de_thi_thu.model.Order;
import com.codegym.de_thi_thu.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;

public interface IOderRepository extends JpaRepository<Order,Integer> {


    Order findFirstByOrderId(Integer id);


//    @Query(value = "select order_id," +
//            "purchase_date, " +
//            "product.name , " +
//            "product_type_name," +
//            "price," +
//            "quantity, " +
//            "quantity*price as sum " +
//            "from product_type " +
//            "join product p on product_type.product_type_id = p.product_type_id\n" +
//            "join order_product op on p.product_id = op.product_id " +
//            "where (purchase_date between :dateStart  and :dateEnd)",
//            countQuery = "select order_id," +
//                    "purchase_date, " +
//                    "product.name , " +
//                    "product_type_name," +
//                    "price,quantity," +
//                    " quantity*price as sum " +
//                    "from product_type " +
//                    "join product p on product_type.product_type_id = p.product_type_id\n" +
//                    "join order_product op on p.product_id = op.product_id " +
//                    "where (purchase_date between :dateStart  and :dateEnd)",
//            nativeQuery = true)
//    Page<Order> findAllByDate(Pageable pageable,
//                                @Param("dateStart") LocalDate dateStart,
//                                @Param("dateEnd") LocalDate dateEnd);

    Page<Order> findAllByPurchaseDateAfterAndPurchaseDateBefore( Pageable pageable,String dateStartKey,String dateEndKey);
    Page<Order> findAllByPurchaseDateAfter(String dateStartKey, Pageable pageable);

    Page<Order> findAllByPurchaseDateBefore(String dateEndKey, Pageable pageable);

    @Query(value = "select product.product_id, name, price, status, order_id, purchase_date, quantity, product_type_name from product join order_product op on product.product_id = op.product_id join product_type pt on product.product_type_id = pt.product_type_id order by op.quantity * product.price desc ",
            countQuery = "select product.product_id, name, price, status, order_id, purchase_date, quantity, product_type_name from product join order_product op on product.product_id = op.product_id join product_type pt on product.product_type_id = pt.product_type_id order by op.quantity * product.price desc",
            nativeQuery = true)
    Page<Order> findAllByTotalMoney(Pageable pageable);
}
