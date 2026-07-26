package com.google.common.collect;

import com.google.common.collect.Range;
import defpackage.bv6;
import defpackage.mj3;
import defpackage.vy2;
import defpackage.wn5;
import defpackage.wu8;
import defpackage.zx8;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ImmutableRangeMap<K extends Comparable<?>, V> implements bv6, Serializable {
    public static final ImmutableRangeMap c;
    private static final long serialVersionUID = 0;
    public final transient ImmutableList a;
    public final transient ImmutableList b;

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$1, reason: invalid class name */
    class AnonymousClass1 extends ImmutableList<Range<Comparable<?>>> {
        @Override // java.util.List
        public final Object get(int i) {
            wn5.l(i, 0);
            if (i == 0 || i == -1) {
                throw null;
            }
            throw null;
        }

        @Override // com.google.common.collect.ImmutableCollection
        public final boolean i() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public final int size() {
            return 0;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ImmutableRangeMap$2, reason: invalid class name */
    class AnonymousClass2 extends ImmutableRangeMap<Comparable<?>, Object> {
        @Override // com.google.common.collect.ImmutableRangeMap, defpackage.bv6
        public final /* bridge */ /* synthetic */ ImmutableMap a() {
            return a();
        }

        @Override // com.google.common.collect.ImmutableRangeMap
        public Object writeReplace() {
            return super.writeReplace();
        }
    }

    public static class SerializedForm<K extends Comparable<?>, V> implements Serializable {
        private static final long serialVersionUID = 0;
        public final ImmutableMap a;

        public SerializedForm(ImmutableMap immutableMap) {
            this.a = immutableMap;
        }

        public Object readResolve() {
            ImmutableMap immutableMap = this.a;
            if (immutableMap.isEmpty()) {
                return ImmutableRangeMap.c;
            }
            ArrayList arrayList = new ArrayList();
            zx8 it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                Range range = (Range) entry.getKey();
                Object value = entry.getValue();
                range.getClass();
                value.getClass();
                wn5.g(range, "Range must not be empty, but was %s", !range.a.equals(range.b));
                arrayList.add(new ImmutableEntry(range, value));
            }
            Range range2 = Range.c;
            p1 p1Var = Range.RangeLexOrdering.a;
            p1Var.getClass();
            Collections.sort(arrayList, new ByFunctionOrdering(Maps$EntryFunction.a, p1Var));
            int size = arrayList.size();
            vy2.m(size, "initialCapacity");
            Object[] objArrCopyOf = new Object[size];
            int size2 = arrayList.size();
            vy2.m(size2, "initialCapacity");
            Object[] objArrCopyOf2 = new Object[size2];
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (i < arrayList.size()) {
                Range range3 = (Range) ((Map.Entry) arrayList.get(i)).getKey();
                if (i > 0) {
                    Range range4 = (Range) ((Map.Entry) arrayList.get(i - 1)).getKey();
                    if (range3.e(range4)) {
                        Range rangeC = range3.c(range4);
                        if (!rangeC.a.equals(rangeC.b)) {
                            throw new IllegalArgumentException("Overlapping ranges: range " + range4 + " overlaps with entry " + range3);
                        }
                    }
                }
                range3.getClass();
                int i4 = i2 + 1;
                int iT = wu8.t(objArrCopyOf.length, i4);
                if (iT > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iT);
                }
                objArrCopyOf[i2] = range3;
                Object value2 = ((Map.Entry) arrayList.get(i)).getValue();
                value2.getClass();
                int i5 = i3 + 1;
                int iT2 = wu8.t(objArrCopyOf2.length, i5);
                if (iT2 > objArrCopyOf2.length) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iT2);
                }
                objArrCopyOf2[i3] = value2;
                i++;
                i3 = i5;
                i2 = i4;
            }
            return new ImmutableRangeMap(ImmutableList.l(i2, objArrCopyOf), ImmutableList.l(i3, objArrCopyOf2));
        }
    }

    static {
        mj3 mj3Var = ImmutableList.b;
        ImmutableList immutableList = RegularImmutableList.e;
        c = new ImmutableRangeMap(immutableList, immutableList);
    }

    public ImmutableRangeMap(ImmutableList immutableList, ImmutableList immutableList2) {
        this.a = immutableList;
        this.b = immutableList2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.bv6
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ImmutableMap a() {
        ImmutableList immutableList = this.a;
        if (immutableList.isEmpty()) {
            return RegularImmutableMap.g;
        }
        Range range = Range.c;
        return new ImmutableSortedMap(new RegularImmutableSortedSet(immutableList, Range.RangeLexOrdering.a), this.b, null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bv6) {
            return a().equals(((bv6) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a().toString();
    }

    public Object writeReplace() {
        return new SerializedForm(a());
    }
}
