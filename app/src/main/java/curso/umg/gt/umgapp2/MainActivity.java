package curso.umg.gt.umgapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText et1;
    private EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
    }

    public void acceder(View view){
        String set1 = et1.getText().toString();
        String set2 = et2.getText().toString();
        Toast notificar;

        if(set1.endsWith("@catedratico.gt") && set2.equalsIgnoreCase("posgrado")) {
            notificar = Toast.makeText(this,"Acceso correcto",Toast.LENGTH_SHORT);
            notificar.show();

            Intent i = new Intent(this,TeacherActivity.class);
            startActivity(i);
        } else {
            notificar = Toast.makeText(this, "Acceso INCORRECTO", Toast.LENGTH_SHORT);
            notificar.show();
        }


    }
}
