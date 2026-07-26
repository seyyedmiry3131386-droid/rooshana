package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class LoginDto extends ResultDTO implements Serializable {
    private String accountId;
    private String accountKey;

    public LoginDto(int i, String str, String str2) {
        super(i, str, str2);
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountKey() {
        return this.accountKey;
    }
}
