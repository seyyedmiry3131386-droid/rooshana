package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.InvalidProtocolBufferException;
import defpackage.br1;
import defpackage.ce0;
import defpackage.ee2;
import defpackage.fe4;
import defpackage.hf7;
import defpackage.hn6;
import defpackage.i72;
import defpackage.iq3;
import defpackage.mu0;
import defpackage.sr3;
import defpackage.ur3;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public final mu0 a;
    public int b;
    public int c;
    public int d = 0;

    public d(mu0 mu0Var) {
        Charset charset = ur3.a;
        this.a = mu0Var;
        mu0Var.b = this;
    }

    public static void y(int i) throws InvalidProtocolBufferException {
        if ((i & 3) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public static void z(int i) throws InvalidProtocolBufferException {
        if ((i & 7) != 0) {
            throw InvalidProtocolBufferException.h();
        }
    }

    public final int a() {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.C();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    public final void b(Object obj, hf7 hf7Var, i72 i72Var) {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            hf7Var.f(obj, this, i72Var);
            if (this.b == this.c) {
            } else {
                throw InvalidProtocolBufferException.h();
            }
        } finally {
            this.c = i;
        }
    }

    public final void c(Object obj, hf7 hf7Var, i72 i72Var) throws InvalidProtocolBufferException {
        mu0 mu0Var = this.a;
        int iD = mu0Var.D();
        if (mu0Var.a >= 100) {
            throw new InvalidProtocolBufferException("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        int iL = mu0Var.l(iD);
        mu0Var.a++;
        hf7Var.f(obj, this, i72Var);
        mu0Var.a(0);
        mu0Var.a--;
        mu0Var.k(iL);
    }

    public final void d(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof ce0;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Boolean.valueOf(mu0Var.m()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Boolean.valueOf(mu0Var.m()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        ce0 ce0Var = (ce0) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                ce0Var.c(mu0Var.m());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            ce0Var.c(mu0Var.m());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final ByteString e() throws InvalidProtocolBufferException.InvalidWireTypeException {
        w(2);
        return this.a.n();
    }

    public final void f(sr3 sr3Var) throws InvalidProtocolBufferException.InvalidWireTypeException {
        int iC;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            sr3Var.add(e());
            mu0 mu0Var = this.a;
            if (mu0Var.e()) {
                return;
            } else {
                iC = mu0Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void g(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof br1;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    sr3Var.add(Double.valueOf(mu0Var.o()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.D();
            z(iD);
            int iD2 = mu0Var.d() + iD;
            do {
                sr3Var.add(Double.valueOf(mu0Var.o()));
            } while (mu0Var.d() < iD2);
            return;
        }
        br1 br1Var = (br1) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                br1Var.c(mu0Var.o());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD3 = mu0Var.D();
        z(iD3);
        int iD4 = mu0Var.d() + iD3;
        do {
            br1Var.c(mu0Var.o());
        } while (mu0Var.d() < iD4);
    }

    public final void h(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof iq3;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Integer.valueOf(mu0Var.p()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Integer.valueOf(mu0Var.p()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        iq3 iq3Var = (iq3) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                iq3Var.c(mu0Var.p());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            iq3Var.c(mu0Var.p());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final Object i(WireFormat$FieldType wireFormat$FieldType, Class cls, i72 i72Var) throws InvalidProtocolBufferException {
        int iOrdinal = wireFormat$FieldType.ordinal();
        mu0 mu0Var = this.a;
        switch (iOrdinal) {
            case 0:
                w(1);
                return Double.valueOf(mu0Var.o());
            case 1:
                w(5);
                return Float.valueOf(mu0Var.t());
            case 2:
                w(0);
                return Long.valueOf(mu0Var.v());
            case 3:
                w(0);
                return Long.valueOf(mu0Var.E());
            case 4:
                w(0);
                return Integer.valueOf(mu0Var.u());
            case 5:
                w(1);
                return Long.valueOf(mu0Var.s());
            case 6:
                w(5);
                return Integer.valueOf(mu0Var.r());
            case 7:
                w(0);
                return Boolean.valueOf(mu0Var.m());
            case 8:
                w(2);
                return mu0Var.B();
            case 9:
            default:
                throw new IllegalArgumentException("unsupported field type.");
            case 10:
                w(2);
                hf7 hf7VarA = hn6.c.a(cls);
                f fVarD = hf7VarA.d();
                c(fVarD, hf7VarA, i72Var);
                hf7VarA.b(fVarD);
                return fVarD;
            case 11:
                return e();
            case 12:
                w(0);
                return Integer.valueOf(mu0Var.D());
            case 13:
                w(0);
                return Integer.valueOf(mu0Var.p());
            case 14:
                w(5);
                return Integer.valueOf(mu0Var.w());
            case 15:
                w(1);
                return Long.valueOf(mu0Var.x());
            case 16:
                w(0);
                return Integer.valueOf(mu0Var.y());
            case 17:
                w(0);
                return Long.valueOf(mu0Var.z());
        }
    }

    public final void j(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof iq3;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iD = mu0Var.D();
                y(iD);
                int iD2 = mu0Var.d() + iD;
                do {
                    sr3Var.add(Integer.valueOf(mu0Var.r()));
                } while (mu0Var.d() < iD2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                sr3Var.add(Integer.valueOf(mu0Var.r()));
                if (mu0Var.e()) {
                    return;
                } else {
                    iC = mu0Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        iq3 iq3Var = (iq3) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iD3 = mu0Var.D();
            y(iD3);
            int iD4 = mu0Var.d() + iD3;
            do {
                iq3Var.c(mu0Var.r());
            } while (mu0Var.d() < iD4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            iq3Var.c(mu0Var.r());
            if (mu0Var.e()) {
                return;
            } else {
                iC2 = mu0Var.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public final void k(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof fe4;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    sr3Var.add(Long.valueOf(mu0Var.s()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.D();
            z(iD);
            int iD2 = mu0Var.d() + iD;
            do {
                sr3Var.add(Long.valueOf(mu0Var.s()));
            } while (mu0Var.d() < iD2);
            return;
        }
        fe4 fe4Var = (fe4) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                fe4Var.c(mu0Var.s());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD3 = mu0Var.D();
        z(iD3);
        int iD4 = mu0Var.d() + iD3;
        do {
            fe4Var.c(mu0Var.s());
        } while (mu0Var.d() < iD4);
    }

    public final void l(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof ee2;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iD = mu0Var.D();
                y(iD);
                int iD2 = mu0Var.d() + iD;
                do {
                    sr3Var.add(Float.valueOf(mu0Var.t()));
                } while (mu0Var.d() < iD2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                sr3Var.add(Float.valueOf(mu0Var.t()));
                if (mu0Var.e()) {
                    return;
                } else {
                    iC = mu0Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        ee2 ee2Var = (ee2) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iD3 = mu0Var.D();
            y(iD3);
            int iD4 = mu0Var.d() + iD3;
            do {
                ee2Var.c(mu0Var.t());
            } while (mu0Var.d() < iD4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            ee2Var.c(mu0Var.t());
            if (mu0Var.e()) {
                return;
            } else {
                iC2 = mu0Var.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public final void m(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof iq3;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Integer.valueOf(mu0Var.u()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Integer.valueOf(mu0Var.u()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        iq3 iq3Var = (iq3) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                iq3Var.c(mu0Var.u());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            iq3Var.c(mu0Var.u());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final void n(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof fe4;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Long.valueOf(mu0Var.v()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Long.valueOf(mu0Var.v()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        fe4 fe4Var = (fe4) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                fe4Var.c(mu0Var.v());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            fe4Var.c(mu0Var.v());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final void o(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof iq3;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 2) {
                int iD = mu0Var.D();
                y(iD);
                int iD2 = mu0Var.d() + iD;
                do {
                    sr3Var.add(Integer.valueOf(mu0Var.w()));
                } while (mu0Var.d() < iD2);
                return;
            }
            if (i != 5) {
                throw InvalidProtocolBufferException.e();
            }
            do {
                sr3Var.add(Integer.valueOf(mu0Var.w()));
                if (mu0Var.e()) {
                    return;
                } else {
                    iC = mu0Var.C();
                }
            } while (iC == this.b);
            this.d = iC;
            return;
        }
        iq3 iq3Var = (iq3) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 2) {
            int iD3 = mu0Var.D();
            y(iD3);
            int iD4 = mu0Var.d() + iD3;
            do {
                iq3Var.c(mu0Var.w());
            } while (mu0Var.d() < iD4);
            return;
        }
        if (i2 != 5) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            iq3Var.c(mu0Var.w());
            if (mu0Var.e()) {
                return;
            } else {
                iC2 = mu0Var.C();
            }
        } while (iC2 == this.b);
        this.d = iC2;
    }

    public final void p(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof fe4;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 1) {
                do {
                    sr3Var.add(Long.valueOf(mu0Var.x()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.D();
            z(iD);
            int iD2 = mu0Var.d() + iD;
            do {
                sr3Var.add(Long.valueOf(mu0Var.x()));
            } while (mu0Var.d() < iD2);
            return;
        }
        fe4 fe4Var = (fe4) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                fe4Var.c(mu0Var.x());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD3 = mu0Var.D();
        z(iD3);
        int iD4 = mu0Var.d() + iD3;
        do {
            fe4Var.c(mu0Var.x());
        } while (mu0Var.d() < iD4);
    }

    public final void q(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof iq3;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Integer.valueOf(mu0Var.y()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Integer.valueOf(mu0Var.y()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        iq3 iq3Var = (iq3) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                iq3Var.c(mu0Var.y());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            iq3Var.c(mu0Var.y());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final void r(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof fe4;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Long.valueOf(mu0Var.z()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Long.valueOf(mu0Var.z()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        fe4 fe4Var = (fe4) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                fe4Var.c(mu0Var.z());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            fe4Var.c(mu0Var.z());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final void s(sr3 sr3Var, boolean z) throws InvalidProtocolBufferException.InvalidWireTypeException {
        String strA;
        int iC;
        if ((this.b & 7) != 2) {
            throw InvalidProtocolBufferException.e();
        }
        do {
            mu0 mu0Var = this.a;
            if (z) {
                w(2);
                strA = mu0Var.B();
            } else {
                w(2);
                strA = mu0Var.A();
            }
            sr3Var.add(strA);
            if (mu0Var.e()) {
                return;
            } else {
                iC = mu0Var.C();
            }
        } while (iC == this.b);
        this.d = iC;
    }

    public final void t(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof iq3;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Integer.valueOf(mu0Var.D()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Integer.valueOf(mu0Var.D()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        iq3 iq3Var = (iq3) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                iq3Var.c(mu0Var.D());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            iq3Var.c(mu0Var.D());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final void u(sr3 sr3Var) throws InvalidProtocolBufferException {
        int iC;
        int iC2;
        boolean z = sr3Var instanceof fe4;
        mu0 mu0Var = this.a;
        if (!z) {
            int i = this.b & 7;
            if (i == 0) {
                do {
                    sr3Var.add(Long.valueOf(mu0Var.E()));
                    if (mu0Var.e()) {
                        return;
                    } else {
                        iC = mu0Var.C();
                    }
                } while (iC == this.b);
                this.d = iC;
                return;
            }
            if (i != 2) {
                throw InvalidProtocolBufferException.e();
            }
            int iD = mu0Var.d() + mu0Var.D();
            do {
                sr3Var.add(Long.valueOf(mu0Var.E()));
            } while (mu0Var.d() < iD);
            v(iD);
            return;
        }
        fe4 fe4Var = (fe4) sr3Var;
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                fe4Var.c(mu0Var.E());
                if (mu0Var.e()) {
                    return;
                } else {
                    iC2 = mu0Var.C();
                }
            } while (iC2 == this.b);
            this.d = iC2;
            return;
        }
        if (i2 != 2) {
            throw InvalidProtocolBufferException.e();
        }
        int iD2 = mu0Var.d() + mu0Var.D();
        do {
            fe4Var.c(mu0Var.E());
        } while (mu0Var.d() < iD2);
        v(iD2);
    }

    public final void v(int i) throws InvalidProtocolBufferException {
        if (this.a.d() != i) {
            throw InvalidProtocolBufferException.i();
        }
    }

    public final void w(int i) throws InvalidProtocolBufferException.InvalidWireTypeException {
        if ((this.b & 7) != i) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final boolean x() {
        int i;
        mu0 mu0Var = this.a;
        if (mu0Var.e() || (i = this.b) == this.c) {
            return false;
        }
        return mu0Var.F(i);
    }
}
