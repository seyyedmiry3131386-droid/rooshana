package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class gk extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ gk(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                hk hkVar = new hk(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                hkVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(hkVar.f);
                return hkVar;
            case 1:
                return (he0) this.b;
            default:
                return new ns2(this);
        }
    }

    public gk(he0 he0Var) {
        this.a = 1;
        this.b = he0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                hk hkVar = new hk(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                hkVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(hkVar.f);
                return hkVar;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new ns2(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                hk hkVar = new hk(null, 0);
                Drawable drawableNewDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                hkVar.a = drawableNewDrawable;
                drawableNewDrawable.setCallback(hkVar.f);
                return hkVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
