package com.example.bookreview.model;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bookreview.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BookViewHolder> {

    List<Volume> bookList = null;

    public BooksAdapter(List<Volume> bookList) {
        this.bookList = bookList;
    }

    public void setBookList(List<Volume> bookList) {
        this.bookList = bookList;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        int layoutId = R.layout.item_row_book;
        View view = inflater.inflate(layoutId, parent, false);
        BookViewHolder bookViewHolder = new BookViewHolder(view);
        return bookViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BookViewHolder holder, int position) {
        holder.tvTitle.setText(bookList.get(position).getVolumeInfo().getTitle());
        Picasso.get()
                .load(bookList.get(position).getVolumeInfo().getImageLinks())
                .into(holder.ivThumbnail);
    }

    @Override
    public int getItemCount() {
        return (bookList != null) ? bookList.size() : 0;
    }

    public class BookViewHolder extends RecyclerView.ViewHolder{
        TextView tvTitle;
        ImageView ivThumbnail;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = (TextView) itemView.findViewById(R.id.tvTitle);
            ivThumbnail = (ImageView) itemView.findViewById(R.id.ivThumbnail);
        }
    }
}
