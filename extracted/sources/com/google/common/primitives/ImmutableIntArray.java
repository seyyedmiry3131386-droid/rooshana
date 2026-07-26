package com.google.common.primitives;

import defpackage.wn5;
import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableIntArray implements Serializable {
    public static final ImmutableIntArray d = new ImmutableIntArray(0, 0, new int[0]);
    public final int[] a;
    public final transient int b;
    public final int c;

    public static class AsList extends AbstractList<Integer> implements RandomAccess, Serializable {
        public final ImmutableIntArray a;

        public AsList(ImmutableIntArray immutableIntArray) {
            this.a = immutableIntArray;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final boolean contains(Object obj) {
            return indexOf(obj) >= 0;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final boolean equals(Object obj) {
            boolean z = obj instanceof AsList;
            ImmutableIntArray immutableIntArray = this.a;
            if (z) {
                return immutableIntArray.equals(((AsList) obj).a);
            }
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (immutableIntArray.length() != list.size()) {
                return false;
            }
            int i = immutableIntArray.b;
            for (Object obj2 : list) {
                if (obj2 instanceof Integer) {
                    int i2 = i + 1;
                    if (immutableIntArray.a[i] == ((Integer) obj2).intValue()) {
                        i = i2;
                    }
                }
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.List
        public final Object get(int i) {
            return Integer.valueOf(this.a.a(i));
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public final int hashCode() {
            return this.a.hashCode();
        }

        @Override // java.util.AbstractList, java.util.List
        public final int indexOf(Object obj) {
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.a;
                int i = immutableIntArray.b;
                for (int i2 = i; i2 < immutableIntArray.c; i2++) {
                    if (immutableIntArray.a[i2] == iIntValue) {
                        return i2 - i;
                    }
                }
            }
            return -1;
        }

        @Override // java.util.AbstractList, java.util.List
        public final int lastIndexOf(Object obj) {
            int i;
            if (obj instanceof Integer) {
                int iIntValue = ((Integer) obj).intValue();
                ImmutableIntArray immutableIntArray = this.a;
                int i2 = immutableIntArray.c;
                do {
                    i2--;
                    i = immutableIntArray.b;
                    if (i2 >= i) {
                    }
                } while (immutableIntArray.a[i2] != iIntValue);
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
            ImmutableIntArray immutableIntArray;
            ImmutableIntArray immutableIntArray2 = this.a;
            wn5.o(i, i2, immutableIntArray2.length());
            if (i == i2) {
                immutableIntArray = ImmutableIntArray.d;
            } else {
                int[] iArr = immutableIntArray2.a;
                int i3 = immutableIntArray2.b;
                immutableIntArray = new ImmutableIntArray(i + i3, i3 + i2, iArr);
            }
            return new AsList(immutableIntArray);
        }

        @Override // java.util.AbstractCollection
        public final String toString() {
            return this.a.toString();
        }
    }

    public ImmutableIntArray(int[] iArr) {
        this(0, iArr.length, iArr);
    }

    public static ImmutableIntArray b(int i) {
        return new ImmutableIntArray(0, 1, new int[]{i});
    }

    public final int a(int i) {
        wn5.l(i, length());
        return this.a[this.b + i];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ImmutableIntArray)) {
            return false;
        }
        ImmutableIntArray immutableIntArray = (ImmutableIntArray) obj;
        if (length() != immutableIntArray.length()) {
            return false;
        }
        for (int i = 0; i < length(); i++) {
            if (a(i) != immutableIntArray.a(i)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 1;
        for (int i2 = this.b; i2 < this.c; i2++) {
            i = (i * 31) + this.a[i2];
        }
        return i;
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
        int[] iArr = this.a;
        sb.append(iArr[i]);
        while (true) {
            i++;
            if (i >= i2) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            sb.append(iArr[i]);
        }
    }

    public Object writeReplace() {
        int[] iArr = this.a;
        int i = this.c;
        int i2 = this.b;
        return (i2 > 0 || i < iArr.length) ? new ImmutableIntArray(Arrays.copyOfRange(iArr, i2, i)) : this;
    }

    public ImmutableIntArray(int i, int i2, int[] iArr) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
    }
}
