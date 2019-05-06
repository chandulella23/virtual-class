package com.project1.www.chandu;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class second0 extends AppCompatActivity {

    Toolbar mtoolbar;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second0);
        mText = (TextView) findViewById(R.id.textView3);
        mText.setMaxLines(555);
        mText.setMovementMethod(ScrollingMovementMethod.getInstance());

        AssetManager assetManager = getAssets();

        mtoolbar = (Toolbar) findViewById(R.id.toolbar1);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mtoolbar.setTitle(bundle.getString("ProgrammsName"));
            if (mtoolbar.getTitle().toString().replaceAll("\\s+", "").equalsIgnoreCase("PrintHelloandAddtwonumbers")) {
                // To load text file
                try {
                    // get input stream for text
                    InputStream is = getAssets().open("1.txt");
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
                } catch (IOException ex) {
                    return;
                }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("Calculatetheareaofsquare")) {

                try { InputStream is = getAssets().open("2.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("FindGreatestin3numbers")) {

                try { InputStream is = getAssets().open("3.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("Calculatesumof5subjectsandfindpercentage")) {

                try { InputStream is = getAssets().open("4.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Checkwhetherthenumberisevenornot")) {

                try { InputStream is = getAssets().open("5.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Checkwhetherthenumberisprimeornot")) {

                try { InputStream is = getAssets().open("6.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("CheckwhetherthenumisPallindromeornot")) {

                try { InputStream is = getAssets().open("7.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("PrintFirst10naturalnumbers")) {

                try { InputStream is = getAssets().open("8.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("FibonacciSeries")) {

                try { InputStream is = getAssets().open("9.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Factorialofanumber")) {

                try { InputStream is = getAssets().open("10.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Reverseanumber")) {

                try { InputStream is = getAssets().open("11.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Findthesmallestelementinanarray")) {

                try { InputStream is = getAssets().open("12.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Findthelargestelementinanarray")) {

                try { InputStream is = getAssets().open("13.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Revaerseanarray")) {

                try { InputStream is = getAssets().open("14.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Copyallelementsofanarraytoanotherarray")) {

                try { InputStream is = getAssets().open("15.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Insertelementinanarray")) {

                try { InputStream is = getAssets().open("16.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Deleteanelementfromspecifiedlocationinanarray")) {

                try { InputStream is = getAssets().open("17.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LinearSerach")) {

                try { InputStream is = getAssets().open("18.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("BinarySearch")) {

                try { InputStream is = getAssets().open("19.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Arrangeelementsinanorderinanarray")) {

                try { InputStream is = getAssets().open("20.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Addtwoarrays")) {

                try { InputStream is = getAssets().open("21.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("PrintSquareofeachelementin2Darray")) {

                try { InputStream is = getAssets().open("22.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("WorkingofPointers")) {

                try { InputStream is = getAssets().open("23.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("AccessArrayElementsUsingPointers")) {

                try { InputStream is = getAssets().open("24.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programtofindthesumofsixnumberswitharraysandpointers")) {

                try { InputStream is = getAssets().open("25.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ProgramtoSwapElementsUsingCallbyReference")) {

                try { InputStream is = getAssets().open("26.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("UsingCmalloc()andfree()")) {

                try { InputStream is = getAssets().open("27.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("UsingCcalloc()andfree()")) {

                try { InputStream is = getAssets().open("28.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Usingrealloc()")) {

                try { InputStream is = getAssets().open("29.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("FindLargestElementUsingDynamicMemoryAllocation-calloc()")) {

                try { InputStream is = getAssets().open("30.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("howtoreadstringfromterminal")) {

                try { InputStream is = getAssets().open("31.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("readlineoftextcharacterbycharacter")) {

                try { InputStream is = getAssets().open("32.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("readlineoftextusinggets()andputs()")) {

                try { InputStream is = getAssets().open("33.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("PassingStringstoFunctions")) {

                try { InputStream is = getAssets().open("34.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("FindtheFrequencyofCharacters")) {

                try { InputStream is = getAssets().open("35.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programtocountvowels,consonants")) {

                try { InputStream is = getAssets().open("36.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("CalculateLengthofStringwithoutUsingstrlen()Function")) {

                try { InputStream is = getAssets().open("37.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ConcatenateTwoStringsWithoutUsingstrcat()")) {

                try { InputStream is = getAssets().open("38.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("RemoveCharactersinStringExceptAlphabets")) {

                try { InputStream is = getAssets().open("39.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("StoreInformationandDisplayitUsingStructure")) {

                try { InputStream is = getAssets().open("40.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Programtoaddtwodistancesininch-feetsystem")) {

                try { InputStream is = getAssets().open("41.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("StoreInformationinStructureandDisplayit")) {

                try { InputStream is = getAssets().open("42.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("DemonstratetheDynamicMemoryAllocationforStructure")) {

                try { InputStream is = getAssets().open("43.txt");
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