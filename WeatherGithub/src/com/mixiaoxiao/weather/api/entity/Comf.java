
package com.mixiaoxiao.weather.api.entity;

 
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 
public class Comf implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2656543812334203419L;
	@SerializedName("brf")
    @Expose
    public String brf;
    @SerializedName("txt")
    @Expose
    public String txt;

}
