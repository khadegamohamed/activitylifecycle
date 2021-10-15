package com.example.learnandtest;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText first,second;

Button  browser,show;
public  static final String TAG = "activity life cycle";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first = findViewById(R.id.first);
        second = findViewById(R.id.secound);
        browser= findViewById(R.id.button);
show = findViewById(R.id.button2);

      show.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              String firstname = first.getText().toString();
              String lastname = second.getText().toString();
              Intent navagtion = new Intent(MainActivity.this,MainActivity2.class);
              navagtion.putExtra("first",firstname);
              navagtion.putExtra("last",lastname);
              startActivity(navagtion);
          }
      });
browser.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent ii = new Intent(Intent.ACTION_VIEW, Uri.parse("https://code.tutsplus.com/ar/tutorials/what-are-android-intents--cms-29335"));
        startActivity(ii);
    }
});
        Log.d(TAG, "onCreate: ");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onstart : ");
        Toast.makeText(getBaseContext(), "on start", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
        Toast.makeText(getBaseContext(), "on Resume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onpause: ");
        Toast.makeText(getBaseContext(), "on pause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onstop: ");
        Toast.makeText(getBaseContext(), "on stop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ondestroy: ");
        Toast.makeText(getBaseContext(), "on Destroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
        Toast.makeText(getBaseContext(), "on Restart", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState, @NonNull PersistableBundle outPersistentState) {
        Toast.makeText(getBaseContext(), "on save Instanse", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "onsave: ");
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d(TAG, "onRestore : ");

        Toast.makeText(getBaseContext(), "on Restore Instanse", Toast.LENGTH_SHORT).show();


    }
}
