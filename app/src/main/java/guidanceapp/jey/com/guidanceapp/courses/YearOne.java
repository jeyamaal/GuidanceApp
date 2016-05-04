package guidanceapp.jey.com.guidanceapp.courses;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import  guidanceapp.jey.com.guidanceapp.R;
import  guidanceapp.*;
/**
 * Created by Jeyamaal on 22-Mar-16.
 */
public class YearOne extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yearone_page);

        // automatically to landscape mode
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }
}
