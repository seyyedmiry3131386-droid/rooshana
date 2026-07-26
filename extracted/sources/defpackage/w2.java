package defpackage;

import com.google.common.collect.BoundType;
import com.google.common.collect.TreeMultiset;
import com.google.common.collect.p1;
import com.google.common.collect.x;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends bk2 implements q18 {
    public transient p1 s;
    public transient r18 t;
    public transient p1 u;
    public final /* synthetic */ x v;

    public w2(x xVar) {
        super(16);
        this.v = xVar;
    }

    @Override // defpackage.bk2, defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return this.v;
    }

    @Override // defpackage.q18
    public final q18 D0(Object obj, BoundType boundType) {
        return ((x) ((TreeMultiset) this.v).k0(obj, boundType)).J();
    }

    @Override // defpackage.q18
    public final q18 J() {
        return this.v;
    }

    @Override // defpackage.bk2, defpackage.uj2
    public final Collection Y() {
        return this.v;
    }

    @Override // defpackage.bk2
    /* JADX INFO: renamed from: Z */
    public final oa5 Y() {
        return this.v;
    }

    @Override // defpackage.q18, defpackage.p18
    public final Comparator comparator() {
        p1 p1Var = this.s;
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1VarH = p1.b(this.v.comparator()).h();
        this.s = p1VarH;
        return p1VarH;
    }

    @Override // defpackage.oa5
    public final Set entrySet() {
        p1 p1Var = this.u;
        if (p1Var != null) {
            return p1Var;
        }
        p1 p1Var2 = new p1(this, 1);
        this.u = p1Var2;
        return p1Var2;
    }

    @Override // defpackage.q18
    public final pa5 firstEntry() {
        this.v.getClass();
        throw null;
    }

    @Override // defpackage.q18
    public final q18 h1(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return ((x) this.v.h1(obj2, boundType2, obj, boundType)).J();
    }

    @Override // defpackage.uj2, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return tt3.D(this.v.J());
    }

    @Override // defpackage.q18
    public final q18 k0(Object obj, BoundType boundType) {
        return ((x) ((TreeMultiset) this.v).D0(obj, boundType)).J();
    }

    @Override // defpackage.q18
    public final pa5 lastEntry() {
        this.v.getClass();
        throw null;
    }

    @Override // defpackage.q18
    public final pa5 pollFirstEntry() {
        this.v.getClass();
        throw null;
    }

    @Override // defpackage.q18
    public final pa5 pollLastEntry() {
        this.v.getClass();
        throw null;
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        return toArray(new Object[size()]);
    }

    @Override // defpackage.hs9
    public final String toString() {
        return entrySet().toString();
    }

    @Override // defpackage.oa5, defpackage.q18
    public final NavigableSet b() {
        r18 r18Var = this.t;
        if (r18Var != null) {
            return r18Var;
        }
        r18 r18Var2 = new r18(this);
        this.t = r18Var2;
        return r18Var2;
    }

    @Override // defpackage.uj2, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        return tv8.D(this, objArr);
    }
}
