package com.example.chatlistdesignrv_a2;

import android.content.Context;
import android.icu.text.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.text.SimpleDateFormat;
import java.util.Date;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class ContactChatAdapter extends RecyclerView.Adapter<ContactChatAdapter.MyViewHolder>{

    ArrayList<ContactChat> data;
    Context context;
    public ContactChatAdapter(Context c, ArrayList<ContactChat> receiveData) {
        data = receiveData;
        context = c;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_contact_chat_design, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ContactChat cc = data.get(position);
        holder.tvName.setText(cc.getName());
        holder.tvMsg.setText(cc.getMsg());
        holder.tvNotification.setText(cc.getNotification()+"");
        SimpleDateFormat df = new SimpleDateFormat("hh:mm");

        Date currentDate = cc.getTime(); // Assuming cc is a Calendar object
        holder.tvTime.setText(df.format(currentDate));

        if(cc.getNotification()==0)
        {
            holder.notification.setVisibility(View.INVISIBLE);
        }


        if(cc.getImgUrl().equals("amir"))
            holder.ivProfile.setImageResource(R.drawable.amir);
        else if(cc.getImgUrl().equals("shahrukh"))
            holder.ivProfile.setImageResource(R.drawable.shahrukh);
        else if(cc.getImgUrl().equals("salman"))
            holder.ivProfile.setImageResource(R.drawable.salman);
        else if(cc.getImgUrl().equals("imran"))
            holder.ivProfile.setImageResource(R.drawable.imran);


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView tvName, tvMsg, tvNotification, tvTime;
        ImageView ivProfile;
        CardView notification;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvName = itemView.findViewById(R.id.tvName);
            tvMsg = itemView.findViewById(R.id.tvMsg);
            tvNotification = itemView.findViewById(R.id.tvNotification);
            tvTime = itemView.findViewById(R.id.tvTime);
            ivProfile = itemView.findViewById(R.id.ivProfile);
            notification = itemView.findViewById(R.id.notification);

        }
    }

}
