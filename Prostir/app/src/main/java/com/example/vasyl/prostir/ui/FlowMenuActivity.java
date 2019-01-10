package com.example.vasyl.prostir.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.vasyl.prostir.R;
import com.example.vasyl.prostir.utils.Devices;


public class FlowMenuActivity extends AppCompatActivity{
    String[] tokens = {"(Country code)_---_---_----      TOTP", "(Country code)_---_---_----      TOTP",
            "(Country code)_---_---_----      TOTP", "(Country code)_---_---_----      TOTP", "(Country code)_---_---_----      TOTP"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flow_menu);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        ListView lvMain = (ListView) findViewById(R.id.lvMain);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, tokens);
        lvMain.setAdapter(adapter);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_menu, menu);
        return true;
    }


    public boolean onOptionsItemSelected(MenuItem item) {
        int id= item.getItemId();

        switch (item.getItemId()){
            case R.id.action_sign_out:
            {Intent i = new Intent(this, Devices.class);
            startActivity(i);
            return false;}

            case R.id.action_sign_out3:
            {Intent i = new Intent(this, AddAcount.class);
            startActivity(i);
            return false;}
        }
        return super.onOptionsItemSelected(item);
    }
}
