package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bumptech.glide.request.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class q57 implements ve8 {
    public static final int c = or6.glide_custom_view_target_tag;
    public final g91 a;
    public final View b;

    public q57(View view) {
        ok4.p(view, "Argument must not be null");
        this.b = view;
        this.a = new g91(view);
    }

    @Override // defpackage.ve8
    public final v47 a() {
        Object tag = this.b.getTag(c);
        if (tag == null) {
            return null;
        }
        if (tag instanceof v47) {
            return (v47) tag;
        }
        throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
    }

    @Override // defpackage.ve8
    public final void c(v47 v47Var) {
        this.b.setTag(c, v47Var);
    }

    @Override // defpackage.ve8
    public final void d(a aVar) {
        this.a.b.remove(aVar);
    }

    @Override // defpackage.ve8
    public final void f(a aVar) {
        g91 g91Var = this.a;
        ArrayList arrayList = g91Var.b;
        View view = g91Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = g91Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = g91Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            aVar.l(iA, iA2);
            return;
        }
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
        if (g91Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            f91 f91Var = new f91(g91Var);
            g91Var.c = f91Var;
            viewTreeObserver.addOnPreDrawListener(f91Var);
        }
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        g91 g91Var = this.a;
        ViewTreeObserver viewTreeObserver = g91Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(g91Var.c);
        }
        g91Var.c = null;
        g91Var.b.clear();
    }

    public final String toString() {
        return "Target for: " + this.b;
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
    public final void g(Drawable drawable) {
    }

    @Override // defpackage.ve8
    public final void h(Drawable drawable) {
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
    }
}
