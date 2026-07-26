package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class VerifyResultDTO extends ResultDTO implements Serializable {
    private String accountId;
    private ProfileInfoDto accountInfo;
    private String accountKey;
    private String bindingValue;
    private String publicUserId;

    public VerifyResultDTO(int i, String str, String str2) {
        super(i, str, str2);
    }

    public String getAccountId() {
        return this.accountId;
    }

    public ProfileInfoDto getAccountInfo() {
        return this.accountInfo;
    }

    public String getAccountKey() {
        return this.accountKey;
    }

    public String getBindingValue() {
        return this.bindingValue;
    }

    public String getPublicUserId() {
        return this.publicUserId;
    }
}
