package com.example.vasyl.prostir.ui;


import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.example.vasyl.prostir.R;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 */
public class AccountsListFragment extends Fragment {
    View rootView;
    FragmentActivity main;
    MenuInflater menuinf;
    private ListView listViewOfAccounts;
    private ArrayList<HashMap<String, String>> arrayListOfAccounts;
    public AccountsListFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        main = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_accounts_list, container, false);
        menuinf = main.getMenuInflater();
        Toolbar toolbarMenu = rootView.findViewById(R.id.toolbarMenu);
        listViewOfAccounts =  rootView.findViewById(R.id.listViewOfAccounts);

        arrayListOfAccounts = new ArrayList<>();
        HashMap<String, String> map;

        map = new HashMap<>();
        map.put("Name", "Instagram");
        map.put("Tel", "495 501-3545");
        arrayListOfAccounts.add(map);

        map = new HashMap<>();
        map.put("Name", "Telegram");
        map.put("Tel", "495 241-6845");
        arrayListOfAccounts.add(map);

        map = new HashMap<>();
        map.put("Name", "Facebook");
        map.put("Tel", "495 431-5468");
        arrayListOfAccounts.add(map);
        listViewOfAccounts.setEnabled(false);
        final SimpleAdapter adapter = new SimpleAdapter(main, arrayListOfAccounts, android.R.layout.simple_list_item_2,
                new String[]{"Name", "Tel"},
                new int[]{android.R.id.text1, android.R.id.text2});
        listViewOfAccounts.setAdapter(adapter);


        listViewOfAccounts.setOnItemClickListener(new AdapterView.OnItemClickListener() { // DELETE ACCOUNT
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                arrayListOfAccounts.remove(position);
                adapter.notifyDataSetChanged();
                listViewOfAccounts.setBackgroundColor(0);
                listViewOfAccounts.setEnabled(false);
            }
        });
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinf) {
        menuinf.inflate(R.menu.toolbar_menu, menu);
        super.onCreateOptionsMenu(menu, menuinf);
//        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (item.getItemId()) {
            case R.id.addNewAccountMenuItem: {
                FrameLayout fl = rootView.findViewById(R.id.listLayout);
                FragmentManager fm = getChildFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction().replace(R.id.listLayout, new DecryptedMessageFragment())
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fl.removeAllViewsInLayout();
                transaction.commit();
                return false;
            }
            case R.id.connectedDevicesMenuItem: {
                return false;
            }
            case R.id.deleteAccountMenuItem: {
                listViewOfAccounts.setEnabled(true);
                Toast.makeText(main.getApplicationContext(),
                        "Click on item to delete it",
                        Toast.LENGTH_SHORT)
                        .show();
                listViewOfAccounts.setBackgroundColor(Color.parseColor("#F6F6F6"));
                return false;
            }
            case R.id.logOutMenuItem: {
                FrameLayout fl = rootView.findViewById(R.id.listLayout);
                FragmentManager fm = getChildFragmentManager();
                FragmentTransaction transaction = fm.beginTransaction().replace(R.id.listLayout, new CountryPickerFragment())
                        .setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out);
                fl.removeAllViewsInLayout();
                transaction.commit();
                return false;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
