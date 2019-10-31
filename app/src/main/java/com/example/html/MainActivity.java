package com.example.html;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.webkit.WebView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

//    private WebView webView;
    private TextView textView;

    String dataList = "<h1> This is Header 1 </h1> \n" +
            "<h2> This is Header 2 </h2> \n" +
            "<h3> This is Header 3 </h3> \n" +
            "<p> This is a Paragraph </p> \n" +
            "<h4><u> This is an Underline </u></h1> \n" +
            "<h4><b> This is a Bolt text </b></h4> \n" +
            "<h4><i> This is an Italic </i></h4> \n \n" +
            "<h3> Programming Language ordered list </h3> \n" +
            "<ol>" +
                "<li> C </li> \n" +
                "<li> C++ </li> \n" +
                "<li> C# </li> \n" +
                "<li> JAVA </li> \n" +
                "<li> PYTHON </li> \n" +
            "</ol> \n \n" +
            "<h3> Programming Language Unordered list </h3> \n" +
            "<ul>" +
                "<li> C </li> \n" +
                "<li> C++ </li> \n" +
                "<li> C# </li> \n" +
                "<li> JAVA </li> \n" +
                "<li> PYTHON </li> \n" +
            "</ul> \n" +
            "(a+b)<sup>2</sup> = a <sup>2</sup> + 2ab + b<sup>2</sup>";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView_id);
        textView.setText(Html.fromHtml(dataList));

        /*webView = findViewById(R.id.webView_id);
        webView.loadDataWithBaseURL(null, dataList, "text/html", "utf-8",null);*/

    }
}
