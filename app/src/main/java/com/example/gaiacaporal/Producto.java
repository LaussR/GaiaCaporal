package com.example.gaiacaporal;
import android.graphics.Insets;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import java.util.ArrayList;
import java.util.List;

public class Producto extends AppCompatActivity {


    private ProductoAdapter adapter;
    private List<ProductoModel> productosList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_listviewproductos);

        //inicalizadores
        TextView appNombreProducto = findViewById(R.id.appNombreProducto);
        TextView appPrecio = findViewById(R.id.appPrecio);
        TextView appDescription = findViewById(R.id.appDescription);
        ImageView ImgProduct = findViewById(R.id.ImgProduct);
        ListView ListaProductos = findViewById(R.id.ListaProductos);

        productosList = new ArrayList<>();
        adapter = new ProductoAdapter(this, productosList);
        ListView.setAdapter(adapter);


        getDatos();

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}
