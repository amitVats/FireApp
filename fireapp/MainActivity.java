package amit.firebase.fireapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.firebase.client.Firebase;

public class MainActivity extends AppCompatActivity {

    Button send;
    Firebase mRef;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Firebase.setAndroidContext(this);
        mRef = new Firebase("https://fireapp-8645f.firebaseio.com/");

        send = (Button) findViewById(R.id.sendData);
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Data fired", Toast.LENGTH_SHORT).show();
                Firebase child = mRef.child("Name");
                child.setValue("Amit");

            }
        });
    }
}
