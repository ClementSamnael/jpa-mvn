package dev.jpa.mvn.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contact implements Serializable {

	@Id
	@Column(name = "id")
	private Long id;
	@Column(name = "email")
	private String email;
	@Column(name = "first_name")
	private String first_name;

	// ----------Constructor----------\\
	public Contact() {
	}

	// ------GETTER------\\
	public Long getId() {
		return id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getEmail() {
		return email;
	}

	// ------SETTER------\\
	public void setId(Long id) {
		this.id = id;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	// -------------@Override----------------------\\
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Contact [id=");
		builder.append(id);
		builder.append(", email=");
		builder.append(email);
		builder.append(", first_name=");
		builder.append(first_name);
		builder.append("]");
		return builder.toString();
	}

}
