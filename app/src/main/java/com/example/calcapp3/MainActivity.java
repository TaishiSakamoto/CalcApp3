package com.example.calcapp3;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void inputNum(View view) {
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        EditText editText2 = (EditText) findViewById(R.id.editText2);

        String str1 = editText1.getText().toString();
        String str2 = editText2.getText().toString();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        int result = calcNum(num1, num2);

        TextView textView1 = (TextView) findViewById(R.id.textView);
        String str3 = String.valueOf(result);
        textView1.setText(str3);
        //Jenkinsのジョブ連携確認
    }

    public int calcNum(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }
}