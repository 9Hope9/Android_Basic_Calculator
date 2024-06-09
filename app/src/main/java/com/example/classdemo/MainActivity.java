package com.example.classdemo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edtFnumber, edtSnumber;
    TextView txtResult;
    Button btnSum, btnProduct, btnSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;

        });
        edtFnumber = (EditText) findViewById(R.id.edtFirstNumber);
        edtSnumber = (EditText) findViewById(R.id.edtSecondNumber);
        txtResult = (TextView) findViewById(R.id.txtResult);
        btnSum = (Button) findViewById(R.id.btnFindSum);
        btnProduct = (Button) findViewById(R.id.btnFindProduct);
        btnSub = (Button) findViewById(R.id.btnFindSub);
        btnSum.setOnClickListener(this);
        btnProduct.setOnClickListener(this);
        btnSub.setOnClickListener(this);

//        btnSum.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int num1, num2, result;
//                num1 = Integer.parseInt(String.valueOf(edtFnumber.getText()));
//                num2 = Integer.parseInt(String.valueOf(edtSnumber.getText()));
//                result= num1 + num2;
//                txtResult.setText(String.valueOf(result));
//                Toast.makeText(getApplicationContext(),"The sum  is " + result, Toast.LENGTH_LONG).show();
//            }
//        });

//        btnProduct.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int num1, num2, result;
//                num1 = Integer.parseInt(String.valueOf(edtFnumber.getText()));
//                num2 = Integer.parseInt(String.valueOf(edtSnumber.getText()));
//                result= num1 * num2;
//                txtResult.setText(String.valueOf(result));
//                Toast.makeText(getApplicationContext(),"The product is " + result, Toast.LENGTH_LONG).show();
//            }
//        });

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnFindSum) {
            if (formValidatied()) {
                int num1, num2, result;
//            num1 = Integer.parseInt(String.valueOf(edtFnumber.getText()));
//            num2 = Integer.parseInt(String.valueOf(edtSnumber.getText()));
                num1 = Integer.parseInt(String.valueOf(edtFnumber.getText()));
                num2 = Integer.parseInt(String.valueOf(edtSnumber.getText()));
                result = num1 + num2;
                txtResult.setText(String.valueOf(result));
                Toast.makeText(getApplicationContext(), "The sum  is " + result, Toast.LENGTH_LONG).show();
            }
        }
        else if (v.getId() == R.id.btnFindProduct) {
            if (formValidatied()) {
                int num1, num2, result;
                num1 = Integer.parseInt(String.valueOf(edtFnumber.getText()));
                num2 = Integer.parseInt(String.valueOf(edtSnumber.getText()));
                result = num1 * num2;
                txtResult.setText(String.valueOf(result));
                Toast.makeText(getApplicationContext(), "The product is " + result, Toast.LENGTH_LONG).show();
            }
            }
        else if (v.getId() == R.id.btnFindSub) {
            if (formValidatied()) {
                int num1, num2, result;
                num1 = Integer.parseInt(String.valueOf(edtFnumber.getText()));
                num2 = Integer.parseInt(String.valueOf(edtSnumber.getText()));
                result = num1 - num2;
                txtResult.setText(String.valueOf(result));
                Toast.makeText(getApplicationContext(), "The substraction is " + result, Toast.LENGTH_LONG).show();
            }
        }
    }

    private boolean formValidatied(){
        if (edtFnumber.length() == 0){
            edtFnumber.setError("This field is required");
            return false;

        }
        if (edtSnumber.length() == 0){
            edtSnumber.setError("This field is required");
            return false;

        }
        return true;
    }
}

