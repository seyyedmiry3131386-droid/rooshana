package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.data.StartApplicationData;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class hp implements ai5 {
    public final String a;
    public final boolean b;
    public final Tracker c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final StartApplicationData i;
    public final Utm j;
    public final String k;
    public final String l;
    public final String m;

    public hp(String str, boolean z, Tracker tracker, boolean z2, String str2, String str3, String str4, String str5, StartApplicationData startApplicationData, Utm utm, String str6, String str7, String str8) {
        js3.p(str, "packageName");
        js3.p(tracker, "launcherSource");
        js3.p(str3, "refId");
        this.a = str;
        this.b = z;
        this.c = tracker;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = startApplicationData;
        this.j = utm;
        this.k = str6;
        this.l = str7;
        this.m = str8;
    }

    public static final hp fromBundle(Bundle bundle) {
        return m91.m(bundle);
    }

    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putString("packageName", this.a);
        bundle.putBoolean("isStartDownload", this.b);
        boolean zIsAssignableFrom = Parcelable.class.isAssignableFrom(Tracker.class);
        Tracker tracker = this.c;
        if (zIsAssignableFrom) {
            js3.n(tracker, "null cannot be cast to non-null type android.os.Parcelable");
            bundle.putParcelable("launcherSource", tracker);
        } else {
            if (!Serializable.class.isAssignableFrom(Tracker.class)) {
                throw new UnsupportedOperationException(Tracker.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            js3.n(tracker, "null cannot be cast to non-null type java.io.Serializable");
            bundle.putSerializable("launcherSource", tracker);
        }
        bundle.putBoolean("hasIcon", this.d);
        bundle.putString("q", this.e);
        bundle.putString("refId", this.f);
        bundle.putString("callbackUrl", this.g);
        bundle.putString("installCallbackUrl", this.h);
        boolean zIsAssignableFrom2 = Parcelable.class.isAssignableFrom(StartApplicationData.class);
        Serializable serializable = this.i;
        if (zIsAssignableFrom2) {
            bundle.putParcelable("data", (Parcelable) serializable);
        } else {
            if (!Serializable.class.isAssignableFrom(StartApplicationData.class)) {
                throw new UnsupportedOperationException(StartApplicationData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("data", serializable);
        }
        boolean zIsAssignableFrom3 = Parcelable.class.isAssignableFrom(Utm.class);
        Serializable serializable2 = this.j;
        if (zIsAssignableFrom3) {
            bundle.putParcelable("utm", (Parcelable) serializable2);
        } else {
            if (!Serializable.class.isAssignableFrom(Utm.class)) {
                throw new UnsupportedOperationException(Utm.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
            }
            bundle.putSerializable("utm", serializable2);
        }
        bundle.putString("caller", this.k);
        bundle.putString("deepLink", this.l);
        bundle.putString("clickCallback", this.m);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hp)) {
            return false;
        }
        hp hpVar = (hp) obj;
        return js3.i(this.a, hpVar.a) && this.b == hpVar.b && js3.i(this.c, hpVar.c) && this.d == hpVar.d && js3.i(this.e, hpVar.e) && js3.i(this.f, hpVar.f) && js3.i(this.g, hpVar.g) && js3.i(this.h, hpVar.h) && js3.i(this.i, hpVar.i) && js3.i(this.j, hpVar.j) && js3.i(this.k, hpVar.k) && js3.i(this.l, hpVar.l) && js3.i(this.m, hpVar.m);
    }

    public final int hashCode() {
        int iHashCode = (((this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1231 : 1237)) * 31)) * 31) + (this.d ? 1231 : 1237)) * 31;
        String str = this.e;
        int iK = rm7.k(this.f, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.g;
        int iHashCode2 = (iK + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        StartApplicationData startApplicationData = this.i;
        int iHashCode4 = (iHashCode3 + (startApplicationData == null ? 0 : startApplicationData.hashCode())) * 31;
        Utm utm = this.j;
        int iHashCode5 = (iHashCode4 + (utm == null ? 0 : utm.hashCode())) * 31;
        String str4 = this.k;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.l;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.m;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppDetailFragmentArgs(packageName=");
        sb.append(this.a);
        sb.append(", isStartDownload=");
        sb.append(this.b);
        sb.append(", launcherSource=");
        sb.append(this.c);
        sb.append(", hasIcon=");
        sb.append(this.d);
        sb.append(", q=");
        o40.I(this.e, ", refId=", this.f, ", callbackUrl=", sb);
        o40.I(this.g, ", installCallbackUrl=", this.h, ", data=", sb);
        sb.append(this.i);
        sb.append(", utm=");
        sb.append(this.j);
        sb.append(", caller=");
        o40.I(this.k, ", deepLink=", this.l, ", clickCallback=", sb);
        return dw1.s(sb, this.m, ")");
    }
}
