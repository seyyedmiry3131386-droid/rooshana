package com.google.common.primitives;

import defpackage.tv8;
import defpackage.wn5;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableLongArray implements Serializable {
    public static final ImmutableLongArray d = new ImmutableLongArray(new long[0], 0, 0);
    public final long[] a;
    public final transient int b;
    public final int c;

    public static class AsList extends AbstractList<Long> implements RandomAccess, Serializable {
        public final ImmutableLongArray a;

        public AsList(ImmutableLongArray immutableLongArray) {
            this.a = immutableLongArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z = obj instanceof AsList;
            ImmutableLongArray immutableLongArray = this.a;
            if (z) {
                return immutableLongArray.equals(((AsList) obj).a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableLongArray.length() != list.size()) {
                return false;
            }
            int i = immutableLongArray.b;
            for (Object obj2 : list) {
                if (obj2 instanceof Long) {
                    int i2 = i + 1;
                    if (immutableLongArray.a[i] == ((Long) obj2).longValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            ImmutableLongArray immutableLongArray = this.a;
            wn5.l(i, immutableLongArray.length());
            return Long.valueOf(immutableLongArray.a[immutableLongArray.b + i]);
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.a;
                int i = immutableLongArray.b;
                for (int i2 = i; i2 < immutableLongArray.c; i2++) {
                    if (immutableLongArray.a[i2] == jLongValue) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i;
            if (obj instanceof Long) {
                long jLongValue = ((Long) obj).longValue();
                ImmutableLongArray immutableLongArray = this.a;
                int i2 = immutableLongArray.c;
                do {
                    i2--;
                    i = immutableLongArray.b;
                    if (i2 >= i) {
                    }
                } while (immutableLongArray.a[i2] != jLongValue);
                return i2 - i;
            }
            return -1;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.a.length();
        }

        @Override // java.util.AbstractList, java.util.List
        public final List subList(int i, int i2) {
            ImmutableLongArray immutableLongArray;
            ImmutableLongArray immutableLongArray2 = this.a;
            wn5.o(i, i2, immutableLongArray2.length());
            if (i == i2) {
                immutableLongArray = ImmutableLongArray.d;
            } else {
                long[] jArr = immutableLongArray2.a;
                int i3 = immutableLongArray2.b;
                immutableLongArray = new ImmutableLongArray(jArr, i + i3, i3 + i2);
            }
            return new AsList(immutableLongArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.a.toString();
        }
    }

    public ImmutableLongArray(long[] jArr, int i, int i2) {
        this.a = jArr;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ImmutableLongArray) {
            ImmutableLongArray immutableLongArray = (ImmutableLongArray) obj;
            if (length() == immutableLongArray.length()) {
                for (int i = 0; i < length(); i++) {
                    wn5.l(i, length());
                    long j = this.a[this.b + i];
                    wn5.l(i, immutableLongArray.length());
                    if (j == immutableLongArray.a[immutableLongArray.b + i]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iU = 1;
        for (int i = this.b; i < this.c; i++) {
            iU = (iU * 31) + tv8.u(this.a[i]);
        }
        return iU;
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
        long[] jArr = this.a;
        sb.append(jArr[i]);
        while (true) {
            i++;
            if (i >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(jArr[i]);
        }
    }

    public Object writeReplace() {
        long[] jArr = this.a;
        int i = this.c;
        int i2 = this.b;
        if (i2 <= 0 && i >= jArr.length) {
            return this;
        }
        long[] jArrCopyOfRange = Arrays.copyOfRange(jArr, i2, i);
        return new ImmutableLongArray(jArrCopyOfRange, 0, jArrCopyOfRange.length);
    }
}
