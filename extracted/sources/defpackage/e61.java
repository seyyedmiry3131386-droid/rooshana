package defpackage;

import androidx.compose.foundation.text.selection.f;

/* JADX INFO: loaded from: classes.dex */
public final class e61 extends mx4 {
    public final tq8 b;
    public final zh8 c;
    public final x44 d;
    public final boolean e;
    public final rr5 f;
    public final f g;
    public final cj3 h;
    public final qg2 i;

    public e61(tq8 tq8Var, zh8 zh8Var, x44 x44Var, boolean z, rr5 rr5Var, f fVar, cj3 cj3Var, qg2 qg2Var) {
        this.b = tq8Var;
        this.c = zh8Var;
        this.d = x44Var;
        this.e = z;
        this.f = rr5Var;
        this.g = fVar;
        this.h = cj3Var;
        this.i = qg2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e61)) {
            return false;
        }
        e61 e61Var = (e61) obj;
        return this.b.equals(e61Var.b) && this.c.equals(e61Var.c) && this.d.equals(e61Var.d) && this.e == e61Var.e && js3.i(this.f, e61Var.f) && this.g.equals(e61Var.g) && js3.i(this.h, e61Var.h) && js3.i(this.i, e61Var.i);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        h61 h61Var = new h61();
        h61Var.q = this.b;
        h61Var.r = this.c;
        h61Var.s = this.d;
        h61Var.t = this.e;
        h61Var.u = this.f;
        f fVar = this.g;
        h61Var.v = fVar;
        h61Var.w = this.h;
        h61Var.x = this.i;
        fVar.f = new f61(h61Var, 4);
        return h61Var;
    }

    public final int hashCode() {
        return this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((((((((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31) + 1237) * 31) + (this.e ? 1231 : 1237)) * 31) + 1237) * 31)) * 31)) * 31)) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        h61 h61Var = (h61) gx4Var;
        boolean z = h61Var.t;
        cj3 cj3Var = h61Var.w;
        f fVar = h61Var.v;
        h61Var.q = this.b;
        zh8 zh8Var = this.c;
        h61Var.r = zh8Var;
        h61Var.s = this.d;
        boolean z2 = this.e;
        h61Var.t = z2;
        h61Var.u = this.f;
        f fVar2 = this.g;
        h61Var.v = fVar2;
        cj3 cj3Var2 = this.h;
        h61Var.w = cj3Var2;
        h61Var.x = this.i;
        if (z2 != z || z2 != z || !js3.i(cj3Var2, cj3Var) || !zi8.d(zh8Var.b)) {
            t17.f(h61Var);
        }
        if (fVar2.equals(fVar)) {
            return;
        }
        fVar2.f = new f61(h61Var, 0);
    }

    public final String toString() {
        return "CoreTextFieldSemanticsModifier(transformedText=" + this.b + ", value=" + this.c + ", state=" + this.d + ", readOnly=false, enabled=" + this.e + ", isPassword=false, offsetMapping=" + this.f + ", manager=" + this.g + ", imeOptions=" + this.h + ", focusRequester=" + this.i + ')';
    }
}
