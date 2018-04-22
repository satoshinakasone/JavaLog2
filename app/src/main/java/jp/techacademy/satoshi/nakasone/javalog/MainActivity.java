package jp.techacademy.satoshi.nakasone.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;  //ここを追加


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("仲宗根　聡", 39,"読書");     // 名前を仲宗根　聡、年齢39歳で、のインスタンスを作る

        human.say();


        human.think();




             }

             }






















