package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * FavoriteThread entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tfavoritethread")
public class FavoriteThread implements java.io.Serializable {

	// Fields

	private FavoriteThreadId id;
	private Integer forumId;
	private Timestamp favoriteCreationDate;
	private Integer favoriteType;
	private Integer favoriteOption;
	private Integer favoriteStatus;

	// Constructors

	/** default constructor */
	public FavoriteThread() {
	}

	/** full constructor */
	public FavoriteThread(FavoriteThreadId id, Integer forumId,
			Timestamp favoriteCreationDate, Integer favoriteType,
			Integer favoriteOption, Integer favoriteStatus) {
		this.id = id;
		this.forumId = forumId;
		this.favoriteCreationDate = favoriteCreationDate;
		this.favoriteType = favoriteType;
		this.favoriteOption = favoriteOption;
		this.favoriteStatus = favoriteStatus;
	}

	// Property accessors
	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "memberId", column = @Column(name = "MemberID", nullable = false)),
			@AttributeOverride(name = "threadId", column = @Column(name = "ThreadID", nullable = false)) })
	public FavoriteThreadId getId() {
		return this.id;
	}

	public void setId(FavoriteThreadId id) {
		this.id = id;
	}

	@Column(name = "ForumID", nullable = false)
	public Integer getForumId() {
		return this.forumId;
	}

	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}

	@Column(name = "FavoriteCreationDate", nullable = false, length = 19)
	public Timestamp getFavoriteCreationDate() {
		return this.favoriteCreationDate;
	}

	public void setFavoriteCreationDate(Timestamp favoriteCreationDate) {
		this.favoriteCreationDate = favoriteCreationDate;
	}

	@Column(name = "FavoriteType", nullable = false)
	public Integer getFavoriteType() {
		return this.favoriteType;
	}

	public void setFavoriteType(Integer favoriteType) {
		this.favoriteType = favoriteType;
	}

	@Column(name = "FavoriteOption", nullable = false)
	public Integer getFavoriteOption() {
		return this.favoriteOption;
	}

	public void setFavoriteOption(Integer favoriteOption) {
		this.favoriteOption = favoriteOption;
	}

	@Column(name = "FavoriteStatus", nullable = false)
	public Integer getFavoriteStatus() {
		return this.favoriteStatus;
	}

	public void setFavoriteStatus(Integer favoriteStatus) {
		this.favoriteStatus = favoriteStatus;
	}

}