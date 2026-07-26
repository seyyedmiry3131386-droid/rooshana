package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.bumptech.glide.request.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class aj3 extends g90 {
    public static final int d = or6.glide_custom_view_target_tag;
    public final ImageView a;
    public final p99 b;
    public Animatable c;

    public aj3(ImageView imageView) {
        ok4.p(imageView, "Argument must not be null");
        this.a = imageView;
        this.b = new p99(imageView);
    }

    @Override // defpackage.ve8
    public final v47 a() {
        Object tag = this.a.getTag(d);
        if (tag == null) {
            return null;
        }
        if (tag instanceof v47) {
            return (v47) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // defpackage.e64
    public final void b() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // defpackage.ve8
    public final void c(v47 v47Var) {
        this.a.setTag(d, v47Var);
    }

    @Override // defpackage.ve8
    public final void d(a aVar) {
        this.b.b.remove(aVar);
    }

    @Override // defpackage.ve8
    public final void f(a aVar) {
        p99 p99Var = this.b;
        ArrayList arrayList = p99Var.b;
        View view = p99Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = p99Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = p99Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            aVar.l(iA, iA2);
            return;
        }
        if (!arrayList.contains(aVar)) {
            arrayList.add(aVar);
        }
        if (p99Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            f91 f91Var = new f91(p99Var);
            p99Var.c = f91Var;
            viewTreeObserver.addOnPreDrawListener(f91Var);
        }
    }

    @Override // defpackage.ve8
    public final void g(Drawable drawable) {
        l(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.ve8
    public final void h(Drawable drawable) {
        l(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.ve8
    public final void i(Object obj, ir8 ir8Var) {
        if (ir8Var != null && ir8Var.a(obj, this)) {
            if (!(obj instanceof Animatable)) {
                this.c = null;
                return;
            }
            Animatable animatable = (Animatable) obj;
            this.c = animatable;
            animatable.start();
            return;
        }
        l(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable2 = (Animatable) obj;
        this.c = animatable2;
        animatable2.start();
    }

    @Override // defpackage.ve8
    public final void j(Drawable drawable) {
        p99 p99Var = this.b;
        ViewTreeObserver viewTreeObserver = p99Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(p99Var.c);
        }
        p99Var.c = null;
        p99Var.b.clear();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        l(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.e64
    public final void k() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    public abstract void l(Object obj);

    public final String toString() {
        return "Target for: " + this.a;
    }
}
