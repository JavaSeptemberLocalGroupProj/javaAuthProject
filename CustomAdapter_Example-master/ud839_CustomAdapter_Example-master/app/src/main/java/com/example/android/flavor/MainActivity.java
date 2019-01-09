/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.flavor;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * {@link MainActivity} shows a list of Android platform releases.
 * For each release, display the name, version number, and image.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of AndroidFlavor objects
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

        // Create an {@link AndroidFlavorAdapter}, whose data source is a list of
        // {@link AndroidFlavor}s. The adapter knows how to create list item views for each item
        // in the list.
        DeviceAdapter deviceAdapter = new DeviceAdapter(this, device);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.listview_flavor);
        listView.setAdapter(deviceAdapter);
    }
}
