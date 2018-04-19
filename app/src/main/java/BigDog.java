package jp.techacademy.satoshi.nakasone.javalog;

import android.util.Log;

class BigDog extends Dog{
    //クラス関数
    static String to_jp = "犬型犬";

    public BigDog(String name, int age) {
        super(name, age);

    }

    //クラス関数
    public static void introduce() {
        Log.d("javatesut","これは犬型犬クラスです");
    }
}
