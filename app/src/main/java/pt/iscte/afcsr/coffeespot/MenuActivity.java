package pt.iscte.afcsr.coffeespot;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.FrameLayout;
import android.app.FragmentTransaction;
import android.app.Fragment;


public class MenuActivity extends AppCompatActivity {

    private BottomNavigationView mBottomNav;
    private FrameLayout mMain_frame;

    private ProductsFragment productsFragment;
    private ProfileFragment profileFragment;
    private MapsFragment mapsFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        mMain_frame = (FrameLayout) findViewById(R.id.main_frame);
        mBottomNav = (BottomNavigationView) findViewById(R.id.nav_bottom_bar);

        productsFragment = new ProductsFragment();
        profileFragment = new ProfileFragment();
        mapsFragment = new MapsFragment();

        setFragment(productsFragment);

        mBottomNav.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){

                    case R.id.nav_products :
                        setFragment(productsFragment);
                        return true;

                    case R.id.nav_profile :
                        setFragment(profileFragment);
                        return true;

                    case R.id.nav_maps :
                        setFragment(mapsFragment);
                        return true;

                    default:
                        return false;
                }

            }
        });

    }

    public void setFragment(Fragment fragment){
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_frame, fragment);
        fragmentTransaction.commit();
    }


}