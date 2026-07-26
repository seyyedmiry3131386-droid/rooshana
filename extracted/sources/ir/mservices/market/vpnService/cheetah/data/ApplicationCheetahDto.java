package ir.mservices.market.vpnService.cheetah.data;

import defpackage.bl4;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationCheetahDto implements Serializable {

    @vo7("enable")
    private final boolean enable;

    public ApplicationCheetahDto(boolean z) {
        this.enable = z;
    }

    public static /* synthetic */ ApplicationCheetahDto copy$default(ApplicationCheetahDto applicationCheetahDto, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = applicationCheetahDto.enable;
        }
        return applicationCheetahDto.copy(z);
    }

    public final boolean component1() {
        return this.enable;
    }

    public final ApplicationCheetahDto copy(boolean z) {
        return new ApplicationCheetahDto(z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ApplicationCheetahDto) && this.enable == ((ApplicationCheetahDto) obj).enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    public int hashCode() {
        return this.enable ? 1231 : 1237;
    }

    public String toString() {
        return bl4.x("ApplicationCheetahDto(enable=", ")", this.enable);
    }
}
