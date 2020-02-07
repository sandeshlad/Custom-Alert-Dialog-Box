package com.example.customalertdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView dummyText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view) {

        final AlertDialog.Builder alert=new AlertDialog.Builder(MainActivity.this);
        View mView=getLayoutInflater().inflate(R.layout.custom_dialog,null);

        final EditText textinputText=(EditText)mView.findViewById(R.id.textipnut);
        Button btn_cancel=mView.findViewById(R.id.btncancel);
        Button btn_ok=mView.findViewById(R.id.btnok);

        alert.setView(mView);
        final AlertDialog alertDialog=alert.create();
        alertDialog.setCanceledOnTouchOutside(false);

        dummyText=findViewById(R.id.text_dummy);

        btn_cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                alertDialog.dismiss();

            }
        });
        btn_ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                dummyText.setText(textinputText.getText().toString());
                alertDialog.dismiss();

            }
        });
        alertDialog.show();
    }
}
