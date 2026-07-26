package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q70 implements p70 {
    public final List a;
    public uy3 c = null;
    public float d = -1.0f;
    public uy3 b = b(0.0f);

    public q70(List list) {
        this.a = list;
    }

    @Override // defpackage.p70
    public final boolean a(float f) {
        uy3 uy3Var = this.c;
        uy3 uy3Var2 = this.b;
        if (uy3Var == uy3Var2 && this.d == f) {
            return true;
        }
        this.c = uy3Var2;
        this.d = f;
        return false;
    }

    public final uy3 b(float f) {
        List list = this.a;
        uy3 uy3Var = (uy3) list.get(list.size() - 1);
        if (f >= uy3Var.b()) {
            return uy3Var;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            uy3 uy3Var2 = (uy3) list.get(size);
            if (this.b != uy3Var2 && f >= uy3Var2.b() && f < uy3Var2.a()) {
                return uy3Var2;
            }
        }
        return (uy3) list.get(0);
    }

    @Override // defpackage.p70
    public final uy3 c() {
        return this.b;
    }

    @Override // defpackage.p70
    public final boolean h(float f) {
        uy3 uy3Var = this.b;
        if (f >= uy3Var.b() && f < uy3Var.a()) {
            return !this.b.c();
        }
        this.b = b(f);
        return true;
    }

    @Override // defpackage.p70
    public final boolean isEmpty() {
        return false;
    }

    @Override // defpackage.p70
    public final float l() {
        return ((uy3) this.a.get(r0.size() - 1)).a();
    }

    @Override // defpackage.p70
    public final float m() {
        return ((uy3) this.a.get(0)).b();
    }
}
