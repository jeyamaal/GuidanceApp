package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by Jeyamaal on 09-Mar-16.
 */
public class Faculty extends Activity {

    private Button nextFac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_page);

        nextFac=(Button)findViewById(R.id.btn_fac_next);

    }

    public void onfacultyNext(View v){

        Intent intent= new Intent(Faculty.this,CarrierHome.class);
        startActivity(intent);


    }


}
