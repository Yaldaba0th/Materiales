package android.example.com.materiales;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    static GlobalVar datos = new GlobalVar();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Context context = getApplicationContext();
        Toast toast = Toast.makeText(context, getString(R.string.toast_message), Toast.LENGTH_LONG);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mCount));
    }

    public void openFile(View view) {
        int intID = view.getId();
        Button button = (Button) findViewById(intID);
        String name = button.getText().toString();
        datos.setMaterialName(name);
        startActivity(new Intent(MainActivity.this, Main2Activity.class));

    }

    public void subirMaterial(View view) {
        startActivity(new Intent(MainActivity.this, Main3Activity.class));
    }
}