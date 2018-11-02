package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * It is used for FAQ activity
 */
public class FaqActivity extends AppCompatActivity /*implements SearchView.OnQueryTextListener*/ {

    ExpandableListView expandableListView;
    ExpandableListAdapter expandableListAdapter;
    List<String> expandableListTitle;
    LinkedHashMap<String, List<String>> expandableListDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faq);

        expandableListView = (ExpandableListView) findViewById(R.id.expListViewfaq);
        expandableListDetail = new LinkedHashMap<String, List<String>>();

        List<String> q1 = new ArrayList<String>();
        q1.add(getResources().getString(getResources().getIdentifier("a1", "string", this.getPackageName())));
        List<String> q2 = new ArrayList<String>();
        q2.add(getResources().getString(getResources().getIdentifier("a2", "string", this.getPackageName())));
        List<String> q3 = new ArrayList<String>();
        q3.add(getResources().getString(getResources().getIdentifier("a3", "string", this.getPackageName())));
        List<String> q4 = new ArrayList<String>();
        q4.add(getResources().getString(getResources().getIdentifier("a4", "string", this.getPackageName())));
        List<String> q5 = new ArrayList<String>();
        q5.add(getResources().getString(getResources().getIdentifier("a5", "string", this.getPackageName())));
        List<String> q6 = new ArrayList<String>();
        q6.add(getResources().getString(getResources().getIdentifier("a6", "string", this.getPackageName())));
        List<String> q7 = new ArrayList<String>();
        q7.add(getResources().getString(getResources().getIdentifier("a7", "string", this.getPackageName())));
        List<String> q8 = new ArrayList<String>();
        q8.add(getResources().getString(getResources().getIdentifier("a8", "string", this.getPackageName())));

        expandableListDetail.put("How does AUTOSAR secure interoperability of solutions in the market", q1);
        expandableListDetail.put("What are the main drivers for the Adaptive Platform?", q2);
        expandableListDetail.put("When do I use the Classic Platform? When do I use the Adaptive Platform?", q3);
        expandableListDetail.put("How does AUTOSAR keep the standard up to date?", q4);
        expandableListDetail.put("Does AUTOSAR consider standardization of application interfaces, e.g. interface to brake-system?", q5);
        expandableListDetail.put("Migration: How does the integration of non-AUTOSAR compliant basic software work?", q6);
        expandableListDetail.put("What are the performance requirements on the controller to support an AUTOSAR ECU?", q7);
        expandableListDetail.put("Does AUTOSAR use existing standards?", q8);


        expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        expandableListAdapter = new CustomExpandableListAdapter(this, expandableListTitle, expandableListDetail);
        expandableListView.setAdapter(expandableListAdapter);
        expandableListView.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int groupPosition) {
            }
        });

        expandableListView.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
            }
        });
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.menu_search, menu);
//
//        MenuItem searchItem = menu.findItem(R.id.search);
//        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
//        searchView.setOnQueryTextListener(this);
//
//        return true;
//    }
//
//    @Override
//    public boolean onQueryTextSubmit(String query) {
//        // User pressed the search button
//        return false;
//    }
//
//    @Override
//    public boolean onQueryTextChange(String newText) {
//        // User changed the text
//        return false;
//    }
}