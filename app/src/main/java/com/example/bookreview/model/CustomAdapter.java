package com.example.bookreview.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookreview.R;

import java.util.ArrayList;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.MyViewHolder> {
    Context context;
    ArrayList book_id, book_title, book_author, book_review;

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.my_row, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.book_id_txt.setText(String.valueOf(book_id.get(position)));
        holder.book_title_txt.setText(String.valueOf(book_title.get(position)));
        holder.book_author_txt.setText(String.valueOf(book_author.get(position)));
        holder.book_review_txt.setText(String.valueOf(book_review.get(position)));
    }

    @Override
    public int getItemCount() {
        return book_id.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView book_id_txt, book_title_txt, book_author_txt, book_review_txt;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            book_id_txt = itemView.findViewById(R.id.book_id_txt);
            book_author_txt = itemView.findViewById(R.id.book_author_txt);
            book_title_txt = itemView.findViewById(R.id.book_title_txt);
            book_review_txt = itemView.findViewById(R.id.book_review_txt);
        }
    }
}
