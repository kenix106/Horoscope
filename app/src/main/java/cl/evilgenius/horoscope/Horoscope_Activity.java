package cl.evilgenius.horoscope;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

public class Horoscope_Activity extends AppCompatActivity {

    String zodiac="Nothing";

    int day, month;
    EditText day0, month0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horoscope_);

/*
        day0 = (EditText)findViewById(R.id.txtDay);
        month0 = (EditText) findViewById(R.id.txtMonth);
        day= Integer.parseInt(day0.getText().toString());
        month = Integer.parseInt(month0.getText().toString());

        ZodiacClass zod = new ZodiacClass();
        zodiac=zod.zodiacSign(day,month);

       toastSign();*/

    }
    /*
    private void toastSign(){
        Toast.makeText(this, "Su signo es  "+zodiac,Toast.LENGTH_SHORT);
    }*/

}
