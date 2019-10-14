package xyz.imtiyaz.weblauncher;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        WebView myWeb = (WebView) findViewById(R.id.web_view);
        myWeb.loadUrl("https://webedukasi.000webhostapp.com");
        myWeb.setWebViewClient(new WebViewClient());

        WebSettings webSettings = myWeb.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(false);
    }
}
