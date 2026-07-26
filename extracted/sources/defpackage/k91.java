package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public abstract class k91 extends fk4 {
    public static final /* synthetic */ int I = 0;
    public i91 H;

    public final void E(float f, float f2, float f3, float f4) {
        RectF rectF = this.H.s;
        if (f == rectF.left && f2 == rectF.top && f3 == rectF.right && f4 == rectF.bottom) {
            return;
        }
        rectF.set(f, f2, f3, f4);
        invalidateSelf();
    }

    @Override // defpackage.fk4, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.H = new i91(this.H);
        return this;
    }
}
