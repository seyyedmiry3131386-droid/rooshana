package defpackage;

import android.app.usage.UsageStats;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class bu {
    public final String a;
    public final String b;
    public final Drawable c;
    public final ws d;
    public final UsageStats e;

    public bu(String str, String str2, Drawable drawable, ws wsVar, UsageStats usageStats) {
        js3.p(str, "packageName");
        js3.p(str2, "title");
        js3.p(drawable, "logo");
        js3.p(wsVar, "appSize");
        this.a = str;
        this.b = str2;
        this.c = drawable;
        this.d = wsVar;
        this.e = usageStats;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        return js3.i(this.a, buVar.a) && js3.i(this.b, buVar.b) && js3.i(this.c, buVar.c) && js3.i(this.d, buVar.d) && js3.i(this.e, buVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + rm7.k(this.b, this.a.hashCode() * 31, 31)) * 31)) * 31;
        UsageStats usageStats = this.e;
        return iHashCode + (usageStats == null ? 0 : usageStats.hashCode());
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AppUsage(packageName=", this.a, ", title=", this.b, ", logo=");
        sbT.append(this.c);
        sbT.append(", appSize=");
        sbT.append(this.d);
        sbT.append(", appUsage=");
        sbT.append(this.e);
        sbT.append(")");
        return sbT.toString();
    }
}
