package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * Groups entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tgroups", uniqueConstraints = @UniqueConstraint(columnNames = "GroupName"))
public class Groups implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 3532245422481674455L;
	private Integer groupId;
	private Integer groupOwnerId;
	private String groupOwnerName;
	private String groupName;
	private String groupDesc;
	private Integer groupOption;
	private Timestamp groupCreationDate;
	private Timestamp groupModifiedDate;

	// Constructors

	/** default constructor */
	public Groups() {
	}

	/** full constructor */
	public Groups(Integer groupOwnerId, String groupOwnerName,
			String groupName, String groupDesc, Integer groupOption,
			Timestamp groupCreationDate, Timestamp groupModifiedDate) {
		this.groupOwnerId = groupOwnerId;
		this.groupOwnerName = groupOwnerName;
		this.groupName = groupName;
		this.groupDesc = groupDesc;
		this.groupOption = groupOption;
		this.groupCreationDate = groupCreationDate;
		this.groupModifiedDate = groupModifiedDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "GroupID", unique = true, nullable = false)
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "GroupOwnerID", nullable = false)
	public Integer getGroupOwnerId() {
		return this.groupOwnerId;
	}

	public void setGroupOwnerId(Integer groupOwnerId) {
		this.groupOwnerId = groupOwnerId;
	}

	@Column(name = "GroupOwnerName", nullable = false, length = 30)
	public String getGroupOwnerName() {
		return this.groupOwnerName;
	}

	public void setGroupOwnerName(String groupOwnerName) {
		this.groupOwnerName = groupOwnerName;
	}

	@Column(name = "GroupName", unique = true, nullable = false, length = 250)
	public String getGroupName() {
		return this.groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	@Column(name = "GroupDesc", nullable = false, length = 65535)
	public String getGroupDesc() {
		return this.groupDesc;
	}

	public void setGroupDesc(String groupDesc) {
		this.groupDesc = groupDesc;
	}

	@Column(name = "GroupOption", nullable = false)
	public Integer getGroupOption() {
		return this.groupOption;
	}

	public void setGroupOption(Integer groupOption) {
		this.groupOption = groupOption;
	}

	@Column(name = "GroupCreationDate", nullable = false, length = 19)
	public Timestamp getGroupCreationDate() {
		return this.groupCreationDate;
	}

	public void setGroupCreationDate(Timestamp groupCreationDate) {
		this.groupCreationDate = groupCreationDate;
	}

	@Column(name = "GroupModifiedDate", nullable = false, length = 19)
	public Timestamp getGroupModifiedDate() {
		return this.groupModifiedDate;
	}

	public void setGroupModifiedDate(Timestamp groupModifiedDate) {
		this.groupModifiedDate = groupModifiedDate;
	}

}