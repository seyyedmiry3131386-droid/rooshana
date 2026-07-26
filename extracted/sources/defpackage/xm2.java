package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$SavedState;
import androidx.fragment.app.d;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;
import androidx.viewpager2.widget.ViewPager2;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class xm2 extends g {
    public final i64 d;
    public final androidx.fragment.app.g e;
    public final ue4 f;
    public final ue4 g;
    public final ue4 h;
    public wm2 i;
    public final i50 j;
    public boolean k;
    public boolean l;

    public xm2(d dVar) {
        androidx.fragment.app.g gVarG = dVar.G();
        i64 i64Var = dVar.U;
        Object obj = null;
        this.f = new ue4(obj);
        this.g = new ue4(obj);
        this.h = new ue4(obj);
        i50 i50Var = new i50();
        i50Var.a = new CopyOnWriteArrayList();
        this.j = i50Var;
        this.k = false;
        this.l = false;
        this.e = gVarG;
        this.d = i64Var;
        u(true);
    }

    public static void x(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    public final void A() {
        ue4 ue4Var;
        ue4 ue4Var2;
        d dVar;
        View view;
        if (!this.l || this.e.S()) {
            return;
        }
        zv zvVar = new zv(0);
        int i = 0;
        while (true) {
            ue4Var = this.f;
            int iK = ue4Var.k();
            ue4Var2 = this.h;
            if (i >= iK) {
                break;
            }
            long jH = ue4Var.h(i);
            if (!y(jH)) {
                zvVar.add(Long.valueOf(jH));
                ue4Var2.j(jH);
            }
            i++;
        }
        if (!this.k) {
            this.l = false;
            for (int i2 = 0; i2 < ue4Var.k(); i2++) {
                long jH2 = ue4Var.h(i2);
                if (ue4Var2.f(jH2) < 0 && ((dVar = (d) ue4Var.d(jH2)) == null || (view = dVar.J) == null || view.getParent() == null)) {
                    zvVar.add(Long.valueOf(jH2));
                }
            }
        }
        sv svVar = new sv(zvVar);
        while (svVar.hasNext()) {
            D(((Long) svVar.next()).longValue());
        }
    }

    public final Long B(int i) {
        Long lValueOf = null;
        int i2 = 0;
        while (true) {
            ue4 ue4Var = this.h;
            if (i2 >= ue4Var.k()) {
                return lValueOf;
            }
            if (((Integer) ue4Var.l(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(ue4Var.h(i2));
            }
            i2++;
        }
    }

    public final void C(yn2 yn2Var) {
        d dVar = (d) this.f.d(yn2Var.e);
        if (dVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayout = (FrameLayout) yn2Var.a;
        View view = dVar.J;
        if (!dVar.Q() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        boolean zQ = dVar.Q();
        androidx.fragment.app.g gVar = this.e;
        if (zQ && view == null) {
            vm2 vm2Var = new vm2(this, dVar, frameLayout);
            hh2 hh2Var = gVar.p;
            hh2Var.getClass();
            ((CopyOnWriteArrayList) hh2Var.c).add(new ll2(vm2Var, false));
            return;
        }
        if (dVar.Q() && view.getParent() != null) {
            if (view.getParent() != frameLayout) {
                x(view, frameLayout);
                return;
            }
            return;
        }
        if (dVar.Q()) {
            x(view, frameLayout);
            return;
        }
        if (gVar.S()) {
            if (gVar.K) {
                return;
            }
            this.d.a(new vf1(this, yn2Var));
            return;
        }
        vm2 vm2Var2 = new vm2(this, dVar, frameLayout);
        hh2 hh2Var2 = gVar.p;
        hh2Var2.getClass();
        ((CopyOnWriteArrayList) hh2Var2.c).add(new ll2(vm2Var2, false));
        i50 i50Var = this.j;
        i50Var.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = i50Var.a.iterator();
        if (it.hasNext()) {
            throw bl4.o(it);
        }
        try {
            dVar.v0(false);
            p40 p40Var = new p40(gVar);
            p40Var.h(0, dVar, ByteArrayResult.AppInfo.IS_SPLIT_SERIALISED_NAME + yn2Var.e, 1);
            p40Var.l(dVar, Lifecycle$State.d);
            p40Var.g();
            this.i.e(false);
        } finally {
            i50.a(arrayList);
        }
    }

    public final void D(long j) {
        ViewParent parent;
        ue4 ue4Var = this.f;
        d dVar = (d) ue4Var.d(j);
        if (dVar == null) {
            return;
        }
        View view = dVar.J;
        if (view != null && (parent = view.getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        boolean zY = y(j);
        ue4 ue4Var2 = this.g;
        if (!zY) {
            ue4Var2.j(j);
        }
        if (!dVar.Q()) {
            ue4Var.j(j);
            return;
        }
        androidx.fragment.app.g gVar = this.e;
        if (gVar.S()) {
            this.l = true;
            return;
        }
        boolean zQ = dVar.Q();
        i50 i50Var = this.j;
        if (zQ && y(j)) {
            i50Var.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = i50Var.a.iterator();
            if (it.hasNext()) {
                throw bl4.o(it);
            }
            Fragment$SavedState fragment$SavedStateD0 = gVar.d0(dVar);
            i50.a(arrayList);
            ue4Var2.i(j, fragment$SavedStateD0);
        }
        i50Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = i50Var.a.iterator();
        if (it2.hasNext()) {
            throw bl4.o(it2);
        }
        try {
            p40 p40Var = new p40(gVar);
            p40Var.j(dVar);
            p40Var.g();
            ue4Var.j(j);
        } finally {
            i50.a(arrayList2);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final long d(int i) {
        return i;
    }

    @Override // androidx.recyclerview.widget.g
    public final void k(RecyclerView recyclerView) {
        if (this.i != null) {
            throw new IllegalArgumentException();
        }
        wm2 wm2Var = new wm2(this);
        this.i = wm2Var;
        ViewPager2 viewPager2C = wm2.c(recyclerView);
        wm2Var.e = viewPager2C;
        zz0 zz0Var = new zz0(1, wm2Var);
        wm2Var.b = zz0Var;
        ((ArrayList) viewPager2C.c.b).add(zz0Var);
        kr0 kr0Var = new kr0(1, wm2Var);
        wm2Var.c = kr0Var;
        t(kr0Var);
        ry6 ry6Var = new ry6(5, wm2Var);
        wm2Var.d = ry6Var;
        this.d.a(ry6Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(o oVar, int i) {
        Bundle bundle;
        yn2 yn2Var = (yn2) oVar;
        long j = yn2Var.e;
        FrameLayout frameLayout = (FrameLayout) yn2Var.a;
        int id = frameLayout.getId();
        Long lB = B(id);
        ue4 ue4Var = this.h;
        if (lB != null && lB.longValue() != j) {
            D(lB.longValue());
            ue4Var.j(lB.longValue());
        }
        ue4Var.i(j, Integer.valueOf(id));
        long j2 = i;
        ue4 ue4Var2 = this.f;
        if (ue4Var2.f(j2) < 0) {
            d dVarZ = z(i);
            Fragment$SavedState fragment$SavedState = (Fragment$SavedState) this.g.d(j2);
            if (dVarZ.v != null) {
                throw new IllegalStateException("Fragment already added");
            }
            if (fragment$SavedState == null || (bundle = fragment$SavedState.a) == null) {
                bundle = null;
            }
            dVarZ.b = bundle;
            ue4Var2.i(j2, dVarZ);
        }
        WeakHashMap weakHashMap = q69.a;
        if (frameLayout.isAttachedToWindow()) {
            C(yn2Var);
        }
        A();
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        int i2 = yn2.u;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        WeakHashMap weakHashMap = q69.a;
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new yn2(frameLayout);
    }

    @Override // androidx.recyclerview.widget.g
    public final void o(RecyclerView recyclerView) {
        wm2 wm2Var = this.i;
        wm2Var.getClass();
        ViewPager2 viewPager2C = wm2.c(recyclerView);
        ((ArrayList) viewPager2C.c.b).remove((zz0) wm2Var.b);
        xm2 xm2Var = (xm2) wm2Var.f;
        xm2Var.w((kr0) wm2Var.c);
        xm2Var.d.f((ry6) wm2Var.d);
        wm2Var.e = null;
        this.i = null;
    }

    @Override // androidx.recyclerview.widget.g
    public final /* bridge */ /* synthetic */ boolean p(o oVar) {
        return true;
    }

    @Override // androidx.recyclerview.widget.g
    public final void q(o oVar) {
        C((yn2) oVar);
        A();
    }

    @Override // androidx.recyclerview.widget.g
    public final void s(o oVar) {
        Long lB = B(((FrameLayout) ((yn2) oVar).a).getId());
        if (lB != null) {
            D(lB.longValue());
            this.h.j(lB.longValue());
        }
    }

    public final boolean y(long j) {
        return j >= 0 && j < ((long) c());
    }

    public abstract d z(int i);
}
