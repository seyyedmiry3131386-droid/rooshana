package kotlin.time;

import defpackage.bq3;
import defpackage.js3;
import defpackage.xq2;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class Instant implements Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, -31557014167219200L);
    public static final Instant d = new Instant(999999999, 31556889864403199L);
    public final long a;
    public final int b;

    public Instant(int i, long j) {
        this.a = j;
        this.b = i;
        if (-31557014167219200L > j || j >= 31556889864403200L) {
            throw new IllegalArgumentException("Instant exceeds minimum or maximum instant");
        }
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        int i = bq3.a;
        return new InstantSerialized(this.b, this.a);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        js3.p(instant2, "other");
        int iS = js3.s(this.a, instant2.a);
        return iS != 0 ? iS : js3.r(this.b, instant2.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Instant)) {
            return false;
        }
        Instant instant = (Instant) obj;
        return this.a == instant.a && this.b == instant.b;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        long j;
        int[] iArr;
        StringBuilder sb = new StringBuilder();
        long j2 = this.a;
        long j3 = j2 / 86400;
        long j4 = 0;
        if ((j2 ^ 86400) < 0 && j3 * 86400 != j2) {
            j3--;
        }
        long j5 = j2 % 86400;
        int i = (int) (j5 + (86400 & (((j5 ^ 86400) & ((-j5) | j5)) >> 63)));
        long j6 = (j3 + ((long) 719528)) - ((long) 60);
        if (j6 < 0) {
            long j7 = 146097;
            long j8 = ((j6 + 1) / j7) - 1;
            j = 0;
            j4 = ((long) ErrorDTO.CODE_ACCESS_DENIED) * j8;
            j6 += (-j8) * j7;
        } else {
            j = 0;
        }
        long j9 = ErrorDTO.CODE_ACCESS_DENIED;
        long j10 = ((j9 * j6) + ((long) 591)) / ((long) 146097);
        long j11 = 365;
        long j12 = 4;
        long j13 = 100;
        long j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        if (j14 < j) {
            j10--;
            j14 = j6 - ((j10 / j9) + (((j10 / j12) + (j11 * j10)) - (j10 / j13)));
        }
        int i2 = (int) j14;
        int i3 = ((i2 * 5) + 2) / 153;
        int i4 = ((i3 + 2) % 12) + 1;
        int i5 = (i2 - (((i3 * 306) + 5) / 10)) + 1;
        int i6 = (int) (j10 + j4 + ((long) (i3 / 10)));
        int i7 = i / 3600;
        int i8 = i - (i7 * 3600);
        int i9 = i8 / 60;
        int i10 = i8 - (i9 * 60);
        int i11 = 0;
        if (Math.abs(i6) < 1000) {
            StringBuilder sb2 = new StringBuilder();
            if (i6 >= 0) {
                sb2.append(i6 + 10000);
                js3.o(sb2.deleteCharAt(0), "deleteCharAt(...)");
            } else {
                sb2.append(i6 - 10000);
                js3.o(sb2.deleteCharAt(1), "deleteCharAt(...)");
            }
            sb.append((CharSequence) sb2);
        } else {
            if (i6 >= 10000) {
                sb.append('+');
            }
            sb.append(i6);
        }
        sb.append('-');
        xq2.t(sb, sb, i4);
        sb.append('-');
        xq2.t(sb, sb, i5);
        sb.append('T');
        xq2.t(sb, sb, i7);
        sb.append(':');
        xq2.t(sb, sb, i9);
        sb.append(':');
        xq2.t(sb, sb, i10);
        int i12 = this.b;
        if (i12 != 0) {
            sb.append('.');
            while (true) {
                iArr = xq2.c;
                int i13 = i11 + 1;
                if (i12 % iArr[i13] != 0) {
                    break;
                }
                i11 = i13;
            }
            int i14 = i11 - (i11 % 3);
            String strValueOf = String.valueOf((i12 / iArr[i14]) + iArr[9 - i14]);
            js3.n(strValueOf, "null cannot be cast to non-null type java.lang.String");
            String strSubstring = strValueOf.substring(1);
            js3.o(strSubstring, "substring(...)");
            sb.append(strSubstring);
        }
        sb.append('Z');
        return sb.toString();
    }
}
