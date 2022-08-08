package com.revature.SpringBootDemo.services;

import com.revature.SpringBootDemo.models.Shop;

import java.util.List;

public interface ShopService {

    boolean createShop(Shop shop);


    Shop getShopById(int id);





    List<Shop> getAllShops();

    boolean updateShop(Shop shop);



    boolean deleteShop(Shop shop);

    Shop getById(int id);
}
