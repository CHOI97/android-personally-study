package com.cookandroid.kotlin_study_fragment_java;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragment extends Fragment {
    MainActivity mainActivity;
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public MainFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment MainFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MainFragment newInstance(String param1, String param2) {
        MainFragment fragment = new MainFragment();
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
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        mainActivity = (MainActivity)getActivity();
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mainActivity = null;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_main, container,false);
        EditText edt_main = v.findViewById(R.id.edt_main);
        Bundle bundle = new Bundle();
        Button btnA= v.findViewById(R.id.btn_sendA);
        Button btnB= v.findViewById(R.id.btn_sendB);
        Button btnC= v.findViewById(R.id.btn_sendC);

        btnA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                bundle.putString("string", edt_main.getText().toString());
                mainActivity.changeFragment('A',bundle);
            }
        });
        btnB.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                bundle.putString("string", edt_main.getText().toString());
                mainActivity.changeFragment('B',bundle);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                bundle.putString("string", edt_main.getText().toString());
                mainActivity.changeFragment('C',bundle);
            }
        });
        return v;
    }
}