package defpackage;

import androidx.compose.runtime.snapshots.a;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class em5 extends vb5 {
    public final vb5 o;
    public boolean p;

    public em5(long j, a aVar, dp2 dp2Var, dp2 dp2Var2, vb5 vb5Var) {
        super(j, aVar, dp2Var, dp2Var2);
        this.o = vb5Var;
        vb5Var.k();
    }

    @Override // defpackage.vb5, defpackage.c08
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.p) {
            return;
        }
        this.p = true;
        this.o.l();
    }

    @Override // defpackage.vb5
    public final t17 w() throws Throwable {
        em5 em5Var;
        vb5 vb5Var = this.o;
        if (vb5Var.m || vb5Var.c) {
            return new d08(this);
        }
        sb5 sb5Var = this.h;
        long j = this.b;
        HashMap mapB = sb5Var != null ? g08.b(vb5Var.g(), this, this.o.d()) : null;
        synchronized (g08.c) {
            try {
                g08.c(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (sb5Var == null || sb5Var.d == 0) {
                    em5Var = this;
                    a();
                } else {
                    em5Var = this;
                    t17 t17VarZ = em5Var.z(this.o.g(), sb5Var, mapB, this.o.d());
                    if (!t17VarZ.equals(e08.d)) {
                        return t17VarZ;
                    }
                    sb5 sb5VarX = em5Var.o.x();
                    if (sb5VarX != null) {
                        sb5VarX.j(sb5Var);
                    } else {
                        em5Var.o.C(sb5Var);
                        em5Var.h = null;
                    }
                }
                if (js3.s(em5Var.o.g(), j) < 0) {
                    em5Var.o.v();
                }
                vb5 vb5Var2 = em5Var.o;
                vb5Var2.r(vb5Var2.d().c(j).a(em5Var.j));
                em5Var.o.A(j);
                vb5 vb5Var3 = em5Var.o;
                int i = em5Var.d;
                em5Var.d = -1;
                if (i >= 0) {
                    int[] iArr = vb5Var3.k;
                    js3.p(iArr, "<this>");
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    vb5Var3.k = iArrCopyOf;
                } else {
                    vb5Var3.getClass();
                }
                em5Var.o.B(em5Var.j);
                vb5 vb5Var4 = em5Var.o;
                int[] iArrR0 = em5Var.k;
                vb5Var4.getClass();
                if (iArrR0.length != 0) {
                    int[] iArr2 = vb5Var4.k;
                    if (iArr2.length != 0) {
                        iArrR0 = ew.R0(iArr2, iArrR0);
                    }
                    vb5Var4.k = iArrR0;
                }
                em5Var.m = true;
                if (!em5Var.p) {
                    em5Var.p = true;
                    em5Var.o.l();
                }
                return e08.d;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }
}
