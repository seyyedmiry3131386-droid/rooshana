package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SubscriptionItem implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("actionText")
    private final String actionText;

    @vo7("deselectedIcon")
    private final String deselectedIcon;

    @vo7("id")
    private final String id;

    @vo7("imageType")
    private final String imageType;

    @vo7("selectedIcon")
    private final String selectedIcon;

    @vo7("subTitle")
    private final String subTitle;

    @vo7("title")
    private final String title;

    public SubscriptionItem(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        js3.p(str, "title");
        js3.p(str2, "actionText");
        js3.p(str4, PackageListMetaDataDTO.KEY_ACTION);
        js3.p(str5, "selectedIcon");
        js3.p(str6, "deselectedIcon");
        js3.p(str7, "imageType");
        js3.p(str8, "id");
        this.title = str;
        this.actionText = str2;
        this.subTitle = str3;
        this.action = str4;
        this.selectedIcon = str5;
        this.deselectedIcon = str6;
        this.imageType = str7;
        this.id = str8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!SubscriptionItem.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.SubscriptionItem");
        SubscriptionItem subscriptionItem = (SubscriptionItem) obj;
        return js3.i(this.title, subscriptionItem.title) && js3.i(this.subTitle, subscriptionItem.subTitle);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActionText() {
        return this.actionText;
    }

    public final String getDeselectedIcon() {
        return this.deselectedIcon;
    }

    public final String getId() {
        return this.id;
    }

    public final String getImageType() {
        return this.imageType;
    }

    public final String getSelectedIcon() {
        return this.selectedIcon;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.subTitle;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }
}
