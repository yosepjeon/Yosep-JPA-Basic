package jpabook.jpashop.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Entity
@Getter
@Setter
@ToString
public class Member {
	@Id
	@GeneratedValue
	@Column(name="MEMBER_ID")
	private Long id;
	private String name;
	private String city;
	private String street;
	private String zipcode;
}
