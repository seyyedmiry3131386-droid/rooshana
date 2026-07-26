package androidx.compose.runtime.snapshots;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.a58;
import defpackage.c08;
import defpackage.dp2;
import defpackage.e58;
import defpackage.ex3;
import defpackage.g08;
import defpackage.g58;
import defpackage.hs9;
import defpackage.js3;
import defpackage.lz7;
import defpackage.o98;
import defpackage.rz2;
import defpackage.tv8;
import defpackage.u1;
import defpackage.v66;
import defpackage.vt2;
import defpackage.w08;
import defpackage.w1;
import defpackage.wi6;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class SnapshotStateList<T> implements Parcelable, e58, List<T>, RandomAccess, ex3 {
    public static final Parcelable.Creator<SnapshotStateList<Object>> CREATOR = new w08(0);
    public a58 a;

    public SnapshotStateList(w1 w1Var) {
        c08 c08VarJ = g08.j();
        a58 a58Var = new a58(c08VarJ.g(), w1Var);
        if (!(c08VarJ instanceof vt2)) {
            a58Var.b = new a58(1, w1Var);
        }
        this.a = a58Var;
    }

    @Override // defpackage.e58
    public final g58 a() {
        return this.a;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        int i;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            w1 w1VarE = w1Var.e(obj);
            if (w1VarE.equals(w1Var)) {
                return false;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i, w1VarE, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(final int i, final Collection collection) {
        return hs9.M(this, new dp2() { // from class: v08
            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((List) obj).addAll(i, collection));
            }
        });
    }

    @Override // defpackage.e58
    public final /* synthetic */ g58 c(g58 g58Var, g58 g58Var2, g58 g58Var3) {
        return null;
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        c08 c08VarJ;
        a58 a58Var = this.a;
        js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
        synchronized (g08.c) {
            c08VarJ = g08.j();
            a58 a58Var2 = (a58) g08.x(a58Var, this, c08VarJ);
            synchronized (hs9.f) {
                a58Var2.c = lz7.b;
                a58Var2.d++;
                a58Var2.e++;
            }
        }
        g08.o(c08VarJ, this);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        return hs9.F(this).c.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        return hs9.F(this).c.containsAll(collection);
    }

    @Override // defpackage.e58
    public final void d(g58 g58Var) {
        g58Var.b = this.a;
        this.a = (a58) g58Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(int i, int i2) {
        int i3;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i3 = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            v66 v66VarH = w1Var.h();
            v66VarH.subList(i, i2).clear();
            w1 w1VarE = v66VarH.e();
            if (js3.i(w1VarE, w1Var)) {
                return;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i3, w1VarE, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return hs9.F(this).c.get(i);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        return hs9.F(this).c.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return hs9.F(this).c.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        return hs9.F(this).c.lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return new rz2(this, 0);
    }

    @Override // java.util.List
    public final Object remove(int i) {
        int i2;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        Object obj = get(i);
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i2 = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            w1 w1VarJ = w1Var.j(i);
            if (w1VarJ.equals(w1Var)) {
                break;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i2, w1VarJ, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
        return obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            w1 w1VarI = w1Var.i(new u1(0, collection));
            if (js3.i(w1VarI, w1Var)) {
                return false;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i, w1VarI, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
        return true;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        return hs9.M(this, new u1(3, collection));
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        Object obj2 = get(i);
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i2 = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            w1 w1VarL = w1Var.l(i, obj);
            if (w1VarL.equals(w1Var)) {
                break;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i2, w1VarL, false);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
        return obj2;
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return hs9.F(this).c.a();
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        if (!(i >= 0 && i <= i2 && i2 <= size())) {
            wi6.a("fromIndex or toIndex are out of bounds");
        }
        return new o98(this, i, i2);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        return tv8.B(this);
    }

    public final String toString() {
        a58 a58Var = this.a;
        js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateList>");
        return "SnapshotStateList(value=" + ((a58) g08.h(a58Var)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        w1 w1Var = hs9.F(this).c;
        int iA = w1Var.a();
        parcel.writeInt(iA);
        for (int i2 = 0; i2 < iA; i2++) {
            parcel.writeValue(w1Var.get(i2));
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        int i;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            w1 w1VarF = w1Var.f(collection);
            if (js3.i(w1VarF, w1Var)) {
                return false;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i, w1VarF, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
        return true;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        return new rz2(this, i);
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return tv8.C(this, objArr);
    }

    public SnapshotStateList() {
        this(lz7.b);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i2 = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            w1 w1VarC = w1Var.c(i, obj);
            if (w1VarC.equals(w1Var)) {
                return;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i2, w1VarC, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        int i;
        w1 w1Var;
        c08 c08VarJ;
        boolean zR;
        do {
            synchronized (hs9.f) {
                a58 a58Var = this.a;
                js3.n(a58Var, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.withCurrent>");
                a58 a58Var2 = (a58) g08.h(a58Var);
                i = a58Var2.d;
                w1Var = a58Var2.c;
            }
            js3.m(w1Var);
            int iIndexOf = w1Var.indexOf(obj);
            w1 w1VarJ = iIndexOf != -1 ? w1Var.j(iIndexOf) : w1Var;
            if (w1VarJ.equals(w1Var)) {
                return false;
            }
            a58 a58Var3 = this.a;
            js3.n(a58Var3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.StateListStateRecord<T of androidx.compose.runtime.snapshots.SnapshotStateListKt.writable>");
            synchronized (g08.c) {
                c08VarJ = g08.j();
                zR = hs9.r((a58) g08.x(a58Var3, this, c08VarJ), i, w1VarJ, true);
            }
            g08.o(c08VarJ, this);
        } while (!zR);
        return true;
    }
}
