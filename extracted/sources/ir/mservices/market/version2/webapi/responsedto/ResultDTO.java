package ir.mservices.market.version2.webapi.responsedto;

import defpackage.dw1;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ResultDTO implements Serializable {
    public static final int CODE_ALREADY_OWNED = 510;
    private int code;
    private String messageCode;
    private String translatedMessage;

    public ResultDTO(int i, String str, String str2) {
        this.code = i;
        this.messageCode = str;
        this.translatedMessage = str2;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessageCode() {
        return this.messageCode;
    }

    public String getTranslatedMessage() {
        return this.translatedMessage;
    }

    public void setTranslatedMessage(String str) {
        this.translatedMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ResultDTO{code=");
        sb.append(this.code);
        sb.append(", messageCode='");
        return dw1.s(sb, this.messageCode, "'}");
    }
}
