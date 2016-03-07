package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 01-Mar-16.
 */
public class Course extends Activity {

    private String[] semesters_year1={"1st Semester","2nd Semester"};

    private TextView txtSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_page);
        txtSelection=(TextView)findViewById(R.id.txt_year1);

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,semesters_year1);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner1=(Spinner)findViewById(R.id.spin_1stsem);
        spinner1.setAdapter(adapter);

     }


    private class MyListener implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

           txtSelection.setText(semesters_year1[position]);


            if(txtSelection.equals("1st Semester")){

                Toast.makeText(getApplicationContext(),"You i 1st year",Toast.LENGTH_LONG).show();

               Intent intent= new Intent(Course.this,Year1_Sem1.class);
            startActivity(intent);
            }



        }

        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            txtSelection.setText("");
        }
    }




}
