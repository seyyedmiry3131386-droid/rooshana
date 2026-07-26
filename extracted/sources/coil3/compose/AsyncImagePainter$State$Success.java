package coil3.compose;

import defpackage.g16;
import defpackage.ib8;
import defpackage.js3;
import defpackage.zw;

/* JADX INFO: loaded from: classes.dex */
public final class AsyncImagePainter$State$Success implements zw {
    public final ib8 a;
    private final g16 painter;

    public AsyncImagePainter$State$Success(g16 g16Var, ib8 ib8Var) {
        this.painter = g16Var;
        this.a = ib8Var;
    }

    @Override // defpackage.zw
    public final g16 a() {
        return this.painter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AsyncImagePainter$State$Success)) {
            return false;
        }
        AsyncImagePainter$State$Success asyncImagePainter$State$Success = (AsyncImagePainter$State$Success) obj;
        return js3.i(this.painter, asyncImagePainter$State$Success.painter) && js3.i(this.a, asyncImagePainter$State$Success.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.painter.hashCode() * 31);
    }

    public final String toString() {
        return "Success(painter=" + this.painter + ", result=" + this.a + ")";
    }
}
