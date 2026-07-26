package defpackage;

import android.graphics.Path;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.g;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class rf9 {
    public static final WeakHashMap w = new WeakHashMap();
    public final wi a;
    public final wi b;
    public final wi c;
    public final wi d;
    public final wi e;
    public final wi f;
    public final wi g;
    public final wi h;
    public final wi i;
    public final b39 j;
    public final wb5 k;
    public final qx8 l;
    public final b39 m;
    public final b39 n;
    public final b39 o;
    public final b39 p;
    public final b39 q;
    public final b39 r;
    public final b39 s;
    public final boolean t;
    public int u;
    public final so3 v;

    public rf9(View view) {
        wi wiVarG = js8.g(4, "captionBar");
        this.a = wiVarG;
        wi wiVarG2 = js8.g(128, "displayCutout");
        this.b = wiVarG2;
        wi wiVarG3 = js8.g(8, "ime");
        this.c = wiVarG3;
        wi wiVarG4 = js8.g(32, "mandatorySystemGestures");
        this.d = wiVarG4;
        wi wiVarG5 = js8.g(2, "navigationBars");
        this.e = wiVarG5;
        wi wiVarG6 = js8.g(1, "statusBars");
        this.f = wiVarG6;
        wi wiVarG7 = js8.g(519, "systemBars");
        this.g = wiVarG7;
        wi wiVarG8 = js8.g(16, "systemGestures");
        this.h = wiVarG8;
        wi wiVarG9 = js8.g(64, "tappableElement");
        this.i = wiVarG9;
        b39 b39Var = new b39(new wo3(0, 0, 0, 0), "waterfall");
        this.j = b39Var;
        this.k = g.h(null);
        this.l = new qx8(new qx8(wiVarG7, wiVarG3), wiVarG2);
        new qx8(new qx8(new qx8(wiVarG9, wiVarG4), wiVarG8), b39Var);
        this.m = js8.h(4, "captionBarIgnoringVisibility");
        this.n = js8.h(2, "navigationBarsIgnoringVisibility");
        this.o = js8.h(1, "statusBarsIgnoringVisibility");
        this.p = js8.h(519, "systemBarsIgnoringVisibility");
        this.q = js8.h(64, "tappableElementIgnoringVisibility");
        this.r = new b39(new wo3(0, 0, 0, 0), "imeAnimationTarget");
        this.s = new b39(new wo3(0, 0, 0, 0), "imeAnimationSource");
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        Object tag = view2 != null ? view2.getTag(ur6.consume_window_insets_tag) : null;
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        this.t = bool != null ? bool.booleanValue() : false;
        this.v = new so3(this);
        WeakHashMap weakHashMap = q69.a;
        lf9 lf9VarA = i69.a(view);
        if (lf9VarA != null) {
            if9 if9Var = lf9VarA.a;
            wiVarG.f(if9Var.q(4));
            wiVarG2.f(if9Var.q(128));
            wiVarG3.f(if9Var.q(8));
            wiVarG4.f(if9Var.q(32));
            wiVarG5.f(if9Var.q(2));
            wiVarG6.f(if9Var.q(1));
            wiVarG7.f(if9Var.q(519));
            wiVarG8.f(if9Var.q(16));
            wiVarG9.f(if9Var.q(64));
        }
    }

    public static void b(rf9 rf9Var, lf9 lf9Var) {
        boolean z = false;
        rf9Var.a.g(lf9Var, 0);
        rf9Var.c.g(lf9Var, 0);
        rf9Var.b.g(lf9Var, 0);
        rf9Var.e.g(lf9Var, 0);
        rf9Var.f.g(lf9Var, 0);
        rf9Var.g.g(lf9Var, 0);
        rf9Var.h.g(lf9Var, 0);
        rf9Var.i.g(lf9Var, 0);
        rf9Var.d.g(lf9Var, 0);
        rf9Var.m.f(za7.w(lf9Var.a.h(4)));
        rf9Var.n.f(za7.w(lf9Var.a.h(2)));
        rf9Var.o.f(za7.w(lf9Var.a.h(1)));
        rf9Var.p.f(za7.w(lf9Var.a.h(519)));
        rf9Var.q.f(za7.w(lf9Var.a.h(64)));
        vp1 vp1VarF = lf9Var.a.f();
        rf9Var.j.f(za7.w(vp1VarF != null ? vp1VarF.a() : no3.e));
        eh ehVar = null;
        if (vp1VarF != null) {
            Path pathI = Build.VERSION.SDK_INT >= 31 ? zc.i(vp1VarF.a) : null;
            if (pathI != null) {
                ehVar = new eh(pathI);
            }
        }
        ((s08) rf9Var.k).setValue(ehVar);
        synchronized (g08.c) {
            sb5 sb5Var = g08.j.h;
            if (sb5Var != null) {
                if (sb5Var.c()) {
                    z = true;
                }
            }
        }
        if (z) {
            g08.a();
        }
    }

    public final void a(View view) {
        if (this.u == 0) {
            WeakHashMap weakHashMap = q69.a;
            so3 so3Var = this.v;
            h69.m(view, so3Var);
            if (view.isAttachedToWindow()) {
                view.requestApplyInsets();
            }
            view.addOnAttachStateChangeListener(so3Var);
            q69.t(view, so3Var);
        }
        this.u++;
    }
}
