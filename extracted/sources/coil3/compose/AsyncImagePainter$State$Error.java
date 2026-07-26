package coil3.compose;

import defpackage.g16;
import defpackage.js3;
import defpackage.p32;
import defpackage.zw;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter$State$Error implements zw {
    public final p32 a;
    private final g16 painter;

    public AsyncImagePainter$State$Error(g16 g16Var, p32 p32Var) {
        this.painter = g16Var;
        this.a = p32Var;
    }

    @Override // defpackage.zw
    public final g16 a() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Error)) {
            return false;
        }
        AsyncImagePainter$State$Error asyncImagePainter$State$Error = (AsyncImagePainter$State$Error) obj;
        return js3.i(this.painter, asyncImagePainter$State$Error.painter) && js3.i(this.a, asyncImagePainter$State$Error.a);
    }

    public final int hashCode() {
        g16 g16Var = this.painter;
        return this.a.hashCode() + ((g16Var == null ? 0 : g16Var.hashCode()) * 31);
    }

    public final String toString() {
        return "Error(painter=" + this.painter + ", result=" + this.a + ")";
    }
}
