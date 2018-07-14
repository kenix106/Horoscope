package cl.evilgenius.horoscope;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

String zodiac="";
String zodiacTest2="";
int day, month, year;
EditText day0, month0, dateZod;

Calendar cal;
int dd1,mm1,yy1;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        cal = Calendar.getInstance();
        dd1=cal.get(Calendar.DAY_OF_MONTH);
        mm1=cal.get(Calendar.MONTH);
        yy1= cal.get(Calendar.YEAR);
        mm1=mm1+1;








    }

  public void datePicker(View view) {
        DatePickerDialog datePickerDialog = new DatePickerDialog(MainActivity.this, android.R.style.Theme_DeviceDefault_Dialog_Alert,  new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                int day, month, year;
                day = i2;
                month= i1 + 1;
                year = i;
                String ActivityZod = "Horoscope_Activity";
                ZodiacClass zodC = new ZodiacClass();
                String zodiacSignReal= zodC.zodiacSign(day,month);
                ActivityZod = (zodiacSignReal+"Activity");

               switch (zodiacSignReal){
                    case "ARIES":
                       Intent  aries = new Intent(MainActivity.this, AriesScrollingActivity.class);
                       startActivity(aries);
                       break;

                   case "TAURUS":
                       Intent taurus = new Intent(MainActivity.this, TaurussScrollingActivity.class);
                       startActivity(taurus);
                       break;

                   case "GEMINI":
                       Intent gemini = new Intent(MainActivity.this, GeminiScrollingActivity.class);
                       startActivity(gemini);
                       break;

                   case "CANCER":
                       Intent  cancer = new Intent(MainActivity.this, CancerScrollingActivity.class);
                       startActivity(cancer);
                       break;

                   case "LEO":
                       Intent leo = new Intent(MainActivity.this, LeoScrollingActivity.class);
                       startActivity(leo);
                       break;

                   case "VIRGO":
                       Intent virgo = new Intent(MainActivity.this, VirgoScrollingActivity.class);
                       startActivity(virgo);
                       break;

                   case "LIBRA":
                       Intent libra = new Intent(MainActivity.this, LibraScrollingActivity.class);
                       startActivity(libra);
                       break;

                   case "SCORPIO":
                       Intent  scorpio = new Intent(MainActivity.this, ScorpioScrollingActivity.class);
                       startActivity(scorpio);
                       break;

                   case "SAGITTARIUS":
                       Intent sagi = new Intent(MainActivity.this, SagittariusScrollingActivity.class);
                       startActivity(sagi);
                       break;

                   case "CAPRICORN":
                       Intent  capri = new Intent(MainActivity.this, CapricornScrollingActivity.class);
                       startActivity(capri);
                       break;

                   case "AQUARIUS":
                       Intent aqua = new Intent(MainActivity.this, AquariusScrollingActivity.class);
                       startActivity(aqua);
                       break;

                   case "PISCES":
                       Intent pisces = new Intent(MainActivity.this, PiscesScrollingActivity.class);
                       startActivity(pisces);
                       break;

                }




                Log.e("G8", "La fecha es   " + day + " - " + month + " - " + year + " Zodiac = "+ zodiacSignReal);

            }
        },dd1,mm1,yy1);
        datePickerDialog.show();

 }


}
