package com.example.citizenzer0.collaborate_mhw;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

/**
 * Created by citizenzer0 on 10/8/16.
 */
public class MyGcmListenerService extends Service {
    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
