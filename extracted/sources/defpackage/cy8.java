package defpackage;

import com.google.protobuf.ByteString;
import j$.util.DesugarCollections;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class cy8 extends AbstractList implements i44, RandomAccess {
    public final h44 a;

    public cy8(h44 h44Var) {
        this.a = h44Var;
    }

    @Override // defpackage.i44
    public final void I(ByteString byteString) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.i44
    public final Object a1(int i) {
        return this.a.b.get(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        by8 by8Var = new by8();
        by8Var.a = this.a.iterator();
        return by8Var;
    }

    @Override // defpackage.i44
    public final List k() {
        return DesugarCollections.unmodifiableList(this.a.b);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        ay8 ay8Var = new ay8();
        ay8Var.a = this.a.listIterator(i);
        return ay8Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.b.size();
    }

    @Override // defpackage.i44
    public final i44 R0() {
        return this;
    }
}
