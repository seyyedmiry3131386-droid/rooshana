package ir.mservices.market.common.comment.data.response;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ReviewDto extends ResultDTO implements Serializable {

    @vo7("accountKey")
    private final String accountKey;

    @vo7("avatar")
    private final String avatar;

    @vo7("canEdit")
    private final boolean canEdit;

    @vo7("comment")
    private final String comment;

    @vo7("creationDate")
    private final String creationDate;

    @vo7("developerReply")
    private final ReviewDto developerReply;

    @vo7("id")
    private final String id;

    @vo7("hasSubComment")
    private final boolean isHasSubComment;

    @vo7("onLastVersion")
    private final boolean isOnLastVersion;

    @vo7("showEditConfirm")
    private final Boolean isShowEditConfirm;

    @vo7("isVerified")
    private final boolean isVerified;

    @vo7("negativeLikes")
    private final int negativeLikes;

    @vo7("nickname")
    private final String nickname;

    @vo7("parentId")
    private final String parentId;

    @vo7("positiveLikes")
    private final int positiveLikes;

    @vo7("rate")
    private final float rate;

    @vo7("subCommentsCount")
    private final int subCommentsCount;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReviewDto(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, int i2, int i3, boolean z, boolean z2, String str9, Boolean bool, boolean z3, boolean z4, int i4, ReviewDto reviewDto) {
        super(i, str, str2);
        js3.p(str3, "id");
        js3.p(str7, "nickname");
        js3.p(str9, "accountKey");
        this.id = str3;
        this.parentId = str4;
        this.comment = str5;
        this.creationDate = str6;
        this.nickname = str7;
        this.avatar = str8;
        this.rate = f;
        this.positiveLikes = i2;
        this.negativeLikes = i3;
        this.isOnLastVersion = z;
        this.canEdit = z2;
        this.accountKey = str9;
        this.isShowEditConfirm = bool;
        this.isHasSubComment = z3;
        this.isVerified = z4;
        this.subCommentsCount = i4;
        this.developerReply = reviewDto;
    }

    public final boolean canRemove() {
        return this.canEdit && this.parentId != null;
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final boolean getCanEdit() {
        return this.canEdit;
    }

    public final String getComment() {
        return this.comment;
    }

    public final String getCreationDate() {
        return this.creationDate;
    }

    public final ReviewDto getDeveloperReply() {
        return this.developerReply;
    }

    public final String getId() {
        return this.id;
    }

    public final int getNegativeLikes() {
        return this.negativeLikes;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final int getPositiveLikes() {
        return this.positiveLikes;
    }

    public final float getRate() {
        return this.rate;
    }

    public final int getSubCommentsCount() {
        return this.subCommentsCount;
    }

    public final boolean isHasSubComment() {
        return this.isHasSubComment;
    }

    public final boolean isOnLastVersion() {
        return this.isOnLastVersion;
    }

    public final Boolean isShowEditConfirm() {
        return this.isShowEditConfirm;
    }

    public final boolean isVerified() {
        return this.isVerified;
    }
}
