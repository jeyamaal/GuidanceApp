package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 25-Apr-16.
 */
public class FinalResult extends Activity {

    private TextView txt_year;

    String yearSelected,cgpa,repeat,interest;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_result);

        txt_year=(TextView)findViewById(R.id.textView_Year);

        Bundle extras = getIntent().getExtras();



        if (extras != null) {

            yearSelected = extras.getString("year");
            cgpa=extras.getString("cgpa");
            repeat=extras.getString("repeat");
            interest=extras.getString("interest");
            txt_year.setText(interest);




//get the value based on the key
        }

        else{

            txt_year.setText("Noooo");
        }

         // finalResult();

      }


     public void finalResult(){

         double final_cgpa=Double.parseDouble(cgpa);

         int repeats=Integer.parseInt(repeat);

         if(yearSelected.equals("1stYear 1stSemester") || yearSelected.equals("1stYear 2ndSemster"))


         {
             if(final_cgpa>2.7|| final_cgpa==2.7 && repeats <=5 )
             {

                 if(interest.equals("Coding"))
                 {
                          Toast.makeText(getApplicationContext(),"SE,IT,IM,CS,IS",Toast.LENGTH_LONG).show();

                 }

                 if(interest.equals("Networking"))

                 {
                     Toast.makeText(getApplicationContext(),"Networking,CS",Toast.LENGTH_LONG).show();

                 }



             }


             else if(final_cgpa<2.7 && repeats<=5)
             {

                 if(interest.equals("Coding"))
                 {
                     Toast.makeText(getApplicationContext(),"IT,IM,IS",Toast.LENGTH_LONG).show();

                 }

                 if(interest.equals("Networking"))

                 {
                     Toast.makeText(getApplicationContext(),"Networking,CS",Toast.LENGTH_LONG).show();

                 }


             }

             else
             {

                 Toast.makeText(getApplicationContext(),"Study hard",Toast.LENGTH_LONG).show();

             }




         }


     }


}
