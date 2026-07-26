package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.a;

/* JADX INFO: loaded from: classes3.dex */
public final class g11 extends a {
    public final BufferOverflow k;

    public g11(int i, BufferOverflow bufferOverflow) {
        super(i);
        this.k = bufferOverflow;
        if (bufferOverflow != BufferOverflow.a) {
            if (i < 1) {
                throw new IllegalArgumentException(bl4.q(i, "Buffered channel capacity must be at least 1, but ", " was specified").toString());
            }
        } else {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + g27.a(a.class).d() + " instead").toString());
        }
    }

    @Override // kotlinx.coroutines.channels.a
    public final boolean C() {
        return this.k == BufferOverflow.b;
    }

    @Override // kotlinx.coroutines.channels.a
    public final void I(jm7 jm7Var, Object obj) {
        Object objP = P(obj, false);
        if (!(objP instanceof ip0)) {
            jm7Var.e(tx8.a);
        } else {
            if (!(objP instanceof hp0)) {
                throw new IllegalStateException("unreachable");
            }
            jm7Var.e(mh0.l);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00b6, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object P(java.lang.Object r16, boolean r17) {
        /*
            r15 = this;
            kotlinx.coroutines.channels.BufferOverflow r1 = r15.k
            kotlinx.coroutines.channels.BufferOverflow r2 = kotlinx.coroutines.channels.BufferOverflow.c
            tx8 r8 = defpackage.tx8.a
            if (r1 != r2) goto L17
            java.lang.Object r1 = super.o(r16)
            boolean r2 = r1 instanceof defpackage.ip0
            if (r2 == 0) goto L16
            boolean r2 = r1 instanceof defpackage.hp0
            if (r2 == 0) goto L15
            goto L16
        L15:
            return r8
        L16:
            return r1
        L17:
            mu3 r6 = defpackage.mh0.d
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.channels.a.f
            java.lang.Object r1 = r1.get(r15)
            kp0 r1 = (defpackage.kp0) r1
        L21:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.a.b
            long r2 = r2.getAndIncrement(r15)
            r4 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r4 = r4 & r2
            r7 = 0
            boolean r7 = r15.z(r2, r7)
            int r9 = defpackage.mh0.b
            long r10 = (long) r9
            long r2 = r4 / r10
            long r12 = r4 % r10
            int r12 = (int) r12
            long r13 = r1.c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L53
            kp0 r2 = kotlinx.coroutines.channels.a.b(r15, r2, r1)
            if (r2 != 0) goto L52
            if (r7 == 0) goto L21
            java.lang.Throwable r1 = r15.w()
            hp0 r2 = new hp0
            r2.<init>(r1)
            return r2
        L52:
            r1 = r2
        L53:
            r0 = r15
            r3 = r16
            r2 = r12
            int r12 = kotlinx.coroutines.channels.a.j(r0, r1, r2, r3, r4, r6, r7)
            if (r12 == 0) goto Lb7
            r3 = 1
            if (r12 == r3) goto Lb6
            r3 = 2
            if (r12 == r3) goto L90
            r2 = 3
            if (r12 == r2) goto L88
            r2 = 4
            if (r12 == r2) goto L71
            r2 = 5
            if (r12 == r2) goto L6d
            goto L21
        L6d:
            r1.a()
            goto L21
        L71:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = kotlinx.coroutines.channels.a.c
            long r2 = r2.get(r15)
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 >= 0) goto L7e
            r1.a()
        L7e:
            java.lang.Throwable r1 = r15.w()
            hp0 r2 = new hp0
            r2.<init>(r1)
            return r2
        L88:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "unexpected"
            r1.<init>(r2)
            throw r1
        L90:
            if (r7 == 0) goto L9f
            r1.i()
            java.lang.Throwable r1 = r15.w()
            hp0 r2 = new hp0
            r2.<init>(r1)
            return r2
        L9f:
            boolean r3 = r6 instanceof defpackage.gc9
            if (r3 == 0) goto La6
            gc9 r6 = (defpackage.gc9) r6
            goto La7
        La6:
            r6 = 0
        La7:
            if (r6 == 0) goto Lae
            int r12 = r2 + r9
            r6.a(r1, r12)
        Lae:
            long r3 = r1.c
            long r3 = r3 * r10
            long r1 = (long) r2
            long r3 = r3 + r1
            r15.r(r3)
        Lb6:
            return r8
        Lb7:
            r1.a()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g11.P(java.lang.Object, boolean):java.lang.Object");
    }

    @Override // kotlinx.coroutines.channels.a, defpackage.wn7
    public final Object c(g51 g51Var, Object obj) throws Throwable {
        if (P(obj, true) instanceof hp0) {
            throw w();
        }
        return tx8.a;
    }

    @Override // kotlinx.coroutines.channels.a, defpackage.wn7
    public final Object o(Object obj) {
        return P(obj, false);
    }
}
