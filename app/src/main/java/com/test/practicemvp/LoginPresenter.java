package com.test.practicemvp;

public class LoginPresenter implements LoginContract.ILoginPresenter{
    private LoginContract.ILoginView view;

    LoginPresenter(LoginContract.ILoginView view) {
        this.view = view;
    }

    @Override
    public void login(String id, String password) {
        User user = new User();

        boolean isSuccess = user.login(id, password);

        if ( isSuccess ){
            view.onLoginSuccess("Incorrect username or password.");
        }else{
            view.onLoginFail("Login success");
        }
    }
}
