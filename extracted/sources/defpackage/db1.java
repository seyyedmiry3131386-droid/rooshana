package defpackage;

import android.net.Uri;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class db1 {
    public final Uri a;
    public final long b;
    public final int c;
    public final byte[] d;
    public final Map e;
    public final long f;
    public final long g;
    public final String h;
    public final int i;

    static {
        lp4.a("media3.datasource");
    }

    public db1(Uri uri, long j, int i, byte[] bArr, Map map, long j2, long j3, String str, int i2) {
        vy2.j(j + j2 >= 0);
        vy2.j(j2 >= 0);
        vy2.j(j3 > 0 || j3 == -1);
        uri.getClass();
        this.a = uri;
        this.b = j;
        this.c = i;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.e = DesugarCollections.unmodifiableMap(new HashMap(map));
        this.f = j2;
        this.g = j3;
        this.h = str;
        this.i = i2;
    }

    public static String b(int i) {
        if (i == 1) {
            return "GET";
        }
        if (i == 2) {
            return "POST";
        }
        if (i == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final cb1 a() {
        cb1 cb1Var = new cb1();
        cb1Var.a = this.a;
        cb1Var.b = this.b;
        cb1Var.c = this.c;
        cb1Var.d = this.d;
        cb1Var.e = this.e;
        cb1Var.f = this.f;
        cb1Var.g = this.g;
        cb1Var.h = this.h;
        cb1Var.i = this.i;
        return cb1Var;
    }

    public final db1 c(long j, long j2) {
        if (j == 0 && this.g == j2) {
            return this;
        }
        return new db1(this.a, this.b, this.c, this.d, this.e, this.f + j, j2, this.h, this.i);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.c));
        sb.append(" ");
        sb.append(this.a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.h);
        sb.append(", ");
        return dw1.k(this.i, "]", sb);
    }
}
