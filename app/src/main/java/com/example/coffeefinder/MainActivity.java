package com.example.coffeefinder;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        String [] coffeeShop = {"Starbucks", "Grind House Coffee", "Barefoot Beach House", "Southie Coffee"};
        setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, coffeeShop));

    }
    protected void onListItemClick(ListView l, View v,int position, long id){
        switch(position){
            case 0:
                startActivity(new Intent(MainActivity.this, Starbucks.class));
                break;
            case 1:
                startActivity(new Intent(MainActivity.this, GrindHouseCoffee.class));
                break;
            case 2:
                startActivity(new Intent(MainActivity.this, BarefootBeachHouse.class));
                break;
            case 3:
                startActivity(new Intent(MainActivity.this, SouthieCoffee.class));
                break;
        }
    }

}
