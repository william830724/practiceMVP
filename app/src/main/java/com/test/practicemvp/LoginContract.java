package com.test.practicemvp;


//interface 連接 view Presenter
public interface LoginContract {
    interface ILoginView  {
        void onLoginSuccess(String message);

        void onLoginFail(String message);
    }

    interface ILoginPresenter {
        void login(String id, String password);
    }
}
