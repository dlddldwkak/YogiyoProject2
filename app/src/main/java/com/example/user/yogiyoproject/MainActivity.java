package com.example.user.yogiyoproject;

import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.FrameLayout;

import com.example.user.yogiyoproject.categoty.CategoryFragment;

public class MainActivity extends AppCompatActivity {

    CategoryFragment myfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myfragment = new CategoryFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.add(R.id.main_container, myfragment);
        ft.commit();
    }
}
