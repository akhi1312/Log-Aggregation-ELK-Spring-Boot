package com.harish.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * {@link User} resource persisted in the database.
 *
 * @author vlotar
 */
//@Entity
//@Table(name = "users")
@Document
@Getter
@Setter
@ToString
public class User implements Serializable {

	private static final long serialVersionUID = -1674204092853306884L;

	@Id
//	@GeneratedValue
	private String id;

	@Column(name = "first_name", nullable = false)
	private String firstName;

	@Column(name = "last_name", nullable = false)
	private String lastName;

	@Column(name = "country", nullable = false)
	private String country;

}
