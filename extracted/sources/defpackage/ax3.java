package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ax3 {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static final String a(zw3 zw3Var) {
        js3.p(zw3Var, "<this>");
        ConcurrentHashMap concurrentHashMap = a;
        String str = (String) concurrentHashMap.get(zw3Var);
        if (str != null) {
            return str;
        }
        String name = yh0.u(zw3Var).getName();
        concurrentHashMap.put(zw3Var, name);
        return name;
    }
}
