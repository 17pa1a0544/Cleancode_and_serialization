package com.epam.interest;

public class Housepay{
	double area;
	int op;
	public Housepay(double area,int op) {
		this.area=area;
		this.op=op;
	}
	int[] cost= {1200,1500,1800,2500};
	public double total() {
		return area*cost[op-1];
	}
}