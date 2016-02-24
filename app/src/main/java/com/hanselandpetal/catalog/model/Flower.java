package com.hanselandpetal.catalog.model;

import android.graphics.Bitmap;

public class Flower {

	private int id;
	private String name;
	private String location;
	private int data;

    private Bitmap bitmap;




	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }




}
