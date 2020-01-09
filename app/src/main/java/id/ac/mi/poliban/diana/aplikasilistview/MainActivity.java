package id.ac.mi.poliban.diana.aplikasilistview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

@SuppressWarnings("Covert2Lambda")
public  class MainActivity extends AppCompatActivity {
    private String[] negara = {"Indonesia", "Malaysia", "Singapore", "Italia", "Inggris", "Belanda",
            "Argentina", "Chile", "Mesir", "Uganda"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.list);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_list_item_1, android.R.id.text1, negara);
        list.setAdapter(adapter);

        list.setOnItemClickListener((parent, view, position, id) -> Toast.makeText(MainActivity.this, "Telah terpilih "+negara[position], Toast.LENGTH_SHORT).show());
    }
}