package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button clear,div,mul,sub,add,equal,b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,dot;
    EditText result,display;
    String dis,res,oldnumber="",operator,newNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.result);
        display=findViewById(R.id.display);

        clear=findViewById(R.id.Clear);
        div=findViewById(R.id.div);
        mul=findViewById(R.id.multi);
        sub=findViewById(R.id.sub);
        add=findViewById(R.id.add);
        equal=findViewById(R.id.equal);
        b0=findViewById(R.id.zero);
        b1=findViewById(R.id.one);
        b2=findViewById(R.id.two);
        b3=findViewById(R.id.three);
        b4=findViewById(R.id.four);
        b5=findViewById(R.id.five);
        b6=findViewById(R.id.six);
        b7=findViewById(R.id.seven);
        b8=findViewById(R.id.eight);
        b9=findViewById(R.id.nine);
        dot=findViewById(R.id.dot);


        clear.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        sub.setOnClickListener(this);
        add.setOnClickListener(this);
        equal.setOnClickListener(this);
        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        dot.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        dis=display.getText().toString();
        res=result.getText().toString();

        if(v.equals(b0)) {
            dis += 0;
            res += 0;
        }else if(v.equals(b1)) {
            dis += 1;
            res += 1;
        }else if(v.equals(b2)) {
            dis += 2;
            res += 2;
        }else if(v.equals(b3)) {
            dis += 3;
            res += 3;
        }else if(v.equals(b4)) {
            dis += 4;
            res += 4;
        }else if(v.equals(b5)) {
            dis += 5;
            res += 5;
        }else if(v.equals(b6)) {
            dis += 6;
            res += 6;
        }
        if(v.equals(b9)){
            dis+=9;
            res+=9;
        }else if(v.equals(b8)){
            dis+=8;
            res+=8;
        }else if(v.equals(b7)){
            dis+=7;
            res+=7;
        }
        else if(v.equals(div)){
            dis+="/";
            oldnumber=res;
            operator="/";
            res="";
        }else if(v.equals(add)){
            dis+="+";
            oldnumber=res;
            operator="+";
            res="";
        }else if(v.equals(sub)){
            dis+="-";
            oldnumber=res;
            operator="-";
            res="";
        }else if(v.equals(mul)){
            dis+="*";
            oldnumber=res;
            operator="*";
            res="";
        }
        else if(v.equals(dot)) {
            dis += ".";
            res += ".";
        }
        else if(v.equals(equal)){
            newNum=res;
            double finalResult=0.0;
            switch (operator){
                case "/":finalResult=Double.parseDouble(oldnumber) /Double.parseDouble(newNum);break;
                case "+":finalResult=Double.parseDouble(oldnumber) +Double.parseDouble(newNum);break;
                case "-":finalResult=Double.parseDouble(oldnumber) -Double.parseDouble(newNum);break;
                case "*":finalResult=Double.parseDouble(oldnumber) *Double.parseDouble(newNum);break;
            }
            res=finalResult+"";

        }
        display.setText(dis);
        result.setText(res);
        if(v.equals(clear)){
            display.setText("");
            result.setText("");
        }

    }
}