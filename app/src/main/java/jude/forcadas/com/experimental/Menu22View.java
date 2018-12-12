package jude.forcadas.com.experimental;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Menu22View extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu22);
    }

    public void Back(View View){
        Intent Shift;

        if (View.getId() == R.id.M22B1){
            Shift = new Intent(this, MenuActivity.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.M22B2){
            Shift = new Intent(this, MenuActivity.class);
            startActivity(Shift);
        }
    }
}
