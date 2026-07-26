package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: loaded from: classes.dex */
public final class uf8 extends c77 {
    public final /* synthetic */ Context n;
    public final /* synthetic */ TextPaint o;
    public final /* synthetic */ c77 p;
    public final /* synthetic */ vf8 q;

    public uf8(vf8 vf8Var, Context context, TextPaint textPaint, c77 c77Var) {
        this.q = vf8Var;
        this.n = context;
        this.o = textPaint;
        this.p = c77Var;
    }

    @Override // defpackage.c77
    public final void f(int i) {
        this.p.f(i);
    }

    @Override // defpackage.c77
    public final void g(Typeface typeface, boolean z) {
        this.q.f(this.n, this.o, typeface);
        this.p.g(typeface, z);
    }
}
