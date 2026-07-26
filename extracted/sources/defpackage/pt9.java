package defpackage;

import com.google.android.gms.internal.measurement.p0;
import com.google.android.gms.internal.measurement.zzlh;
import com.google.android.gms.internal.measurement.zzll;
import com.google.android.gms.internal.measurement.zzmq;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class pt9 {
    public static final pt9 f = new pt9(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public pt9(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static pt9 a() {
        return new pt9(0, new int[8], new Object[8], true);
    }

    public final void b(c35 c35Var) throws zzll {
        if (this.a != 0) {
            for (int i = 0; i < this.a; i++) {
                int i2 = this.b[i];
                Object obj = this.c[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    ((p0) c35Var.b).l(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    ((p0) c35Var.b).m(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzlh zzlhVar = (zzlh) obj;
                    p0 p0Var = (p0) c35Var.b;
                    p0Var.p((i4 << 3) | 2);
                    p0Var.p(zzlhVar.e());
                    zzlhVar.h(p0Var);
                } else if (i3 == 3) {
                    ((p0) c35Var.b).h(i4, 3);
                    ((pt9) obj).b(c35Var);
                    ((p0) c35Var.b).h(i4, 4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(new zzmq());
                    }
                    ((p0) c35Var.b).k(i4, ((Integer) obj).intValue());
                }
            }
        }
    }

    public final int c() {
        int iV;
        int iF;
        int iV2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iG = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iV2 = p0.v(i4 << 3) + 8;
                } else if (i5 == 2) {
                    int i6 = i4 << 3;
                    zzlh zzlhVar = (zzlh) this.c[i2];
                    int iV3 = p0.v(i6);
                    int iE = zzlhVar.e();
                    iG = rm7.g(iE, iE, iV3, iG);
                } else if (i5 == 3) {
                    int iV4 = p0.v(i4 << 3);
                    iV = iV4 + iV4;
                    iF = ((pt9) this.c[i2]).c();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(new zzmq());
                    }
                    ((Integer) this.c[i2]).getClass();
                    iV2 = p0.v(i4 << 3) + 4;
                }
                iG = iV2 + iG;
            } else {
                int i7 = i4 << 3;
                long jLongValue = ((Long) this.c[i2]).longValue();
                iV = p0.v(i7);
                iF = p0.f(jLongValue);
            }
            iG = iF + iV + iG;
        }
        this.d = iG;
        return iG;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        e(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(int i) {
        int[] iArr = this.b;
        if (i > iArr.length) {
            int i2 = this.a;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.b = Arrays.copyOf(iArr, i);
            this.c = Arrays.copyOf(this.c, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pt9)) {
            return false;
        }
        pt9 pt9Var = (pt9) obj;
        int i = this.a;
        if (i == pt9Var.a) {
            int[] iArr = this.b;
            int[] iArr2 = pt9Var.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = pt9Var.c;
                    int i3 = this.a;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i + 527;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
