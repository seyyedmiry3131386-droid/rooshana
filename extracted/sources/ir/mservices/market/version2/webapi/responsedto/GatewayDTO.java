package ir.mservices.market.version2.webapi.responsedto;

import defpackage.bl4;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GatewayDTO implements Serializable {
    public static final String GATEWAY_TYPE_BANK = "bank";
    private String analyticsName;
    private String buttonText;
    private String description;
    private String deselectedIconUrl;
    private boolean hasRetry;
    private String iconUrl;
    private boolean isAutomatedSelect;
    private String title;
    private String type;
    private String url;

    public String getAnalyticsName() {
        return this.analyticsName;
    }

    public String getButtonText() {
        return this.buttonText;
    }

    public String getDescription() {
        return this.description;
    }

    public String getDeselectedIconUrl() {
        return this.deselectedIconUrl;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public String getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean hasRetry() {
        return this.hasRetry;
    }

    public boolean isAutomatedSelect() {
        return this.isAutomatedSelect;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GatewayDTO{title='");
        sb.append(this.title);
        sb.append("', iconUrl='");
        sb.append(this.iconUrl);
        sb.append("', deselectedIconUrl='");
        sb.append(this.deselectedIconUrl);
        sb.append("', description='");
        sb.append(this.description);
        sb.append("', type='");
        sb.append(this.type);
        sb.append("', url='");
        sb.append(this.url);
        sb.append("', buttonText='");
        sb.append(this.buttonText);
        sb.append("', analyticsName='");
        sb.append(this.analyticsName);
        sb.append("', hasRetry=");
        return bl4.A(sb, this.hasRetry, '}');
    }
}
