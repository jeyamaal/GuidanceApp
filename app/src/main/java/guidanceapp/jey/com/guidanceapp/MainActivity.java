package guidanceapp.jey.com.guidanceapp;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import org.w3c.dom.Text;


public class MainActivity extends Activity{

   private Button login;
   private EditText un;
   private EditText pwd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login=(Button)findViewById(R.id.btn_login);



        un=(EditText)findViewById(R.id.txt_un);
        pwd=(EditText)findViewById(R.id.txt_pwd);

/*        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(checkLogin()== true) {

                    Intent intent = new Intent(MainActivity.this, WelcomePage.class);
                    startActivity(intent);

                }
                else
                {

                    Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
                }
            }
        });*/

   }

    public boolean checkLogin() {

        if (un.getText().toString().equals("A") && pwd.getText().toString().equals("123")) {

            return true;

        } else {
            return false;
        }
    }

        public void onLoginClick(View view){

            if(checkLogin()== true) {

                Intent intent = new Intent(MainActivity.this, WelcomePage.class);
                startActivity(intent);

            }
            else
            {

                Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_LONG).show();
            }

      }


    }









