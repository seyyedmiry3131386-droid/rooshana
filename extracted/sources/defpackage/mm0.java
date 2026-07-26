package defpackage;

import android.graphics.Typeface;

/* JADX INFO: loaded from: classes.dex */
public final class mm0 extends c77 {
    public final Typeface n;
    public final lm0 o;
    public boolean p;

    public mm0(lm0 lm0Var, Typeface typeface) {
        this.n = typeface;
        this.o = lm0Var;
    }

    @Override // defpackage.c77
    public final void f(int i) {
        if (this.p) {
            return;
        }
        this.o.h(this.n);
    }

    @Override // defpackage.c77
    public final void g(Typeface typeface, boolean z) {
        if (this.p) {
            return;
        }
        this.o.h(typeface);
    }
}
