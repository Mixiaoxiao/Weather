
package com.mixiaoxiao.weather.api.entity;

 
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 
public class Update implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8789602206113122980L;
	@SerializedName("loc")
    @Expose
    public String loc;
    @SerializedName("utc")
    @Expose
    public String utc;

}
