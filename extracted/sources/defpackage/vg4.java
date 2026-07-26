package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public final class vg4 implements fi6 {
    public final nm5 a;
    public zq3 b;
    public LayoutDirection c;
    public zq3 d;
    public rq3 e;

    public vg4(nm5 nm5Var) {
        this.a = nm5Var;
    }

    @Override // defpackage.fi6
    public final long a(vq3 vq3Var, long j, LayoutDirection layoutDirection, long j2) {
        rq3 rq3Var = this.e;
        if (rq3Var != null) {
            zq3 zq3Var = this.b;
            if ((zq3Var == null ? false : zq3.b(zq3Var.a, j)) && this.c == layoutDirection) {
                zq3 zq3Var2 = this.d;
                if (zq3Var2 != null ? zq3.b(zq3Var2.a, j2) : false) {
                    return rq3Var.a;
                }
            }
        }
        long jA = this.a.a(vq3Var, j, layoutDirection, j2);
        this.b = new zq3(j);
        this.c = layoutDirection;
        this.d = new zq3(j2);
        this.e = new rq3(jA);
        return jA;
    }
}
