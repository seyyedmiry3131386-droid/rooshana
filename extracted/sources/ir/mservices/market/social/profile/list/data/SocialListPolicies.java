package ir.mservices.market.social.profile.list.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SocialListPolicies implements Serializable {

    @vo7("canAddList")
    private final boolean canAddList;

    @vo7("itemPolicies")
    private final SocialItemPolicies itemPolicies;

    @vo7("message")
    private final String message;

    public SocialListPolicies(SocialItemPolicies socialItemPolicies, boolean z, String str) {
        js3.p(socialItemPolicies, "itemPolicies");
        this.itemPolicies = socialItemPolicies;
        this.canAddList = z;
        this.message = str;
    }

    public final boolean getCanAddList() {
        return this.canAddList;
    }

    public final SocialItemPolicies getItemPolicies() {
        return this.itemPolicies;
    }

    public final String getMessage() {
        return this.message;
    }
}
