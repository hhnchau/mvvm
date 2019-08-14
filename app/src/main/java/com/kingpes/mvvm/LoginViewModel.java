package com.kingpes.mvvm;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import androidx.lifecycle.ViewModel;

public class LoginViewModel extends ViewModel {
    private LoginModel loginModel;
    private LoginCallback loginCallback;

    public LoginViewModel(LoginCallback loginCallback) {
        this.loginCallback = loginCallback;
        this.loginModel = new LoginModel();
    }

    public LoginModel getLoginModel() {
        return loginModel;
    }

    public void setLoginModel(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    public LoginCallback getLoginCallback() {
        return loginCallback;
    }

    public void setLoginCallback(LoginCallback loginCallback) {
        this.loginCallback = loginCallback;
    }


    public TextWatcher emailTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setEmail(editable.toString());
            }
        };
    }

    public TextWatcher passwordTextWatcher(){
        return new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                loginModel.setPassword(editable.toString());
            }
        };
    }

    public void onLoginBtnClick(View view){
        if (loginModel.isValid()){
            loginCallback.onSuccess("Login OK");
        }else {
            loginCallback.onFailure("Login Fail");
        }
    }
}
