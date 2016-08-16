
package com.mixiaoxiao.weather.api.entity;

import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Aqi implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -4426260758809374490L;
	@SerializedName("city")
    @Expose
    public City city;

}
