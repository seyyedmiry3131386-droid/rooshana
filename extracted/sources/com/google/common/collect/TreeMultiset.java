package com.google.common.collect;

import defpackage.b47;
import defpackage.js8;
import defpackage.q18;
import defpackage.tt3;
import defpackage.vo4;
import defpackage.vy2;
import defpackage.wn5;
import j$.util.Objects;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class TreeMultiset<E> extends x implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient GeneralRange e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class Aggregate {
        public static final /* synthetic */ Aggregate[] a = {new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.1
        }, new Aggregate() { // from class: com.google.common.collect.TreeMultiset.Aggregate.2
        }};

        /* JADX INFO: Fake field, exist only in values array */
        Aggregate EF2;

        public static Aggregate valueOf(String str) {
            return (Aggregate) Enum.valueOf(Aggregate.class, str);
        }

        public static Aggregate[] values() {
            return (Aggregate[]) a.clone();
        }
    }

    public TreeMultiset(GeneralRange generalRange) {
        super(generalRange.a);
        this.e = generalRange;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        Comparator comparator = (Comparator) object;
        b47.f("comparator", x.class).m(this, comparator);
        vo4 vo4VarF = b47.f("range", TreeMultiset.class);
        BoundType boundType = BoundType.a;
        vo4VarF.m(this, new GeneralRange(comparator, false, null, boundType, false, null, boundType));
        b47.f("rootReference", TreeMultiset.class).m(this, new js8());
        b47.f("header", TreeMultiset.class).m(this, new v1());
        b47.l(this, objectInputStream, objectInputStream.readInt());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(b().comparator());
        b47.y(this, objectOutputStream);
    }

    @Override // defpackage.q18
    public final q18 D0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.e.b(new GeneralRange(this.c, true, obj, boundType, false, null, BoundType.a)));
    }

    @Override // com.google.common.collect.w, defpackage.oa5
    public final boolean K(int i, Object obj) {
        vy2.m(0, "newCount");
        vy2.m(i, "oldCount");
        wn5.j(this.e.a(obj));
        throw null;
    }

    @Override // defpackage.oa5
    public final int add(int i, Object obj) {
        vy2.m(i, "occurrences");
        if (i == 0) {
            try {
                throw null;
            } catch (NullPointerException unused) {
                return 0;
            }
        }
        wn5.j(this.e.a(obj));
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        GeneralRange generalRange = this.e;
        if (!generalRange.b && generalRange.e) {
            throw null;
        }
        throw null;
    }

    @Override // com.google.common.collect.w
    public final int e() {
        throw null;
    }

    @Override // com.google.common.collect.w
    public final Iterator f() {
        throw null;
    }

    @Override // com.google.common.collect.w
    public final Iterator h() {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return tt3.D(this);
    }

    @Override // defpackage.oa5
    public final int j1(Object obj) {
        vy2.m(0, "count");
        if (this.e.a(obj)) {
            throw null;
        }
        return 0;
    }

    @Override // defpackage.q18
    public final q18 k0(Object obj, BoundType boundType) {
        return new TreeMultiset(this.e.b(new GeneralRange(this.c, false, null, BoundType.a, true, obj, boundType)));
    }

    @Override // defpackage.oa5
    public final int s0(Object obj) {
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        throw null;
    }

    @Override // defpackage.oa5
    public final int w0(int i, Object obj) {
        vy2.m(i, "occurrences");
        if (i != 0) {
            throw null;
        }
        try {
            throw null;
        } catch (NullPointerException unused) {
            return 0;
        }
    }
}
