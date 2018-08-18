package widyanto.fauzan.smkcodingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView text = findViewById(R.id.text1);
        Button tambah = findViewById(R.id.tambah);
        Button kurang = findViewById(R.id.kurang);
        Button pindah = findViewById(R.id.pindah);
        final Button btnEdit = findViewById(R.id.btnEdit);
        final EditText editText = findViewById(R.id.editText);

        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1String = text.getText().toString();
                int text1Int = Integer.valueOf(text1String);
                text.setText(String.valueOf(text1Int+1));
            }
        });

        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text1String = text.getText().toString();
                int text1Int = Integer.valueOf(text1String);
                text1Int--;
                text.setText(String.valueOf(text1Int));
            }
        });

        btnEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                i.putExtra("Kata", editText.getText().toString());
                startActivity(i);
            }
        });

        pindah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(i);
            }
        });
    }



    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
