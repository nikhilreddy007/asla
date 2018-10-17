package com.example.nikhilreddy.ass;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SearchView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * it is used for arcticles
 */
public class ArticlesActivity extends AppCompatActivity implements SearchView.OnQueryTextListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_articles);

        final ArrayList<Link> generalList = new ArrayList<>();

        generalList.add(new Link(1,"Official Website","https://www.autosar.org/"));
        generalList.add(new Link(2,"AUTOSAR Introduction","https://youtu.be/t9ajj5aCnZM"));
        generalList.add(new Link(3,"AUTOSAR Overview","https://youtu.be/F27jtKkxbAo"));
        generalList.add(new Link(4,"AUTOSAR Architecture","https://youtu.be/gDAvlw-FYZY"));
        generalList.add(new Link(5,"Diagnostic Modules","https://youtu.be/slXtWnwI7P8"));
        generalList.add(new Link(6,"Interview Questions","https://youtu.be/LdZIic1fIfc"));
        generalList.add(new Link(7,"AUTOSAR COMM Stack","https://youtu.be/XEI9ZH3rRz8"));
        generalList.add(new Link(8,"AUTOSAR CAN","https://youtu.be/s74lrGd5xf4"));
        generalList.add(new Link(9,"AUTOSAR PDU's","https://youtu.be/uA0E4zXjkqI"));
        generalList.add(new Link(10,"AUTOSAR OS","https://youtu.be/9GDX-IyZ_C8"));

        ListView listView = (ListView) findViewById(R.id.articles_list_view);
        ArticleAdapter articleAdapter = new ArticleAdapter(ArticlesActivity.this,generalList,R.color.white);
        listView.setAdapter(articleAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Link currentLink = generalList.get(i);
                String pressedUrl = currentLink.getLink();
                openWebPage(pressedUrl);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_search, menu);

        MenuItem searchItem = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
        searchView.setOnQueryTextListener(this);

        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        // User pressed the search button
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        // User changed the text
        return false;
    }

    /**
     * it is used for opening the web page in the articles
     * @param url
     */
    public void openWebPage(String url) {
        Uri webpage = Uri.parse(url);
        Intent intent = new Intent(Intent.ACTION_VIEW, webpage);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
