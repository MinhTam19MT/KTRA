package com.example.kt6_tam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Country> image_details = getListData();
        final ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new CustomListAdapter(this, image_details));

        // When the user clicks on the ListItem
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id) {
                Object o = listView.getItemAtPosition(position);
                Country country = (Country) o;
                Toast.makeText(MainActivity.this, "Selected :" + " " + country, Toast.LENGTH_LONG).show();
            }
        });
    }

    private  List<Country> getListData() {
        List<Country> list = new ArrayList<Country>();
        Country vn = new Country("Vietnam", "vn", 98000000);
        Country us = new Country("United States", "us", 320000000);
        Country ru = new Country("Russia", "ru", 142000000);
        Country phi = new Country("Philippines", "phi", 47881061);
        Country indo = new Country("Indonesia", "indo", 270630000);
        Country cam = new Country("Campuchia", "cam",17147484);
        Country sin = new Country("Singapore", "sin", 5939090);
        Country bru = new Country("Brunei", "bru", 445060);
        Country jan = new Country("Japan", "jan", 125627595);

        list.add(vn);
        list.add(us);
        list.add(ru);
        list.add(phi);
        list.add(indo);
        list.add(cam);
        list.add(sin);
        list.add(bru);
        list.add(jan);

        return list;
    }

}