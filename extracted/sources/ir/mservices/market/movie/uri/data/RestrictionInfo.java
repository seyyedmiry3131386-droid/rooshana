package ir.mservices.market.movie.uri.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.SubscriptionItem;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RestrictionInfo implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("iconUrl")
    private final String iconUrl;

    @vo7("items")
    private final List<SubscriptionItem> items;

    @vo7("primaryButton")
    private final RestrictionInfoButtonDto primaryButton;

    @vo7("secondaryButton")
    private final RestrictionInfoButtonDto secondaryButton;

    @vo7("title")
    private final String title;

    public RestrictionInfo(String str, String str2, String str3, List<SubscriptionItem> list, RestrictionInfoButtonDto restrictionInfoButtonDto, RestrictionInfoButtonDto restrictionInfoButtonDto2) {
        js3.p(str3, PackageListMetaDataDTO.KEY_DESCRIPTION);
        js3.p(list, "items");
        this.iconUrl = str;
        this.title = str2;
        this.description = str3;
        this.items = list;
        this.primaryButton = restrictionInfoButtonDto;
        this.secondaryButton = restrictionInfoButtonDto2;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final List<SubscriptionItem> getItems() {
        return this.items;
    }

    public final RestrictionInfoButtonDto getPrimaryButton() {
        return this.primaryButton;
    }

    public final RestrictionInfoButtonDto getSecondaryButton() {
        return this.secondaryButton;
    }

    public final String getTitle() {
        return this.title;
    }
}
