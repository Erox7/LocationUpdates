package com.google.android.gms.location.sample.locationupdates;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Erox on 01/03/2018.
 */

public class LocationUpdatesListener implements LocationListener {
    private TextView mLastUpdateTimeTextView;
    private TextView mLatitudeTextView;
    private TextView mLongitudeTextView;
    private static Context mContext;

    @Override
    public void onLocationChanged(Location location) {

        mLatitudeTextView = (TextView) ((Activity)getContext()).findViewById(R.id.latitude_text);
        mLongitudeTextView = (TextView) ((Activity)getContext()).findViewById(R.id.longitude_text);
        mLastUpdateTimeTextView = (TextView) ((Activity)getContext()).findViewById(R.id.last_update_time_text);

        mLatitudeTextView.setText(String.format(Locale.ENGLISH, "%s: %f", "latitude",
                location.getLatitude()));
        mLongitudeTextView.setText(String.format(Locale.ENGLISH, "%s: %f", "longitude",
                location.getLongitude()));
        mLastUpdateTimeTextView.setText(String.format(Locale.ENGLISH, "%s: %s",
                "asd", DateFormat.getTimeInstance().format(new Date())));
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }

    public static Object getContext() {
        return mContext;
    }

    public static void setContext(Context context) {
        mContext = context;
    }
}
