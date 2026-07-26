package ir.mservices.market.version2.webapi.responsedto;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BindInfoDTO implements Serializable {
    public static final String BIND_TYPE_EMAIL = "Email";
    public static final String BIND_TYPE_EMAIL_OR_PHONE = "EmailOrPhone";
    public static final String BIND_TYPE_PHONE = "Phone";
    private String description;
    private String iconUrl;
    private String name;

    @BindType
    private String type;
    private String value;

    public @interface BindType {
    }

    public String getDescription() {
        return this.description;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getName() {
        return this.name;
    }

    @BindType
    public String getType() {
        return this.type;
    }

    public String getValue() {
        return this.value;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setValue(String str) {
        this.value = str;
    }
}
