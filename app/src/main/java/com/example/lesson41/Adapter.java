package com.example.lesson41;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Model_of_Continet> list = new ArrayList<>();
    Listener listener;

    public void setListener(Listener listener) {
        this.listener = listener;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_of_contenet, parent, false));
    }

    public void onClick(Listener listener){

    }

    public void setList(ArrayList<Model_of_Continet> list) {
        this.list.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.africa);
            textView = itemView.findViewById(R.id.good);
        }

        public void onBind(Model_of_Continet model_of_continet) {
            imageView.setImageResource(model_of_continet.getFlagOfContinent());
            textView.setText(model_of_continet.getNameOfContinent());
            itemView.setOnClickListener(v -> {
                listener.OnClick(model_of_continet);
            });

        }
    }
}
