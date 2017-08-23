package assalaam.istigosah.id.shalatsunnah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.content.DialogInterface;
import android.app.AlertDialog;
import android.media.MediaPlayer;


public class Home extends AppCompatActivity {

    MediaPlayer bgsound;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bgsound=MediaPlayer.create(this,R.raw.sound);
        bgsound.setLooping(true);
        bgsound.setVolume(1,1);
        bgsound.start();

        Button In = (Button) findViewById(R.id.in);
        In.setOnClickListener(new View.OnClickListener() {
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), DaftarSholatSunnah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button About = (Button) findViewById(R.id.about);
        About.setOnClickListener(new View.OnClickListener() {
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), Profile.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Website = (Button) findViewById(R.id.logo);
        Website.setOnClickListener(new View.OnClickListener() {
            public void onClick(View pilih) {
                Intent myIntent = new
                        Intent(pilih.getContext(), AssalaamWeb.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }

        public void onBackPressed() {
            new AlertDialog.Builder(this)
                    .setMessage("Apa Anda Ingin Keluar?")
                    .setCancelable(false)
                    .setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int id) {
                            Home.this.finish();
                        }
                    })
                    .setNegativeButton("Tidak", null)
                    .show();
            bgsound.stop();
        }
}





