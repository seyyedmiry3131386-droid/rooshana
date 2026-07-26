package com.google.common.primitives;

import defpackage.mr1;
import defpackage.wn5;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableDoubleArray implements Serializable {
    public static final ImmutableDoubleArray d = new ImmutableDoubleArray(new double[0], 0, 0);
    public final double[] a;
    public final transient int b;
    public final int c;

    public static class AsList extends AbstractList<Double> implements RandomAccess, Serializable {
        public final ImmutableDoubleArray a;

        public AsList(ImmutableDoubleArray immutableDoubleArray) {
            this.a = immutableDoubleArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z = obj instanceof AsList;
            ImmutableDoubleArray immutableDoubleArray = this.a;
            if (z) {
                return immutableDoubleArray.equals(((AsList) obj).a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableDoubleArray.length() != list.size()) {
                return false;
            }
            int i = immutableDoubleArray.b;
            for (Object obj2 : list) {
                if (obj2 instanceof Double) {
                    int i2 = i + 1;
                    if (ImmutableDoubleArray.a(immutableDoubleArray.a[i], ((Double) obj2).doubleValue())) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            ImmutableDoubleArray immutableDoubleArray = this.a;
            wn5.l(i, immutableDoubleArray.length());
            return Double.valueOf(immutableDoubleArray.a[immutableDoubleArray.b + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.a;
                int i = immutableDoubleArray.b;
                for (int i2 = i; i2 < immutableDoubleArray.c; i2++) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.a[i2], dDoubleValue)) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            if (obj instanceof Double) {
                double dDoubleValue = ((Double) obj).doubleValue();
                ImmutableDoubleArray immutableDoubleArray = this.a;
                int i = immutableDoubleArray.b;
                for (int i2 = immutableDoubleArray.c - 1; i2 >= i; i2--) {
                    if (ImmutableDoubleArray.a(immutableDoubleArray.a[i2], dDoubleValue)) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            ImmutableDoubleArray immutableDoubleArray;
            ImmutableDoubleArray immutableDoubleArray2 = this.a;
            wn5.o(i, i2, immutableDoubleArray2.length());
            if (i == i2) {
                immutableDoubleArray = ImmutableDoubleArray.d;
            } else {
                double[] dArr = immutableDoubleArray2.a;
                int i3 = immutableDoubleArray2.b;
                immutableDoubleArray = new ImmutableDoubleArray(dArr, i + i3, i3 + i2);
            }
            return new AsList(immutableDoubleArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.a.toString();
        }
    }

    public ImmutableDoubleArray(double[] dArr, int i, int i2) {
        this.a = dArr;
        this.b = i;
        this.c = i2;
    }

    public static boolean a(double d2, double d3) {
        return Double.doubleToLongBits(d2) == Double.doubleToLongBits(d3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableDoubleArray) {
            ImmutableDoubleArray immutableDoubleArray = (ImmutableDoubleArray) obj;
            if (length() == immutableDoubleArray.length()) {
                for (int i = 0; i < length(); i++) {
                    wn5.l(i, length());
                    double d2 = this.a[this.b + i];
                    wn5.l(i, immutableDoubleArray.length());
                    if (a(d2, immutableDoubleArray.a[immutableDoubleArray.b + i])) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = 1;
        for (int i = this.b; i < this.c; i++) {
            double d2 = this.a[i];
            int i2 = mr1.p;
            iHashCode = (iHashCode * 31) + Double.valueOf(d2).hashCode();
        }
        return iHashCode;
    }

    public final int length() {
        return this.c - this.b;
    }

    public Object readResolve() {
        return this.c == this.b ? d : this;
    }

    public final String toString() {
        int i = this.b;
        int i2 = this.c;
        if (i2 == i) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(length() * 5);
        sb.append('[');
        double[] dArr = this.a;
        sb.append(dArr[i]);
        while (true) {
            i++;
            if (i >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(dArr[i]);
        }
    }

    public Object writeReplace() {
        double[] dArr = this.a;
        int i = this.c;
        int i2 = this.b;
        if (i2 <= 0 && i >= dArr.length) {
            return this;
        }
        double[] dArrCopyOfRange = Arrays.copyOfRange(dArr, i2, i);
        return new ImmutableDoubleArray(dArrCopyOfRange, 0, dArrCopyOfRange.length);
    }
}
