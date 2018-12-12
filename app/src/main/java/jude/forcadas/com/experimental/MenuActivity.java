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
        else if (View.getId() == R.id.Menu6){
            Shift = new Intent(this, Menu6View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu7){
            Shift = new Intent(this, Menu7View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu8){
            Shift = new Intent(this, Menu8View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu9){
            Shift = new Intent(this, Menu9View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu10){
            Shift = new Intent(this, Menu10View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu11){
            Shift = new Intent(this, Menu11View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu12){
            Shift = new Intent(this, Menu12View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu13){
            Shift = new Intent(this, Menu13View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu14){
            Shift = new Intent(this, Menu14View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu15){
            Shift = new Intent(this, Menu15View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu16){
            Shift = new Intent(this, Menu16View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu17){
            Shift = new Intent(this, Menu17View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu18){
            Shift = new Intent(this, Menu18View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu19){
            Shift = new Intent(this, Menu19View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu20){
            Shift = new Intent(this, Menu20View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu21){
            Shift = new Intent(this, Menu21View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu22){
            Shift = new Intent(this, Menu22View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu23){
            Shift = new Intent(this, Menu23View.class);
            startActivity(Shift);
        }
        else if (View.getId() == R.id.Menu24){
            Shift = new Intent(this, Menu24View.class);
            startActivity(Shift);
        }
    }
}
