package androidx.room;

import defpackage.cc8;
import defpackage.dc8;
import defpackage.do3;
import defpackage.e51;
import defpackage.g27;
import defpackage.js3;
import defpackage.ps0;
import defpackage.qp2;
import defpackage.s11;
import defpackage.vz1;
import defpackage.w61;
import defpackage.wu0;
import defpackage.xj1;
import defpackage.yh0;
import defpackage.ym;
import defpackage.zw3;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NotImplementedError;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public e51 a;
    public w61 b;
    public Executor c;
    public ym d;
    public xj1 e;
    public a f;
    public final do3 g;
    public final ThreadLocal h;
    public final LinkedHashMap i;
    public boolean j;

    public d() {
        new RoomDatabase$closeBarrier$1(0, this, d.class, "onClosed", "onClosed()V", 0);
        do3 do3Var = new do3();
        do3Var.a = new AtomicInteger(0);
        do3Var.b = new AtomicBoolean(false);
        this.g = do3Var;
        this.h = new ThreadLocal();
        this.i = new LinkedHashMap();
        this.j = true;
    }

    public List a(LinkedHashMap linkedHashMap) {
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(kotlin.collections.b.L(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(yh0.u((zw3) entry.getKey()), entry.getValue());
        }
        return EmptyList.a;
    }

    public abstract a b();

    public vz1 c() {
        throw new NotImplementedError();
    }

    public final a d() {
        a aVar = this.f;
        if (aVar != null) {
            return aVar;
        }
        js3.V("internalTracker");
        throw null;
    }

    public Set e() {
        return kotlin.collections.a.T0(new ArrayList(wu0.V(EmptySet.a, 10)));
    }

    public LinkedHashMap f() {
        Set<Map.Entry> setEntrySet = kotlin.collections.b.I().entrySet();
        int iL = kotlin.collections.b.L(wu0.V(setEntrySet, 10));
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List<Class> list = (List) entry.getValue();
            js3.p(cls, "<this>");
            ps0 ps0VarA = g27.a(cls);
            ArrayList arrayList = new ArrayList(wu0.V(list, 10));
            for (Class cls2 : list) {
                js3.p(cls2, "<this>");
                arrayList.add(g27.a(cls2));
            }
            linkedHashMap.put(ps0VarA, arrayList);
        }
        return linkedHashMap;
    }

    public final boolean g() {
        xj1 xj1Var = this.e;
        if (xj1Var != null) {
            return ((dc8) xj1Var.h) != null;
        }
        js3.V("connectionManager");
        throw null;
    }

    public final boolean h() {
        if (!i()) {
            return false;
        }
        xj1 xj1Var = this.e;
        if (xj1Var == null) {
            js3.V("connectionManager");
            throw null;
        }
        dc8 dc8Var = (dc8) xj1Var.h;
        if (dc8Var != null) {
            return dc8Var.p0().n();
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    public final boolean i() {
        xj1 xj1Var = this.e;
        if (xj1Var == null) {
            js3.V("connectionManager");
            throw null;
        }
        cc8 cc8Var = (cc8) xj1Var.i;
        if (cc8Var != null) {
            return cc8Var.isOpen();
        }
        return false;
    }

    public final Object j(boolean z, qp2 qp2Var, ContinuationImpl continuationImpl) {
        xj1 xj1Var = this.e;
        if (xj1Var != null) {
            return ((s11) xj1Var.g).M(z, qp2Var, continuationImpl);
        }
        js3.V("connectionManager");
        throw null;
    }
}
