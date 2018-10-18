package info.blogbasbas.layouting_part2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by User on 16/10/2018.
 */

public class EventKlik extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        //buat objek
        final EditText editTextNialai1 = (EditText) findViewById(R.id.editText_nilai_1);
        final EditText editTextNialai2 = (EditText) findViewById(R.id.editText_nilai_2);
        Button btnHitung = (Button) findViewById(R.id.button_hitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //perkalian
                int nilaiSatu = Integer.parseInt(editTextNialai1.getText().toString());
                int nilaiDua = Integer.parseInt(editTextNialai2.getText().toString());
                int hasil = nilaiDua * nilaiSatu ;
                Toast.makeText(EventKlik.this,
                        "Hasilnya :"+hasil, Toast.LENGTH_SHORT).show();

            }
        });




    }
}
