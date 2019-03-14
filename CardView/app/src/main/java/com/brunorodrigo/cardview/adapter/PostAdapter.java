package com.brunorodrigo.cardview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.brunorodrigo.cardview.R;
import com.brunorodrigo.cardview.model.Post;

import java.util.List;

/**
 * Created by bruno.soares on 3/13/19.
 */
public class PostAdapter extends RecyclerView.Adapter<PostAdapter.MyViewHolder> {

    private List<Post> postList;

    public PostAdapter(List<Post> posts) {
        this.postList = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View listItem = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.details_post,
                        viewGroup,
                        false);

        return  new MyViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(postList.get(i).getName());
        myViewHolder.image.setImageResource(postList.get(i).getImage());
        myViewHolder.post.setText(postList.get(i).getPost());
    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        private TextView name;
        private TextView post;
        private ImageView image;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.textViewNamePost);
            post = itemView.findViewById(R.id.textViewTextPost);
            image = itemView.findViewById(R.id.imageViewPost);
        }
    }
}
