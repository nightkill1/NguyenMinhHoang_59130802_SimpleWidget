package com.example.nguyenminhhoang_59130802_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Tname, TDoB, Other;
    RadioGroup rdg;
    RadioButton RNam, RNu;
    CheckBox cbXP, cbNN, cbCF, cbON, cbNA;
    Button btn;
    String Notification;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addView();
        EventView();
    }
    private void addView()
    {
        Tname = findViewById(R.id.TName);
        TDoB = findViewById(R.id.TDoB);
        Other = findViewById(R.id.Other);
        RNam = findViewById(R.id.RNam);
        RNu = findViewById(R.id.RNu);
        cbXP = findViewById(R.id.cbXP);
        cbCF = findViewById(R.id.cbCF);
        cbNA = findViewById(R.id.cbNA);
        cbNN = findViewById(R.id.cbNN);
        cbON = findViewById(R.id.cbON);
        btn = findViewById(R.id.btnXN);
    }
    private  void EventView()
    {
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                commfirm();

            }
        });
    }

    private  void commfirm()
    {
        Notification  = " Họ Tên: " + Tname.getText().toString() +"\nNgày sinh: "+ TDoB.getText().toString() ;
        if(RNam.isChecked())
        {
            Notification += "\nGiới tính: Nam\n" ;

        }else if(RNu.isChecked())
        {
            Notification += "\nGiới tính: Nữ\n" ;
        }
        Notification += "Sở thích: \t";
        if(cbXP.isChecked())
        {
            Notification += "Xem Phim,\t" ;
        }
        if(cbNN.isChecked())
        {
            Notification += "Nghe Nhạc,\t" ;
        }
        if(cbCF.isChecked())
        {
            Notification += "đi cà phê với bạn bè, \t" ;
        }
        if(cbON.isChecked())
        {
            Notification += "ở nhà một mình,\t" ;
        }
        if(cbNA.isChecked())
        {
            Notification += "Xuống bếp nấu ăn,\t" ;
        }
        Notification += Other.getText().toString();
        Toast.makeText(getApplicationContext(), Notification, Toast.LENGTH_SHORT).show();
    }
}
