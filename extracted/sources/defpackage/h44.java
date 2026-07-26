package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.z;
import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class h44 extends z1 implements i44, RandomAccess {
    public final List b;

    static {
        new h44();
    }

    public h44(ArrayList arrayList) {
        super(true);
        this.b = arrayList;
    }

    @Override // defpackage.i44
    public final void I(ByteString byteString) {
        a();
        this.b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.i44
    public final i44 R0() {
        return this.a ? new cy8(this) : this;
    }

    @Override // defpackage.i44
    public final Object a1(int i) {
        return this.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        a();
        this.b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.z1, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.b.size(), collection);
    }

    @Override // defpackage.z1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        a();
        this.b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // defpackage.rr3
    public final rr3 g(int i) {
        List list = this.b;
        if (i < list.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(list);
        return new h44(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        List list = this.b;
        Object obj = list.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strW = byteString.w();
            if (byteString.n()) {
                list.set(i, strW);
            }
            return strW;
        }
        byte[] bArr = (byte[]) obj;
        String str = new String(bArr, tr3.a);
        if (z.a.p(bArr, 0, bArr.length)) {
            list.set(i, str);
        }
        return str;
    }

    @Override // defpackage.i44
    public final List k() {
        return DesugarCollections.unmodifiableList(this.b);
    }

    @Override // defpackage.z1, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        Object objRemove = this.b.remove(i);
        ((AbstractList) this).modCount++;
        return objRemove instanceof String ? (String) objRemove : objRemove instanceof ByteString ? ((ByteString) objRemove).w() : new String((byte[]) objRemove, tr3.a);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        Object obj2 = this.b.set(i, (String) obj);
        return obj2 instanceof String ? (String) obj2 : obj2 instanceof ByteString ? ((ByteString) obj2).w() : new String((byte[]) obj2, tr3.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b.size();
    }

    public h44() {
        super(false);
        this.b = Collections.EMPTY_LIST;
    }

    @Override // defpackage.z1, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        a();
        if (collection instanceof i44) {
            collection = ((i44) collection).k();
        }
        boolean zAddAll = this.b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    public h44(int i) {
        this(new ArrayList(i));
    }
}
