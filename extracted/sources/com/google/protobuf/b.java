package com.google.protobuf;

import defpackage.ar1;
import defpackage.be0;
import defpackage.de2;
import defpackage.ee4;
import defpackage.gf7;
import defpackage.hq3;
import defpackage.lu0;
import defpackage.nv;
import defpackage.rr3;
import defpackage.tr3;
import org.pcap4j.packet.Dot11LinkAdaptationControl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static int a(byte[] bArr, int i, nv nvVar) throws InvalidProtocolBufferException {
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i2 > bArr.length - iR) {
            throw InvalidProtocolBufferException.i();
        }
        if (i2 == 0) {
            nvVar.c = ByteString.b;
            return iR;
        }
        nvVar.c = ByteString.h(bArr, iR, i2);
        return iR + i2;
    }

    public static int b(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    public static long c(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    public static int d(gf7 gf7Var, byte[] bArr, int i, int i2, int i3, nv nvVar) {
        Object objD = gf7Var.d();
        int iU = u(objD, gf7Var, bArr, i, i2, i3, nvVar);
        gf7Var.b(objD);
        nvVar.c = objD;
        return iU;
    }

    public static int e(gf7 gf7Var, byte[] bArr, int i, int i2, nv nvVar) throws InvalidProtocolBufferException {
        Object objD = gf7Var.d();
        int iV = v(objD, gf7Var, bArr, i, i2, nvVar);
        gf7Var.b(objD);
        nvVar.c = objD;
        return iV;
    }

    public static int f(gf7 gf7Var, int i, byte[] bArr, int i2, int i3, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        int iE = e(gf7Var, bArr, i2, i3, nvVar);
        rr3Var.add(nvVar.c);
        while (iE < i3) {
            int iR = r(bArr, iE, nvVar);
            if (i != nvVar.b) {
                break;
            }
            iE = e(gf7Var, bArr, iR, i3, nvVar);
            rr3Var.add(nvVar.c);
        }
        return iE;
    }

    public static int g(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        be0 be0Var = (be0) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            iR = t(bArr, iR, nvVar);
            be0Var.c(nvVar.a != 0);
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int h(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        ar1 ar1Var = (ar1) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            ar1Var.c(Double.longBitsToDouble(c(iR, bArr)));
            iR += 8;
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int i(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        hq3 hq3Var = (hq3) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            hq3Var.c(b(iR, bArr));
            iR += 4;
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int j(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        ee4 ee4Var = (ee4) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            ee4Var.c(c(iR, bArr));
            iR += 8;
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int k(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        de2 de2Var = (de2) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            de2Var.c(Float.intBitsToFloat(b(iR, bArr)));
            iR += 4;
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int l(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        hq3 hq3Var = (hq3) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            iR = r(bArr, iR, nvVar);
            hq3Var.c(lu0.c(nvVar.b));
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int m(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        ee4 ee4Var = (ee4) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            iR = t(bArr, iR, nvVar);
            ee4Var.c(lu0.d(nvVar.a));
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int n(byte[] bArr, int i, rr3 rr3Var, nv nvVar) throws InvalidProtocolBufferException {
        hq3 hq3Var = (hq3) rr3Var;
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b + iR;
        while (iR < i2) {
            iR = r(bArr, iR, nvVar);
            hq3Var.c(nvVar.b);
        }
        if (iR == i2) {
            return iR;
        }
        throw InvalidProtocolBufferException.i();
    }

    public static int o(byte[] bArr, int i, nv nvVar) throws InvalidProtocolBufferException {
        int iR = r(bArr, i, nvVar);
        int i2 = nvVar.b;
        if (i2 < 0) {
            throw InvalidProtocolBufferException.g();
        }
        if (i2 == 0) {
            nvVar.c = "";
            return iR;
        }
        nvVar.c = new String(bArr, iR, i2, tr3.a);
        return iR + i2;
    }

    public static int p(int i, byte[] bArr, int i2, int i3, w wVar, nv nvVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iT = t(bArr, i2, nvVar);
            wVar.f(i, Long.valueOf(nvVar.a));
            return iT;
        }
        if (i4 == 1) {
            wVar.f(i, Long.valueOf(c(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iR = r(bArr, i2, nvVar);
            int i5 = nvVar.b;
            if (i5 < 0) {
                throw InvalidProtocolBufferException.g();
            }
            if (i5 > bArr.length - iR) {
                throw InvalidProtocolBufferException.i();
            }
            if (i5 == 0) {
                wVar.f(i, ByteString.b);
            } else {
                wVar.f(i, ByteString.h(bArr, iR, i5));
            }
            return iR + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw InvalidProtocolBufferException.b();
            }
            wVar.f(i, Integer.valueOf(b(i2, bArr)));
            return i2 + 4;
        }
        w wVar2 = new w();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int iR2 = r(bArr, i2, nvVar);
            i7 = nvVar.b;
            if (i7 == i6) {
                i2 = iR2;
                break;
            }
            i2 = p(i7, bArr, iR2, i3, wVar2, nvVar);
        }
        if (i2 > i3 || i7 != i6) {
            throw InvalidProtocolBufferException.h();
        }
        wVar.f(i, wVar2);
        return i2;
    }

    public static int q(int i, byte[] bArr, int i2, nv nvVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            nvVar.b = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            nvVar.b = i5 | (b2 << Dot11LinkAdaptationControl.ASELI);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            nvVar.b = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            nvVar.b = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                nvVar.b = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    public static int r(byte[] bArr, int i, nv nvVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return q(b, bArr, i2, nvVar);
        }
        nvVar.b = b;
        return i2;
    }

    public static int s(int i, byte[] bArr, int i2, int i3, rr3 rr3Var, nv nvVar) {
        hq3 hq3Var = (hq3) rr3Var;
        int iR = r(bArr, i2, nvVar);
        hq3Var.c(nvVar.b);
        while (iR < i3) {
            int iR2 = r(bArr, iR, nvVar);
            if (i != nvVar.b) {
                break;
            }
            iR = r(bArr, iR2, nvVar);
            hq3Var.c(nvVar.b);
        }
        return iR;
    }

    public static int t(byte[] bArr, int i, nv nvVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            nvVar.a = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        nvVar.a = j2;
        return i3;
    }

    public static int u(Object obj, gf7 gf7Var, byte[] bArr, int i, int i2, int i3, nv nvVar) {
        int iG = ((q) gf7Var).G(obj, bArr, i, i2, i3, nvVar);
        nvVar.c = obj;
        return iG;
    }

    public static int v(Object obj, gf7 gf7Var, byte[] bArr, int i, int i2, nv nvVar) throws InvalidProtocolBufferException {
        int iQ = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iQ = q(i3, bArr, iQ, nvVar);
            i3 = nvVar.b;
        }
        int i4 = iQ;
        if (i3 < 0 || i3 > i2 - i4) {
            throw InvalidProtocolBufferException.i();
        }
        int i5 = i4 + i3;
        gf7Var.j(obj, bArr, i4, i5, nvVar);
        nvVar.c = obj;
        return i5;
    }

    public static Object w(lu0 lu0Var, WireFormat$FieldType wireFormat$FieldType, WireFormat$Utf8Validation wireFormat$Utf8Validation) {
        switch (wireFormat$FieldType.ordinal()) {
            case 0:
                return Double.valueOf(lu0Var.o());
            case 1:
                return Float.valueOf(lu0Var.s());
            case 2:
                return Long.valueOf(lu0Var.v());
            case 3:
                return Long.valueOf(lu0Var.H());
            case 4:
                return Integer.valueOf(lu0Var.u());
            case 5:
                return Long.valueOf(lu0Var.r());
            case 6:
                return Integer.valueOf(lu0Var.q());
            case 7:
                return Boolean.valueOf(lu0Var.m());
            case 8:
                return wireFormat$Utf8Validation.a(lu0Var);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return lu0Var.n();
            case 12:
                return Integer.valueOf(lu0Var.G());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(lu0Var.z());
            case 15:
                return Long.valueOf(lu0Var.A());
            case 16:
                return Integer.valueOf(lu0Var.B());
            case 17:
                return Long.valueOf(lu0Var.C());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int x(int i, byte[] bArr, int i2, int i3, nv nvVar) throws InvalidProtocolBufferException {
        if ((i >>> 3) == 0) {
            throw InvalidProtocolBufferException.b();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return t(bArr, i2, nvVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return r(bArr, i2, nvVar) + nvVar.b;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw InvalidProtocolBufferException.b();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = r(bArr, i2, nvVar);
            i6 = nvVar.b;
            if (i6 == i5) {
                break;
            }
            i2 = x(i6, bArr, i2, i3, nvVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw InvalidProtocolBufferException.h();
        }
        return i2;
    }
}
