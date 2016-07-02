package com.example.user.yogiyoproject;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.user.yogiyoproject.deliveryList.DeliveryFragment;
import com.example.user.yogiyoproject.tabView.ChickenTabView;
import com.example.user.yogiyoproject.tabView.ChinaFoodTabView;
import com.example.user.yogiyoproject.tabView.KoreaFoodTabView;
import com.example.user.yogiyoproject.tabView.SideFoodTabView;

public class SecondActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    SecondAdapter adapter;

    DeliveryFragment deliveryFragmentfragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tabLayout = (TabLayout) findViewById(R.id.second_tabLayout);

        viewPager = (ViewPager) findViewById(R.id.second_viewPager);

        adapter = new SecondAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.removeAllTabs();
        initTab();
    }

    public void initTab(){
        ChickenTabView chickenTabView= new ChickenTabView(getApplicationContext());
        tabLayout.addTab(tabLayout.newTab().setCustomView(chickenTabView),0);
        ChinaFoodTabView chinaFoodTabView = new ChinaFoodTabView(getApplicationContext());
        tabLayout.addTab(tabLayout.newTab().setCustomView(chinaFoodTabView),1);
        SideFoodTabView sideFoodTabView = new SideFoodTabView(getApplicationContext());
        tabLayout.addTab(tabLayout.newTab().setCustomView(sideFoodTabView),2);
        KoreaFoodTabView koreaFoodTabView = new KoreaFoodTabView(getApplicationContext());
        tabLayout.addTab(tabLayout.newTab().setCustomView(koreaFoodTabView),3);
    }
}
