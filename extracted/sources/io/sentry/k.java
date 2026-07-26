package io.sentry;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class k implements a1 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ k(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // io.sentry.a1
    public Map A() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((a1) this.b).A());
        concurrentHashMap.putAll(((a1) this.c).A());
        concurrentHashMap.putAll(((a1) this.d).A());
        return concurrentHashMap;
    }

    @Override // io.sentry.a1
    public List B() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((a1) this.b).B());
        copyOnWriteArrayList.addAll(((a1) this.c).B());
        copyOnWriteArrayList.addAll(((a1) this.d).B());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.a1
    public List C() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(((a1) this.b).C());
        copyOnWriteArrayList.addAll(((a1) this.c).C());
        copyOnWriteArrayList.addAll(((a1) this.d).C());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.a1
    public void D(w4 w4Var) {
        ((a1) this.b).D(w4Var);
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.e E() {
        a1 a1Var = (a1) this.b;
        return new i(a1Var.E(), ((a1) this.c).E(), ((a1) this.d).E(), a1Var.m().getDefaultScopeType());
    }

    @Override // io.sentry.a1
    public k F(v3 v3Var) {
        return b(null).F(v3Var);
    }

    @Override // io.sentry.a1
    public String G() {
        String strG = ((a1) this.d).G();
        if (strG != null) {
            return strG;
        }
        String strG2 = ((a1) this.c).G();
        return strG2 != null ? strG2 : ((a1) this.b).G();
    }

    @Override // io.sentry.a1
    public void H(x3 x3Var) {
        b(null).H(x3Var);
    }

    @Override // io.sentry.a1
    public void I(io.sentry.protocol.v vVar) {
        ((a1) this.b).I(vVar);
        ((a1) this.c).I(vVar);
        ((a1) this.d).I(vVar);
    }

    @Override // io.sentry.a1
    public void J(m1 m1Var) {
        b(null).J(m1Var);
    }

    @Override // io.sentry.a1
    public List K() {
        List listK = ((a1) this.d).K();
        if (!listK.isEmpty()) {
            return listK;
        }
        List listK2 = ((a1) this.c).K();
        return !listK2.isEmpty() ? listK2 : ((a1) this.b).K();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.g0 L() {
        io.sentry.protocol.g0 g0VarL = ((a1) this.d).L();
        if (g0VarL != null) {
            return g0VarL;
        }
        io.sentry.protocol.g0 g0VarL2 = ((a1) this.c).L();
        return g0VarL2 != null ? g0VarL2 : ((a1) this.b).L();
    }

    @Override // io.sentry.a1
    public List M() {
        return io.sentry.config.a.d0((CopyOnWriteArrayList) B());
    }

    @Override // io.sentry.a1
    public String N() {
        String strN = ((a1) this.d).N();
        if (strN != null) {
            return strN;
        }
        String strN2 = ((a1) this.c).N();
        return strN2 != null ? strN2 : ((a1) this.b).N();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.q a() {
        io.sentry.protocol.q qVarA = ((a1) this.d).a();
        if (qVarA != null) {
            return qVarA;
        }
        io.sentry.protocol.q qVarA2 = ((a1) this.c).a();
        return qVarA2 != null ? qVarA2 : ((a1) this.b).a();
    }

    public a1 b(ScopeType scopeType) {
        a1 a1Var = (a1) this.c;
        a1 a1Var2 = (a1) this.d;
        a1 a1Var3 = (a1) this.b;
        if (scopeType != null) {
            int i = j.a[scopeType.ordinal()];
            if (i == 1) {
                return a1Var2;
            }
            if (i == 2) {
                return a1Var;
            }
            if (i == 3) {
                return a1Var3;
            }
            if (i == 4) {
                return this;
            }
        }
        int i2 = j.a[a1Var3.m().getDefaultScopeType().ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? a1Var2 : a1Var3 : a1Var : a1Var2;
    }

    public String c() {
        Boolean bool = (Boolean) this.d;
        String str = (bool == null || !bool.booleanValue()) ? "00" : "01";
        return "00-" + ((io.sentry.protocol.v) this.b) + "-" + ((m6) this.c) + "-" + str;
    }

    @Override // io.sentry.a1
    public void clear() {
        b(null).clear();
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object m33clone() {
        switch (this.a) {
            case 0:
                return clone();
            default:
                return super.clone();
        }
    }

    @Override // io.sentry.a1
    public k1 d() {
        k1 k1VarD = ((a1) this.d).d();
        if (k1VarD != null) {
            return k1VarD;
        }
        k1 k1VarD2 = ((a1) this.c).d();
        return k1VarD2 != null ? k1VarD2 : ((a1) this.b).d();
    }

    @Override // io.sentry.a1
    public void g(Throwable th, j6 j6Var, String str) {
        ((a1) this.b).g(th, j6Var, str);
    }

    @Override // io.sentry.a1
    public Map getAttributes() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((a1) this.b).getAttributes());
        concurrentHashMap.putAll(((a1) this.c).getAttributes());
        concurrentHashMap.putAll(((a1) this.d).getAttributes());
        return concurrentHashMap;
    }

    @Override // io.sentry.a1
    public Map getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(((a1) this.b).getExtras());
        concurrentHashMap.putAll(((a1) this.c).getExtras());
        concurrentHashMap.putAll(((a1) this.d).getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.a1
    public SentryLevel getLevel() {
        SentryLevel level = ((a1) this.d).getLevel();
        if (level != null) {
            return level;
        }
        SentryLevel level2 = ((a1) this.c).getLevel();
        return level2 != null ? level2 : ((a1) this.b).getLevel();
    }

    @Override // io.sentry.a1
    public void h(f fVar, h0 h0Var) {
        b(null).h(fVar, h0Var);
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.i i() {
        return s().i();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.v k() {
        io.sentry.protocol.v vVarK = ((a1) this.d).k();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.b;
        if (!vVar.equals(vVarK)) {
            return vVarK;
        }
        io.sentry.protocol.v vVarK2 = ((a1) this.c).k();
        return !vVar.equals(vVarK2) ? vVarK2 : ((a1) this.b).k();
    }

    @Override // io.sentry.a1
    public void l(io.sentry.protocol.v vVar) {
        b(null).l(vVar);
    }

    @Override // io.sentry.a1
    public b6 m() {
        return ((a1) this.b).m();
    }

    @Override // io.sentry.a1
    public void n(io.sentry.protocol.g0 g0Var) {
        b(null).n(g0Var);
    }

    @Override // io.sentry.a1
    public m1 o() {
        m1 m1VarO = ((a1) this.d).o();
        if (m1VarO != null) {
            return m1VarO;
        }
        m1 m1VarO2 = ((a1) this.c).o();
        return m1VarO2 != null ? m1VarO2 : ((a1) this.b).o();
    }

    @Override // io.sentry.a1
    public i6 p() {
        return b(null).p();
    }

    @Override // io.sentry.a1
    public io.sentry.internal.debugmeta.c q() {
        return b(null).q();
    }

    @Override // io.sentry.a1
    public void r() {
        b(null).r();
    }

    @Override // io.sentry.a1
    public io.sentry.featureflags.b s() {
        b6 b6VarM = ((a1) this.b).m();
        io.sentry.featureflags.b bVarS = ((a1) this.b).s();
        io.sentry.featureflags.b bVarS2 = ((a1) this.c).s();
        io.sentry.featureflags.b bVarS3 = ((a1) this.d).s();
        io.sentry.featureflags.c cVar = io.sentry.featureflags.c.a;
        int maxFeatureFlags = b6VarM.getMaxFeatureFlags();
        if (maxFeatureFlags > 0) {
            io.sentry.featureflags.a aVar = bVarS instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarS : null;
            io.sentry.featureflags.a aVar2 = bVarS2 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarS2 : null;
            io.sentry.featureflags.a aVar3 = bVarS3 instanceof io.sentry.featureflags.a ? (io.sentry.featureflags.a) bVarS3 : null;
            CopyOnWriteArrayList copyOnWriteArrayList = aVar == null ? null : aVar.a;
            CopyOnWriteArrayList copyOnWriteArrayList2 = aVar2 == null ? null : aVar2.a;
            CopyOnWriteArrayList copyOnWriteArrayList3 = aVar3 != null ? aVar3.a : null;
            int size = copyOnWriteArrayList == null ? 0 : copyOnWriteArrayList.size();
            int size2 = copyOnWriteArrayList2 == null ? 0 : copyOnWriteArrayList2.size();
            int size3 = copyOnWriteArrayList3 != null ? copyOnWriteArrayList3.size() : 0;
            if (size != 0 || size2 != 0 || size3 != 0) {
                int i = size - 1;
                int i2 = size2 - 1;
                int i3 = size3 - 1;
                if (copyOnWriteArrayList != null && i >= 0 && copyOnWriteArrayList.get(i) != null) {
                    throw new ClassCastException();
                }
                if (copyOnWriteArrayList2 != null && i2 >= 0 && copyOnWriteArrayList2.get(i2) != null) {
                    throw new ClassCastException();
                }
                if (copyOnWriteArrayList3 != null && i3 >= 0 && copyOnWriteArrayList3.get(i3) != null) {
                    throw new ClassCastException();
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(maxFeatureFlags);
                linkedHashMap.size();
                ArrayList arrayList = new ArrayList(linkedHashMap.values());
                Collections.reverse(arrayList);
                return new io.sentry.featureflags.a(maxFeatureFlags, new CopyOnWriteArrayList(arrayList));
            }
        }
        return cVar;
    }

    @Override // io.sentry.a1
    public i6 t() {
        i6 i6VarT = ((a1) this.d).t();
        if (i6VarT != null) {
            return i6VarT;
        }
        i6 i6VarT2 = ((a1) this.c).t();
        return i6VarT2 != null ? i6VarT2 : ((a1) this.b).t();
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ReplayNetworkRequestOrResponse{size=" + ((Long) this.b) + ", body=" + ((io.sentry.internal.debugmeta.c) this.c) + ", headers=" + ((LinkedHashMap) this.d) + '}';
            default:
                return super.toString();
        }
    }

    @Override // io.sentry.a1
    public Queue u() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(((a1) this.b).u());
        arrayList.addAll(((a1) this.c).u());
        a1 a1Var = (a1) this.d;
        arrayList.addAll(a1Var.u());
        Collections.sort(arrayList);
        Queue queueB = y3.b(a1Var.m().getMaxBreadcrumbs());
        queueB.addAll(arrayList);
        return queueB;
    }

    @Override // io.sentry.a1
    public void v(k kVar) {
        b(null).v(kVar);
    }

    @Override // io.sentry.a1
    public k w() {
        return b(null).w();
    }

    @Override // io.sentry.a1
    public i6 x(w3 w3Var) {
        return b(null).x(w3Var);
    }

    @Override // io.sentry.a1
    public void y(String str) {
        b(null).y(str);
    }

    @Override // io.sentry.a1
    public f1 z() {
        f1 f1VarZ = ((a1) this.d).z();
        if (!(f1VarZ instanceof y2)) {
            return f1VarZ;
        }
        f1 f1VarZ2 = ((a1) this.c).z();
        return !(f1VarZ2 instanceof y2) ? f1VarZ2 : ((a1) this.b).z();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k() {
        this(new io.sentry.protocol.v(), new m6(), null);
        this.a = 1;
    }

    @Override // io.sentry.a1
    public a1 clone() {
        return new k((a1) this.b, ((a1) this.c).clone(), ((a1) this.d).clone(), 0);
    }

    public k(io.sentry.protocol.v vVar, m6 m6Var, c cVar) {
        this.a = 1;
        this.b = vVar;
        this.c = m6Var;
        this.d = io.sentry.config.a.s(cVar, null, null, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public k(k kVar) {
        this((io.sentry.protocol.v) kVar.b, (m6) kVar.c, (c) kVar.d);
        this.a = 1;
    }
}
