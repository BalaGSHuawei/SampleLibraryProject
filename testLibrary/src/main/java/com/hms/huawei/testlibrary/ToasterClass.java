package com.hms.huawei.testlibrary;

import android.content.Context;
import android.widget.Toast;

public class ToasterClass {

    public static void ToasterMessage(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
