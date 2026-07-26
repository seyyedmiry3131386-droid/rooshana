package ir.mservices.market.myAccount.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class PrivacySettingDto implements RequestDTO {

    @vo7("isPrivate")
    private final boolean isPrivate;

    @vo7("messageAccessLevel")
    private final String messageAccessLevel;

    @vo7("privacyAccessLevel")
    private final String privacyAccessLevel;

    public PrivacySettingDto(boolean z, String str, String str2) {
        js3.p(str, "privacyAccessLevel");
        js3.p(str2, "messageAccessLevel");
        this.isPrivate = z;
        this.privacyAccessLevel = str;
        this.messageAccessLevel = str2;
    }

    public static /* synthetic */ PrivacySettingDto copy$default(PrivacySettingDto privacySettingDto, boolean z, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = privacySettingDto.isPrivate;
        }
        if ((i & 2) != 0) {
            str = privacySettingDto.privacyAccessLevel;
        }
        if ((i & 4) != 0) {
            str2 = privacySettingDto.messageAccessLevel;
        }
        return privacySettingDto.copy(z, str, str2);
    }

    public final boolean component1() {
        return this.isPrivate;
    }

    public final String component2() {
        return this.privacyAccessLevel;
    }

    public final String component3() {
        return this.messageAccessLevel;
    }

    public final PrivacySettingDto copy(boolean z, String str, String str2) {
        js3.p(str, "privacyAccessLevel");
        js3.p(str2, "messageAccessLevel");
        return new PrivacySettingDto(z, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrivacySettingDto)) {
            return false;
        }
        PrivacySettingDto privacySettingDto = (PrivacySettingDto) obj;
        return this.isPrivate == privacySettingDto.isPrivate && js3.i(this.privacyAccessLevel, privacySettingDto.privacyAccessLevel) && js3.i(this.messageAccessLevel, privacySettingDto.messageAccessLevel);
    }

    public final String getMessageAccessLevel() {
        return this.messageAccessLevel;
    }

    public final String getPrivacyAccessLevel() {
        return this.privacyAccessLevel;
    }

    public int hashCode() {
        return this.messageAccessLevel.hashCode() + rm7.k(this.privacyAccessLevel, (this.isPrivate ? 1231 : 1237) * 31, 31);
    }

    public final boolean isPrivate() {
        return this.isPrivate;
    }

    public String toString() {
        boolean z = this.isPrivate;
        String str = this.privacyAccessLevel;
        String str2 = this.messageAccessLevel;
        StringBuilder sb = new StringBuilder("PrivacySettingDto(isPrivate=");
        sb.append(z);
        sb.append(", privacyAccessLevel=");
        sb.append(str);
        sb.append(", messageAccessLevel=");
        return dw1.s(sb, str2, ")");
    }
}
