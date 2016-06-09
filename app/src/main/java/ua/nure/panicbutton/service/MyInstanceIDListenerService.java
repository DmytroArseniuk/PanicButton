package ua.nure.panicbutton.service;

import android.content.Intent;

import com.google.android.gms.iid.InstanceIDListenerService;

import ua.nure.panicbutton.util.Log;

public class MyInstanceIDListenerService extends InstanceIDListenerService {

    @Override
    public void onTokenRefresh() {
        // Fetch updated Instance ID token and notify our app's server of any changes (if applicable).
        Log.i("GCM token refreshed from InstanceIDListenerService");
        Intent intent = new Intent(this, RegistrationIntentService.class);
        startService(intent);
    }
}
