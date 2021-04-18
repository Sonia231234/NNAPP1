package com.example.nnapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.tabs.TabLayoutMediator;

public class TabLayout extends AppCompatActivity {

    ViewPagerAdapter mAdapter;
    ViewPager2 viewPager2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        viewPager2 = findViewById(R.id.viewPager2);
        mAdapter = new ViewPagerAdapter(getSupportFragmentManager(),getLifecycle());

        //AGREGAMOS LOS FRAGMENTOS
       /* mAdapter.addFragment(new FavoritosFragment());
        mAdapter.addFragment(new CarritoFragment());
        mAdapter.addFragment(new EnviosFragment());
        mAdapter.addFragment(new BuscarFragment());]*/

        viewPager2.setAdapter(mAdapter);

        View tabLayout = findViewById(R.id.IdTabLayout);

        int [] icon = new int[]{
                R.drawable.ic_favoritos_elchido,
                R.drawable.ic_carrito_elchido,
                R.drawable.ic_envios_elchido,
                R.drawable.ic_buscar_elchido
        };

        new TabLayoutMediator((com.google.android.material.tabs.TabLayout) tabLayout, viewPager2,(tab, position)->tab.setIcon(icon[position])).attach();

       // new TabLayoutMediator(tabLayout, viewPager2,((tab, position) -> tab.setIcon(icon[position])).attach();
       /* new TabLayoutMediator((com.google.android.material.tabs.TabLayout) tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull com.google.android.material.tabs.TabLayout.Tab tab, int position) {

                switch (position){
                    case 0:
                        tab.setText("FAVORITOS");
                        break;

                    case 1:
                        tab.setText("CARRITO DE VENTA");
                        break;

                    case 2:
                        tab.setText("ENVIOS");
                        break;

                    case 3:
                        tab.setText("BUSCAR");
                        break;//MEQUEDEAQUI
                }

            }
        }).attach();*/
    }
}