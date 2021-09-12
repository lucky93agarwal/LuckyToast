package com.mslji.luckytoast;

import android.content.Context;
import android.widget.Toast;

public class LuckyToast {
    public static void simpleToast(Context context, String message, int show){
        if(show == 0){
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show();

        }else if(show == 1){
            Toast.makeText(context, message, Toast.LENGTH_LONG).show();
        }

    }
}
