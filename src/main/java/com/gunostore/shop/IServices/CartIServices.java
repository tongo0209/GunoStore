/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gunostore.shop.IServices;

import com.gunostore.shop.models.Cart;

/**
 *
 * @author ADMIN
 */
public interface CartIServices {
    public Cart ById(String id);
    public Integer GetId(String uid);
    public boolean RemoveCartItem(String id, String uid);
    public boolean RemoveAllCartItem(String cartId, String uid);
    public boolean CreateCartItem(String cartId, String quantity,String price,String product_id,String uid);
    public boolean CreateCartOder(String cartId,String uid);
}
