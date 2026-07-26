package ir.mservices.market.version2.webapi.responsedto;

import android.text.TextUtils;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class SearchBannerDto implements Serializable {
    private String action;
    private String bannerUrl;
    private String bgColor;
    private String size;
    private String title;

    public String getAction() {
        return this.action;
    }

    public String getBannerUrl() {
        return this.bannerUrl;
    }

    public String getBgColor() {
        return this.bgColor;
    }

    public String getSize() {
        return !TextUtils.isEmpty(this.size) ? this.size.toLowerCase(Locale.US) : "";
    }

    public String getTitle() {
        return this.title;
    }
}
