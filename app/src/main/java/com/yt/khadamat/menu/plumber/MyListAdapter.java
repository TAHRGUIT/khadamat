package com.yt.khadamat.menu.plumber;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.recyclerview.widget.RecyclerView;

import com.yt.khadamat.Profile;
import com.yt.khadamat.R;

import java.io.ByteArrayOutputStream;


public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.ViewHolder>{
    private MyListData[] listdata;

    public MyListAdapter(MyListData[] listdata) {
        this.listdata = listdata;
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View listItem= layoutInflater.inflate(R.layout.list_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(listItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final MyListData myListData = listdata[position];
        holder.name.setText(listdata[position].getNom());
        holder.address.setText(listdata[position].getAddress());
        holder.photoP.setImageResource(listdata[position].getImgId());
        holder.linearlayout.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
            @Override
            public void onClick(View view) {


                Toast.makeText(view.getContext(),"click on item: "+myListData.getNom(),Toast.LENGTH_SHORT).show();
                Intent profile = new Intent(view.getContext(),Profile.class);
                profile.putExtra("Name", holder.name.getText().toString());
                profile.putExtra("Address", holder.address.getText().toString());
                view.getContext().startActivity(profile);
            }
        });
    }


    @Override
    public int getItemCount() {
        return listdata.length;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView photoP;
        public TextView name, address;
        public LinearLayout linearlayout;
        public ViewHolder(View itemView) {
            super(itemView);
            this.photoP = itemView.findViewById(R.id.imageView);
            this.name = itemView.findViewById(R.id.name);
            this.address = itemView.findViewById(R.id.address);
            linearlayout = itemView.findViewById(R.id.linearlayout);
        }
    }
}