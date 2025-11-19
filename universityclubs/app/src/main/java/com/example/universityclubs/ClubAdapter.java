package com.example.universityclubs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ClubAdapter extends BaseAdapter {

    Context context;
    List<Club> clubs;

    public ClubAdapter(Context context, List<Club> clubs) {
        this.context = context;
        this.clubs = clubs;
    }

    @Override
    public int getCount() {
        return clubs.size();
    }

    @Override
    public Object getItem(int position) {
        return clubs.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null)
            convertView = LayoutInflater.from(context).inflate(R.layout.club_item, parent, false);

        Club club = clubs.get(position);

        ImageView image = convertView.findViewById(R.id.clubImage);
        TextView name = convertView.findViewById(R.id.clubName);
        TextView desc = convertView.findViewById(R.id.clubDesc);
        TextView pres = convertView.findViewById(R.id.clubPresident);
        TextView contact = convertView.findViewById(R.id.clubContact);

        image.setImageResource(club.imageResId);
        name.setText(club.name);
        desc.setText(club.description);
        pres.setText("President: " + club.president);
        contact.setText("Contact: " + club.contact);

        return convertView;
    }
}
