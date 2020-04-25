package info.motodell.trasem.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import info.motodell.trasem.R;
import info.motodell.trasem.classes.imagevo.ImageMsl;

public class ImageMslAdapter extends RecyclerView.Adapter<ImageMslAdapter.ViewHolderImage> {

    List<ImageMsl> alphabetList;
    View view;

    public ImageMslAdapter(List<ImageMsl> alphabetList) {
        this.alphabetList = alphabetList;
    }

    @NonNull
    @Override
    public ImageMslAdapter.ViewHolderImage onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_image_msl, parent, false);
        return new ViewHolderImage(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ImageMslAdapter.ViewHolderImage viewHolderImage, int position) {
        viewHolderImage.imageViewMsl.setImageResource(alphabetList.get(position).getImageMslId());
        viewHolderImage.imageViewMsl.setContentDescription(alphabetList.get(position).getDescription());
        viewHolderImage.title.setText(alphabetList.get(position).getDisplayName());
    }

    @Override
    public int getItemCount() {
        return alphabetList.size();
    }

    public class ViewHolderImage extends RecyclerView.ViewHolder {

        CardView cardViewAlphabet;
        ImageView imageViewMsl;
        TextView title;

        public ViewHolderImage(@NonNull View itemView) {
            super(itemView);
            cardViewAlphabet = itemView.findViewById(R.id.cv_item_image_msl_alphabet);
            imageViewMsl = itemView.findViewById(R.id.iv_item_image_msl_alphabet);
            title = itemView.findViewById(R.id.tv_item_image_msl_title);
        }
    }
}
