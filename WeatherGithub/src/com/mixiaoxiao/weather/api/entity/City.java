
package com.mixiaoxiao.weather.api.entity;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class City implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1301603212848119363L;
	@SerializedName("aqi")
    @Expose
    public String aqi;
    @SerializedName("co")
    @Expose
    public String co;
    @SerializedName("no2")
    @Expose
    public String no2;
    @SerializedName("o3")
    @Expose
    public String o3;
    @SerializedName("pm10")
    @Expose
    public String pm10;
    @SerializedName("pm25")
    @Expose
    public String pm25;
    @SerializedName("qlty")
    @Expose
    public String qlty;
    @SerializedName("so2")
    @Expose
    public String so2;

}
