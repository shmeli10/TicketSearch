package com.sostrovsky.ticketsearchapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity {
    private final long ONE_SECOND_IN_MILLIS = 1000;
    private final long CLEAR_SPLASH_SCREEN_DELAY = (10 * ONE_SECOND_IN_MILLIS);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.AppTheme);
        clearSplashScreen();
        setContentView(R.layout.activity_main);
    }

    /**
     * Sets the Android background to white after specified time in seconds.
     * Fixes the splash screen flash when the keyboard is shown.
     */
    private void clearSplashScreen() {
        new CountDownTimer(CLEAR_SPLASH_SCREEN_DELAY, ONE_SECOND_IN_MILLIS) {

            public void onTick(long millisUntilFinished) {
            }

            public void onFinish() {
                Window window = getWindow();
                if (window == null) {
                    return;
                }

                View rootView = window.getDecorView();

                rootView.setBackgroundColor(Color.WHITE);
            }
        }.start();
    }
}
