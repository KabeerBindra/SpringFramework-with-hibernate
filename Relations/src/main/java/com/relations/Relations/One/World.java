package com.relations.Relations.One;

import java.util.Set;

import javax.persistence.ManyToMany;

public class World {
private int  worldid;
private String continents;
private String planets;
@ManyToMany
private Set <Cosmopolitan> abc;
public Set<Cosmopolitan> getAbc() {
	return abc;
}
public void setAbc(Set<Cosmopolitan> abc) {
	this.abc = abc;
}
public int getWorldid() {
	return worldid;
}
public void setWorldid(int worldid) {
	this.worldid = worldid;
}
public String getContinents() {
	return continents;
}
public void setContinents(String continents) {
	this.continents = continents;
}
public String getPlanets() {
	return planets;
}
public void setPlanets(String planets) {
	this.planets = planets;
}
}
