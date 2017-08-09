package assalaam.istigosah.id.shalatsunnah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class AssalaamWeb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_assalaam_web);
        WebView mywebView=(WebView) findViewById(R.id.webView);
        mywebView.loadUrl("http://www.smkassalaambandung.sch.id");
        WebSettings webSettings=mywebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
