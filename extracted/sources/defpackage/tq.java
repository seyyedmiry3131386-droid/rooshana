package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.version2.webapi.responsedto.ApplicationList;
import java.io.Serializable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class tq implements ai5 {
    public final ApplicationList a;
    public final String b;
    public final String[] c;

    public tq(ApplicationList applicationList, String str, String[] strArr) {
        this.a = applicationList;
        this.b = str;
        this.c = strArr;
    }

    public static final tq fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", tq.class, "apps")) {
            throw new IllegalArgumentException("Required argument \"apps\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ApplicationList.class) && !Serializable.class.isAssignableFrom(ApplicationList.class)) {
            throw new UnsupportedOperationException(ApplicationList.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ApplicationList applicationList = (ApplicationList) bundle.get("apps");
        if (applicationList == null) {
            throw new IllegalArgumentException("Argument \"apps\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("title");
        if (bundle.containsKey("ignoreCondition")) {
            return new tq(applicationList, string, bundle.getStringArray("ignoreCondition"));
        }
        throw new IllegalArgumentException("Required argument \"ignoreCondition\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tq)) {
            return false;
        }
        tq tqVar = (tq) obj;
        return js3.i(this.a, tqVar.a) && js3.i(this.b, tqVar.b) && js3.i(this.c, tqVar.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String[] strArr = this.c;
        return iHashCode2 + (strArr != null ? Arrays.hashCode(strArr) : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.c);
        StringBuilder sb = new StringBuilder("AppListRecyclerListFragmentArgs(apps=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", ignoreCondition=");
        return dw1.s(sb, string, ")");
    }
}
