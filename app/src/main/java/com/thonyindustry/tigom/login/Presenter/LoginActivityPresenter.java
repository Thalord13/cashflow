package com.thonyindustry.tigom.login.Presenter;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import com.thonyindustry.tigom.TigomActivity;
import com.thonyindustry.tigom.register.View.RegisterActivity;

public class LoginActivityPresenter {

    private final Context context;

    public LoginActivityPresenter(Context context) {
        this.context = context;
    }

    public void login() {
        // Toast.makeText(context, "test", Toast.LENGTH_SHORT).show();
        Intent tigom = new Intent(context, TigomActivity.class);
        context.startActivity(tigom);
    }

    public void register() {
        // Toast.makeText(context, "test", Toast.LENGTH_SHORT).show();
        Intent tigom = new Intent(context, RegisterActivity.class);
        context.startActivity(tigom);
    }

}
