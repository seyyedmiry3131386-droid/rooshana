package defpackage;

import android.net.Uri;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class ip4 {
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        String str = j29.a;
        h = Integer.toString(0, 36);
        i = Integer.toString(1, 36);
        j = Integer.toString(2, 36);
        k = Integer.toString(3, 36);
        l = Integer.toString(4, 36);
        m = Integer.toString(5, 36);
        n = Integer.toString(6, 36);
    }

    public ip4(sx0 sx0Var) {
        this.a = (Uri) sx0Var.d;
        this.b = sx0Var.a;
        this.c = (String) sx0Var.e;
        this.d = sx0Var.b;
        this.e = sx0Var.c;
        this.f = (String) sx0Var.f;
        this.g = (String) sx0Var.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ip4)) {
            return false;
        }
        ip4 ip4Var = (ip4) obj;
        return this.a.equals(ip4Var.a) && Objects.equals(this.b, ip4Var.b) && Objects.equals(this.c, ip4Var.c) && this.d == ip4Var.d && this.e == ip4Var.e && Objects.equals(this.f, ip4Var.f) && Objects.equals(this.g, ip4Var.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.d) * 31) + this.e) * 31;
        String str3 = this.f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }
}
