package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Post entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tpost")
public class Post implements java.io.Serializable {

	// Fields

	private Integer postId;
	private Integer parentPostId;
	private Integer forumId;
	private Integer threadId;
	private Integer memberId;
	private String memberName;
	private String lastEditMemberName;
	private String postTopic;
	private String postBody;
	private Timestamp postCreationDate;
	private Timestamp postLastEditDate;
	private String postCreationIp;
	private String postLastEditIp;
	private Short postEditCount;
	private Integer postFormatOption;
	private Integer postOption;
	private Integer postStatus;
	private String postIcon;
	private Short postAttachCount;

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** full constructor */
	public Post(Integer parentPostId, Integer forumId, Integer threadId,
			Integer memberId, String memberName, String lastEditMemberName,
			String postTopic, String postBody, Timestamp postCreationDate,
			Timestamp postLastEditDate, String postCreationIp,
			String postLastEditIp, Short postEditCount,
			Integer postFormatOption, Integer postOption, Integer postStatus,
			String postIcon, Short postAttachCount) {
		this.parentPostId = parentPostId;
		this.forumId = forumId;
		this.threadId = threadId;
		this.memberId = memberId;
		this.memberName = memberName;
		this.lastEditMemberName = lastEditMemberName;
		this.postTopic = postTopic;
		this.postBody = postBody;
		this.postCreationDate = postCreationDate;
		this.postLastEditDate = postLastEditDate;
		this.postCreationIp = postCreationIp;
		this.postLastEditIp = postLastEditIp;
		this.postEditCount = postEditCount;
		this.postFormatOption = postFormatOption;
		this.postOption = postOption;
		this.postStatus = postStatus;
		this.postIcon = postIcon;
		this.postAttachCount = postAttachCount;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "PostID", unique = true, nullable = false)
	public Integer getPostId() {
		return this.postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	@Column(name = "ParentPostID", nullable = false)
	public Integer getParentPostId() {
		return this.parentPostId;
	}

	public void setParentPostId(Integer parentPostId) {
		this.parentPostId = parentPostId;
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

	@Column(name = "MemberID", nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "MemberName", nullable = false, length = 30)
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Column(name = "LastEditMemberName", nullable = false, length = 30)
	public String getLastEditMemberName() {
		return this.lastEditMemberName;
	}

	public void setLastEditMemberName(String lastEditMemberName) {
		this.lastEditMemberName = lastEditMemberName;
	}

	@Column(name = "PostTopic", nullable = false, length = 250)
	public String getPostTopic() {
		return this.postTopic;
	}

	public void setPostTopic(String postTopic) {
		this.postTopic = postTopic;
	}

	@Column(name = "PostBody", nullable = false, length = 65535)
	public String getPostBody() {
		return this.postBody;
	}

	public void setPostBody(String postBody) {
		this.postBody = postBody;
	}

	@Column(name = "PostCreationDate", nullable = false, length = 19)
	public Timestamp getPostCreationDate() {
		return this.postCreationDate;
	}

	public void setPostCreationDate(Timestamp postCreationDate) {
		this.postCreationDate = postCreationDate;
	}

	@Column(name = "PostLastEditDate", nullable = false, length = 19)
	public Timestamp getPostLastEditDate() {
		return this.postLastEditDate;
	}

	public void setPostLastEditDate(Timestamp postLastEditDate) {
		this.postLastEditDate = postLastEditDate;
	}

	@Column(name = "PostCreationIP", nullable = false, length = 20)
	public String getPostCreationIp() {
		return this.postCreationIp;
	}

	public void setPostCreationIp(String postCreationIp) {
		this.postCreationIp = postCreationIp;
	}

	@Column(name = "PostLastEditIP", nullable = false, length = 20)
	public String getPostLastEditIp() {
		return this.postLastEditIp;
	}

	public void setPostLastEditIp(String postLastEditIp) {
		this.postLastEditIp = postLastEditIp;
	}

	@Column(name = "PostEditCount", nullable = false)
	public Short getPostEditCount() {
		return this.postEditCount;
	}

	public void setPostEditCount(Short postEditCount) {
		this.postEditCount = postEditCount;
	}

	@Column(name = "PostFormatOption", nullable = false)
	public Integer getPostFormatOption() {
		return this.postFormatOption;
	}

	public void setPostFormatOption(Integer postFormatOption) {
		this.postFormatOption = postFormatOption;
	}

	@Column(name = "PostOption", nullable = false)
	public Integer getPostOption() {
		return this.postOption;
	}

	public void setPostOption(Integer postOption) {
		this.postOption = postOption;
	}

	@Column(name = "PostStatus", nullable = false)
	public Integer getPostStatus() {
		return this.postStatus;
	}

	public void setPostStatus(Integer postStatus) {
		this.postStatus = postStatus;
	}

	@Column(name = "PostIcon", nullable = false, length = 10)
	public String getPostIcon() {
		return this.postIcon;
	}

	public void setPostIcon(String postIcon) {
		this.postIcon = postIcon;
	}

	@Column(name = "PostAttachCount", nullable = false)
	public Short getPostAttachCount() {
		return this.postAttachCount;
	}

	public void setPostAttachCount(Short postAttachCount) {
		this.postAttachCount = postAttachCount;
	}

}