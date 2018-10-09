package android.example.com.materiales;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void regresar(View view) {
        finish();
    }

    public void subir(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, "FUNCION NO DISPONIBLE", Toast.LENGTH_LONG);
        toast.show();
    }
}
