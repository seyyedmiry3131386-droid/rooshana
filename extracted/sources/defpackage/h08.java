package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class h08 implements Set, kx3 {
    public final y08 a;
    public final /* synthetic */ int b;

    public h08(y08 y08Var, int i) {
        this.b = i;
        this.a = y08Var;
    }

    private final boolean a(Collection collection) {
        f66 f66Var;
        int i;
        c08 c08VarJ;
        boolean zB;
        Collection<Map.Entry> collection2 = collection;
        int iL = b.L(wu0.V(collection2, 10));
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (Map.Entry entry : collection2) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        y08 y08Var = this.a;
        boolean z = false;
        do {
            synchronized (gu9.c) {
                x08 x08Var = y08Var.a;
                js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x08 x08Var2 = (x08) g08.h(x08Var);
                f66Var = x08Var2.c;
                i = x08Var2.d;
            }
            js3.m(f66Var);
            d66 d66VarBuilder = f66Var.builder();
            Iterator it = y08Var.b.iterator();
            while (((d58) it).hasNext()) {
                Map.Entry entry2 = (Map.Entry) ((d58) it).next();
                if (!linkedHashMap.containsKey(entry2.getKey()) || !js3.i(linkedHashMap.get(entry2.getKey()), entry2.getValue())) {
                    d66VarBuilder.remove(entry2.getKey());
                    z = true;
                }
            }
            f66 f66VarBuild = d66VarBuilder.build();
            if (js3.i(f66VarBuild, f66Var)) {
                break;
            }
            x08 x08Var3 = y08Var.a;
            js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zB = y08.b(y08Var, (x08) g08.x(x08Var3, y08Var, c08VarJ), i, f66VarBuild);
            }
            g08.o(c08VarJ, y08Var);
        } while (!zB);
        return z;
    }

    private final boolean c(Collection collection) {
        f66 f66Var;
        int i;
        c08 c08VarJ;
        boolean zB;
        Set setT0 = a.T0(collection);
        y08 y08Var = this.a;
        boolean z = false;
        do {
            synchronized (gu9.c) {
                x08 x08Var = y08Var.a;
                js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x08 x08Var2 = (x08) g08.h(x08Var);
                f66Var = x08Var2.c;
                i = x08Var2.d;
            }
            js3.m(f66Var);
            d66 d66VarBuilder = f66Var.builder();
            Iterator it = y08Var.b.iterator();
            while (((d58) it).hasNext()) {
                Map.Entry entry = (Map.Entry) ((d58) it).next();
                if (!setT0.contains(entry.getKey())) {
                    d66VarBuilder.remove(entry.getKey());
                    z = true;
                }
            }
            f66 f66VarBuild = d66VarBuilder.build();
            if (js3.i(f66VarBuild, f66Var)) {
                break;
            }
            x08 x08Var3 = y08Var.a;
            js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zB = y08.b(y08Var, (x08) g08.x(x08Var3, y08Var, c08VarJ), i, f66VarBuild);
            }
            g08.o(c08VarJ, y08Var);
        } while (!zB);
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.b) {
            case 0:
                gu9.G();
                throw null;
            case 1:
                gu9.G();
                throw null;
            default:
                gu9.G();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.b) {
            case 0:
                gu9.G();
                throw null;
            case 1:
                gu9.G();
                throw null;
            default:
                gu9.G();
                throw null;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.b) {
            case 0:
                if (!(obj instanceof Map.Entry) || ((obj instanceof dx3) && !(obj instanceof fx3))) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return js3.i(this.a.get(entry.getKey()), entry.getValue());
            case 1:
                return this.a.containsKey(obj);
            default:
                return this.a.containsValue(obj);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.b) {
            case 0:
                Collection collection2 = collection;
                if (!(collection2 instanceof Collection) || !collection2.isEmpty()) {
                    Iterator it = collection2.iterator();
                    while (it.hasNext()) {
                        if (!contains((Map.Entry) it.next())) {
                            break;
                        }
                    }
                }
                break;
            case 1:
                Collection collection3 = collection;
                if (!(collection3 instanceof Collection) || !collection3.isEmpty()) {
                    Iterator it2 = collection3.iterator();
                    while (it2.hasNext()) {
                        if (!this.a.containsKey(it2.next())) {
                            break;
                        }
                    }
                }
                break;
            default:
                Collection collection4 = collection;
                if (!(collection4 instanceof Collection) || !collection4.isEmpty()) {
                    Iterator it3 = collection4.iterator();
                    while (it3.hasNext()) {
                        if (!this.a.containsValue(it3.next())) {
                            break;
                        }
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                y08 y08Var = this.a;
                return new d58(y08Var, ((xj3) ((e1) y08Var.f().c).a()).iterator(), 0);
            case 1:
                y08 y08Var2 = this.a;
                return new d58(y08Var2, ((xj3) ((e1) y08Var2.f().c).a()).iterator(), 1);
            default:
                y08 y08Var3 = this.a;
                return new d58(y08Var3, ((xj3) ((e1) y08Var3.f().c).a()).iterator(), 2);
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        Object next;
        switch (this.b) {
            case 0:
                if (obj instanceof Map.Entry) {
                    return (!(obj instanceof dx3) || (obj instanceof fx3)) && this.a.remove(((Map.Entry) obj).getKey()) != null;
                }
                return false;
            case 1:
                return this.a.remove(obj) != null;
            default:
                y08 y08Var = this.a;
                Iterator it = y08Var.b.iterator();
                while (true) {
                    if (((d58) it).hasNext()) {
                        next = ((d58) it).next();
                        if (js3.i(((Map.Entry) next).getValue(), obj)) {
                        }
                    } else {
                        next = null;
                    }
                }
                Map.Entry entry = (Map.Entry) next;
                if (entry == null) {
                    return false;
                }
                y08Var.remove(entry.getKey());
                return true;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        f66 f66Var;
        int i;
        c08 c08VarJ;
        boolean zB;
        switch (this.b) {
            case 0:
                Iterator it = collection.iterator();
                while (true) {
                    boolean z = false;
                    while (it.hasNext()) {
                        if (this.a.remove(((Map.Entry) it.next()).getKey()) != null || z) {
                            z = true;
                        }
                    }
                    return z;
                }
                break;
            case 1:
                Iterator it2 = collection.iterator();
                while (true) {
                    boolean z2 = false;
                    while (it2.hasNext()) {
                        if (this.a.remove(it2.next()) != null || z2) {
                            z2 = true;
                        }
                    }
                    return z2;
                }
                break;
            default:
                Set setT0 = a.T0(collection);
                y08 y08Var = this.a;
                boolean z3 = false;
                do {
                    synchronized (gu9.c) {
                        x08 x08Var = y08Var.a;
                        js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        x08 x08Var2 = (x08) g08.h(x08Var);
                        f66Var = x08Var2.c;
                        i = x08Var2.d;
                    }
                    js3.m(f66Var);
                    d66 d66VarBuilder = f66Var.builder();
                    Iterator it3 = y08Var.b.iterator();
                    while (((d58) it3).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((d58) it3).next();
                        if (setT0.contains(entry.getValue())) {
                            d66VarBuilder.remove(entry.getKey());
                            z3 = true;
                        }
                    }
                    f66 f66VarBuild = d66VarBuilder.build();
                    if (!js3.i(f66VarBuild, f66Var)) {
                        x08 x08Var3 = y08Var.a;
                        js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (g08.c) {
                            c08VarJ = g08.j();
                            zB = y08.b(y08Var, (x08) g08.x(x08Var3, y08Var, c08VarJ), i, f66VarBuild);
                        }
                        g08.o(c08VarJ, y08Var);
                    }
                    return z3;
                } while (!zB);
                return z3;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        f66 f66Var;
        int i;
        c08 c08VarJ;
        boolean zB;
        switch (this.b) {
            case 0:
                return a(collection);
            case 1:
                return c(collection);
            default:
                Set setT0 = a.T0(collection);
                y08 y08Var = this.a;
                boolean z = false;
                do {
                    synchronized (gu9.c) {
                        x08 x08Var = y08Var.a;
                        js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        x08 x08Var2 = (x08) g08.h(x08Var);
                        f66Var = x08Var2.c;
                        i = x08Var2.d;
                    }
                    js3.m(f66Var);
                    d66 d66VarBuilder = f66Var.builder();
                    Iterator it = y08Var.b.iterator();
                    while (((d58) it).hasNext()) {
                        Map.Entry entry = (Map.Entry) ((d58) it).next();
                        if (!setT0.contains(entry.getValue())) {
                            d66VarBuilder.remove(entry.getKey());
                            z = true;
                        }
                    }
                    f66 f66VarBuild = d66VarBuilder.build();
                    if (!js3.i(f66VarBuild, f66Var)) {
                        x08 x08Var3 = y08Var.a;
                        js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                        synchronized (g08.c) {
                            c08VarJ = g08.j();
                            zB = y08.b(y08Var, (x08) g08.x(x08Var3, y08Var, c08VarJ), i, f66VarBuild);
                        }
                        g08.o(c08VarJ, y08Var);
                    }
                    return z;
                } while (!zB);
                return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return tv8.B(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tv8.C(this, objArr);
    }
}
