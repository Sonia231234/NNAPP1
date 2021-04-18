package com.example.nnapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.ArrayList;

public class ViewPagerAdapter extends FragmentStateAdapter {

    ArrayList<Fragment> arrayList = new ArrayList<>();

    public ViewPagerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new Fragment();
        switch (position){
            case 0:
                fragment = new FavoritosFragment();
                break;

            case 1:
                fragment = new CarritoFragment();
                break;

            case 2:
                fragment = new EnviosFragment();
                break;

            case 3:
                fragment = new BuscarFragment();
                break;
        }

        //return arrayList.get(position);
        return fragment;
    }


//esto es para que se actualice solo el numero de fragmentos
    @Override
    public int getItemCount() {

        //return arrayList.size();

        return 4;
    }
    public void addFragment(Fragment fragment){

        arrayList.add(fragment);
    }
}
