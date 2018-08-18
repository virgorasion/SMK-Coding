package widyanto.fauzan.smkcodingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.content.Intent;
import android.widget.TextView;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button btn = findViewById(R.id.pindah);
        TextView text = findViewById(R.id.textView);

        String tampung = getIntent().getStringExtra("Kata");

        text.setText(tampung);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(getApplicationContext(), Main3Activity.class);
                    startActivity(I);
            }
        });
    }
}
