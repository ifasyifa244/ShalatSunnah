package assalaam.istigosah.id.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class SholatIdulAdha extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sholat_idul_adha);

        ImageButton tentang =(ImageButton) findViewById(R.id.buku);
        tentang.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), PengertianIdulAdha.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton tatacara =(ImageButton) findViewById(R.id.tatacara);
        tatacara.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(), TatacaraIdulAdha.class);
                startActivityForResult(myIntent, 0);
            }
        });

        ImageButton doa =(ImageButton) findViewById(R.id.doa);
        doa.setOnClickListener(new View.OnClickListener(){
            public void onClick(View bebek){
                Intent myIntent = new
                        Intent(bebek.getContext(),DoaIdulAdha.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
