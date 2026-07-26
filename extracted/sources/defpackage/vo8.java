package defpackage;

import androidx.media3.common.b;

/* JADX INFO: loaded from: classes.dex */
public final class vo8 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final b g;
    public final int h;
    public final long[] i;
    public final long[] j;
    public final int k;
    public final wo8[] l;

    public vo8(int i, int i2, long j, long j2, long j3, long j4, b bVar, int i3, wo8[] wo8VarArr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = bVar;
        this.h = i3;
        this.l = wo8VarArr;
        this.k = i4;
        this.i = jArr;
        this.j = jArr2;
    }

    public final vo8 a(b bVar) {
        return new vo8(this.a, this.b, this.c, this.d, this.e, this.f, bVar, this.h, this.l, this.k, this.i, this.j);
    }
}
