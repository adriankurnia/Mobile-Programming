package umn.ac.id.utsmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginPage extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    Button backBtn;

    String correct_username = "uasmobile";
    String correct_password = "uasmobilegenap";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);

        backBtn = findViewById(R.id.backBtn);
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnMainActivity();
            }
        });

        btnLogin = findViewById(R.id.login);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(TextUtils.isEmpty(username.getText().toString()) || TextUtils.isEmpty((password.getText().toString()))){
                    Toast.makeText(LoginPage.this,"Empty Data", Toast.LENGTH_LONG).show();
                }else if (username.getText().toString().equals(correct_username)) {
                    if (password.getText().toString().equals(correct_password)) {
                        success();
                    } else {
                        Toast.makeText(LoginPage.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                    }
                }else {
                    Toast.makeText(LoginPage.this, "Invalid Username/Password", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

    private void returnMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void success() {
        Intent intent = new Intent(this, MenuPage.class);
        startActivity(intent);
    }
}