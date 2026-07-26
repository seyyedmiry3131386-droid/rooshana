package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ch6 {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final boolean e;
    public final float f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final long j;
    public final long k;

    public ch6(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, long j6) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = z;
        this.f = f;
        this.g = i;
        this.h = z2;
        this.i = arrayList;
        this.j = j5;
        this.k = j6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ch6)) {
            return false;
        }
        ch6 ch6Var = (ch6) obj;
        return ct2.h(this.a, ch6Var.a) && this.b == ch6Var.b && nr5.c(this.c, ch6Var.c) && nr5.c(this.d, ch6Var.d) && this.e == ch6Var.e && Float.compare(this.f, ch6Var.f) == 0 && this.g == ch6Var.g && this.h == ch6Var.h && this.i.equals(ch6Var.i) && nr5.c(this.j, ch6Var.j) && nr5.c(this.k, ch6Var.k);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return nr5.e(this.k) + ((nr5.e(this.j) + ((this.i.hashCode() + ((((dw1.g(this.f, (((nr5.e(this.d) + ((nr5.e(this.c) + (((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31)) * 31)) * 31) + (this.e ? 1231 : 1237)) * 31, 31) + this.g) * 31) + (this.h ? 1231 : 1237)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) ct2.A(this.a)) + ", uptime=" + this.b + ", positionOnScreen=" + ((Object) nr5.i(this.c)) + ", position=" + ((Object) nr5.i(this.d)) + ", down=" + this.e + ", pressure=" + this.f + ", type=" + ((Object) hh6.a(this.g)) + ", activeHover=" + this.h + ", historical=" + this.i + ", scrollDelta=" + ((Object) nr5.i(this.j)) + ", originalEventPosition=" + ((Object) nr5.i(this.k)) + ')';
    }
}
