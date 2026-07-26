package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fp4 {
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public static final String m;
    public static final String n;
    public static final String o;
    public static final String p;
    public final Uri a;
    public final String b;
    public final cp4 c;
    public final wo4 d;
    public final List e;
    public final String f;
    public final ImmutableList g;
    public final long h;

    static {
        String str = j29.a;
        i = Integer.toString(0, 36);
        j = Integer.toString(1, 36);
        k = Integer.toString(2, 36);
        l = Integer.toString(3, 36);
        m = Integer.toString(4, 36);
        n = Integer.toString(5, 36);
        o = Integer.toString(6, 36);
        p = Integer.toString(7, 36);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fp4(Uri uri, String str, cp4 cp4Var, wo4 wo4Var, List list, String str2, ImmutableList immutableList, long j2) {
        this.a = uri;
        this.b = tv4.m(str);
        this.c = cp4Var;
        this.d = wo4Var;
        this.e = list;
        this.f = str2;
        this.g = immutableList;
        lj3 lj3VarM = ImmutableList.m();
        for (int i2 = 0; i2 < immutableList.size(); i2++) {
            ip4 ip4Var = (ip4) immutableList.get(i2);
            sx0 sx0Var = new sx0();
            sx0Var.d = ip4Var.a;
            sx0Var.a = ip4Var.b;
            sx0Var.e = ip4Var.c;
            sx0Var.b = ip4Var.d;
            sx0Var.c = ip4Var.e;
            sx0Var.f = ip4Var.f;
            sx0Var.g = ip4Var.g;
            lj3VarM.O(new hp4(sx0Var));
        }
        lj3VarM.S();
        this.h = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp4)) {
            return false;
        }
        fp4 fp4Var = (fp4) obj;
        return this.a.equals(fp4Var.a) && Objects.equals(this.b, fp4Var.b) && Objects.equals(this.c, fp4Var.c) && Objects.equals(this.d, fp4Var.d) && this.e.equals(fp4Var.e) && Objects.equals(this.f, fp4Var.f) && this.g.equals(fp4Var.g) && this.h == fp4Var.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        cp4 cp4Var = this.c;
        int iHashCode3 = (iHashCode2 + (cp4Var == null ? 0 : cp4Var.hashCode())) * 31;
        wo4 wo4Var = this.d;
        int iHashCode4 = (this.e.hashCode() + ((iHashCode3 + (wo4Var == null ? 0 : wo4Var.hashCode())) * 31)) * 31;
        String str2 = this.f;
        return (int) ((((long) ((this.g.hashCode() + ((iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31) + this.h);
    }
}
