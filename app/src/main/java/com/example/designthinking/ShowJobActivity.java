package com.example.designthinking;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.*;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class ShowJobActivity extends Activity {

    private RecyclerView recyclerView;
    private LinearLayoutManager linearLayoutManager;
    private List<Integer> cnt;
    private int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_job);

        recyclerView = (RecyclerView) findViewById(R.id.mainRecyclerView);
        linearLayoutManager= new LinearLayoutManager(this);

        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(linearLayoutManager);
        
        readCSVFIle();


    }

    private void readCSVFIle() {
        Intent intent = getIntent();
        int whatCSVFile = intent.getExtras().getInt("jobNumber");
        switch (whatCSVFile){
            case 1:
                InputStream is = getResources().openRawResource(R.raw.erection_mining);
                BufferedReader reader = new BufferedReader(
                    new InputStreamReader(is, Charset.forName("UTF-8"))
                );
                String line="";
                try{

                    while((line=reader.readLine())!=null){
                        String[] tokens = line.split(",");
                    }

                }catch (IOException e){

                }
        }
    }

}
