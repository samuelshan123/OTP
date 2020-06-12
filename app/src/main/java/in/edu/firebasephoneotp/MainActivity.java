package in.edu.firebasephoneotp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.TaskExecutors;
import com.google.firebase.FirebaseException;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {

    private TextView textGenerateNumber;
    private EditText editTextMobile,randomnumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





        final Random myRandom = new Random();


        Button buttonGenerate = (Button)findViewById(R.id.refresh);
      textGenerateNumber = (TextView)findViewById(R.id.randomnum);
        textGenerateNumber.setText(String.valueOf(myRandom.nextInt(10001)));
        buttonGenerate.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                textGenerateNumber.setText(String.valueOf(myRandom.nextInt(10001)));
            }
        });



        editTextMobile = findViewById(R.id.editTextMobile);
        randomnumber =findViewById(R.id.edtrandomnum);

        findViewById(R.id.buttonContinue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textGenerateNumber.getText().toString().trim();

                String mobile = editTextMobile.getText().toString().trim();
                String rand = randomnumber.getText().toString().trim();

                if(mobile.isEmpty() || mobile.length() < 10){
                    editTextMobile.setError("Enter a valid mobile");
                    editTextMobile.requestFocus();
                    return;
                }
                if(rand.isEmpty()){
                    randomnumber.setError("Enter a valid number");
                    randomnumber.requestFocus();
                    return;
                }

                if(textGenerateNumber.getText().toString().equals(rand)){


                    Intent intent = new Intent(MainActivity.this, VerifyPhoneActivity.class);
                    intent.putExtra("mobile", mobile);
                    startActivity(intent);

                }
                else {
                    Toast.makeText(getApplicationContext(),"please enter the correct number",Toast.LENGTH_SHORT).show();
                }

            }
        });
    }

}