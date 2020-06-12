package in.edu.firebasephoneotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class comminginside extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comminginside);
    }

    public void train(View view) {
        Intent i = new Intent(comminginside.this,Trainreg.class);
        startActivity(i);
    }

    public void domestic(View view) {
        Intent i = new Intent(comminginside.this,DomesticFlightreg.class);
        startActivity(i);
    }

    public void international(View view) {
        Intent i = new Intent(comminginside.this,internationalflightreg.class);
        startActivity(i);
    }
}