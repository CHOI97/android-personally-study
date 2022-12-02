package com.cookandroid.kotlin_study_fragment_java;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentC fragmentC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        MainFragment myfragment = new MainFragment();
        fragmentA = new FragmentA();
        fragmentB = new FragmentB();
        fragmentC = new FragmentC();

        fragmentTransaction.add(R.id.fl_main_fragment,myfragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
    public void changeFragment(int index,Bundle bundle){
        switch (index){
            case 'A':{
                fragmentA.setArguments(bundle);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_main_fragment,fragmentA)
                        .addToBackStack(null)
                        .commit();
                break;
            }

            case 'B':{
                fragmentB.setArguments(bundle);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_main_fragment,fragmentB)
                        .addToBackStack(null)
                        .commit();
                break;
            }
            case 'C':{
                fragmentC.setArguments(bundle);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fl_main_fragment,fragmentC)
                        .addToBackStack(null)
                        .commit();
                break;
            }
        }
    }
}