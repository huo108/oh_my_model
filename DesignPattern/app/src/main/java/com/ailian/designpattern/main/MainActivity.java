package com.ailian.designpattern.main;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.ailian.designpattern.R;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.button)
    Button button;
    @Bind(R.id.button2)
    Button button2;
    @Bind(R.id.button3)
    Button button3;
    @Bind(R.id.button4)
    Button button4;
    @Bind(R.id.button5)
    Button button5;
    @Bind(R.id.button6)
    Button button6;
    @Bind(R.id.button7)
    Button button7;
    @Bind(R.id.button8)
    Button button8;
    @Bind(R.id.button9)
    Button button9;
    @Bind(R.id.button10)
    Button button10;
    @Bind(R.id.button11)
    Button button11;
    @Bind(R.id.button12)
    Button button12;
    @Bind(R.id.button13)
    Button button13;
    @Bind(R.id.button14)
    Button button14;
    @Bind(R.id.button15)
    Button button15;
    @Bind(R.id.button16)
    Button button16;
    @Bind(R.id.button17)
    Button button17;
    @Bind(R.id.button18)
    Button button18;
    @Bind(R.id.button19)
    Button button19;
    @Bind(R.id.button20)
    Button button20;
    @Bind(R.id.button21)
    Button button21;
    @Bind(R.id.button22)
    Button button22;
    @Bind(R.id.button23)
    Button button23;
    @Bind(R.id.button24)
    Button button24;
    @Bind(R.id.mulu)
    Button mulu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.mulu,R.id.button, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10, R.id.button11, R.id.button12, R.id.button13, R.id.button14, R.id.button15, R.id.button16, R.id.button17, R.id.button18, R.id.button19, R.id.button20, R.id.button21, R.id.button22, R.id.button23, R.id.button24})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.mulu://目录
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/17517213");
                break;
            case R.id.button://简单工厂模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/9300337");
                break;
            case R.id.button2://工厂方法模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/9306457");
                break;
            case R.id.button3://抽象工厂模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/9319181");
                break;
            case R.id.button4://单列模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7420883");
                break;
            case R.id.button5://原型模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7424559");
                break;
            case R.id.button6://建造者模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7426015");
                break;
            case R.id.button7://适配器模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8624325");
                break;
            case R.id.button8://桥接模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7464183");
                break;
            case R.id.button9://组合模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7956898");
                break;
            case R.id.button10://装饰模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7424685");
                break;
            case R.id.button11://外观模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8258121");
                break;
            case R.id.button12://亨元模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7667781");
                break;
            case R.id.button13://代理模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8227953");
                break;
            case R.id.button14://职责链模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7420891");
                break;
            case R.id.button15://命令模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8796736");
                break;
            case R.id.button16://解释器模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7713567");
                break;
            case R.id.button17://迭代器模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/9992005");
                break;
            case R.id.button18://中介者模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8482952");
                break;
            case R.id.button19://备忘录模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7526740");
                break;
            case R.id.button20://观察者模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7720232");
                break;
            case R.id.button21://状态模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8522982");
                break;
            case R.id.button22://策略模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7818983");
                break;
            case R.id.button23://模板方法模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/8299794");
                break;
            case R.id.button24://访问者模式
                WebviewActivity.start(MainActivity.this,"http://blog.csdn.net/lovelion/article/details/7433523");
                break;
        }
    }
}
