package androidx.compose.foundation.layout;

import defpackage.fc2;
import defpackage.gx4;
import defpackage.mx4;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public final class FillElement extends mx4 {
    public final Direction b;
    public final float c;

    public FillElement(Direction direction, float f) {
        this.b = direction;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FillElement)) {
            return false;
        }
        FillElement fillElement = (FillElement) obj;
        return this.b == fillElement.b && this.c == fillElement.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        fc2 fc2Var = new fc2();
        fc2Var.o = this.b;
        fc2Var.p = this.c;
        return fc2Var;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.c) + (this.b.hashCode() * 31);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        fc2 fc2Var = (fc2) gx4Var;
        fc2Var.o = this.b;
        fc2Var.p = this.c;
    }
}
