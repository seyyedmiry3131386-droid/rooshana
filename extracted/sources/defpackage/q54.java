package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class q54 {
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public static final String k;
    public static final String l;
    public final int a;
    public final long b;
    public final Object c;
    public final int d;
    public final mp4 e;
    public final yp7 f;

    static {
        String str = j29.a;
        g = Integer.toString(0, 36);
        h = Integer.toString(1, 36);
        i = Integer.toString(2, 36);
        j = Integer.toString(3, 36);
        k = Integer.toString(4, 36);
        l = Integer.toString(5, 36);
    }

    public q54(int i2, long j2, mp4 mp4Var, yp7 yp7Var, Object obj, int i3) {
        this.a = i2;
        this.b = j2;
        this.e = mp4Var;
        this.f = yp7Var;
        this.c = obj;
        this.d = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static defpackage.q54 a(android.os.Bundle r10) {
        /*
            java.lang.String r0 = defpackage.q54.g
            r1 = 0
            int r3 = r10.getInt(r0, r1)
            java.lang.String r0 = defpackage.q54.h
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r10.getLong(r0, r4)
            java.lang.String r0 = defpackage.q54.i
            android.os.Bundle r0 = r10.getBundle(r0)
            r2 = 0
            if (r0 != 0) goto L1c
            r6 = r2
            goto L21
        L1c:
            mp4 r0 = defpackage.mp4.a(r0)
            r6 = r0
        L21:
            java.lang.String r0 = defpackage.q54.l
            android.os.Bundle r0 = r10.getBundle(r0)
            if (r0 == 0) goto L2f
            yp7 r0 = defpackage.yp7.a(r0)
        L2d:
            r7 = r0
            goto L38
        L2f:
            if (r3 == 0) goto L37
            yp7 r0 = new yp7
            r0.<init>(r3)
            goto L2d
        L37:
            r7 = r2
        L38:
            java.lang.String r0 = defpackage.q54.k
            int r9 = r10.getInt(r0)
            r0 = 1
            if (r9 == r0) goto L7f
            java.lang.String r0 = defpackage.q54.j
            r8 = 2
            if (r9 == r8) goto L81
            r8 = 3
            if (r9 == r8) goto L53
            r10 = 4
            if (r9 != r10) goto L4d
            goto L7f
        L4d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>()
            throw r10
        L53:
            android.os.IBinder r10 = r10.getBinder(r0)
            if (r10 != 0) goto L5a
            goto L7f
        L5a:
            com.google.common.collect.ImmutableList r10 = defpackage.zh0.a(r10)
            lj3 r0 = com.google.common.collect.ImmutableList.m()
        L62:
            int r2 = r10.size()
            if (r1 >= r2) goto L7b
            java.lang.Object r2 = r10.get(r1)
            android.os.Bundle r2 = (android.os.Bundle) r2
            r2.getClass()
            jp4 r2 = defpackage.jp4.b(r2)
            r0.O(r2)
            int r1 = r1 + 1
            goto L62
        L7b:
            com.google.common.collect.ImmutableList r2 = r0.S()
        L7f:
            r8 = r2
            goto L8d
        L81:
            android.os.Bundle r10 = r10.getBundle(r0)
            if (r10 != 0) goto L88
            goto L7f
        L88:
            jp4 r2 = defpackage.jp4.b(r10)
            goto L7f
        L8d:
            q54 r2 = new q54
            r2.<init>(r3, r4, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q54.a(android.os.Bundle):q54");
    }
}
