package com.example.aravattan.reubrotraining;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public class signupActivity extends AppCompatActivity {


    private DatePicker datePicker;
    private Calendar calendar;
    private EditText dateView,name,mail,pass;
    private int year, month, day;
    Button login;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        login=findViewById(R.id.button5);
        mail =findViewById(R.id.editText4);
        name =findViewById(R.id.editText3);
        pass =findViewById(R.id.editText5);



            dateView = findViewById(R.id.editText6);
            calendar = Calendar.getInstance();
            year = calendar.get(Calendar.YEAR);

            month = calendar.get(Calendar.MONTH);
            day = calendar.get(Calendar.DAY_OF_MONTH);
            showDate(year, month+1, day);

            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //mail validation

                    String email = mail.getText().toString().trim();
                    String name_=name.getText().toString().trim();
                    String pass_=pass.getText().toString().trim();

                    if(email.length()<=0 || name_.length()<=0 || pass_.length()<=0 ){
                        Toast.makeText(getApplicationContext(), "please fill all the fields.", Toast.LENGTH_SHORT).show();
                    }
                    else {

                        if(name_.matches("[a-zA-Z ]+")){
                            Toast.makeText(getApplicationContext(), "invalid name", Toast.LENGTH_SHORT).show();

                        }
                        String emailPattern = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";

                        boolean val = email.matches(emailPattern);

                        if (!val) {

                            Toast.makeText(getApplicationContext(), "invalid mail", Toast.LENGTH_SHORT).show();

                            }

                        else{
                            Toast.makeText(getApplicationContext(), "registration successful", Toast.LENGTH_SHORT).show();

                            Intent i=new Intent(getApplicationContext(),MainActivity.class);
                            startActivity(i);
                        }
                    }

                }
            });


        }

        @SuppressWarnings("deprecation")
        public void setDate(View view) {
            showDialog(999);

        }

        @Override
        protected Dialog onCreateDialog(int id) {
            // TODO Auto-generated method stub
            if (id == 999) {
                return new DatePickerDialog(this,
                        myDateListener, year, month, day);
            }
            return null;
        }

        private DatePickerDialog.OnDateSetListener myDateListener = new
                DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker arg0,
                                          int arg1, int arg2, int arg3) {
                        showDate(arg1, arg2+1, arg3);
                    }
                };

        private void showDate(int year, int month, int day) {
            dateView.setText(new StringBuilder().append(day).append("/")
                    .append(month).append("/").append(year));
        }

}
