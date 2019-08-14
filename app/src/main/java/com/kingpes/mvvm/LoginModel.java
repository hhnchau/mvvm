package com.kingpes.mvvm;

import android.text.TextUtils;

import androidx.annotation.Nullable;

public class LoginModel {

    @Nullable
    String email, password;

    public LoginModel() {
    }

    public LoginModel(@Nullable String email, @Nullable String password) {
        this.email = email;
        this.password = password;
    }

    @Nullable
    public String getEmail() {
        return email;
    }

    public void setEmail(@Nullable String email) {
        this.email = email;
    }

    @Nullable
    public String getPassword() {
        return password;
    }

    public void setPassword(@Nullable String password) {
        this.password = password;
    }

    public boolean isValid(){
        return !TextUtils.isEmpty(email) && !TextUtils.isEmpty(password) && getPassword().length() > 6;
    }
}
