package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes.dex */
public final class iy7 implements uh6 {
    public final ig4 a;
    public int b;
    public Bitmap.Config c;

    public iy7(ig4 ig4Var) {
        this.a = ig4Var;
    }

    @Override // defpackage.uh6
    public final void a() {
        this.a.n(this);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof iy7) {
            iy7 iy7Var = (iy7) obj;
            if (this.b == iy7Var.b && i29.b(this.c, iy7Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b * 31;
        Bitmap.Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return jy7.c(this.b, this.c);
    }
}
