package com.example.designthinking;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;
import android.content.Intent;

public class StartChatbotActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_chatbot);

        Button button = findViewById(R.id.chatStartButton);
    }

    public void chatStartButton(View v){
        startActivity(new Intent(getApplication(), ChatbotActivity.class));
        StartChatbotActivity.this.finish();
    }
}
