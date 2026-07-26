package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class p07 {
    public final long a;
    public final long b;
    public final long c;
    public final String d;
    public final boolean e;
    public final Map f;

    public p07(long j, long j2, long j3, String str, boolean z, Map map) {
        js3.p(str, "reelId");
        js3.p(map, "params");
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = str;
        this.e = z;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p07)) {
            return false;
        }
        p07 p07Var = (p07) obj;
        return this.a == p07Var.a && this.b == p07Var.b && this.c == p07Var.c && js3.i(this.d, p07Var.d) && this.e == p07Var.e && js3.i(this.f, p07Var.f);
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.c;
        return this.f.hashCode() + ((rm7.k(this.d, (i + ((int) (j3 ^ (j3 >>> 32)))) * 31, 31) + (this.e ? 1231 : 1237)) * 31);
    }

    public final String toString() {
        StringBuilder sbS = rm7.s(this.a, "AnalyticsParameter(duration=", ", createdAt=");
        sbS.append(this.b);
        sbS.append(", currentPlayedSeconds=");
        sbS.append(this.c);
        sbS.append(", reelId=");
        sbS.append(this.d);
        sbS.append(", autoScroll=");
        sbS.append(this.e);
        sbS.append(", params=");
        sbS.append(this.f);
        sbS.append(")");
        return sbS.toString();
    }
}
