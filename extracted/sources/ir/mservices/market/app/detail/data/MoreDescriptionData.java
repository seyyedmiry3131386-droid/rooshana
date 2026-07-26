package ir.mservices.market.app.detail.data;

import defpackage.js3;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreDescriptionData implements Serializable {
    private final String actualSize;
    private final String contentRatingUrl;
    private final AppDescriptionDto description;
    private final String diffCheckSum;
    private final String diffSize;
    private final boolean hasIap;
    private final String iconPath;
    private final String lastUpdate;
    private final MoneyBackSummaryDto moneyBackSummary;
    private final String packageName;
    private final List<PermissionDto> permissions;
    private final ShamadDto shamad;
    private final String title;
    private final AppVersionDto version;
    private final AppDescriptionDto whatsNew;

    public MoreDescriptionData(String str, AppDescriptionDto appDescriptionDto, AppDescriptionDto appDescriptionDto2, String str2, AppVersionDto appVersionDto, String str3, String str4, String str5, List<PermissionDto> list, String str6, String str7, boolean z, MoneyBackSummaryDto moneyBackSummaryDto, ShamadDto shamadDto, String str8) {
        js3.p(str, "packageName");
        js3.p(str2, "actualSize");
        js3.p(appVersionDto, "version");
        js3.p(str6, "title");
        js3.p(str7, "iconPath");
        this.packageName = str;
        this.description = appDescriptionDto;
        this.whatsNew = appDescriptionDto2;
        this.actualSize = str2;
        this.version = appVersionDto;
        this.lastUpdate = str3;
        this.diffSize = str4;
        this.diffCheckSum = str5;
        this.permissions = list;
        this.title = str6;
        this.iconPath = str7;
        this.hasIap = z;
        this.moneyBackSummary = moneyBackSummaryDto;
        this.shamad = shamadDto;
        this.contentRatingUrl = str8;
    }

    public final String getActualSize() {
        return this.actualSize;
    }

    public final String getContentRatingUrl() {
        return this.contentRatingUrl;
    }

    public final AppDescriptionDto getDescription() {
        return this.description;
    }

    public final String getDiffCheckSum() {
        return this.diffCheckSum;
    }

    public final String getDiffSize() {
        return this.diffSize;
    }

    public final boolean getHasIap() {
        return this.hasIap;
    }

    public final String getIconPath() {
        return this.iconPath;
    }

    public final String getLastUpdate() {
        return this.lastUpdate;
    }

    public final MoneyBackSummaryDto getMoneyBackSummary() {
        return this.moneyBackSummary;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final List<PermissionDto> getPermissions() {
        return this.permissions;
    }

    public final ShamadDto getShamad() {
        return this.shamad;
    }

    public final String getTitle() {
        return this.title;
    }

    public final AppVersionDto getVersion() {
        return this.version;
    }

    public final AppDescriptionDto getWhatsNew() {
        return this.whatsNew;
    }
}
