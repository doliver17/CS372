package com.example.derik.pr4_2;

import android.support.annotation.DrawableRes;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.*;
import java.util.Random;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.MenuItem;
import android.widget.ImageView;


public class PR4_2_Main extends ActionBarActivity implements OnClickListener {

    Button button;
    ImageView viewCoin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pr4_2__main);
        button = (Button)findViewById(R.id.buttonFlip);
        button.setOnClickListener(this);

        viewCoin = (ImageView)findViewById(R.id.coinView);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_pr4_2__main, menu);
        return true;
    }

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

    public void onClick(View v) {
       Random rand = new Random();
        int x = rand.nextInt(2) + 1;
        if(x == 1)
            viewCoin.setImageResource(R.drawable.quarter_front);
        if(x == 2)
            viewCoin.setImageResource(R.drawable.quarter_back);
    }

}
