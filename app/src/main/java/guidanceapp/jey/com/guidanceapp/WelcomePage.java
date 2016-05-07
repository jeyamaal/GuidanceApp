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
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 29-Feb-16.
 */
public class WelcomePage extends Activity {

            private Button career,courses,cal,aboutUs;

            private FrameLayout fAbout,fCGPA,fcarrer,fcourse;

            boolean isBackVisible = false;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.welcome_page_new);

                career=(Button)findViewById(R.id.btn_career);

                courses=(Button)findViewById(R.id.btn_courses);

                cal=(Button)findViewById(R.id.btn_CGPAA);

                aboutUs=(Button)findViewById(R.id.btn_AboutUs);

                fAbout=(FrameLayout)findViewById(R.id.aboutt);

                fCGPA=(FrameLayout)findViewById(R.id.frameCGPA);

                fcarrer=(FrameLayout)findViewById(R.id.frame_Carrer);

                fcourse=(FrameLayout)findViewById(R.id.frame_course);

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



               final AnimatorSet setRightOut = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_right_out);

               final AnimatorSet setLeftIn = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_left_in);


               if(!isBackVisible){


                   setRightOut.setTarget(fcourse);
                   setLeftIn.setTarget(fcourse);
                   setRightOut.start();
                   setRightOut.setDuration(300);
                   setLeftIn.start();
                   setRightOut.setDuration(400);
                   isBackVisible = true;

               }
               else{


                   setRightOut.setTarget(fcourse);
                   setLeftIn.setTarget(fcourse);
                   setRightOut.start();
                   setRightOut.setDuration(300);
                   Intent intent= new Intent(WelcomePage.this,CourseHome.class);
                   startActivity(intent);
                   setLeftIn.start();
                   isBackVisible = false;
               }




           }

            public void onCarrierClick (View v){

                final AnimatorSet setRightOut = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_right_out);

                final AnimatorSet setLeftIn = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_left_in);


                if(!isBackVisible){


                    setRightOut.setTarget(fcarrer);
                    setLeftIn.setTarget(fcarrer);
                    setRightOut.start();
                    setRightOut.setDuration(300);
                    setLeftIn.start();
                    setRightOut.setDuration(400);
                    isBackVisible = true;

                }
                else{


                    setRightOut.setTarget(fcarrer);
                    setLeftIn.setTarget(fcarrer);
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



                final AnimatorSet setRightOut = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_right_out);

                final AnimatorSet setLeftIn = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_left_in);


                if(!isBackVisible){


                    setRightOut.setTarget(fCGPA);
                    setLeftIn.setTarget(fCGPA);
                    setRightOut.start();
                    setRightOut.setDuration(300);
                    setLeftIn.start();
                    setRightOut.setDuration(400);
                    isBackVisible = true;

                }
                else{


                    setRightOut.setTarget(fCGPA);
                    setLeftIn.setTarget(fCGPA);
                    setRightOut.start();
                    setRightOut.setDuration(300);
                    Intent intent= new Intent(WelcomePage.this,CarrierHomeForCGPAcal.class);
                    startActivity(intent);
                    setLeftIn.start();
                    isBackVisible = false;
                }






                 /*Intent intent= new Intent(WelcomePage.this,);
                 startActivity(intent)*/;
            }


            public void onAboutUs(View v){


                final AnimatorSet setRightOut = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_right_out);

                final AnimatorSet setLeftIn = (AnimatorSet)AnimatorInflater.loadAnimator(getApplicationContext(),R.animator.card_flip_left_in);


                if(!isBackVisible){


                    setRightOut.setTarget(fAbout);
                    setLeftIn.setTarget(fAbout);
                    setRightOut.start();
                    setRightOut.setDuration(300);
                    setLeftIn.start();
                    setRightOut.setDuration(400);
                    isBackVisible = true;

                }
                else{


                    setRightOut.setTarget(fAbout);
                    setLeftIn.setTarget(fAbout);
                    setRightOut.start();
                    setRightOut.setDuration(300);
                    Intent intent= new Intent(WelcomePage.this,AboutUs.class);
                    startActivity(intent);
                    setLeftIn.start();
                    isBackVisible = false;
                }



            }


}
