package jp.techacademy.satoshi.nakasone.javalog;

import android.util.Log;


class Human extends Animal{
    //メンバ変数
    String name;     //　名前
    int age;      // 年齢

    // コンストラクタ
    public Human(String name, int age) {
        this.name =name;
        this.age = age;

    }

    public void say(){
        Log.d("javatest",this.name + "(" + this.age + "歳)" + "(～～はメンバ変数から取得)");

    }
}
