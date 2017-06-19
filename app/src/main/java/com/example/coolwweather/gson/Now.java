package com.example.coolwweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 颜玉 on 2017/6/19.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;
    @SerializedName("cond")
    public More more;
    public class More{
        @SerializedName("text")
        public String info;
    }
}
