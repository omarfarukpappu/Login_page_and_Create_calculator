package com.example.labreport1;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    EditText username;
    EditText password;
    Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.b1);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("Omarfaruq") &&

                        password.getText().toString().equals("123456")){

                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                    startActivity(intent);

                    Toast.makeText(MainActivity.this,"Login Successfull", Toast.LENGTH_SHORT).show();

                }
                else{

                    Toast.makeText(MainActivity.this,"Login Failed", Toast.LENGTH_SHORT).show();

                }
            }
        });

    }
}