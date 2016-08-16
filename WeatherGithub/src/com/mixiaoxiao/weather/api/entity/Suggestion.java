
package com.mixiaoxiao.weather.api.entity;

 
import java.io.Serializable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

 
public class Suggestion implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2642312329578689708L;
	@SerializedName("comf")
    @Expose
    public Comf comf;
    @SerializedName("cw")
    @Expose
    public Cw cw;
    @SerializedName("drsg")
    @Expose
    public Drsg drsg;
    @SerializedName("flu")
    @Expose
    public Flu flu;
    @SerializedName("sport")
    @Expose
    public Sport sport;
    @SerializedName("trav")
    @Expose
    public Trav trav;
    @SerializedName("uv")
    @Expose
    public Uv uv;

}
