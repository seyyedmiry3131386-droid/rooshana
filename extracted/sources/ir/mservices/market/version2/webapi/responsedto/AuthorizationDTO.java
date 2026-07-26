package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class AuthorizationDTO implements Serializable {
    private String accountId;
    private String accountKey;
    private String publicUserId;
    private String token;

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountKey() {
        return this.accountKey;
    }

    public String getPublicUserId() {
        return this.publicUserId;
    }

    public String getToken() {
        return this.token;
    }

    public void setAccountId(String str) {
        this.accountId = str;
    }

    public void setAccountKey(String str) {
        this.accountKey = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
