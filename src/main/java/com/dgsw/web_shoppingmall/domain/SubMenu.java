package com.dgsw.web_shoppingmall.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class SubMenu {
    private long id;
    private long menuId;
    private String name;
}