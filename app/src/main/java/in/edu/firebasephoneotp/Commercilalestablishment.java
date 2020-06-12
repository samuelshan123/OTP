package in.edu.firebasephoneotp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Commercilalestablishment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commercilalestablishment);
    }

    public void within(View view) {
        Intent i = new Intent(Commercilalestablishment.this,withingreaterchennai.class);
        startActivity(i);
    }

    public void outer(View view) {
        Intent i = new Intent(Commercilalestablishment.this,OutsideChennai.class);
        startActivity(i);
    }
}