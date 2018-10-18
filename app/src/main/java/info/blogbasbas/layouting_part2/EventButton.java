package info.blogbasbas.layouting_part2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by User on 16/10/2018.
 */

public class EventButton extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //buat objek button
        Button eventButton = (Button) findViewById(R.id.btn_to_second);
        //event ketika button di klik, akan pindah ke page selanjutnya
        eventButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ketika di klik maka akan pindah page
                startActivity(new Intent(EventButton.this, SecondActivity.class));


            }
        });


    }
}
