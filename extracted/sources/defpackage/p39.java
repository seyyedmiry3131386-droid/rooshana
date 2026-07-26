package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* JADX INFO: loaded from: classes.dex */
public final class p39 extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public p39(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        q39 q39Var = new q39();
        q39Var.a = (VectorDrawable) this.a.newDrawable();
        return q39Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        q39 q39Var = new q39();
        q39Var.a = (VectorDrawable) this.a.newDrawable(resources);
        return q39Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        q39 q39Var = new q39();
        q39Var.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return q39Var;
    }
}
