package com.project1.www.chandu;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class second2 extends AppCompatActivity {

    Toolbar mtoolbar;
    TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second2);
        mText = (TextView) findViewById(R.id.textView3);


        AssetManager assetManager = getAssets();

        mtoolbar = (Toolbar) findViewById(R.id.toolbar2);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            mtoolbar.setTitle(bundle.getString("ProgrammsName"));
            if (mtoolbar.getTitle().toString().replaceAll("\\s+", "").equalsIgnoreCase("Arrays")) {
                // To load text file
                try {
                    // get input stream for text
                    InputStream is = getAssets().open("j1.txt");
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

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("JaggedArrays")) {

                try { InputStream is = getAssets().open("j2.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("MatrixArrays")) {

                try { InputStream is = getAssets().open("j3.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("ArrayList")) {

                try { InputStream is = getAssets().open("j4.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ConstructorChaining")) {

                try { InputStream is = getAssets().open("j5.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Useofthisandsuperkeywords")) {

                try { InputStream is = getAssets().open("j6.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Inheritance:derivedclassextendsbaseclass")) {

                try { InputStream is = getAssets().open("j7.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Inheritance")) {

                try { InputStream is = getAssets().open("j8.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Inheritance1")) {

                try { InputStream is = getAssets().open("j9.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Inheritance2")) {

                try { InputStream is = getAssets().open("j10.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("MethodOverriding")) {

                try { InputStream is = getAssets().open("j11.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("MethodOverloading")) {

                try { InputStream is = getAssets().open("j12.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Abstractclass")) {

                try { InputStream is = getAssets().open("j13.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("OuterandInnerclaases")) {

                try { InputStream is = getAssets().open("j14.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Anonymousclasss")) {

                try { InputStream is = getAssets().open("j15.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("MethodLoading")) {

                try { InputStream is = getAssets().open("j16.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Garbagecollectionscope")) {

                try { InputStream is = getAssets().open("j17.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Aggregation")) {

                try { InputStream is = getAssets().open("j18.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("InterfaceExample1")) {

                try { InputStream is = getAssets().open("j19.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("InterfaceExample2")) {

                try { InputStream is = getAssets().open("j20.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("InterfaceExampleusingfinalvariable")) {

                try { InputStream is = getAssets().open("j21.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("BasicJFrame")) {

                try { InputStream is = getAssets().open("j22.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("MyLabelusingJFrames")) {

                try { InputStream is = getAssets().open("j23.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll("\\s+","").equalsIgnoreCase("LayoutsUsingJFrames")) {

                try { InputStream is = getAssets().open("j24.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ActionListener")) {

                try { InputStream is = getAssets().open("j25.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("PrintHelloworldextendsApplet")) {

                try { InputStream is = getAssets().open("j26.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("SampleApplet")) {

                try { InputStream is = getAssets().open("j27.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("BasicJApplet")) {

                try { InputStream is = getAssets().open("j28.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }


            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Appletsimplementsinterface")) {

                try { InputStream is = getAssets().open("j29.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("CoonectiontoJDBC")) {

                try { InputStream is = getAssets().open("j30.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("SampleJDBCconnection")) {

                try { InputStream is = getAssets().open("j31.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("JDBCconncetionwithPreparedStatement")) {

                try { InputStream is = getAssets().open("j32.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("JDBCconnectionthroughbatches")) {

                try { InputStream is = getAssets().open("j33.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("CreateaLoginformusingJDBCconnection")) {

                try { InputStream is = getAssets().open("j34.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("AccessingFileproperties")) {

                try { InputStream is = getAssets().open("j35.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Readdatafromfile")) {

                try { InputStream is = getAssets().open("j36.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Writedataintofile")) {

                try { InputStream is = getAssets().open("j37.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("DatabaseMetadata")) {

                try { InputStream is = getAssets().open("j38.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("UseofPrintWriter")) {

                try { InputStream is = getAssets().open("j39.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Copyonefilecontentsintoanother")) {

                try { InputStream is = getAssets().open("j40.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Serializationconcept")) {

                try { InputStream is = getAssets().open("j41.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("LoginSerializationexample")) {

                try { InputStream is = getAssets().open("j42.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("PackagesConcept")) {

                try { InputStream is = getAssets().open("j43.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("TryCatchexamples")) {

                try { InputStream is = getAssets().open("j44.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("UseofThrowintryandcatchblock")) {

                try { InputStream is = getAssets().open("j45.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Useoffinallyintryandcatchblock")) {

                try { InputStream is = getAssets().open("j46.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ThreadOperations")) {

                try { InputStream is = getAssets().open("j47.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ThreadExamples")) {

                try { InputStream is = getAssets().open("j48.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ThreadApplet")) {

                try { InputStream is = getAssets().open("j49.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Synchronization")) {

                try { InputStream is = getAssets().open("j50.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("StringsConcept")) {

                try { InputStream is = getAssets().open("j51.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("ExamplesonStrings")) {

                try { InputStream is = getAssets().open("j52.txt");
                    int size = is.available();
                    byte[] buffer = new byte[size];
                    is.read(buffer);
                    is.close();
                    mText.setText(new String(buffer)); }
                catch (IOException ex) {  return; }
            }

            else if (mtoolbar.getTitle().toString().replaceAll(" ","").equalsIgnoreCase("Stringispallindromeornot")) {

                try { InputStream is = getAssets().open("j53.txt");
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