package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public class nw3 extends u0 {
    public final cw3 f;
    public final no7 g;
    public int h;
    public boolean i;

    public /* synthetic */ nw3(pu3 pu3Var, cw3 cw3Var, String str, int i) {
        this(pu3Var, cw3Var, (i & 4) != 0 ? null : str, (no7) null);
    }

    @Override // defpackage.u0
    public String Q(no7 no7Var, int i) {
        Object next;
        js3.p(no7Var, "descriptor");
        pu3 pu3Var = this.c;
        bt2.I(pu3Var, no7Var);
        String strF = no7Var.f(i);
        if (this.e.g && !S().a.keySet().contains(strF)) {
            js3.p(pu3Var, "<this>");
            ql4 ql4Var = pu3Var.c;
            av avVar = bt2.i;
            xv3 xv3Var = new xv3(no7Var, pu3Var, 0);
            ql4Var.getClass();
            Object objD = ql4Var.D(no7Var, avVar);
            if (objD == null) {
                objD = xv3Var.invoke();
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) ql4Var.b;
                Object concurrentHashMap2 = concurrentHashMap.get(no7Var);
                if (concurrentHashMap2 == null) {
                    concurrentHashMap2 = new ConcurrentHashMap(2);
                    concurrentHashMap.put(no7Var, concurrentHashMap2);
                }
                ((Map) concurrentHashMap2).put(avVar, objD);
            }
            Map map = (Map) objD;
            Iterator it = S().a.keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                Integer num = (Integer) map.get((String) next);
                if (num != null && num.intValue() == i) {
                    break;
                }
            }
            String str = (String) next;
            if (str != null) {
                return str;
            }
        }
        return strF;
    }

    @Override // defpackage.u0
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public cw3 S() {
        return this.f;
    }

    @Override // defpackage.u0, defpackage.tz0
    public void a(no7 no7Var) {
        Set setM;
        js3.p(no7Var, "descriptor");
        pu3 pu3Var = this.c;
        if (bt2.C(pu3Var, no7Var) || (no7Var.getKind() instanceof ph6)) {
            return;
        }
        bt2.I(pu3Var, no7Var);
        if (this.e.g) {
            Set setM2 = yq2.M(no7Var);
            Map map = (Map) pu3Var.c.D(no7Var, bt2.i);
            Set setKeySet = map != null ? map.keySet() : null;
            if (setKeySet == null) {
                setKeySet = EmptySet.a;
            }
            Set set = setKeySet;
            js3.p(setM2, "<this>");
            js3.p(set, "elements");
            Integer numValueOf = set instanceof Collection ? Integer.valueOf(set.size()) : null;
            LinkedHashSet linkedHashSet = new LinkedHashSet(b.L(numValueOf != null ? setM2.size() + numValueOf.intValue() : setM2.size() * 2));
            linkedHashSet.addAll(setM2);
            a.b0(set, linkedHashSet);
            setM = linkedHashSet;
        } else {
            setM = yq2.M(no7Var);
        }
        for (String str : S().a.keySet()) {
            if (!setM.contains(str) && !js3.i(str, this.d)) {
                StringBuilder sbN = t61.n("Encountered an unknown key '", str, "' at element: ");
                sbN.append(U());
                sbN.append("\nUse 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.\nJSON input: ");
                sbN.append((Object) br9.D(-1, S().toString()));
                throw br9.j(-1, sbN.toString());
            }
        }
    }

    @Override // defpackage.u0, defpackage.cc1
    public final tz0 c(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        no7 no7Var2 = this.g;
        if (no7Var != no7Var2) {
            return super.c(no7Var);
        }
        kv3 kv3VarU = u();
        String strA = no7Var2.a();
        if (kv3VarU instanceof cw3) {
            return new nw3(this.c, (cw3) kv3VarU, this.d, no7Var2);
        }
        throw br9.i(-1, kv3VarU.toString(), "Expected " + g27.a(cw3.class).d() + ", but had " + g27.a(kv3VarU.getClass()).d() + " as the serialized body of " + strA + " at element: " + U());
    }

    @Override // defpackage.u0
    public kv3 d(String str) {
        js3.p(str, "tag");
        return (kv3) b.J(S(), str);
    }

    @Override // defpackage.tz0
    public int i(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        while (this.h < no7Var.e()) {
            int i = this.h;
            this.h = i + 1;
            String strR = R(no7Var, i);
            int i2 = this.h - 1;
            this.i = false;
            if (!S().containsKey(strR)) {
                boolean z = (this.c.a.d || no7Var.i(i2) || !no7Var.h(i2).c()) ? false : true;
                this.i = z;
                if (z) {
                }
            }
            this.e.getClass();
            return i2;
        }
        return -1;
    }

    @Override // defpackage.u0, defpackage.cc1
    public final boolean y() {
        return !this.i && super.y();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nw3(pu3 pu3Var, cw3 cw3Var, String str, no7 no7Var) {
        super(pu3Var, str);
        js3.p(pu3Var, "json");
        this.f = cw3Var;
        this.g = no7Var;
    }
}
