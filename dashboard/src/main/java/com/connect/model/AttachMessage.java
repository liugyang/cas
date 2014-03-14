package com.connect.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AttachMessage entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tpmattachmessage")
public class AttachMessage implements java.io.Serializable {

	// Fields

	private AttachMessageId id;
	private Integer relationType;
	private Integer relationOption;
	private Integer relationStatus;

	// Constructors

	/** default constructor */
	public AttachMessage() {
	}

	/** full constructor */
	public AttachMessage(AttachMessageId id, Integer relationType,
			Integer relationOption, Integer relationStatus) {
		this.id = id;
		this.relationType = relationType;
		this.relationOption = relationOption;
		this.relationStatus = relationStatus;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "messageId", column = @Column(name = "MessageID", nullable = false)),
			@AttributeOverride(name = "pmAttachId", column = @Column(name = "PmAttachID", nullable = false)) })
	public AttachMessageId getId() {
		return this.id;
	}

	public void setId(AttachMessageId id) {
		this.id = id;
	}

	@Column(name = "RelationType", nullable = false)
	public Integer getRelationType() {
		return this.relationType;
	}

	public void setRelationType(Integer relationType) {
		this.relationType = relationType;
	}

	@Column(name = "RelationOption", nullable = false)
	public Integer getRelationOption() {
		return this.relationOption;
	}

	public void setRelationOption(Integer relationOption) {
		this.relationOption = relationOption;
	}

	@Column(name = "RelationStatus", nullable = false)
	public Integer getRelationStatus() {
		return this.relationStatus;
	}

	public void setRelationStatus(Integer relationStatus) {
		this.relationStatus = relationStatus;
	}

}