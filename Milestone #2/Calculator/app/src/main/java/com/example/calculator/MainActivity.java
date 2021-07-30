package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bC,bfact,bAdd,bSub,bDiv,bMulti,bMod,bRoot,bDecimal,bD,bPow,bInverse,bEquals;
    EditText res;
    Double value1,value2;
    Boolean add = false, sub = false , multi=false,div=false,mod=false,pow=false, clear =false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0=findViewById(R.id.btn_0);
        b1=findViewById(R.id.btn_1);
        b2=findViewById(R.id.btn_2);
        b3=findViewById(R.id.btn_3);
        b4=findViewById(R.id.btn_4);
        b5=findViewById(R.id.btn_5);
        b6=findViewById(R.id.btn_6);
        b7=findViewById(R.id.btn_7);
        b8=findViewById(R.id.btn_8);
        b9=findViewById(R.id.btn_9);
        bC=findViewById(R.id.btn_C);
        bfact=findViewById(R.id.btn_fact);
        bAdd=findViewById(R.id.btn_add);
        bSub=findViewById(R.id.btn_sub);
        bDiv=findViewById(R.id.btn_div);
        bMulti=findViewById(R.id.btn_multiply);
        bMod=findViewById(R.id.btn_mod);
        bRoot=findViewById(R.id.btn_root);
        bDecimal=findViewById(R.id.btn_decimal);
        bD=findViewById(R.id.btn_delete);
        bPow=findViewById(R.id.btn_power);
        bInverse=findViewById(R.id.btn_inverse);
        bEquals=findViewById(R.id.btn_equal);
        res=findViewById(R.id.edit);


        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"0");
                }

            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else {
                    res.setText(res.getText().toString() + "1");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"2");}
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"3");}
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"4");}
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"5");}
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"6");}
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else {
                    res.setText(res.getText().toString() + "7");
                }
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"8");}
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+"9");}
            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                res.setText("");clear=false;
            }
        });
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= res.getText().toString();
                if(s.length()==0)
                    res.setText("");
                else{
                    s=s.substring(0,s.length()-1);
                    res.setText(s);}
            }
        });
        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 = Double.parseDouble(res.getText().toString());
                    add = true;
                    res.setText(null);
                }
            }
        });
        bSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 = Double.parseDouble(res.getText().toString());
                    sub = true;
                    res.setText(null);}
            }
        });
        bMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 = Double.parseDouble(res.getText().toString());
                    multi = true;
                    res.setText(null);}
            }
        });

        bDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 = Double.parseDouble(res.getText().toString());
                    div = true;
                    res.setText(null);}
            }
        });
        bMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 = Double.parseDouble(res.getText().toString());
                    mod = true;
                    res.setText(null);}
            }
        });
        bRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 = Double.parseDouble(res.getText().toString());
                    double r= Math.sqrt(value1);
                    res.setText(r+"");
                }
            }
        });
        bPow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                {res.setText("");}
                else {
                    value1 =  Double.parseDouble(res.getText().toString());
                    pow = true;
                    res.setText(null);
                }
            }
        });
        bInverse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else {
                    value1 =  Double.parseDouble(res.getText().toString());
                    double inverse =1/value1;
                    res.setText(inverse+"");
                }
            }
        });
        bDecimal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    res.setText(res.getText().toString()+".");}
            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int val = Integer.parseInt(res.getText().toString());
                long fact = factorial(val);
                res.setText(String.valueOf(fact));
            }
        });
        bEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                value2= Double.parseDouble(res.getText().toString());
                if(res.getText()==null||clear ==true)
                    res.setText("");
                else if(clear==true)
                {
                    res.setText("");clear=false;
                }else{
                    if(add==true)
                    {
                        double sum = value1+ value2;
                        res.setText(sum+ "");
                        add=false;
                    }else if (sub==true){
                        res.setText(value1-value2 +" ");
                        sub=false;
                    }else if (multi==true){
                        res.setText(value1*value2+"");
                        multi=false;
                    }else if (div==true){
                        res.setText(value1/value2+"");
                        div=false;
                    }else if (mod==true){
                        res.setText(value1%value2+"");
                        mod=false;
                    }else if(pow==true){
                        double p = Math.pow(value1,value2);
                        res.setText(p+"");
                        pow=false;
                    }else{
                        res.setText("Error");
                    }
                    clear=true;
                }}
        });
    }
    long factorial(int n)
    {
        return (n==1 || n==0) ? 1 : n*factorial(n-1);
    }
}