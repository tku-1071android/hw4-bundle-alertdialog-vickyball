package com.example.myapplicationhwfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText mg,eg,sg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mg=findViewById(R.id.editText);
        sg=findViewById(R.id.editText2);
        eg=findViewById(R.id.editText3);
    }
    public void cal(View v){
        int EG=Integer.parseInt(eg.getText().toString());
        int MG=Integer.parseInt(mg.getText().toString());
        int SG=Integer.parseInt(sg.getText().toString());
        Intent intent=new Intent(this,Main2Activity.class);
        Bundle bundle =new Bundle();
        bundle.putInt("english",EG);
        bundle.putInt("math",MG);
        bundle.putInt("science",SG);
        intent.putExtras(bundle);
        startActivity(intent);
    }

}
