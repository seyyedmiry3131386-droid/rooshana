package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class i91 extends dk4 {
    public final RectF s;

    public i91(as7 as7Var, RectF rectF) {
        super(as7Var);
        this.s = rectF;
    }

    @Override // defpackage.dk4, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        j91 j91Var = new j91(this);
        j91Var.H = this;
        j91Var.invalidateSelf();
        return j91Var;
    }

    public i91(i91 i91Var) {
        super(i91Var);
        this.s = i91Var.s;
    }
}
