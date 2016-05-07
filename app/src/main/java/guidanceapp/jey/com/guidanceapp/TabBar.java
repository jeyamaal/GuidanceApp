package guidanceapp.jey.com.guidanceapp;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

/**
 * Created by Jeyamaal on 05-May-16.
 */
public class TabBar extends TabActivity implements TabHost.OnTabChangeListener {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabbar_page);

        // Get TabHost Refference
        tabHost = getTabHost();
// Set TabChangeListener called when tab changed
        tabHost.setOnTabChangedListener(this);
        TabHost.TabSpec spec;
        Intent intent;
/************* TAB1 ************/
// Create Intents to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, Repeat.class);
        spec = tabHost.newTabSpec("First").setIndicator("")
                .setContent(intent);
//Add intent to tab
        tabHost.addTab(spec);
/************* TAB2 ************/
        intent = new Intent().setClass(this, CoursePage.class);
        spec = tabHost.newTabSpec("Second").setIndicator("")
                .setContent(intent);
        tabHost.addTab(spec);

    }

    @Override
    public void onTabChanged(String s) {

        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            if(i==0)
                tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.cgcal);
            else if(i==1)
                tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.career);
            else if(i==2)
                tabHost.getTabWidget().getChildAt(i).setBackgroundResource(R.drawable.aboutus);
        }


        Log.i("tabs", "CurrentTab: "+tabHost.getCurrentTab());

        if(tabHost.getCurrentTab()==0)
            tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.cgcal);
        else if(tabHost.getCurrentTab()==1)
            tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.career);
        else if(tabHost.getCurrentTab()==2)
            tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundResource(R.drawable.aboutus
            );

    }

}
