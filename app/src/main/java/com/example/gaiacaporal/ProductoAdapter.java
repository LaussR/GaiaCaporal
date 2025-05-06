package com.example.gaiacaporal;
import java.util.List;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import androidx.annotation.NonNull;

public class ProductoAdapter extends ArrayAdapter<ProductoModel> {
    private Context context;
    private List<ProductoModel> productos;

    public ProductoAdapter(Context context, List<ProductoModel> productos) {
        super(context, R.layout.item_producto, productos);
        this.context = context;
        this.productos = productos;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.item_producto,parent,false);

        ProductoModel currentProducto = productos.get(position);

        return listItem;
        }
}
