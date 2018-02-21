package sdu.cs58.kingkan.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText number1EditText,numder2EditText;
    Button addButton;
    TextView resultTextView;
    int num1,num2,result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        number1EditText=findViewById(R.id.edtNumber1);
        numder2EditText=findViewById(R.id.edtNumder2);
        addButton=findViewById(R.id.btnAdd);
        resultTextView=findViewById(R.id.txvResult);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //รับค่าตัวเลขเก็บไว้ในตัวแปรชนิดInt
               num1=Integer.parseInt(number1EditText.getText().toString().trim());
               num2=Integer.parseInt(numder2EditText.getText().toString().trim());
               result=num1+num2;
                       //แสดงผลลัพการคำนวน
                resultTextView.setText(result+ "");


            }
        });

        //ผูกตัวแปรบนjavaกับ
    }//n.onCreate
}//n.class
