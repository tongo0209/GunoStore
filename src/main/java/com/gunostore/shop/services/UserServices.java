package com.gunostore.shop.services;

import com.gunostore.shop.models.Customer;
import com.gunostore.shop.models.Shipping;
import com.gunostore.shop.respository.UserRespository;
import com.gunostore.shop.models.User;
import com.gunostore.shop.models.UserList;
import java.util.List;
import com.gunostore.shop.IServices.UserIServices;


public class UserServices implements UserIServices {
    public User Login(String email, String password) {
        return new UserRespository().res_users_Login(email, password);
    };
    
    public List<UserList> ByList() {
        return new UserRespository().res_users_ByList();
    };
    
    public boolean Create(Customer cinfo) {
        return new UserRespository().res_users_Create(cinfo);
    };
    
    public boolean Delete(String id, String uid) {
        return new UserRespository().res_user_Delete(id, uid);
    };
}
