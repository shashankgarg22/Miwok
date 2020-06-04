package com.example.miwok;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;

import static com.example.miwok.R.*;

public class wordAdapter<W> extends ArrayAdapter<Word> {
    TextView tvMiwok;
    TextView tvEnglish;
    ImageView ivIcon;

    private int mColorResourceId;


    public wordAdapter(@NonNull Context context, @NonNull List<Word> objects,int colorResourceId) {
        super(context, 0, objects);
        mColorResourceId=colorResourceId;
    }

    @SuppressLint("ResourceType")
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    layout.list_items, parent, false);
        }

        Word currentword=getItem(position);

        tvMiwok=listItemView.findViewById(id.tvMiwok);
        tvMiwok.setText(currentword.getMiwokTranslation());
        tvEnglish=listItemView.findViewById(id.tvEnglish);
        tvEnglish.setText(currentword.getDefaultTranslation());
        ivIcon=listItemView.findViewById(id.ivIcon);
        if(currentword.hasImage()){
            ivIcon.setImageResource(currentword.getImageResource_id());
            ivIcon.setVisibility(View.VISIBLE);
        }
        else{
            ivIcon.setVisibility(View.GONE);
        }

        View textContainer= listItemView.findViewById(id.text_container);
        int color= ContextCompat.getColor(getContext(),mColorResourceId);
        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
