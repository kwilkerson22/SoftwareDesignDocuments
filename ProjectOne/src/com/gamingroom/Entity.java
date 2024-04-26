package com.gamingroom;

/**
 * The Entity class holds the common attributes and behaviors
 * as child classes
 * @author Kenneth Wilkerson
 *
 */
public class Entity {
	
	// all Entities need an id and a name
	protected long id;
	protected String name;
	
	// protected default constructor
	protected Entity() {
		
	}
	
	// constructor with an id and name
	public Entity(long id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// getter for locating id
	public long getId (){
		return id;
	}
	
	// getting for locating name
	public String getName() {
		return name;
	}
	
	@Override
	public String toString () {
		return "Entity [id=" + id + ", name=" + name + "]";
	}

}
