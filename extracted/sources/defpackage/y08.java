package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class y08 implements e58, Map, gx3 {
    public x08 a;
    public final h08 b;
    public final h08 c;
    public final h08 d;

    public y08() {
        l56 l56Var = l56.c;
        c08 c08VarJ = g08.j();
        x08 x08Var = new x08(c08VarJ.g(), l56Var);
        if (!(c08VarJ instanceof vt2)) {
            x08Var.b = new x08(1, l56Var);
        }
        this.a = x08Var;
        this.b = new h08(this, 0);
        this.c = new h08(this, 1);
        this.d = new h08(this, 2);
    }

    public static final boolean b(y08 y08Var, x08 x08Var, int i, f66 f66Var) {
        boolean z;
        synchronized (gu9.c) {
            int i2 = x08Var.d;
            if (i2 == i) {
                x08Var.c = f66Var;
                z = true;
                x08Var.d = i2 + 1;
            } else {
                z = false;
            }
        }
        return z;
    }

    public static void e(x08 x08Var) {
        l56 l56Var = l56.c;
        synchronized (gu9.c) {
            x08Var.c = l56Var;
            x08Var.d++;
        }
    }

    @Override // defpackage.e58
    public final g58 a() {
        return this.a;
    }

    @Override // defpackage.e58
    public final /* synthetic */ g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        return null;
    }

    @Override // java.util.Map
    public final void clear() {
        c08 c08VarJ;
        x08 x08Var = this.a;
        js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        if (l56.c != ((x08) g08.h(x08Var)).c) {
            x08 x08Var2 = this.a;
            js3.n(x08Var2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                e((x08) g08.x(x08Var2, this, c08VarJ));
            }
            g08.o(c08VarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return f().c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return f().c.containsValue(obj);
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        js3.n(g58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.a = (x08) g58Var;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.b;
    }

    public final x08 f() {
        x08 x08Var = this.a;
        js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (x08) g08.u(x08Var, this);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return f().c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((e1) f().c).isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.c;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        f66 f66Var;
        int i;
        Object objPut;
        c08 c08VarJ;
        boolean zB;
        do {
            synchronized (gu9.c) {
                x08 x08Var = this.a;
                js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x08 x08Var2 = (x08) g08.h(x08Var);
                f66Var = x08Var2.c;
                i = x08Var2.d;
            }
            js3.m(f66Var);
            o56 o56Var = (o56) f66Var.builder();
            objPut = o56Var.put(obj, obj2);
            f66 f66VarBuild = o56Var.build();
            if (js3.i(f66VarBuild, f66Var)) {
                break;
            }
            x08 x08Var3 = this.a;
            js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zB = b(this, (x08) g08.x(x08Var3, this, c08VarJ), i, f66VarBuild);
            }
            g08.o(c08VarJ, this);
        } while (!zB);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        f66 f66Var;
        int i;
        c08 c08VarJ;
        boolean zB;
        do {
            synchronized (gu9.c) {
                x08 x08Var = this.a;
                js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x08 x08Var2 = (x08) g08.h(x08Var);
                f66Var = x08Var2.c;
                i = x08Var2.d;
            }
            js3.m(f66Var);
            o56 o56Var = (o56) f66Var.builder();
            o56Var.putAll(map);
            f66 f66VarBuild = o56Var.build();
            if (js3.i(f66VarBuild, f66Var)) {
                return;
            }
            x08 x08Var3 = this.a;
            js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zB = b(this, (x08) g08.x(x08Var3, this, c08VarJ), i, f66VarBuild);
            }
            g08.o(c08VarJ, this);
        } while (!zB);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        f66 f66Var;
        int i;
        Object objRemove;
        c08 c08VarJ;
        boolean zB;
        do {
            synchronized (gu9.c) {
                x08 x08Var = this.a;
                js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                x08 x08Var2 = (x08) g08.h(x08Var);
                f66Var = x08Var2.c;
                i = x08Var2.d;
            }
            js3.m(f66Var);
            d66 d66VarBuilder = f66Var.builder();
            objRemove = d66VarBuilder.remove(obj);
            f66 f66VarBuild = d66VarBuilder.build();
            if (js3.i(f66VarBuild, f66Var)) {
                break;
            }
            x08 x08Var3 = this.a;
            js3.n(x08Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zB = b(this, (x08) g08.x(x08Var3, this, c08VarJ), i, f66VarBuild);
            }
            g08.o(c08VarJ, this);
        } while (!zB);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return ((e1) f().c).c();
    }

    public final String toString() {
        x08 x08Var = this.a;
        js3.n(x08Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((x08) g08.h(x08Var)).c + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.d;
    }
}
