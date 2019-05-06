package com.project1.www.chandu;

import android.content.res.AssetManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class second extends AppCompatActivity {

    Toolbar mtoolbar;
    TextView mText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        mText = (TextView) findViewById(R.id.textView3);


        AssetManager assetManager = getAssets();

        mtoolbar = (Toolbar) findViewById(R.id.toolbar2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mtoolbar.setTitle(bundle.getString("ProgrammsName"));
            if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("PrintHelloOnScreen")) {
                // To load text file
                try {
                    // get input stream for text
                    InputStream is = getAssets().open("o1.txt");
                    // check size
                    int size = is.available();
                    // create buffer for IO
                    byte[] buffer = new byte[size];
                    // get data to buffer
                    is.read(buffer);
                    // close stream
                    is.close();
                    // set result to TextView
                    mText.setText(new String(buffer));
                }
                catch (IOException ex) {
                    return;
                }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ReadinputfromtheuserandPrintit")) {

                try { InputStream is = getAssets().open("o2.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Createafileandwritesomecontentintoit")) {

                try { InputStream is = getAssets().open("o3.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Implementationofopen()read()write()systemcalls")) {

                try { InputStream is = getAssets().open("o4.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("lseek()systemcall")) {

                try { InputStream is = getAssets().open("o5.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programthatcreateschildprocess")) {

                try { InputStream is = getAssets().open("o01.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Sendmessagefromparenttochild")) {

                try { InputStream is = getAssets().open("o02.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Parentprocessprints20-29andChildprocessprints0-9")) {

                try { InputStream is = getAssets().open("o03.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programtocreatethreads")) {

                try { InputStream is = getAssets().open("o6.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programtoshowtheracecondition")) {

                try { InputStream is = getAssets().open("o7.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programforprocesssynchronizationusinglocks")) {

                try { InputStream is = getAssets().open("o8.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programforprocesssynchronizationusingsemaphores")) {

                try { InputStream is = getAssets().open("o9.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("BankersAlgorithm")) {

                try { InputStream is = getAssets().open("o10.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("DinningPhilospher")) {

                try { InputStream is = getAssets().open("o11.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Deadlocksimulationusinglocksandthreads")) {

                try { InputStream is = getAssets().open("o12.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Inter-processcommunicationusingpipefunction")) {

                try { InputStream is = getAssets().open("o13.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Inter-processcommunicationusingpopen/pclosefunction")) {

                try { InputStream is = getAssets().open("o14.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programtocreateasharedmemorysegmentandwritesomecontentintoit")) {

                try { InputStream is = getAssets().open("o15.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Readswhateverwaswritteninthesharedmemorysegment")) {

                try { InputStream is = getAssets().open("o16.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }









        }
    }
}