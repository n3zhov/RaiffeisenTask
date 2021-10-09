package com.example.interntask;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


public class SocksByType {
    private String color;
    private Integer cottonPart;
    private Integer quantity;
    @Id
    private Integer type_id;

    SocksByType(String color, Integer cottonPart, Integer quantity, Integer type_id){
        this.color = color;
        this.cottonPart = cottonPart;
        this.quantity = quantity;
        this.type_id = type_id;
    }
    static SocksByType create(String color, Integer cottonPart, Integer quantity, Integer type_id){
        return new SocksByType(color, cottonPart, quantity, type_id);
    }

    void setQuantity(Integer quantity){
        this.quantity = quantity;
    }

    Integer getQuantity(){
        return this.quantity;
    }
}
