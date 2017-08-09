package assalaam.istigosah.id.shalatsunnah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;


public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        final ImageButton mulai =(ImageButton) findViewById(R.id.mulai);
        mulai.setOnClickListener(new View.OnClickListener(){
            public void onClick(View home){
                Intent myIntent = new
                        Intent(home.getContext(), DaftarSholatSunnah.class);
                startActivityForResult(myIntent, 0);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.home,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.home:
                Intent home = new Intent(Home.this,Home.class);

                startActivity(home);

                return true;

        }
        return false;
    }


}
