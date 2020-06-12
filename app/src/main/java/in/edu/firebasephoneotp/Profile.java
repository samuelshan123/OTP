package in.edu.firebasephoneotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Profile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
    }

    public void travelvia(View view) {
        Intent i = new Intent(Profile.this,travelviareg.class);
        startActivity(i);
    }

    public void commercialesta(View view) {
        Intent i = new Intent(Profile.this,Commercilalestablishment.class);
        startActivity(i);
    }

    public void commingin(View view) {
        Intent i = new Intent(Profile.this,comminginside.class);
        startActivity(i);
    }

    public void travelwith(View view) {
        Intent i = new Intent(Profile.this,travelwithin.class);
        startActivity(i);
    }
}
