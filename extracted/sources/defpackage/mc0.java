package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;

/* JADX INFO: loaded from: classes.dex */
public final class mc0 implements wh3 {
    public final Bitmap a;

    public mc0(Bitmap bitmap) {
        this.a = bitmap;
    }

    @Override // defpackage.wh3
    public final int a() {
        return this.a.getHeight();
    }

    @Override // defpackage.wh3
    public final int b() {
        return this.a.getWidth();
    }

    @Override // defpackage.wh3
    public final long c() {
        return fz.h(this.a);
    }

    @Override // defpackage.wh3
    public final boolean d() {
        return true;
    }

    @Override // defpackage.wh3
    public final void e(Canvas canvas) {
        canvas.drawBitmap(this.a, 0.0f, 0.0f, (Paint) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mc0) && js3.i(this.a, ((mc0) obj).a);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "BitmapImage(bitmap=" + this.a + ", shareable=true)";
    }
}
