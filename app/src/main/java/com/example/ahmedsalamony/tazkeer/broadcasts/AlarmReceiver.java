package com.example.ahmedsalamony.tazkeer.broadcasts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Date;

/**
 * Created by Ahmed Salamony on 8/10/2017.
 */

public class AlarmReceiver extends BroadcastReceiver {

    private static final int MUHARRAM = 0;

    private static final int RAMADAN = 8;

    private static final int SUNDAY = 0;
    private static final int WEDNESDAY = 3;

    private static final int TYPE_WHITES = 1;
    private static final int TYPE_ASHURA = 2;

    private Context context;

    // trigger by the alarm periodically " or start service "
    @Override
    public void onReceive(Context context, Intent intent) {
     this.context=context;
        notifyUser();
    }

    private void notifyUser() {
        SimpleHijriDate date = HijriCalc.toHijri(new Date());
        if (date != null && date.getMonth() != RAMADAN)
            setupNotifies(date);
    }


}
