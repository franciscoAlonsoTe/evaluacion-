package home.com.evaluacion;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.Serializable;

public class Estudiantes extends AppCompatActivity {
    Button btnGuardar;
    EditText txbNombre,txbCodigo,txbMateria, txbParcial1, txbParcial2,txbParcial3;
    Double parcial1,parcial2,parcial3,promedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estudiantes);


        btnGuardar=(Button) findViewById(R.id.btnGuardar);
        txbCodigo=(EditText) findViewById(R.id.txbCodigo);
        txbNombre=(EditText) findViewById(R.id.txbNombre);
        txbMateria=(EditText) findViewById(R.id.txbMateria);
        txbParcial1=(EditText) findViewById(R.id.txbParcial1);
        txbParcial2=(EditText) findViewById(R.id.txbParcial2);
        txbParcial3=(EditText) findViewById(R.id.txbParcial3);


        btnGuardar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                parcial1=Double.parseDouble(txbParcial1.getText().toString());
                parcial2=Double.parseDouble(txbParcial2.getText().toString());
                parcial3=Double.parseDouble(txbParcial3.getText().toString());

                promedio=(parcial1*0.3)+(parcial2*0.3)+(parcial3*0.4);

                Estudiante estudiante=new Estudiante(txbNombre.getText().toString(),
                        txbCodigo.getText().toString(),
                        txbMateria.getText().toString(),
                        parcial1,parcial2,parcial3);

                estudiante.setPromedio(promedio);

                Intent estu=new Intent();

                estu.putExtra("Estudiante",estudiante);
                setResult(RESULT_OK,estu);
                MainActivity.contador++;
                finish();
            }
        });
    }
}
