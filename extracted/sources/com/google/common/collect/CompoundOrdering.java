package com.google.common.collect;

import defpackage.dw1;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
final class CompoundOrdering<T> extends p1 implements Serializable {
    private static final long serialVersionUID = 0;
    public final Comparator[] a;

    public CompoundOrdering(p1 p1Var, Comparator comparator) {
        this.a = new Comparator[]{p1Var, comparator};
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = 0;
        while (true) {
            Comparator[] comparatorArr = this.a;
            if (i >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i].compare(obj, obj2);
            if (iCompare != 0) {
                return iCompare;
            }
            i++;
        }
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.a, ((CompoundOrdering) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    public final String toString() {
        return dw1.s(new StringBuilder("Ordering.compound("), Arrays.toString(this.a), ")");
    }
}
