package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BindResultDTO extends ResultDTO implements Serializable {
    public VerificationAccountInfoDTO accountInfo;
    private int delayInSec;
    private boolean isVoiceMsgEnable;
    private int ln;
    public String url;

    public BindResultDTO(int i, String str, String str2) {
        super(i, str, str2);
    }

    public int getDelayInSec() {
        return this.delayInSec;
    }

    public int getLength() {
        return this.ln;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isVoiceMsgEnable() {
        return this.isVoiceMsgEnable;
    }

    public void setLn(int i) {
        this.ln = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
