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
package com.example.vasyl.prostir;


public class Device {


    private String mDeviceName;


    private String mDeviceNumber;


    private int mImageResourceId;


    public Device(String dName, String dNumber, int imageResourceId)
    {
        mDeviceName = dName;
        mDeviceNumber = dNumber;
        mImageResourceId = imageResourceId;
    }


    public String getDeviceName() {
        return mDeviceName;
    }


    public String getDeviceNumber() {
        return mDeviceNumber;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }


}
