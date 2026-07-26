package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class o45 implements ai5 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;

    public o45(String str, String str2, String str3, boolean z) {
        js3.p(str, "packageKey");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public static final o45 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", o45.class, "packageKey")) {
            throw new IllegalArgumentException("Required argument \"packageKey\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageKey");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageKey\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        String string2 = bundle.getString("title");
        if (string2 == null) {
            throw new IllegalArgumentException("Argument \"title\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("analyticsName")) {
            throw new IllegalArgumentException("Required argument \"analyticsName\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("analyticsName");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"analyticsName\" is marked as non-null but was passed a null value.");
        }
        if (bundle.containsKey("search")) {
            return new o45(string, string2, string3, bundle.getBoolean("search"));
        }
        throw new IllegalArgumentException("Required argument \"search\" is missing and does not have an android:defaultValue");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o45)) {
            return false;
        }
        o45 o45Var = (o45) obj;
        return js3.i(this.a, o45Var.a) && js3.i(this.b, o45Var.b) && js3.i(this.c, o45Var.c) && this.d == o45Var.d;
    }

    public final int hashCode() {
        return rm7.k(this.c, rm7.k(this.b, this.a.hashCode() * 31, 31), 31) + (this.d ? 1231 : 1237);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("MovieMoreRecyclerListFragmentArgs(packageKey=", this.a, ", title=", this.b, ", analyticsName=");
        sbT.append(this.c);
        sbT.append(", search=");
        sbT.append(this.d);
        sbT.append(")");
        return sbT.toString();
    }
}
