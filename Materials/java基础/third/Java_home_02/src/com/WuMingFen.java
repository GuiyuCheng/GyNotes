package com;

public class WuMingFen {
	private String theMa;
	private int quantity;
	private boolean likeSoup;

	public WuMingFen(String theMa, int quantity, boolean likeSoup) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
		this.likeSoup = likeSoup;
	}

	public WuMingFen(String theMa, int quantity) {
		super();
		this.theMa = theMa;
		this.quantity = quantity;
		likeSoup = true;
	}

	public WuMingFen() {
		super();
		theMa = "酸辣粉";
		quantity = 2;
		likeSoup = true;
	}

	public void check() {
		System.out.println(theMa + quantity + "两" + (likeSoup ? "带汤" : "不带汤"));
	}

}
