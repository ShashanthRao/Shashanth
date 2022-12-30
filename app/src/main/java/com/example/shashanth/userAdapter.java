package com.example.shashanth;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userHolder> {
    postLogin postLogin;
    List<userModel> allUsersList;
    public userAdapter(postLogin postLogin, List<userModel> allUsersList) {
this.postLogin = postLogin;
this.allUsersList = allUsersList;
    }

    @NonNull
    @Override
    public userHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new userHolder(LayoutInflater.from(postLogin).inflate(R.layout.item_user,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull userHolder holder, int position) {
holder.itemTxt.setText(allUsersList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return allUsersList.size();
    }

    class userHolder extends RecyclerView.ViewHolder{
        TextView itemTxt;

        public userHolder(@NonNull View itemView) {
            super(itemView);
            itemTxt = itemView.findViewById(R.id.itemTxt);
        }
    }
}
