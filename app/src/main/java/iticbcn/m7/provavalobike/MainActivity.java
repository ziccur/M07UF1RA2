package iticbcn.m7.provavalobike;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        Button btnTutorial = findViewById(R.id.button3);
        Button btnLogin = findViewById(R.id.button4);
        Button btnRegister = findViewById(R.id.button5);
        Button btnScan = findViewById(R.id.button6);
        Button btnProfile = findViewById(R.id.button7);
        Button btnTutorial2 = findViewById(R.id.button8);
        Button btnTutorial3 = findViewById(R.id.button9);
        Button btnLogo = findViewById(R.id.button10);

        btnTutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, Tutorial1Activity.class);
                startActivity(intent);
            }
        });

        btnTutorial2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, Tutorial2Activity.class);
                startActivity(intent);
            }
        });

        btnTutorial3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, Tutorial3Activity.class);
                startActivity(intent);
            }
        });

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btnScan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, EscaneixActivity.class);
                startActivity(intent);
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

        btnLogo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar otra actividad
                Intent intent = new Intent(MainActivity.this, ChoseActivity.class);
                startActivity(intent);
            }
        });

    }



}