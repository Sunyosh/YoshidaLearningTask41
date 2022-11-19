package com.example.yoshidalearningtask41;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
public class MainActivity extends AppCompatActivity {
    private EditText mEditText1;
    private EditText mEditText2;
    private EditText mEditText3;
    private TextView mTextViewResult;
    private Button mButtonAdd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mEditText1 = findViewById(R.id.editTextNumber2);
        mEditText2 = findViewById(R.id.editTextNumber3);
        mEditText3 = findViewById(R.id.editTextNumber4);
        mTextViewResult = findViewById(R.id.textView_result);
        mButtonAdd = findViewById(R.id.button);

        mButtonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mEditText1.getText().toString().length() == 0) {
                    mEditText1.setText("0");
                }

                if (mEditText2.getText().toString().length() == 0) {
                    mEditText2.setText("0");
                }

                if (mEditText3.getText().toString().length() == 0) {
                    mEditText3.setText("0");
                }

                int num1 = Integer.parseInt(mEditText1.getText().toString());
                int num2 = Integer.parseInt(mEditText2.getText().toString());
                int num3 = Integer.parseInt(mEditText3.getText().toString());

                int sum = num1 + num2 + num3;
                mTextViewResult.setText(String.valueOf(sum));
            }
        });
    }
}