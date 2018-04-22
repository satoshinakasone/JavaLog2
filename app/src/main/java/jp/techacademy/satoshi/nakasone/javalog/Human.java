package jp.techacademy.satoshi.nakasone.javalog;

import android.util.Log;

class Human extends Animal implements Thinkable   {
    //メンバ変数

    String hobby;  // 趣味

    // コンストラクタ
    public Human(String name, int age, String hobby){
        this.name =name;
        this.age = age;
        this.hobby = hobby;

    }

    @Override
    public void say(){

        Log.d("javatest", "私の名前は" + this.name + "です。");
        Log.d("javatest", "年は" + this.age + "歳です。");

    }


    public void think(){
        Log.d("javatest",   "私は" + this.hobby + "について考える");
    }


}
