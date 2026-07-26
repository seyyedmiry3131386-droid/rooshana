package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class eh3 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final int g;

    public eh3(String str, String str2, String str3, String str4, String str5, long j, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = j;
        this.g = i;
    }

    public static final eh3 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", eh3.class, "startCallback")) {
            throw new IllegalArgumentException("Required argument \"startCallback\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("startCallback");
        if (!bundle.containsKey("packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("packageName");
        if (!bundle.containsKey("videoUrl")) {
            throw new IllegalArgumentException("Required argument \"videoUrl\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("videoUrl");
        if (!bundle.containsKey("aparatVideoId")) {
            throw new IllegalArgumentException("Required argument \"aparatVideoId\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("aparatVideoId");
        if (!bundle.containsKey("videoType")) {
            throw new IllegalArgumentException("Required argument \"videoType\" is missing and does not have an android:defaultValue");
        }
        String string5 = bundle.getString("videoType");
        if (string5 == null) {
            throw new IllegalArgumentException("Argument \"videoType\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("videoDuration")) {
            throw new IllegalArgumentException("Required argument \"videoDuration\" is missing and does not have an android:defaultValue");
        }
        long j = bundle.getLong("videoDuration");
        if (bundle.containsKey("orientation")) {
            return new eh3(string, string2, string3, string4, string5, j, bundle.getInt("orientation"));
        }
        throw new IllegalArgumentException("Required argument \"orientation\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh3)) {
            return false;
        }
        eh3 eh3Var = (eh3) obj;
        return js3.i(this.a, eh3Var.a) && js3.i(this.b, eh3Var.b) && js3.i(this.c, eh3Var.c) && js3.i(this.d, eh3Var.d) && js3.i(this.e, eh3Var.e) && this.f == eh3Var.f && this.g == eh3Var.g;
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int iK = rm7.k(this.e, (iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31, 31);
        long j = this.f;
        return ((iK + ((int) (j ^ (j >>> 32)))) * 31) + this.g;
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("IbexFragmentArgs(startCallback=", this.a, ", packageName=", this.b, ", videoUrl=");
        o40.I(this.c, ", aparatVideoId=", this.d, ", videoType=", sbT);
        sbT.append(this.e);
        sbT.append(", videoDuration=");
        sbT.append(this.f);
        sbT.append(", orientation=");
        sbT.append(this.g);
        sbT.append(")");
        return sbT.toString();
    }
}
