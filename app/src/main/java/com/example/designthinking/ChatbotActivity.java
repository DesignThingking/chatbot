package com.example.designthinking;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

import java.nio.channels.Selector;


public class ChatbotActivity extends Activity {

    TextView upText;
    int progress = 0;
    int progressCheck = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chatbot);

        upText = findViewById(R.id.upPhrases);
    }

    public boolean onTouchEvent(MotionEvent event){
        if(event.getAction()==MotionEvent.ACTION_DOWN || event.getAction()==MotionEvent.ACTION_MOVE) {
            if (progressCheck == 0) {
                progressCheck = 1;
                progress++;
                if (progress == 0) {
                    upText.setText("안녕하세요.\\n일자리 찾기를\\n도와드리겠습니다.");
                }
                if(progress == 1){
                    upText.setText("원하는 직종을\n선택해 주세요");
                }

                if(progress == 2){
                    Intent intent = new Intent(getApplication(), SelectorActivity.class);
                    startActivity(intent);
                    ChatbotActivity.this.finish();
                }


            }
        }else {
            progressCheck = 0;
        }
        return true;
    }
}
