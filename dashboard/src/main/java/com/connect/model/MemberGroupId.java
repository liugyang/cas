package com.connect.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MemberGroupId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class MemberGroupId implements java.io.Serializable {

	// Fields

	private Integer groupId;
	private Integer memberId;

	// Constructors

	/** default constructor */
	public MemberGroupId() {
	}

	/** full constructor */
	public MemberGroupId(Integer groupId, Integer memberId) {
		this.groupId = groupId;
		this.memberId = memberId;
	}

	// Property accessors

	@Column(name = "GroupID", nullable = false)
	public Integer getGroupId() {
		return this.groupId;
	}

	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}

	@Column(name = "MemberID", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MemberGroupId))
			return false;
		MemberGroupId castOther = (MemberGroupId) other;

		return ((this.getGroupId() == castOther.getGroupId()) || (this
				.getGroupId() != null && castOther.getGroupId() != null && this
				.getGroupId().equals(castOther.getGroupId())))
				&& ((this.getMemberId() == castOther.getMemberId()) || (this
						.getMemberId() != null
						&& castOther.getMemberId() != null && this
						.getMemberId().equals(castOther.getMemberId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getGroupId() == null ? 0 : this.getGroupId().hashCode());
		result = 37 * result
				+ (getMemberId() == null ? 0 : this.getMemberId().hashCode());
		return result;
	}

}