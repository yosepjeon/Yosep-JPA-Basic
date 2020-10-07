package jpabook.jpashop.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Setter;
import lombok.ToString;
import lombok.Getter;

@Entity
@Getter
@Setter
@ToString
public class Member extends BaseEntity{
	@Id
	@GeneratedValue
	@Column(name="MEMBER_ID")
	private Long id;
	private String name;
	private String city;
	private String street;
	private String zipcode;
	
	// 설계적으로는 잘못됨 학습용으로 이렇게 설계함.
	@OneToMany(mappedBy="member")
	private List<Order> orders = new ArrayList<Order>();
}
