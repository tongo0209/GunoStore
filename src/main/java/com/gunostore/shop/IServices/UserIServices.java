package com.gunostore.shop.IServices;

import com.gunostore.shop.models.Customer;
import com.gunostore.shop.models.Shipping;
import com.gunostore.shop.models.User;
import com.gunostore.shop.models.UserList;
import java.util.List;

public interface UserIServices {
    public User Login(String email, String password);
    public List<UserList> ByList();
    public boolean Create(Customer cinfo);
    public boolean Delete(String id, String uid);
}
