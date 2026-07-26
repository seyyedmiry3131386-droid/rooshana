package androidx.compose.foundation;

import defpackage.gx4;
import defpackage.js3;
import defpackage.mx4;
import defpackage.pg7;
import defpackage.tg7;

/* JADX INFO: loaded from: classes.dex */
public final class ScrollingLayoutElement extends mx4 {
    public final tg7 b;
    public final boolean c;

    public ScrollingLayoutElement(tg7 tg7Var, boolean z) {
        this.b = tg7Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ScrollingLayoutElement)) {
            return false;
        }
        ScrollingLayoutElement scrollingLayoutElement = (ScrollingLayoutElement) obj;
        return js3.i(this.b, scrollingLayoutElement.b) && this.c == scrollingLayoutElement.c;
    }

    @Override // defpackage.mx4
    public final gx4 h() {
        pg7 pg7Var = new pg7();
        pg7Var.o = this.b;
        pg7Var.p = this.c;
        return pg7Var;
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + 1237) * 31) + (this.c ? 1231 : 1237);
    }

    @Override // defpackage.mx4
    public final void j(gx4 gx4Var) {
        pg7 pg7Var = (pg7) gx4Var;
        pg7Var.o = this.b;
        pg7Var.p = this.c;
    }
}
