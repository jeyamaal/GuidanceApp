package guidanceapp.jey.com.guidanceapp;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import guidanceapp.jey.com.guidanceapp.Database.DatabaseAccess;
import guidanceapp.jey.com.guidanceapp.courses.YearOne;

/**
 * Created by Jeyamaal on 01-Mar-16.
 */
public class Course extends Activity  {

    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    private ListView listView;


    private String[] semesters_year1={"Choose","1st Year","2nd Year","3rd Year","4th Year"};

    private TextView txtSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.courses_page);
        txtSelection=(TextView)findViewById(R.id.txt_year1);
        listView=(ListView)findViewById(R.id.listView);


        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,semesters_year1);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        Spinner spinner1=(Spinner)findViewById(R.id.spin_1stsem);
        spinner1.setOnItemSelectedListener(new MyListener());
        spinner1.setAdapter(adapter);




     }

    private class MyListener implements AdapterView.OnItemSelectedListener{

        @Override
        public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

           String item = parent.getItemAtPosition(position).toString();

            // Showing selected spinner item
            Toast.makeText(parent.getContext(), "Selected: " + item, Toast.LENGTH_LONG).show();


            if(item.equals("1st Year")){

                Intent intent= new Intent(Course.this, YearOne.class);
                startActivity(intent);

            }

            if(item.equals("3rd Year")){


                DatabaseAccess databaseAccess= DatabaseAccess.getInstance(Course.this);
                databaseAccess.open();

                List<String> quotes=databaseAccess.getQuotes();
                databaseAccess.close();

                ArrayAdapter<String> adapter= new ArrayAdapter<String>(Course.this,android.R.layout.simple_list_item_1,quotes);
                listView.setAdapter(adapter);


                listView.setOnItemClickListener(

                        new AdapterView.OnItemClickListener() {
                            @Override
                            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {

                                Object o = listView.getItemAtPosition(position);
                                String pen = o.toString();
                                Toast.makeText(getApplicationContext(), "You have chosen the pen: " + " " + pen, Toast.LENGTH_LONG).show();


                            }
                        }

                );



            }


         /*   if(txtSelection.equals("1st Semester")){

                Toast.makeText(getApplicationContext(),"You i 1st year",Toast.LENGTH_LONG).show();

               Intent intent= new Intent(Course.this,Year1_Sem1.class);
                startActivity(intent);
            }
*/


        }



        @Override
        public void onNothingSelected(AdapterView<?> parent) {
            txtSelection.setText("");
        }



    }


         private class MyListActivity extends ListActivity{

             @Override
             protected void onListItemClick(ListView l, View v, int position, long id) {
                 super.onListItemClick(l, v, position, id);

                 String item = l.getItemAtPosition(position).toString();

                 Toast.makeText(getApplicationContext(),"Select is"+item,Toast.LENGTH_LONG).show();


             }
         }


}
