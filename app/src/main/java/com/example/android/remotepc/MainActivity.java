package com.example.android.remotepc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void shutdown(View v)
    {
  Client mycli = new Client("shut");
        Toast.makeText(getApplicationContext(),"In Shutdown",Toast.LENGTH_SHORT).show();
        mycli.execute();
    }
    public void restart(View v){
        Client mycli = new Client("restart");
        Toast.makeText(getApplicationContext(),"In restart",Toast.LENGTH_SHORT).show();
        mycli.execute();
    }
    public void playMusic(View v)
    {
        Client mycli = new Client("music");
        Toast.makeText(getApplicationContext(),"In music",Toast.LENGTH_SHORT).show();
        mycli.execute();
    }
}
