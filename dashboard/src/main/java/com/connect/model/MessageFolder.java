package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * MessageFolder entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmessagefolder")
public class MessageFolder implements java.io.Serializable {

	// Fields

	private MessageFolderId id;
	private Short folderOrder;
	private Integer folderStatus;
	private Integer folderOption;
	private Integer folderType;
	private Timestamp folderCreationDate;
	private Timestamp folderModifiedDate;

	// Constructors

	/** default constructor */
	public MessageFolder() {
	}

	/** full constructor */
	public MessageFolder(MessageFolderId id, Short folderOrder,
			Integer folderStatus, Integer folderOption, Integer folderType,
			Timestamp folderCreationDate, Timestamp folderModifiedDate) {
		this.id = id;
		this.folderOrder = folderOrder;
		this.folderStatus = folderStatus;
		this.folderOption = folderOption;
		this.folderType = folderType;
		this.folderCreationDate = folderCreationDate;
		this.folderModifiedDate = folderModifiedDate;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "folderName", column = @Column(name = "FolderName", nullable = false, length = 30)),
			@AttributeOverride(name = "memberId", column = @Column(name = "MemberID", nullable = false)) })
	public MessageFolderId getId() {
		return this.id;
	}

	public void setId(MessageFolderId id) {
		this.id = id;
	}

	@Column(name = "FolderOrder", nullable = false)
	public Short getFolderOrder() {
		return this.folderOrder;
	}

	public void setFolderOrder(Short folderOrder) {
		this.folderOrder = folderOrder;
	}

	@Column(name = "FolderStatus", nullable = false)
	public Integer getFolderStatus() {
		return this.folderStatus;
	}

	public void setFolderStatus(Integer folderStatus) {
		this.folderStatus = folderStatus;
	}

	@Column(name = "FolderOption", nullable = false)
	public Integer getFolderOption() {
		return this.folderOption;
	}

	public void setFolderOption(Integer folderOption) {
		this.folderOption = folderOption;
	}

	@Column(name = "FolderType", nullable = false)
	public Integer getFolderType() {
		return this.folderType;
	}

	public void setFolderType(Integer folderType) {
		this.folderType = folderType;
	}

	@Column(name = "FolderCreationDate", nullable = false, length = 19)
	public Timestamp getFolderCreationDate() {
		return this.folderCreationDate;
	}

	public void setFolderCreationDate(Timestamp folderCreationDate) {
		this.folderCreationDate = folderCreationDate;
	}

	@Column(name = "FolderModifiedDate", nullable = false, length = 19)
	public Timestamp getFolderModifiedDate() {
		return this.folderModifiedDate;
	}

	public void setFolderModifiedDate(Timestamp folderModifiedDate) {
		this.folderModifiedDate = folderModifiedDate;
	}

}