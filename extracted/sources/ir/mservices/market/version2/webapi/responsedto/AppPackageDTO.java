package ir.mservices.market.version2.webapi.responsedto;

import defpackage.bf5;
import defpackage.js3;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class AppPackageDTO implements Serializable, bf5 {
    private List<? extends ApplicationDTO> appPlusMetaDataList;
    private final boolean eol;
    private final List<String> ignoreConditions;
    private final Map<String, String> metaData;
    private final String shareText;
    private final String title;

    public AppPackageDTO(String str, List<? extends ApplicationDTO> list, Map<String, String> map, boolean z, String str2, List<String> list2) {
        js3.p(map, "metaData");
        js3.p(str2, "shareText");
        this.title = str;
        this.appPlusMetaDataList = list;
        this.metaData = map;
        this.eol = z;
        this.shareText = str2;
        this.ignoreConditions = list2;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final List<ApplicationDTO> getAppPlusMetaDataList() {
        return this.appPlusMetaDataList;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    public final Map<String, String> getMetaData() {
        return this.metaData;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setAppPlusMetaDataList(List<? extends ApplicationDTO> list) {
        this.appPlusMetaDataList = list;
    }
}
