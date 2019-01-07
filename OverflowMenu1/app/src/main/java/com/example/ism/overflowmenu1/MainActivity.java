package com.example.ism.overflowmenu1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import static com.example.ism.overflowmenu1.R.color.colorPrimaryDark;


public class MainActivity extends AppCompatActivity{
    String[] tokens = {"(Country code)_---_---_----      TOTP", "(Country code)_---_---_----      TOTP",
            "(Country code)_---_---_----      TOTP", "(Country code)_---_---_----      TOTP", "(Country code)_---_---_----      TOTP"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
