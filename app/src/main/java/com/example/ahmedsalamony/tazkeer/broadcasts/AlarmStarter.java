package com.example.ahmedsalamony.tazkeer.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.ahmedsalamony.tazkeer.utils.AlarmUtils;

/**
 * Created by Ahmed Salamony on 8/10/2017.
 */

public class AlarmStarter extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        AlarmUtils.setAlarm(context);
    }
}
