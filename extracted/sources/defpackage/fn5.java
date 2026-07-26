package defpackage;

import android.content.Context;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class fn5 {
    public static fn5 f;
    public int a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;

    public fn5(Context context) {
        Executor executorS = y40.s();
        this.c = executorS;
        this.d = new CopyOnWriteArrayList();
        this.e = new Object();
        this.a = 0;
        executorS.execute(new lo4(this, context, 17));
    }

    public static synchronized fn5 a(Context context) {
        try {
            if (f == null) {
                f = new fn5(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f;
    }

    public int b() {
        int i;
        synchronized (this.e) {
            i = this.a;
        }
        return i;
    }

    public void c(int i) {
        CopyOnWriteArrayList<en5> copyOnWriteArrayList = (CopyOnWriteArrayList) this.d;
        for (en5 en5Var : copyOnWriteArrayList) {
            if (en5Var.a.get() == null) {
                copyOnWriteArrayList.remove(en5Var);
            }
        }
        synchronized (this.e) {
            try {
                if (this.b && this.a == i) {
                    return;
                }
                this.b = true;
                this.a = i;
                for (en5 en5Var2 : (CopyOnWriteArrayList) this.d) {
                    en5Var2.b.execute(new u03(12, en5Var2));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public fn5(int i, byte[] bArr, Map map, List list, boolean z) {
        this.a = i;
        this.c = bArr;
        this.d = map;
        if (list == null) {
            this.e = null;
        } else {
            this.e = DesugarCollections.unmodifiableList(list);
        }
        this.b = z;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.TreeMap] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.Map] */
    public fn5(int i, byte[] bArr, boolean z, List list) {
        ?? treeMap;
        if (list == null) {
            treeMap = 0;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                qx2 qx2Var = (qx2) it.next();
                treeMap.put(qx2Var.a, qx2Var.b);
            }
        }
        this(i, bArr, treeMap, list, z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List] */
    public fn5(byte[] bArr, Map map) {
        ?? arrayList;
        if (map == null) {
            arrayList = 0;
        } else if (map.isEmpty()) {
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(new qx2((String) entry.getKey(), (String) entry.getValue()));
            }
        }
        this(ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR, bArr, map, arrayList, false);
    }
}
