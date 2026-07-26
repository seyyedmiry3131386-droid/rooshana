package defpackage;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes3.dex */
public final class mt2 extends s57 {
    @Override // defpackage.s57
    public final f57 l(Class cls) {
        return new lt2(this.a, this, cls, this.b);
    }

    @Override // defpackage.s57
    public final f57 m() {
        return (lt2) super.m();
    }

    @Override // defpackage.s57
    public final f57 n() {
        return (lt2) l(Drawable.class);
    }

    @Override // defpackage.s57
    public final f57 q(ne5 ne5Var) {
        return (lt2) super.q(ne5Var);
    }

    @Override // defpackage.s57
    public final f57 r(Drawable drawable) {
        return (lt2) super.r(drawable);
    }

    @Override // defpackage.s57
    public final f57 s(String str) {
        return (lt2) super.s(str);
    }

    @Override // defpackage.s57
    public final s57 v(w57 w57Var) {
        synchronized (this) {
            super.v(w57Var);
        }
        return this;
    }

    @Override // defpackage.s57
    public final void w(w57 w57Var) {
        if (w57Var instanceof kt2) {
            super.w(w57Var);
        } else {
            super.w(new kt2().L(w57Var));
        }
    }
}
