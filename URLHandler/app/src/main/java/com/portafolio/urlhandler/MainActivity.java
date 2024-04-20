package com.portafolio.urlhandler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView uri=findViewById(R.id.uri);


        if (Intent.ACTION_MAIN.equals(getIntent().getAction())) {
            String intentUri=(new Intent("laucher_vue_777.surge.sh")).toUri(Intent.URI_INTENT_SCHEME).toString();
            uri.setText(intentUri);
            Intent intent = getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            Log.e("TAG", "onCreate: "+action.toString());

    }else{
            Intent intent = getIntent();
            String action = intent.getAction();
            Uri data = intent.getData();
            Log.e("TAG", "onCreate: "+action.toString());
            Log.e("TAG", "onCreate: "+data.toString());

            uri.setText(data.toString());

        }
}









}