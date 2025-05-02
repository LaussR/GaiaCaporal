package com.example.gaiacaporal;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;

public class ProductoAdapter extends ArrayAdapter<ProductoModel> {
    private final Context context;

    public ProductoAdapter(Context context, List<Producto> productos) {
        super(context, productos);
        this.context = context;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        Producto producto = getItem(position);
        if (producto == null) {
            producto = LayoutInflater.from(context).inflate(R.layout.item_producto, parent, false);
        }
}
