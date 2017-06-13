package com.ramonilho.loggerservice;

import android.util.Log;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by logonrm on 12/06/2017.
 */

public class Logger extends TimerTask {

    private long count = 0;

    public Logger() {
        Log.i("LOGGER", "Logger iniciando...");
    }

    @Override
    public void run() {
        count++;
        Log.i("LOGGER", "Logger "+count);
    }
}
