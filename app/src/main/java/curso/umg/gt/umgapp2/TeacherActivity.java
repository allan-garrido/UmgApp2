package curso.umg.gt.umgapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ViewPropertyAnimatorCompatSet;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {
    private List<String> listaestudiantes;
    private EditText et3;
    private ListView lv1;
    private ArrayAdapter<String> listaadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);
        listaestudiantes = new ArrayList<>();
        et3 = (EditText) findViewById(R.id.et3);
        lv1 = (ListView) findViewById(R.id.lv1);
        listaadapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaestudiantes);
        lv1.setAdapter(listaadapter);

        listaestudiantes.add("Pepe");
        listaestudiantes.add("Ale");
        listaestudiantes.add("Luisito");
        listaestudiantes.add("Alberto");
    }

    public void addEstudiante(View view) {
        String nombre = et3.getText().toString();
        listaestudiantes.add(nombre);

        listaadapter.notifyDataSetChanged();
    }
}
