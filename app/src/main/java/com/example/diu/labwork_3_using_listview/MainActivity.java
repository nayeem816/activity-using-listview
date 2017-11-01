package com.example.diu.labwork_3_using_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    LinearLayout l1,l2,l3,l4,l5,l6,l7,l8,l9;
    ListView lv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = (LinearLayout) findViewById(R.id.layout1);
        l2 = (LinearLayout) findViewById(R.id.layout2);
        l3 = (LinearLayout) findViewById(R.id.layout3);
        l4 = (LinearLayout) findViewById(R.id.layout4);
        l5 = (LinearLayout) findViewById(R.id.layout5);
        l6 = (LinearLayout) findViewById(R.id.layout6);
        l7 = (LinearLayout) findViewById(R.id.layout7);
        l8 = (LinearLayout) findViewById(R.id.layout8);
        l9 = (LinearLayout) findViewById(R.id.layout9);
        lv = (ListView) findViewById(R.id.lvid);



        final String[] name = {"Dhaka","Chittagong", "Rajshahi", "Barishal","Mymensingh","Khulna","Sylhet","Rangpur"};

        ArrayAdapter adapter = new ArrayAdapter(this,R.layout.lvlayout,R.id.txtid,name);
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "Situated in " + name[i], Toast.LENGTH_LONG).show();

                if (l1.getVisibility() == View.VISIBLE && name[i] == "Dhaka"){
                    l1.setVisibility(View.GONE);
                    l2.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Chittagong"){
                    l1.setVisibility(View.GONE);
                    l3.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Rajshahi"){
                    l1.setVisibility(View.GONE);
                    l4.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Barishal"){
                    l1.setVisibility(View.GONE);
                    l5.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Mymensingh"){
                    l1.setVisibility(View.GONE);
                    l6.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Khulna"){
                    l1.setVisibility(View.GONE);
                    l7.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Sylhet"){
                    l1.setVisibility(View.GONE);
                    l8.setVisibility(View.VISIBLE);
                }
                else if(l1.getVisibility() == View.VISIBLE && name[i] == "Rangpur"){
                    l1.setVisibility(View.GONE);
                    l9.setVisibility(View.VISIBLE);
                }



            }
        });

    }

    public void image(View view){
        Toast.makeText(getApplicationContext(), "Bangladesh", Toast.LENGTH_LONG).show();
    }
    public void dhakabutton(View view) {
        if(l2.getVisibility() == View.VISIBLE){
            l2.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }

    public void chittagongbutton(View view) {
        if(l3.getVisibility() == View.VISIBLE){
            l3.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }
    public void rajshahibutton(View view) {
        if(l4.getVisibility() == View.VISIBLE){
            l4.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }
    public void barishalbutton(View view) {
        if(l5.getVisibility() == View.VISIBLE){
            l5.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }
    public void mymensinghbutton(View view) {
        if(l6.getVisibility() == View.VISIBLE){
            l6.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }
    public void khulnabutton(View view) {
        if(l7.getVisibility() == View.VISIBLE){
            l7.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }
    public void sylhetbutton(View view) {
        if(l8.getVisibility() == View.VISIBLE){
            l8.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }
    public void rangpurbutton(View view) {
        if(l9.getVisibility() == View.VISIBLE){
            l9.setVisibility(View.GONE);
            l1.setVisibility(View.VISIBLE);

        }

    }

}
