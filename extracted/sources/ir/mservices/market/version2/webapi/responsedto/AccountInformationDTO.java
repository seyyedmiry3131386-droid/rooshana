package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AccountInformationDTO implements Serializable {
    private String accountKey;
    private String avatar;
    private boolean isVerified;
    private String nickname;

    public String getAccountKey() {
        return this.accountKey;
    }

    public String getAvatar() {
        return this.avatar;
    }

    public boolean getIsVerified() {
        return this.isVerified;
    }

    public String getNickname() {
        return this.nickname;
    }
}
