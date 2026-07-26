package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class bb {
    public static final bb f = new bb(new ab[0], 0, -9223372036854775807L, 0);
    public static final ab g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public final int a;
    public final long b;
    public final long c;
    public final int d;
    public final ab[] e;

    static {
        ab abVar = new ab(0L, -1, -1, new int[0], new jp4[0], new long[0], 0L, false, new String[0], false);
        int[] iArr = abVar.f;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = abVar.g;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        g = new ab(abVar.a, 0, abVar.c, iArrCopyOf, (jp4[]) Arrays.copyOf(abVar.e, 0), jArrCopyOf, abVar.i, abVar.j, (String[]) Arrays.copyOf(abVar.h, 0), abVar.k);
        String str = j29.a;
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
    }

    public bb(ab[] abVarArr, long j2, long j3, int i2) {
        this.b = j2;
        this.c = j3;
        this.a = abVarArr.length + i2;
        this.e = abVarArr;
        this.d = i2;
    }

    public final ab a(int i2) {
        int i3 = this.d;
        return i2 < i3 ? g : this.e[i2 - i3];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || bb.class != obj.getClass()) {
            return false;
        }
        bb bbVar = (bb) obj;
        return this.a == bbVar.a && this.b == bbVar.b && this.c == bbVar.c && this.d == bbVar.d && Arrays.equals(this.e, bbVar.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.e) + (((((((this.a * 961) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + this.d) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPlaybackState(adsId=null, adResumePositionUs=");
        sb.append(this.b);
        sb.append(", adGroups=[");
        int i2 = 0;
        while (true) {
            ab[] abVarArr = this.e;
            if (i2 >= abVarArr.length) {
                sb.append("])");
                return sb.toString();
            }
            sb.append("adGroup(timeUs=");
            sb.append(abVarArr[i2].a);
            sb.append(", ads=[");
            for (int i3 = 0; i3 < abVarArr[i2].f.length; i3++) {
                sb.append("ad(state=");
                int i4 = abVarArr[i2].f[i3];
                if (i4 == 0) {
                    sb.append('_');
                } else if (i4 == 1) {
                    sb.append('R');
                } else if (i4 == 2) {
                    sb.append('S');
                } else if (i4 == 3) {
                    sb.append('P');
                } else if (i4 != 4) {
                    sb.append('?');
                } else {
                    sb.append('!');
                }
                sb.append(", durationUs=");
                sb.append(abVarArr[i2].g[i3]);
                sb.append(')');
                if (i3 < abVarArr[i2].f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i2 < abVarArr.length - 1) {
                sb.append(", ");
            }
            i2++;
        }
    }
}
