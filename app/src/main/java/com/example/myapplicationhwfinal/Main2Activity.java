package com.example.myapplicationhwfinal;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class Main2Activity extends AppCompatActivity {
    private TextView txv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        txv=(TextView)findViewById(R.id.textView);
        NumberFormat nf=NumberFormat.getInstance();
        Bundle bundle=getIntent().getExtras();
        int math=bundle.getInt("math");
        int english=bundle.getInt("english");
        int science=bundle.getInt("science");
        int sum=math+english+science;
        double avg=sum/3.0;
        String text="math = "+math+"\nenglish = "+english+"\nscience = "+science+"\nsum = "+sum+"\naverage = "+avg;
        txv.setText(text);
        alert(avg);
    }
    public void show(){

    }
    private void alert(double avg){
        String message=new String();
        String title=new String();
        int pic=0;

        if(avg==100){
            message="100";
            title="pass 你是神";
            pic=R.drawable.circle;
        }
        else if(avg>80){
            message="你好棒";
            title="pass";
            pic=R.drawable.circle;
        }
        else if(avg>60){
            message="有及格~~";
            title="pass";
            pic=R.drawable.circle;
        }
        else{
            message="再加油";
            title="fail";
            pic=R.drawable.cross;
        }
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.setIcon(pic);
        builder.setPositiveButton("OK",null);
        builder.setNegativeButton("Cancel",null);
        builder.setNeutralButton("Nothing",null);
        builder.show();
    }
    public void back(View view){
        finish();
    }
}
