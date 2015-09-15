package com.company;

/**
 * Created by Aaron Fernandes on 15/09/15.
 */
public class Program {
	private String _name;
	private String _gender;
	private int _age;

	//getter for name
	public String getName(){
		return this._name;
	}

	//setter for name
	public void setName(String name){
		this._name=name;
	}

	//getter for gender
	public String getGender(){
		return this._gender;
	}

	//setter for gender
	public void setGender(String gender){
		this._gender=gender;
	}

	/*
		Constructor
		@param age of person
	 */
	Program(int age){
		this._age=age;
	}

	public void runs(){
		System.out.printf("%s who is %d runs", this._age, this._name);
	}


}
