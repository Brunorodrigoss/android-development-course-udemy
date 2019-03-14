package com.brunorodrigo.cardview.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import com.brunorodrigo.cardview.R;
import com.brunorodrigo.cardview.adapter.PostAdapter;
import com.brunorodrigo.cardview.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPost;
    private List<Post> posts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPost = findViewById(R.id.recyclerView);

        // Set Layout
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        // Set orientation (vertical/horizontal) using LinearLayoutManager rather than RecyclerView.LayoutManager
        layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        recyclerViewPost.setLayoutManager(layoutManager);

        // Set Adapter
        this.buildPosts();
        PostAdapter adapter = new PostAdapter(posts);
        recyclerViewPost.setAdapter(adapter);
    }

    public void buildPosts(){
        addPost("Bruno Rodrigo", "Cool trip", R.drawable.imagem1);
        addPost("Talita Fernanda", "I love travel", R.drawable.imagem2);
        addPost("Andrew Pet", "#paris", R.drawable.imagem3);
        addPost("Tana Chris", "What a beautiful photo", R.drawable.imagem4);

    }

    public void addPost(String namePost, String textPost, int image) {
        Post post = new Post(namePost, textPost, image);
        this.posts.add(post);
    }
}
