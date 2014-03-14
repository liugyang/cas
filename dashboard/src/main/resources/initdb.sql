DROP TABLE IF EXISTS TGroups;
DROP TABLE IF EXISTS TMember;
DROP TABLE IF EXISTS TMemberGroup;
DROP TABLE IF EXISTS TMessageFolder;
DROP TABLE IF EXISTS TPost;
DROP TABLE IF EXISTS TThread;
DROP TABLE IF EXISTS TWatch;
DROP TABLE IF EXISTS TAttachment;
DROP TABLE IF EXISTS TFavoriteThread;
DROP TABLE IF EXISTS TRank;
DROP TABLE IF EXISTS TMessage;
DROP TABLE IF EXISTS TPmAttachment;
DROP TABLE IF EXISTS TPmAttachMessage;

CREATE TABLE IF NOT EXISTS TGroups
(
   GroupID                        INT                            NOT NULL AUTO_INCREMENT,
   GroupOwnerID                   INT                            NOT NULL,
   GroupOwnerName                 VARCHAR(30)                    NOT NULL,
   GroupName                      VARCHAR(250)                   NOT NULL,
   GroupDesc                      TEXT                           NOT NULL,
   GroupOption                    INT                            NOT NULL,
   GroupCreationDate              DATETIME                       NOT NULL,
   GroupModifiedDate              DATETIME                       NOT NULL,
   PRIMARY KEY (GroupID),
   UNIQUE (GroupName)
);

CREATE TABLE IF NOT EXISTS TMember
(
   MemberID                       INT                            NOT NULL AUTO_INCREMENT,
   MemberName                     VARCHAR(30)                    NOT NULL,
   MemberPassword                 VARCHAR(200)                   NOT NULL,
   MemberFirstEmail               VARCHAR(60)                    NOT NULL,
   MemberEmail                    VARCHAR(60)                    NOT NULL,
   MemberEmailVisible             INT                            NOT NULL,
   MemberNameVisible              INT                            NOT NULL,
   MemberFirstIP                  VARCHAR(20)                    NOT NULL,
   MemberLastIP                   VARCHAR(20)                    NOT NULL,
   MemberViewCount                INT                            NOT NULL,
   MemberPostCount                INT                            NOT NULL,
   MemberCreationDate             DATETIME                       NOT NULL,
   MemberModifiedDate             DATETIME                       NOT NULL,
   MemberExpireDate               DATETIME                       NOT NULL,
   MemberPasswordExpireDate       DATETIME                       NOT NULL,
   MemberLastLogon                DATETIME                       NOT NULL,
   MemberOption                   INT                            NOT NULL,
   MemberStatus                   INT                            NOT NULL,
   MemberActivateCode             VARCHAR(40)                    NOT NULL,
   MemberTempPassword             VARCHAR(40)                    NOT NULL,
   MemberMessageCount             INT                            NOT NULL,
   MemberMessageOption            INT                            NOT NULL,
   MemberPostsPerPage             INT                            NOT NULL,
   MemberWarnCount                INT                            NOT NULL,
   MemberVoteCount                INT                            NOT NULL,
   MemberVoteTotalStars           INT                            NOT NULL,
   MemberRewardPoints             INT                            NOT NULL,
   MemberTitle                    VARCHAR(250)                   NOT NULL,
   MemberTimeZone                 FLOAT                          NOT NULL,
   MemberSignature                VARCHAR(250)                   NOT NULL,
   MemberAvatar                   VARCHAR(200)                   NOT NULL,
   MemberSkin                     VARCHAR(70)                    NOT NULL,
   MemberLanguage                 VARCHAR(70)                    NOT NULL,
   MemberFirstname                VARCHAR(70)                    NOT NULL,
   MemberLastname                 VARCHAR(70)                    NOT NULL,
   MemberGender                   INT                            NOT NULL,
   MemberBirthday                 DATE                           NOT NULL,
   MemberAddress                  VARCHAR(150)                   NOT NULL,
   MemberCity                     VARCHAR(70)                    NOT NULL,
   MemberState                    VARCHAR(70)                    NOT NULL,
   MemberCountry                  VARCHAR(70)                    NOT NULL,
   MemberPhone                    VARCHAR(40)                    NOT NULL,
   MemberMobile                   VARCHAR(40)                    NOT NULL,
   MemberFax                      VARCHAR(40)                    NOT NULL,
   MemberCareer                   VARCHAR(50)                    NOT NULL,
   MemberHomepage                 VARCHAR(200)                   NOT NULL,
   MemberYahoo                    VARCHAR(70)                    NOT NULL,
   MemberAol                      VARCHAR(70)                    NOT NULL,
   MemberIcq                      VARCHAR(70)                    NOT NULL,
   MemberMsn                      VARCHAR(70)                    NOT NULL,
   MemberCoolLink1                VARCHAR(200)                   NOT NULL,
   MemberCoolLink2                VARCHAR(200)                   NOT NULL,
   PRIMARY KEY (MemberID),
   UNIQUE (MemberEmail),
   UNIQUE (MemberName)
);

CREATE TABLE IF NOT EXISTS TMemberGroup
(
   GroupID                        INT                            NOT NULL,
   MemberID                       INT                            NOT NULL,
   MemberName                     VARCHAR(30)                    NOT NULL,
   Privilege                      INT                            NOT NULL,
   CreationDate                   DATETIME                       NOT NULL,
   ModifiedDate                   DATETIME                       NOT NULL,
   PRIMARY KEY (GroupID, MemberID)
);

CREATE INDEX MemberGroup_1_idx on TMemberGroup
(
   MemberID
);

CREATE INDEX MemberGroup_2_idx on TMemberGroup
(
   GroupID
);

CREATE TABLE IF NOT EXISTS TPost
(
   PostID                         INT                            NOT NULL AUTO_INCREMENT,
   ParentPostID                   INT                            NOT NULL,
   ForumID                        INT                            NOT NULL,
   ThreadID                       INT                            NOT NULL,
   MemberID                       INT                            NOT NULL,
   MemberName                     VARCHAR(30)                    NOT NULL,
   LastEditMemberName             VARCHAR(30)                    NOT NULL,
   PostTopic                      VARCHAR(250)                   NOT NULL,
   PostBody                       TEXT                           NOT NULL,
   PostCreationDate               DATETIME                       NOT NULL,
   PostLastEditDate               DATETIME                       NOT NULL,
   PostCreationIP                 VARCHAR(20)                    NOT NULL,
   PostLastEditIP                 VARCHAR(20)                    NOT NULL,
   PostEditCount                  SMALLINT                       NOT NULL,
   PostFormatOption               INT                            NOT NULL,
   PostOption                     INT                            NOT NULL,
   PostStatus                     INT                            NOT NULL,
   PostIcon                       VARCHAR(10)                    NOT NULL,
   PostAttachCount                SMALLINT                       NOT NULL,
   PRIMARY KEY (PostID)
);

CREATE INDEX Post_1_idx on TPost
(
   ForumID
);

CREATE INDEX Post_2_idx on TPost
(
   ThreadID
);

CREATE INDEX Post_3_idx on TPost
(
   MemberID
);

CREATE INDEX Post_4_idx on TPost
(
   ParentPostID
);

CREATE TABLE IF NOT EXISTS TThread
(
   ThreadID                       INT                            NOT NULL AUTO_INCREMENT,
   ForumID                        INT                            NOT NULL,
   MemberName                     VARCHAR(30)                    NOT NULL,
   LastPostMemberName             VARCHAR(30)                    NOT NULL,
   ThreadTopic                    VARCHAR(250)                   NOT NULL,
   ThreadBody                     TEXT                           NOT NULL,
   ThreadVoteCount                INT                            NOT NULL,
   ThreadVoteTotalStars           INT                            NOT NULL,
   ThreadCreationDate             DATETIME                       NOT NULL,
   ThreadLastPostDate             DATETIME                       NOT NULL,
   ThreadType                     INT                            NOT NULL,
   ThreadPriority                 INT                            NOT NULL,
   ThreadOption                   INT                            NOT NULL,
   ThreadStatus                   INT                            NOT NULL,
   ThreadHasPoll                  INT                            NOT NULL,
   ThreadViewCount                INT                            NOT NULL,
   ThreadReplyCount               INT                            NOT NULL,
   ThreadIcon                     VARCHAR(10)                    NOT NULL,
   ThreadDuration                 INT                            NOT NULL,
   ThreadAttachCount              INT                            NOT NULL,
   PRIMARY KEY (ThreadID)
);

CREATE INDEX Thread_1_idx on TThread
(
   ForumID
);


CREATE TABLE IF NOT EXISTS TMessageFolder
(
   FolderName                     VARCHAR(30)                    NOT NULL,
   MemberID                       INT                            NOT NULL,
   FolderOrder                    SMALLINT                       NOT NULL,
   FolderStatus                   INT                            NOT NULL,
   FolderOption                   INT                            NOT NULL,
   FolderType                     INT                            NOT NULL,
   FolderCreationDate             DATETIME                       NOT NULL,
   FolderModifiedDate             DATETIME                       NOT NULL,
   PRIMARY KEY (FolderName, MemberID)
);

CREATE INDEX MessageFolder_1_idx on TMessageFolder
(
   MemberID
);


CREATE TABLE IF NOT EXISTS TWatch
(
   WatchID                        INT                            NOT NULL AUTO_INCREMENT,
   MemberID                       INT                            NOT NULL,
   CategoryID                     INT                            NOT NULL,
   ForumID                        INT                            NOT NULL,
   ThreadID                       INT                            NOT NULL,
   WatchType                      INT                            NOT NULL,
   WatchOption                    INT                            NOT NULL,
   WatchStatus                    INT                            NOT NULL,
   WatchCreationDate              DATETIME                       NOT NULL,
   WatchLastSentDate              DATETIME                       NOT NULL,
   WatchEndDate                   DATETIME                       NOT NULL,
   PRIMARY KEY (WatchID),
   UNIQUE (MemberID, CategoryID, ForumID, ThreadID)
);

CREATE INDEX Watch_MemberID_idx on TWatch
(
   MemberID
);

CREATE INDEX Watch_CategoryID_idx on TWatch
(
   CategoryID
);

CREATE INDEX Watch_ForumID_idx on TWatch
(
   ForumID
);

CREATE INDEX Watch_ThreadID_idx on TWatch
(
   ThreadID
);

CREATE TABLE IF NOT EXISTS TPmAttachment
(
   AttachID                       INT                            NOT NULL AUTO_INCREMENT,
   PostID                         INT                            NOT NULL,
   MemberID                       INT                            NOT NULL,
   AttachFilename                 VARCHAR(250)                   NOT NULL,
   AttachFileSize                 INT                            NOT NULL,
   AttachMimeType                 VARCHAR(70)                    NOT NULL,
   AttachDesc                     TEXT                           NOT NULL,
   AttachCreationIP               VARCHAR(20)                    NOT NULL,
   AttachCreationDate             DATETIME                       NOT NULL,
   AttachModifiedDate             DATETIME                       NOT NULL,
   AttachDownloadCount            INT                            NOT NULL,
   AttachOption                   INT                            NOT NULL,
   AttachStatus                   INT                            NOT NULL,
   PRIMARY KEY (AttachID)
);

CREATE INDEX Attachment_PostID_idx on TPmAttachment
(
   PostID
);

CREATE INDEX Attachment_MemberID_idx on TPmAttachment
(
   MemberID
);

CREATE TABLE IF NOT EXISTS TFavoriteThread
(
   MemberID                       INT                            NOT NULL,
   ThreadID                       INT                            NOT NULL,
   ForumID                        INT                            NOT NULL,
   FavoriteCreationDate           DATETIME                       NOT NULL,
   FavoriteType                   INT                            NOT NULL,
   FavoriteOption                 INT                            NOT NULL,
   FavoriteStatus                 INT                            NOT NULL,
   PRIMARY KEY (MemberID, ThreadID)
);

CREATE INDEX FavorThread_1_idx on TFavoriteThread
(
   MemberID
);

CREATE INDEX FavorThread_2_idx on TFavoriteThread
(
   ThreadID
);

CREATE TABLE IF NOT EXISTS TRank
(
   RankID                         INT                            NOT NULL AUTO_INCREMENT,
   RankMinPosts                   INT                            NOT NULL,
   RankLevel                      INT                            NOT NULL,
   RankTitle                      VARCHAR(250)                   NOT NULL,
   RankImage                      VARCHAR(250)                   NOT NULL,
   RankType                       INT                            NOT NULL,
   RankOption                     INT                            NOT NULL,
   PRIMARY KEY (RankID),
   UNIQUE (RankMinPosts),
   UNIQUE (RankTitle)
);

CREATE TABLE IF NOT EXISTS TMessage
(
   MessageID                      INT                            NOT NULL AUTO_INCREMENT,
   FolderName                     VARCHAR(30)                    NOT NULL,
   MemberID                       INT                            NOT NULL,
   MessageSenderID                INT                            NOT NULL,
   MessageSenderName              VARCHAR(30)                    NOT NULL,
   MessageToList                  VARCHAR(250)                   NOT NULL,
   MessageCcList                  VARCHAR(250),
   MessageBccList                 VARCHAR(250),
   MessageTopic                   VARCHAR(250)                   NOT NULL,
   MessageBody                    TEXT                           NOT NULL,
   MessageType                    INT                            NOT NULL,
   MessageOption                  INT                            NOT NULL,
   MessageStatus                  INT                            NOT NULL,
   MessageReadStatus              INT                            NOT NULL,
   MessageNotify                  INT                            NOT NULL,
   MessageIcon                    VARCHAR(10)                    NOT NULL,
   MessageAttachCount             INT                            NOT NULL,
   MessageIP                      VARCHAR(20)                    NOT NULL,
   MessageCreationDate            DATETIME                       NOT NULL,
   PRIMARY KEY (MessageID)
);

CREATE INDEX Message_1_idx on TMessage
(
   FolderName,
   MemberID
);

CREATE INDEX Message_2_idx on TMessage
(
   MessageSenderID
);

CREATE TABLE IF NOT EXISTS TPmAttachMessage
(
   MessageID                      INT                            NOT NULL,
   PmAttachID                     INT                            NOT NULL,
   RelationType                   INT                            NOT NULL,
   RelationOption                 INT                            NOT NULL,
   RelationStatus                 INT                            NOT NULL,
   PRIMARY KEY (MessageID, PmAttachID)
);