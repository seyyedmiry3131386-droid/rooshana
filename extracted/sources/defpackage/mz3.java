package defpackage;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.time.DurationUnit;
import org.koin.android.scope.ScopeService;
import org.koin.core.error.DefinitionOverrideException;
import org.koin.core.error.ScopeAlreadyCreatedException;
import org.koin.core.logger.Level;

/* JADX INFO: loaded from: classes3.dex */
public final class mz3 {
    public final av a;
    public final do3 b;
    public final vp7 c;
    public final pa2 d;
    public final jt2 e;

    public mz3() {
        Level level = Level.a;
        this.a = new av(17);
        do3 do3Var = new do3();
        do3Var.a = this;
        do3Var.b = new ArrayList();
        this.b = do3Var;
        this.c = new vp7(this);
        this.d = new pa2(this);
        new ConcurrentHashMap();
        new HashMap();
        this.e = new jt2(2);
    }

    public static /* synthetic */ lf7 c(mz3 mz3Var, String str, to6 to6Var, ScopeService scopeService, yu8 yu8Var, int i) {
        if ((i & 4) != 0) {
            scopeService = null;
        }
        if ((i & 8) != 0) {
            yu8Var = null;
        }
        return mz3Var.b(str, to6Var, scopeService, yu8Var);
    }

    public final void a() {
        av avVar = this.a;
        avVar.t("Create eager instances ...");
        long jA = rx4.a();
        pa2 pa2Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) pa2Var.d;
        cx7[] cx7VarArr = (cx7[]) concurrentHashMap.values().toArray(new cx7[0]);
        ArrayList arrayListO = br9.o(Arrays.copyOf(cx7VarArr, cx7VarArr.length));
        concurrentHashMap.clear();
        mz3 mz3Var = (mz3) pa2Var.c;
        ry0 ry0Var = new ry0(mz3Var.a, (lf7) mz3Var.c.e, g27.a(wn5.class), null, null);
        Iterator it = arrayListO.iterator();
        while (it.hasNext()) {
            ((cx7) it.next()).b(ry0Var);
        }
        long jA2 = sl8.a(jA);
        StringBuilder sb = new StringBuilder("Created eager instances in ");
        int i = qx1.d;
        sb.append(qx1.h(jA2, DurationUnit.c) / 1000.0d);
        sb.append(" ms");
        avVar.t(sb.toString());
    }

    public final lf7 b(String str, to6 to6Var, Object obj, yu8 yu8Var) {
        js3.p(str, "scopeId");
        js3.p(to6Var, "qualifier");
        vp7 vp7Var = this.c;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) vp7Var.d;
        mz3 mz3Var = (mz3) vp7Var.b;
        av avVar = mz3Var.a;
        avVar.t("| (+) Scope - id:'" + str + "' q:'" + to6Var + '\'');
        Set set = (Set) vp7Var.c;
        if (!set.contains(to6Var)) {
            avVar.t("| Scope '" + to6Var + "' not defined. Creating it ...");
            set.add(to6Var);
        }
        if (concurrentHashMap.containsKey(str)) {
            String str2 = "Scope with id '" + str + "' is already created";
            js3.p(str2, "s");
            throw new ScopeAlreadyCreatedException(str2);
        }
        lf7 lf7Var = new lf7(to6Var, str, yu8Var, mz3Var, 4);
        if (obj != null) {
            avVar.t("|- Scope source set id:'" + str + "' -> " + obj);
            lf7Var.g = obj;
        }
        lf7[] lf7VarArr = {(lf7) vp7Var.e};
        if (lf7Var.c) {
            throw new IllegalStateException("Can't add scope link to a root scope");
        }
        lf7Var.f.addAll(0, ew.X0(lf7VarArr));
        concurrentHashMap.put(str, lf7Var);
        return lf7Var;
    }

    public final void d(List list, boolean z) throws DefinitionOverrideException {
        Object next;
        LinkedHashSet<nx4> linkedHashSet = new LinkedHashSet();
        ov ovVar = new ov(a.d0(list));
        while (!ovVar.isEmpty()) {
            nx4 nx4Var = (nx4) ovVar.removeLast();
            if (linkedHashSet.add(nx4Var)) {
                for (nx4 nx4Var2 : nx4Var.e) {
                    if (!linkedHashSet.contains(nx4Var2)) {
                        ovVar.addLast(nx4Var2);
                    }
                }
            }
        }
        pa2 pa2Var = this.d;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) pa2Var.d;
        for (nx4 nx4Var3 : linkedHashSet) {
            for (Map.Entry entry : nx4Var3.c.entrySet()) {
                String str = (String) entry.getKey();
                zp3 zp3Var = (zp3) entry.getValue();
                av avVar = ((mz3) pa2Var.c).a;
                js3.p(str, "mapping");
                js3.p(zp3Var, "factory");
                va0 va0Var = zp3Var.a;
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) pa2Var.b;
                if (((zp3) concurrentHashMap2.get(str)) != null) {
                    if (!z) {
                        String str2 = "Already existing definition for " + va0Var + " at " + str;
                        js3.p(str2, "msg");
                        throw new DefinitionOverrideException(str2);
                    }
                    String str3 = "(+) override index '" + str + "' -> '" + va0Var + '\'';
                    avVar.getClass();
                    js3.p(str3, "msg");
                    avVar.x(Level.c, str3);
                    Iterator it = concurrentHashMap.values().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            next = it.next();
                            if (((cx7) next).a.equals(va0Var)) {
                                break;
                            }
                        } else {
                            next = null;
                            break;
                        }
                    }
                    if (((cx7) next) != null) {
                        concurrentHashMap.remove(Integer.valueOf(va0Var.hashCode()));
                    }
                }
                avVar.t("(+) index '" + str + "' -> '" + va0Var + '\'');
                concurrentHashMap2.put(str, zp3Var);
            }
            for (cx7 cx7Var : nx4Var3.b) {
                concurrentHashMap.put(Integer.valueOf(cx7Var.a.hashCode()), cx7Var);
            }
        }
        vp7 vp7Var = this.c;
        vp7Var.getClass();
        Iterator it2 = linkedHashSet.iterator();
        while (it2.hasNext()) {
            ((Set) vp7Var.c).addAll(((nx4) it2.next()).d);
        }
    }
}
