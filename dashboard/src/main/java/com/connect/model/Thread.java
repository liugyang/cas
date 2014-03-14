package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Thread entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tthread")
public class Thread implements java.io.Serializable {

	// Fields

	private Integer threadId;
	private Integer forumId;
	private String memberName;
	private String lastPostMemberName;
	private String threadTopic;
	private String threadBody;
	private Integer threadVoteCount;
	private Integer threadVoteTotalStars;
	private Timestamp threadCreationDate;
	private Timestamp threadLastPostDate;
	private Integer threadType;
	private Integer threadPriority;
	private Integer threadOption;
	private Integer threadStatus;
	private Integer threadHasPoll;
	private Integer threadViewCount;
	private Integer threadReplyCount;
	private String threadIcon;
	private Integer threadDuration;
	private Integer threadAttachCount;

	// Constructors

	/** default constructor */
	public Thread() {
	}

	/** full constructor */
	public Thread(Integer forumId, String memberName,
			String lastPostMemberName, String threadTopic, String threadBody,
			Integer threadVoteCount, Integer threadVoteTotalStars,
			Timestamp threadCreationDate, Timestamp threadLastPostDate,
			Integer threadType, Integer threadPriority, Integer threadOption,
			Integer threadStatus, Integer threadHasPoll,
			Integer threadViewCount, Integer threadReplyCount,
			String threadIcon, Integer threadDuration, Integer threadAttachCount) {
		this.forumId = forumId;
		this.memberName = memberName;
		this.lastPostMemberName = lastPostMemberName;
		this.threadTopic = threadTopic;
		this.threadBody = threadBody;
		this.threadVoteCount = threadVoteCount;
		this.threadVoteTotalStars = threadVoteTotalStars;
		this.threadCreationDate = threadCreationDate;
		this.threadLastPostDate = threadLastPostDate;
		this.threadType = threadType;
		this.threadPriority = threadPriority;
		this.threadOption = threadOption;
		this.threadStatus = threadStatus;
		this.threadHasPoll = threadHasPoll;
		this.threadViewCount = threadViewCount;
		this.threadReplyCount = threadReplyCount;
		this.threadIcon = threadIcon;
		this.threadDuration = threadDuration;
		this.threadAttachCount = threadAttachCount;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ThreadID", unique = true, nullable = false)
	public Integer getThreadId() {
		return this.threadId;
	}

	public void setThreadId(Integer threadId) {
		this.threadId = threadId;
	}

	@Column(name = "ForumID", nullable = false)
	public Integer getForumId() {
		return this.forumId;
	}

	public void setForumId(Integer forumId) {
		this.forumId = forumId;
	}

	@Column(name = "MemberName", nullable = false, length = 30)
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Column(name = "LastPostMemberName", nullable = false, length = 30)
	public String getLastPostMemberName() {
		return this.lastPostMemberName;
	}

	public void setLastPostMemberName(String lastPostMemberName) {
		this.lastPostMemberName = lastPostMemberName;
	}

	@Column(name = "ThreadTopic", nullable = false, length = 250)
	public String getThreadTopic() {
		return this.threadTopic;
	}

	public void setThreadTopic(String threadTopic) {
		this.threadTopic = threadTopic;
	}

	@Column(name = "ThreadBody", nullable = false, length = 65535)
	public String getThreadBody() {
		return this.threadBody;
	}

	public void setThreadBody(String threadBody) {
		this.threadBody = threadBody;
	}

	@Column(name = "ThreadVoteCount", nullable = false)
	public Integer getThreadVoteCount() {
		return this.threadVoteCount;
	}

	public void setThreadVoteCount(Integer threadVoteCount) {
		this.threadVoteCount = threadVoteCount;
	}

	@Column(name = "ThreadVoteTotalStars", nullable = false)
	public Integer getThreadVoteTotalStars() {
		return this.threadVoteTotalStars;
	}

	public void setThreadVoteTotalStars(Integer threadVoteTotalStars) {
		this.threadVoteTotalStars = threadVoteTotalStars;
	}

	@Column(name = "ThreadCreationDate", nullable = false, length = 19)
	public Timestamp getThreadCreationDate() {
		return this.threadCreationDate;
	}

	public void setThreadCreationDate(Timestamp threadCreationDate) {
		this.threadCreationDate = threadCreationDate;
	}

	@Column(name = "ThreadLastPostDate", nullable = false, length = 19)
	public Timestamp getThreadLastPostDate() {
		return this.threadLastPostDate;
	}

	public void setThreadLastPostDate(Timestamp threadLastPostDate) {
		this.threadLastPostDate = threadLastPostDate;
	}

	@Column(name = "ThreadType", nullable = false)
	public Integer getThreadType() {
		return this.threadType;
	}

	public void setThreadType(Integer threadType) {
		this.threadType = threadType;
	}

	@Column(name = "ThreadPriority", nullable = false)
	public Integer getThreadPriority() {
		return this.threadPriority;
	}

	public void setThreadPriority(Integer threadPriority) {
		this.threadPriority = threadPriority;
	}

	@Column(name = "ThreadOption", nullable = false)
	public Integer getThreadOption() {
		return this.threadOption;
	}

	public void setThreadOption(Integer threadOption) {
		this.threadOption = threadOption;
	}

	@Column(name = "ThreadStatus", nullable = false)
	public Integer getThreadStatus() {
		return this.threadStatus;
	}

	public void setThreadStatus(Integer threadStatus) {
		this.threadStatus = threadStatus;
	}

	@Column(name = "ThreadHasPoll", nullable = false)
	public Integer getThreadHasPoll() {
		return this.threadHasPoll;
	}

	public void setThreadHasPoll(Integer threadHasPoll) {
		this.threadHasPoll = threadHasPoll;
	}

	@Column(name = "ThreadViewCount", nullable = false)
	public Integer getThreadViewCount() {
		return this.threadViewCount;
	}

	public void setThreadViewCount(Integer threadViewCount) {
		this.threadViewCount = threadViewCount;
	}

	@Column(name = "ThreadReplyCount", nullable = false)
	public Integer getThreadReplyCount() {
		return this.threadReplyCount;
	}

	public void setThreadReplyCount(Integer threadReplyCount) {
		this.threadReplyCount = threadReplyCount;
	}

	@Column(name = "ThreadIcon", nullable = false, length = 10)
	public String getThreadIcon() {
		return this.threadIcon;
	}

	public void setThreadIcon(String threadIcon) {
		this.threadIcon = threadIcon;
	}

	@Column(name = "ThreadDuration", nullable = false)
	public Integer getThreadDuration() {
		return this.threadDuration;
	}

	public void setThreadDuration(Integer threadDuration) {
		this.threadDuration = threadDuration;
	}

	@Column(name = "ThreadAttachCount", nullable = false)
	public Integer getThreadAttachCount() {
		return this.threadAttachCount;
	}

	public void setThreadAttachCount(Integer threadAttachCount) {
		this.threadAttachCount = threadAttachCount;
	}

}