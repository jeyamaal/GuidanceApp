package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 01-Mar-16.
 */
public class Calculator extends Activity {


    private EditText sem1,sem2,sem3,sem4;
    private TextView lab1,lab2,lab3,lab4,lab1year,lab2ndyear;
    private Button submit_gpa;
    public String yearFromCarrier;

    CgpaCalculation cg;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cgpa_calculator);

        cg= new CgpaCalculation();

        sem1=(EditText)findViewById(R.id.txt_1st);
        sem2=(EditText)findViewById(R.id.txt_2nd);
        sem3=(EditText)findViewById(R.id.txt_3rd);
        sem4=(EditText)findViewById(R.id.txt_4th);



        lab1=(TextView)findViewById(R.id.lab_1);
        lab2=(TextView)findViewById(R.id.lab_2);
        lab3=(TextView)findViewById(R.id.lab_3);
        lab4=(TextView)findViewById(R.id.lab_4);

        lab1year=(TextView)findViewById(R.id.textView4);
        lab2ndyear=(TextView)findViewById(R.id.textView7);


        submit_gpa=(Button)findViewById(R.id.btn_gpa);



        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            yearFromCarrier = extras.getString("year");

        }

        else{

             sem2.setText("Passing Value is not working");
          }

        setUnvisible();

        setVisible();


}





    public void cal_cgpa() {


        if (yearFromCarrier.equals("1stYear 1stSemester")) {
            String a;

            a = sem1.getText().toString();


            if (a.isEmpty()) {
                Log.i("Empty field", "error");

                Toast.makeText(getApplicationContext(), "Cannot be Emptyfield", Toast.LENGTH_LONG).show();

            } else {
                double ff = Double.parseDouble(a);

                double results = cg.get1stsemCGPA(ff);

                Toast.makeText(getApplicationContext(), "" + results + "", Toast.LENGTH_LONG).show();

            }

        }

            if (yearFromCarrier.equals("1stYear 2ndSemster")) {

                String a, b;

                a = sem1.getText().toString();
                b = sem2.getText().toString();


                if (a.isEmpty() || b.isEmpty()) {
                    Log.i("Empty field", "error");

                    Toast.makeText(getApplicationContext(), "Cannot be Emptyfield", Toast.LENGTH_LONG).show();

                } else {
                    double f1 = Double.parseDouble(a);
                    double f2 = Double.parseDouble(b);

                    double results = cg.get2ndsemCGPA(f1, f2);

                    Toast.makeText(getApplicationContext(), "" + results + "", Toast.LENGTH_LONG).show();

                }


            }


                    if (yearFromCarrier.equals("2ndYear 1stSemester")) {

                        String a, b,c;

                        a = sem1.getText().toString();
                        b = sem2.getText().toString();
                        c = sem3.getText().toString();


                        if (a.isEmpty() || b.isEmpty()|| c.isEmpty()) {
                            Log.i("Empty field", "error");

                            Toast.makeText(getApplicationContext(), "Cannot be Emptyfield", Toast.LENGTH_LONG).show();

                        } else {
                            double f1 = Double.parseDouble(a);
                            double f2 = Double.parseDouble(b);
                            double f3=Double.parseDouble(c);

                            double results = cg.get3rdsemCGPA(f1, f2,f3);

                            Toast.makeText(getApplicationContext(), "" + results + "", Toast.LENGTH_LONG).show();

                        }


                    }



                            if (yearFromCarrier.equals("2ndYear 2ndSemester")) {

                                String a, b,c,d;

                                a = sem1.getText().toString();
                                b = sem2.getText().toString();
                                c = sem3.getText().toString();
                                d = sem4.getText().toString();


                                if (a.isEmpty() || b.isEmpty()|| c.isEmpty() || d.isEmpty()) {
                                    Log.i("Empty field", "error");

                                    Toast.makeText(getApplicationContext(), "Cannot be Emptyfield", Toast.LENGTH_LONG).show();

                                } else {
                                    double f1 = Double.parseDouble(a);
                                    double f2 = Double.parseDouble(b);
                                    double f3 = Double.parseDouble(c);
                                    double f4 =  Double.parseDouble(d);

                                    double results = cg.get4thsemCGPA(f1, f2,f3,f4);

                                    Toast.makeText(getApplicationContext(), "" + results + "", Toast.LENGTH_LONG).show();

                                }


                            }



    }


    public void onCGPAcal(View v){

        cal_cgpa();

    }


    public void setVisible(){

        if(yearFromCarrier.equals("1stYear 1stSemester")){

            lab1year.setVisibility(View.VISIBLE);
            lab1.setVisibility(View.VISIBLE);
            sem1.setVisibility(View.VISIBLE);

        }

        else if(yearFromCarrier.equals("1stYear 2ndSemster")){
            lab1year.setVisibility(View.VISIBLE);
            lab1.setVisibility(View.VISIBLE);
            sem1.setVisibility(View.VISIBLE);

            lab2.setVisibility(View.VISIBLE);
            sem2.setVisibility(View.VISIBLE);

        }


        else if(yearFromCarrier.equals("2ndYear 1stSemester")){

            lab1year.setVisibility(View.VISIBLE);
            lab2ndyear.setVisibility(View.VISIBLE);

            lab1.setVisibility(View.VISIBLE);
            sem1.setVisibility(View.VISIBLE);

            lab2.setVisibility(View.VISIBLE);
            sem2.setVisibility(View.VISIBLE);


            lab3.setVisibility(View.VISIBLE);
            sem3.setVisibility(View.VISIBLE);

        }


        else if(yearFromCarrier.equals("2ndYear 2ndSemester")){

            lab1year.setVisibility(View.VISIBLE);
            lab2ndyear.setVisibility(View.VISIBLE);

            lab1.setVisibility(View.VISIBLE);
            sem1.setVisibility(View.VISIBLE);

            lab2.setVisibility(View.VISIBLE);
            sem2.setVisibility(View.VISIBLE);


            lab3.setVisibility(View.VISIBLE);
            sem3.setVisibility(View.VISIBLE);

            lab4.setVisibility(View.VISIBLE);
            sem4.setVisibility(View.VISIBLE);

        }


    }


    public void setUnvisible(){

        sem1.setVisibility(View.INVISIBLE);
        sem2.setVisibility(View.INVISIBLE);
        sem3.setVisibility(View.INVISIBLE);
        sem4.setVisibility(View.INVISIBLE);

        lab1.setVisibility(View.INVISIBLE);
        lab2.setVisibility(View.INVISIBLE);
        lab3.setVisibility(View.INVISIBLE);
        lab4.setVisibility(View.INVISIBLE);

        lab1year.setVisibility(View.INVISIBLE);
        lab2ndyear.setVisibility(View.INVISIBLE);

   }

}
