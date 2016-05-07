package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.Toast;

/**
 *
 * Class for show finalResult to the User
 *
 * Created by Jeyamaal on 25-Apr-16.
 */

public class FinalResult extends Activity {


    private TextView txt_year,txtCongrats,txtEligible,txtView1,txtView2,txtView3,txtView4;

    String yearSelected,cgpa,repeat,interest,noRepeat;

    int repeats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_result);

        //txt_year=(TextView)findViewById(R.id.textView_Year);

        txtCongrats=(TextView)findViewById(R.id.txtView_msg);

        txtEligible=(TextView)findViewById(R.id.txtView_elegible);

        txtView1=(TextView)findViewById(R.id.txtView_no1);

        txtView2=(TextView)findViewById(R.id.txtView_no2);

        txtView3=(TextView)findViewById(R.id.txtView_no3);

        txtView4=(TextView)findViewById(R.id.txtView_no4);

        Bundle extras = getIntent().getExtras();



        if (extras != null) {

            yearSelected = extras.getString("year");
            cgpa=extras.getString("cgpa");
            repeat=extras.getString("repeat");
           //noRepeat=extras.getString("noRepeat");
            interest=extras.getString("interest");
           // txt_year.setText(interest);




//get the value based on the key
        }

/*        else{

            txt_year.setText("Noooo");
         }*/

          finalResult();

      }


    /**
     * Show the final results to the user
     *
     */


     public void finalResult(){

         double final_cgpa=Double.parseDouble(cgpa);

         repeats=Integer.parseInt(repeat);




         if(yearSelected.equals("1stYear 1stSemester") || yearSelected.equals("1stYear 2ndSemster"))


         {
             if(final_cgpa>2.7|| final_cgpa==2.7 && repeats <=5 )
             {

                 if(interest.equals("Coding"))
                 {
                          setCongrats();
                          setEligible();
                          coding();

                          //Toast.makeText(getApplicationContext(),"SE,IT,IM,CS,IS",Toast.LENGTH_LONG).show();

                 }

                 if(interest.equals("Networking"))

                 {
                     setCongrats();
                     setEligible();
                     networking();
                     Toast.makeText(getApplicationContext(),"Networking,CS",Toast.LENGTH_LONG).show();

                 }



             }


             else if(final_cgpa < 2.7 && repeats<=5)
             {

                 if(interest.equals("Coding"))
                 {
                     setCongrats();
                     setEligible();
                     codingLessgpa();
                     //Toast.makeText(getApplicationContext(),"IT,IM,IS",Toast.LENGTH_LONG).show();

                 }

                 if(interest.equals("Networking"))

                 {
                     setCongrats();
                     setEligible();
                     networkingLessgpa();
                     //Toast.makeText(getApplicationContext(),"Networking,CS",Toast.LENGTH_LONG).show();

                 }


             }

             else
             {

                 Toast.makeText(getApplicationContext(),"Study hard",Toast.LENGTH_LONG).show();

             }




         }


     }

    /**
     * Redirect to Home Page
     *
     * @param v
     */


    public void onHome(View v){

        Intent intent= new Intent(FinalResult.this,WelcomePage.class);
        startActivity(intent);

     }

    /**
     * Redirect to Course page
     *
     * @param view
     */

    public void oncheckCourses(View view){

        Intent intent= new Intent(FinalResult.this,CoursePage.class);
        startActivity(intent);

    }

    /**
     * Chanage Text view to congrats
     *
     */

    public void setCongrats(){


        Animation anim = new AlphaAnimation(0.0f, 1.0f);
        anim.setDuration(50); //You can manage the time of the blink with this parameter
        anim.setStartOffset(20);
        anim.setRepeatMode(Animation.REVERSE);
        anim.setRepeatCount(Animation.INFINITE);
        txtCongrats.startAnimation(anim);


        txtCongrats.setText("Congratulations");


    }

    /**
     * set TextLabel to Eligible
     */

    public  void setEligible(){

        txtEligible.setText("You Are  Eligible to do");

    }

    /**
     * Eligible to do SE view the Content
     *
     */

    public void coding(){

           txtView1.setText("Software Engineering");
           txtView2.setText("Information Technology");
           txtView3.setText("Intractive Media");
           txtView4.setText("Cyber Security");

    }

    /**
     * Eligible to view NetWorking content
     *
     */

    public void networking(){

        txtView1.setText("Computer Systems and Networking");
        txtView2.setText("Cyber Security");
    }


    public void codingLessgpa(){

        txtView1.setText("Information Technology");
        txtView2.setText("Intractive Media");


     }

    public void networkingLessgpa(){

        txtView1.setText("Computer Systems and Networking");

    }

    /**
     * If uer no Select to any course
     *
     */

    public void failure(){

        txtCongrats.setText("Sorry");
        txtEligible.setText("You are not eligible to do 3 rd Year ");
        txtView1.setText("Study hard victory will follow you");

    }


}
