package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Jeyamaal on 10-Mar-16.
 */
public class CgpaHome extends Activity {

    private Button submitCGPA;
    private TextView unknown;
    private EditText cgpa;

    public String yearSelected;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_home);
        submitCGPA=(Button)findViewById(R.id.btn_submit);
        unknown=(TextView)findViewById(R.id.lab_cgpa);
        cgpa=(EditText)findViewById(R.id.txt_cgpa);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            yearSelected = extras.getString("year");
            cgpa.setText(yearSelected);


//get the value based on the key
        }

        else{

            cgpa.setText("Noooo");
          }


    }

    public void onCalculateCGPA (View v){
        Intent intent= new Intent(CgpaHome.this,Calculator.class);
        intent.putExtra("year",yearSelected);
        startActivity(intent);




    }

    public void onCGPASubmit(View v){

        Intent intent= new Intent(CgpaHome.this,Repeat.class);
        intent.putExtra("year",yearSelected);
        intent.putExtra("cgpa",cgpa.getText().toString());
        startActivity(intent);



    }
}
