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

    public void Trees(View View){
        Intent Shift;

        if (View.getId() == R.id.Menu1){
            Shift = new Intent(this, Menu1View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu2){
            Shift = new Intent(this, Menu2View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu3){
            Shift = new Intent(this, Menu3View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu4){
            Shift = new Intent(this, Menu4View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu5){
            Shift = new Intent(this, Menu5View.class);
            startActivity(Shift);
        }
    }
}
