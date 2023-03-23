package com.thonyindustry.tigom.register.Presenter;

import android.content.Context;
import android.content.Intent;

import com.thonyindustry.tigom.login.View.LoginActivity;

public class RegisterActivityPresenter {

    private final Context context;

    public RegisterActivityPresenter(Context context) {
        this.context = context;
    }

    public void login() {
        // Toast.makeText(context, "test", Toast.LENGTH_SHORT).show();
        Intent tigom = new Intent(context, LoginActivity.class);
        context.startActivity(tigom);
    }

}
