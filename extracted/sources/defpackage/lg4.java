package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class lg4 {
    private int createCount;
    private int evictionCount;
    private int hitCount;
    private final dd4 lock;
    private final mg4 map;
    private int maxSize;
    private int missCount;
    private int putCount;
    private int size;

    public lg4(int i) {
        this.maxSize = i;
        if (i <= 0) {
            lb7.j("maxSize <= 0");
            throw null;
        }
        this.map = new mg4();
        this.lock = new dd4();
    }

    public final int a(Object obj, Object obj2) {
        int iSizeOf = sizeOf(obj, obj2);
        if (iSizeOf >= 0) {
            return iSizeOf;
        }
        String str = "Negative size: " + obj + '=' + obj2;
        js3.p(str, "message");
        throw new IllegalStateException(str);
    }

    public Object create(Object obj) {
        return null;
    }

    public final int createCount() {
        int i;
        synchronized (this.lock) {
            i = this.createCount;
        }
        return i;
    }

    public void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
        js3.p(obj, "key");
        js3.p(obj2, "oldValue");
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final int evictionCount() {
        int i;
        synchronized (this.lock) {
            i = this.evictionCount;
        }
        return i;
    }

    public final Object get(Object obj) {
        Object objPut;
        js3.p(obj, "key");
        synchronized (this.lock) {
            mg4 mg4Var = this.map;
            mg4Var.getClass();
            Object obj2 = mg4Var.a.get(obj);
            if (obj2 != null) {
                this.hitCount++;
                return obj2;
            }
            this.missCount++;
            Object objCreate = create(obj);
            if (objCreate == null) {
                return null;
            }
            synchronized (this.lock) {
                try {
                    this.createCount++;
                    objPut = this.map.a.put(obj, objCreate);
                    if (objPut != null) {
                        this.map.a.put(obj, objPut);
                    } else {
                        this.size += a(obj, objCreate);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (objPut != null) {
                entryRemoved(false, obj, objCreate, objPut);
                return objPut;
            }
            trimToSize(this.maxSize);
            return objCreate;
        }
    }

    public final int hitCount() {
        int i;
        synchronized (this.lock) {
            i = this.hitCount;
        }
        return i;
    }

    public final int maxSize() {
        int i;
        synchronized (this.lock) {
            i = this.maxSize;
        }
        return i;
    }

    public final int missCount() {
        int i;
        synchronized (this.lock) {
            i = this.missCount;
        }
        return i;
    }

    public final Object put(Object obj, Object obj2) {
        Object objPut;
        js3.p(obj, "key");
        js3.p(obj2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        synchronized (this.lock) {
            this.putCount++;
            this.size += a(obj, obj2);
            objPut = this.map.a.put(obj, obj2);
            if (objPut != null) {
                this.size -= a(obj, objPut);
            }
        }
        if (objPut != null) {
            entryRemoved(false, obj, objPut, obj2);
        }
        trimToSize(this.maxSize);
        return objPut;
    }

    public final int putCount() {
        int i;
        synchronized (this.lock) {
            i = this.putCount;
        }
        return i;
    }

    public final Object remove(Object obj) {
        Object objRemove;
        js3.p(obj, "key");
        synchronized (this.lock) {
            mg4 mg4Var = this.map;
            mg4Var.getClass();
            objRemove = mg4Var.a.remove(obj);
            if (objRemove != null) {
                this.size -= a(obj, objRemove);
            }
        }
        if (objRemove != null) {
            entryRemoved(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public void resize(int i) {
        if (!(i > 0)) {
            lb7.j("maxSize <= 0");
            throw null;
        }
        synchronized (this.lock) {
            this.maxSize = i;
        }
        trimToSize(i);
    }

    public final int size() {
        int i;
        synchronized (this.lock) {
            i = this.size;
        }
        return i;
    }

    public int sizeOf(Object obj, Object obj2) {
        js3.p(obj, "key");
        js3.p(obj2, AppMeasurementSdk.ConditionalUserProperty.VALUE);
        return 1;
    }

    public final Map<Object, Object> snapshot() {
        LinkedHashMap linkedHashMap;
        synchronized (this.lock) {
            Set setEntrySet = this.map.a.entrySet();
            js3.o(setEntrySet, "<get-entries>(...)");
            linkedHashMap = new LinkedHashMap(setEntrySet.size());
            Set<Map.Entry> setEntrySet2 = this.map.a.entrySet();
            js3.o(setEntrySet2, "<get-entries>(...)");
            for (Map.Entry entry : setEntrySet2) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str;
        synchronized (this.lock) {
            try {
                int i = this.hitCount;
                int i2 = this.missCount + i;
                str = "LruCache[maxSize=" + this.maxSize + ",hits=" + this.hitCount + ",misses=" + this.missCount + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x008e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0096, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void trimToSize(int r7) {
        /*
            r6 = this;
        L0:
            dd4 r0 = r6.lock
            monitor-enter(r0)
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 < 0) goto L8f
            mg4 r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L19
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L8f
            goto L19
        L16:
            r7 = move-exception
            goto L97
        L19:
            int r1 = r6.size     // Catch: java.lang.Throwable -> L16
            if (r1 <= r7) goto L8d
            mg4 r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L28
            goto L8d
        L28:
            mg4 r1 = r6.map     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L16
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "<get-entries>(...)"
            defpackage.js3.o(r1, r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L16
            r3 = 0
            if (r2 == 0) goto L4c
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L16
            if (r2 == 0) goto L46
        L44:
            r1 = r3
            goto L5b
        L46:
            r2 = 0
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L16
            goto L5b
        L4c:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L16
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L16
            if (r2 != 0) goto L57
            goto L44
        L57:
            java.lang.Object r1 = r1.next()     // Catch: java.lang.Throwable -> L16
        L5b:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch: java.lang.Throwable -> L16
            if (r1 != 0) goto L61
            monitor-exit(r0)
            return
        L61:
            java.lang.Object r2 = r1.getKey()     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L16
            mg4 r4 = r6.map     // Catch: java.lang.Throwable -> L16
            r4.getClass()     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = "key"
            defpackage.js3.p(r2, r5)     // Catch: java.lang.Throwable -> L16
            java.util.LinkedHashMap r4 = r4.a     // Catch: java.lang.Throwable -> L16
            r4.remove(r2)     // Catch: java.lang.Throwable -> L16
            int r4 = r6.size     // Catch: java.lang.Throwable -> L16
            int r5 = r6.a(r2, r1)     // Catch: java.lang.Throwable -> L16
            int r4 = r4 - r5
            r6.size = r4     // Catch: java.lang.Throwable -> L16
            int r4 = r6.evictionCount     // Catch: java.lang.Throwable -> L16
            r5 = 1
            int r4 = r4 + r5
            r6.evictionCount = r4     // Catch: java.lang.Throwable -> L16
            monitor-exit(r0)
            r6.entryRemoved(r5, r2, r1, r3)
            goto L0
        L8d:
            monitor-exit(r0)
            return
        L8f:
            java.lang.String r7 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L16
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L16
            throw r1     // Catch: java.lang.Throwable -> L16
        L97:
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lg4.trimToSize(int):void");
    }
}
