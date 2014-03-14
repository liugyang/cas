package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MemberGroup entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmembergroup")
public class MemberGroup implements java.io.Serializable {

	// Fields

	private MemberGroupId id;
	private String memberName;
	private Integer privilege;
	private Timestamp creationDate;
	private Timestamp modifiedDate;

	// Constructors

	/** default constructor */
	public MemberGroup() {
	}

	/** full constructor */
	public MemberGroup(MemberGroupId id, String memberName, Integer privilege,
			Timestamp creationDate, Timestamp modifiedDate) {
		this.id = id;
		this.memberName = memberName;
		this.privilege = privilege;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "groupId", column = @Column(name = "GroupID", nullable = false)),
			@AttributeOverride(name = "memberId", column = @Column(name = "MemberID", nullable = false)) })
	public MemberGroupId getId() {
		return this.id;
	}

	public void setId(MemberGroupId id) {
		this.id = id;
	}

	@Column(name = "MemberName", nullable = false, length = 30)
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Column(name = "Privilege", nullable = false)
	public Integer getPrivilege() {
		return this.privilege;
	}

	public void setPrivilege(Integer privilege) {
		this.privilege = privilege;
	}

	@Column(name = "CreationDate", nullable = false, length = 19)
	public Timestamp getCreationDate() {
		return this.creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	@Column(name = "ModifiedDate", nullable = false, length = 19)
	public Timestamp getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Timestamp modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

}