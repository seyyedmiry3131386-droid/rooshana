package defpackage;

import android.net.Uri;
import com.google.common.collect.ImmutableList;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class d03 {
    public final String a;
    public final Uri b;
    public final Uri c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final List h;
    public final boolean i;
    public final long j;
    public final long k;
    public final ImmutableList l;
    public final ImmutableList m;
    public final ImmutableList n;
    public final boolean o;
    public final String p;
    public final String q;

    public d03(String str, Uri uri, Uri uri2, long j, long j2, long j3, long j4, ArrayList arrayList, boolean z, long j5, long j6, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, boolean z2, String str2, String str3) {
        vy2.j((uri == null || uri2 == null) && !(uri == null && uri2 == null));
        this.a = str;
        this.b = uri;
        this.c = uri2;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = arrayList;
        this.i = z;
        this.j = j5;
        this.k = j6;
        this.l = ImmutableList.n(arrayList2);
        this.m = ImmutableList.n(arrayList3);
        this.n = ImmutableList.x(new mh(12), arrayList4);
        this.o = z2;
        this.p = str2;
        this.q = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d03)) {
            return false;
        }
        d03 d03Var = (d03) obj;
        return this.d == d03Var.d && this.e == d03Var.e && this.f == d03Var.f && this.g == d03Var.g && this.i == d03Var.i && this.j == d03Var.j && this.k == d03Var.k && this.o == d03Var.o && Objects.equals(this.a, d03Var.a) && Objects.equals(this.b, d03Var.b) && Objects.equals(this.c, d03Var.c) && Objects.equals(this.h, d03Var.h) && Objects.equals(this.l, d03Var.l) && Objects.equals(this.m, d03Var.m) && Objects.equals(this.n, d03Var.n) && Objects.equals(this.p, d03Var.p) && Objects.equals(this.q, d03Var.q);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, Long.valueOf(this.d), Long.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), this.h, Boolean.valueOf(this.i), Long.valueOf(this.j), Long.valueOf(this.k), this.l, this.m, this.n, Boolean.valueOf(this.o), this.p, this.q);
    }
}
