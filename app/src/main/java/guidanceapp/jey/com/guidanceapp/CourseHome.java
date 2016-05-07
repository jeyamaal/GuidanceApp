package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Class for show details for Course
 * Created by Jeyamaal on 21-Mar-16.
 */
public class CourseHome extends Activity {


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.course_home);
        }


        public void onfacultyNext (View v){

            Intent intent= new Intent(CourseHome.this,CoursePage.class);
            startActivity(intent);

        }

}
