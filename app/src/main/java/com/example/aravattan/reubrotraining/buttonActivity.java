package com.example.aravattan.reubrotraining;


import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class buttonActivity extends Fragment {

Button b1,b2;
    View view;
    public buttonActivity() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_button,null,false);

        b1=view.findViewById(R.id.toastbutton);
        b2=view.findViewById(R.id.snackbar);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity().getApplicationContext(),"button clicked",Toast.LENGTH_LONG).show();
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Snackbar snackBar = Snackbar .make(v, "Snack Bar demo!", Snackbar.LENGTH_LONG) .setAction("RETRY", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    }
                });
                snackBar.setActionTextColor(Color.BLUE);
                View snackBarView = snackBar.getView();
                TextView textView = snackBarView.findViewById(android.support.design.R.id.snackbar_text);
                textView.setTextColor(Color.RED);
                snackBar.show();

           }
        });

        return view;


    }

}
