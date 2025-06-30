package com.sakila.api.entity;

import java.sql.Timestamp;

import org.hibernate.annotations.DynamicInsert;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "store")
@DynamicInsert
@Getter
@Setter
public class StoreEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	//db 안에 vlaue값
	@Column(name = "store_id")
	private int storeId;
	
	@Column(name = "manager_staff_id")
	private int managerStaffId;
	
	@Column(name = "last_update", nullable = true)	// 초기값 널 허용
	private Timestamp lastUpdate;
	
	// 외래키 설정 Store(N or 일) : Address(일) // address 하나당 store 하나
	@ManyToOne
	@JoinColumn(name = "address_id")
	private AddressEntity addressEntity;
}









