package com.test.practicemvp;


//邏輯處理
public class User {
    public boolean login(String id, String password) {
        if ( id.equals("abc") && password.equals("123")){
            return true;
        }else{
            return false;
        }
    }
}
