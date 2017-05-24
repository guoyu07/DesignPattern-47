package com.cjf.designpattern.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.cjf.designpattern.R;

import java.util.List;

/**
 * Created by chenjifang on 2017/4/12.
 */

public class CircleMenuAdapter extends BaseAdapter {
    private List<MenuItem> mMenuItems;

    public CircleMenuAdapter(List<MenuItem> menuItems) {
        mMenuItems = menuItems;
    }

    public int getCount() {
        return mMenuItems.size();
    }

    @Override
    public MenuItem getItem(int i) {
        return mMenuItems.get(i);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        LayoutInflater mInflater = LayoutInflater.from(viewGroup.getContext());
        View itemView = mInflater.inflate(R.layout.circle_menu_item, viewGroup, false);
        initMenuItem(itemView, i);
        return itemView;

    }

    private void initMenuItem(View itemView, int i) {
        final MenuItem item = getItem(i);
        ImageView iv = (ImageView) itemView.findViewById(R.id.item_iv);
        TextView tv = (TextView) itemView.findViewById(R.id.item_tv);
        iv.setImageResource(item.imageId);
        tv.setText(item.title);
    }
}
