package com.kingpes.mvvm;

public interface LoginCallback {
    void onSuccess(String message);
    void onFailure(String message);
}
