package akshaygalande.com.sportsfantasyindia.dummyintent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goback(View view) {
        Intent intent = getPackageManager().getLaunchIntentForPackage("com.sportsfantasyindia.akshay_galande");
        startActivity(intent);
    }

    public void loadweb(View view) {
        WebView webView=findViewById(R.id.web);
        webView.loadUrl("http://sportsfantasyindia.com");
        WebViewClient webViewClient=new WebViewClient();
        webView.setWebViewClient(webViewClient);
        WebSettings webSettings=webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}
