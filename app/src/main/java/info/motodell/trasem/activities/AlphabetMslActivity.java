package info.motodell.trasem.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import info.motodell.trasem.R;
import info.motodell.trasem.adapters.ImageMslAdapter;
import info.motodell.trasem.classes.Utilities;

public class AlphabetMslActivity extends AppCompatActivity {

    RecyclerView recyclerImageMsl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabet_msl);

        recyclerImageMsl = findViewById(R.id.rv_alphabet_msl_alphabet);
        recyclerImageMsl.setLayoutManager(new GridLayoutManager(getApplicationContext(), 2));
        recyclerImageMsl.setHasFixedSize(true);
        final ImageMslAdapter mslAdapter = new ImageMslAdapter(Utilities.imageMslAlphabetList);
        recyclerImageMsl.setAdapter(mslAdapter);
    }
}
