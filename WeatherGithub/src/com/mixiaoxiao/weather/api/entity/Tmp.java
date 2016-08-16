
package com.mixiaoxiao.weather.api.entity;

 
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 
public class Tmp implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2217337469703819836L;
	@SerializedName("max")
    @Expose
    public String max;
    @SerializedName("min")
    @Expose
    public String min;

}
