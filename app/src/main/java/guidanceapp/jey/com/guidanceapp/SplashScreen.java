package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/**
 * Created by Jeyamaal on 07-Mar-16.
 */
public class SplashScreen extends Activity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.splash);


            Thread timerThread= new Thread(){

                @Override
                public void run() {
                    super.run();

                    try{

                        sleep(3000);

                    }

                    catch (InterruptedException e){

                        e.printStackTrace();
                    }

                    finally {
                        {
                            Intent intent= new Intent(SplashScreen.this,MainActivity.class);
                            startActivity(intent);

                        }
                    }
                }
            };
           timerThread.start();

       }

        @Override
        protected void onPause() {
            super.onPause();
            finish();
        }

}
