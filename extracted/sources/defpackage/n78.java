package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlinx.serialization.json.internal.WriteMode;
import org.pcap4j.packet.constant.Ssh2PublicKeyAlgorithmName;

/* JADX INFO: loaded from: classes3.dex */
public final class n78 extends at2 implements qv3 {
    public final xe1 D;
    public final pu3 E;
    public final WriteMode F;
    public final qv3[] G;
    public final rb4 H;
    public final bv3 I;
    public boolean J;
    public String K;
    public String L;

    public n78(xe1 xe1Var, pu3 pu3Var, WriteMode writeMode, qv3[] qv3VarArr) {
        js3.p(xe1Var, "composer");
        this.D = xe1Var;
        this.E = pu3Var;
        this.F = writeMode;
        this.G = qv3VarArr;
        this.H = pu3Var.b;
        this.I = pu3Var.a;
        int iOrdinal = writeMode.ordinal();
        if (qv3VarArr != null) {
            qv3 qv3Var = qv3VarArr[iOrdinal];
            if (qv3Var == null && qv3Var == this) {
                return;
            }
            qv3VarArr[iOrdinal] = this;
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final void A(long j) {
        if (this.J) {
            C(String.valueOf(j));
        } else {
            this.D.q(j);
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final void C(String str) {
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        this.D.u(str);
    }

    @Override // defpackage.at2
    public final void V(no7 no7Var, int i) {
        js3.p(no7Var, "descriptor");
        int iOrdinal = this.F.ordinal();
        xe1 xe1Var = this.D;
        boolean z = true;
        if (iOrdinal == 1) {
            if (!xe1Var.a) {
                xe1Var.o(',');
            }
            xe1Var.m();
            return;
        }
        if (iOrdinal == 2) {
            if (xe1Var.a) {
                this.J = true;
                xe1Var.m();
                return;
            }
            if (i % 2 == 0) {
                xe1Var.o(',');
                xe1Var.m();
            } else {
                xe1Var.o(':');
                xe1Var.w();
                z = false;
            }
            this.J = z;
            return;
        }
        if (iOrdinal != 3) {
            if (!xe1Var.a) {
                xe1Var.o(',');
            }
            xe1Var.m();
            bt2.I(this.E, no7Var);
            C(no7Var.f(i));
            xe1Var.o(':');
            xe1Var.w();
            return;
        }
        if (i == 0) {
            this.J = true;
        }
        if (i == 1) {
            xe1Var.o(',');
            xe1Var.w();
            this.J = false;
        }
    }

    @Override // defpackage.at2, defpackage.uz0
    public final void a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        xe1 xe1Var = this.D;
        xe1Var.getClass();
        xe1Var.a = false;
        xe1Var.o(this.F.b);
    }

    @Override // defpackage.q12
    public final rb4 b() {
        return this.H;
    }

    @Override // defpackage.at2, defpackage.q12
    public final uz0 c(no7 no7Var) {
        qv3 qv3Var;
        js3.p(no7Var, "descriptor");
        pu3 pu3Var = this.E;
        WriteMode writeModeH = ln2.h(pu3Var, no7Var);
        char c = writeModeH.a;
        xe1 xe1Var = this.D;
        xe1Var.o(c);
        xe1Var.a = true;
        String str = this.K;
        if (str != null) {
            String strA = this.L;
            if (strA == null) {
                strA = no7Var.a();
            }
            xe1Var.m();
            C(str);
            xe1Var.o(':');
            C(strA);
            this.K = null;
            this.L = null;
        }
        if (this.F == writeModeH) {
            return this;
        }
        qv3[] qv3VarArr = this.G;
        return (qv3VarArr == null || (qv3Var = qv3VarArr[writeModeH.ordinal()]) == null) ? new n78(xe1Var, pu3Var, writeModeH, qv3VarArr) : qv3Var;
    }

    @Override // defpackage.at2, defpackage.q12
    public final void e() {
        this.D.r(Ssh2PublicKeyAlgorithmName.NULL);
    }

    @Override // defpackage.at2, defpackage.uz0
    public final boolean f(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        return this.I.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    @Override // defpackage.at2, defpackage.q12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(defpackage.px3 r5, java.lang.Object r6) {
        /*
            r4 = this;
            java.lang.String r0 = "serializer"
            defpackage.js3.p(r5, r0)
            pu3 r0 = r4.E
            bv3 r1 = r0.a
            boolean r2 = r5 instanceof defpackage.y1
            if (r2 == 0) goto L14
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h
            kotlinx.serialization.json.ClassDiscriminatorMode r3 = kotlinx.serialization.json.ClassDiscriminatorMode.a
            if (r1 == r3) goto L4a
            goto L41
        L14:
            kotlinx.serialization.json.ClassDiscriminatorMode r1 = r1.h
            int r1 = r1.ordinal()
            if (r1 == 0) goto L4a
            r3 = 1
            if (r1 == r3) goto L29
            r0 = 2
            if (r1 != r0) goto L23
            goto L4a
        L23:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L29:
            no7 r1 = r5.getDescriptor()
            o37 r1 = r1.getKind()
            g98 r3 = defpackage.g98.b
            boolean r3 = defpackage.js3.i(r1, r3)
            if (r3 != 0) goto L41
            g98 r3 = defpackage.g98.e
            boolean r1 = defpackage.js3.i(r1, r3)
            if (r1 == 0) goto L4a
        L41:
            no7 r1 = r5.getDescriptor()
            java.lang.String r0 = defpackage.is3.m(r0, r1)
            goto L4b
        L4a:
            r0 = 0
        L4b:
            if (r2 == 0) goto L89
            r1 = r5
            y1 r1 = (defpackage.y1) r1
            if (r6 == 0) goto L68
            px3 r1 = defpackage.js3.z(r1, r4, r6)
            if (r0 == 0) goto L66
            defpackage.is3.e(r5, r1, r0)
            no7 r5 = r1.getDescriptor()
            o37 r5 = r5.getKind()
            defpackage.is3.k(r5)
        L66:
            r5 = r1
            goto L89
        L68:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "Value for serializer "
            r5.<init>(r6)
            no7 r6 = r1.getDescriptor()
            r5.append(r6)
            java.lang.String r6 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r6.<init>(r5)
            throw r6
        L89:
            if (r0 == 0) goto L97
            no7 r1 = r5.getDescriptor()
            java.lang.String r1 = r1.a()
            r4.K = r0
            r4.L = r1
        L97:
            r5.serialize(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n78.g(px3, java.lang.Object):void");
    }

    @Override // defpackage.at2, defpackage.q12
    public final void h(double d) {
        boolean z = this.J;
        xe1 xe1Var = this.D;
        if (z) {
            C(String.valueOf(d));
        } else {
            ((yr3) xe1Var.b).e(String.valueOf(d));
        }
        if (Math.abs(d) > Double.MAX_VALUE) {
            throw br9.g(Double.valueOf(d), ((yr3) xe1Var.b).toString());
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final void i(short s) {
        if (this.J) {
            C(String.valueOf((int) s));
        } else {
            this.D.s(s);
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final void k(byte b) {
        if (this.J) {
            C(String.valueOf((int) b));
        } else {
            this.D.n(b);
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final void l(boolean z) {
        if (this.J) {
            C(String.valueOf(z));
        } else {
            ((yr3) this.D.b).e(String.valueOf(z));
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final q12 m(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        boolean zA = o78.a(no7Var);
        WriteMode writeMode = this.F;
        pu3 pu3Var = this.E;
        xe1 lz0Var = this.D;
        if (zA) {
            if (!(lz0Var instanceof mz0)) {
                lz0Var = new mz0((yr3) lz0Var.b, this.J);
            }
            return new n78(lz0Var, pu3Var, writeMode, null);
        }
        if (no7Var.isInline() && no7Var.equals(mv3.a)) {
            if (!(lz0Var instanceof lz0)) {
                lz0Var = new lz0((yr3) lz0Var.b, this.J);
            }
            return new n78(lz0Var, pu3Var, writeMode, null);
        }
        if (this.K != null) {
            this.L = no7Var.a();
        }
        return this;
    }

    @Override // defpackage.at2, defpackage.q12
    public final void p(float f) {
        boolean z = this.J;
        xe1 xe1Var = this.D;
        if (z) {
            C(String.valueOf(f));
        } else {
            ((yr3) xe1Var.b).e(String.valueOf(f));
        }
        if (Math.abs(f) > Float.MAX_VALUE) {
            throw br9.g(Float.valueOf(f), ((yr3) xe1Var.b).toString());
        }
    }

    @Override // defpackage.at2, defpackage.q12
    public final void r(char c) {
        C(String.valueOf(c));
    }

    @Override // defpackage.at2, defpackage.q12
    public final void t(no7 no7Var, int i) {
        js3.p(no7Var, "enumDescriptor");
        C(no7Var.f(i));
    }

    @Override // defpackage.at2, defpackage.q12
    public final void y(int i) {
        if (this.J) {
            C(String.valueOf(i));
        } else {
            this.D.p(i);
        }
    }

    @Override // defpackage.at2, defpackage.uz0
    public final void z(no7 no7Var, int i, px3 px3Var, Object obj) {
        js3.p(no7Var, "descriptor");
        js3.p(px3Var, "serializer");
        if (obj != null || this.I.d) {
            super.z(no7Var, i, px3Var, obj);
        }
    }
}
