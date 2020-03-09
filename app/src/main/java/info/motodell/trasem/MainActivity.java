package info.motodell.trasem;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import info.motodell.trasem.fragments.MainFragment;
import info.motodell.trasem.interfaces.ICommunicateFragments;

public class MainActivity extends AppCompatActivity implements ICommunicateFragments, MainFragment.OnFragmentInteractionListener {
    private Toolbar toolbar;
    Fragment mainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        toolbar = findViewById(R.id.uiToolbar);
//        setSupportActionBar(toolbar);
        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.containerFragments, mainFragment).commit();
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
}
