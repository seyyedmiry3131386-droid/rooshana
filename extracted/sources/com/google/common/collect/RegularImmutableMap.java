package com.google.common.collect;

import defpackage.rj3;
import defpackage.wn5;
import defpackage.y97;
import defpackage.zx8;
import j$.util.Objects;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {
    public static final ImmutableMap g = new RegularImmutableMap(0, null, new Object[0]);
    private static final long serialVersionUID = 0;
    public final transient Object d;
    public final transient Object[] e;
    public final transient int f;

    public static class EntrySet<K, V> extends ImmutableSet<Map.Entry<K, V>> {
        public final transient ImmutableMap d;
        public final transient Object[] e;
        public final transient int f;
        public final transient int g;

        public EntrySet(ImmutableMap immutableMap, Object[] objArr, int i, int i2) {
            this.d = immutableMap;
            this.e = objArr;
            this.f = i;
            this.g = i2;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int c(int i, Object[] objArr) {
            return a().c(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.d.get(key));
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            return a().listIterator(0);
        }

        @Override // com.google.common.collect.ImmutableSet
        public final ImmutableList p() {
            return new ImmutableList<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.RegularImmutableMap.EntrySet.1
                @Override // java.util.List
                public final Object get(int i) {
                    EntrySet entrySet = EntrySet.this;
                    wn5.l(i, entrySet.g);
                    Object[] objArr = entrySet.e;
                    int i2 = i * 2;
                    int i3 = entrySet.f;
                    Object obj = objArr[i2 + i3];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArr[i2 + (i3 ^ 1)];
                    Objects.requireNonNull(obj2);
                    return new AbstractMap.SimpleImmutableEntry(obj, obj2);
                }

                @Override // com.google.common.collect.ImmutableCollection
                public final boolean i() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public final int size() {
                    return EntrySet.this.g;
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                public Object writeReplace() {
                    return super.writeReplace();
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.g;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeySet<K> extends ImmutableSet<K> {
        public final transient ImmutableMap d;
        public final transient ImmutableList e;

        public KeySet(ImmutableMap immutableMap, ImmutableList immutableList) {
            this.d = immutableMap;
            this.e = immutableList;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public final ImmutableList a() {
            return this.e;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final int c(int i, Object[] objArr) {
            return this.e.c(i, objArr);
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean contains(Object obj) {
            return this.d.get(obj) != null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
        /* JADX INFO: renamed from: j */
        public final zx8 iterator() {
            return this.e.listIterator(0);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final int size() {
            return this.d.size();
        }

        @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static final class KeysOrValuesAsList extends ImmutableList<Object> {
        public final transient Object[] c;
        public final transient int d;
        public final transient int e;

        public KeysOrValuesAsList(Object[] objArr, int i, int i2) {
            this.c = objArr;
            this.d = i;
            this.e = i2;
        }

        @Override // java.util.List
        public final Object get(int i) {
            wn5.l(i, this.e);
            Object obj = this.c[(i * 2) + this.d];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return this.e;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public RegularImmutableMap(int i, Object obj, Object[] objArr) {
        this.d = obj;
        this.e = objArr;
        this.f = i;
    }

    public static RegularImmutableMap p(int i, Object[] objArr, j0 j0Var) {
        if (i == 0) {
            return (RegularImmutableMap) g;
        }
        if (i == 1) {
            Objects.requireNonNull(objArr[0]);
            Objects.requireNonNull(objArr[1]);
            return new RegularImmutableMap(1, null, objArr);
        }
        wn5.n(i, objArr.length >> 1);
        Object objQ = q(objArr, i, ImmutableSet.l(i), 0);
        if (objQ instanceof Object[]) {
            Object[] objArr2 = (Object[]) objQ;
            rj3 rj3Var = (rj3) objArr2[2];
            if (j0Var == null) {
                throw rj3Var.a();
            }
            j0Var.c = rj3Var;
            Object obj = objArr2[0];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, iIntValue * 2);
            objQ = obj;
            i = iIntValue;
        }
        return new RegularImmutableMap(i, objQ, objArr);
    }

    public static Object q(Object[] objArr, int i, int i2, int i3) {
        int i4;
        rj3 rj3Var = null;
        int i5 = 1;
        if (i == 1) {
            Objects.requireNonNull(objArr[i3]);
            Objects.requireNonNull(objArr[i3 ^ 1]);
            return null;
        }
        int i6 = i2 - 1;
        if (i2 <= 128) {
            byte[] bArr = new byte[i2];
            Arrays.fill(bArr, (byte) -1);
            int i7 = 0;
            for (int i8 = 0; i8 < i; i8++) {
                int i9 = (i8 * 2) + i3;
                int i10 = (i7 * 2) + i3;
                Object obj = objArr[i9];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i9 ^ 1];
                Objects.requireNonNull(obj2);
                int iA0 = y97.a0(obj.hashCode());
                while (true) {
                    int i11 = iA0 & i6;
                    int i12 = bArr[i11] & 255;
                    if (i12 == 255) {
                        bArr[i11] = (byte) i10;
                        if (i7 < i8) {
                            objArr[i10] = obj;
                            objArr[i10 ^ 1] = obj2;
                        }
                        i7++;
                    } else {
                        if (obj.equals(objArr[i12])) {
                            int i13 = i12 ^ 1;
                            Object obj3 = objArr[i13];
                            Objects.requireNonNull(obj3);
                            rj3Var = new rj3(obj, obj2, obj3);
                            objArr[i13] = obj2;
                            break;
                        }
                        iA0 = i11 + 1;
                    }
                }
            }
            return i7 == i ? bArr : new Object[]{bArr, Integer.valueOf(i7), rj3Var};
        }
        if (i2 <= 32768) {
            short[] sArr = new short[i2];
            Arrays.fill(sArr, (short) -1);
            int i14 = 0;
            for (int i15 = 0; i15 < i; i15++) {
                int i16 = (i15 * 2) + i3;
                int i17 = (i14 * 2) + i3;
                Object obj4 = objArr[i16];
                Objects.requireNonNull(obj4);
                Object obj5 = objArr[i16 ^ 1];
                Objects.requireNonNull(obj5);
                int iA02 = y97.a0(obj4.hashCode());
                while (true) {
                    int i18 = iA02 & i6;
                    int i19 = sArr[i18] & 65535;
                    if (i19 == 65535) {
                        sArr[i18] = (short) i17;
                        if (i14 < i15) {
                            objArr[i17] = obj4;
                            objArr[i17 ^ 1] = obj5;
                        }
                        i14++;
                    } else {
                        if (obj4.equals(objArr[i19])) {
                            int i20 = i19 ^ 1;
                            Object obj6 = objArr[i20];
                            Objects.requireNonNull(obj6);
                            rj3Var = new rj3(obj4, obj5, obj6);
                            objArr[i20] = obj5;
                            break;
                        }
                        iA02 = i18 + 1;
                    }
                }
            }
            return i14 == i ? sArr : new Object[]{sArr, Integer.valueOf(i14), rj3Var};
        }
        int[] iArr = new int[i2];
        Arrays.fill(iArr, -1);
        int i21 = 0;
        int i22 = 0;
        while (i21 < i) {
            int i23 = (i21 * 2) + i3;
            int i24 = (i22 * 2) + i3;
            Object obj7 = objArr[i23];
            Objects.requireNonNull(obj7);
            Object obj8 = objArr[i23 ^ i5];
            Objects.requireNonNull(obj8);
            int iA03 = y97.a0(obj7.hashCode());
            while (true) {
                int i25 = iA03 & i6;
                int i26 = iArr[i25];
                if (i26 == -1) {
                    iArr[i25] = i24;
                    if (i22 < i21) {
                        objArr[i24] = obj7;
                        objArr[i24 ^ 1] = obj8;
                    }
                    i22++;
                    i4 = i5;
                } else {
                    i4 = i5;
                    if (obj7.equals(objArr[i26])) {
                        int i27 = i26 ^ 1;
                        Object obj9 = objArr[i27];
                        Objects.requireNonNull(obj9);
                        rj3Var = new rj3(obj7, obj8, obj9);
                        objArr[i27] = obj8;
                        break;
                    }
                    iA03 = i25 + 1;
                    i5 = i4;
                }
            }
            i21++;
            i5 = i4;
        }
        int i28 = i5;
        if (i22 == i) {
            return iArr;
        }
        Integer numValueOf = Integer.valueOf(i22);
        Object[] objArr2 = new Object[3];
        objArr2[0] = iArr;
        objArr2[i28] = numValueOf;
        objArr2[2] = rj3Var;
        return objArr2;
    }

    public static Object r(Object obj, Object[] objArr, int i, int i2, Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i == 1) {
            Object obj3 = objArr[i2];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i2 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int iA0 = y97.a0(obj2.hashCode());
            while (true) {
                int i3 = iA0 & length;
                int i4 = bArr[i3] & 255;
                if (i4 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i4])) {
                    return objArr[i4 ^ 1];
                }
                iA0 = i3 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int iA02 = y97.a0(obj2.hashCode());
            while (true) {
                int i5 = iA02 & length2;
                int i6 = sArr[i5] & 65535;
                if (i6 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i6])) {
                    return objArr[i6 ^ 1];
                }
                iA02 = i5 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int iA03 = y97.a0(obj2.hashCode());
            while (true) {
                int i7 = iA03 & length3;
                int i8 = iArr[i7];
                if (i8 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i8])) {
                    return objArr[i8 ^ 1];
                }
                iA03 = i7 + 1;
            }
        }
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet c() {
        return new EntrySet(this, this.e, 0, this.f);
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableSet e() {
        return new KeySet(this, new KeysOrValuesAsList(this.e, 0, this.f));
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection f() {
        return new KeysOrValuesAsList(this.e, 1, this.f);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Object get(Object obj) {
        Object objR = r(this.d, this.e, this.f, 0, obj);
        if (objR == null) {
            return null;
        }
        return objR;
    }

    @Override // com.google.common.collect.ImmutableMap
    public final boolean i() {
        return false;
    }

    @Override // java.util.Map
    public final int size() {
        return this.f;
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return super.writeReplace();
    }
}
