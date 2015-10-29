package com.springguild.users.data.entity;

import javax.persistence.*;

/**
 * Created by jamesliljenquist on 10/28/15.
 */
@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String name;
	private String email;
	private boolean likesPie;

	protected User() {}

	public User(String name, String email, boolean likesPie) {
		this.name = name;
		this.email = email;
		this.likesPie = likesPie;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public boolean isLikesPie() {
		return likesPie;
	}
}
