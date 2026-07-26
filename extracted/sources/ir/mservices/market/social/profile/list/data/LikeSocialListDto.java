package ir.mservices.market.social.profile.list.data;

import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class LikeSocialListDto implements Serializable {

    @vo7("isLiked")
    private final boolean isLiked;

    @vo7("likeCount")
    private final String likeCount;

    /* JADX WARN: Multi-variable type inference failed */
    public LikeSocialListDto() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ LikeSocialListDto copy$default(LikeSocialListDto likeSocialListDto, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = likeSocialListDto.likeCount;
        }
        if ((i & 2) != 0) {
            z = likeSocialListDto.isLiked;
        }
        return likeSocialListDto.copy(str, z);
    }

    public final String component1() {
        return this.likeCount;
    }

    public final boolean component2() {
        return this.isLiked;
    }

    public final LikeSocialListDto copy(String str, boolean z) {
        js3.p(str, "likeCount");
        return new LikeSocialListDto(str, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LikeSocialListDto)) {
            return false;
        }
        LikeSocialListDto likeSocialListDto = (LikeSocialListDto) obj;
        return js3.i(this.likeCount, likeSocialListDto.likeCount) && this.isLiked == likeSocialListDto.isLiked;
    }

    public final String getLikeCount() {
        return this.likeCount;
    }

    public int hashCode() {
        return (this.likeCount.hashCode() * 31) + (this.isLiked ? 1231 : 1237);
    }

    public final boolean isLiked() {
        return this.isLiked;
    }

    public String toString() {
        return "LikeSocialListDto(likeCount=" + this.likeCount + ", isLiked=" + this.isLiked + ")";
    }

    public LikeSocialListDto(String str, boolean z) {
        js3.p(str, "likeCount");
        this.likeCount = str;
        this.isLiked = z;
    }

    public /* synthetic */ LikeSocialListDto(String str, boolean z, int i, yd1 yd1Var) {
        this((i & 1) != 0 ? "0" : str, (i & 2) != 0 ? false : z);
    }
}
