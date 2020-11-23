package com.example.designthinking;

import android.app.Activity;
import android.app.MediaRouteButton;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;


public class SelectorActivity extends Activity {

    Button button1; //건설, 채굴
    Button button2; //경영, 사무, 금융, 보험
    Button button3; //교육, 법률, 사회복지, 경찰, 소방 및 군인
    Button button4; //농림어업직
    Button button5; //미용, 여행, 숙박, 음식, 경비, 돌봄, 청소
    Button button6; //보건, 의료
    Button button7; //설치, 정비, 생산
    Button button8; //연구 및 공학기술
    Button button9; //영업, 판매, 운전, 운송
    Button button10; //예술, 디자인, 방송, 스포츠

    Button firstButton;
    Button secondButton;

    TextView undoButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);

        button1 = (Button)findViewById(R.id.firstJobButton); //건설, 채굴
        button2 = (Button)findViewById(R.id.secondJobButton); //경영, 사무, 금융, 보험
        button3 = (Button)findViewById(R.id.thirdJobButton); //교육, 법률, 사회복지, 경찰, 소방 및 군인
        button4 = (Button)findViewById(R.id.fourthJobButton); //농림어업직
        button5 = (Button)findViewById(R.id.fifthJobButton); //미용, 여행, 숙박, 음식, 경비, 돌봄, 청소
        button6 = (Button)findViewById(R.id.sixthJobButton); //보건, 의료
        button7 = (Button)findViewById(R.id.seventhJobButton); //설치, 정비, 생산
        button8 = (Button)findViewById(R.id.eighthJobButton); //연구 및 공학기술
        button9 = (Button)findViewById(R.id.ninthJobButton); //영업, 판매, 운전, 운송
        button10 = (Button)findViewById(R.id.tenthJobButton); //예술, 디자인, 방송, 스포츠

        firstButton = (Button)findViewById(R.id.firstPageButton);
        secondButton = (Button)findViewById(R.id.secondPageButton);

        undoButton = (TextView)findViewById(R.id.undoTextView);

    }
    public void firstButton(View v){
        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",1);
        startActivity(intent);
        SelectorActivity.this.finish();
    }
    public void secondButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",2);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void thirdButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",3);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void fourthButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",4);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void fifthButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",5);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void sixthButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",6);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void seventhButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",7);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void eighthButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",8);
        startActivity(intent);
        SelectorActivity.this.finish();

    }
    public void ninthButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",9);
        startActivity(intent);
        SelectorActivity.this.finish();
    }
    public void tenthButton(View v){

        Intent intent = new Intent(getApplicationContext(),ShowJobActivity.class);
        intent.putExtra("jobNumber",10);
        startActivity(intent);
        SelectorActivity.this.finish();
    }
    public void firstPageButton(View v){

        button1.setVisibility(View.VISIBLE);
        button2.setVisibility(View.VISIBLE);
        button3.setVisibility(View.VISIBLE);
        button4.setVisibility(View.VISIBLE);
        button5.setVisibility(View.VISIBLE);
        button6.setVisibility(View.VISIBLE);
        button7.setVisibility(View.VISIBLE);
        button8.setVisibility(View.GONE);
        button9.setVisibility(View.GONE);
        button10.setVisibility(View.GONE);

    }
    public void secondPageButton(View v){

        button1.setVisibility(View.GONE);
        button2.setVisibility(View.GONE);
        button3.setVisibility(View.GONE);
        button4.setVisibility(View.GONE);
        button5.setVisibility(View.GONE);
        button6.setVisibility(View.GONE);
        button7.setVisibility(View.GONE);
        button8.setVisibility(View.VISIBLE);
        button9.setVisibility(View.VISIBLE);
        button10.setVisibility(View.VISIBLE);

    }

}
