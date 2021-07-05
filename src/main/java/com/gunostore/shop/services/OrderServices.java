/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gunostore.shop.services;

import com.gunostore.shop.models.CartItem;
import com.gunostore.shop.models.CustomerOrder;
import com.gunostore.shop.respository.CustomerOrderRespository;
import com.gunostore.shop.IServices.OrderIServices;

/**
 *
 * @author ADMIN
 */
public class OrderServices implements OrderIServices {
    public CustomerOrder GetOrder(String cartId) {
        return new CustomerOrderRespository().readAll(cartId);
    };
    
    public boolean Summit(CustomerOrder cus, String uid) {
       for(CartItem i : cus.getCart().getCartItem()) {
          new CustomerOrderRespository().res_cart_Summit(String.valueOf(cus.getCart().getCartId()),String.valueOf(i.getProduct().getProductId()), 
                                    String.valueOf(i.getCartItemId()), String.valueOf(i.getQuality()), uid);
       }
       return true;
    };
}
