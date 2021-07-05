package com.gunostore.shop.controller;

import com.gunostore.shop.models.Product;
import com.gunostore.shop.services.ProductServices;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.gunostore.shop.IServices.ProductIServices;

@Controller
public class ProductController {
    
    private ProductIServices product = new ProductServices();
    
    @RequestMapping(value = "/getAllProducts", produces = "application/json; charset=UTF-8") 
    public ModelAndView getAllProducts() {
        ProductIServices productService = new ProductServices();
        List<Product> products = productService.GetProductList();
        return new ModelAndView("productList", "products", products); 
    }
    
    @RequestMapping(value = "/getProductById/{productId}", produces = "application/json; charset=UTF-8")
    public ModelAndView getProductById(@PathVariable(value = "productId") String productId) {
        Product products = product.ById(productId);
        return new ModelAndView("productPage", "productObj", products);
    }

}