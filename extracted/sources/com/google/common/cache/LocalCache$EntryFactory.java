package com.google.common.cache;

import defpackage.ac4;
import defpackage.bc4;
import defpackage.c27;
import defpackage.cc4;
import defpackage.gc4;
import defpackage.hc4;
import defpackage.ic4;
import java.util.logging.Logger;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
abstract class LocalCache$EntryFactory {
    public static final LocalCache$EntryFactory[] a;
    public static final /* synthetic */ LocalCache$EntryFactory[] b;

    /* JADX INFO: Fake field, exist only in values array */
    LocalCache$EntryFactory EF0;

    static {
        LocalCache$EntryFactory localCache$EntryFactory = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.1
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                return new cc4(obj, i, c27Var);
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory2 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.2
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
                c27 c27VarB = super.b(localCache$Segment, c27Var, c27Var2, obj);
                LocalCache$EntryFactory.a(c27Var, c27VarB);
                return c27VarB;
            }

            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                ac4 ac4Var = new ac4(obj, i, c27Var, 0);
                ac4Var.f = Long.MAX_VALUE;
                Logger logger = d.t;
                LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
                ac4Var.g = localCache$NullEntry;
                ac4Var.h = localCache$NullEntry;
                return ac4Var;
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory3 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.3
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
                c27 c27VarB = super.b(localCache$Segment, c27Var, c27Var2, obj);
                LocalCache$EntryFactory.c(c27Var, c27VarB);
                return c27VarB;
            }

            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                ac4 ac4Var = new ac4(obj, i, c27Var, 1);
                ac4Var.f = Long.MAX_VALUE;
                Logger logger = d.t;
                LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
                ac4Var.g = localCache$NullEntry;
                ac4Var.h = localCache$NullEntry;
                return ac4Var;
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory4 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.4
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
                c27 c27VarB = super.b(localCache$Segment, c27Var, c27Var2, obj);
                LocalCache$EntryFactory.a(c27Var, c27VarB);
                LocalCache$EntryFactory.c(c27Var, c27VarB);
                return c27VarB;
            }

            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                bc4 bc4Var = new bc4(obj, i, c27Var);
                bc4Var.e = Long.MAX_VALUE;
                Logger logger = d.t;
                LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
                bc4Var.f = localCache$NullEntry;
                bc4Var.g = localCache$NullEntry;
                bc4Var.h = Long.MAX_VALUE;
                bc4Var.i = localCache$NullEntry;
                bc4Var.j = localCache$NullEntry;
                return bc4Var;
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory5 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.5
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                return new ic4(localCache$Segment.h, obj, i, c27Var);
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory6 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.6
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
                c27 c27VarB = super.b(localCache$Segment, c27Var, c27Var2, obj);
                LocalCache$EntryFactory.a(c27Var, c27VarB);
                return c27VarB;
            }

            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                gc4 gc4Var = new gc4(localCache$Segment.h, obj, i, c27Var, 0);
                gc4Var.e = Long.MAX_VALUE;
                Logger logger = d.t;
                LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
                gc4Var.f = localCache$NullEntry;
                gc4Var.g = localCache$NullEntry;
                return gc4Var;
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory7 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.7
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
                c27 c27VarB = super.b(localCache$Segment, c27Var, c27Var2, obj);
                LocalCache$EntryFactory.c(c27Var, c27VarB);
                return c27VarB;
            }

            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                gc4 gc4Var = new gc4(localCache$Segment.h, obj, i, c27Var, 1);
                gc4Var.e = Long.MAX_VALUE;
                Logger logger = d.t;
                LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
                gc4Var.f = localCache$NullEntry;
                gc4Var.g = localCache$NullEntry;
                return gc4Var;
            }
        };
        LocalCache$EntryFactory localCache$EntryFactory8 = new LocalCache$EntryFactory() { // from class: com.google.common.cache.LocalCache$EntryFactory.8
            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
                c27 c27VarB = super.b(localCache$Segment, c27Var, c27Var2, obj);
                LocalCache$EntryFactory.a(c27Var, c27VarB);
                LocalCache$EntryFactory.c(c27Var, c27VarB);
                return c27VarB;
            }

            @Override // com.google.common.cache.LocalCache$EntryFactory
            public final c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var) {
                hc4 hc4Var = new hc4(localCache$Segment.h, obj, i, c27Var);
                hc4Var.d = Long.MAX_VALUE;
                Logger logger = d.t;
                LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
                hc4Var.e = localCache$NullEntry;
                hc4Var.f = localCache$NullEntry;
                hc4Var.g = Long.MAX_VALUE;
                hc4Var.h = localCache$NullEntry;
                hc4Var.i = localCache$NullEntry;
                return hc4Var;
            }
        };
        b = new LocalCache$EntryFactory[]{localCache$EntryFactory, localCache$EntryFactory2, localCache$EntryFactory3, localCache$EntryFactory4, localCache$EntryFactory5, localCache$EntryFactory6, localCache$EntryFactory7, localCache$EntryFactory8};
        a = new LocalCache$EntryFactory[]{localCache$EntryFactory, localCache$EntryFactory2, localCache$EntryFactory3, localCache$EntryFactory4, localCache$EntryFactory5, localCache$EntryFactory6, localCache$EntryFactory7, localCache$EntryFactory8};
    }

    public static void a(c27 c27Var, c27 c27Var2) {
        c27Var2.j(c27Var.m());
        c27 c27VarE = c27Var.e();
        Logger logger = d.t;
        c27VarE.p(c27Var2);
        c27Var2.k(c27VarE);
        c27 c27VarO = c27Var.o();
        c27Var2.p(c27VarO);
        c27VarO.k(c27Var2);
        LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
        c27Var.p(localCache$NullEntry);
        c27Var.k(localCache$NullEntry);
    }

    public static void c(c27 c27Var, c27 c27Var2) {
        c27Var2.n(c27Var.g());
        c27 c27VarQ = c27Var.q();
        Logger logger = d.t;
        c27VarQ.i(c27Var2);
        c27Var2.h(c27VarQ);
        c27 c27VarL = c27Var.l();
        c27Var2.i(c27VarL);
        c27VarL.h(c27Var2);
        LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
        c27Var.i(localCache$NullEntry);
        c27Var.h(localCache$NullEntry);
    }

    public static LocalCache$EntryFactory valueOf(String str) {
        return (LocalCache$EntryFactory) Enum.valueOf(LocalCache$EntryFactory.class, str);
    }

    public static LocalCache$EntryFactory[] values() {
        return (LocalCache$EntryFactory[]) b.clone();
    }

    public c27 b(LocalCache$Segment localCache$Segment, c27 c27Var, c27 c27Var2, Object obj) {
        return e(localCache$Segment, obj, c27Var.c(), c27Var2);
    }

    public abstract c27 e(LocalCache$Segment localCache$Segment, Object obj, int i, c27 c27Var);
}
