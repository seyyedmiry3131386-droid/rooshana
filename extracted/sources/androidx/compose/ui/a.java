package androidx.compose.ui;

import defpackage.bl4;
import defpackage.dp2;
import defpackage.fx4;
import defpackage.hx4;
import defpackage.js3;
import defpackage.qp2;

/* JADX INFO: loaded from: classes.dex */
public final class a implements hx4 {
    public final hx4 b;
    public final hx4 c;

    public a(hx4 hx4Var, hx4 hx4Var2) {
        this.b = hx4Var;
        this.c = hx4Var2;
    }

    @Override // defpackage.hx4
    public final /* synthetic */ hx4 d(hx4 hx4Var) {
        return bl4.g(this, hx4Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return js3.i(this.b, aVar.b) && js3.i(this.c, aVar.c);
    }

    @Override // defpackage.hx4
    public final boolean g(dp2 dp2Var) {
        return this.b.g(dp2Var) && this.c.g(dp2Var);
    }

    public final int hashCode() {
        return (this.c.hashCode() * 31) + this.b.hashCode();
    }

    @Override // defpackage.hx4
    public final Object i(qp2 qp2Var, Object obj) {
        return this.c.i(qp2Var, this.b.i(qp2Var, obj));
    }

    public final String toString() {
        return bl4.y(new StringBuilder("["), (String) i(new qp2() { // from class: androidx.compose.ui.CombinedModifier$toString$1
            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                String str = (String) obj;
                fx4 fx4Var = (fx4) obj2;
                if (str.length() == 0) {
                    return fx4Var.toString();
                }
                return str + ", " + fx4Var;
            }
        }, ""), ']');
    }
}
