package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word>words=new ArrayList<Word>();
        words.add(new Word("Lutti", "One"));
        words.add(new Word("Otiiko", "Two"));
        words.add(new Word("Tolookosu", "Three"));
        words.add(new Word("Oyyisa", "Four"));
        words.add(new Word("massakka", "Five"));
        words.add(new Word("temmokka", "Six"));
        words.add(new Word("kenekaku", "Seven"));
        words.add(new Word("kawinta", "Eight"));
        words.add(new Word("wo´e", "Nine"));
        words.add(new Word("na´aacha", "Ten"));

        WordAdapter wordAdapter = new WordAdapter(this, words);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(wordAdapter);

    }
}