package android.example.com.materiales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String name=MainActivity.datos.getMaterialName();
        TextView ficha = (TextView) findViewById(R.id.show_material);
        ficha.setText(name);
    }

    public void regresar(View view) {
        finish();
    }
}
