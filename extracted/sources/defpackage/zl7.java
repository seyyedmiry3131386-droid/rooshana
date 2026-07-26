package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class zl7 {
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public long e;
    public final String f;
    public long g;

    static {
        eh5.a("SegmentInfo");
    }

    public zl7(int i, String str, String str2, long j, long j2) {
        this.e = -1L;
        this.g = -1L;
        TextUtils.isEmpty(str);
        TextUtils.isEmpty(str2);
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = j2;
        pb2 pb2Var = pb2.a;
        TextUtils.isEmpty(str2);
        this.f = str2 + ".part-" + j;
    }

    public static ArrayList a(String str, int i, long j, String str2) {
        long j2;
        TextUtils.isEmpty(str2);
        int i2 = 1;
        if (i == 1) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(new zl7(1, str, str2, 0L, j > 0 ? j - 1 : 4611686018427387903L));
            return arrayList;
        }
        if (j <= 0) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new zl7(1, str, str2, 0L, 511999L));
            return arrayList2;
        }
        long j3 = 512000;
        if (j <= 512000) {
            ArrayList arrayList3 = new ArrayList(1);
            arrayList3.add(new zl7(1, str, str2, 0L, j - 1));
            return arrayList3;
        }
        long j4 = j - 512000;
        int i3 = i - 1;
        while (true) {
            if (i3 <= 0) {
                break;
            }
            if (j4 >= ((long) i3) * 512000) {
                i2 = i3;
                break;
            }
            i3--;
        }
        ArrayList arrayList4 = new ArrayList(i2 + 1);
        arrayList4.add(new zl7(1, str, str2, 0L, 511999L));
        long j5 = i2;
        long j6 = j4 / j5;
        long j7 = j4 % j5;
        int i4 = 0;
        while (true) {
            long j8 = j3;
            if (i4 >= i2) {
                return arrayList4;
            }
            if (j7 > 0) {
                j2 = j6 + 1;
                j7--;
            } else {
                j2 = j6;
            }
            j3 = j8 + j2;
            arrayList4.add(new zl7(i4 + 2, str, str2, j8, j3 - 1));
            i4++;
        }
    }

    public final void b(long j) {
        long j2 = this.e;
        if (j2 >= 0) {
            int i = (j > ((j2 - this.c) + 1) ? 1 : (j == ((j2 - this.c) + 1) ? 0 : -1));
        }
        this.g = j;
    }

    public final void c(long j) {
        long j2 = this.e;
        if (j2 >= 0) {
            int i = (j2 > j ? 1 : (j2 == j ? 0 : -1));
        }
        if (this.c > 0) {
            int i2 = (j > this.d ? 1 : (j == this.d ? 0 : -1));
        }
        this.e = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[sourceUrl: ");
        sb.append(this.b);
        sb.append(", destinationFilePath: ");
        sb.append(this.f);
        sb.append(", segmentStartByte: ");
        long j = this.c;
        sb.append(j);
        sb.append(", segmentEndByte: ");
        long j2 = this.d;
        sb.append(j2);
        sb.append(", segmentRealEndByte: ");
        sb.append(this.e);
        sb.append(", localFileLength: ");
        sb.append(this.g);
        sb.append(", SegmentLength: ");
        return bl4.s((j2 - j) + 1, "]", sb);
    }

    public zl7(zl7 zl7Var) {
        this.e = -1L;
        this.g = -1L;
        this.a = zl7Var.a;
        this.b = zl7Var.b;
        this.c = zl7Var.c;
        this.d = zl7Var.d;
        this.e = zl7Var.e;
        this.f = zl7Var.f;
        this.g = zl7Var.g;
    }
}
