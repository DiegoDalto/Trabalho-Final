package cpcx.ufms.jose.adapter;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by jose on 31/03/16.
 */
public class Adapter extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);

    }
}
