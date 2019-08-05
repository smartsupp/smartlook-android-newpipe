package org.schabi.newpipe.smartlook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;

import org.schabi.newpipe.R;

public class SmartlookPlaygroundActivity extends AppCompatActivity {

    private static final String HTML = "<!doctype html>\n" +
            "\n" +
            "<html lang=\"en\">\n" +
            "<head>\n" +
            "  <meta charset=\"utf-8\">\n" +
            "\n" +
            "  <title>Smartlook Test</title>\n" +
            "  <meta name=\"description\" content=\"Smartlook Test\">\n" +
            "</head>\n" +
            "\n" +
            "<body>\n" +
            "\t<div class='random'>\n" +
            "\t\t<h1>Smartlook testing</h1>\n" +
            "\t</div>\n" +
            "\t<div class='smartlook-hide'>\n" +
            "\t\t<h1>Smartlook HIDDEN</h1>\n" +
            "\t</div>\n" +
            "\t<div class='random'>\n" +
            "\t\t<h1>Smartlook testing</h1>\n" +
            "\t</div>\n" +
            "\t<div class='smartlook-hide'>\n" +
            "\t\t<h1>Smartlook HIDDEN</h1>\n" +
            "\t</div>\n" +
            "\t<div class='random'>\n" +
            "\t\t<h1>Smartlook testing</h1>\n" +
            "\t</div>\n" +
            "</body>\n" +
            "</html>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_smartlook_playground);

        LinearLayout level1 = findViewById(R.id.lvl_1);
        FrameLayout level2 = findViewById(R.id.lvl_2);
        FrameLayout level3 = findViewById(R.id.lvl_3);
        ImageView level4 = findViewById(R.id.lvl_4);
        WebView webView = findViewById(R.id.webview);


        webView.loadDataWithBaseURL("", HTML, "text/html", "UTF-8", "");
        webView.getSettings().setJavaScriptEnabled(true);


        level2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        level3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
