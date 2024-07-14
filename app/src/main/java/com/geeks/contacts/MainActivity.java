package com.geeks.contacts;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<>();
        items.add(new Item("Daphne Basset-Bridgerton", "daphne.basset@email.com", R.drawable.ic_daphne));
        items.add(new Item("Simon Basset", "sbasset@gmail.com", R.drawable.ic_simon));
        items.add(new Item("Queen Charlotte", "queen@email.com", R.drawable.ic_queen));
        items.add(new Item("Penelope Bridgerton", "pen.bridgerton@hot.com", R.drawable.ic_penelope));
        items.add(new Item("Eloise Bridgerton", "el.bridgerton@email.com", R.drawable.ic_eloise));
        items.add(new Item("Colin Bridgerton", "colin.123@gmail.com", R.drawable.ic_colin));
        items.add(new Item("Anthony Bridgerton", "anthony.bridgerton@email.com", R.drawable.ic_antony));
        items.add(new Item("Daphne Basset-Bridgerton", "daphne.basset@email.com", R.drawable.ic_daphne));
        items.add(new Item("Simon Basset", "sbasset@gmail.com", R.drawable.ic_simon));
        items.add(new Item("Queen Charlotte", "queen@email.com", R.drawable.ic_queen));
        items.add(new Item("Penelope Bridgerton", "pen.bridgerton@hot.com", R.drawable.ic_penelope));
        items.add(new Item("Eloise Bridgerton", "el.bridgerton@email.com", R.drawable.ic_eloise));
        items.add(new Item("Colin Bridgerton", "colin.123@gmail.com", R.drawable.ic_colin));
        items.add(new Item("Anthony Bridgerton", "anthony.bridgerton@email.com", R.drawable.ic_antony));
        items.add(new Item("Daphne Basset-Bridgerton", "daphne.basset@email.com", R.drawable.ic_daphne));
        items.add(new Item("Simon Basset", "sbasset@gmail.com", R.drawable.ic_simon));
        items.add(new Item("Queen Charlotte", "queen@email.com", R.drawable.ic_queen));
        items.add(new Item("Penelope Bridgerton", "pen.bridgerton@hot.com", R.drawable.ic_penelope));
        items.add(new Item("Eloise Bridgerton", "el.bridgerton@email.com", R.drawable.ic_eloise));
        items.add(new Item("Colin Bridgerton", "colin.123@gmail.com", R.drawable.ic_colin));
        items.add(new Item("Anthony Bridgerton", "anthony.bridgerton@email.com", R.drawable.ic_antony));

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}