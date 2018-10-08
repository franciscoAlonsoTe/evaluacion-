package home.com.evaluacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class ListaEstudiantes extends AppCompatActivity {
    AdaptadorEstudiante adaptadorEstudiante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiantes);

        adaptadorEstudiante=new AdaptadorEstudiante(this,MainActivity.lstEstudiantes);

        ListView listaEstudiantes=(ListView) findViewById(R.id.lstEstudiantes);

        listaEstudiantes.setAdapter(adaptadorEstudiante);

        adaptadorEstudiante.notifyDataSetChanged();
    }
}
