package ru.mirea.fursovgs.control_lesson4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox chng;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.textView);
        btnWhoAmI = findViewById(R.id.button);
        btnItIsNotMe = findViewById(R.id.button2);
        chng = findViewById(R.id.checkBox);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Мой номер по списку № 34");
                if (chng.isChecked()) {
                    chng.setChecked(false);
                } else {
                    chng.setChecked(true);
                }
            }
        };

        btnWhoAmI.setOnClickListener(oclBtnWhoAmI);
    }

    public void OnebtnItIsNotMe(View view) {
        Toast.makeText(this, "It's not me", Toast.LENGTH_SHORT).show();
        textView.setText("It's not me");
        if (chng.isChecked()) {
            chng.setChecked(false);
        } else {
            chng.setChecked(true);
        }
    }
}