package defpackage;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.request.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class d91 implements ve8 {
    public final int a;
    public final int b;
    public v47 c;

    public d91() {
        if (!i29.j(Integer.MIN_VALUE, Integer.MIN_VALUE)) {
            throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: -2147483648 and height: -2147483648");
        }
        this.a = Integer.MIN_VALUE;
        this.b = Integer.MIN_VALUE;
    }

    @Override // defpackage.ve8
    public final v47 a() {
        return this.c;
    }

    @Override // defpackage.ve8
    public final void c(v47 v47Var) {
        this.c = v47Var;
    }

    @Override // defpackage.ve8
    public final void f(a aVar) {
        aVar.l(this.a, this.b);
    }

    @Override // defpackage.e64
    public final void b() {
    }

    @Override // defpackage.e64
    public final void e() {
    }

    @Override // defpackage.e64
    public final void k() {
    }

    @Override // defpackage.ve8
    public final void d(a aVar) {
    }

    @Override // defpackage.ve8
    public void g(Drawable drawable) {
    }

    @Override // defpackage.ve8
    public final void h(Drawable drawable) {
    }
}
