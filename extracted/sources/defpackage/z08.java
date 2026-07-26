package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class z08 {
    public final dp2 a;
    public Object b;
    public ib5 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final rb5 e = b47.b();
    public final rb5 f = new rb5();
    public final sb5 g = new sb5();
    public final zb5 h = new zb5(0, new ck1[16]);
    public final pz0 i = new pz0(1, this);
    public final rb5 l = b47.b();
    public final HashMap m = new HashMap();

    public z08(dp2 dp2Var) {
        this.a = dp2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0219 A[PHI: r23
      0x0219: PHI (r23v19 boolean) = (r23v18 boolean), (r23v20 boolean) binds: [B:92:0x01f1, B:100:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02a8 A[PHI: r23
      0x02a8: PHI (r23v12 boolean) = (r23v11 boolean), (r23v13 boolean) binds: [B:123:0x0280, B:131:0x02a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x04fd A[EDGE_INSN: B:244:0x04f6->B:246:0x04fd BREAK  A[LOOP:20: B:230:0x04bc->B:243:0x04f3], PHI: r2
      0x04fd: PHI (r2v10 boolean) = (r2v2 boolean), (r2v2 boolean), (r2v14 boolean) binds: [B:224:0x04a7, B:228:0x04b8, B:244:0x04f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x052b  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x056e A[PHI: r0
      0x056e: PHI (r0v8 boolean) = (r0v7 boolean), (r0v9 boolean) binds: [B:265:0x0547, B:273:0x056c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e A[PHI: r23
      0x013e: PHI (r23v29 boolean) = (r23v28 boolean), (r23v30 boolean) binds: [B:51:0x010d, B:62:0x013c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0149  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v40 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a(java.util.Set r46) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1637
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z08.a(java.util.Set):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(java.lang.Object r21, int r22, java.lang.Object r23, defpackage.ib5 r24) {
        /*
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r22
            r3 = r24
            int r4 = r0.k
            if (r4 <= 0) goto Le
            goto La4
        Le:
            int r4 = r3.c(r1)
            if (r4 >= 0) goto L17
            int r4 = ~r4
            r6 = -1
            goto L1b
        L17:
            int[] r6 = r3.c
            r6 = r6[r4]
        L1b:
            java.lang.Object[] r7 = r3.b
            r7[r4] = r1
            int[] r3 = r3.c
            r3[r4] = r2
            boolean r3 = r1 instanceof defpackage.ck1
            r4 = 2
            if (r3 == 0) goto L90
            if (r6 == r2) goto L90
            r2 = r1
            ck1 r2 = (defpackage.ck1) r2
            bk1 r2 = r2.i()
            java.util.HashMap r3 = r0.m
            java.lang.Object r7 = r2.f
            r3.put(r1, r7)
            ib5 r2 = r2.e
            rb5 r3 = r0.l
            defpackage.b47.n(r3, r1)
            java.lang.Object[] r7 = r2.b
            long[] r2 = r2.a
            int r8 = r2.length
            int r8 = r8 - r4
            if (r8 < 0) goto L90
            r10 = 0
        L48:
            r11 = r2[r10]
            long r13 = ~r11
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L8b
            int r13 = r10 - r8
            int r13 = ~r13
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L62:
            if (r15 >= r13) goto L89
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.3E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L85
            int r16 = r10 << 3
            int r16 = r16 + r15
            r16 = r7[r16]
            r9 = r16
            e58 r9 = (defpackage.e58) r9
            boolean r5 = r9 instanceof defpackage.f58
            if (r5 == 0) goto L82
            r5 = r9
            f58 r5 = (defpackage.f58) r5
            r5.g(r4)
        L82:
            defpackage.b47.a(r3, r9, r1)
        L85:
            long r11 = r11 >> r14
            int r15 = r15 + 1
            goto L62
        L89:
            if (r13 != r14) goto L90
        L8b:
            if (r10 == r8) goto L90
            int r10 = r10 + 1
            goto L48
        L90:
            r2 = -1
            if (r6 != r2) goto La4
            boolean r2 = r1 instanceof defpackage.f58
            if (r2 == 0) goto L9d
            r2 = r1
            f58 r2 = (defpackage.f58) r2
            r2.g(r4)
        L9d:
            rb5 r2 = r0.e
            r3 = r23
            defpackage.b47.a(r2, r1, r3)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z08.b(java.lang.Object, int, java.lang.Object, ib5):void");
    }

    public final void c(Object obj, Object obj2) {
        rb5 rb5Var = this.e;
        b47.m(rb5Var, obj2, obj);
        if (!(obj2 instanceof ck1) || rb5Var.c(obj2)) {
            return;
        }
        b47.n(this.l, obj2);
        this.m.remove(obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void d(defpackage.dp2 r34) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z08.d(dp2):void");
    }
}
