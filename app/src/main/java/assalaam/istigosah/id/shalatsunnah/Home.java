package assalaam.istigosah.id.shalatsunnah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button In =(Button) findViewById(R.id.in);
        In.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), DaftarSholatSunnah.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button About =(Button) findViewById(R.id.about);
        About.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), Profile.class);
                startActivityForResult(myIntent, 0);
            }
        });

        Button Website =(Button) findViewById(R.id.logo);
        Website.setOnClickListener(new View.OnClickListener(){
            public void onClick(View pilih){
                Intent myIntent = new
                        Intent(pilih.getContext(), AssalaamWeb.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }



}
