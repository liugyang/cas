package com.connect.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * FavoriteThreadId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class FavoriteThreadId implements java.io.Serializable {

	// Fields

	private Integer memberId;
	private Integer threadId;

	// Constructors

	/** default constructor */
	public FavoriteThreadId() {
	}

	/** full constructor */
	public FavoriteThreadId(Integer memberId, Integer threadId) {
		this.memberId = memberId;
		this.threadId = threadId;
	}

	// Property accessors

	@Column(name = "MemberID", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "ThreadID", nullable = false)
	public Integer getThreadId() {
		return this.threadId;
	}

	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FavoriteThreadId))
			return false;
		FavoriteThreadId castOther = (FavoriteThreadId) other;

		return ((this.getMemberId() == castOther.getMemberId()) || (this
				.getMemberId() != null && castOther.getMemberId() != null && this
				.getMemberId().equals(castOther.getMemberId())))
				&& ((this.getThreadId() == castOther.getThreadId()) || (this
						.getThreadId() != null
						&& castOther.getThreadId() != null && this
						.getThreadId().equals(castOther.getThreadId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMemberId() == null ? 0 : this.getMemberId().hashCode());
		result = 37 * result
				+ (getThreadId() == null ? 0 : this.getThreadId().hashCode());
		return result;
	}

}