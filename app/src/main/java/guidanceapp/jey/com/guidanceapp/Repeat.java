package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 15-Mar-16.
 */
public class Repeat extends Activity {


            private RadioGroup radioRepeat;
            private RadioButton radioSubReapeat;
            private Button btn_repeat;
            private EditText txt;
            public String select_repeat,yearSelected,cgpa;
            String noRepeat=null;


            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.repeat_page);
                btn_repeat=(Button)findViewById(R.id.btn_repeat_submit);
                radioRepeat=(RadioGroup) findViewById(R.id.radioRepeat);
                txt=(EditText)findViewById(R.id.txt_repeat);

                Bundle extras = getIntent().getExtras();

                if (extras != null) {

                    yearSelected= extras.getString("year");
                    cgpa=extras.getString("cgpa");



                 //get the value based on the key
                }

                else{

                  txt.setText("Noooo");
                }



                   setInvisible();

                   addListenerOnButton();

            }


            public void addListenerOnButton() {


                radioRepeat.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {


                        int selectedId = radioRepeat.getCheckedRadioButtonId();

                        radioSubReapeat =(RadioButton) findViewById(selectedId);

                        select_repeat = radioSubReapeat.getText().toString();

                        Toast.makeText(getApplicationContext(), radioSubReapeat.getText(), Toast.LENGTH_LONG).show();

                        if(select_repeat.equals("YES")){
                            setVisible();

                        }

                        else if(select_repeat.equals("NO")){

                            txt.setText("0");
                            setInvisible();
                        }

                        else{
                            setInvisible();

                        }



                    }

                });

            }


            public void setInvisible(){

                txt.setVisibility(View.INVISIBLE);

            }

            public void setVisible(){

                txt.setVisibility(View.VISIBLE);

             }

            public void btn_repeat_submit(View v){

                Intent intent= new Intent(Repeat.this,InterestingField.class);
                intent.putExtra("year",yearSelected);
                intent.putExtra("cgpa",cgpa);
                intent.putExtra("repeat",txt.getText().toString());
                //intent.putExtra("noRepeat",noRepeat);
                startActivity(intent);


             }

}
