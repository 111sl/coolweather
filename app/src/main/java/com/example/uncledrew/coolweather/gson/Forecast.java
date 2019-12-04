package com.example.uncledrew.coolweather.gson;

import com.google.gson.annotations.SerializedName;

public class Forecast {
    public String date;

//    @SerializedName("cond")
//    public More more;

    @SerializedName("tmp_max")
    public String max;

    @SerializedName("tmp_min")
    public String min;

    @SerializedName("cond_txt_d")
    public String info;
//    public class More{
//        @SerializedName("txt_d")
//        public String info;
//    }
}
