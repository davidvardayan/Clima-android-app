package com.davidvardanyan.climapm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;


public class WeatherController extends AppCompatActivity {

    // Constants:
    final String WEATHER_URL = "http://api.openweathermap.org/data/2.5/weather";
    // App ID to use OpenWeather data
    final String APP_ID = " ";
    // Time between location updates (5000 milliseconds or 5 seconds)
    final long MIN_TIME = 5000;
    // Distance between location updates (1000m or 1km)
    final float MIN_DISTANCE = 1000;






    // Member Variables:
    TextView mCityLabel;
    ImageView mWeatherImage;
    TextView mTemperatureLabel;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_controller_layout);

        // Linking the elements in the layout to Java code
        mCityLabel =  findViewById(R.id.locationTV);
        mWeatherImage =  findViewById(R.id.weatherSymbolIV);
        mTemperatureLabel =  findViewById(R.id.tempTV);
        ImageButton changeCityButton = findViewById(R.id.changeCityButton);





    }





}
