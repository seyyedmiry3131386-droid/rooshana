package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileInfoDto implements Serializable {
    private String avatarUrl;
    private String email;
    private String nickname;
    private String phone;

    public String getAvatarURL() {
        return this.avatarUrl;
    }

    public String getEmail() {
        return this.email;
    }

    public String getNickname() {
        return this.nickname;
    }

    public String getPhone() {
        return this.phone;
    }
}
