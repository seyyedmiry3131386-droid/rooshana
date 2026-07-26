package com.google.protobuf;

import com.google.protobuf.InvalidProtocolBufferException;
import defpackage.ar1;
import defpackage.be0;
import defpackage.de2;
import defpackage.ee4;
import defpackage.gf7;
import defpackage.gn6;
import defpackage.h72;
import defpackage.hq3;
import defpackage.i44;
import defpackage.lu0;
import defpackage.mv6;
import defpackage.tr3;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements mv6 {
    public final lu0 a;
    public int b;
    public int c;
    public int d = 0;

    public g(lu0 lu0Var) {
        tr3.a(lu0Var, "input");
        this.a = lu0Var;
        lu0Var.b = this;
    }

    public static void A(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static void z(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.F();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, gf7 gf7Var, h72 h72Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            gf7Var.e(obj, this, h72Var);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, gf7 gf7Var, h72 h72Var) throws InvalidProtocolBufferException {
        lu0 lu0Var = this.a;
        int iG = lu0Var.G();
        if (lu0Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iL = lu0Var.l(iG);
        lu0Var.a++;
        gf7Var.e(obj, this, h72Var);
        lu0Var.a(0);
        lu0Var.a--;
        lu0Var.k(iL);
    }

    public final void d(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof be0;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Boolean.valueOf(lu0Var.m()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Boolean.valueOf(lu0Var.m()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        be0 be0Var = (be0) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                be0Var.c(lu0Var.m());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            be0Var.c(lu0Var.m());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final ByteString e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        x(2);
        return this.a.n();
    }

    public final void f(List list) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iF;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            list.add(e());
            lu0 lu0Var = this.a;
            if (lu0Var.g()) {
                return;
            } else {
                iF = lu0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public final void g(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof ar1;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Double.valueOf(lu0Var.o()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iG = lu0Var.G();
            A(iG);
            int iF3 = lu0Var.f() + iG;
            do {
                list.add(Double.valueOf(lu0Var.o()));
            } while (lu0Var.f() < iF3);
            return;
        }
        ar1 ar1Var = (ar1) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                ar1Var.c(lu0Var.o());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iG2 = lu0Var.G();
        A(iG2);
        int iF4 = lu0Var.f() + iG2;
        do {
            ar1Var.c(lu0Var.o());
        } while (lu0Var.f() < iF4);
    }

    public final void h(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof hq3;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(lu0Var.p()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Integer.valueOf(lu0Var.p()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        hq3 hq3Var = (hq3) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                hq3Var.c(lu0Var.p());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            hq3Var.c(lu0Var.p());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final Object i(WireFormat$FieldType wireFormat$FieldType, Class cls, h72 h72Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iOrdinal = wireFormat$FieldType.ordinal();
        lu0 lu0Var = this.a;
        switch (iOrdinal) {
            case 0:
                x(1);
                return Double.valueOf(lu0Var.o());
            case 1:
                x(5);
                return Float.valueOf(lu0Var.s());
            case 2:
                x(0);
                return Long.valueOf(lu0Var.v());
            case 3:
                x(0);
                return Long.valueOf(lu0Var.H());
            case 4:
                x(0);
                return Integer.valueOf(lu0Var.u());
            case 5:
                x(1);
                return Long.valueOf(lu0Var.r());
            case 6:
                x(5);
                return Integer.valueOf(lu0Var.q());
            case 7:
                x(0);
                return Boolean.valueOf(lu0Var.m());
            case 8:
                x(2);
                return lu0Var.E();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                return o(cls, h72Var);
            case 11:
                return e();
            case 12:
                x(0);
                return Integer.valueOf(lu0Var.G());
            case 13:
                x(0);
                return Integer.valueOf(lu0Var.p());
            case 14:
                x(5);
                return Integer.valueOf(lu0Var.z());
            case 15:
                x(1);
                return Long.valueOf(lu0Var.A());
            case 16:
                x(0);
                return Integer.valueOf(lu0Var.B());
            case 17:
                x(0);
                return Long.valueOf(lu0Var.C());
        }
    }

    public final void j(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof hq3;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iG = lu0Var.G();
                z(iG);
                int iF3 = lu0Var.f() + iG;
                do {
                    list.add(Integer.valueOf(lu0Var.q()));
                } while (lu0Var.f() < iF3);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(lu0Var.q()));
                if (lu0Var.g()) {
                    return;
                } else {
                    iF = lu0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        hq3 hq3Var = (hq3) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iG2 = lu0Var.G();
            z(iG2);
            int iF4 = lu0Var.f() + iG2;
            do {
                hq3Var.c(lu0Var.q());
            } while (lu0Var.f() < iF4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            hq3Var.c(lu0Var.q());
            if (lu0Var.g()) {
                return;
            } else {
                iF2 = lu0Var.F();
            }
        } while (iF2 == this.b);
        this.d = iF2;
    }

    public final void k(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof ee4;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(lu0Var.r()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iG = lu0Var.G();
            A(iG);
            int iF3 = lu0Var.f() + iG;
            do {
                list.add(Long.valueOf(lu0Var.r()));
            } while (lu0Var.f() < iF3);
            return;
        }
        ee4 ee4Var = (ee4) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                ee4Var.c(lu0Var.r());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iG2 = lu0Var.G();
        A(iG2);
        int iF4 = lu0Var.f() + iG2;
        do {
            ee4Var.c(lu0Var.r());
        } while (lu0Var.f() < iF4);
    }

    public final void l(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof de2;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iG = lu0Var.G();
                z(iG);
                int iF3 = lu0Var.f() + iG;
                do {
                    list.add(Float.valueOf(lu0Var.s()));
                } while (lu0Var.f() < iF3);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Float.valueOf(lu0Var.s()));
                if (lu0Var.g()) {
                    return;
                } else {
                    iF = lu0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        de2 de2Var = (de2) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iG2 = lu0Var.G();
            z(iG2);
            int iF4 = lu0Var.f() + iG2;
            do {
                de2Var.c(lu0Var.s());
            } while (lu0Var.f() < iF4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            de2Var.c(lu0Var.s());
            if (lu0Var.g()) {
                return;
            } else {
                iF2 = lu0Var.F();
            }
        } while (iF2 == this.b);
        this.d = iF2;
    }

    public final void m(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof hq3;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(lu0Var.u()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Integer.valueOf(lu0Var.u()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        hq3 hq3Var = (hq3) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                hq3Var.c(lu0Var.u());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            hq3Var.c(lu0Var.u());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final void n(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof ee4;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(lu0Var.v()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Long.valueOf(lu0Var.v()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        ee4 ee4Var = (ee4) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ee4Var.c(lu0Var.v());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            ee4Var.c(lu0Var.v());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final Object o(Class cls, h72 h72Var) throws InvalidProtocolBufferException {
        x(2);
        gf7 gf7VarA = gn6.c.a(cls);
        Object objD = gf7VarA.d();
        c(objD, gf7VarA, h72Var);
        gf7VarA.b(objD);
        return objD;
    }

    public final void p(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof hq3;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iG = lu0Var.G();
                z(iG);
                int iF3 = lu0Var.f() + iG;
                do {
                    list.add(Integer.valueOf(lu0Var.z()));
                } while (lu0Var.f() < iF3);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                list.add(Integer.valueOf(lu0Var.z()));
                if (lu0Var.g()) {
                    return;
                } else {
                    iF = lu0Var.F();
                }
            } while (iF == this.b);
            this.d = iF;
            return;
        }
        hq3 hq3Var = (hq3) list;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iG2 = lu0Var.G();
            z(iG2);
            int iF4 = lu0Var.f() + iG2;
            do {
                hq3Var.c(lu0Var.z());
            } while (lu0Var.f() < iF4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            hq3Var.c(lu0Var.z());
            if (lu0Var.g()) {
                return;
            } else {
                iF2 = lu0Var.F();
            }
        } while (iF2 == this.b);
        this.d = iF2;
    }

    public final void q(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof ee4;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    list.add(Long.valueOf(lu0Var.A()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iG = lu0Var.G();
            A(iG);
            int iF3 = lu0Var.f() + iG;
            do {
                list.add(Long.valueOf(lu0Var.A()));
            } while (lu0Var.f() < iF3);
            return;
        }
        ee4 ee4Var = (ee4) list;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                ee4Var.c(lu0Var.A());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iG2 = lu0Var.G();
        A(iG2);
        int iF4 = lu0Var.f() + iG2;
        do {
            ee4Var.c(lu0Var.A());
        } while (lu0Var.f() < iF4);
    }

    public final void r(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof hq3;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(lu0Var.B()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Integer.valueOf(lu0Var.B()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        hq3 hq3Var = (hq3) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                hq3Var.c(lu0Var.B());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            hq3Var.c(lu0Var.B());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final void s(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof ee4;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(lu0Var.C()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Long.valueOf(lu0Var.C()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        ee4 ee4Var = (ee4) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ee4Var.c(lu0Var.C());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            ee4Var.c(lu0Var.C());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final void t(List list, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strD;
        int iF;
        int iF2;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        boolean z2 = list instanceof i44;
        lu0 lu0Var = this.a;
        if (z2 && !z) {
            i44 i44Var = (i44) list;
            do {
                i44Var.I(e());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        do {
            if (z) {
                x(2);
                strD = lu0Var.E();
            } else {
                x(2);
                strD = lu0Var.D();
            }
            list.add(strD);
            if (lu0Var.g()) {
                return;
            } else {
                iF = lu0Var.F();
            }
        } while (iF == this.b);
        this.d = iF;
    }

    public final void u(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof hq3;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Integer.valueOf(lu0Var.G()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Integer.valueOf(lu0Var.G()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        hq3 hq3Var = (hq3) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                hq3Var.c(lu0Var.G());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            hq3Var.c(lu0Var.G());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final void v(List list) throws InvalidProtocolBufferException {
        int iF;
        int iF2;
        boolean z = list instanceof ee4;
        lu0 lu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    list.add(Long.valueOf(lu0Var.H()));
                    if (lu0Var.g()) {
                        return;
                    } else {
                        iF = lu0Var.F();
                    }
                } while (iF == this.b);
                this.d = iF;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iF3 = lu0Var.f() + lu0Var.G();
            do {
                list.add(Long.valueOf(lu0Var.H()));
            } while (lu0Var.f() < iF3);
            w(iF3);
            return;
        }
        ee4 ee4Var = (ee4) list;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ee4Var.c(lu0Var.H());
                if (lu0Var.g()) {
                    return;
                } else {
                    iF2 = lu0Var.F();
                }
            } while (iF2 == this.b);
            this.d = iF2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iF4 = lu0Var.f() + lu0Var.G();
        do {
            ee4Var.c(lu0Var.H());
        } while (lu0Var.f() < iF4);
        w(iF4);
    }

    public final void w(int i) throws InvalidProtocolBufferException {
        if (this.a.f() != i) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public final void x(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final boolean y() {
        int i;
        lu0 lu0Var = this.a;
        if (lu0Var.g() || (i = this.b) == this.c) {
            return false;
        }
        return lu0Var.I(i);
    }
}
