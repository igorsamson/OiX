package com.io.battleships;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.content.Context;
import android.view.LayoutInflater;


public class Adapter extends BaseAdapter {
	
	
	private Context ctx;
	
	public Adapter(Context ctx){
		this.ctx = ctx;
	}
 
    public int getCount() {
    return 0;
    }
 
    public Object getItem(int position) {
    return null;
    }
 
    public long getItemId(int position) {
    return 0;
    }
 
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        
        convertView = inflater.inflate(R.layout.opcje, parent, false);
     
        return convertView;
    }
 
}