package com.example.suhail.json101.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.suhail.json101.Model.info;
import com.example.suhail.json101.R;

import java.util.List;

/**
 * Created by Suhail on 8/15/2017.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<info> info_rec;
    private int rowLayout;
    private Context context;


    //<!----------------------------------------------

    //receiving data
    public MyAdapter(List<info> info_rec, int rowLayout, Context context) {
        this.info_rec = info_rec;
        this.rowLayout = rowLayout;
        this.context = context;
    }
    //----------------------------------------------------!>

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(rowLayout, parent, false);

        return new MyViewHolder(view);


    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        //<<!------------------------------------------------
        //placing data

        int index=position+1;
        holder.itemno.setText("\nItem No : " + (index));
        holder.id.setText("id: " + info_rec.get(position).getId());
        holder.name.setText("name: " + info_rec.get(position).getName());
        holder.authority.setText("authority: " + info_rec.get(position).getAuthority());
        holder.level.setText("level: " + info_rec.get(position).getLevel());
        holder.post.setText("post: " + info_rec.get(position).getPost());
        holder.imageLink.setText("imageLink: " + info_rec.get(position).getImageLink());
        holder.username.setText("username: " + info_rec.get(position).getUsername());
        holder.password.setText("password: " + info_rec.get(position).getPassword());
        holder.phone.setText("phone: " + info_rec.get(position).getPhone());
        holder.email.setText("email: " + info_rec.get(position).getEmail());
        holder.hideid.setText("hideid: " + info_rec.get(position).getHideid());
        holder.firstLoginDatetime.setText("firstLoginDatetime: " + info_rec.get(position).getFirstLoginDatetime());
        holder.lastLoginDatetime.setText("lastLoginDatetime: " + info_rec.get(position).getLastLoginDatetime());
        holder.lastLoginIp.setText("lastLoginIp: " + info_rec.get(position).getLastLoginIp());
//----------------------------------------------------------!>

    }

    @Override
    public int getItemCount() {
        return info_rec.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView itemno;
        TextView id;
        TextView name;
        TextView authority;
        TextView level;
        TextView post;
        TextView imageLink;
        TextView username;
        TextView password;
        TextView phone;
        TextView email;
        TextView teacher;
        TextView hideid;
        TextView firstLoginDatetime;
        TextView lastLoginDatetime;
        TextView lastLoginIp;
        public MyViewHolder(View view) {

            super(view);

//<!--------------------------------
  //binding all view
            itemno = (TextView) view.findViewById(R.id.item_no);
            id = (TextView) view.findViewById(R.id.One);
            name = (TextView) view.findViewById(R.id.Two);
            authority = (TextView) view.findViewById(R.id.three);
            level = (TextView) view.findViewById(R.id.four);
            post = (TextView) view.findViewById(R.id.five);
            imageLink = (TextView) view.findViewById(R.id.six);
            username = (TextView) view.findViewById(R.id.seven);
            password = (TextView) view.findViewById(R.id.eight);
            phone = (TextView) view.findViewById(R.id.nine);
            email = (TextView) view.findViewById(R.id.tenth);
            teacher = (TextView) view.findViewById(R.id.eleven);
            hideid = (TextView) view.findViewById(R.id.twelve);
            firstLoginDatetime = (TextView) view.findViewById(R.id.thirteen);
            lastLoginDatetime = (TextView) view.findViewById(R.id.forteen);
            lastLoginIp = (TextView) view.findViewById(R.id.fifteen);

//---------------------------------------------------!>
        }
    }
}
