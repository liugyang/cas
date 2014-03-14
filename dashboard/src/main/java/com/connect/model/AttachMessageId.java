package com.connect.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AttachMessageId entity. @author MyEclipse Persistence Tools
 */
@Embeddable
public class AttachMessageId implements java.io.Serializable {

	// Fields

	private Integer messageId;
	private Integer pmAttachId;

	// Constructors

	/** default constructor */
	public AttachMessageId() {
	}

	/** full constructor */
	public AttachMessageId(Integer messageId, Integer pmAttachId) {
		this.messageId = messageId;
		this.pmAttachId = pmAttachId;
	}

	// Property accessors

	@Column(name = "MessageID", nullable = false)
	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

	@Column(name = "PmAttachID", nullable = false)
	public Integer getPmAttachId() {
		return this.pmAttachId;
	}

	public void setPmAttachId(Integer pmAttachId) {
		this.pmAttachId = pmAttachId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AttachMessageId))
			return false;
		AttachMessageId castOther = (AttachMessageId) other;

		return ((this.getMessageId() == castOther.getMessageId()) || (this
				.getMessageId() != null && castOther.getMessageId() != null && this
				.getMessageId().equals(castOther.getMessageId())))
				&& ((this.getPmAttachId() == castOther.getPmAttachId()) || (this
						.getPmAttachId() != null
						&& castOther.getPmAttachId() != null && this
						.getPmAttachId().equals(castOther.getPmAttachId())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMessageId() == null ? 0 : this.getMessageId().hashCode());
		result = 37
				* result
				+ (getPmAttachId() == null ? 0 : this.getPmAttachId()
						.hashCode());
		return result;
	}

}