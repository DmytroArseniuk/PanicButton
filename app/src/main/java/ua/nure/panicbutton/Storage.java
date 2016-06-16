package ua.nure.panicbutton;

import android.content.Context;
import android.content.SharedPreferences;

public class Storage {
    private static final String PREFERENCES_NAME = "pb_preferences";
    private static final String LOGIN_KEY = "login_key";

    private static Storage instance;
    private SharedPreferences sharedPreferences;

    private Storage() {
        sharedPreferences = PBApplication.getAppContext().getSharedPreferences(PREFERENCES_NAME, Context.MODE_PRIVATE);
    }

    public static Storage getSharedInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }

    public void setLogin(String login) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(LOGIN_KEY, login);
        editor.apply();
    }

    public void clearAll(){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(LOGIN_KEY, null);
        editor.apply();
    }
}
