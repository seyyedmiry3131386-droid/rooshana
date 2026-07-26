package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PreapprovalDto implements Serializable {

    @vo7("hasPreApproval")
    private final boolean hasPreapproval;

    @vo7("label")
    private final String label;

    @vo7("targetSdk")
    private final Integer targetSdk;

    public PreapprovalDto(String str, boolean z, Integer num) {
        this.label = str;
        this.hasPreapproval = z;
        this.targetSdk = num;
    }

    public static /* synthetic */ PreapprovalDto copy$default(PreapprovalDto preapprovalDto, String str, boolean z, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = preapprovalDto.label;
        }
        if ((i & 2) != 0) {
            z = preapprovalDto.hasPreapproval;
        }
        if ((i & 4) != 0) {
            num = preapprovalDto.targetSdk;
        }
        return preapprovalDto.copy(str, z, num);
    }

    public final String component1() {
        return this.label;
    }

    public final boolean component2() {
        return this.hasPreapproval;
    }

    public final Integer component3() {
        return this.targetSdk;
    }

    public final PreapprovalDto copy(String str, boolean z, Integer num) {
        return new PreapprovalDto(str, z, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreapprovalDto)) {
            return false;
        }
        PreapprovalDto preapprovalDto = (PreapprovalDto) obj;
        return js3.i(this.label, preapprovalDto.label) && this.hasPreapproval == preapprovalDto.hasPreapproval && js3.i(this.targetSdk, preapprovalDto.targetSdk);
    }

    public final boolean getHasPreapproval() {
        return this.hasPreapproval;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Integer getTargetSdk() {
        return this.targetSdk;
    }

    public int hashCode() {
        String str = this.label;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + (this.hasPreapproval ? 1231 : 1237)) * 31;
        Integer num = this.targetSdk;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "PreapprovalDto(label=" + this.label + ", hasPreapproval=" + this.hasPreapproval + ", targetSdk=" + this.targetSdk + ")";
    }
}
