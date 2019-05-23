package com.example.exm5automobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId()==R.id.m1)
        {
            Intent i = new Intent(MainActivity.this,m1.class);
            startActivity(i);
            return true;
        }
        if(item.getItemId()==R.id.m2)
        {
            Intent i = new Intent(MainActivity.this,m2.class);
            startActivity(i);
            return true;
        }

        if(item.getItemId()==R.id.m3)
        {
            Intent i = new Intent(MainActivity.this,m3.class);
            startActivity(i);
            return true;
        }
        if(item.getItemId()==R.id.a1)
        {
            Intent i = new Intent(MainActivity.this,audi1.class);
            startActivity(i);
            return true;
        }
        if(item.getItemId()==R.id.a2)
        {
            Intent i = new Intent(MainActivity.this,audi2.class);
            startActivity(i);
            return true;
        }
        if(item.getItemId()==R.id.a3)
        {
            Intent i = new Intent(MainActivity.this,audi3.class);
            startActivity(i);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
