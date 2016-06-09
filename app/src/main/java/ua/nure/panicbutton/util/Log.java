package ua.nure.panicbutton.util;

public class Log {

    private final static String TAG = "PanicButtonLog";

    public static void i(String message) {
        android.util.Log.i(TAG, message);
    }

    public static void d(String message) {
        android.util.Log.d(TAG, message);
    }

    public static void e(String message) {
        android.util.Log.e(TAG, message);
    }

    public static void w(String message) {
        android.util.Log.w(TAG, message);
    }

    public static void v(String message) {
        android.util.Log.v(TAG, message);
    }

}
