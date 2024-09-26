package com.cus.customertab.entity;

import com.cus.customertab.enums.EnumConstants.Gender;
import com.cus.customertab.enums.EnumConstants.DocumentType;

import java.sql.Timestamp;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "customer")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long customerId;

    @Column(nullable = false)
    private String firstName;

    private String middleName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, length = 10)
    private Long mobileNo;

    @Column(length = 10)
    private Long alternateNo;

    @Column(nullable = false)
    private String emailId;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(nullable = false)
    private String buildingName;

    @Column(nullable = false)
    private String locality;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false, length = 6)
    private Integer pincode;

    @Column(nullable = false)
    private String currentLocation;

    private Timestamp enrolledDate;

    @Lob
    private byte[] profilePic;

    @Enumerated(EnumType.STRING)
    private DocumentType KYC;

    private String idNo;

    @Column(nullable = false)
    private boolean isActive;

	//to automatically set data and isActive field
	@PrePersist
	public void prePersist(){
		this.enrolledDate = new Timestamp(System.currentTimeMillis());
		this.isActive = true;
	}

}