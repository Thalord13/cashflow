package com.thonyindustry.tigom.login.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.thonyindustry.tigom.login.Presenter.LoginActivityPresenter;
import com.thonyindustry.tigom.R;

public class LoginActivity extends AppCompatActivity {

    Button btnLogin;
    TextView btnRegister;
    LoginActivityPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginPresenter = new LoginActivityPresenter(this);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.txtRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
//                Intent tigom = new Intent(LoginActivity.this,  TigomActivity.class);
//                startActivity(tigom);
                loginPresenter.login();
            }
        });

        btnRegister.setOnClickListener(v -> {
            loginPresenter.register();
        });

    }
}