package ua.nure.panicbutton.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

import ua.nure.panicbutton.R;
import ua.nure.panicbutton.Storage;
import ua.nure.panicbutton.util.Log;

public class LoginActivity extends AppCompatActivity {

    private EditText login;
    private Button loginButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        initUI();
    }

    private void initUI(){
        login = (EditText) findViewById(R.id.editEmail);
        loginButton = (Button) findViewById(R.id.loginBtn);

        loginButton.setOnClickListener(loginClickListener);
    }

    private OnClickListener loginClickListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            Storage.getSharedInstance().setLogin(login.getText().toString());
            startActivity(new Intent(LoginActivity.this, HomeActivity.class));
            finish();
        }
    };
}
