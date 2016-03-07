package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 07-Mar-16.
 */
public class CarrierHome extends Activity {

    private RadioGroup radioYear;
    private RadioButton year;


   //private  RadioButton year_1,year_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.carrierpath_home);
        radioYear = (RadioGroup) findViewById(R.id.radioYear);
/*        year_1=(RadioButton)findViewById(R.id.radiobtn_1styear);
        year_2=(RadioButton)findViewById(R.id.radioBtn_2ndyear);*/


        addListenerOnButton();







    }


    public void addListenerOnButton() {


        radioYear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                int selectedId = radioYear.getCheckedRadioButtonId();

                year = (RadioButton) findViewById(selectedId);

                Toast.makeText(getApplicationContext(),year.getText(), Toast.LENGTH_LONG).show();


/*
                if(year_1.isChecked()){

                  Toast.makeText(getApplicationContext(),"Ceee",Toast.LENGTH_LONG);
              }

                else{

                  Toast.makeText(getApplicationContext(),"Not selectred",Toast.LENGTH_LONG);
              }
*/

            }

        });

    }

}
