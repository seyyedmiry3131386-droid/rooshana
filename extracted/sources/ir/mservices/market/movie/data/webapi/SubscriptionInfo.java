package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionInfo implements Serializable {

    @vo7("actionText")
    private final String actionText;

    @vo7("items")
    private final List<SubscriptionItem> items;

    @vo7("showInDetail")
    private final Boolean showInDetail;

    @vo7("subTitle")
    private final String subTitle;

    @vo7("title")
    private final String title;

    public SubscriptionInfo(String str, String str2, List<SubscriptionItem> list, String str3, Boolean bool) {
        js3.p(str, "title");
        js3.p(str2, "actionText");
        js3.p(list, "items");
        js3.p(str3, "subTitle");
        this.title = str;
        this.actionText = str2;
        this.items = list;
        this.subTitle = str3;
        this.showInDetail = bool;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final List<SubscriptionItem> getItems() {
        return this.items;
    }

    public final Boolean getShowInDetail() {
        return this.showInDetail;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }
}
