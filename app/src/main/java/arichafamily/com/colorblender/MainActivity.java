package arichafamily.com.colorblender;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    EditText etRed;
    EditText etGreen;
    EditText etBlue;
    SeekBar sbRed;
    SeekBar sbGreen;
    SeekBar sbBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etRed = (EditText) findViewById(R.id.etRed);
        etGreen = (EditText) findViewById(R.id.etGreen);
        etBlue = (EditText) findViewById(R.id.etBlue);
        sbRed = (SeekBar) findViewById(R.id.sbRed);
        sbGreen = (SeekBar) findViewById(R.id.sbGreen);
        sbBlue = (SeekBar) findViewById(R.id.sbBlue);


        sbRed.setOnSeekBarChangeListener(this);
        sbGreen.setOnSeekBarChangeListener(this);
        sbBlue.setOnSeekBarChangeListener(this);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        if (seekBar.getId() == sbRed.getId() )
            etRed.setText(String.valueOf(progress));
        if (seekBar.getId() == sbGreen.getId())
            etGreen.setText(String.valueOf(progress));
        if (seekBar.getId() == sbBlue.getId())
            etBlue.setText(String.valueOf(progress));
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

}
