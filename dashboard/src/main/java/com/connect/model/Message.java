package com.connect.model;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Message entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmessage")
public class Message implements java.io.Serializable {

	// Fields

	private Integer messageId;
	private String folderName;
	private Integer memberId;
	private Integer messageSenderId;
	private String messageSenderName;
	private String messageToList;
	private String messageCcList;
	private String messageBccList;
	private String messageTopic;
	private String messageBody;
	private Integer messageType;
	private Integer messageOption;
	private Integer messageStatus;
	private Integer messageReadStatus;
	private Integer messageNotify;
	private String messageIcon;
	private Integer messageAttachCount;
	private String messageIp;
	private Timestamp messageCreationDate;

	// Constructors

	/** default constructor */
	public Message() {
	}

	/** minimal constructor */
	public Message(String folderName, Integer memberId,
			Integer messageSenderId, String messageSenderName,
			String messageToList, String messageTopic, String messageBody,
			Integer messageType, Integer messageOption, Integer messageStatus,
			Integer messageReadStatus, Integer messageNotify,
			String messageIcon, Integer messageAttachCount, String messageIp,
			Timestamp messageCreationDate) {
		this.folderName = folderName;
		this.memberId = memberId;
		this.messageSenderId = messageSenderId;
		this.messageSenderName = messageSenderName;
		this.messageToList = messageToList;
		this.messageTopic = messageTopic;
		this.messageBody = messageBody;
		this.messageType = messageType;
		this.messageOption = messageOption;
		this.messageStatus = messageStatus;
		this.messageReadStatus = messageReadStatus;
		this.messageNotify = messageNotify;
		this.messageIcon = messageIcon;
		this.messageAttachCount = messageAttachCount;
		this.messageIp = messageIp;
		this.messageCreationDate = messageCreationDate;
	}

	/** full constructor */
	public Message(String folderName, Integer memberId,
			Integer messageSenderId, String messageSenderName,
			String messageToList, String messageCcList, String messageBccList,
			String messageTopic, String messageBody, Integer messageType,
			Integer messageOption, Integer messageStatus,
			Integer messageReadStatus, Integer messageNotify,
			String messageIcon, Integer messageAttachCount, String messageIp,
			Timestamp messageCreationDate) {
		this.folderName = folderName;
		this.memberId = memberId;
		this.messageSenderId = messageSenderId;
		this.messageSenderName = messageSenderName;
		this.messageToList = messageToList;
		this.messageCcList = messageCcList;
		this.messageBccList = messageBccList;
		this.messageTopic = messageTopic;
		this.messageBody = messageBody;
		this.messageType = messageType;
		this.messageOption = messageOption;
		this.messageStatus = messageStatus;
		this.messageReadStatus = messageReadStatus;
		this.messageNotify = messageNotify;
		this.messageIcon = messageIcon;
		this.messageAttachCount = messageAttachCount;
		this.messageIp = messageIp;
		this.messageCreationDate = messageCreationDate;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MessageID", unique = true, nullable = false)
	public Integer getMessageId() {
		return this.messageId;
	}

	public void setMessageId(Integer messageId) {
		this.messageId = messageId;
	}

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

	@Column(name = "MessageSenderID", nullable = false)
	public Integer getMessageSenderId() {
		return this.messageSenderId;
	}

	public void setMessageSenderId(Integer messageSenderId) {
		this.messageSenderId = messageSenderId;
	}

	@Column(name = "MessageSenderName", nullable = false, length = 30)
	public String getMessageSenderName() {
		return this.messageSenderName;
	}

	public void setMessageSenderName(String messageSenderName) {
		this.messageSenderName = messageSenderName;
	}

	@Column(name = "MessageToList", nullable = false, length = 250)
	public String getMessageToList() {
		return this.messageToList;
	}

	public void setMessageToList(String messageToList) {
		this.messageToList = messageToList;
	}

	@Column(name = "MessageCcList", length = 250)
	public String getMessageCcList() {
		return this.messageCcList;
	}

	public void setMessageCcList(String messageCcList) {
		this.messageCcList = messageCcList;
	}

	@Column(name = "MessageBccList", length = 250)
	public String getMessageBccList() {
		return this.messageBccList;
	}

	public void setMessageBccList(String messageBccList) {
		this.messageBccList = messageBccList;
	}

	@Column(name = "MessageTopic", nullable = false, length = 250)
	public String getMessageTopic() {
		return this.messageTopic;
	}

	public void setMessageTopic(String messageTopic) {
		this.messageTopic = messageTopic;
	}

	@Column(name = "MessageBody", nullable = false, length = 65535)
	public String getMessageBody() {
		return this.messageBody;
	}

	public void setMessageBody(String messageBody) {
		this.messageBody = messageBody;
	}

	@Column(name = "MessageType", nullable = false)
	public Integer getMessageType() {
		return this.messageType;
	}

	public void setMessageType(Integer messageType) {
		this.messageType = messageType;
	}

	@Column(name = "MessageOption", nullable = false)
	public Integer getMessageOption() {
		return this.messageOption;
	}

	public void setMessageOption(Integer messageOption) {
		this.messageOption = messageOption;
	}

	@Column(name = "MessageStatus", nullable = false)
	public Integer getMessageStatus() {
		return this.messageStatus;
	}

	public void setMessageStatus(Integer messageStatus) {
		this.messageStatus = messageStatus;
	}

	@Column(name = "MessageReadStatus", nullable = false)
	public Integer getMessageReadStatus() {
		return this.messageReadStatus;
	}

	public void setMessageReadStatus(Integer messageReadStatus) {
		this.messageReadStatus = messageReadStatus;
	}

	@Column(name = "MessageNotify", nullable = false)
	public Integer getMessageNotify() {
		return this.messageNotify;
	}

	public void setMessageNotify(Integer messageNotify) {
		this.messageNotify = messageNotify;
	}

	@Column(name = "MessageIcon", nullable = false, length = 10)
	public String getMessageIcon() {
		return this.messageIcon;
	}

	public void setMessageIcon(String messageIcon) {
		this.messageIcon = messageIcon;
	}

	@Column(name = "MessageAttachCount", nullable = false)
	public Integer getMessageAttachCount() {
		return this.messageAttachCount;
	}

	public void setMessageAttachCount(Integer messageAttachCount) {
		this.messageAttachCount = messageAttachCount;
	}

	@Column(name = "MessageIP", nullable = false, length = 20)
	public String getMessageIp() {
		return this.messageIp;
	}

	public void setMessageIp(String messageIp) {
		this.messageIp = messageIp;
	}

	@Column(name = "MessageCreationDate", nullable = false, length = 19)
	public Timestamp getMessageCreationDate() {
		return this.messageCreationDate;
	}

	public void setMessageCreationDate(Timestamp messageCreationDate) {
		this.messageCreationDate = messageCreationDate;
	}

}