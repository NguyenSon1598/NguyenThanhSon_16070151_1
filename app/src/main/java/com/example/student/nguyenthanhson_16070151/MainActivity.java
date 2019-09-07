package com.example.student.nguyenthanhson_16070151;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    CheckBox checksave;
    Button btnDN;
    TextView tvketqua;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checksave = (CheckBox)findViewById(R.id.checksave);
        btnDN = (Button)findViewById(R.id.btnDN);
        tvketqua = (TextView)findViewById(R.id.tvketqua);
        btnDN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checksave.isChecked())
                    tvketqua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn đã được lưu");
                else
                    tvketqua.setText("Chào mừng bạn đăng nhập hệ thống, thông tin của bạn không được lưu");
            }
        });
    }
}
