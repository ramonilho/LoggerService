package com.ramonilho.loggerservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.util.Log;

/**
 * Created by logonrm on 12/06/2017.
 */

public class LoggerService extends Service {

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.i("ServicoMensagem", "**** - Serviço iniciado...");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("ServicoMensagem", "**** - Serviço terminado...");
    }
}
