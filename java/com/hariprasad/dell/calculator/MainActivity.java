package com.hariprasad.dell.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String viewValue1 = null;
    String viewValue2 = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView input1 = (TextView) findViewById(R.id.input1);
        TextView input2 = (TextView) findViewById(R.id.input2);
        TextView operator = (TextView) findViewById(R.id.operator);
        TextView result = (TextView) findViewById(R.id.result);
        input1.setText(null);
        input2.setText(null);
        operator.setText(null);
        result.setText(null);
    }

    public void textv(int value) {
        TextView input1 = (TextView) findViewById(R.id.input1);
        TextView input2 = (TextView) findViewById(R.id.input2);
        TextView operator = (TextView) findViewById(R.id.operator);
        TextView result = (TextView) findViewById(R.id.result);

        if (operator.getText().equals("")) {
            if (input1.getText() != null && value != 9999 && value != 1111 && value != 7777) {
                input1.append(String.valueOf(value));
            } else if (value == 9999) {
                input1.setText(null);
                input2.setText(null);
                operator.setText(null);
                result.setText(null);
            } else if (value == 1111) {
                viewValue1 = input1.getText().toString();
                input1.setText(viewValue1 + '.');
            } else if (value == 7777) {
                float n = Float.parseFloat(viewValue1);
                if (n > 0)
                {
                    n = n*-1;
                    input1.setText(""+n);
                }
                else {
                    n = n*-1;
                    input1.setText(""+n);
                }
            }

            else {
                input1.setText(String.valueOf(value));
            }
        } else {
            if (input2.getText() != null && value != 9999 && value != 1111 && value != 7777) {
                input2.append(String.valueOf(value));
            } else if (value == 9999) {
                input2.setText(null);
                input1.setText(null);
                operator.setText(null);
                result.setText(null);
            } else if (value == 1111) {
                viewValue2 = input2.getText().toString();
                input2.setText(viewValue2 + '.');

            } else if (value == 7777) {
                float n2 = Float.parseFloat(viewValue2);
                if (n2 > 0)
                {
                    n2 = n2*-1;
                    input2.setText(""+n2);
                }
                else {
                    n2 = n2*-1;
                    input2.setText(""+n2);
                }
            }else {
                input2.setText(String.valueOf(value));
            }
        }
        viewValue1 = input1.getText().toString();
        viewValue2 = input2.getText().toString();
    }

    public void texto(char c) {
        TextView operator = (TextView) findViewById(R.id.operator);
        if (operator.getText().length() == 1) {
            Toast.makeText(getApplicationContext(), "Invalid Opreation", Toast.LENGTH_SHORT).show();
        } else {
            operator.setText(String.valueOf(c));
        }
    }

    public void but1(View view) {
        textv(1);
    }

    public void but2(View view) {
        textv(2);
    }

    public void but3(View view) {
        textv(3);
    }

    public void but4(View view) {
        textv(4);
    }

    public void but5(View view) {
        textv(5);
    }

    public void but6(View view) {
        textv(6);
    }

    public void but7(View view) {
        textv(7);
    }

    public void but8(View view) {
        textv(8);
    }

    public void but9(View view) {
        textv(9);
    }

    public void but0(View view) {
        textv(0);
    }

    public void butClear(View view) {
        textv(9999);
    }

    public void butPlus(View view) {
        char p = '+';
        texto(p);
    }

    public void butSub(View view) {
        char s = '-';
        texto(s);
    }

    public void butMul(View view) {
        char m = '*';
        texto(m);
    }

    public void butDiv(View view) {
        char d = '/';
        texto(d);
    }

    public void butDot(View view) {
        textv(1111);
    }

    public void butPM(View view)
    {
        textv(7777);
    }

    public void equals(View view) {
        TextView t1 = (TextView) findViewById(R.id.input1);
        TextView t2 = (TextView) findViewById(R.id.input2);
        TextView op = (TextView) findViewById(R.id.operator);
        TextView re = (TextView) findViewById(R.id.result);
        if (t1.getText().equals("") || t2.getText().equals("") || op.getText().equals("")) {
            Toast.makeText(getApplicationContext(), "Invalid Opreation", Toast.LENGTH_SHORT).show();
        } else {
            float a = Float.parseFloat(t1.getText().toString());
            float b = Float.parseFloat(t2.getText().toString());
            if (op.getText().toString().equals("+")) {
                float c = a + b;
                re.setText(String.valueOf(c));
            }
            if (op.getText().toString().equals("-")) {
                float c = a - b;
                re.setText(String.valueOf(c));
            }
            if (op.getText().toString().equals("/")) {
                float c = a / b;
                re.setText(String.valueOf(c));
            }
            if (op.getText().toString().equals("*")) {
                float c = a * b;
                re.setText(String.valueOf(c));
            }
        }
    }
}



