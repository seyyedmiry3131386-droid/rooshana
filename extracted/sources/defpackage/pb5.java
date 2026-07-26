package defpackage;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes.dex */
public final class pb5 {
    public final LinkedHashMap a;
    public final ca7 b;

    public pb5(LinkedHashMap linkedHashMap, boolean z) {
        this.a = linkedHashMap;
        this.b = new ca7(z);
    }

    public final Map a() {
        Pair pair;
        Set<Map.Entry> setEntrySet = this.a.entrySet();
        int iL = b.L(wu0.V(setEntrySet, 10));
        if (iL < 16) {
            iL = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
        for (Map.Entry entry : setEntrySet) {
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                Object key = entry.getKey();
                byte[] bArr = (byte[]) value;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
                js3.o(bArrCopyOf, "copyOf(...)");
                pair = new Pair(key, bArrCopyOf);
            } else {
                pair = new Pair(entry.getKey(), entry.getValue());
            }
            linkedHashMap.put(pair.a, pair.b);
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        js3.o(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final void b() {
        if (((AtomicBoolean) this.b.b).get()) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.");
        }
    }

    public final Object c(bj6 bj6Var) {
        js3.p(bj6Var, "key");
        Object obj = this.a.get(bj6Var);
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        js3.o(bArrCopyOf, "copyOf(...)");
        return bArrCopyOf;
    }

    public final void d(bj6 bj6Var) {
        js3.p(bj6Var, "key");
        b();
        this.a.remove(bj6Var);
    }

    public final void e(bj6 bj6Var, Object obj) {
        js3.p(bj6Var, "key");
        f(bj6Var, obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.pb5
            r1 = 0
            if (r0 != 0) goto L6
            goto L60
        L6:
            pb5 r7 = (defpackage.pb5) r7
            java.util.LinkedHashMap r7 = r7.a
            java.util.LinkedHashMap r0 = r6.a
            r2 = 1
            if (r7 != r0) goto L10
            goto L61
        L10:
            int r3 = r7.size()
            int r4 = r0.size()
            if (r3 == r4) goto L1b
            goto L60
        L1b:
            boolean r3 = r7.isEmpty()
            if (r3 == 0) goto L22
            goto L61
        L22:
            java.util.Set r7 = r7.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L2a:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L61
            java.lang.Object r3 = r7.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            java.lang.Object r4 = r0.get(r4)
            if (r4 == 0) goto L5d
            java.lang.Object r3 = r3.getValue()
            boolean r5 = r3 instanceof byte[]
            if (r5 == 0) goto L58
            boolean r5 = r4 instanceof byte[]
            if (r5 == 0) goto L5d
            byte[] r3 = (byte[]) r3
            byte[] r4 = (byte[]) r4
            boolean r3 = java.util.Arrays.equals(r3, r4)
            if (r3 == 0) goto L5d
            r3 = r2
            goto L5e
        L58:
            boolean r3 = defpackage.js3.i(r3, r4)
            goto L5e
        L5d:
            r3 = r1
        L5e:
            if (r3 != 0) goto L2a
        L60:
            return r1
        L61:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pb5.equals(java.lang.Object):boolean");
    }

    public final void f(bj6 bj6Var, Object obj) {
        js3.p(bj6Var, "key");
        b();
        if (obj == null) {
            d(bj6Var);
            return;
        }
        boolean z = obj instanceof Set;
        LinkedHashMap linkedHashMap = this.a;
        if (z) {
            Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(a.T0((Set) obj));
            js3.o(setUnmodifiableSet, "unmodifiableSet(...)");
            linkedHashMap.put(bj6Var, setUnmodifiableSet);
        } else {
            if (!(obj instanceof byte[])) {
                linkedHashMap.put(bj6Var, obj);
                return;
            }
            byte[] bArr = (byte[]) obj;
            byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            js3.o(bArrCopyOf, "copyOf(...)");
            linkedHashMap.put(bj6Var, bArrCopyOf);
        }
    }

    public final int hashCode() {
        Iterator it = this.a.entrySet().iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object value = ((Map.Entry) it.next()).getValue();
            iHashCode += value instanceof byte[] ? Arrays.hashCode((byte[]) value) : value.hashCode();
        }
        return iHashCode;
    }

    public final String toString() {
        return a.t0(this.a.entrySet(), ",\n", "{\n", "\n}", new i25(7), 24);
    }

    public /* synthetic */ pb5(boolean z) {
        this(new LinkedHashMap(), z);
    }
}
