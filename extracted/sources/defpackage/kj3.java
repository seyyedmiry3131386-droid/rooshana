package defpackage;

import com.google.common.collect.ImmutableCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public abstract class kj3 extends wu8 {
    public Object[] s;
    public int t;
    public boolean u;

    public kj3(int i) {
        vy2.m(i, "initialCapacity");
        this.s = new Object[i];
        this.t = 0;
    }

    public final void O(Object obj) {
        obj.getClass();
        R(1);
        Object[] objArr = this.s;
        int i = this.t;
        this.t = i + 1;
        objArr[i] = obj;
    }

    public final void P(Object... objArr) {
        int length = objArr.length;
        tv8.f(length, objArr);
        R(length);
        System.arraycopy(objArr, 0, this.s, this.t, length);
        this.t += length;
    }

    public final kj3 Q(Iterable iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            R(collection.size());
            if (collection instanceof ImmutableCollection) {
                this.t = ((ImmutableCollection) collection).c(this.t, this.s);
                return this;
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            e(it.next());
        }
        return this;
    }

    public final void R(int i) {
        Object[] objArr = this.s;
        int iT = wu8.t(objArr.length, this.t + i);
        if (iT > objArr.length || this.u) {
            this.s = Arrays.copyOf(this.s, iT);
            this.u = false;
        }
    }
}
