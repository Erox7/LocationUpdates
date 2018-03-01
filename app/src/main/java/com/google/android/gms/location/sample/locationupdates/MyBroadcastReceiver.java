package com.google.android.gms.location.sample.locationupdates;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Erox on 01/03/2018.
 */

public class MyBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent as = new Intent(context, LocationUpdatesListener.class);
        context.startService(intent);
    }
}
