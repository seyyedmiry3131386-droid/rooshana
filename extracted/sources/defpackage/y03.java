package defpackage;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class y03 {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public y03(String str, String str2, int i, int i2, String str3, String str4) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y03.class == obj.getClass()) {
            y03 y03Var = (y03) obj;
            if (this.a == y03Var.a && this.b == y03Var.b && TextUtils.equals(this.c, y03Var.c) && TextUtils.equals(this.d, y03Var.d) && TextUtils.equals(this.e, y03Var.e) && TextUtils.equals(this.f, y03Var.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        int iHashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.d;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.e;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }
}
