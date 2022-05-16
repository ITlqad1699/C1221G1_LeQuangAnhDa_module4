package com.codegym.aspect;

import com.codegym.model.Books;
import com.codegym.util.ReadAndWriteFile;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class LogAspect {
    private final String path = "D:\\codegym\\module4_codegym\\ss9_aop\\exercises\\books_app\\src\\main\\resources\\file_log\\file-log.csv\\";

    @Pointcut("execution(* com.codegym.controller.BooksAppController.*(..))")
    public void allMethodPointCut() {
    }

//    @AfterReturning("allMethodPointCut()")
//    public void beforeCallMethod(JoinPoint joinPoint) {
//        List<String> logging = new ArrayList<>();
//        String method = joinPoint.getSignature().getName();
//        if (method.equals("borrowBook")) {
//            Object[] objects = joinPoint.getArgs();
//            Books book = (Books) objects[0];
//            String args = book.getNameBooks();
//            logging.add("[Time]: " + LocalDateTime.now() + " End method: " + method + " Book: " + args);
//        } else {
//            Object[] objects = joinPoint.getArgs();
//            String args = (String) objects[0];
//            logging.add("[Time]: " + LocalDateTime.now() + " End method: " + method + " Code: " + args);
//        }
//        ReadAndWriteFile.writeListStringToCSV(path, logging);
//    }

    @After("allMethodPointCut()")
    public void afterCallMethod(JoinPoint joinPoint) {
        System.err.println("End method name: "
                + joinPoint.getSignature().getName() +
                "time: " + LocalDate.now());
    }
}
