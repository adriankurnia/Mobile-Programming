package umn.ac.id.utsmobile2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilePage extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_page);

        backButton = (Button) findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                returnkMainActivity();

            }
        });

        TextView link1 = (TextView) findViewById(R.id.video1);
        link1.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link2 = (TextView) findViewById(R.id.video2);
        link2.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link3 = (TextView) findViewById(R.id.video3);
        link3.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link4 = (TextView) findViewById(R.id.video4);
        link4.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link5 = (TextView) findViewById(R.id.video5);
        link5.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link6 = (TextView) findViewById(R.id.video6);
        link6.setMovementMethod(LinkMovementMethod.getInstance());
        TextView link7 = (TextView) findViewById(R.id.video7);
        link7.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void returnkMainActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}