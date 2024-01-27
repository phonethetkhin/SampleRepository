package com.ptk.myapplication3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class LanguageAdapter extends RecyclerView.Adapter<LanguageAdapter.LanguageViewHolder> {
    ArrayList<String> languages;

    public LanguageAdapter(ArrayList<String> languages) {
        this.languages = languages;
    }

    @NonNull
    @Override
    public LanguageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_planguage, parent, false);
        return new LanguageViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull LanguageViewHolder holder, int position) {
        holder.tvLanguage.setText(languages.get(position));
    }

    @Override
    public int getItemCount() {
        return languages.size();
    }

    public class LanguageViewHolder extends RecyclerView.ViewHolder {
        TextView tvLanguage;

        public LanguageViewHolder(@NonNull View v) {
            super(v);
            tvLanguage = v.findViewById(R.id.tvLanguage);
        }
    }
}
