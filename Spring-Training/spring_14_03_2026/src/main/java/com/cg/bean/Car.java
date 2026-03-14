package com.cg.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component("car")
public class Car {
	@Value(value = "${carname}")
	private String name;
	private IEngine engine;
	private ITyre tyre;

	

	public Car() {
		super();
	}


	@Autowired
	public Car(@Qualifier("petrol") IEngine engine, @Qualifier("mrf") ITyre tyre) {
		super();
		this.engine = engine;
		this.tyre = tyre;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public IEngine getEngine() {
		return engine;
	}



	public void setEngine(IEngine engine) {
		this.engine = engine;
	}



	public ITyre getTyre() {
		return tyre;
	}



	public void setTyre(ITyre tyre) {
		this.tyre = tyre;
	}



	public void printCar() {
		System.out.println("Car name :  " + name);
		System.out.println("BHP : " + engine.getBHP());
		System.out.println("Tyre : " + tyre.getTyreDetail());
	}
}
