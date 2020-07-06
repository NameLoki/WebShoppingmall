package com.dgsw.web_shoppingmall.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class User {
    private long id;
    private String account;
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;
    private String userName;
    private String tel;
    private String phone;
    private String zipCode;
    private String address;
    private String emaill;
    private LocalDateTime created;
    private LocalDateTime modified;
}