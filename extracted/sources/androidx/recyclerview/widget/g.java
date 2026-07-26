package androidx.recyclerview.widget;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.lz6;
import defpackage.mz6;
import defpackage.uo8;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public final lz6 a = new lz6();
    public boolean b = false;
    public RecyclerView$Adapter$StateRestorationPolicy c = RecyclerView$Adapter$StateRestorationPolicy.a;

    public final void a(o oVar, int i) {
        g gVar = oVar.s;
        View view = oVar.a;
        boolean z = gVar == null;
        if (z) {
            oVar.c = i;
            if (this.b) {
                oVar.e = d(i);
            }
            oVar.j = (oVar.j & (-520)) | 1;
            if (uo8.a()) {
                Trace.beginSection(String.format("RV onBindViewHolder type=0x%X", Integer.valueOf(oVar.f)));
            }
        }
        oVar.s = this;
        if (RecyclerView.Z0) {
            if (view.getParent() == null && view.isAttachedToWindow() != oVar.k()) {
                throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + oVar.k() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + oVar);
            }
            if (view.getParent() == null && view.isAttachedToWindow()) {
                throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + oVar);
            }
        }
        m(oVar, i, oVar.d());
        if (z) {
            ArrayList arrayList = oVar.k;
            if (arrayList != null) {
                arrayList.clear();
            }
            oVar.j &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                ((RecyclerView.LayoutParams) layoutParams).c = true;
            }
            Trace.endSection();
        }
    }

    public int b(g gVar, o oVar, int i) {
        if (gVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int c();

    public long d(int i) {
        return -1L;
    }

    public int e(int i) {
        return 0;
    }

    public final void f() {
        this.a.b();
    }

    public final void g(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void h(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void i(int i, int i2) {
        this.a.e(i, i2);
    }

    public final void j(int i, int i2) {
        this.a.f(i, i2);
    }

    public void k(RecyclerView recyclerView) {
    }

    public abstract void l(o oVar, int i);

    public void m(o oVar, int i, List list) {
        l(oVar, i);
    }

    public abstract o n(ViewGroup viewGroup, int i);

    public void o(RecyclerView recyclerView) {
    }

    public boolean p(o oVar) {
        return false;
    }

    public void q(o oVar) {
    }

    public void r(o oVar) {
    }

    public void s(o oVar) {
    }

    public final void t(mz6 mz6Var) {
        this.a.registerObserver(mz6Var);
    }

    public final void u(boolean z) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public void v(RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy) {
        this.c = recyclerView$Adapter$StateRestorationPolicy;
        this.a.g();
    }

    public final void w(mz6 mz6Var) {
        this.a.unregisterObserver(mz6Var);
    }
}
