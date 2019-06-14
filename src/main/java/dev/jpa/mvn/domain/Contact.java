package dev.jpa.mvn.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Contact implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Column(name = "email")
	private String email;
	@Transient
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

	@Override
	public int hashCode() {
		return Objects.hash(email, first_name, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof Contact)) {
			return false;
		}
		Contact other = (Contact) obj;
		return Objects.equals(email, other.email) && Objects.equals(first_name, other.first_name)
				&& Objects.equals(id, other.id);
	}

}
