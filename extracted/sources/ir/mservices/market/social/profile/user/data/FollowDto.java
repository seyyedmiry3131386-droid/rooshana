package ir.mservices.market.social.profile.user.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class FollowDto implements Serializable {

    @vo7("relation")
    private final String relation;

    public FollowDto(String str) {
        js3.p(str, "relation");
        this.relation = str;
    }

    public static /* synthetic */ FollowDto copy$default(FollowDto followDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followDto.relation;
        }
        return followDto.copy(str);
    }

    public final String component1() {
        return this.relation;
    }

    public final FollowDto copy(String str) {
        js3.p(str, "relation");
        return new FollowDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FollowDto) && js3.i(this.relation, ((FollowDto) obj).relation);
    }

    public final String getRelation() {
        return this.relation;
    }

    public int hashCode() {
        return this.relation.hashCode();
    }

    public String toString() {
        return o40.y("FollowDto(relation=", this.relation, ")");
    }
}
