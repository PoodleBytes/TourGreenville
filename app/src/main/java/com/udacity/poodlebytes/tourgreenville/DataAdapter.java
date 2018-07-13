package com.udacity.poodlebytes.tourgreenville;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * custom adapter and holder to bind data to recycler
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.Holder> {

    private LayoutInflater layoutInflater;
    private ArrayList<DataSchema> sDatabase;

    public DataAdapter(Context context, ArrayList<DataSchema> sDatabase){
        this.layoutInflater = LayoutInflater.from(context);
        this.sDatabase = sDatabase;
    }

    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int ViewType){
        View view = layoutInflater.inflate(R.layout.list_item, parent, false);
        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        final DataSchema currentItem = sDatabase.get(position);

        //Assign the values of your ArrayList to the assigned custom holder (defined below)
        holder.Name.setText(currentItem.getName());
        holder.Text.setText(currentItem.getText());
        holder.Image.setImageResource(currentItem.getImage());
        }

        //Returns your Array size
        @Override
        public int getItemCount() {
            return sDatabase.size();
        }

        //custom holder to store key values
        class Holder extends RecyclerView.ViewHolder {
            private TextView Name;
            private TextView Text;
            private ImageView Image;

            private Holder(View view) {
                super(view);
                Name = view.findViewById(R.id.name);
                Text = view.findViewById(R.id.text);
                Image = view.findViewById(R.id.image);
            }
        }
}
