package androidx.paging;

import android.os.Build;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView$Adapter$StateRestorationPolicy;
import defpackage.a06;
import defpackage.aw0;
import defpackage.b06;
import defpackage.br9;
import defpackage.cw;
import defpackage.cx;
import defpackage.dp2;
import defpackage.g51;
import defpackage.g96;
import defpackage.iz5;
import defpackage.js3;
import defpackage.m80;
import defpackage.mq8;
import defpackage.oj3;
import defpackage.pa2;
import defpackage.pv6;
import defpackage.r79;
import defpackage.sg4;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import defpackage.xe2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public abstract class n extends androidx.recyclerview.widget.g {
    public boolean d;
    public final cx e;
    public final xe2 f;
    public final pv6 g;

    public n() {
        ug1 ug1Var = up1.a;
        kotlinx.coroutines.android.a aVar = sg4.a;
        ug1 ug1Var2 = up1.a;
        js3.p(aVar, "mainDispatcher");
        js3.p(ug1Var2, "workerDispatcher");
        ir.mservices.market.version2.ui.recycler.adapter.a aVar2 = (ir.mservices.market.version2.ui.recycler.adapter.a) this;
        cx cxVar = new cx(new r79(3, aVar2), aVar, ug1Var2);
        this.e = cxVar;
        super.v(RecyclerView$Adapter$StateRestorationPolicy.c);
        t(new m80(aVar2, 1));
        y(new b06(aVar2));
        this.f = cxVar.h;
        this.g = cxVar.i;
    }

    public static final void x(ir.mservices.market.version2.ui.recycler.adapter.a aVar) {
        if (aVar.c != RecyclerView$Adapter$StateRestorationPolicy.c || aVar.d) {
            return;
        }
        aVar.d = true;
        super.v(RecyclerView$Adapter$StateRestorationPolicy.a);
    }

    public final void A() {
        a aVar = this.e.f;
        aVar.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        aVar.c.k();
    }

    public final void B(dp2 dp2Var) {
        dp2 dp2Var2;
        cx cxVar = this.e;
        cxVar.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = cxVar.k;
        copyOnWriteArrayList.remove(dp2Var);
        if (!copyOnWriteArrayList.isEmpty() || (dp2Var2 = (dp2) cxVar.j.get()) == null) {
            return;
        }
        a aVar = cxVar.f;
        aVar.getClass();
        pa2 pa2Var = aVar.e;
        pa2Var.getClass();
        ((CopyOnWriteArrayList) ((cw) pa2Var.c).b).remove(dp2Var2);
    }

    public final void C() {
        a aVar = this.e.f;
        aVar.getClass();
        if (Build.ID != null) {
            Log.isLoggable("Paging", 3);
        }
        aVar.c.a();
    }

    public final oj3 D() {
        cx cxVar = this.e;
        g96 g96Var = (g96) cxVar.e.get();
        if (g96Var == null) {
            iz5 iz5Var = cxVar.f.d;
            int i = iz5Var.c;
            int i2 = iz5Var.d;
            ArrayList arrayList = iz5Var.a;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                kotlin.collections.a.b0(((mq8) it.next()).b, arrayList2);
            }
            return new oj3(arrayList2, i, i2);
        }
        iz5 iz5Var2 = (iz5) g96Var;
        int i3 = iz5Var2.b - 1;
        ArrayList arrayList3 = new ArrayList();
        if (i3 >= 0) {
            int i4 = 0;
            while (true) {
                arrayList3.add(iz5Var2.b(i4));
                if (i4 == i3) {
                    break;
                }
                i4++;
            }
        }
        return new oj3(arrayList3, iz5Var2.c, iz5Var2.d);
    }

    public final Object E(a06 a06Var, g51 g51Var) {
        cx cxVar = this.e;
        cxVar.g.incrementAndGet();
        a aVar = cxVar.f;
        Object objA = aVar.g.a(g51Var, new PagingDataPresenter$collectFrom$2(aVar, a06Var, null));
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        tx8 tx8Var = tx8.a;
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        if (objA != coroutineSingletons) {
            objA = tx8Var;
        }
        return objA == coroutineSingletons ? objA : tx8Var;
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        cx cxVar = this.e;
        g96 g96Var = (g96) cxVar.e.get();
        return g96Var != null ? ((iz5) g96Var).d() : cxVar.f.d.d();
    }

    @Override // androidx.recyclerview.widget.g
    public final long d(int i) {
        return -1L;
    }

    @Override // androidx.recyclerview.widget.g
    public final void v(RecyclerView$Adapter$StateRestorationPolicy recyclerView$Adapter$StateRestorationPolicy) {
        this.d = true;
        super.v(recyclerView$Adapter$StateRestorationPolicy);
    }

    public final void y(dp2 dp2Var) {
        cx cxVar = this.e;
        cxVar.getClass();
        AtomicReference atomicReference = cxVar.j;
        if (atomicReference.get() == null) {
            defpackage.n nVar = cxVar.l;
            js3.p(nVar, "listener");
            atomicReference.set(nVar);
            a aVar = cxVar.f;
            aVar.getClass();
            pa2 pa2Var = aVar.e;
            pa2Var.getClass();
            ((CopyOnWriteArrayList) ((cw) pa2Var.c).b).add(nVar);
            aw0 aw0Var = (aw0) ((kotlinx.coroutines.flow.l) pa2Var.b).getValue();
            if (aw0Var != null) {
                nVar.invoke(aw0Var);
            }
        }
        cxVar.k.add(dp2Var);
    }

    public final Object z(int i) {
        Object value;
        Object value2;
        Object value3;
        cx cxVar = this.e;
        kotlinx.coroutines.flow.l lVar = cxVar.c;
        do {
            try {
                value2 = lVar.getValue();
                ((Boolean) value2).getClass();
            } catch (Throwable th) {
                do {
                    value = lVar.getValue();
                    ((Boolean) value).getClass();
                } while (!lVar.n(value, Boolean.FALSE));
                throw th;
            }
        } while (!lVar.n(value2, Boolean.TRUE));
        cxVar.d = i;
        g96 g96Var = (g96) cxVar.e.get();
        Object objM = g96Var != null ? br9.m(g96Var, i) : cxVar.f.b(i);
        do {
            value3 = lVar.getValue();
            ((Boolean) value3).getClass();
        } while (!lVar.n(value3, Boolean.FALSE));
        return objM;
    }
}
