package ir.mservices.market.movie.data.webapi;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class TagDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_ACTION)
    private String action;

    @vo7("analyticsName")
    private String analyticsName;

    @vo7("label")
    private String label;

    public TagDto(String str, String str2, String str3) {
        js3.p(str2, "label");
        this.action = str;
        this.label = str2;
        this.analyticsName = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!TagDto.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.movie.data.webapi.TagDto");
        return js3.i(this.action, ((TagDto) obj).action);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getAnalyticsName() {
        return this.analyticsName;
    }

    public final String getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.action;
        return this.label.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    public final void setAction(String str) {
        this.action = str;
    }

    public final void setAnalyticsName(String str) {
        this.analyticsName = str;
    }

    public final void setLabel(String str) {
        js3.p(str, "<set-?>");
        this.label = str;
    }
}
