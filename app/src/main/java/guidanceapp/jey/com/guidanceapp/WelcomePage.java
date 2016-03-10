package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by Jeyamaal on 29-Feb-16.
 */
public class WelcomePage extends Activity {

    private Button feedback;
    private Button courses;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        feedback=(Button)findViewById(R.id.btn_feedBack);
        courses=(Button)findViewById(R.id.btn_courses);


        Toast.makeText(getApplicationContext(),"Sucessfully Login",Toast.LENGTH_SHORT).show();

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
       Intent intent= new Intent(WelcomePage.this,Course.class);
       startActivity(intent);

   }

    public void onCarrierClick(View view){
        Intent intent= new Intent(WelcomePage.this,Faculty.class);
        startActivity(intent);

      }

}
