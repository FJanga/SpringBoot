package com.revature.SpringBootDemo.models;

import lombok.Data;


import javax.persistence.*;


@Entity
@Table(name = "shops")
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "s_id")
    private int id;

   @Column(name = "s_name",nullable = false,unique = true)
    private String  shopName;


    @Column(name = "s_iven_count", nullable = false)
    private int inventoryCount;


    public Shop() {
    }

    public Shop(int id, String name, int inventoryCount) {
        this.id = id;
        this.shopName = name;
        this.inventoryCount = inventoryCount;
    }

    public Shop(String name, int inventoryCount) {
        this.shopName = name;
        this.inventoryCount = inventoryCount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return shopName;
    }

    public void setName(String name) {
        this.shopName = name;
    }

    public int getInventoryCount() {
        return inventoryCount;
    }

    public void setInventoryCount(int inventoryCount) {
        this.inventoryCount = inventoryCount;
    }
}
