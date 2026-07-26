package defpackage;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class aa8 implements ai5 {
    public final String a;
    public final float b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;

    public aa8(String str, float f, boolean z, boolean z2, String str2, String str3, String str4) {
        this.a = str;
        this.b = f;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    public static final aa8 fromBundle(Bundle bundle) {
        if (!t61.B(bundle, "bundle", aa8.class, "packageName")) {
            throw new IllegalArgumentException("Required argument \"packageName\" is missing and does not have an android:defaultValue");
        }
        String string = bundle.getString("packageName");
        if (string == null) {
            throw new IllegalArgumentException("Argument \"packageName\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("rating")) {
            throw new IllegalArgumentException("Required argument \"rating\" is missing and does not have an android:defaultValue");
        }
        float f = bundle.getFloat("rating");
        String string2 = bundle.containsKey("comment") ? bundle.getString("comment") : "";
        if (!bundle.containsKey("isNewRate")) {
            throw new IllegalArgumentException("Required argument \"isNewRate\" is missing and does not have an android:defaultValue");
        }
        boolean z = bundle.getBoolean("isNewRate");
        if (!bundle.containsKey("editable")) {
            throw new IllegalArgumentException("Required argument \"editable\" is missing and does not have an android:defaultValue");
        }
        boolean z2 = bundle.getBoolean("editable");
        if (!bundle.containsKey("launchSource")) {
            throw new IllegalArgumentException("Required argument \"launchSource\" is missing and does not have an android:defaultValue");
        }
        String string3 = bundle.getString("launchSource");
        if (string3 == null) {
            throw new IllegalArgumentException("Argument \"launchSource\" is marked as non-null but was passed a null value.");
        }
        if (!bundle.containsKey("source")) {
            throw new IllegalArgumentException("Required argument \"source\" is missing and does not have an android:defaultValue");
        }
        String string4 = bundle.getString("source");
        if (string4 != null) {
            return new aa8(string, f, z, z2, string3, string4, string2);
        }
        throw new IllegalArgumentException("Argument \"source\" is marked as non-null but was passed a null value.");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa8)) {
            return false;
        }
        aa8 aa8Var = (aa8) obj;
        return js3.i(this.a, aa8Var.a) && Float.compare(this.b, aa8Var.b) == 0 && this.c == aa8Var.c && this.d == aa8Var.d && js3.i(this.e, aa8Var.e) && js3.i(this.f, aa8Var.f) && js3.i(this.g, aa8Var.g);
    }

    public final int hashCode() {
        int iK = rm7.k(this.f, rm7.k(this.e, (((dw1.g(this.b, this.a.hashCode() * 31, 31) + (this.c ? 1231 : 1237)) * 31) + (this.d ? 1231 : 1237)) * 31, 31), 31);
        String str = this.g;
        return iK + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SubmitCommentFragmentArgs(packageName=");
        sb.append(this.a);
        sb.append(", rating=");
        sb.append(this.b);
        sb.append(", isNewRate=");
        t61.A(sb, this.c, ", editable=", this.d, ", launchSource=");
        o40.I(this.e, ", source=", this.f, ", comment=", sb);
        return dw1.s(sb, this.g, ")");
    }
}
