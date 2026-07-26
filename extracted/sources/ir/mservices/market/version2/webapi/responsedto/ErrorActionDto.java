package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ErrorActionDto implements Serializable {
    private String action;
    private String buttonText;
    private String message;
    private String title;

    public String getAction() {
        return this.action;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAction(String str) {
        this.action = str;
    }

    public void setButtonText(String str) {
        this.buttonText = str;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
