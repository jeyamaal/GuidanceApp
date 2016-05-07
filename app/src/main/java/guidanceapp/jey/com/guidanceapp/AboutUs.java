package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jeyamaal on 06-May-16.
 */
public class AboutUs extends Activity {

    private Button home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_us);
        home=(Button)findViewById(R.id.btn_Home);

    }

    public void onHomee(View v){

        Intent intent= new Intent(AboutUs.this,WelcomePage.class);
        startActivity(intent);

    }
}
