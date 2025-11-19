package com.example.universityclubs;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import android.content.Intent;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView clubListView;
    FloatingActionButton chatbotButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clubListView = findViewById(R.id.clubListView);
        chatbotButton = findViewById(R.id.chatbotButton);

        ArrayList<Club> clubs = new ArrayList<>();
        clubs.add(new Club("Club 1","Description for Club 1: Activities, events and membership details.","President 1 Name","+91-9100000001", R.drawable.club_1));
        clubs.add(new Club("Club 2","Description for Club 2: Activities, events and membership details.","President 2 Name","+91-9100000002", R.drawable.club_2));
        clubs.add(new Club("Club 3","Description for Club 3: Activities, events and membership details.","President 3 Name","+91-9100000003", R.drawable.club_3));
        clubs.add(new Club("Club 4","Description for Club 4: Activities, events and membership details.","President 4 Name","+91-9100000004", R.drawable.club_4));
        clubs.add(new Club("Club 5","Description for Club 5: Activities, events and membership details.","President 5 Name","+91-9100000005", R.drawable.club_5));
        clubs.add(new Club("Club 6","Description for Club 6: Activities, events and membership details.","President 6 Name","+91-9100000006", R.drawable.club_6));
        clubs.add(new Club("Club 7","Description for Club 7: Activities, events and membership details.","President 7 Name","+91-9100000007", R.drawable.club_7));
        clubs.add(new Club("Club 8","Description for Club 8: Activities, events and membership details.","President 8 Name","+91-9100000008", R.drawable.club_8));
        clubs.add(new Club("Club 9","Description for Club 9: Activities, events and membership details.","President 9 Name","+91-9100000009", R.drawable.club_9));
        clubs.add(new Club("Club 10","Description for Club 10: Activities, events and membership details.","President 10 Name","+91-9100000010", R.drawable.club_10));
        clubs.add(new Club("Club 11","Description for Club 11: Activities, events and membership details.","President 11 Name","+91-9100000011", R.drawable.club_11));
        clubs.add(new Club("Club 12","Description for Club 12: Activities, events and membership details.","President 12 Name","+91-9100000012", R.drawable.club_12));
        clubs.add(new Club("Club 13","Description for Club 13: Activities, events and membership details.","President 13 Name","+91-9100000013", R.drawable.club_13));
        clubs.add(new Club("Club 14","Description for Club 14: Activities, events and membership details.","President 14 Name","+91-9100000014", R.drawable.club_14));
        clubs.add(new Club("Club 15","Description for Club 15: Activities, events and membership details.","President 15 Name","+91-9100000015", R.drawable.club_15));
        clubs.add(new Club("Club 16","Description for Club 16: Activities, events and membership details.","President 16 Name","+91-9100000016", R.drawable.club_16));
        clubs.add(new Club("Club 17","Description for Club 17: Activities, events and membership details.","President 17 Name","+91-9100000017", R.drawable.club_17));
        clubs.add(new Club("Club 18","Description for Club 18: Activities, events and membership details.","President 18 Name","+91-9100000018", R.drawable.club_18));
        clubs.add(new Club("Club 19","Description for Club 19: Activities, events and membership details.","President 19 Name","+91-9100000019", R.drawable.club_19));
        clubs.add(new Club("Club 20","Description for Club 20: Activities, events and membership details.","President 20 Name","+91-9100000020", R.drawable.club_20));
        clubs.add(new Club("Club 21","Description for Club 21: Activities, events and membership details.","President 21 Name","+91-9100000021", R.drawable.club_21));
        clubs.add(new Club("Club 22","Description for Club 22: Activities, events and membership details.","President 22 Name","+91-9100000022", R.drawable.club_22));
        clubs.add(new Club("Club 23","Description for Club 23: Activities, events and membership details.","President 23 Name","+91-9100000023", R.drawable.club_23));
        clubs.add(new Club("Club 24","Description for Club 24: Activities, events and membership details.","President 24 Name","+91-9100000024", R.drawable.club_24));
        clubs.add(new Club("Club 25","Description for Club 25: Activities, events and membership details.","President 25 Name","+91-9100000025", R.drawable.club_25));
        clubs.add(new Club("Club 26","Description for Club 26: Activities, events and membership details.","President 26 Name","+91-9100000026", R.drawable.club_26));
        clubs.add(new Club("Club 27","Description for Club 27: Activities, events and membership details.","President 27 Name","+91-9100000027", R.drawable.club_27));
        clubs.add(new Club("Club 28","Description for Club 28: Activities, events and membership details.","President 28 Name","+91-9100000028", R.drawable.club_28));
        clubs.add(new Club("Club 29","Description for Club 29: Activities, events and membership details.","President 29 Name","+91-9100000029", R.drawable.club_29));
        clubs.add(new Club("Club 30","Description for Club 30: Activities, events and membership details.","President 30 Name","+91-9100000030", R.drawable.club_30));
        clubs.add(new Club("Club 31","Description for Club 31: Activities, events and membership details.","President 31 Name","+91-9100000031", R.drawable.club_31));
        clubs.add(new Club("Club 32","Description for Club 32: Activities, events and membership details.","President 32 Name","+91-9100000032", R.drawable.club_32));
        clubs.add(new Club("Club 33","Description for Club 33: Activities, events and membership details.","President 33 Name","+91-9100000033", R.drawable.club_33));
        clubs.add(new Club("Club 34","Description for Club 34: Activities, events and membership details.","President 34 Name","+91-9100000034", R.drawable.club_34));
        clubs.add(new Club("Club 35","Description for Club 35: Activities, events and membership details.","President 35 Name","+91-9100000035", R.drawable.club_35));
        clubs.add(new Club("Club 36","Description for Club 36: Activities, events and membership details.","President 36 Name","+91-9100000036", R.drawable.club_36));
        clubs.add(new Club("Club 37","Description for Club 37: Activities, events and membership details.","President 37 Name","+91-9100000037", R.drawable.club_37));
        clubs.add(new Club("Club 38","Description for Club 38: Activities, events and membership details.","President 38 Name","+91-9100000038", R.drawable.club_38));
        clubs.add(new Club("Club 39","Description for Club 39: Activities, events and membership details.","President 39 Name","+91-9100000039", R.drawable.club_39));
        clubs.add(new Club("Club 40","Description for Club 40: Activities, events and membership details.","President 40 Name","+91-9100000040", R.drawable.club_40));

        ClubAdapter adapter = new ClubAdapter(this, clubs);
        clubListView.setAdapter(adapter);

        chatbotButton.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ChatbotActivity.class);
            startActivity(intent);
        });
    }
}
