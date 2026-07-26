package ir.mservices.market.version2.webapi.responsedto;

import defpackage.g32;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class SearchSuggestionsAppDto implements Serializable, g32 {
    private String iconPath;
    private String packageName;
    private String refId;
    private String title;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.packageName, ((SearchSuggestionsAppDto) obj).packageName);
    }

    public String getIconPath() {
        return this.iconPath;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getRefId() {
        return this.refId;
    }

    public String getTitle() {
        return this.title;
    }

    @Override // defpackage.g32
    public String getUniqueId() {
        return this.packageName;
    }

    public int hashCode() {
        return Objects.hash(this.packageName);
    }
}
