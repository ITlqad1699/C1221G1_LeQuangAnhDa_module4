package com.codegym.demo.dto;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.time.LocalDate;

public class UserDto implements Validator {

    private Integer id;
    @NotBlank(message = "name is not null")
    private String name;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @NotEmpty(message = "day of birth is not null")
    private String dayOfBirth;
    private String phoneNumber;
    @Email(message = "email is not valid")
    @NotBlank(message = "email is not empty")
    private String email;

    public UserDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBirth() {

        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        String phone = userDto.getPhoneNumber();
        if(!"".equals(userDto.getDayOfBirth())) {
            LocalDate date = LocalDate.parse(userDto.getDayOfBirth());
            if((LocalDate.now().minusYears(18)).isBefore(date)){
                errors.rejectValue("dayOfBirth","date.valid","errors");
            }
        }
        ValidationUtils.rejectIfEmpty(errors, "phoneNumber", "phone.empty","errors");
        if (phone.length() > 12 || phone.length() < 10) {
            errors.rejectValue("phoneNumber", "phone.length", "errors");
        }
        if (!phone.startsWith("0")) {
            errors.rejectValue("phoneNumber", "phone.startsWith", "errors");
        }
        if (!phone.matches("(^$|[0-9]*$)")) {
            errors.rejectValue("phoneNumber", "phone.matches","errors");
        }
    }
}
