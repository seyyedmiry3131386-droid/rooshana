package defpackage;

import java.lang.reflect.InvocationHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class j87 implements InvocationHandler {
    public final Object[] a = new Object[0];
    public final /* synthetic */ Class b;
    public final /* synthetic */ k87 c;

    public j87(k87 k87Var, Class cls) {
        this.c = k87Var;
        this.b = cls;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        r1 = defpackage.qe3.b(r10, r0, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        r10.a.put(r9, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x006b, code lost:
    
        r9 = (defpackage.qe3) r2;
     */
    @Override // java.lang.reflect.InvocationHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r8, java.lang.reflect.Method r9, java.lang.Object[] r10) {
        /*
            r7 = this;
            java.lang.Class r0 = r7.b
            java.lang.Class r1 = r9.getDeclaringClass()
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            if (r1 != r2) goto Lf
            java.lang.Object r8 = r9.invoke(r7, r10)
            return r8
        Lf:
            if (r10 == 0) goto L13
        L11:
            r4 = r10
            goto L16
        L13:
            java.lang.Object[] r10 = r7.a
            goto L11
        L16:
            sl3 r10 = defpackage.l96.b
            boolean r1 = r10.A(r9)
            if (r1 == 0) goto L23
            java.lang.Object r8 = r10.z(r9, r0, r8, r4)
            return r8
        L23:
            k87 r10 = r7.c
        L25:
            j$.util.concurrent.ConcurrentHashMap r1 = r10.a
            java.lang.Object r1 = r1.get(r9)
            boolean r2 = r1 instanceof defpackage.qe3
            if (r2 == 0) goto L33
            qe3 r1 = (defpackage.qe3) r1
        L31:
            r9 = r1
            goto L6f
        L33:
            if (r1 != 0) goto L5d
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            monitor-enter(r2)
            j$.util.concurrent.ConcurrentHashMap r1 = r10.a     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = r1.putIfAbsent(r9, r2)     // Catch: java.lang.Throwable -> L4e
            if (r1 != 0) goto L59
            qe3 r1 = defpackage.qe3.b(r10, r0, r9)     // Catch: java.lang.Throwable -> L51
            j$.util.concurrent.ConcurrentHashMap r10 = r10.a     // Catch: java.lang.Throwable -> L4e
            r10.put(r9, r1)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            goto L31
        L4e:
            r0 = move-exception
            r8 = r0
            goto L5b
        L51:
            r0 = move-exception
            r8 = r0
            j$.util.concurrent.ConcurrentHashMap r10 = r10.a     // Catch: java.lang.Throwable -> L4e
            r10.remove(r9)     // Catch: java.lang.Throwable -> L4e
            throw r8     // Catch: java.lang.Throwable -> L4e
        L59:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            goto L5d
        L5b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4e
            throw r8
        L5d:
            monitor-enter(r1)
            j$.util.concurrent.ConcurrentHashMap r2 = r10.a     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L6b
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            goto L25
        L68:
            r0 = move-exception
            r8 = r0
            goto L80
        L6b:
            r9 = r2
            qe3 r9 = (defpackage.qe3) r9     // Catch: java.lang.Throwable -> L68
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
        L6f:
            fs5 r1 = new fs5
            k57 r2 = r9.a
            cl0 r5 = r9.b
            l51 r6 = r9.c
            r3 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            java.lang.Object r8 = r9.a(r1, r4)
            return r8
        L80:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j87.invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[]):java.lang.Object");
    }
}
