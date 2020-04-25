package info.motodell.trasem;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import info.motodell.trasem.activities.MainSlideHelpActivity;
import info.motodell.trasem.fragments.MainFragment;
import info.motodell.trasem.interfaces.ICommunicateFragments;

public class MainActivity extends AppCompatActivity implements ICommunicateFragments, MainFragment.OnFragmentInteractionListener {
    Fragment mainFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainFragment = new MainFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_main_container, mainFragment).commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void startLearn() {
        Toast.makeText(getApplicationContext(), "ABC activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void gloveBluetooth() {
        Toast.makeText(getApplicationContext(), "Glove activity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void helpItemMenu() {
//        Toast.makeText(getApplicationContext(), "Hello", Toast.LENGTH_SHORT).show();
        Intent intent = new Intent( this, MainSlideHelpActivity.class );
        startActivity( intent );
    }
}
