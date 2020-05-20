package digiplus.ma.mymusicplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = MediaPlayer.create(this, R.raw.adkar);
        Button PlayButton = (Button) findViewById(R.id.Play);
        Button PauseButton = (Button) findViewById(R.id.Pause);

        PlayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mediaPlayer.start();
                mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    @Override
                    public void onCompletion(MediaPlayer mediaPlayer) {
                        Toast.makeText(MainActivity.this, "I'm Done !",Toast.LENGTH_SHORT ).show();
                    }
                });

                Toast.makeText(MainActivity.this, "Play",Toast.LENGTH_LONG ).show();
            }
        });

        PauseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.pause();
                Toast.makeText(MainActivity.this, "Pause",Toast.LENGTH_LONG ).show();
            }
        });
    }
}
