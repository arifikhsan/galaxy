package com.example.android.galaxy;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jaychang.srv.SimpleCell;
import com.jaychang.srv.SimpleViewHolder;

/**
 * Created by Arif Ikhsanudin on Tuesday, 30 October 2018.
 */

public class GalaxyCell extends SimpleCell<Galaxy, GalaxyCell.ViewHolder> {

    public GalaxyCell(@NonNull Galaxy item) {
        super(item);
    }

    @Override
    protected int getLayoutRes() {
        return R.layout.model;
    }

    @NonNull
    @Override
    protected ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, @NonNull View cellView) {
        return new ViewHolder(cellView);
    }

    @Override
    protected void onBindViewHolder(@NonNull ViewHolder holder, int position, @NonNull Context context, Object payload) {
        holder.name.setText(getItem().getName());
        holder.description.setText(getItem().getDescription());
    }

    class ViewHolder extends SimpleViewHolder {
        TextView name, description;
        ViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_name);
            description = itemView.findViewById(R.id.tv_description);
        }
    }

}
