package defpackage;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ConcatAdapter$Config$StableIdMode;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.g;
import androidx.recyclerview.widget.o;
import j$.util.DesugarCollections;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u01 extends g {
    public final bl0 d;

    public u01(g... gVarArr) {
        List<g> listAsList = Arrays.asList(gVarArr);
        this.d = new bl0(this);
        for (g gVar : listAsList) {
            bl0 bl0Var = this.d;
            bl0Var.a(((ArrayList) bl0Var.e).size(), gVar);
        }
        u(((ConcatAdapter$Config$StableIdMode) this.d.g) != ConcatAdapter$Config$StableIdMode.a);
    }

    @Override // androidx.recyclerview.widget.g
    public final int b(g gVar, o oVar, int i) {
        bl0 bl0Var = this.d;
        cm5 cm5Var = (cm5) ((IdentityHashMap) bl0Var.d).get(oVar);
        if (cm5Var == null) {
            return -1;
        }
        g gVar2 = cm5Var.c;
        int iC = i - bl0Var.c(cm5Var);
        int iC2 = gVar2.c();
        if (iC >= 0 && iC < iC2) {
            return gVar2.b(gVar, oVar, iC);
        }
        StringBuilder sbB = bl4.B(iC, iC2, "Detected inconsistent adapter updates. The local position of the view holder maps to ", " which is out of bounds for the adapter with size ", ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        sbB.append(oVar);
        sbB.append("adapter:");
        sbB.append(gVar);
        throw new IllegalStateException(sbB.toString());
    }

    @Override // androidx.recyclerview.widget.g
    public final int c() {
        Iterator it = ((ArrayList) this.d.e).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((cm5) it.next()).e;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.g
    public final long d(int i) {
        bl0 bl0Var = this.d;
        h hVarD = bl0Var.d(i);
        cm5 cm5Var = (cm5) hVarD.c;
        cm5Var.c.d(hVarD.a);
        cm5Var.b.getClass();
        hVarD.b = false;
        hVarD.c = null;
        hVarD.a = -1;
        bl0Var.f = hVarD;
        return -1L;
    }

    @Override // androidx.recyclerview.widget.g
    public final int e(int i) {
        int iValueAt;
        bl0 bl0Var = this.d;
        h hVarD = bl0Var.d(i);
        cm5 cm5Var = (cm5) hVarD.c;
        int i2 = hVarD.a;
        o77 o77Var = cm5Var.a;
        int iE = cm5Var.c.e(i2);
        SparseIntArray sparseIntArray = (SparseIntArray) o77Var.a;
        int iIndexOfKey = sparseIntArray.indexOfKey(iE);
        if (iIndexOfKey > -1) {
            iValueAt = sparseIntArray.valueAt(iIndexOfKey);
        } else {
            j58 j58Var = (j58) o77Var.d;
            cm5 cm5Var2 = (cm5) o77Var.c;
            int i3 = j58Var.b;
            j58Var.b = i3 + 1;
            j58Var.a.put(i3, cm5Var2);
            sparseIntArray.put(iE, i3);
            ((SparseIntArray) o77Var.b).put(i3, iE);
            iValueAt = i3;
        }
        hVarD.b = false;
        hVarD.c = null;
        hVarD.a = -1;
        bl0Var.f = hVarD;
        return iValueAt;
    }

    @Override // androidx.recyclerview.widget.g
    public final void k(RecyclerView recyclerView) {
        bl0 bl0Var = this.d;
        ArrayList arrayList = (ArrayList) bl0Var.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((WeakReference) it.next()).get() == recyclerView) {
                return;
            }
        }
        arrayList.add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) bl0Var.e).iterator();
        while (it2.hasNext()) {
            ((cm5) it2.next()).c.k(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final void l(o oVar, int i) {
        bl0 bl0Var = this.d;
        h hVarD = bl0Var.d(i);
        ((IdentityHashMap) bl0Var.d).put(oVar, (cm5) hVarD.c);
        cm5 cm5Var = (cm5) hVarD.c;
        cm5Var.c.a(oVar, hVarD.a);
        hVarD.b = false;
        hVarD.c = null;
        hVarD.a = -1;
        bl0Var.f = hVarD;
    }

    @Override // androidx.recyclerview.widget.g
    public final o n(ViewGroup viewGroup, int i) {
        cm5 cm5Var = (cm5) ((j58) this.d.b).a.get(i);
        if (cm5Var == null) {
            throw new IllegalArgumentException(rm7.n(i, "Cannot find the wrapper for global view type "));
        }
        o77 o77Var = cm5Var.a;
        SparseIntArray sparseIntArray = (SparseIntArray) o77Var.b;
        int iIndexOfKey = sparseIntArray.indexOfKey(i);
        if (iIndexOfKey >= 0) {
            return cm5Var.c.n(viewGroup, sparseIntArray.valueAt(iIndexOfKey));
        }
        StringBuilder sbR = rm7.r(i, "requested global type ", " does not belong to the adapter:");
        sbR.append(((cm5) o77Var.c).c);
        throw new IllegalStateException(sbR.toString());
    }

    @Override // androidx.recyclerview.widget.g
    public final void o(RecyclerView recyclerView) {
        bl0 bl0Var = this.d;
        ArrayList arrayList = (ArrayList) bl0Var.c;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference weakReference = (WeakReference) arrayList.get(size);
            if (weakReference.get() == null) {
                arrayList.remove(size);
            } else if (weakReference.get() == recyclerView) {
                arrayList.remove(size);
                break;
            }
            size--;
        }
        Iterator it = ((ArrayList) bl0Var.e).iterator();
        while (it.hasNext()) {
            ((cm5) it.next()).c.o(recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.g
    public final boolean p(o oVar) {
        bl0 bl0Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) bl0Var.d;
        cm5 cm5Var = (cm5) identityHashMap.get(oVar);
        if (cm5Var != null) {
            boolean zP = cm5Var.c.p(oVar);
            identityHashMap.remove(oVar);
            return zP;
        }
        throw new IllegalStateException("Cannot find wrapper for " + oVar + ", seems like it is not bound by this adapter: " + bl0Var);
    }

    @Override // androidx.recyclerview.widget.g
    public final void q(o oVar) {
        this.d.e(oVar).c.q(oVar);
    }

    @Override // androidx.recyclerview.widget.g
    public final void r(o oVar) {
        this.d.e(oVar).c.r(oVar);
    }

    @Override // androidx.recyclerview.widget.g
    public final void s(o oVar) {
        bl0 bl0Var = this.d;
        IdentityHashMap identityHashMap = (IdentityHashMap) bl0Var.d;
        cm5 cm5Var = (cm5) identityHashMap.get(oVar);
        if (cm5Var != null) {
            cm5Var.c.s(oVar);
            identityHashMap.remove(oVar);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + oVar + ", seems like it is not bound by this adapter: " + bl0Var);
        }
    }

    public final List x() {
        List list;
        ArrayList arrayList = (ArrayList) this.d.e;
        if (arrayList.isEmpty()) {
            list = Collections.EMPTY_LIST;
        } else {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((cm5) it.next()).c);
            }
            list = arrayList2;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public final void y(rj7 rj7Var) {
        bl0 bl0Var = this.d;
        ArrayList arrayList = (ArrayList) bl0Var.e;
        int iF = bl0Var.f(rj7Var);
        if (iF == -1) {
            return;
        }
        cm5 cm5Var = (cm5) arrayList.get(iF);
        int iC = bl0Var.c(cm5Var);
        arrayList.remove(iF);
        ((u01) bl0Var.a).j(iC, cm5Var.e);
        Iterator it = ((ArrayList) bl0Var.c).iterator();
        while (it.hasNext()) {
            if (((RecyclerView) ((WeakReference) it.next()).get()) != null) {
                rj7Var.getClass();
            }
        }
        cm5Var.c.w(cm5Var.f);
        o77 o77Var = cm5Var.a;
        j58 j58Var = (j58) o77Var.d;
        cm5 cm5Var2 = (cm5) o77Var.c;
        SparseArray sparseArray = j58Var.a;
        for (int size = sparseArray.size() - 1; size >= 0; size--) {
            if (((cm5) sparseArray.valueAt(size)) == cm5Var2) {
                sparseArray.removeAt(size);
            }
        }
        bl0Var.b();
    }
}
