package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

/**Class for display Faculty information
 *
 * Created by Jeyamaal on 09-Mar-16.
 */
public class Faculty extends Activity {

    private Button nextFac;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faculty_page);

        final Animation flo = AnimationUtils.loadAnimation(this,R.anim.floaating);


        nextFac=(Button)findViewById(R.id.btn_fac_next);



    }

    /**
     * Redirect to carrier Home Page
     *
     * @param v
     */

    public void onfacultyNext(View v){

    /*    final Animation animTranslate = AnimationUtils.loadAnimation(this, R.anim.floaating);

        v.startAnimation(animTranslate);*/


        Intent intent= new Intent(Faculty.this,CarrierHome.class);
        startActivity(intent);



    }


}
