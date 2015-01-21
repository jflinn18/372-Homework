package com.example.joseph.coinflipping;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    private Random gen;

    /**
     * When App is created, do these things
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gen = new Random();

    }

    /**
     * Creates an Option Menu when app is created
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    /**
     * Handles when options are selected in the menu
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * "Flips" a coin with the Random class
     * @param v
     */
    public void flip(View v)
    {
        int coinSide = (gen.nextInt() % 2);
        TextView coin;
        coin = (TextView) findViewById(R.id.textView);


        if (coinSide == 0)
            coin.setText("Heads");
        if (coinSide == 1)
            coin.setText("Tails");
    }
}
