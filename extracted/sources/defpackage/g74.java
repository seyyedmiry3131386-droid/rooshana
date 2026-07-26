package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class g74 extends sr7 {
    public final List c;
    public final List d;
    public final long e;
    public final long f;

    public g74(List list, ArrayList arrayList, long j, long j2) {
        this.c = list;
        this.d = arrayList;
        this.e = j;
        this.f = j2;
    }

    @Override // defpackage.sr7
    public final Shader b(long j) {
        int i;
        int[] iArr;
        int i2;
        float[] fArrN0;
        long j2 = this.e;
        char c = ' ';
        int i3 = (int) (j2 >> 32);
        if (Float.intBitsToFloat(i3) == Float.POSITIVE_INFINITY) {
            i3 = (int) (j >> 32);
        }
        float fIntBitsToFloat = Float.intBitsToFloat(i3);
        long j3 = 4294967295L;
        int i4 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.POSITIVE_INFINITY) {
            i4 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat(i4);
        long j4 = this.f;
        int i5 = (int) (j4 >> 32);
        if (Float.intBitsToFloat(i5) == Float.POSITIVE_INFINITY) {
            i5 = (int) (j >> 32);
        }
        float fIntBitsToFloat3 = Float.intBitsToFloat(i5);
        int i6 = (int) (j4 & 4294967295L);
        if (Float.intBitsToFloat(i6) == Float.POSITIVE_INFINITY) {
            i6 = (int) (j & 4294967295L);
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat(i6);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & 4294967295L);
        List list = this.c;
        List list2 = this.d;
        if (list2 == null) {
            if (list.size() < 2) {
                throw new IllegalArgumentException("colors must have length of at least 2 if colorStops is omitted.");
            }
        } else if (list.size() != list2.size()) {
            throw new IllegalArgumentException("colors and colorStops arguments must have equal length.");
        }
        if (Build.VERSION.SDK_INT >= 26) {
            i = 0;
        } else {
            int iY = br9.y(list);
            int i7 = 1;
            i = 0;
            while (i7 < iY) {
                char c2 = c;
                long j5 = j3;
                if (zu0.d(((zu0) list.get(i7)).a) == 0.0f) {
                    i++;
                }
                i7++;
                c = c2;
                j3 = j5;
            }
        }
        char c3 = c;
        long j6 = j3;
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c3));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jFloatToRawIntBits & j6));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> c3));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j6));
        if (Build.VERSION.SDK_INT >= 26) {
            int size = list.size();
            iArr = new int[size];
            for (int i8 = 0; i8 < size; i8++) {
                iArr[i8] = gu9.E(((zu0) list.get(i8)).a);
            }
        } else {
            iArr = new int[list.size() + i];
            int iY2 = br9.y(list);
            int size2 = list.size();
            int i9 = 0;
            for (int i10 = 0; i10 < size2; i10++) {
                long j7 = ((zu0) list.get(i10)).a;
                if (zu0.d(j7) == 0.0f) {
                    if (i10 == 0) {
                        i2 = i9 + 1;
                        iArr[i9] = gu9.E(zu0.b(0.0f, ((zu0) list.get(1)).a));
                    } else if (i10 == iY2) {
                        i2 = i9 + 1;
                        iArr[i9] = gu9.E(zu0.b(0.0f, ((zu0) list.get(i10 - 1)).a));
                    } else {
                        int i11 = i9 + 1;
                        iArr[i9] = gu9.E(zu0.b(0.0f, ((zu0) list.get(i10 - 1)).a));
                        i9 += 2;
                        iArr[i11] = gu9.E(zu0.b(0.0f, ((zu0) list.get(i10 + 1)).a));
                    }
                    i9 = i2;
                } else {
                    iArr[i9] = gu9.E(j7);
                    i9++;
                }
            }
        }
        int[] iArr2 = iArr;
        if (i == 0) {
            fArrN0 = list2 != null ? a.N0(list2) : null;
        } else {
            fArrN0 = new float[list.size() + i];
            fArrN0[0] = list2 != null ? ((Number) list2.get(0)).floatValue() : 0.0f;
            int iY3 = br9.y(list);
            int i12 = 1;
            for (int i13 = 1; i13 < iY3; i13++) {
                long j8 = ((zu0) list.get(i13)).a;
                float fFloatValue = list2 != null ? ((Number) list2.get(i13)).floatValue() : i13 / br9.y(list);
                int i14 = i12 + 1;
                fArrN0[i12] = fFloatValue;
                if (zu0.d(j8) == 0.0f) {
                    i12 += 2;
                    fArrN0[i14] = fFloatValue;
                } else {
                    i12 = i14;
                }
            }
            fArrN0[i12] = list2 != null ? ((Number) list2.get(br9.y(list))).floatValue() : 1.0f;
        }
        return new LinearGradient(fIntBitsToFloat5, fIntBitsToFloat6, fIntBitsToFloat7, fIntBitsToFloat8, iArr2, fArrN0, Shader.TileMode.CLAMP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g74)) {
            return false;
        }
        g74 g74Var = (g74) obj;
        return js3.i(this.c, g74Var.c) && js3.i(this.d, g74Var.d) && nr5.c(this.e, g74Var.e) && nr5.c(this.f, g74Var.f);
    }

    public final int hashCode() {
        int iHashCode = this.c.hashCode() * 31;
        List list = this.d;
        return (nr5.e(this.f) + ((nr5.e(this.e) + ((iHashCode + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31;
    }

    public final String toString() {
        String str;
        long j = this.e;
        String str2 = "";
        if (((((j & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str = "start=" + ((Object) nr5.i(j)) + ", ";
        } else {
            str = "";
        }
        long j2 = this.f;
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            str2 = "end=" + ((Object) nr5.i(j2)) + ", ";
        }
        return "LinearGradient(colors=" + this.c + ", stops=" + this.d + ", " + str + str2 + "tileMode=Clamp)";
    }
}
