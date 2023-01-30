package com.pluralcamp.jpd.entities;

public class Colors {

	private long id = -1;
	private String name;
	private int red;
	private int green;
	private int blue;

	public static final int MAX_VALUE = 255;
	public static final int MIN_VALUE = 0;
	public static final String DEFAULT_NAME = "undefined";

	public Colors(String name, int red, int blue, int green) {
		this.setName(name);
		this.setBlue(blue);
		this.setGreen(green);
		this.setRed(red);
	}

	public Colors(int red, int blue, int green) {
		this.setName(DEFAULT_NAME);
		this.setBlue(blue);
		this.setGreen(green);
		this.setRed(red);
	}

	public Colors() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		if (this.getId() != -1) {
			throw new UnsupportedOperationException("no es puede cambiar id");
		}
		if (id <= 0) {
			throw new IllegalArgumentException("El id a tiene que ser positivo");

		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name == null && name.trim().isEmpty()) {
			throw new NullPointerException("Es obligatorio indicar el nombre");
		}

		this.name = name;
	}

	public int getRed() {
		return red;
	}

	public void setRed(int red) {
		if (red < MIN_VALUE && red > MAX_VALUE) {
			throw new IllegalArgumentException("Valor no valid");
		}

		this.red = red;
	}

	public int getGreen() {
		return green;
	}

	public void setGreen(int green) {
		if (green < MIN_VALUE && green > MAX_VALUE) {
			throw new IllegalArgumentException("Valor no valid");
		}

		this.green = green;
	}

	public int getBlue() {
		return blue;
	}

	public void setBlue(int blue) {
		if (blue < MIN_VALUE && blue > MAX_VALUE) {
			throw new IllegalArgumentException("Valor no valid");
		}

		this.blue = blue;
	}

}
