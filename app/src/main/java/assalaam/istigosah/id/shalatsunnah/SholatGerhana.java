package assalaam.istigosah.id.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SholatGerhana extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_gerhana);

        ImageButton tentang =(ImageButton) findViewById(R.id.buku);
        tentang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PengertianGerhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton tatacara =(ImageButton) findViewById(R.id.tatacara);
        tatacara.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), TatacaraGerhana.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton doa =(ImageButton) findViewById(R.id.doa);
        doa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),DoaGerhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
