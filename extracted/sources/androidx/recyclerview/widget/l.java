package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.view.View;
import defpackage.f07;
import defpackage.gw1;
import defpackage.h3;
import defpackage.o40;
import defpackage.q69;
import defpackage.qz6;
import defpackage.rm7;
import defpackage.sr0;
import defpackage.vz6;
import defpackage.wz6;
import defpackage.zh6;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l {
    public final ArrayList a;
    public ArrayList b;
    public final ArrayList c;
    public final List d;
    public int e;
    public int f;
    public wz6 g;
    public final /* synthetic */ RecyclerView h;

    public l(RecyclerView recyclerView) {
        this.h = recyclerView;
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.b = null;
        this.c = new ArrayList();
        this.d = DesugarCollections.unmodifiableList(arrayList);
        this.e = 2;
        this.f = 2;
    }

    public final void a(o oVar, boolean z) {
        RecyclerView.l(oVar);
        View view = oVar.a;
        RecyclerView recyclerView = this.h;
        f07 f07Var = recyclerView.L0;
        if (f07Var != null) {
            gw1 gw1Var = f07Var.e;
            q69.q(view, gw1Var != null ? (h3) ((WeakHashMap) gw1Var.f).remove(view) : null);
        }
        if (z) {
            ArrayList arrayList = recyclerView.o;
            if (arrayList.size() > 0) {
                throw rm7.l(0, arrayList);
            }
            g gVar = recyclerView.m;
            if (gVar != null) {
                gVar.s(oVar);
            }
            if (recyclerView.E0 != null) {
                recyclerView.g.z(oVar);
            }
            if (RecyclerView.a1) {
                Objects.toString(oVar);
            }
        }
        oVar.s = null;
        oVar.r = null;
        wz6 wz6VarC = c();
        wz6VarC.getClass();
        int i = oVar.f;
        ArrayList arrayList2 = wz6VarC.b(i).a;
        if (((vz6) wz6VarC.a.get(i)).b <= arrayList2.size()) {
            zh6.a(view);
        } else {
            if (RecyclerView.Z0 && arrayList2.contains(oVar)) {
                throw new IllegalArgumentException("this scrap item already exists");
            }
            oVar.n();
            arrayList2.add(oVar);
        }
    }

    public final int b(int i) {
        RecyclerView recyclerView = this.h;
        if (i >= 0 && i < recyclerView.E0.b()) {
            return !recyclerView.E0.g ? i : recyclerView.e.i(i, 0);
        }
        StringBuilder sbR = rm7.r(i, "invalid position ", ". State item count is ");
        sbR.append(recyclerView.E0.b());
        sbR.append(recyclerView.C());
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public final wz6 c() {
        if (this.g == null) {
            this.g = new wz6();
            e();
        }
        return this.g;
    }

    public final View d(int i) {
        return l(i, Long.MAX_VALUE).a;
    }

    public final void e() {
        RecyclerView recyclerView;
        g gVar;
        wz6 wz6Var = this.g;
        if (wz6Var == null || (gVar = (recyclerView = this.h).m) == null || !recyclerView.s) {
            return;
        }
        wz6Var.c.add(gVar);
    }

    public final void f(g gVar, boolean z) {
        wz6 wz6Var = this.g;
        if (wz6Var != null) {
            SparseArray sparseArray = wz6Var.a;
            Set set = wz6Var.c;
            set.remove(gVar);
            if (set.size() != 0 || z) {
                return;
            }
            for (int i = 0; i < sparseArray.size(); i++) {
                ArrayList arrayList = ((vz6) sparseArray.get(sparseArray.keyAt(i))).a;
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    zh6.a(((o) arrayList.get(i2)).a);
                }
            }
        }
    }

    public final void g() {
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h(size);
        }
        arrayList.clear();
        if (RecyclerView.e1) {
            sr0 sr0Var = this.h.D0;
            int[] iArr = sr0Var.c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            sr0Var.d = 0;
        }
    }

    public final void h(int i) {
        boolean z = RecyclerView.Z0;
        ArrayList arrayList = this.c;
        o oVar = (o) arrayList.get(i);
        if (RecyclerView.a1) {
            Objects.toString(oVar);
        }
        a(oVar, true);
        arrayList.remove(i);
    }

    public final void i(View view) {
        o oVarO = RecyclerView.O(view);
        boolean zK = oVarO.k();
        RecyclerView recyclerView = this.h;
        if (zK) {
            recyclerView.removeDetachedView(view, false);
        }
        if (oVarO.j()) {
            oVarO.n.m(oVarO);
        } else if (oVarO.q()) {
            oVarO.j &= -33;
        }
        j(oVarO);
        if (recyclerView.M == null || oVarO.h()) {
            return;
        }
        recyclerView.M.e(oVarO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ca, code lost:
    
        r6 = r6 - 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(androidx.recyclerview.widget.o r13) {
        /*
            Method dump skipped, instruction units count: 327
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.j(androidx.recyclerview.widget.o):void");
    }

    public final void k(View view) {
        qz6 qz6Var;
        o oVarO = RecyclerView.O(view);
        int i = oVarO.j & 12;
        RecyclerView recyclerView = this.h;
        if (i == 0 && oVarO.l() && (qz6Var = recyclerView.M) != null && !qz6Var.b(oVarO, oVarO.d())) {
            if (this.b == null) {
                this.b = new ArrayList();
            }
            oVarO.n = this;
            oVarO.o = true;
            this.b.add(oVarO);
            return;
        }
        if (oVarO.g() && !oVarO.i() && !recyclerView.m.b) {
            throw new IllegalArgumentException(o40.w(recyclerView, new StringBuilder("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
        }
        oVarO.n = this;
        oVarO.o = false;
        this.a.add(oVarO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x0549  */
    /* JADX WARN: Removed duplicated region for block: B:328:0x0560 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v69 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final androidx.recyclerview.widget.o l(int r29, long r30) {
        /*
            Method dump skipped, instruction units count: 1416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.l.l(int, long):androidx.recyclerview.widget.o");
    }

    public final void m(o oVar) {
        if (oVar.o) {
            this.b.remove(oVar);
        } else {
            this.a.remove(oVar);
        }
        oVar.n = null;
        oVar.o = false;
        oVar.j &= -33;
    }

    public final void n() {
        k kVar = this.h.n;
        this.f = this.e + (kVar != null ? kVar.j : 0);
        ArrayList arrayList = this.c;
        for (int size = arrayList.size() - 1; size >= 0 && arrayList.size() > this.f; size--) {
            h(size);
        }
    }
}
