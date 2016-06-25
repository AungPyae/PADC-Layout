package xyz.aungpyaephyo.padc_layout.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RelativeLayout;

import xyz.aungpyaephyo.padc_layout.R;
import xyz.aungpyaephyo.padc_layout.fragments.FrameLayoutFragment;
import xyz.aungpyaephyo.padc_layout.fragments.GridLayoutFragment;
import xyz.aungpyaephyo.padc_layout.fragments.LinearLayoutFragment;
import xyz.aungpyaephyo.padc_layout.fragments.RelativeLayoutFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        Button btnFrameLayout = (Button) findViewById(R.id.btn_frame_layout);
        btnFrameLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FrameLayoutFragment fragment = new FrameLayoutFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });

        Button btnLinearLayout = (Button) findViewById(R.id.btn_linear_layout);
        btnLinearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LinearLayoutFragment fragment = new LinearLayoutFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });

        Button btnRelativeLayout = (Button) findViewById(R.id.btn_relative_layout);
        btnRelativeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                RelativeLayoutFragment fragment = new RelativeLayoutFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });

        Button btnGridLayout = (Button) findViewById(R.id.btn_grid_layout);
        btnGridLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                GridLayoutFragment fragment = new GridLayoutFragment();
                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fl_container, fragment)
                        .commit();
            }
        });

        if(savedInstanceState == null) {
            FrameLayoutFragment fragment = new FrameLayoutFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fl_container, fragment)
                    .commit();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
