
package com.mixiaoxiao.weather.api.entity;

 
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 
public class Astro implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -6417016680202578677L;
	@SerializedName("sr")
    @Expose
    public String sr;
    @SerializedName("ss")
    @Expose
    public String ss;

}
