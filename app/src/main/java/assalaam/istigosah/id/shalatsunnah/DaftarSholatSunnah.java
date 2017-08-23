package assalaam.istigosah.id.shalatsunnah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DaftarSholatSunnah extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_sholat_sunnah);

        Button Dhuha =(Button) findViewById(R.id.Dhuha);
        Dhuha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatDhuha.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Tahajud =(Button) findViewById(R.id.Tahajud);

        Tahajud.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatThajud.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Gaib =(Button) findViewById(R.id.Gaib);

        Gaib.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatGaib.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Gerhana =(Button) findViewById(R.id.Gerhana);

        Gerhana.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatGerhana.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button Fitri =(Button) findViewById(R.id.Idul);

        Fitri.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatIdulFitri.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Adha =(Button) findViewById(R.id.Adha);

        Adha.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatIdulAdha.class);
                startActivityForResult(myIntent, 0);
            }
        });
        Button Istikharah =(Button) findViewById(R.id.Istikharah);

        Istikharah.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatIstikharah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Hajat =(Button) findViewById(R.id.Hajat);

        Hajat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatHajat.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Witir =(Button) findViewById(R.id.Witir);

        Witir.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatWitir.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Taubat =(Button) findViewById(R.id.Taubat);

        Taubat.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), SholatTaubat.class);
                startActivityForResult(myIntent, 0);
            }
        });
    }
}
