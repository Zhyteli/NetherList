package com.example.netherlist;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdsAdapter extends RecyclerView.Adapter<AdsAdapter.ViewHolder> {

    interface OnAdsClickListener{
    void onAdsClick(Ads ads, int position);
}

    private LayoutInflater inflater;
    private List<Ads> ads;
    private final OnAdsClickListener onAdsClickListener;

    public AdsAdapter(Context context, List<Ads> ads, OnAdsClickListener onAdsClickListener) {
        this.inflater = LayoutInflater.from(context);
        this.ads = ads;
        this.onAdsClickListener = onAdsClickListener;
    }

    @NonNull
    @Override
    public AdsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent ,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdsAdapter.ViewHolder holder, int position) {
        Ads ad = ads.get(position);
        holder.adsPhotoView.setImageResource(ad.getImageRecurse());
        holder.nameView.setText(ad.getName());
        holder.priceView.setText(ad.getPrice());
        holder.contactView.setText(ad.getContact());
        holder.descriptionView.setText(ad.getFacial_description());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onAdsClickListener.onAdsClick(ad, position);
            }
        });
    }

    @Override
    public int getItemCount() {
        return ads.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
       final ImageView adsPhotoView;
       final TextView nameView, priceView, contactView,descriptionView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            adsPhotoView = itemView.findViewById(R.id.ads_photo);
            nameView = itemView.findViewById(R.id.nameItem);
            priceView = itemView.findViewById(R.id.priceItem);
            contactView = itemView.findViewById(R.id.userContactItem);
            descriptionView = itemView.findViewById(R.id.descriptionItem);
        }
    }

}