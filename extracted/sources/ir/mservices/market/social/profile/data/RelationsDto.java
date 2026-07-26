package ir.mservices.market.social.profile.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class RelationsDto implements Serializable {

    @vo7("backward")
    private final String backward;

    @vo7("followeeCount")
    private final String followeeCount;

    @vo7("followerCount")
    private final String followerCount;

    @vo7("forward")
    private final String forward;

    public RelationsDto(String str, String str2, String str3, String str4) {
        js3.p(str, "followerCount");
        js3.p(str2, "followeeCount");
        this.followerCount = str;
        this.followeeCount = str2;
        this.forward = str3;
        this.backward = str4;
    }

    public static /* synthetic */ RelationsDto copy$default(RelationsDto relationsDto, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = relationsDto.followerCount;
        }
        if ((i & 2) != 0) {
            str2 = relationsDto.followeeCount;
        }
        if ((i & 4) != 0) {
            str3 = relationsDto.forward;
        }
        if ((i & 8) != 0) {
            str4 = relationsDto.backward;
        }
        return relationsDto.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.followerCount;
    }

    public final String component2() {
        return this.followeeCount;
    }

    public final String component3() {
        return this.forward;
    }

    public final String component4() {
        return this.backward;
    }

    public final RelationsDto copy(String str, String str2, String str3, String str4) {
        js3.p(str, "followerCount");
        js3.p(str2, "followeeCount");
        return new RelationsDto(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RelationsDto)) {
            return false;
        }
        RelationsDto relationsDto = (RelationsDto) obj;
        return js3.i(this.followerCount, relationsDto.followerCount) && js3.i(this.followeeCount, relationsDto.followeeCount) && js3.i(this.forward, relationsDto.forward) && js3.i(this.backward, relationsDto.backward);
    }

    public final String getBackward() {
        return this.backward;
    }

    public final String getFolloweeCount() {
        return this.followeeCount;
    }

    public final String getFollowerCount() {
        return this.followerCount;
    }

    public final String getForward() {
        return this.forward;
    }

    public int hashCode() {
        int iK = rm7.k(this.followeeCount, this.followerCount.hashCode() * 31, 31);
        String str = this.forward;
        int iHashCode = (iK + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backward;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return dw1.p(this.forward, ", backward=", this.backward, ")", rm7.t("RelationsDto(followerCount=", this.followerCount, ", followeeCount=", this.followeeCount, ", forward="));
    }
}
