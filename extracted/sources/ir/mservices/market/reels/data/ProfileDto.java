package ir.mservices.market.reels.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileDto implements Serializable {

    @vo7("accountKey")
    private final String accountKey;

    @vo7("avatarUrl")
    private final String avatarUrl;

    @vo7("nickName")
    private final String nickName;

    public ProfileDto(String str, String str2, String str3) {
        js3.p(str2, "avatarUrl");
        js3.p(str3, "nickName");
        this.accountKey = str;
        this.avatarUrl = str2;
        this.nickName = str3;
    }

    public static /* synthetic */ ProfileDto copy$default(ProfileDto profileDto, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = profileDto.accountKey;
        }
        if ((i & 2) != 0) {
            str2 = profileDto.avatarUrl;
        }
        if ((i & 4) != 0) {
            str3 = profileDto.nickName;
        }
        return profileDto.copy(str, str2, str3);
    }

    public final String component1() {
        return this.accountKey;
    }

    public final String component2() {
        return this.avatarUrl;
    }

    public final String component3() {
        return this.nickName;
    }

    public final ProfileDto copy(String str, String str2, String str3) {
        js3.p(str2, "avatarUrl");
        js3.p(str3, "nickName");
        return new ProfileDto(str, str2, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileDto)) {
            return false;
        }
        ProfileDto profileDto = (ProfileDto) obj;
        return js3.i(this.accountKey, profileDto.accountKey) && js3.i(this.avatarUrl, profileDto.avatarUrl) && js3.i(this.nickName, profileDto.nickName);
    }

    public final String getAccountKey() {
        return this.accountKey;
    }

    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public int hashCode() {
        String str = this.accountKey;
        return this.nickName.hashCode() + rm7.k(this.avatarUrl, (str == null ? 0 : str.hashCode()) * 31, 31);
    }

    public String toString() {
        String str = this.accountKey;
        String str2 = this.avatarUrl;
        return dw1.s(rm7.t("ProfileDto(accountKey=", str, ", avatarUrl=", str2, ", nickName="), this.nickName, ")");
    }
}
