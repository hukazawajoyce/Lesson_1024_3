package com.hukazawa.user.lesson_1024_3;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.widget.ArrayAdapter;
        import android.widget.SimpleAdapter;
        import android.widget.Spinner;

        import java.util.ArrayList;
        import java.util.HashMap;
        import java.util.Map;

public class MainActivity extends AppCompatActivity {

    Spinner spinner;
    Spinner spinner2;
    String color[] = {"RED","BLUE","PUPLE","BLACK"};
    String products[] = {"GreenTea","BlackTea","LemonTea"};
    String prices[] = {"10","15","20"};
    ArrayAdapter<String> adapter;
    ArrayList<Map<String,String>> newlist;
    SimpleAdapter adapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(MainActivity.this,
                android.R.layout.simple_spinner_item,color);
        spinner.setAdapter(adapter);

        //Simple Adapter****************************
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        newlist = new ArrayList<>();
        for (int i =0 ; i<products.length ;i++)
        {
            HashMap<String,String> m1 = new HashMap<>();
            m1.put("Product",products[i]);
            m1.put("Price",prices[i]);
            newlist.add(m1);
        }
        /*HashMap<String,String> m1 = new HashMap<>();
        m1.put("Product","GreenTea");
        m1.put("Price","10");
        newlist.add(m1);
        HashMap<String,String> m2 = new HashMap<>();
        m2.put("Product","BlackTea");
        m2.put("Price","15");
        newlist.add(m2);
        HashMap<String,String> m3 = new HashMap<>();
        m3.put("Product","LemonTea");
        m3.put("Price","20");
        newlist.add(m3);*/
        adapter2 = new SimpleAdapter(MainActivity.this,
                                     newlist,
                                     /*android.R.layout.simple_list_item_2,*/
                                     R.layout.newadapter,
                                     new String[]{"Product","Price"},
                                     /*new int[]{android.R.id.text1,android.R.id.text2}*/
                                     new int[]{R.id.product,R.id.prince});
        spinner2.setAdapter(adapter2);



    }
}
