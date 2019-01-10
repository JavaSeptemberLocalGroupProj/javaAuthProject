package com.example.vasyl.prostir.utils;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.vasyl.prostir.ui.DeviceAdapter;
import com.example.vasyl.prostir.R;
import com.example.vasyl.prostir.models.Device;

import java.util.ArrayList;


public class Devices extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.devices_layout);
        ArrayList<Device> device = new ArrayList<Device>();
        device.add(new Device("Galaxy s8", "29.06.18", R.mipmap.ic_launcher));
        device.add(new Device("Redmi 4x","12.01.19", R.mipmap.ic_launcher));
        device.add(new Device("iPhone 8", "01.01.18", R.mipmap.ic_launcher));
        device.add(new Device("iPad", "02.18.17", R.mipmap.ic_launcher));
        device.add(new Device("iPad X", "08.09.17", R.mipmap.ic_launcher));
        device.add(new Device("iPhone XR", "11.12.18", R.mipmap.ic_launcher));
        device.add(new Device("iPhone XR", "11.12.18", R.mipmap.ic_launcher));
        device.add(new Device("Galaxy s8", "29.06.18", R.mipmap.ic_launcher));
        device.add(new Device("Redmi 4x","12.01.19", R.mipmap.ic_launcher));
        device.add(new Device("iPhone 8", "01.01.18", R.mipmap.ic_launcher));
        device.add(new Device("iPad", "02.18.17", R.mipmap.ic_launcher));
        DeviceAdapter deviceAdapter = new DeviceAdapter(this, device);
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(deviceAdapter);
    }
}
