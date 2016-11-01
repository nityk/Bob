package com.example.dell.mybob;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.SaveListener;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Bmob.initialize(this,"ed0790558183a6553d462b5e4060360d");
        Person person=new Person();
        person.setName("杨");
        person.setAddress("小项目");
        person.setDecs("同学");
        person.setAge(10);
        person.save(new SaveListener<String>() {
            @Override
            public void done(String s, BmobException e) {
                if (e==null){
                    Toast.makeText(MainActivity.this,"失败"+e.getErrorCode(),Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(MainActivity.this,"成功"+e.getErrorCode(),Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
