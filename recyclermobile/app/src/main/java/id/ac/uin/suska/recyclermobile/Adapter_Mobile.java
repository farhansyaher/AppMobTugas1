package id.ac.uin.suska.recyclermobile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter_Mobile extends RecyclerView.Adapter<Holder_View> {


    public Adapter_Mobile(Context defin, List<Item_Rec> items) {
        this.defin = defin;
        this.items = items;
    }

    Context defin;
    List<Item_Rec> items;
    @NonNull
    @Override
    public Holder_View onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Holder_View(LayoutInflater.from(defin).inflate(R.layout.item_lay,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Holder_View holder, int position) {
        holder.name.setText(items.get(position).getName());
        holder.email.setText(items.get(position).getEmail());
        holder.imageView.setImageResource(items.get(position).getImage());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
