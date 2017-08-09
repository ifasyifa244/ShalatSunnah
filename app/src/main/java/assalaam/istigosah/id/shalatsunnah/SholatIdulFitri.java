package assalaam.istigosah.id.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SholatIdulFitri extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_idul_fitri);

        ImageButton tentang =(ImageButton) findViewById(R.id.buku);
        tentang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PengertianIdulFitri.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton tatacara =(ImageButton) findViewById(R.id.tatacara);
        tatacara.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), TatacaraIdulFitri.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton doa =(ImageButton) findViewById(R.id.doa);
        doa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),DoaIdulFitri.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }
}
