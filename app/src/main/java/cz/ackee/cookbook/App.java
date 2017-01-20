package cz.ackee.cookbook;

import android.app.Application;
import android.content.Context;

/**
 * Main application class
 **/
public class App extends Application {
    public static final String TAG = App.class.getName();

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        App.context = getApplicationContext();

        // TODO initialize other libraries here
    }
}
