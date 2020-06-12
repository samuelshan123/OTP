package in.edu.firebasephoneotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class travelwithin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travelwithin);

    }
    public void train(View view) {
        Intent i = new Intent(travelwithin.this,Trainreg.class);
        startActivity(i);
    }

    public void domestic(View view) {
        Intent i = new Intent(travelwithin.this,DomesticFlightreg.class);
        startActivity(i);
    }
}