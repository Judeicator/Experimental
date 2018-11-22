package jude.forcadas.com.experimental;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void Back(View View){
        Intent Shift;

        if (View.getId() == R.id.backButton){
            Shift = new Intent(this, MainActivity.class);
            startActivity(Shift);
        }
    }
}
