package com.google.common.collect;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import defpackage.vy2;
import defpackage.wn5;
import defpackage.wu8;
import defpackage.z2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableTable<R, C, V> extends z2 implements Serializable {
    private static final long serialVersionUID = 912559;

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;
        public final Object[] a;
        public final Object[] b;
        public final Object[] c;
        public final int[] d;
        public final int[] e;

        public SerializedForm(Object[] objArr, Object[] objArr2, Object[] objArr3, int[] iArr, int[] iArr2) {
            this.a = objArr;
            this.b = objArr2;
            this.c = objArr3;
            this.d = iArr;
            this.e = iArr2;
        }

        public static SerializedForm a(ImmutableTable immutableTable, int[] iArr, int[] iArr2) {
            ImmutableSet immutableSetKeySet = immutableTable.f().keySet();
            Object[] objArr = ImmutableCollection.a;
            Object[] array = immutableSetKeySet.toArray(objArr);
            Object[] array2 = immutableTable.j().keySet().toArray(objArr);
            Collection collectionM = immutableTable.b;
            if (collectionM == null) {
                collectionM = immutableTable.m();
                immutableTable.b = collectionM;
            }
            return new SerializedForm(array, array2, ((ImmutableCollection) collectionM).toArray(objArr), iArr, iArr2);
        }

        public Object readResolve() {
            Object[] objArr = this.c;
            if (objArr.length == 0) {
                return SparseImmutableTable.g;
            }
            int length = objArr.length;
            Object[] objArr2 = this.b;
            Object[] objArr3 = this.a;
            int i = 0;
            if (length == 1) {
                return new SingletonImmutableTable(objArr3[0], objArr2[0], objArr[0]);
            }
            int length2 = objArr.length;
            vy2.m(length2, "initialCapacity");
            Object[] objArrCopyOf = new Object[length2];
            int i2 = 0;
            while (i < objArr.length) {
                u1 u1VarH = ImmutableTable.h(objArr3[this.d[i]], objArr2[this.e[i]], objArr[i]);
                int i3 = i2 + 1;
                int iT = wu8.t(objArrCopyOf.length, i3);
                if (iT > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iT);
                }
                objArrCopyOf[i2] = u1VarH;
                i++;
                i2 = i3;
            }
            ImmutableList immutableListL = ImmutableList.l(i2, objArrCopyOf);
            ImmutableSet immutableSetO = ImmutableSet.o(objArr3);
            ImmutableSet immutableSetO2 = ImmutableSet.o(objArr2);
            return ((long) ((RegularImmutableList) immutableListL).d) > (((long) immutableSetO.size()) * ((long) immutableSetO2.size())) / 2 ? new DenseImmutableTable(immutableListL, immutableSetO, immutableSetO2) : new SparseImmutableTable(immutableListL, immutableSetO, immutableSetO2);
        }
    }

    public static u1 h(Object obj, Object obj2, Object obj3) {
        wn5.m(obj, "rowKey");
        wn5.m(obj2, "columnKey");
        wn5.m(obj3, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return new Tables$ImmutableCell(obj, obj2, obj3);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // defpackage.z2
    public final Iterator a() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.z2
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.he8
    public final Set c() {
        Set setE = this.a;
        if (setE == null) {
            setE = e();
            this.a = setE;
        }
        return (ImmutableSet) setE;
    }

    public final ImmutableSet i() {
        Set setE = this.a;
        if (setE == null) {
            setE = e();
            this.a = setE;
        }
        return (ImmutableSet) setE;
    }

    public abstract ImmutableMap j();

    @Override // defpackage.z2
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableSet e();

    @Override // 
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableCollection m();

    @Override // defpackage.he8
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableMap f();

    public abstract Object writeReplace();
}
