package com.example.designthinking;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_splash);

        Handler handler=new Handler();
        handler.postDelayed(new SplashHandler(),3000);
    }

    private class SplashHandler implements Runnable{
        public void run(){
            startActivity(new Intent(getApplication(), StartChatbotActivity.class));
            SplashActivity.this.finish();
        }
    }

    @Override
    public void onBackPressed(){

    }
}
