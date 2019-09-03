package com.k00442066.pdfviewer;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    public static File extStrgLoc= Environment.getExternalStorageDirectory();
    public static String fileName="myfile.txt";
    public static File myfile=new File(extStrgLoc,fileName);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE)!=
        PackageManager.PERMISSION_GRANTED){
    toastIt("We Do not have write permission!");
            ActivityCompat.requestPermissions(this,new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE},0);
        }

    }
    public void download(View v){


    }

    public void view(View v){

    }

    public void toastIt(String displayText){
        Toast.makeText(this,displayText,Toast.LENGTH_LONG);
    }

    private class DownloadFile extends AsyncTask<String, Void,Void>{

    }
}
