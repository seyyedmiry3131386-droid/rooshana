package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState;

/* JADX INFO: loaded from: classes3.dex */
public final class c71 extends Thread {
    public static final /* synthetic */ AtomicIntegerFieldUpdater i = AtomicIntegerFieldUpdater.newUpdater(c71.class, "workerCtl$volatile");
    public final lg9 a;
    public final Ref$ObjectRef b;
    public CoroutineScheduler$WorkerState c;
    public long d;
    public long e;
    public int f;
    public boolean g;
    public final /* synthetic */ d71 h;
    private volatile int indexInArray;
    private volatile Object nextParkedWorker;
    private volatile /* synthetic */ int workerCtl$volatile;

    public c71(d71 d71Var, int i2) {
        this.h = d71Var;
        setDaemon(true);
        setContextClassLoader(d71.class.getClassLoader());
        this.a = new lg9();
        this.b = new Ref$ObjectRef();
        this.c = CoroutineScheduler$WorkerState.d;
        this.nextParkedWorker = d71.k;
        int iNanoTime = (int) System.nanoTime();
        this.f = iNanoTime == 0 ? 42 : iNanoTime;
        f(i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0041, code lost:
    
        r12 = defpackage.lg9.d.get(r10);
        r0 = defpackage.lg9.c.get(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        if (r12 == r0) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (defpackage.lg9.e.get(r10) != 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        r0 = r0 - 1;
        r1 = r10.c(r0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        if (r1 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0060, code lost:
    
        r8 = r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ze8 a(boolean r12) {
        /*
            r11 = this;
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = r11.c
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r1 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.a
            d71 r3 = r11.h
            r8 = 0
            r9 = 1
            lg9 r10 = r11.a
            if (r0 != r1) goto Le
            goto L86
        Le:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r0 = defpackage.d71.i
        L10:
            long r4 = r0.get(r3)
            r1 = 9223367638808264704(0x7ffffc0000000000, double:NaN)
            long r1 = r1 & r4
            r6 = 42
            long r1 = r1 >> r6
            int r1 = (int) r1
            if (r1 != 0) goto L73
            r10.getClass()
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.lg9.b
            java.lang.Object r0 = r12.get(r10)
            ze8 r0 = (defpackage.ze8) r0
            if (r0 != 0) goto L2e
            goto L41
        L2e:
            boolean r1 = r0.b
            if (r1 != r9) goto L41
        L32:
            boolean r1 = r12.compareAndSet(r10, r0, r8)
            if (r1 == 0) goto L3a
            r8 = r0
            goto L61
        L3a:
            java.lang.Object r1 = r12.get(r10)
            if (r1 == r0) goto L32
            goto L23
        L41:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r12 = defpackage.lg9.d
            int r12 = r12.get(r10)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.lg9.c
            int r0 = r0.get(r10)
        L4d:
            if (r12 == r0) goto L61
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.lg9.e
            int r1 = r1.get(r10)
            if (r1 != 0) goto L58
            goto L61
        L58:
            int r0 = r0 + (-1)
            ze8 r1 = r10.c(r0, r9)
            if (r1 == 0) goto L4d
            r8 = r1
        L61:
            if (r8 != 0) goto L72
            st2 r12 = r3.f
            java.lang.Object r12 = r12.d()
            ze8 r12 = (defpackage.ze8) r12
            if (r12 != 0) goto L71
            ze8 r12 = r11.i(r9)
        L71:
            return r12
        L72:
            return r8
        L73:
            r1 = 4398046511104(0x40000000000, double:2.1729236899484E-311)
            long r6 = r4 - r1
            java.util.concurrent.atomic.AtomicLongFieldUpdater r2 = defpackage.d71.i
            boolean r1 = r2.compareAndSet(r3, r4, r6)
            if (r1 == 0) goto L10
            kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState r0 = kotlinx.coroutines.scheduling.CoroutineScheduler$WorkerState.a
            r11.c = r0
        L86:
            if (r12 == 0) goto Lba
            int r12 = r3.a
            int r12 = r12 * 2
            int r12 = r11.d(r12)
            if (r12 != 0) goto L93
            goto L94
        L93:
            r9 = 0
        L94:
            if (r9 == 0) goto L9d
            ze8 r12 = r11.e()
            if (r12 == 0) goto L9d
            return r12
        L9d:
            r10.getClass()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = defpackage.lg9.b
            java.lang.Object r12 = r12.getAndSet(r10, r8)
            ze8 r12 = (defpackage.ze8) r12
            if (r12 != 0) goto Lae
            ze8 r12 = r10.b()
        Lae:
            if (r12 == 0) goto Lb1
            return r12
        Lb1:
            if (r9 != 0) goto Lc1
            ze8 r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lba:
            ze8 r12 = r11.e()
            if (r12 == 0) goto Lc1
            return r12
        Lc1:
            r12 = 3
            ze8 r12 = r11.i(r12)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c71.a(boolean):ze8");
    }

    public final int b() {
        return this.indexInArray;
    }

    public final Object c() {
        return this.nextParkedWorker;
    }

    public final int d(int i2) {
        int i3 = this.f;
        int i4 = i3 ^ (i3 << 13);
        int i5 = i4 ^ (i4 >> 17);
        int i6 = i5 ^ (i5 << 5);
        this.f = i6;
        int i7 = i2 - 1;
        return (i7 & i2) == 0 ? i6 & i7 : (i6 & Integer.MAX_VALUE) % i2;
    }

    public final ze8 e() {
        int iD = d(2);
        d71 d71Var = this.h;
        if (iD == 0) {
            ze8 ze8Var = (ze8) d71Var.e.d();
            return ze8Var != null ? ze8Var : (ze8) d71Var.f.d();
        }
        ze8 ze8Var2 = (ze8) d71Var.f.d();
        return ze8Var2 != null ? ze8Var2 : (ze8) d71Var.e.d();
    }

    public final void f(int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append(this.h.d);
        sb.append("-worker-");
        sb.append(i2 == 0 ? "TERMINATED" : String.valueOf(i2));
        setName(sb.toString());
        this.indexInArray = i2;
    }

    public final void g(Object obj) {
        this.nextParkedWorker = obj;
    }

    public final boolean h(CoroutineScheduler$WorkerState coroutineScheduler$WorkerState) {
        CoroutineScheduler$WorkerState coroutineScheduler$WorkerState2 = this.c;
        boolean z = coroutineScheduler$WorkerState2 == CoroutineScheduler$WorkerState.a;
        if (z) {
            d71.i.addAndGet(this.h, 4398046511104L);
        }
        if (coroutineScheduler$WorkerState2 != coroutineScheduler$WorkerState) {
            this.c = coroutineScheduler$WorkerState;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006b, code lost:
    
        r7 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x009f, code lost:
    
        r7 = -2;
        r5 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ze8 i(int r26) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c71.i(int):ze8");
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0004, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0004, code lost:
    
        continue;
     */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c71.run():void");
    }
}
