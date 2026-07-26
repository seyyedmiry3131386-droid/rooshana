package defpackage;

import android.os.Build;
import android.view.View;
import androidx.compose.runtime.g;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ro3 extends mu0 implements Runnable, ms5, View.OnAttachStateChangeListener {
    public boolean c;
    public int d;
    public lf9 e;
    public final rb5 f;
    public final n08 g;
    public final mb5 h;
    public final SnapshotStateList i;

    public ro3() {
        super(1);
        rb5 rb5Var = new rb5(9);
        uf9.a.getClass();
        rb5Var.m(tf9.b, new gg9("caption bar"));
        rb5Var.m(tf9.c, new gg9("display cutout"));
        rb5Var.m(tf9.d, new gg9("ime"));
        rb5Var.m(tf9.e, new gg9("mandatory system gestures"));
        rb5Var.m(tf9.f, new gg9("navigation bars"));
        rb5Var.m(tf9.g, new gg9("status bars"));
        rb5Var.m(tf9.h, new gg9("system gestures"));
        rb5Var.m(tf9.i, new gg9("tappable element"));
        rb5Var.m(tf9.j, new gg9("waterfall"));
        this.f = rb5Var;
        this.g = g.e(0);
        this.h = new mb5(4);
        this.i = new SnapshotStateList();
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x025d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void H(defpackage.lf9 r28) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ro3.H(lf9):void");
    }

    @Override // defpackage.mu0
    public final void g(ue9 ue9Var) {
        boolean z = false;
        this.c = false;
        int iD = ue9Var.a.d();
        this.d &= ~iD;
        this.e = null;
        uf9 uf9Var = (uf9) wf9.a.b(iD);
        if (uf9Var != null) {
            Object objG = this.f.g(uf9Var);
            js3.m(objG);
            gg9 gg9Var = (gg9) objG;
            gg9Var.c.i(0.0f);
            gg9Var.e.i(1.0f);
            gg9Var.d.i(0L);
            gg9Var.c.i(0.0f);
            ((s08) gg9Var.b).setValue(Boolean.FALSE);
            gg9Var.j = -1L;
            gg9Var.k = -1L;
            n08 n08Var = this.g;
            n08Var.i(n08Var.h() + 1);
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
    }

    @Override // defpackage.mu0
    public final void h(ue9 ue9Var) {
        this.c = true;
    }

    @Override // defpackage.mu0
    public final lf9 i(lf9 lf9Var, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ue9 ue9Var = (ue9) list.get(i);
            uf9 uf9Var = (uf9) wf9.a.b(ue9Var.a.d());
            if (uf9Var != null) {
                Object objG = this.f.g(uf9Var);
                js3.m(objG);
                gg9 gg9Var = (gg9) objG;
                if (((Boolean) ((s08) gg9Var.b).getValue()).booleanValue()) {
                    te9 te9Var = ue9Var.a;
                    gg9Var.c.i(te9Var.c());
                    gg9Var.e.i(te9Var.a());
                    gg9Var.d.i(te9Var.b());
                }
            }
        }
        H(lf9Var);
        return lf9Var;
    }

    @Override // defpackage.mu0
    public final rn6 j(ue9 ue9Var, rn6 rn6Var) {
        lf9 lf9Var = this.e;
        boolean z = false;
        this.c = false;
        this.e = null;
        if (ue9Var.a.b() > 0 && lf9Var != null) {
            int iD = ue9Var.a.d();
            this.d |= iD;
            uf9 uf9Var = (uf9) wf9.a.b(iD);
            if (uf9Var != null) {
                Object objG = this.f.g(uf9Var);
                js3.m(objG);
                gg9 gg9Var = (gg9) objG;
                no3 no3VarG = lf9Var.a.g(iD);
                long j = (((long) no3VarG.a) << 48) | (((long) no3VarG.b) << 32) | (((long) no3VarG.c) << 16) | ((long) no3VarG.d);
                long j2 = gg9Var.h;
                if (!c77.d(j, j2)) {
                    gg9Var.j = j2;
                    gg9Var.k = j;
                    ((s08) gg9Var.b).setValue(Boolean.TRUE);
                    te9 te9Var = ue9Var.a;
                    gg9Var.c.i(te9Var.c());
                    gg9Var.e.i(te9Var.a());
                    gg9Var.d.i(te9Var.b());
                    n08 n08Var = this.g;
                    n08Var.i(n08Var.h() + 1);
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
                        return rn6Var;
                    }
                }
            }
        }
        return rn6Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = q69.a;
        h69.m(view, this);
        q69.t(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = q69.a;
        h69.m(view, null);
        q69.t(view, null);
    }

    @Override // defpackage.ms5
    public final lf9 q(View view, lf9 lf9Var) {
        if (this.c) {
            this.e = lf9Var;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return lf9Var;
            }
        } else if (this.d == 0) {
            H(lf9Var);
        }
        return lf9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.c) {
            this.d = 0;
            this.c = false;
            lf9 lf9Var = this.e;
            if (lf9Var != null) {
                H(lf9Var);
                this.e = null;
            }
        }
    }
}
