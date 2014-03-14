package com.connect.model;

import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Member entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "tmember", uniqueConstraints = {
		@UniqueConstraint(columnNames = "MemberEmail"),
		@UniqueConstraint(columnNames = "MemberName") })
public class Member implements java.io.Serializable {

	// Fields

	private Integer memberId;
	private String memberName;
	private String memberPassword;
	private String memberFirstEmail;
	private String memberEmail;
	private Integer memberEmailVisible;
	private Integer memberNameVisible;
	private String memberFirstIp;
	private String memberLastIp;
	private Integer memberViewCount;
	private Integer memberPostCount;
	private Timestamp memberCreationDate;
	private Timestamp memberModifiedDate;
	private Timestamp memberExpireDate;
	private Timestamp memberPasswordExpireDate;
	private Timestamp memberLastLogon;
	private Integer memberOption;
	private Integer memberStatus;
	private String memberActivateCode;
	private String memberTempPassword;
	private Integer memberMessageCount;
	private Integer memberMessageOption;
	private Integer memberPostsPerPage;
	private Integer memberWarnCount;
	private Integer memberVoteCount;
	private Integer memberVoteTotalStars;
	private Integer memberRewardPoints;
	private String memberTitle;
	private Float memberTimeZone;
	private String memberSignature;
	private String memberAvatar;
	private String memberSkin;
	private String memberLanguage;
	private String memberFirstname;
	private String memberLastname;
	private Integer memberGender;
	private Date memberBirthday;
	private String memberAddress;
	private String memberCity;
	private String memberState;
	private String memberCountry;
	private String memberPhone;
	private String memberMobile;
	private String memberFax;
	private String memberCareer;
	private String memberHomepage;
	private String memberYahoo;
	private String memberAol;
	private String memberIcq;
	private String memberMsn;
	private String memberCoolLink1;
	private String memberCoolLink2;

	// Constructors

	/** default constructor */
	public Member() {
	}

	/** full constructor */
	public Member(String memberName, String memberPassword,
			String memberFirstEmail, String memberEmail,
			Integer memberEmailVisible, Integer memberNameVisible,
			String memberFirstIp, String memberLastIp, Integer memberViewCount,
			Integer memberPostCount, Timestamp memberCreationDate,
			Timestamp memberModifiedDate, Timestamp memberExpireDate,
			Timestamp memberPasswordExpireDate, Timestamp memberLastLogon,
			Integer memberOption, Integer memberStatus,
			String memberActivateCode, String memberTempPassword,
			Integer memberMessageCount, Integer memberMessageOption,
			Integer memberPostsPerPage, Integer memberWarnCount,
			Integer memberVoteCount, Integer memberVoteTotalStars,
			Integer memberRewardPoints, String memberTitle,
			Float memberTimeZone, String memberSignature, String memberAvatar,
			String memberSkin, String memberLanguage, String memberFirstname,
			String memberLastname, Integer memberGender, Date memberBirthday,
			String memberAddress, String memberCity, String memberState,
			String memberCountry, String memberPhone, String memberMobile,
			String memberFax, String memberCareer, String memberHomepage,
			String memberYahoo, String memberAol, String memberIcq,
			String memberMsn, String memberCoolLink1, String memberCoolLink2) {
		this.memberName = memberName;
		this.memberPassword = memberPassword;
		this.memberFirstEmail = memberFirstEmail;
		this.memberEmail = memberEmail;
		this.memberEmailVisible = memberEmailVisible;
		this.memberNameVisible = memberNameVisible;
		this.memberFirstIp = memberFirstIp;
		this.memberLastIp = memberLastIp;
		this.memberViewCount = memberViewCount;
		this.memberPostCount = memberPostCount;
		this.memberCreationDate = memberCreationDate;
		this.memberModifiedDate = memberModifiedDate;
		this.memberExpireDate = memberExpireDate;
		this.memberPasswordExpireDate = memberPasswordExpireDate;
		this.memberLastLogon = memberLastLogon;
		this.memberOption = memberOption;
		this.memberStatus = memberStatus;
		this.memberActivateCode = memberActivateCode;
		this.memberTempPassword = memberTempPassword;
		this.memberMessageCount = memberMessageCount;
		this.memberMessageOption = memberMessageOption;
		this.memberPostsPerPage = memberPostsPerPage;
		this.memberWarnCount = memberWarnCount;
		this.memberVoteCount = memberVoteCount;
		this.memberVoteTotalStars = memberVoteTotalStars;
		this.memberRewardPoints = memberRewardPoints;
		this.memberTitle = memberTitle;
		this.memberTimeZone = memberTimeZone;
		this.memberSignature = memberSignature;
		this.memberAvatar = memberAvatar;
		this.memberSkin = memberSkin;
		this.memberLanguage = memberLanguage;
		this.memberFirstname = memberFirstname;
		this.memberLastname = memberLastname;
		this.memberGender = memberGender;
		this.memberBirthday = memberBirthday;
		this.memberAddress = memberAddress;
		this.memberCity = memberCity;
		this.memberState = memberState;
		this.memberCountry = memberCountry;
		this.memberPhone = memberPhone;
		this.memberMobile = memberMobile;
		this.memberFax = memberFax;
		this.memberCareer = memberCareer;
		this.memberHomepage = memberHomepage;
		this.memberYahoo = memberYahoo;
		this.memberAol = memberAol;
		this.memberIcq = memberIcq;
		this.memberMsn = memberMsn;
		this.memberCoolLink1 = memberCoolLink1;
		this.memberCoolLink2 = memberCoolLink2;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "MemberID", unique = true, nullable = false)
	public Integer getMemberId() {
		return this.memberId;
	}

	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}

	@Column(name = "MemberName", unique = true, nullable = false, length = 30)
	public String getMemberName() {
		return this.memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Column(name = "MemberPassword", nullable = false, length = 200)
	public String getMemberPassword() {
		return this.memberPassword;
	}

	public void setMemberPassword(String memberPassword) {
		this.memberPassword = memberPassword;
	}

	@Column(name = "MemberFirstEmail", nullable = false, length = 60)
	public String getMemberFirstEmail() {
		return this.memberFirstEmail;
	}

	public void setMemberFirstEmail(String memberFirstEmail) {
		this.memberFirstEmail = memberFirstEmail;
	}

	@Column(name = "MemberEmail", unique = true, nullable = false, length = 60)
	public String getMemberEmail() {
		return this.memberEmail;
	}

	public void setMemberEmail(String memberEmail) {
		this.memberEmail = memberEmail;
	}

	@Column(name = "MemberEmailVisible", nullable = false)
	public Integer getMemberEmailVisible() {
		return this.memberEmailVisible;
	}

	public void setMemberEmailVisible(Integer memberEmailVisible) {
		this.memberEmailVisible = memberEmailVisible;
	}

	@Column(name = "MemberNameVisible", nullable = false)
	public Integer getMemberNameVisible() {
		return this.memberNameVisible;
	}

	public void setMemberNameVisible(Integer memberNameVisible) {
		this.memberNameVisible = memberNameVisible;
	}

	@Column(name = "MemberFirstIP", nullable = false, length = 20)
	public String getMemberFirstIp() {
		return this.memberFirstIp;
	}

	public void setMemberFirstIp(String memberFirstIp) {
		this.memberFirstIp = memberFirstIp;
	}

	@Column(name = "MemberLastIP", nullable = false, length = 20)
	public String getMemberLastIp() {
		return this.memberLastIp;
	}

	public void setMemberLastIp(String memberLastIp) {
		this.memberLastIp = memberLastIp;
	}

	@Column(name = "MemberViewCount", nullable = false)
	public Integer getMemberViewCount() {
		return this.memberViewCount;
	}

	public void setMemberViewCount(Integer memberViewCount) {
		this.memberViewCount = memberViewCount;
	}

	@Column(name = "MemberPostCount", nullable = false)
	public Integer getMemberPostCount() {
		return this.memberPostCount;
	}

	public void setMemberPostCount(Integer memberPostCount) {
		this.memberPostCount = memberPostCount;
	}

	@Column(name = "MemberCreationDate", nullable = false, length = 19)
	public Timestamp getMemberCreationDate() {
		return this.memberCreationDate;
	}

	public void setMemberCreationDate(Timestamp memberCreationDate) {
		this.memberCreationDate = memberCreationDate;
	}

	@Column(name = "MemberModifiedDate", nullable = false, length = 19)
	public Timestamp getMemberModifiedDate() {
		return this.memberModifiedDate;
	}

	public void setMemberModifiedDate(Timestamp memberModifiedDate) {
		this.memberModifiedDate = memberModifiedDate;
	}

	@Column(name = "MemberExpireDate", nullable = false, length = 19)
	public Timestamp getMemberExpireDate() {
		return this.memberExpireDate;
	}

	public void setMemberExpireDate(Timestamp memberExpireDate) {
		this.memberExpireDate = memberExpireDate;
	}

	@Column(name = "MemberPasswordExpireDate", nullable = false, length = 19)
	public Timestamp getMemberPasswordExpireDate() {
		return this.memberPasswordExpireDate;
	}

	public void setMemberPasswordExpireDate(Timestamp memberPasswordExpireDate) {
		this.memberPasswordExpireDate = memberPasswordExpireDate;
	}

	@Column(name = "MemberLastLogon", nullable = false, length = 19)
	public Timestamp getMemberLastLogon() {
		return this.memberLastLogon;
	}

	public void setMemberLastLogon(Timestamp memberLastLogon) {
		this.memberLastLogon = memberLastLogon;
	}

	@Column(name = "MemberOption", nullable = false)
	public Integer getMemberOption() {
		return this.memberOption;
	}

	public void setMemberOption(Integer memberOption) {
		this.memberOption = memberOption;
	}

	@Column(name = "MemberStatus", nullable = false)
	public Integer getMemberStatus() {
		return this.memberStatus;
	}

	public void setMemberStatus(Integer memberStatus) {
		this.memberStatus = memberStatus;
	}

	@Column(name = "MemberActivateCode", nullable = false, length = 40)
	public String getMemberActivateCode() {
		return this.memberActivateCode;
	}

	public void setMemberActivateCode(String memberActivateCode) {
		this.memberActivateCode = memberActivateCode;
	}

	@Column(name = "MemberTempPassword", nullable = false, length = 40)
	public String getMemberTempPassword() {
		return this.memberTempPassword;
	}

	public void setMemberTempPassword(String memberTempPassword) {
		this.memberTempPassword = memberTempPassword;
	}

	@Column(name = "MemberMessageCount", nullable = false)
	public Integer getMemberMessageCount() {
		return this.memberMessageCount;
	}

	public void setMemberMessageCount(Integer memberMessageCount) {
		this.memberMessageCount = memberMessageCount;
	}

	@Column(name = "MemberMessageOption", nullable = false)
	public Integer getMemberMessageOption() {
		return this.memberMessageOption;
	}

	public void setMemberMessageOption(Integer memberMessageOption) {
		this.memberMessageOption = memberMessageOption;
	}

	@Column(name = "MemberPostsPerPage", nullable = false)
	public Integer getMemberPostsPerPage() {
		return this.memberPostsPerPage;
	}

	public void setMemberPostsPerPage(Integer memberPostsPerPage) {
		this.memberPostsPerPage = memberPostsPerPage;
	}

	@Column(name = "MemberWarnCount", nullable = false)
	public Integer getMemberWarnCount() {
		return this.memberWarnCount;
	}

	public void setMemberWarnCount(Integer memberWarnCount) {
		this.memberWarnCount = memberWarnCount;
	}

	@Column(name = "MemberVoteCount", nullable = false)
	public Integer getMemberVoteCount() {
		return this.memberVoteCount;
	}

	public void setMemberVoteCount(Integer memberVoteCount) {
		this.memberVoteCount = memberVoteCount;
	}

	@Column(name = "MemberVoteTotalStars", nullable = false)
	public Integer getMemberVoteTotalStars() {
		return this.memberVoteTotalStars;
	}

	public void setMemberVoteTotalStars(Integer memberVoteTotalStars) {
		this.memberVoteTotalStars = memberVoteTotalStars;
	}

	@Column(name = "MemberRewardPoints", nullable = false)
	public Integer getMemberRewardPoints() {
		return this.memberRewardPoints;
	}

	public void setMemberRewardPoints(Integer memberRewardPoints) {
		this.memberRewardPoints = memberRewardPoints;
	}

	@Column(name = "MemberTitle", nullable = false, length = 250)
	public String getMemberTitle() {
		return this.memberTitle;
	}

	public void setMemberTitle(String memberTitle) {
		this.memberTitle = memberTitle;
	}

	@Column(name = "MemberTimeZone", nullable = false, precision = 12, scale = 0)
	public Float getMemberTimeZone() {
		return this.memberTimeZone;
	}

	public void setMemberTimeZone(Float memberTimeZone) {
		this.memberTimeZone = memberTimeZone;
	}

	@Column(name = "MemberSignature", nullable = false, length = 250)
	public String getMemberSignature() {
		return this.memberSignature;
	}

	public void setMemberSignature(String memberSignature) {
		this.memberSignature = memberSignature;
	}

	@Column(name = "MemberAvatar", nullable = false, length = 200)
	public String getMemberAvatar() {
		return this.memberAvatar;
	}

	public void setMemberAvatar(String memberAvatar) {
		this.memberAvatar = memberAvatar;
	}

	@Column(name = "MemberSkin", nullable = false, length = 70)
	public String getMemberSkin() {
		return this.memberSkin;
	}

	public void setMemberSkin(String memberSkin) {
		this.memberSkin = memberSkin;
	}

	@Column(name = "MemberLanguage", nullable = false, length = 70)
	public String getMemberLanguage() {
		return this.memberLanguage;
	}

	public void setMemberLanguage(String memberLanguage) {
		this.memberLanguage = memberLanguage;
	}

	@Column(name = "MemberFirstname", nullable = false, length = 70)
	public String getMemberFirstname() {
		return this.memberFirstname;
	}

	public void setMemberFirstname(String memberFirstname) {
		this.memberFirstname = memberFirstname;
	}

	@Column(name = "MemberLastname", nullable = false, length = 70)
	public String getMemberLastname() {
		return this.memberLastname;
	}

	public void setMemberLastname(String memberLastname) {
		this.memberLastname = memberLastname;
	}

	@Column(name = "MemberGender", nullable = false)
	public Integer getMemberGender() {
		return this.memberGender;
	}

	public void setMemberGender(Integer memberGender) {
		this.memberGender = memberGender;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "MemberBirthday", nullable = false, length = 10)
	public Date getMemberBirthday() {
		return this.memberBirthday;
	}

	public void setMemberBirthday(Date memberBirthday) {
		this.memberBirthday = memberBirthday;
	}

	@Column(name = "MemberAddress", nullable = false, length = 150)
	public String getMemberAddress() {
		return this.memberAddress;
	}

	public void setMemberAddress(String memberAddress) {
		this.memberAddress = memberAddress;
	}

	@Column(name = "MemberCity", nullable = false, length = 70)
	public String getMemberCity() {
		return this.memberCity;
	}

	public void setMemberCity(String memberCity) {
		this.memberCity = memberCity;
	}

	@Column(name = "MemberState", nullable = false, length = 70)
	public String getMemberState() {
		return this.memberState;
	}

	public void setMemberState(String memberState) {
		this.memberState = memberState;
	}

	@Column(name = "MemberCountry", nullable = false, length = 70)
	public String getMemberCountry() {
		return this.memberCountry;
	}

	public void setMemberCountry(String memberCountry) {
		this.memberCountry = memberCountry;
	}

	@Column(name = "MemberPhone", nullable = false, length = 40)
	public String getMemberPhone() {
		return this.memberPhone;
	}

	public void setMemberPhone(String memberPhone) {
		this.memberPhone = memberPhone;
	}

	@Column(name = "MemberMobile", nullable = false, length = 40)
	public String getMemberMobile() {
		return this.memberMobile;
	}

	public void setMemberMobile(String memberMobile) {
		this.memberMobile = memberMobile;
	}

	@Column(name = "MemberFax", nullable = false, length = 40)
	public String getMemberFax() {
		return this.memberFax;
	}

	public void setMemberFax(String memberFax) {
		this.memberFax = memberFax;
	}

	@Column(name = "MemberCareer", nullable = false, length = 50)
	public String getMemberCareer() {
		return this.memberCareer;
	}

	public void setMemberCareer(String memberCareer) {
		this.memberCareer = memberCareer;
	}

	@Column(name = "MemberHomepage", nullable = false, length = 200)
	public String getMemberHomepage() {
		return this.memberHomepage;
	}

	public void setMemberHomepage(String memberHomepage) {
		this.memberHomepage = memberHomepage;
	}

	@Column(name = "MemberYahoo", nullable = false, length = 70)
	public String getMemberYahoo() {
		return this.memberYahoo;
	}

	public void setMemberYahoo(String memberYahoo) {
		this.memberYahoo = memberYahoo;
	}

	@Column(name = "MemberAol", nullable = false, length = 70)
	public String getMemberAol() {
		return this.memberAol;
	}

	public void setMemberAol(String memberAol) {
		this.memberAol = memberAol;
	}

	@Column(name = "MemberIcq", nullable = false, length = 70)
	public String getMemberIcq() {
		return this.memberIcq;
	}

	public void setMemberIcq(String memberIcq) {
		this.memberIcq = memberIcq;
	}

	@Column(name = "MemberMsn", nullable = false, length = 70)
	public String getMemberMsn() {
		return this.memberMsn;
	}

	public void setMemberMsn(String memberMsn) {
		this.memberMsn = memberMsn;
	}

	@Column(name = "MemberCoolLink1", nullable = false, length = 200)
	public String getMemberCoolLink1() {
		return this.memberCoolLink1;
	}

	public void setMemberCoolLink1(String memberCoolLink1) {
		this.memberCoolLink1 = memberCoolLink1;
	}

	@Column(name = "MemberCoolLink2", nullable = false, length = 200)
	public String getMemberCoolLink2() {
		return this.memberCoolLink2;
	}

	public void setMemberCoolLink2(String memberCoolLink2) {
		this.memberCoolLink2 = memberCoolLink2;
	}

}