package guidanceapp.jey.com.guidanceapp;

/**
 * Created by Jeyamaal on 03-May-16.
 */
import android.app.Activity;
import android.os.Bundle;

public class Zoomclass extends Activity {
    /** Called when the activity is first created. */

    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(new Zoom(this));
    }
}
