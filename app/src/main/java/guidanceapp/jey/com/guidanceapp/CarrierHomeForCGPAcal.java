package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Class for select semester
 *
 * Created by Jeyamaal on 05-May-16.
 */
 public class CarrierHomeForCGPAcal extends Activity {

            private RadioGroup radioYear;
            private RadioButton year;
            private Button onNextYear;
            public String  yearSelected;
            private  RadioButton year_1,year_2;


            @Override
            protected void onCreate(Bundle savedInstanceState) {

                super.onCreate(savedInstanceState);
                setContentView(R.layout.carrierpath_home);
                radioYear = (RadioGroup) findViewById(R.id.radioYear);
                onNextYear=(Button)findViewById(R.id.btn_next_year);


                addListenerOnButton();
            }


            public void addListenerOnButton() {


                radioYear.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {


                        int selectedId = radioYear.getCheckedRadioButtonId();

                        year = (RadioButton) findViewById(selectedId);

                        yearSelected = year.getText().toString();

                        Toast.makeText(getApplicationContext(), year.getText(), Toast.LENGTH_LONG).show();

                    }

                });

            }


            /**passing the semester details to Calculater class
             *
             * @param view
             */


            public void onNextYear(View view){

                Intent intent= new Intent(CarrierHomeForCGPAcal.this,Calculator.class);
                intent.putExtra("year",yearSelected);
                startActivity(intent);



            }





        /*    public void radioButtonSelected(View view){

                RadioGroup radioGroup =(RadioGroup)findViewById(R.id.radioYear);

                int id = radioGroup.getCheckedRadioButtonId();
                if (id == -1){
                    //no item selected

                    Toast.makeText(getApplicationContext(),"Not selected",Toast.LENGTH_LONG).show();
                }
                else{
                    if (id == R.id.radiobtn_1styear){

                        Toast.makeText(getApplicationContext(),"Selected year1",Toast.LENGTH_LONG).show();
                    }
                }
            }*/


           /* public void year1clicked(View v){
                Toast.makeText(getApplicationContext(),"Geeeeeee",Toast.LENGTH_LONG).show();

            }*/
}
