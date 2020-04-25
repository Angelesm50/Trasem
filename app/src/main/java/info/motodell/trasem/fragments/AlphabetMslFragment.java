package info.motodell.trasem.fragments;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.motodell.trasem.R;
import info.motodell.trasem.adapters.ImageMslAdapter;
import info.motodell.trasem.classes.Utilities;
import info.motodell.trasem.interfaces.ICommunicateFragments;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AlphabetMslFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class AlphabetMslFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    View view;
    Activity activity;
    RecyclerView recyclerImageMsl;
    ICommunicateFragments iCommunicateFragments;

    public AlphabetMslFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment AlphabetMslFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static AlphabetMslFragment newInstance(String param1, String param2) {
        AlphabetMslFragment fragment = new AlphabetMslFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_alphabet_msl, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerImageMsl = view.findViewById(R.id.rv_alphabet_msl_alphabet);
        recyclerImageMsl.setLayoutManager(new GridLayoutManager(this.activity, 2));
        recyclerImageMsl.setHasFixedSize(true);
        final ImageMslAdapter mslAdapter = new ImageMslAdapter(Utilities.imageMslAlphabetList);
        recyclerImageMsl.setAdapter(mslAdapter);
    }

}
