package link.tictactoe;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayShowHomeEnabled(true);
        actionBar.setIcon(R.mipmap.xo_48x48);
    }

    public void onButtonClick(View view){
        Intent intent = new Intent(MainActivity.this,PlayGameActivity.class);
        MainActivity.this.startActivity(intent);
    }

    public void onBtnClick(View view){
        Intent intent = new Intent(MainActivity.this,AboutActivity.class);
        MainActivity.this.startActivity(intent);
    }



}
