package ir.mservices.market.social.profile.data;

import defpackage.bl4;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ForceUpdateDto implements Serializable {

    @vo7("lastVersionCode")
    private final int lastVersionCode;

    public ForceUpdateDto(int i) {
        this.lastVersionCode = i;
    }

    public static /* synthetic */ ForceUpdateDto copy$default(ForceUpdateDto forceUpdateDto, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = forceUpdateDto.lastVersionCode;
        }
        return forceUpdateDto.copy(i);
    }

    public final int component1() {
        return this.lastVersionCode;
    }

    public final ForceUpdateDto copy(int i) {
        return new ForceUpdateDto(i);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ForceUpdateDto) && this.lastVersionCode == ((ForceUpdateDto) obj).lastVersionCode;
    }

    public final int getLastVersionCode() {
        return this.lastVersionCode;
    }

    public int hashCode() {
        return this.lastVersionCode;
    }

    public String toString() {
        return bl4.q(this.lastVersionCode, "ForceUpdateDto(lastVersionCode=", ")");
    }
}
