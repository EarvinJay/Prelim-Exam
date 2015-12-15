package tech.sidespell.prelimexam;

import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private RadioGroup rdbgroup;
    private TextView time,timebars;
    private RadioButton rdbincrease,rdbdecrease;
    private ToggleButton start;
    private SeekBar seekbars;

    private long timemax=1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        timebars=(TextView) findViewById(R.id.timebar);
        time=(TextView) findViewById(R.id.Time);
        seekbars=(SeekBar) findViewById(R.id.seekBar);
        rdbincrease=(RadioButton) findViewById(R.id.rdbinc);
        rdbdecrease=(RadioButton) findViewById(R.id.rdbdec);
        start=(ToggleButton) findViewById(R.id.start);


        final Handler handler = new Handler();

        Runnable run=new Runnable() {
            @Override
            public void run() {



            }
        };


    }

    public void increase()
    {
        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

    }

    public void decrease()
    {
        start.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    // The toggle is enabled
                } else {
                    // The toggle is disabled
                }
            }
        });

    }





}
