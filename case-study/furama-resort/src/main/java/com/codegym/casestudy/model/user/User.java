package com.codegym.casestudy.model.user;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
    @Id
    private String UserName;
    private String Password;

}
