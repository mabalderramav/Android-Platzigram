package com.nanus.platzigram;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.nanus.platzigram.view.ContainerActivity;
import com.nanus.platzigram.view.CreateAccountActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    /**
     * Go to create account activity.
     *
     * @param view {@link View}.
     */
    public void goCreateAccount(View view) {
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }

    /**
     * Go to Platzigram home activity.
     *
     * @param view {@link View}.
     */
    public void goHomeApp(View view) {
        Intent intent = new Intent(this, ContainerActivity.class);
        startActivity(intent);
    }
}
