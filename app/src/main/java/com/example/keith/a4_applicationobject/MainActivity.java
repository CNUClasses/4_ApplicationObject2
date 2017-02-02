package com.example.keith.a4_applicationobject;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {
    private static final String TAG = "Mainactivity";
    TextView myView;
    applicationObject myObject;

    private static final  int RES2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG,"MainActivity onCreate");

        myObject = (applicationObject)getApplication();
        myView= (TextView)findViewById(R.id.textView2);
        myView.setText("Application myInteger =" + Integer.toString(myObject.getMyInteger()));
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }

    public void doClickButton2(View view) {
        myObject.setMyInteger( myObject.getMyInteger()+1);
        myView.setText("Application myInteger =" + Integer.toString(myObject.getMyInteger()));
    }

    public void doClickButton(View view) {
        Intent myIntent = new Intent(this,MainActivity2.class );
        startActivity(myIntent);
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"MainActivity onStop");

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspectiinton SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


}
