package info.motodell.trasem;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import info.motodell.trasem.activities.MainSlideHelpActivity;
import info.motodell.trasem.fragments.MainFragment;
import info.motodell.trasem.interfaces.ICommunicateFragments;

public class MainActivity extends AppCompatActivity implements ICommunicateFragments, MainFragment.OnFragmentInteractionListener {
    private Toolbar toolbar;
    Fragment mainFragment;
    Button btnFinishHelp;
    View viewHelp;
    Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = findViewById(R.id.uiToolbar);
//        setSupportActionBar(toolbar);
        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_container, mainFragment).commit();
    }
//    public boolean onCreateOptionsMenu(Menu menu, MenuInflater inflater){
//        getMenuInflater().inflate(R.id.overflow);
//        return true;
//    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void startLearn() {
        Toast.makeText(getApplicationContext(), "Abecedario activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void gloveBluetooth() {
        Toast.makeText(getApplicationContext(), "Glove activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void helpItemMenu() {
//        Toast.makeText(getApplicationContext(), "Hola", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, MainSlideHelpActivity.class );
        startActivity( intent );
    }
}
