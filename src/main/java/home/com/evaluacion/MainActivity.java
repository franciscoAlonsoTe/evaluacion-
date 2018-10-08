package home.com.evaluacion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button btnNuevo, btnLista;
    public static ArrayList<Estudiante> lstEstudiantes=new ArrayList<>();
    public static int contador=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnNuevo=(Button) findViewById(R.id.btnNuevo);
        btnLista=(Button) findViewById(R.id.btnLista);

        btnNuevo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nNuevo = new Intent(MainActivity.this,Estudiantes.class);
                startActivityForResult(nNuevo,1);
            }
        });

        btnLista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Lista=new Intent(MainActivity.this,ListaEstudiantes.class);
                startActivity(Lista);
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode==1 && resultCode==RESULT_OK){

            if (data==null) return;;
            Estudiante estudiante=(Estudiante) data.getSerializableExtra("Estudiante");

            lstEstudiantes.add(estudiante);
        }

    }
}
