package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class iv3 extends yq2 {
    public final t0 g;
    public final rb4 h;

    public iv3(t0 t0Var, pu3 pu3Var) {
        js3.p(pu3Var, "json");
        this.g = t0Var;
        this.h = pu3Var.b;
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final byte B() {
        gw8 gw8Var;
        t0 t0Var = this.g;
        String strL = t0Var.l();
        try {
            js3.p(strL, "<this>");
            ow8 ow8VarL = o27.l(10, strL);
            if (ow8VarL != null) {
                int i = ow8VarL.a;
                gw8Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147483393) > 0 ? null : new gw8((byte) i);
            }
            if (gw8Var != null) {
                return gw8Var.a;
            }
            m88.U(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.t(t0Var, rm7.m('\'', "Failed to parse type 'UByte' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final short C() {
        yw8 yw8Var;
        t0 t0Var = this.g;
        String strL = t0Var.l();
        try {
            js3.p(strL, "<this>");
            ow8 ow8VarL = o27.l(10, strL);
            if (ow8VarL != null) {
                int i = ow8VarL.a;
                yw8Var = Integer.compare(Integer.MIN_VALUE ^ i, -2147418113) > 0 ? null : new yw8((short) i);
            }
            if (yw8Var != null) {
                return yw8Var.a;
            }
            m88.U(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.t(t0Var, rm7.m('\'', "Failed to parse type 'UShort' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.tz0
    public final rb4 b() {
        return this.h;
    }

    @Override // defpackage.tz0
    public final int i(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        throw new IllegalStateException("unsupported");
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final int p() {
        t0 t0Var = this.g;
        String strL = t0Var.l();
        try {
            js3.p(strL, "<this>");
            ow8 ow8VarL = o27.l(10, strL);
            if (ow8VarL != null) {
                return ow8VarL.a;
            }
            m88.U(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.t(t0Var, rm7.m('\'', "Failed to parse type 'UInt' for input '", strL), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.yq2, defpackage.cc1
    public final long x() {
        t0 t0Var = this.g;
        String strL = t0Var.l();
        try {
            js3.p(strL, "<this>");
            tw8 tw8VarM = o27.m(strL);
            if (tw8VarM != null) {
                return tw8VarM.a;
            }
            m88.U(strL);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.t(t0Var, rm7.m('\'', "Failed to parse type 'ULong' for input '", strL), 0, null, 6);
            throw null;
        }
    }
}
