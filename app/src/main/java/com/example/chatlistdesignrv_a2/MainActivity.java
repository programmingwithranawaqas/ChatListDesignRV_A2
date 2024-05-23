package com.example.chatlistdesignrv_a2;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    RecyclerView rvContactChat;
    ContactChatAdapter adapter;

    ArrayList<ContactChat> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Date today = new Date();

        data = new ArrayList<>();
        // String imgUrl, String name, String msg, int notification, Date time, boolean status

        data.add(new ContactChat("shahrukh", "Shahrukh Khan","Hi, How are you?", 2, today, true));
        data.add(new ContactChat("salman", "Salman Khan","Hi, I am not fine", 0, today, false));
        data.add(new ContactChat("amir", "Amir Khan","Pappar kha ri ho?", 22, today, true));
        data.add(new ContactChat("imran", "Imran Khan","Ghabrana nahi hai", 0, today, false));

        rvContactChat = findViewById(R.id.rvContactChat);
        rvContactChat.setLayoutManager(new LinearLayoutManager(MainActivity.this));
        adapter = new ContactChatAdapter(MainActivity.this, data);
        rvContactChat.setAdapter(adapter);
    }
}