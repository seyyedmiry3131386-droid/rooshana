package com.google.common.collect;

import java.io.Serializable;
import java.lang.Comparable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class Cut<C extends Comparable> implements Comparable<Cut<C>>, Serializable {
    private static final long serialVersionUID = 0;
    public final Comparable a;

    public static final class AboveAll extends Cut<Comparable<?>> {
        public static final AboveAll b = new AboveAll();
        private static final long serialVersionUID = 0;

        private AboveAll() {
            super("");
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final boolean g(Comparable comparable) {
            return false;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final Cut i() {
            throw new AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        public final Cut j() {
            throw new IllegalStateException();
        }

        public final String toString() {
            return "+∞";
        }
    }

    public static final class BelowAll extends Cut<Comparable<?>> {
        public static final BelowAll b = new BelowAll();
        private static final long serialVersionUID = 0;

        private BelowAll() {
            super("");
        }

        private Object readResolve() {
            return b;
        }

        @Override // com.google.common.collect.Cut
        /* JADX INFO: renamed from: b */
        public final int compareTo(Cut cut) {
            return cut == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final int compareTo(Object obj) {
            return ((Cut) obj) == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb) {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw new AssertionError();
        }

        @Override // com.google.common.collect.Cut
        public final boolean g(Comparable comparable) {
            return true;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return System.identityHashCode(this);
        }

        @Override // com.google.common.collect.Cut
        public final Cut i() {
            throw new IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        public final Cut j() {
            throw new AssertionError("this statement should be unreachable");
        }

        public final String toString() {
            return "-∞";
        }
    }

    public Cut(Comparable comparable) {
        this.a = comparable;
    }

    public static BelowValue a(Comparable comparable) {
        comparable.getClass();
        return new BelowValue(comparable);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public int compareTo(Cut cut) {
        if (cut == BelowAll.b) {
            return 1;
        }
        if (cut == AboveAll.b) {
            return -1;
        }
        Comparable comparable = cut.a;
        Range range = Range.c;
        int iCompareTo = this.a.compareTo(comparable);
        return iCompareTo != 0 ? iCompareTo : Boolean.compare(this instanceof AboveValue, cut instanceof AboveValue);
    }

    public abstract void c(StringBuilder sb);

    public abstract void e(StringBuilder sb);

    public final boolean equals(Object obj) {
        if (obj instanceof Cut) {
            try {
                if (compareTo((Cut) obj) == 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    public abstract Comparable f();

    public abstract boolean g(Comparable comparable);

    public abstract Comparable h();

    public abstract int hashCode();

    public abstract Cut i();

    public abstract Cut j();

    public static final class AboveValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AboveValue(Comparable comparable) {
            super(comparable);
            comparable.getClass();
        }

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            sb.append('(');
            sb.append(this.a);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb) {
            sb.append(this.a);
            sb.append(']');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            return this.a;
        }

        @Override // com.google.common.collect.Cut
        public final boolean g(Comparable comparable) {
            Range range = Range.c;
            return this.a.compareTo(comparable) < 0;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return ~this.a.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final Cut i() {
            throw null;
        }

        public final String toString() {
            return "/" + this.a + "\\";
        }

        @Override // com.google.common.collect.Cut
        public final Cut j() {
            return this;
        }
    }

    public static final class BelowValue<C extends Comparable> extends Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut
        public final void c(StringBuilder sb) {
            sb.append('[');
            sb.append(this.a);
        }

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
            return compareTo((Cut) obj);
        }

        @Override // com.google.common.collect.Cut
        public final void e(StringBuilder sb) {
            sb.append(this.a);
            sb.append(')');
        }

        @Override // com.google.common.collect.Cut
        public final Comparable f() {
            throw null;
        }

        @Override // com.google.common.collect.Cut
        public final boolean g(Comparable comparable) {
            Range range = Range.c;
            return this.a.compareTo(comparable) <= 0;
        }

        @Override // com.google.common.collect.Cut
        public final Comparable h() {
            return this.a;
        }

        @Override // com.google.common.collect.Cut
        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // com.google.common.collect.Cut
        public final Cut j() {
            throw null;
        }

        public final String toString() {
            return "\\" + this.a + "/";
        }

        @Override // com.google.common.collect.Cut
        public final Cut i() {
            return this;
        }
    }
}
