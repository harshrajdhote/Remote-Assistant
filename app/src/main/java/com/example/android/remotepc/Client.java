package com.example.android.remotepc;

import android.os.AsyncTask;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client extends AsyncTask<Void,Void,Void> {

public String type;
public String ip_add = "100.105.14.23";
Client(String t)
{
    type=t;
}
    @Override
    protected Void doInBackground(Void... voids) {
    if(type == "shut"){
        try {
            Socket cli = new Socket(ip_add,9999);
            OutputStream toServer = cli.getOutputStream();
            DataOutputStream out = new DataOutputStream(toServer);
            out.writeBytes("shutdown");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    if(type == "restart")
    {
        try {
            Socket cli = new Socket(ip_add,9999);
            OutputStream toServer = cli.getOutputStream();
            DataOutputStream out = new DataOutputStream(toServer);
            out.writeBytes("restart");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    if(type == "music"){
        try {
            Socket cli = new Socket(ip_add,9999);
            OutputStream toServer = cli.getOutputStream();
            DataOutputStream out = new DataOutputStream(toServer);
            out.writeBytes("music");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        return null;
    }
}