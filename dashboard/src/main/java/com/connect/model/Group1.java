package com.connect.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TGroup")
public class Group1 {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GroupID", nullable = false)
	private long GroupID;
	
	@Column(name="GroupOwnerID", nullable = false)
	private long GroupOwnerID;
	
	@Column(name="GroupOwnerName", length = 30, nullable = false)
	private String GroupOwnerName;
	
	@Column(name="GroupName", length = 250, unique=true, nullable = false)
	private String GroupName;
	
	@Column(name="GroupDesc", nullable = false)
	private String GroupDesc;
	
	@Column(name="GroupOption", nullable = false)
	private int GroupOption;
	
	@Column(name="GroupCreationDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date GroupCreationDate;
	
	@Column(name="GroupModifiedDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date GroupModifiedDate;
	
	public long getGroupID() {
		return GroupID;
	}
	public void setGroupID(long groupID) {
		GroupID = groupID;
	}
	public long getGroupOwnerID() {
		return GroupOwnerID;
	}
	public void setGroupOwnerID(long groupOwnerID) {
		GroupOwnerID = groupOwnerID;
	}
	public String getGroupOwnerName() {
		return GroupOwnerName;
	}
	public void setGroupOwnerName(String groupOwnerName) {
		GroupOwnerName = groupOwnerName;
	}
	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public String getGroupDesc() {
		return GroupDesc;
	}
	public void setGroupDesc(String groupDesc) {
		GroupDesc = groupDesc;
	}
	public int getGroupOption() {
		return GroupOption;
	}
	public void setGroupOption(int groupOption) {
		GroupOption = groupOption;
	}
	public Date getGroupCreationDate() {
		return GroupCreationDate;
	}
	public void setGroupCreationDate(Date groupCreationDate) {
		GroupCreationDate = groupCreationDate;
	}
	public Date getGroupModifiedDate() {
		return GroupModifiedDate;
	}
	public void setGroupModifiedDate(Date groupModifiedDate) {
		GroupModifiedDate = groupModifiedDate;
	}
	

}
