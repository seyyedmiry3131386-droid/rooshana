package defpackage;

import androidx.compose.ui.c;

/* JADX INFO: loaded from: classes.dex */
public final class xg9 extends mx4 {
    public final float b;

    public xg9(float f) {
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xg9) && Float.compare(this.b, ((xg9) obj).b) == 0;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        c cVar = new c();
        cVar.o = this.b;
        return cVar;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.b);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        ((c) gx4Var).o = this.b;
    }

    public final String toString() {
        return t61.k(new StringBuilder("ZIndexElement(zIndex="), this.b, ')');
    }
}
