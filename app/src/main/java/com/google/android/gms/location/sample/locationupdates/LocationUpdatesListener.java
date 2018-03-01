package com.google.android.gms.location.sample.locationupdates;

import android.app.Activity;
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
    @Override
    public void onLocationChanged(Location location) {

        Object context;
        mLatitudeTextView = (TextView) ((Activity)context).findViewById(R.id.latitude_text);
        mLongitudeTextView = (TextView) ((Activity)context).findViewById(R.id.longitude_text);
        mLastUpdateTimeTextView = (TextView) ((Activity)context).findViewById(R.id.last_update_time_text);

        mLatitudeTextView.setText(String.format(Locale.ENGLISH, "%s: %f", mLatitudeLabel,
                mCurrentLocation.getLatitude()));
        mLongitudeTextView.setText(String.format(Locale.ENGLISH, "%s: %f", mLongitudeLabel,
                mCurrentLocation.getLongitude()));
        mLastUpdateTimeTextView.setText(String.format(Locale.ENGLISH, "%s: %s",
                mLastUpdateTimeLabel, DateFormat.getTimeInstance().format(new Date())));
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
}
