package com.example.inbox_index;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText phone,text;
    private Button send;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        phone=findViewById(R.id.number);
        text=findViewById(R.id.text);
        send=findViewById(R.id.okey);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final  String final_phne,final_text;
                final_phne=phone.getText().toString();
                final_text=text.getText().toString();
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.putExtra("Address",final_phne);
                intent.putExtra("SMS_Body","This is my Number");
                intent.setType("vnd.android-dir/MMS*SMS");
                startActivity(intent);



            }
        });
    }
}