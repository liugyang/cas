package com.connect.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MessageFolderId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class MessageFolderId implements java.io.Serializable {

	// Fields

	private String folderName;
	private Integer memberId;

	// Constructors

	/** default constructor */
	public MessageFolderId() {
	}

	/** full constructor */
	public MessageFolderId(String folderName, Integer memberId) {
		this.folderName = folderName;
		this.memberId = memberId;
	}

	// Property accessors

	@Column(name = "FolderName", nullable = false, length = 30)
	public String getFolderName() {
		return this.folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
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
		if (!(other instanceof MessageFolderId))
			return false;
		MessageFolderId castOther = (MessageFolderId) other;

		return ((this.getFolderName() == castOther.getFolderName()) || (this
				.getFolderName() != null && castOther.getFolderName() != null && this
				.getFolderName().equals(castOther.getFolderName())))
				&& ((this.getMemberId() == castOther.getMemberId()) || (this
						.getMemberId() != null
						&& castOther.getMemberId() != null && this
						.getMemberId().equals(castOther.getMemberId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getFolderName() == null ? 0 : this.getFolderName()
						.hashCode());
		result = 37 * result
				+ (getMemberId() == null ? 0 : this.getMemberId().hashCode());
		return result;
	}

}