package kotlin.enums;

import defpackage.dw1;
import defpackage.ew;
import defpackage.js3;
import defpackage.r22;
import defpackage.z0;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: loaded from: classes3.dex */
final class EnumEntriesList<T extends Enum<T>> extends z0 implements r22, Serializable {
    public final Enum[] a;

    public EnumEntriesList(Enum[] enumArr) {
        js3.p(enumArr, "entries");
        this.a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new EnumEntriesSerializationProxy(this.a);
    }

    @Override // defpackage.o
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r4 = (Enum) obj;
        return ((Enum) ew.M0(r4.ordinal(), this.a)) == r4;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Enum[] enumArr = this.a;
        int length = enumArr.length;
        if (i < 0 || i >= length) {
            throw new IndexOutOfBoundsException(dw1.j(i, length, "index: ", ", size: "));
        }
        return enumArr[i];
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) ew.M0(iOrdinal, this.a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r4 = (Enum) obj;
        int iOrdinal = r4.ordinal();
        if (((Enum) ew.M0(iOrdinal, this.a)) == r4) {
            return iOrdinal;
        }
        return -1;
    }
}
