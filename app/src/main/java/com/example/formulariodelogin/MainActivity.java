package com.example.formulariodelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edt_userName;
    EditText edt_password;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt_userName = findViewById(R.id.edt_userName);
        edt_password = findViewById(R.id.edt_password);
        btn_login = findViewById(R.id.btn_login);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = edt_userName.getText().toString();
                String password = edt_password.getText().toString();

                if (userName.isEmpty() || password.isEmpty()){
                    Toast.makeText(MainActivity.this, "Campos Vazios", Toast.LENGTH_LONG).show();
                }else{
                    if (userName.equals("user") && password.equals("12345")){
                        Toast.makeText(MainActivity.this, "Login efectuado com sucesso", Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Palavra Passe ou User errados!", Toast.LENGTH_SHORT).show();
                    }
                    limparCampos();
                }
            }
        });

    }

    private void limparCampos(){
        edt_userName.setText("");
        edt_password.setText("");
    }
}