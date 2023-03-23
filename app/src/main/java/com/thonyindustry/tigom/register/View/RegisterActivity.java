package com.thonyindustry.tigom.register.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;
import com.thonyindustry.tigom.R;
import com.thonyindustry.tigom.Register;
import com.thonyindustry.tigom.RegisterAPI;
import com.thonyindustry.tigom.RestAPIClient;

import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import io.reactivex.Observable;

public class RegisterActivity extends AppCompatActivity {

    private RegisterAPI apiService;
    RegisterAPI api;
    Button bttnRegister;
    TextInputEditText textUsrname, textPassword;

    CompositeDisposable compositeDisposable = new CompositeDisposable();

    @Override
    protected void onStop() {
        compositeDisposable.clear();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        compositeDisposable.clear();
        super.onDestroy();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Retrofit retrofit = RestAPIClient.getInstance();
        api = retrofit.create(RegisterAPI.class);

        textUsrname = findViewById(R.id.txtUsername);
        textPassword = findViewById(R.id.txtPassword);

        bttnRegister = findViewById(R.id.btnRegister);
        bttnRegister.setOnClickListener(v -> {
            createAccount(textUsrname.getText().toString(), textPassword.getText().toString(), 1);
//            Toast.makeText(this, "ULOL", Toast.LENGTH_SHORT).show();
        });


    }

    public void createAccount(String username, String password, int statusid) {
        compositeDisposable.add(api.createUser(username,password,statusid)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe(responseBody -> Toast.makeText(RegisterActivity.this, ""+responseBody, Toast.LENGTH_SHORT).show()));
    }

}