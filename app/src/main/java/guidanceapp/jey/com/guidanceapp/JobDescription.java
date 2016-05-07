package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;

/**
 * Class for see the details of different jobs in IT field
 *
 * Created by Jeyamaal on 14-Mar-16.
 */
public class JobDescription extends Activity {


    private ProgressBar spinner;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.job_description);

        webView = (WebView) findViewById(R.id.webView_jobDes);
        spinner = (ProgressBar)findViewById(R.id.progressBar);


        webView.setWebViewClient(new myWebClient());
        webView.setInitialScale(1);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setLoadWithOverviewMode(true);
        webView.getSettings().setUseWideViewPort(true);
        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
        webView.setScrollbarFadingEnabled(false);
        webView.loadUrl("http://www.totaljobs.com/careers-advice/job-profile/it-jobs/it-manager-job-description");



    }


    /**
     * Redirect to webpage
     *
     */

    public class myWebClient extends WebViewClient{

        @Override
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            Toast.makeText(getApplicationContext(),"Loading .......",Toast.LENGTH_LONG).show();

        }

        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {

            spinner.setVisibility(View.VISIBLE);


            view.loadUrl("http://www.totaljobs.com/careers-advice/job-profile/it-jobs/it-manager-job-description");

            return true;

        }


        @Override
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            spinner.setVisibility(View.GONE);
        }



    }
}
