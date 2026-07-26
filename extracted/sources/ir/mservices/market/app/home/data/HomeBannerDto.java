package ir.mservices.market.app.home.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.HomeItemDTO;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class HomeBannerDto extends HomeItemDTO implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_SIZE_TYPE)
    private final String _sizeType;

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private final String action;

    @vo7("analyticsName")
    private final String analyticsName;

    @vo7(PackageListMetaDataDTO.KEY_BG)
    private final String bg;

    @vo7(PackageListMetaDataDTO.KEY_IMAGE_URL)
    private final String imageUrl;

    @vo7("itemId")
    private final String itemId;

    @vo7("landImageUrl")
    private final String landImageUrl;

    @vo7("title")
    private final String title;

    public HomeBannerDto(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.itemId = str;
        this.title = str2;
        this.bg = str3;
        this.action = str4;
        this.imageUrl = str5;
        this.landImageUrl = str6;
        this.analyticsName = str7;
        this._sizeType = str8;
    }

    public static /* synthetic */ void getSizeType$annotations() {
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getBg() {
        return this.bg;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getLandImageUrl() {
        return this.landImageUrl;
    }

    public final String getSizeType() {
        String str = this._sizeType;
        if (str == null) {
            return "";
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public final String getTitle() {
        return this.title;
    }
}
