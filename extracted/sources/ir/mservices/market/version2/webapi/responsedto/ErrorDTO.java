package ir.mservices.market.version2.webapi.responsedto;

import android.content.Context;
import android.text.TextUtils;
import defpackage.dw1;
import defpackage.hh2;
import defpackage.lw;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorDTO implements Serializable {
    public static final int CODE_ACCESS_DENIED = 400;
    public static final int CODE_ALREADY_PURCHASED = 510;
    public static final int CODE_AUTHORIZATION_FAILURE = 1;
    public static final int CODE_CLIENT_ERROR = -1;
    public static final int CODE_CLIENT_GOOGLE_SEARCH_ERROR = -167;
    public static final int CODE_FORCE_UPDATE = 426;
    public static final int CODE_JSON_ERROR = -2;
    public static final int CODE_NO_CONNECTION = 2;
    public static final int CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR = 200;
    public static final int CODE_REDIRECT_NOT_VALID_LOCATION_ERROR = -3;
    public static final int CODE_SERVER_SING_OUT = 401;
    public static final String MESSAGE_CODE_SIGN_NOT_MATCHED = "SignNotMatched";
    private int code;
    private ErrorActionDto errorAction;
    private String extra;
    private String host;
    private int httpStatus;
    private String messageCode;
    private String translatedMessage;

    public ErrorDTO(int i, String str, String str2) {
        this.httpStatus = -1;
        this.code = i;
        this.messageCode = str;
        this.translatedMessage = str2;
    }

    public void assertToastMessage(Context context) {
        if (TextUtils.isEmpty(getTranslatedMessage())) {
            lw.g(null, null, null);
            return;
        }
        hh2 hh2Var = new hh2(context, getTranslatedMessage());
        hh2Var.G();
        hh2.H(hh2Var);
    }

    public int getCode() {
        return this.code;
    }

    public ErrorActionDto getErrorAction() {
        return this.errorAction;
    }

    public String getExtra() {
        return this.extra;
    }

    public String getHost() {
        return this.host;
    }

    public int getHttpStatus() {
        return this.httpStatus;
    }

    public String getMessageCode() {
        return this.messageCode;
    }

    public String getTranslatedMessage() {
        return this.translatedMessage;
    }

    public void setCode(int i) {
        this.code = i;
    }

    public void setErrorAction(ErrorActionDto errorActionDto) {
        this.errorAction = errorActionDto;
    }

    public void setHost(String str) {
        this.host = str;
    }

    public void setHttpStatus(int i) {
        this.httpStatus = i;
    }

    public void setMessageCode(String str) {
        this.messageCode = str;
    }

    public void setTranslatedMessage(String str) {
        this.translatedMessage = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ErrorDTO{code=");
        sb.append(this.code);
        sb.append(", messageCode='");
        return dw1.s(sb, this.messageCode, "'}");
    }

    public ErrorDTO(int i, int i2, String str, String str2) {
        this.code = i;
        this.httpStatus = i2;
        this.messageCode = str;
        this.translatedMessage = str2;
    }
}
