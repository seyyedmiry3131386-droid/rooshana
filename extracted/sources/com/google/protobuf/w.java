package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.dw1;
import defpackage.lu0;
import defpackage.qm5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class w {
    public static final w f = new w(0, new int[0], new Object[0], false);
    public int a;
    public int[] b;
    public Object[] c;
    public int d;
    public boolean e;

    public w() {
        this(0, new int[8], new Object[8], true);
    }

    public static w e(w wVar, w wVar2) {
        int i = wVar.a + wVar2.a;
        int[] iArrCopyOf = Arrays.copyOf(wVar.b, i);
        System.arraycopy(wVar2.b, 0, iArrCopyOf, wVar.a, wVar2.a);
        Object[] objArrCopyOf = Arrays.copyOf(wVar.c, i);
        System.arraycopy(wVar2.c, 0, objArrCopyOf, wVar.a, wVar2.a);
        return new w(i, iArrCopyOf, objArrCopyOf, true);
    }

    public final void a() {
        if (!this.e) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(int i) {
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

    public final int c() {
        int iD0;
        int iF0;
        int iD02;
        int i = this.d;
        if (i != -1) {
            return i;
        }
        int iH = 0;
        for (int i2 = 0; i2 < this.a; i2++) {
            int i3 = this.b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 != 0) {
                if (i5 == 1) {
                    ((Long) this.c[i2]).getClass();
                    iD02 = j.d0(i4) + 8;
                } else if (i5 == 2) {
                    ByteString byteString = (ByteString) this.c[i2];
                    int iD03 = j.d0(i4);
                    int size = byteString.size();
                    iH = dw1.h(size, size, iD03, iH);
                } else if (i5 == 3) {
                    iD0 = j.d0(i4) * 2;
                    iF0 = ((w) this.c[i2]).c();
                } else {
                    if (i5 != 5) {
                        throw new IllegalStateException(InvalidProtocolBufferException.e());
                    }
                    ((Integer) this.c[i2]).getClass();
                    iD02 = j.d0(i4) + 4;
                }
                iH = iD02 + iH;
            } else {
                long jLongValue = ((Long) this.c[i2]).longValue();
                iD0 = j.d0(i4);
                iF0 = j.f0(jLongValue);
            }
            iH = iF0 + iD0 + iH;
        }
        this.d = iH;
        return iH;
    }

    public final boolean d(int i, lu0 lu0Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        a();
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            f(i, Long.valueOf(lu0Var.v()));
            return true;
        }
        if (i3 == 1) {
            f(i, Long.valueOf(lu0Var.r()));
            return true;
        }
        if (i3 == 2) {
            f(i, lu0Var.n());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.e();
            }
            f(i, Integer.valueOf(lu0Var.q()));
            return true;
        }
        w wVar = new w();
        do {
            iF = lu0Var.F();
            if (iF == 0) {
                break;
            }
        } while (wVar.d(iF, lu0Var));
        lu0Var.a((i2 << 3) | 4);
        f(i, wVar);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        int i = this.a;
        if (i == wVar.a) {
            int[] iArr = this.b;
            int[] iArr2 = wVar.b;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.c;
                    Object[] objArr2 = wVar.c;
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

    public final void f(int i, Object obj) {
        a();
        b(this.a + 1);
        int[] iArr = this.b;
        int i2 = this.a;
        iArr[i2] = i;
        this.c[i2] = obj;
        this.a = i2 + 1;
    }

    public final void g(qm5 qm5Var) {
        if (this.a == 0) {
            return;
        }
        qm5Var.getClass();
        j jVar = (j) qm5Var.b;
        for (int i = 0; i < this.a; i++) {
            int i2 = this.b[i];
            Object obj = this.c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                jVar.B0(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                jVar.o0(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                jVar.k0(i3, (ByteString) obj);
            } else if (i4 == 3) {
                jVar.y0(i3, 3);
                ((w) obj).g(qm5Var);
                jVar.y0(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(InvalidProtocolBufferException.e());
                }
                jVar.m0(i3, ((Integer) obj).intValue());
            }
        }
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

    public w(int i, int[] iArr, Object[] objArr, boolean z) {
        this.d = -1;
        this.a = i;
        this.b = iArr;
        this.c = objArr;
        this.e = z;
    }
}
