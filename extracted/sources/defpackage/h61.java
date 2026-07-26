package defpackage;

import androidx.compose.foundation.text.selection.f;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.g;

/* JADX INFO: loaded from: classes.dex */
public final class h61 extends ti1 implements in7 {
    public tq8 q;
    public zh8 r;
    public x44 s;
    public boolean t;
    public rr5 u;
    public f v;
    public cj3 w;
    public qg2 x;

    public static void F0(x44 x44Var, String str, boolean z) {
        if (z) {
            ji8 ji8Var = x44Var.e;
            x51 x51Var = x44Var.v;
            if (ji8Var == null) {
                int length = str.length();
                x51Var.invoke(new zh8(str, uy6.b(length, length), 4));
            } else {
                zh8 zh8VarL = x44Var.d.l(br9.C(new ej1(), new xw0(str, 1)));
                ji8Var.a(null, zh8VarL);
                x51Var.invoke(zh8VarL);
            }
        }
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean C() {
        return false;
    }

    @Override // defpackage.in7
    public final /* synthetic */ boolean h() {
        return true;
    }

    @Override // defpackage.in7
    public final void k0(nn7 nn7Var) {
        ll llVar = this.r.a;
        ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
        g gVar = d.E;
        ox3[] ox3VarArr2 = androidx.compose.ui.semantics.f.a;
        ox3 ox3Var = ox3VarArr2[18];
        nn7Var.a(gVar, llVar);
        ll llVar2 = this.q.a;
        g gVar2 = d.F;
        ox3 ox3Var2 = ox3VarArr2[19];
        nn7Var.a(gVar2, llVar2);
        long j = this.r.b;
        g gVar3 = d.G;
        ox3 ox3Var3 = ox3VarArr2[20];
        nn7Var.a(gVar3, new zi8(j));
        tf tfVar = hy2.e;
        g gVar4 = d.r;
        ox3 ox3Var4 = ox3VarArr2[9];
        nn7Var.a(gVar4, tfVar);
        gg ggVarF = fz.f(this.r.a);
        if (ggVarF != null) {
            g gVar5 = d.s;
            ox3 ox3Var5 = ox3VarArr2[10];
            nn7Var.a(gVar5, ggVarF);
        }
        androidx.compose.ui.semantics.f.c(nn7Var, new g61(this, 0));
        int i = this.w.c;
        if (i == 6) {
            s41.a.getClass();
            androidx.compose.ui.semantics.f.e(nn7Var, r41.c);
        } else if (i == 7 || i == 8) {
            s41.a.getClass();
            androidx.compose.ui.semantics.f.e(nn7Var, r41.b);
        } else if (i == 4) {
            s41.a.getClass();
            androidx.compose.ui.semantics.f.e(nn7Var, r41.d);
        }
        if (!this.t) {
            nn7Var.a(d.i, tx8.a);
        }
        boolean z = this.t;
        g gVar6 = d.N;
        ox3 ox3Var6 = ox3VarArr2[26];
        nn7Var.a(gVar6, Boolean.valueOf(z));
        androidx.compose.ui.semantics.f.b(nn7Var, new g61(this, 1));
        int i2 = 2;
        if (z) {
            nn7Var.a(a.k, new e3(null, new g61(this, i2)));
            nn7Var.a(a.o, new e3(null, new g61(this, nn7Var)));
        }
        nn7Var.a(a.j, new e3(null, new va(3, this)));
        int i3 = this.w.d;
        f61 f61Var = new f61(this, 6);
        nn7Var.a(d.H, new bj3(i3));
        nn7Var.a(a.p, new e3(null, f61Var));
        nn7Var.a(a.b, new e3(null, new f61(this, 7)));
        nn7Var.a(a.c, new e3(null, new f61(this, 1)));
        if (!zi8.d(this.r.b)) {
            nn7Var.a(a.q, new e3(null, new f61(this, 2)));
            if (this.t) {
                nn7Var.a(a.r, new e3(null, new f61(this, 3)));
            }
        }
        if (this.t) {
            nn7Var.a(a.s, new e3(null, new f61(this, 5)));
        }
    }

    @Override // defpackage.in7
    public final boolean m0() {
        return true;
    }
}
