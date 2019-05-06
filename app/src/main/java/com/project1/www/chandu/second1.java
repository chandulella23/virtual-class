package com.project1.www.chandu;

import android.content.res.AssetManager;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class second1 extends AppCompatActivity {

    Toolbar mtoolbar;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second1);
        mText = (TextView) findViewById(R.id.textView3);
            mText.setMaxLines(555);
            mText.setMovementMethod(ScrollingMovementMethod.getInstance());

            AssetManager assetManager = getAssets();

            mtoolbar = (Toolbar) findViewById(R.id.toolbar1);

            Bundle bundle = getIntent().getExtras();
            if (bundle != null) {
                mtoolbar.setTitle(bundle.getString("ProgrammsName"));
                if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("C:KeywordIdentifier")) {
                    // To load text file
                    try {
                        // get input stream for text
                        InputStream is = getAssets().open("c1.txt");
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

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("C:OperatorIdentifier")) {

                try { InputStream is = getAssets().open("c2.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("C:Firstofgrammar")) {

                try { InputStream is = getAssets().open("c3.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("C:SymbolTable")) {

                try { InputStream is = getAssets().open("c4.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:Email")) {

                try { InputStream is = getAssets().open("c5.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:FloatiingPoint")) {

                try { InputStream is = getAssets().open("c6.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:CountnumofVowelsandConsonants")) {

                try { InputStream is = getAssets().open("c7.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:Calculator")) {

                try { InputStream is = getAssets().open("c9.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:CountthenumofCommentlines")) {

                try { InputStream is = getAssets().open("c10.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:CountnumofPostiveandNegativeintegersandfractions")) {

                try { InputStream is = getAssets().open("c8.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:CountthenumofIdentifersinafile")) {

                try { InputStream is = getAssets().open("c11.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:Countthenumofwordslinesamdspaces")) {

                try { InputStream is = getAssets().open("c12.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:WhetherastatementisSimpleorCompound")) {

                try { InputStream is = getAssets().open("c13.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LEX:Replaceprintfandscanfwithreadfandwritef")) {

                try { InputStream is = getAssets().open("c14.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:ToevaluateArithmeticexpression")) {

                try { InputStream is = getAssets().open("c15.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:Letterfollowedbyadigit|letter")) {

                try { InputStream is = getAssets().open("c16.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:RecognisetheGrammar(anbwheren>=10)")) {

                try { InputStream is = getAssets().open("c18.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:ValidArithmeticexpressionthatusesoperator+,-,*,/")) {

                try { InputStream is = getAssets().open("c17.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:Heatandthermo")) {

                try { InputStream is = getAssets().open("c19.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("YACC:Paranthesis")) {

                try { InputStream is = getAssets().open("praenthesis.txt");
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
