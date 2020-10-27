package pt.iscte.afcsr.coffeespot;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNav;
    private FrameLayout frame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button login = findViewById(R.id.ButtonLogin);
        final EditText textUser = findViewById(R.id.TextFieldUsername);
        final EditText textPass = findViewById(R.id.TextFieldPass);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              //  if(textUser.getText().length()==0 ){
              //      textUser.setError("Please fill this field");
              //  }
              //  if(textPass.getText().length()==0){
              //      textPass.setError("Please fill this field");
                // }
                //else{
                    Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
                    startActivity(intent);
            }

        });


    }
}
