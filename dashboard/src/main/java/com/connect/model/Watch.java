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
 * Watch entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "twatch", uniqueConstraints = @UniqueConstraint(columnNames = {
		"MemberID", "CategoryID", "ForumID", "ThreadID" }))
public class Watch implements java.io.Serializable {

	// Fields

	private Integer watchId;
	private Integer memberId;
	private Integer categoryId;
	private Integer forumId;
	private Integer threadId;
	private Integer watchType;
	private Integer watchOption;
	private Integer watchStatus;
	private Timestamp watchCreationDate;
	private Timestamp watchLastSentDate;
	private Timestamp watchEndDate;

	// Constructors

	/** default constructor */
	public Watch() {
	}

	/** full constructor */
	public Watch(Integer memberId, Integer categoryId, Integer forumId,
			Integer threadId, Integer watchType, Integer watchOption,
			Integer watchStatus, Timestamp watchCreationDate,
			Timestamp watchLastSentDate, Timestamp watchEndDate) {
		this.memberId = memberId;
		this.categoryId = categoryId;
		this.forumId = forumId;
		this.threadId = threadId;
		this.watchType = watchType;
		this.watchOption = watchOption;
		this.watchStatus = watchStatus;
		this.watchCreationDate = watchCreationDate;
		this.watchLastSentDate = watchLastSentDate;
		this.watchEndDate = watchEndDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "WatchID", unique = true, nullable = false)
	public Integer getWatchId() {
		return this.watchId;
	}

	public void setWatchId(Integer watchId) {
		this.watchId = watchId;
	}

	@Column(name = "MemberID", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "CategoryID", nullable = false)
	public Integer getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Column(name = "ForumID", nullable = false)
	public Integer getForumId() {
		return this.forumId;
	}

	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}

	@Column(name = "ThreadID", nullable = false)
	public Integer getThreadId() {
		return this.threadId;
	}

	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}

	@Column(name = "WatchType", nullable = false)
	public Integer getWatchType() {
		return this.watchType;
	}

	public void setWatchType(Integer watchType) {
		this.watchType = watchType;
	}

	@Column(name = "WatchOption", nullable = false)
	public Integer getWatchOption() {
		return this.watchOption;
	}

	public void setWatchOption(Integer watchOption) {
		this.watchOption = watchOption;
	}

	@Column(name = "WatchStatus", nullable = false)
	public Integer getWatchStatus() {
		return this.watchStatus;
	}

	public void setWatchStatus(Integer watchStatus) {
		this.watchStatus = watchStatus;
	}

	@Column(name = "WatchCreationDate", nullable = false, length = 19)
	public Timestamp getWatchCreationDate() {
		return this.watchCreationDate;
	}

	public void setWatchCreationDate(Timestamp watchCreationDate) {
		this.watchCreationDate = watchCreationDate;
	}

	@Column(name = "WatchLastSentDate", nullable = false, length = 19)
	public Timestamp getWatchLastSentDate() {
		return this.watchLastSentDate;
	}

	public void setWatchLastSentDate(Timestamp watchLastSentDate) {
		this.watchLastSentDate = watchLastSentDate;
	}

	@Column(name = "WatchEndDate", nullable = false, length = 19)
	public Timestamp getWatchEndDate() {
		return this.watchEndDate;
	}

	public void setWatchEndDate(Timestamp watchEndDate) {
		this.watchEndDate = watchEndDate;
	}

}