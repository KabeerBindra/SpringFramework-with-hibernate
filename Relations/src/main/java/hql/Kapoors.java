package hql;

public class Kapoors {
private String name,films,hits,besthits;
private Float salary;
private int nepotism ,id;

public Kapoors(String name, String films, String hits, String besthits, Float salary, int nepotism, int id) {
	super();
	this.name = name;
	this.films = films;
	this.hits = hits;
	this.besthits = besthits;
	this.salary = salary;
	this.nepotism = nepotism;
	this.id = id;
}
public Kapoors() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Kapoors [name=" + name + ", films=" + films + ", hits=" + hits + ", besthits=" + besthits + ", salary="
			+ salary + ", nepotism=" + nepotism + ", id=" + id + "]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getFilms() {
	return films;
}
public void setFilms(String films) {
	this.films = films;
}
public String getHits() {
	return hits;
}
public void setHits(String hits) {
	this.hits = hits;
}
public String getBesthits() {
	return besthits;
}
public void setBesthits(String besthits) {
	this.besthits = besthits;
}
public Float getSalary() {
	return salary;
}
public void setSalary(Float salary) {
	this.salary = salary;
}
public int getNepotism() {
	return nepotism;
}
public void setNepotism(int nepotism) {
	this.nepotism = nepotism;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
}
