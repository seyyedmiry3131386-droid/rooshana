package defpackage;

import androidx.compose.foundation.text.input.internal.a;
import androidx.compose.foundation.text.selection.f;

/* JADX INFO: loaded from: classes.dex */
final class p44 extends mx4 {
    public final a b;
    public final x44 c;
    public final f d;

    public p44(a aVar, x44 x44Var, f fVar) {
        this.b = aVar;
        this.c = x44Var;
        this.d = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p44)) {
            return false;
        }
        p44 p44Var = (p44) obj;
        return js3.i(this.b, p44Var.b) && js3.i(this.c, p44Var.c) && js3.i(this.d, p44Var.d);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        return new q44(this.b, this.c, this.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) throws Throwable {
        q44 q44Var = (q44) gx4Var;
        if (q44Var.n) {
            q44Var.o.c();
            q44Var.o.k(q44Var);
        }
        a aVar = this.b;
        q44Var.o = aVar;
        if (q44Var.n) {
            if (aVar.a != null) {
                un3.c("Expected textInputModifierNode to be null");
            }
            aVar.a = q44Var;
        }
        q44Var.p = this.c;
        q44Var.q = this.d;
    }

    public final String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.b + ", legacyTextFieldState=" + this.c + ", textFieldSelectionManager=" + this.d + ')';
    }
}
