package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class qv1 implements wh3 {
    public final Drawable a;

    public qv1(Drawable drawable) {
        this.a = drawable;
    }

    @Override // defpackage.wh3
    public final int a() {
        return s29.a(this.a);
    }

    @Override // defpackage.wh3
    public final int b() {
        return s29.b(this.a);
    }

    @Override // defpackage.wh3
    public final long c() {
        Drawable drawable = this.a;
        long jB = ((long) s29.b(drawable)) * 4 * ((long) s29.a(drawable));
        if (jB < 0) {
            return 0L;
        }
        return jB;
    }

    @Override // defpackage.wh3
    public final boolean d() {
        return false;
    }

    @Override // defpackage.wh3
    public final void e(Canvas canvas) {
        this.a.draw(canvas);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qv1) && js3.i(this.a, ((qv1) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1237;
    }

    public final String toString() {
        return "DrawableImage(drawable=" + this.a + ", shareable=false)";
    }
}
