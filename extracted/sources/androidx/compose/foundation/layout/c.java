package androidx.compose.foundation.layout;

import defpackage.au1;
import defpackage.gx4;
import defpackage.mx4;
import defpackage.xy8;

/* JADX INFO: loaded from: classes.dex */
final class c extends mx4 {
    public final float b;
    public final float c;

    public c(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return au1.b(this.b, cVar.b) && au1.b(this.c, cVar.c);
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        xy8 xy8Var = new xy8();
        xy8Var.o = this.b;
        xy8Var.p = this.c;
        return xy8Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (Float.floatToIntBits(this.b) * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        xy8 xy8Var = (xy8) gx4Var;
        xy8Var.o = this.b;
        xy8Var.p = this.c;
    }
}
