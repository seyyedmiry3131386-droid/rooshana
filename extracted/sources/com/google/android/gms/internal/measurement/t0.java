package com.google.android.gms.internal.measurement;

import defpackage.bl4;
import defpackage.bq8;
import defpackage.c35;
import defpackage.fs9;
import defpackage.it9;
import defpackage.js9;
import defpackage.pt9;
import defpackage.rm7;
import defpackage.vs8;
import defpackage.wr9;

/* JADX INFO: loaded from: classes.dex */
public final class t0 implements it9 {
    public final o0 a;
    public final vs8 b;

    public t0(vs8 vs8Var, o0 o0Var) {
        bq8 bq8Var = fs9.a;
        this.b = vs8Var;
        this.a = o0Var;
    }

    @Override // defpackage.it9
    public final void a(Object obj, Object obj2) {
        u0.b(obj, obj2);
    }

    @Override // defpackage.it9
    public final int b(o0 o0Var) {
        pt9 pt9Var = ((q0) o0Var).zzc;
        int i = pt9Var.d;
        if (i != -1) {
            return i;
        }
        int iF = 0;
        for (int i2 = 0; i2 < pt9Var.a; i2++) {
            int i3 = pt9Var.b[i2] >>> 3;
            zzlh zzlhVar = (zzlh) pt9Var.c[i2];
            int iV = p0.v(8);
            int iV2 = p0.v(i3) + p0.v(16);
            int iV3 = p0.v(24);
            int iE = zzlhVar.e();
            iF += iV + iV + iV2 + rm7.f(iE, iE, iV3);
        }
        pt9Var.d = iF;
        return iF;
    }

    @Override // defpackage.it9
    public final boolean c(Object obj) {
        throw bl4.n(obj);
    }

    @Override // defpackage.it9
    public final boolean d(q0 q0Var, q0 q0Var2) {
        return q0Var.zzc.equals(q0Var2.zzc);
    }

    @Override // defpackage.it9
    public final void e(Object obj) {
        this.b.getClass();
        pt9 pt9Var = ((q0) obj).zzc;
        if (pt9Var.e) {
            pt9Var.e = false;
        }
        bq8 bq8Var = fs9.a;
        throw bl4.n(obj);
    }

    @Override // defpackage.it9
    public final void f(Object obj, c35 c35Var) {
        throw bl4.n(obj);
    }

    @Override // defpackage.it9
    public final int g(q0 q0Var) {
        return q0Var.zzc.hashCode();
    }

    @Override // defpackage.it9
    public final void h(Object obj, byte[] bArr, int i, int i2, wr9 wr9Var) {
        q0 q0Var = (q0) obj;
        if (q0Var.zzc == pt9.f) {
            q0Var.zzc = pt9.a();
        }
        throw bl4.n(obj);
    }

    @Override // defpackage.it9
    public final q0 zza() {
        o0 o0Var = this.a;
        return o0Var instanceof q0 ? (q0) ((q0) o0Var).o(4) : ((js9) ((q0) o0Var).o(5)).d();
    }
}
