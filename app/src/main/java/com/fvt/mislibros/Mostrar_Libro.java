package com.fvt.mislibros;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Mostrar_Libro extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar__libro);

        TextView TVtitulo = findViewById(R.id.tituloLibro);
        TextView TVautor = findViewById(R.id.autorLibro);
        TextView TVsinopsis = findViewById(R.id.Sinopsis);
        TVsinopsis.setMovementMethod(new ScrollingMovementMethod());
        TextView TVfecha = findViewById(R.id.fechaPublicacion);
        TextView TVeditorial = findViewById(R.id.editorial);
        TextView TVcantidadPaginas = findViewById(R.id.cantidadPaginas);
        TextView TVidioma = findViewById(R.id.idioma);
        ImageView Imagen = findViewById(R.id.Imagen_libro);
        Button BotonFavoritos = findViewById(R.id.btnFavoritos);


        Intent intent = getIntent();
        int ID_Libro = intent.getIntExtra("ID_Libro", 1);
        Helper helper = new Helper(this, "MiBase", null, 2);
        SQLiteDatabase db = helper.getReadableDatabase();
        Cursor c = db.rawQuery("SELECT * FROM Libro WHERE ID_Libro = '"+ID_Libro+"';", null);
        c.moveToFirst();

        String titulo = c.getString(1);
        String autor = c.getString(2);
        String sinopsis = c.getString(3);
        String fecha = c.getString(4);
        String editorial = c.getString(5);
        String cantidadPaginas = c.getString(6);
        int favorito = c.getInt(7);
        int imagen = c.getInt(8);
        String idioma = c.getString(9);
        c.close();

        TVtitulo.setText(titulo);
        TVautor.setText(autor);
        TVsinopsis.setText(sinopsis);
        TVfecha.setText(fecha);
        TVeditorial.setText(editorial);
        TVcantidadPaginas.setText(cantidadPaginas);
        if (favorito == 0 ){
            BotonFavoritos.setText("Agregar a Favoritos ♥");
        }else{
            BotonFavoritos.setText("Quitar de Favoritos ♥");
        }

        Imagen.setImageResource(imagen);
        TVidioma.setText(idioma);
    }

    public void alterar_favorito(View view){

        Intent intent = getIntent();
        int ID_Libro = intent.getIntExtra("ID_Libro", 1);

        Helper helper = new Helper(this, "MiBase", null, 2);
        SQLiteDatabase db = helper.getReadableDatabase();

        Cursor f = db.rawQuery("SELECT Favorito FROM Libro WHERE ID_Libro = '"+ID_Libro+"';", null);
        f.moveToFirst();
        int fav = f.getInt(0);
        f.close();
        String query;
        Button BotonFavoritos = findViewById(R.id.btnFavoritos);

        if (fav==1){
            query = "UPDATE Libro SET Favorito = 0 WHERE ID_Libro = "+ID_Libro+";";
            Toast.makeText(getApplicationContext(),"Quitado de Favoritos",Toast.LENGTH_SHORT).show();
            BotonFavoritos.setText("Agregar a Favoritos ♥");
        }else{
            query = "UPDATE Libro SET Favorito = 1 WHERE ID_Libro = "+ID_Libro+";";
            Toast.makeText(getApplicationContext(),"Agregado a Favoritos",Toast.LENGTH_SHORT).show();
            BotonFavoritos.setText("Quitar de Favoritos ♥");
        }
        db.execSQL(query);

        Intent databack = new Intent();
        databack.putExtra("actualizarFavoritos","si");
        setResult(RESULT_OK,databack);
    }
}
