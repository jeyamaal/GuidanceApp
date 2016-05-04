package guidanceapp.jey.com.guidanceapp;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 29-Feb-16.
 */
public class WelcomePage extends Activity {

    private Button career;

    boolean isBackVisible = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page_new);

        career=(Button)findViewById(R.id.btn_career);


        Toast.makeText(getApplicationContext(),"Sucessfully Login",Toast.LENGTH_SHORT).show();


    /*    Animation shake = AnimationUtils.loadAnimation(this, R.anim.vibrate);
        findViewById(R.id.btn_career).startAnimation(shake);*/


/*        feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent= new Intent(WelcomePage.this,Feedback.class);
                startActivity(intent);

            }
        });*/





    }

    public void onFeedback(View view){

        Intent intent= new Intent(WelcomePage.this,Feedback.class);
        startActivity(intent);
    }

   public void onCourseClick(View view){
       Intent intent= new Intent(WelcomePage.this,CourseHome.class);
       startActivity(intent);

   }

    public void onCarrierClick (View v){

        final AnimatorSet setRightOut = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_right_out);

        final AnimatorSet setLeftIn = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_left_in);


        if(!isBackVisible){



            setRightOut.setTarget(career);


            setLeftIn.setTarget(career);
            setRightOut.start();
            setRightOut.setDuration(300);
            setLeftIn.start();
            setRightOut.setDuration(400);




            isBackVisible = true;

        }
        else{


            setRightOut.setTarget(career);
            setLeftIn.setTarget(career);
            setRightOut.start();
            setRightOut.setDuration(300);
            Intent intent= new Intent(WelcomePage.this,Faculty.class);
            startActivity(intent);
            setLeftIn.start();
            isBackVisible = false;
        }


/*        Intent intent= new Intent(WelcomePage.this,Faculty.class);
        startActivity(intent);*/

      }


    public void onCGPAClick(View view){

         Intent intent= new Intent(WelcomePage.this,CarrierHomeForCGPAcal.class);
         startActivity(intent);


    }

}
