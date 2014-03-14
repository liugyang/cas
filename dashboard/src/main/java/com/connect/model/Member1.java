package com.connect.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="TMember")
public class Member1 {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="MemberID", nullable = false)
	private long MemberID;
	@Column(name="MemberName", length = 30, unique=true, nullable = false)
	private String MemberName;
	@Column(name="MemberPassword", length = 200, nullable = false)
	private String MemberPassword;
	@Column(name="MemberFirstEmail", length = 60, nullable = false)
	private String MemberFirstEmail;
	@Column(name="MemberEmail", length = 60, unique=true, nullable = false)
	private String MemberEmail;
	@Column(name="MemberEmailVisible", nullable = false)
	private int MemberEmailVisible;
	@Column(name="MemberNameVisible", nullable = false)
	private int MemberNameVisible;
	@Column(name="MemberFirstIP", length = 20, nullable = false)
	private String MemberFirstIP;
	@Column(name="MemberLastIP", length = 20, nullable = false)
	private String MemberLastIP;
	@Column(name="MemberViewCount", nullable = false)
	private int MemberViewCount;
	@Column(name="MemberPostCount", nullable = false)
	private int MemberPostCount;
	@Column(name="MemberCreationDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date MemberCreationDate;
	@Column(name="MemberModifiedDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date MemberModifiedDate;
	@Column(name="MemberExpireDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date MemberExpireDate;
	@Column(name="MemberPasswordExpireDate", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date MemberPasswordExpireDate;
	@Column(name="MemberLastLogon", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date MemberLastLogon;
	@Column(name="MemberOption", nullable = false)
	private int MemberOption;
	@Column(name="MemberStatus", nullable = false)
	private int MemberStatus;
	@Column(name="MemberActivateCode", length = 40, nullable = false)
	private String MemberActivateCode;
	@Column(name="MemberTempPassword", length = 40, nullable = false)
	private String MemberTempPassword;
	@Column(name="MemberMessageCount", nullable = false)
	private int MemberMessageCount;
	@Column(name="MemberMessageOption", nullable = false)
	private int MemberMessageOption;
	@Column(name="MemberPostsPerPage", nullable = false)
	private int MemberPostsPerPage;
	@Column(name="MemberWarnCount", nullable = false)
	private int MemberWarnCount;
	@Column(name="MemberVoteCount", nullable = false)
	private int MemberVoteCount;
	@Column(name="MemberVoteTotalStars", nullable = false)
	private int MemberVoteTotalStars;
	@Column(name="MemberRewardPoints", nullable = false)
	private int MemberRewardPoints;
	@Column(name="MemberTitle", length = 250, nullable = false)
	private String MemberTitle;
	@Column(name="MemberTimeZone", nullable = false)
	private float MemberTimeZone;
	@Column(name="MemberSignature", length = 250, nullable = false)
	private String MemberSignature;
	@Column(name="MemberAvatar", length = 200, nullable = false)
	private String MemberAvatar;
	@Column(name="MemberSkin", length = 70, nullable = false)
	private String MemberSkin;
	@Column(name="MemberLanguage", length = 70, nullable = false)
	private String MemberLanguage;
	@Column(name="MemberFirstname", length = 70, nullable = false)
	private String MemberFirstname;
	@Column(name="MemberLastname", length = 70, nullable = false)
	private String MemberLastname;
	@Column(name="MemberGender", nullable = false)
	private int MemberGender;
	@Column(name="MemberBirthday", columnDefinition="DATETIME", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date MemberBirthday;
	@Column(name="MemberAddress", length = 150, nullable = false)
	private String MemberAddress;
	@Column(name="MemberCity", length = 70, nullable = false)
	private String MemberCity;
	@Column(name="MemberState", length = 70, nullable = false)
	private String MemberState;
	@Column(name="MemberCountry", length = 70, nullable = false)
	private String MemberCountry;
	@Column(name="MemberPhone", length = 40, nullable = false)
	private String MemberPhone;
	@Column(name="MemberMobile", length = 40, nullable = false)
	private String MemberMobile;
	@Column(name="MemberFax", length = 40, nullable = false)
	private String MemberFax;
	@Column(name="MemberCareer", length = 50, nullable = false)
	private String MemberCareer;
	@Column(name="MemberHomepage", length = 200, nullable = false)
	private String MemberHomepage;
	@Column(name="MemberCoolLink1", length = 200, nullable = false)
	private String MemberCoolLink1;
	@Column(name="MemberCoolLink2", length = 200, nullable = false)
	private String MemberCoolLink2;
	
	
	public long getMemberID() {
		return MemberID;
	}
	public void setMemberID(long memberID) {
		MemberID = memberID;
	}
	public String getMemberName() {
		return MemberName;
	}
	public void setMemberName(String memberName) {
		MemberName = memberName;
	}
	public String getMemberPassword() {
		return MemberPassword;
	}
	public void setMemberPassword(String memberPassword) {
		MemberPassword = memberPassword;
	}
	public String getMemberFirstEmail() {
		return MemberFirstEmail;
	}
	public void setMemberFirstEmail(String memberFirstEmail) {
		MemberFirstEmail = memberFirstEmail;
	}
	public String getMemberEmail() {
		return MemberEmail;
	}
	public void setMemberEmail(String memberEmail) {
		MemberEmail = memberEmail;
	}
	public int getMemberEmailVisible() {
		return MemberEmailVisible;
	}
	public void setMemberEmailVisible(int memberEmailVisible) {
		MemberEmailVisible = memberEmailVisible;
	}
	public int getMemberNameVisible() {
		return MemberNameVisible;
	}
	public void setMemberNameVisible(int memberNameVisible) {
		MemberNameVisible = memberNameVisible;
	}
	public String getMemberFirstIP() {
		return MemberFirstIP;
	}
	public void setMemberFirstIP(String memberFirstIP) {
		MemberFirstIP = memberFirstIP;
	}
	public String getMemberLastIP() {
		return MemberLastIP;
	}
	public void setMemberLastIP(String memberLastIP) {
		MemberLastIP = memberLastIP;
	}
	public int getMemberViewCount() {
		return MemberViewCount;
	}
	public void setMemberViewCount(int memberViewCount) {
		MemberViewCount = memberViewCount;
	}
	public int getMemberPostCount() {
		return MemberPostCount;
	}
	public void setMemberPostCount(int memberPostCount) {
		MemberPostCount = memberPostCount;
	}
	public Date getMemberCreationDate() {
		return MemberCreationDate;
	}
	public void setMemberCreationDate(Date memberCreationDate) {
		MemberCreationDate = memberCreationDate;
	}
	public Date getMemberModifiedDate() {
		return MemberModifiedDate;
	}
	public void setMemberModifiedDate(Date memberModifiedDate) {
		MemberModifiedDate = memberModifiedDate;
	}
	public Date getMemberExpireDate() {
		return MemberExpireDate;
	}
	public void setMemberExpireDate(Date memberExpireDate) {
		MemberExpireDate = memberExpireDate;
	}
	public Date getMemberPasswordExpireDate() {
		return MemberPasswordExpireDate;
	}
	public void setMemberPasswordExpireDate(Date memberPasswordExpireDate) {
		MemberPasswordExpireDate = memberPasswordExpireDate;
	}
	public Date getMemberLastLogon() {
		return MemberLastLogon;
	}
	public void setMemberLastLogon(Date memberLastLogon) {
		MemberLastLogon = memberLastLogon;
	}
	public int getMemberOption() {
		return MemberOption;
	}
	public void setMemberOption(int memberOption) {
		MemberOption = memberOption;
	}
	public int getMemberStatus() {
		return MemberStatus;
	}
	public void setMemberStatus(int memberStatus) {
		MemberStatus = memberStatus;
	}
	public String getMemberActivateCode() {
		return MemberActivateCode;
	}
	public void setMemberActivateCode(String memberActivateCode) {
		MemberActivateCode = memberActivateCode;
	}
	public String getMemberTempPassword() {
		return MemberTempPassword;
	}
	public void setMemberTempPassword(String memberTempPassword) {
		MemberTempPassword = memberTempPassword;
	}
	public int getMemberMessageCount() {
		return MemberMessageCount;
	}
	public void setMemberMessageCount(int memberMessageCount) {
		MemberMessageCount = memberMessageCount;
	}
	public int getMemberMessageOption() {
		return MemberMessageOption;
	}
	public void setMemberMessageOption(int memberMessageOption) {
		MemberMessageOption = memberMessageOption;
	}
	public int getMemberPostsPerPage() {
		return MemberPostsPerPage;
	}
	public void setMemberPostsPerPage(int memberPostsPerPage) {
		MemberPostsPerPage = memberPostsPerPage;
	}
	public int getMemberWarnCount() {
		return MemberWarnCount;
	}
	public void setMemberWarnCount(int memberWarnCount) {
		MemberWarnCount = memberWarnCount;
	}
	public int getMemberVoteCount() {
		return MemberVoteCount;
	}
	public void setMemberVoteCount(int memberVoteCount) {
		MemberVoteCount = memberVoteCount;
	}
	public int getMemberVoteTotalStars() {
		return MemberVoteTotalStars;
	}
	public void setMemberVoteTotalStars(int memberVoteTotalStars) {
		MemberVoteTotalStars = memberVoteTotalStars;
	}
	public int getMemberRewardPoints() {
		return MemberRewardPoints;
	}
	public void setMemberRewardPoints(int memberRewardPoints) {
		MemberRewardPoints = memberRewardPoints;
	}
	public String getMemberTitle() {
		return MemberTitle;
	}
	public void setMemberTitle(String memberTitle) {
		MemberTitle = memberTitle;
	}
	public float getMemberTimeZone() {
		return MemberTimeZone;
	}
	public void setMemberTimeZone(float memberTimeZone) {
		MemberTimeZone = memberTimeZone;
	}
	public String getMemberSignature() {
		return MemberSignature;
	}
	public void setMemberSignature(String memberSignature) {
		MemberSignature = memberSignature;
	}
	public String getMemberAvatar() {
		return MemberAvatar;
	}
	public void setMemberAvatar(String memberAvatar) {
		MemberAvatar = memberAvatar;
	}
	public String getMemberSkin() {
		return MemberSkin;
	}
	public void setMemberSkin(String memberSkin) {
		MemberSkin = memberSkin;
	}
	public String getMemberLanguage() {
		return MemberLanguage;
	}
	public void setMemberLanguage(String memberLanguage) {
		MemberLanguage = memberLanguage;
	}
	public String getMemberFirstname() {
		return MemberFirstname;
	}
	public void setMemberFirstname(String memberFirstname) {
		MemberFirstname = memberFirstname;
	}
	public String getMemberLastname() {
		return MemberLastname;
	}
	public void setMemberLastname(String memberLastname) {
		MemberLastname = memberLastname;
	}
	public int getMemberGender() {
		return MemberGender;
	}
	public void setMemberGender(int memberGender) {
		MemberGender = memberGender;
	}
	public Date getMemberBirthday() {
		return MemberBirthday;
	}
	public void setMemberBirthday(Date memberBirthday) {
		MemberBirthday = memberBirthday;
	}
	public String getMemberAddress() {
		return MemberAddress;
	}
	public void setMemberAddress(String memberAddress) {
		MemberAddress = memberAddress;
	}
	public String getMemberCity() {
		return MemberCity;
	}
	public void setMemberCity(String memberCity) {
		MemberCity = memberCity;
	}
	public String getMemberState() {
		return MemberState;
	}
	public void setMemberState(String memberState) {
		MemberState = memberState;
	}
	public String getMemberCountry() {
		return MemberCountry;
	}
	public void setMemberCountry(String memberCountry) {
		MemberCountry = memberCountry;
	}
	public String getMemberPhone() {
		return MemberPhone;
	}
	public void setMemberPhone(String memberPhone) {
		MemberPhone = memberPhone;
	}
	public String getMemberMobile() {
		return MemberMobile;
	}
	public void setMemberMobile(String memberMobile) {
		MemberMobile = memberMobile;
	}
	public String getMemberFax() {
		return MemberFax;
	}
	public void setMemberFax(String memberFax) {
		MemberFax = memberFax;
	}
	public String getMemberCareer() {
		return MemberCareer;
	}
	public void setMemberCareer(String memberCareer) {
		MemberCareer = memberCareer;
	}
	public String getMemberHomepage() {
		return MemberHomepage;
	}
	public void setMemberHomepage(String memberHomepage) {
		MemberHomepage = memberHomepage;
	}
	public String getMemberCoolLink1() {
		return MemberCoolLink1;
	}
	public void setMemberCoolLink1(String memberCoolLink1) {
		MemberCoolLink1 = memberCoolLink1;
	}
	public String getMemberCoolLink2() {
		return MemberCoolLink2;
	}
	public void setMemberCoolLink2(String memberCoolLink2) {
		MemberCoolLink2 = memberCoolLink2;
	}
}
