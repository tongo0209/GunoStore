/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gunostore.shop.services;

import com.gunostore.shop.models.Product;
import com.gunostore.shop.respository.ProductRespository;
import java.util.List;
import com.gunostore.shop.IServices.ProductIServices;

/**
 *
 * @author ADMIN
 */
public class ProductServices implements ProductIServices {
    public List<Product> GetProductList() {
        return new ProductRespository().readAll();
    };
     
    public Product ById(String id) {
        return new ProductRespository().product_product_ById(id);
    };
    
    public boolean EditById(Product prod, String uid) {
        return new ProductRespository().product_product_EditById(prod, uid);
    };
    
    public boolean DeleteById(String prodID, String uid) {
        return new ProductRespository().product_product_DeleteById(prodID, uid);
    };
    
    public Integer Create(Product prod, String uid) {
        return new ProductRespository().product_product_Create(prod, uid);
   };
}
