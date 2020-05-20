package digiplus.ma.mymusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button PlayButton = (Button) findViewById(R.id.Play);
        Button PauseButton = (Button) findViewById(R.id.Pause);

        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Play",Toast.LENGTH_LONG ).show();
            }
        });

        PauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Pause",Toast.LENGTH_LONG ).show();
            }
        });
    }
}
