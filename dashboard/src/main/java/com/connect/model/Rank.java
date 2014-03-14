package com.connect.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

/**
 * rank entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "trank",uniqueConstraints = {
		@UniqueConstraint(columnNames = "RankMinPosts"),
		@UniqueConstraint(columnNames = "RankTitle") })
public class Rank implements java.io.Serializable {

	// Fields

	private Integer rankId;
	private Integer rankMinPosts;
	private Integer rankLevel;
	private String rankTitle;
	private String rankImage;
	private Integer rankType;
	private Integer rankOption;

	// Constructors

	/** default constructor */
	public Rank() {
	}

	/** full constructor */
	public Rank(Integer rankMinPosts, Integer rankLevel, String rankTitle,
			String rankImage, Integer rankType, Integer rankOption) {
		this.rankMinPosts = rankMinPosts;
		this.rankLevel = rankLevel;
		this.rankTitle = rankTitle;
		this.rankImage = rankImage;
		this.rankType = rankType;
		this.rankOption = rankOption;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "RankID", unique = true, nullable = false)
	public Integer getRankId() {
		return this.rankId;
	}

	public void setRankId(Integer rankId) {
		this.rankId = rankId;
	}

	@Column(name = "RankMinPosts", unique = true, nullable = false)
	public Integer getRankMinPosts() {
		return this.rankMinPosts;
	}

	public void setRankMinPosts(Integer rankMinPosts) {
		this.rankMinPosts = rankMinPosts;
	}

	@Column(name = "RankLevel", nullable = false)
	public Integer getRankLevel() {
		return this.rankLevel;
	}

	public void setRankLevel(Integer rankLevel) {
		this.rankLevel = rankLevel;
	}

	@Column(name = "RankTitle", unique = true, nullable = false, length = 250)
	public String getRankTitle() {
		return this.rankTitle;
	}

	public void setRankTitle(String rankTitle) {
		this.rankTitle = rankTitle;
	}

	@Column(name = "RankImage", nullable = false, length = 250)
	public String getRankImage() {
		return this.rankImage;
	}

	public void setRankImage(String rankImage) {
		this.rankImage = rankImage;
	}

	@Column(name = "RankType", nullable = false)
	public Integer getRankType() {
		return this.rankType;
	}

	public void setRankType(Integer rankType) {
		this.rankType = rankType;
	}

	@Column(name = "RankOption", nullable = false)
	public Integer getRankOption() {
		return this.rankOption;
	}

	public void setRankOption(Integer rankOption) {
		this.rankOption = rankOption;
	}

}