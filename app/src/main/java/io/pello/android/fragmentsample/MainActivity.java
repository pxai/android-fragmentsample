package io.pello.android.fragmentsample;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements BlankFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Si venimos de una app ya cargada, procuramos no cargar con más fragments
        if (savedInstanceState != null) {
            return;
        }

        // Create an instance of ExampleFragment
        BlankFragment blankFragment = new BlankFragment();

        // En caso de haber recibido una llamada de un intent, le pasamos
        // los parámetros extras al fragment
        //blankFragment.setArguments(getIntent().getExtras());

        // Metemos el fragment dentro del Layout
        getSupportFragmentManager().beginTransaction().add(R.id.main_activity_framelayout, blankFragment).commit();

    }


    // En caso de interacción
    @Override
    public void onFragmentInteraction(Uri uri) {
        Log.d("PELLODEBUG", "Interaction from fragment.");
    }

    
}
