package com.google.common.collect;

import defpackage.a84;
import defpackage.b84;
import defpackage.d94;
import defpackage.ha5;
import defpackage.s7;
import defpackage.x74;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class LinkedListMultimap<K, V> extends defpackage.n1 implements d94, Serializable {
    private static final long serialVersionUID = 0;
    public transient b84 f;
    public transient b84 g;
    public transient Map h;
    public transient int i;
    public transient int j;

    public static void l(LinkedListMultimap linkedListMultimap, b84 b84Var) {
        b84 b84Var2 = b84Var.d;
        Object obj = b84Var.a;
        if (b84Var2 != null) {
            b84Var2.c = b84Var.c;
        } else {
            linkedListMultimap.f = b84Var.c;
        }
        b84 b84Var3 = b84Var.c;
        if (b84Var3 != null) {
            b84Var3.d = b84Var2;
        } else {
            linkedListMultimap.g = b84Var2;
        }
        if (b84Var.f == null && b84Var.e == null) {
            a84 a84Var = (a84) ((CompactHashMap) linkedListMultimap.h).remove(obj);
            Objects.requireNonNull(a84Var);
            a84Var.c = 0;
            linkedListMultimap.j++;
        } else {
            a84 a84Var2 = (a84) ((CompactHashMap) linkedListMultimap.h).get(obj);
            Objects.requireNonNull(a84Var2);
            a84Var2.c--;
            b84 b84Var4 = b84Var.f;
            if (b84Var4 == null) {
                b84 b84Var5 = b84Var.e;
                Objects.requireNonNull(b84Var5);
                a84Var2.a = b84Var5;
            } else {
                b84Var4.e = b84Var.e;
            }
            b84 b84Var6 = b84Var.e;
            if (b84Var6 == null) {
                b84 b84Var7 = b84Var.f;
                Objects.requireNonNull(b84Var7);
                a84Var2.b = b84Var7;
            } else {
                b84Var6.f = b84Var.f;
            }
        }
        linkedListMultimap.i--;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.h = new CompactLinkedHashMap();
        int i = objectInputStream.readInt();
        for (int i2 = 0; i2 < i; i2++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(this.i);
        Collection collectionN = this.a;
        if (collectionN == null) {
            collectionN = n();
            this.a = collectionN;
        }
        for (Map.Entry entry : (List) collectionN) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    @Override // defpackage.n1
    public final boolean b(Object obj) {
        return ((List) super.values()).contains(obj);
    }

    @Override // defpackage.n1
    public final Map c() {
        return new ha5(this);
    }

    @Override // defpackage.fa5
    public final void clear() {
        this.f = null;
        this.g = null;
        ((CompactLinkedHashMap) this.h).clear();
        this.i = 0;
        this.j++;
    }

    @Override // defpackage.fa5
    public final boolean containsKey(Object obj) {
        return ((CompactHashMap) this.h).containsKey(obj);
    }

    @Override // defpackage.n1
    public final Set e() {
        return new w0(this);
    }

    @Override // defpackage.n1
    public final Collection f() {
        return new x74(this, 1);
    }

    @Override // defpackage.n1
    public final Collection g() {
        Collection collectionN = this.a;
        if (collectionN == null) {
            collectionN = n();
            this.a = collectionN;
        }
        return (List) collectionN;
    }

    @Override // defpackage.fa5
    public final Collection get(Object obj) {
        return new v0(this, obj);
    }

    @Override // defpackage.n1, defpackage.fa5
    public final boolean isEmpty() {
        return this.f == null;
    }

    @Override // defpackage.n1
    public final Iterator j() {
        throw new AssertionError("should never be called");
    }

    public final b84 m(Object obj, Object obj2, b84 b84Var) {
        b84 b84Var2 = new b84(obj, obj2);
        if (this.f == null) {
            this.g = b84Var2;
            this.f = b84Var2;
            ((CompactHashMap) this.h).put(obj, new a84(b84Var2));
            this.j++;
        } else if (b84Var == null) {
            b84 b84Var3 = this.g;
            Objects.requireNonNull(b84Var3);
            b84Var3.c = b84Var2;
            b84Var2.d = this.g;
            this.g = b84Var2;
            a84 a84Var = (a84) ((CompactHashMap) this.h).get(obj);
            if (a84Var == null) {
                ((CompactHashMap) this.h).put(obj, new a84(b84Var2));
                this.j++;
            } else {
                a84Var.c++;
                b84 b84Var4 = a84Var.b;
                b84Var4.e = b84Var2;
                b84Var2.f = b84Var4;
                a84Var.b = b84Var2;
            }
        } else {
            a84 a84Var2 = (a84) ((CompactHashMap) this.h).get(obj);
            Objects.requireNonNull(a84Var2);
            a84Var2.c++;
            b84Var2.d = b84Var.d;
            b84Var2.f = b84Var.f;
            b84Var2.c = b84Var;
            b84Var2.e = b84Var;
            b84 b84Var5 = b84Var.f;
            if (b84Var5 == null) {
                a84Var2.a = b84Var2;
            } else {
                b84Var5.e = b84Var2;
            }
            b84 b84Var6 = b84Var.d;
            if (b84Var6 == null) {
                this.f = b84Var2;
            } else {
                b84Var6.c = b84Var2;
            }
            b84Var.d = b84Var2;
            b84Var.f = b84Var2;
        }
        this.i++;
        return b84Var2;
    }

    public final Collection n() {
        return new x74(this, 0);
    }

    @Override // defpackage.fa5
    public final boolean put(Object obj, Object obj2) {
        m(obj, obj2, null);
        return true;
    }

    @Override // defpackage.fa5
    public final int size() {
        return this.i;
    }

    @Override // defpackage.n1, defpackage.fa5
    public final Collection values() {
        return (List) super.values();
    }

    @Override // defpackage.fa5
    public final List a(Object obj) {
        x0 x0Var = new x0(this, obj);
        ArrayList arrayList = new ArrayList();
        s7.c(arrayList, x0Var);
        List listUnmodifiableList = DesugarCollections.unmodifiableList(arrayList);
        s7.f(new x0(this, obj));
        return listUnmodifiableList;
    }

    @Override // defpackage.fa5
    public final List get(Object obj) {
        return new v0(this, obj);
    }
}
