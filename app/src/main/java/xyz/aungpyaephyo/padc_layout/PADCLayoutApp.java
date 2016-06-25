package xyz.aungpyaephyo.padc_layout;

import android.app.Application;
import android.content.Context;

/**
 * Created by aung on 6/18/16.
 */
public class PADCLayoutApp extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
