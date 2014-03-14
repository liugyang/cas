package com.connect.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Id;

import org.hibernate.annotations.Table;
import org.hibernate.annotations.Index;

@Entity
@Table(appliesTo="TMemberGroup", indexes = {@Index(name="MemberGroup_1_idx", columnNames={"MemberID"}), 
		@Index(name="MemberGroup_2_idx", columnNames={"GroupID"})})
public class MemberGroup1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="GroupID", nullable = false)
	private long GroupID;
	@Column(name="MemberID", nullable = false)
	private long MemberID;
	@Column(name="MemberName", length = 30, nullable = false)
	private String MemberName;
	@Column(name="MemberID", nullable = false)
	private int Privilege;
	@Column(name="CreationDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date CreationDate;
	@Column(name="ModifiedDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date ModifiedDate;
	public long getGroupID() {
		return GroupID;
	}
	public void setGroupID(long groupID) {
		GroupID = groupID;
	}
	public long getMemberID() {
		return MemberID;
	}
	public void setMemberID(long memberID) {
		MemberID = memberID;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public int getPrivilege() {
		return Privilege;
	}
	public void setPrivilege(int privilege) {
		Privilege = privilege;
	}
	public Date getCreationDate() {
		return CreationDate;
	}
	public void setCreationDate(Date creationDate) {
		CreationDate = creationDate;
	}
	public Date getModifiedDate() {
		return ModifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		ModifiedDate = modifiedDate;
	}
}
