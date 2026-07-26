package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes3.dex */
public final class kp0 extends wl7 {
    public final a e;
    public final /* synthetic */ AtomicReferenceArray f;

    public kp0(long j, kp0 kp0Var, a aVar, int i) {
        super(j, kp0Var, i);
        this.e = aVar;
        this.f = new AtomicReferenceArray(mh0.b * 2);
    }

    @Override // defpackage.wl7
    public final int g() {
        return mh0.b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0059, code lost:
    
        n(r5, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
    
        if (r0 == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x005e, code lost:
    
        defpackage.js3.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0061, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    @Override // defpackage.wl7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void h(int r5, defpackage.w61 r6) {
        /*
            r4 = this;
            int r6 = defpackage.mh0.b
            if (r5 < r6) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r5 = r5 - r6
        La:
            int r6 = r5 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r1 = r4.f
            r1.get(r6)
        L11:
            java.lang.Object r6 = r4.l(r5)
            boolean r1 = r6 instanceof defpackage.gc9
            kotlinx.coroutines.channels.a r2 = r4.e
            r3 = 0
            if (r1 != 0) goto L62
            boolean r1 = r6 instanceof defpackage.hc9
            if (r1 == 0) goto L21
            goto L62
        L21:
            mu3 r1 = defpackage.mh0.j
            if (r6 == r1) goto L59
            mu3 r1 = defpackage.mh0.k
            if (r6 != r1) goto L2a
            goto L59
        L2a:
            mu3 r1 = defpackage.mh0.g
            if (r6 == r1) goto L11
            mu3 r1 = defpackage.mh0.f
            if (r6 != r1) goto L33
            goto L11
        L33:
            mu3 r5 = defpackage.mh0.i
            if (r6 == r5) goto L7c
            mu3 r5 = defpackage.mh0.d
            if (r6 != r5) goto L3c
            goto L7c
        L3c:
            mu3 r5 = defpackage.mh0.l
            if (r6 != r5) goto L41
            goto L7c
        L41:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "unexpected state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L59:
            r4.n(r5, r3)
            if (r0 == 0) goto L7c
            defpackage.js3.m(r2)
            return
        L62:
            if (r0 == 0) goto L67
            mu3 r1 = defpackage.mh0.j
            goto L69
        L67:
            mu3 r1 = defpackage.mh0.k
        L69:
            boolean r6 = r4.k(r5, r6, r1)
            if (r6 == 0) goto L11
            r4.n(r5, r3)
            r6 = r0 ^ 1
            r4.m(r5, r6)
            if (r0 == 0) goto L7c
            defpackage.js3.m(r2)
        L7c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp0.h(int, w61):void");
    }

    public final boolean k(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final Object l(int i) {
        return this.f.get((i * 2) + 1);
    }

    public final void m(int i, boolean z) {
        if (z) {
            a aVar = this.e;
            js3.m(aVar);
            aVar.O((this.c * ((long) mh0.b)) + ((long) i));
        }
        i();
    }

    public final void n(int i, Object obj) {
        this.f.set(i * 2, obj);
    }

    public final void o(int i, Object obj) {
        this.f.set((i * 2) + 1, obj);
    }
}
