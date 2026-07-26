package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class x36 implements m37 {
    public final Set a;
    public final zb5 b = new zb5(0, new n37[16]);

    public x36(Set set) {
        this.a = set;
    }

    @Override // defpackage.m37
    public final void e() {
        zb5 zb5Var = this.b;
        Object[] objArr = zb5Var.a;
        int i = zb5Var.c;
        for (int i2 = 0; i2 < i; i2++) {
            m37 m37Var = ((n37) objArr[i2]).a;
            this.a.remove(m37Var);
            m37Var.e();
        }
    }

    @Override // defpackage.m37
    public final void a() {
    }

    @Override // defpackage.m37
    public final void c() {
    }
}
