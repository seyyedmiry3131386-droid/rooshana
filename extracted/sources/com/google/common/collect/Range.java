package com.google.common.collect;

import com.google.common.collect.Cut;
import defpackage.dx0;
import defpackage.wn5;
import defpackage.zi6;
import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: loaded from: classes.dex */
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements zi6, Serializable {
    public static final Range c = new Range(Cut.BelowAll.b, Cut.AboveAll.b);
    private static final long serialVersionUID = 0;
    public final Cut a;
    public final Cut b;

    public static class RangeLexOrdering extends p1 implements Serializable {
        public static final p1 a = new RangeLexOrdering();
        private static final long serialVersionUID = 0;

        private RangeLexOrdering() {
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            Range range = (Range) obj;
            Range range2 = (Range) obj2;
            return dx0.a.b(range.a, range2.a).b(range.b, range2.b).f();
        }
    }

    public Range(Cut cut, Cut cut2) {
        cut.getClass();
        this.a = cut;
        cut2.getClass();
        this.b = cut2;
        if (cut.compareTo(cut2) > 0 || cut == Cut.AboveAll.b || cut2 == Cut.BelowAll.b) {
            StringBuilder sb = new StringBuilder("Invalid range: ");
            StringBuilder sb2 = new StringBuilder(16);
            cut.c(sb2);
            sb2.append("..");
            cut2.e(sb2);
            sb.append(sb2.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static Range b(Comparable comparable, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        if (iOrdinal == 0) {
            return new Range(new Cut.AboveValue(comparable), Cut.AboveAll.b);
        }
        if (iOrdinal == 1) {
            return new Range(Cut.a(comparable), Cut.AboveAll.b);
        }
        throw new AssertionError();
    }

    public static Range f(Comparable comparable, BoundType boundType, Comparable comparable2, BoundType boundType2) {
        BoundType boundType3 = BoundType.a;
        return new Range(boundType == boundType3 ? new Cut.AboveValue(comparable) : Cut.a(comparable), boundType2 == boundType3 ? Cut.a(comparable2) : new Cut.AboveValue(comparable2));
    }

    public static Range g(Comparable comparable, BoundType boundType) {
        int iOrdinal = boundType.ordinal();
        if (iOrdinal == 0) {
            return new Range(Cut.BelowAll.b, Cut.a(comparable));
        }
        if (iOrdinal == 1) {
            return new Range(Cut.BelowAll.b, new Cut.AboveValue(comparable));
        }
        throw new AssertionError();
    }

    public final boolean a(Comparable comparable) {
        comparable.getClass();
        return this.a.g(comparable) && !this.b.g(comparable);
    }

    @Override // defpackage.zi6
    public final boolean apply(Object obj) {
        return a((Comparable) obj);
    }

    public final Range c(Range range) {
        Cut cut = range.a;
        Cut cut2 = this.a;
        int iCompareTo = cut2.compareTo(cut);
        Cut cut3 = range.b;
        Cut cut4 = this.b;
        int iCompareTo2 = cut4.compareTo(cut3);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        if (iCompareTo >= 0) {
            cut = cut2;
        }
        if (iCompareTo2 <= 0) {
            cut3 = cut4;
        }
        wn5.k(cut.compareTo(cut3) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return new Range(cut, cut3);
    }

    public final boolean e(Range range) {
        return this.a.compareTo(range.b) <= 0 && range.a.compareTo(this.b) <= 0;
    }

    @Override // defpackage.zi6
    public final boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.a.equals(range.a) && this.b.equals(range.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public Object readResolve() {
        Range range = c;
        return equals(range) ? range : this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(16);
        this.a.c(sb);
        sb.append("..");
        this.b.e(sb);
        return sb.toString();
    }
}
