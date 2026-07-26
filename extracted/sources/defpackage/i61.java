package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* JADX INFO: loaded from: classes.dex */
public abstract class i61 implements xr7 {
    public final s61 a;
    public final s61 b;
    public final s61 c;
    public final s61 d;

    public i61(s61 s61Var, s61 s61Var2, s61 s61Var3, s61 s61Var4) {
        this.a = s61Var;
        this.b = s61Var2;
        this.c = s61Var3;
        this.d = s61Var4;
    }

    public static /* synthetic */ i61 c(i61 i61Var, s61 s61Var, s61 s61Var2, s61 s61Var3, s61 s61Var4, int i) {
        if ((i & 1) != 0) {
            s61Var = i61Var.a;
        }
        if ((i & 2) != 0) {
            s61Var2 = i61Var.b;
        }
        if ((i & 4) != 0) {
            s61Var3 = i61Var.c;
        }
        if ((i & 8) != 0) {
            s61Var4 = i61Var.d;
        }
        return i61Var.b(s61Var, s61Var2, s61Var3, s61Var4);
    }

    @Override // defpackage.xr7
    public final rq4 a(long j, LayoutDirection layoutDirection, qj1 qj1Var) {
        float fA = this.a.a(j, qj1Var);
        float fA2 = this.b.a(j, qj1Var);
        float fA3 = this.c.a(j, qj1Var);
        float fA4 = this.d.a(j, qj1Var);
        float fD = ey7.d(j);
        float f = fA + fA4;
        if (f > fD) {
            float f2 = fD / f;
            fA *= f2;
            fA4 *= f2;
        }
        float f3 = fA2 + fA3;
        if (f3 > fD) {
            float f4 = fD / f3;
            fA2 *= f4;
            fA3 *= f4;
        }
        if (fA < 0.0f || fA2 < 0.0f || fA3 < 0.0f || fA4 < 0.0f) {
            un3.a("Corner size in Px can't be negative(topStart = " + fA + ", topEnd = " + fA2 + ", bottomEnd = " + fA3 + ", bottomStart = " + fA4 + ")!");
        }
        return d(j, fA, fA2, fA3, fA4, layoutDirection);
    }

    public abstract i61 b(s61 s61Var, s61 s61Var2, s61 s61Var3, s61 s61Var4);

    public abstract rq4 d(long j, float f, float f2, float f3, float f4, LayoutDirection layoutDirection);
}
