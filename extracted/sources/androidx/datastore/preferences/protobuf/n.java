package androidx.datastore.preferences.protobuf;

import defpackage.r79;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class n {
    public static final n f = new n(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d = -1;
    public boolean e;

    public n(int i, int[] iArr, Object[] objArr, boolean z) {
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }

    public static n c() {
        return new n(0, new int[8], new Object[8], true);
    }

    public final void a(int i) {
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

    public final int b() {
        int iZ;
        int iB0;
        int iZ2;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.a; i3++) {
            int i4 = this.b[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.c[i3]).getClass();
                    iZ2 = e.Z(i5) + 8;
                } else if (i6 == 2) {
                    iZ2 = e.V(i5, (ByteString) this.c[i3]);
                } else if (i6 == 3) {
                    iZ = e.Z(i5) * 2;
                    iB0 = ((n) this.c[i3]).b();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.e());
                    }
                    ((Integer) this.c[i3]).getClass();
                    iZ2 = e.Z(i5) + 4;
                }
                i2 = iZ2 + i2;
            } else {
                long jLongValue = ((Long) this.c[i3]).longValue();
                iZ = e.Z(i5);
                iB0 = e.b0(jLongValue);
            }
            i2 = iB0 + iZ + i2;
        }
        this.d = i2;
        return i2;
    }

    public final void d(int i, Object obj) {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
        a(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void e(r79 r79Var) {
        if (this.a == 0) {
            return;
        }
        r79Var.getClass();
        e eVar = (e) r79Var.b;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                eVar.v0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                eVar.l0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                eVar.h0(i3, (ByteString) obj);
            } else if (i4 == 3) {
                eVar.s0(i3, 3);
                ((n) obj).e(r79Var);
                eVar.s0(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.e());
                }
                eVar.j0(i3, ((Integer) obj).intValue());
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        int i = this.a;
        if (i == nVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = nVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = nVar.c;
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
        int i2 = (527 + i) * 31;
        int[] iArr = this.b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.c;
        int i6 = this.a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
