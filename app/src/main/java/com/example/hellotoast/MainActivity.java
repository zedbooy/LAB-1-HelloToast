package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView counterText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        counterText = findViewById(R.id.txt_counter);

        Button btnToast = findViewById(R.id.btn_message);
        Button btnAdd = findViewById(R.id.btn_increment);

        btnToast.setOnClickListener(v ->
                Toast.makeText(MainActivity.this,
                        "Hello from Toast ",
                        Toast.LENGTH_SHORT).show()
        );

        btnAdd.setOnClickListener(v -> {
            counter++;
            counterText.setText(String.valueOf(counter));
        });
    }
}
