package defpackage;

import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes.dex */
public abstract class eo0 implements ua8 {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public co0 d;
    public long e;
    public long f;
    public long g;

    public eo0() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new co0(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            v4 v4Var = new v4(12, this);
            do0 do0Var = new do0();
            do0Var.h = v4Var;
            arrayDeque.add(do0Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.dc1
    public final void b(long j) {
        this.g = j;
    }

    @Override // defpackage.ua8
    public final void c(long j) {
        this.e = j;
    }

    @Override // defpackage.dc1
    public final Object e() {
        vy2.s(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        co0 co0Var = (co0) arrayDeque.pollFirst();
        this.d = co0Var;
        return co0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // defpackage.dc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f(defpackage.ya8 r7) {
        /*
            r6 = this;
            co0 r0 = r6.d
            if (r7 != r0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            defpackage.vy2.j(r0)
            co0 r7 = (defpackage.co0) r7
            r0 = 4
            boolean r0 = r7.d(r0)
            if (r0 != 0) goto L33
            long r0 = r7.g
            r2 = -9223372036854775808
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto L33
            long r2 = r6.g
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 == 0) goto L33
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L33
            r7.f()
            java.util.ArrayDeque r0 = r6.a
            r0.add(r7)
            goto L41
        L33:
            long r0 = r6.f
            r2 = 1
            long r2 = r2 + r0
            r6.f = r2
            r7.k = r0
            java.util.ArrayDeque r0 = r6.c
            r0.add(r7)
        L41:
            r7 = 0
            r6.d = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eo0.f(ya8):void");
    }

    @Override // defpackage.dc1
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean zIsEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (zIsEmpty) {
                break;
            }
            co0 co0Var = (co0) arrayDeque2.poll();
            String str = j29.a;
            co0Var.f();
            arrayDeque.add(co0Var);
        }
        co0 co0Var2 = this.d;
        if (co0Var2 != null) {
            co0Var2.f();
            arrayDeque.add(co0Var2);
            this.d = null;
        }
    }

    public abstract r79 g();

    public abstract void h(co0 co0Var);

    @Override // defpackage.dc1
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public do0 d() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            co0 co0Var = (co0) arrayDeque2.peek();
            String str = j29.a;
            if (co0Var.g > this.e) {
                return null;
            }
            co0 co0Var2 = (co0) arrayDeque2.poll();
            boolean zD = co0Var2.d(4);
            ArrayDeque arrayDeque3 = this.a;
            if (zD) {
                do0 do0Var = (do0) arrayDeque.pollFirst();
                do0Var.b(4);
                co0Var2.f();
                arrayDeque3.add(co0Var2);
                return do0Var;
            }
            h(co0Var2);
            if (j()) {
                r79 r79VarG = g();
                do0 do0Var2 = (do0) arrayDeque.pollFirst();
                long j = co0Var2.g;
                do0Var2.c = j;
                do0Var2.e = r79VarG;
                do0Var2.f = j;
                co0Var2.f();
                arrayDeque3.add(co0Var2);
                return do0Var2;
            }
            co0Var2.f();
            arrayDeque3.add(co0Var2);
        }
    }

    public abstract boolean j();

    @Override // defpackage.dc1
    public void a() {
    }
}
