package com.tharindu.JPAdemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

public class Person {
	   @Id
	   private int id;
	   private String name;
	   private int points;
	   public Person() {
		    // default constructor
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPoints() {
			return points;
		}
		public void setPoints(int points) {
			this.points = points;
		}
		@Override
		public String toString() {
			return "Persons [name=" + name + ", points=" + points + ", id=" + id + "]";
		}
}
