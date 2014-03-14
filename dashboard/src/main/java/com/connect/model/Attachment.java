package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Attachment entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tpmattachment")
public class Attachment implements java.io.Serializable {

	// Fields

	private Integer attachId;
	private Integer postId;
	private Integer memberId;
	private String attachFilename;
	private Integer attachFileSize;
	private String attachMimeType;
	private String attachDesc;
	private String attachCreationIp;
	private Timestamp attachCreationDate;
	private Timestamp attachModifiedDate;
	private Integer attachDownloadCount;
	private Integer attachOption;
	private Integer attachStatus;

	// Constructors

	/** default constructor */
	public Attachment() {
	}

	/** full constructor */
	public Attachment(Integer postId, Integer memberId, String attachFilename,
			Integer attachFileSize, String attachMimeType, String attachDesc,
			String attachCreationIp, Timestamp attachCreationDate,
			Timestamp attachModifiedDate, Integer attachDownloadCount,
			Integer attachOption, Integer attachStatus) {
		this.postId = postId;
		this.memberId = memberId;
		this.attachFilename = attachFilename;
		this.attachFileSize = attachFileSize;
		this.attachMimeType = attachMimeType;
		this.attachDesc = attachDesc;
		this.attachCreationIp = attachCreationIp;
		this.attachCreationDate = attachCreationDate;
		this.attachModifiedDate = attachModifiedDate;
		this.attachDownloadCount = attachDownloadCount;
		this.attachOption = attachOption;
		this.attachStatus = attachStatus;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "AttachID", unique = true, nullable = false)
	public Integer getAttachId() {
		return this.attachId;
	}

	public void setAttachId(Integer attachId) {
		this.attachId = attachId;
	}

	@Column(name = "PostID", nullable = false)
	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	@Column(name = "MemberID", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "AttachFilename", nullable = false, length = 250)
	public String getAttachFilename() {
		return this.attachFilename;
	}

	public void setAttachFilename(String attachFilename) {
		this.attachFilename = attachFilename;
	}

	@Column(name = "AttachFileSize", nullable = false)
	public Integer getAttachFileSize() {
		return this.attachFileSize;
	}

	public void setAttachFileSize(Integer attachFileSize) {
		this.attachFileSize = attachFileSize;
	}

	@Column(name = "AttachMimeType", nullable = false, length = 70)
	public String getAttachMimeType() {
		return this.attachMimeType;
	}

	public void setAttachMimeType(String attachMimeType) {
		this.attachMimeType = attachMimeType;
	}

	@Column(name = "AttachDesc", nullable = false, length = 65535)
	public String getAttachDesc() {
		return this.attachDesc;
	}

	public void setAttachDesc(String attachDesc) {
		this.attachDesc = attachDesc;
	}

	@Column(name = "AttachCreationIP", nullable = false, length = 20)
	public String getAttachCreationIp() {
		return this.attachCreationIp;
	}

	public void setAttachCreationIp(String attachCreationIp) {
		this.attachCreationIp = attachCreationIp;
	}

	@Column(name = "AttachCreationDate", nullable = false, length = 19)
	public Timestamp getAttachCreationDate() {
		return this.attachCreationDate;
	}

	public void setAttachCreationDate(Timestamp attachCreationDate) {
		this.attachCreationDate = attachCreationDate;
	}

	@Column(name = "AttachModifiedDate", nullable = false, length = 19)
	public Timestamp getAttachModifiedDate() {
		return this.attachModifiedDate;
	}

	public void setAttachModifiedDate(Timestamp attachModifiedDate) {
		this.attachModifiedDate = attachModifiedDate;
	}

	@Column(name = "AttachDownloadCount", nullable = false)
	public Integer getAttachDownloadCount() {
		return this.attachDownloadCount;
	}

	public void setAttachDownloadCount(Integer attachDownloadCount) {
		this.attachDownloadCount = attachDownloadCount;
	}

	@Column(name = "AttachOption", nullable = false)
	public Integer getAttachOption() {
		return this.attachOption;
	}

	public void setAttachOption(Integer attachOption) {
		this.attachOption = attachOption;
	}

	@Column(name = "AttachStatus", nullable = false)
	public Integer getAttachStatus() {
		return this.attachStatus;
	}

	public void setAttachStatus(Integer attachStatus) {
		this.attachStatus = attachStatus;
	}

}