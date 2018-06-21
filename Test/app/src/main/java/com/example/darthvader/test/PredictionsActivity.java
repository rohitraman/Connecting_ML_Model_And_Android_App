package com.example.darthvader.test;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class PredictionsActivity extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_predictions);
        listView = findViewById(R.id.listView);
        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);
    }
}

class CustomAdapter extends BaseAdapter
{

    @Override
    public int getCount() {
        return MainActivity.probabilities.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview_item,viewGroup,false);
        TextView descriptions = view.findViewById(R.id.tv_description);
        TextView labels = view.findViewById(R.id.tv_label);
        TextView probabilities = view.findViewById(R.id.tv_probability);
        descriptions.setText(MainActivity.descriptions.get(i));
        labels.setText(MainActivity.labels.get(i));
        probabilities.setText(MainActivity.probabilities.get(i));
        return view;

    }
}
