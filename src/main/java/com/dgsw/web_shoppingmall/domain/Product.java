package com.dgsw.web_shoppingmall.domain;

import java.time.LocalDateTime;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Product {
    private long id;
    private long menuId;
    private long hit;
    private String name;
    private int price;
    private byte sale;
    private String factory;
    private LocalDateTime releaseDate;
    private String details;
}