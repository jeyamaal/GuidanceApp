package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.RatingBar;

/**
 * Created by Jeyamaal on 01-Mar-16.
 */
public class Feedback extends Activity {

    private RatingBar rate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback_page);
        rate=(RatingBar)findViewById(R.id.ratingBar);
    }
}
