package com.example.pract_131;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar p1=findViewById(R.id.p1);

        p1.setProgress(0);

        for (int i=0;i<=100;i++)
        {
            setProgress(i);
            try{
                Thread.sleep(200);
            }
            catch (Exception e)
            {

            }
        }
    }
}