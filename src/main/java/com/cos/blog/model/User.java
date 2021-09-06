package com.cos.blog.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.hibernate.annotations.CreationTimestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
//@DynamicInsert
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(nullable = false , length = 30)
	private String username;
	
	@Column(nullable = false , length = 100)
	private String password;
	
	@Column(nullable = false , length = 50)
	private String email;
	
	//@ColumnDefault("User")
	@Enumerated(EnumType.STRING)
	private RoleType role;
	
	@CreationTimestamp
	private Timestamp createDate;

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", role="
				+ role + ", createDate=" + createDate + "]";
	}
	
	
	
}
