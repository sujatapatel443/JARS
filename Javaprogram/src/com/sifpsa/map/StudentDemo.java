package com.sifpsa.map;

class StudentDemo {
int sid;
String name;
int city;
StudentDemo(int sid,String name,int city)
{
this.sid=sid;
this.name=name;
this.city=city;
}
public int getSid(){return sid;}
public void setSid(int sid){this.sid=sid;}

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	//return "StudentDemo [sid=" + sid + ", name=" + name + ", city=" + city + "]";
	return "StudentDemo[sid="+ sid + ", name=" + name + ", city=" + city + "]";
}

}


