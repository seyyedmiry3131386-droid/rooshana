package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ConfirmDTO implements Serializable {
    public static final String INPUT_TYPE_DIGIT = "digit";
    public static final String INPUT_TYPE_TEXT = "text";
    public static final String INPUT_TYPE_YES_NO = "yesno";
    private String callbackUrl;
    private String id;
    private String inputType;
    private int ln;
    private String message;

    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    public String getId() {
        return this.id;
    }

    public int getInputLength() {
        return this.ln;
    }

    public String getInputType() {
        return this.inputType;
    }

    public String getMessage() {
        return this.message;
    }

    public void setCallbackUrl(String str) {
        this.callbackUrl = str;
    }

    public void setId(String str) {
        this.id = str;
    }

    public void setInputType(String str) {
        this.inputType = str;
    }

    public void setLn(int i) {
        this.ln = i;
    }

    public void setMessage(String str) {
        this.message = str;
    }
}
