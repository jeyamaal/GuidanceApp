package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Jeyamaal on 01-Mar-16.
 */
public class Year1_Sem1 extends Activity {

    private TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.year1_sem1);
        txt=(TextView)findViewById(R.id.txt_y1);

    }
}
