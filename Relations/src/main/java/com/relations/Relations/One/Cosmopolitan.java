package com.relations.Relations.One;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

public class Cosmopolitan {
private int  id;
private String cosmoname;
private String cosmoclass;
@ManyToMany
private Set<World> details;
//private  World world; one to one 
//@OneToMany
//private List <World> world =  new ArrayList<World>();

public Set<World> getDetails() {
	return details;
}
public void setDetails(Set<World> details) {
	this.details = details;
}
//public List<World> getWorld() {
	//return world;
//}
//public void setWorld(List<World> world) {
	//this.world = world;
//}
public int getId() {
	return id;
}
public Cosmopolitan(int id, String cosmoname, String cosmoclass, World world) {
	super();
	this.id = id;
	this.cosmoname = cosmoname;
	this.cosmoclass = cosmoclass;
//	this.world = world;
}
public void setId(int id) {
	this.id = id;
}
public String getCosmoname() {
	return cosmoname;
}
public void setCosmoname(String cosmoname) {
	this.cosmoname = cosmoname;
}
public String getCosmoclass() {
	return cosmoclass;
}
public void setCosmoclass(String cosmoclass) {
	this.cosmoclass = cosmoclass;
}
//public World getWorld() {
	//return world;
//}
//public void setWorld(World world) {
	//this.world = world;
//}
}
