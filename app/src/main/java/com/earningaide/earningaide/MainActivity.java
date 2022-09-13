package com.earningaide.earningaide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.tv);


        //String Request // Link er shob kiso string hisabe niye ase .......................
        StringRequest stringRequest = new StringRequest(Request.Method.GET, "file:///D:/Hello.html", new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {
                textView.setText("Server Result....\n"+ response);

            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView.setText("Server Not Responded");
            }
        }
        );
        RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);
        requestQueue.add(stringRequest); // Edn string request.................













    }
}