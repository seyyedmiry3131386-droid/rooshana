package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.c08;
import defpackage.e58;
import defpackage.g08;
import defpackage.g58;
import defpackage.js3;
import defpackage.k58;
import defpackage.kx3;
import defpackage.l58;
import defpackage.o66;
import defpackage.p66;
import defpackage.r66;
import defpackage.tv8;
import defpackage.w08;
import defpackage.y40;
import java.util.Collection;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateSet<T> implements Parcelable, e58, Set<T>, RandomAccess, kx3 {
    public static final Parcelable.Creator<SnapshotStateSet<Object>> CREATOR = new w08(6);
    public l58 a;

    @Override // defpackage.e58
    public final g58 a() {
        return this.a;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        r66 r66Var;
        c08 c08VarJ;
        boolean zL;
        do {
            synchronized (y40.d) {
                l58 l58Var = this.a;
                js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                l58 l58Var2 = (l58) g08.h(l58Var);
                i = l58Var2.d;
                r66Var = l58Var2.c;
            }
            js3.m(r66Var);
            o66 o66VarC = ((o66) r66Var).c(obj);
            if (o66VarC.equals(r66Var)) {
                return false;
            }
            l58 l58Var3 = this.a;
            js3.n(l58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zL = y40.l((l58) g08.x(l58Var3, this, c08VarJ), i, o66VarC);
            }
            g08.o(c08VarJ, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        r66 r66Var;
        c08 c08VarJ;
        boolean zL;
        do {
            synchronized (y40.d) {
                l58 l58Var = this.a;
                js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                l58 l58Var2 = (l58) g08.h(l58Var);
                i = l58Var2.d;
                r66Var = l58Var2.c;
            }
            js3.m(r66Var);
            p66 p66Var = new p66((o66) r66Var);
            p66Var.addAll(collection);
            o66 o66VarC = p66Var.c();
            if (o66VarC.equals(r66Var)) {
                return false;
            }
            l58 l58Var3 = this.a;
            js3.n(l58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zL = y40.l((l58) g08.x(l58Var3, this, c08VarJ), i, o66VarC);
            }
            g08.o(c08VarJ, this);
        } while (!zL);
        return true;
    }

    @Override // defpackage.e58
    public final /* synthetic */ g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        return null;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        c08 c08VarJ;
        l58 l58Var = this.a;
        js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
        synchronized (g08.c) {
            c08VarJ = g08.j();
            l58 l58Var2 = (l58) g08.x(l58Var, this, c08VarJ);
            synchronized (y40.d) {
                l58Var2.c = o66.d;
                l58Var2.d++;
            }
        }
        g08.o(c08VarJ, this);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return y40.x(this).c.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return y40.x(this).c.containsAll(collection);
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        g58Var.b = this.a;
        this.a = (l58) g58Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return y40.x(this).c.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new k58(this, y40.x(this).c.iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        r66 r66Var;
        c08 c08VarJ;
        boolean zL;
        do {
            synchronized (y40.d) {
                l58 l58Var = this.a;
                js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                l58 l58Var2 = (l58) g08.h(l58Var);
                i = l58Var2.d;
                r66Var = l58Var2.c;
            }
            js3.m(r66Var);
            o66 o66VarE = ((o66) r66Var).e(obj);
            if (o66VarE.equals(r66Var)) {
                return false;
            }
            l58 l58Var3 = this.a;
            js3.n(l58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zL = y40.l((l58) g08.x(l58Var3, this, c08VarJ), i, o66VarE);
            }
            g08.o(c08VarJ, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        r66 r66Var;
        c08 c08VarJ;
        boolean zL;
        do {
            synchronized (y40.d) {
                l58 l58Var = this.a;
                js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                l58 l58Var2 = (l58) g08.h(l58Var);
                i = l58Var2.d;
                r66Var = l58Var2.c;
            }
            js3.m(r66Var);
            p66 p66Var = new p66((o66) r66Var);
            p66Var.removeAll(collection);
            o66 o66VarC = p66Var.c();
            if (o66VarC.equals(r66Var)) {
                return false;
            }
            l58 l58Var3 = this.a;
            js3.n(l58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zL = y40.l((l58) g08.x(l58Var3, this, c08VarJ), i, o66VarC);
            }
            g08.o(c08VarJ, this);
        } while (!zL);
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i;
        r66 r66Var;
        boolean zRetainAll;
        c08 c08VarJ;
        boolean zL;
        do {
            synchronized (y40.d) {
                l58 l58Var = this.a;
                js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.withCurrent>");
                l58 l58Var2 = (l58) g08.h(l58Var);
                i = l58Var2.d;
                r66Var = l58Var2.c;
            }
            if (r66Var == null) {
                throw new IllegalStateException("No set to mutate");
            }
            p66 p66Var = new p66((o66) r66Var);
            zRetainAll = p66Var.retainAll(kotlin.collections.a.T0(collection));
            o66 o66VarC = p66Var.c();
            if (o66VarC.equals(r66Var)) {
                break;
            }
            l58 l58Var3 = this.a;
            js3.n(l58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSetKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zL = y40.l((l58) g08.x(l58Var3, this, c08VarJ), i, o66VarC);
            }
            g08.o(c08VarJ, this);
        } while (!zL);
        return zRetainAll;
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return y40.x(this).c.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return tv8.B(this);
    }

    public final String toString() {
        l58 l58Var = this.a;
        js3.n(l58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateSetStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateSet>");
        return "SnapshotStateSet(value=" + ((l58) g08.h(l58Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        r66 r66Var = y40.x(this).c;
        parcel.writeInt(size());
        Iterator it = r66Var.iterator();
        if (it.hasNext()) {
            parcel.writeValue(it.next());
        }
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tv8.C(this, objArr);
    }
}
