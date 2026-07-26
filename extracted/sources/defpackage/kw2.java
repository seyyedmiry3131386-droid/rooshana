package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class kw2 implements mz1 {
    public final cm7 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public cp8 j;
    public jw2 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final k62 d = new k62(7);
    public final k62 e = new k62(8);
    public final k62 f = new k62(6);
    public long m = -9223372036854775807L;
    public final h26 o = new h26();

    public kw2(cm7 cm7Var, boolean z, boolean z2) {
        this.a = cm7Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.mz1
    public final void a(h26 h26Var) {
        int i;
        vy2.t(this.j);
        String str = j29.a;
        int i2 = h26Var.b;
        int i3 = h26Var.c;
        byte[] bArr = h26Var.a;
        this.g += (long) h26Var.a();
        this.j.d(h26Var.a(), h26Var);
        while (true) {
            int iO = s7.o(bArr, i2, i3, this.h);
            if (iO == i3) {
                g(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iO + 3] & 31;
            if (iO <= 0 || bArr[iO - 1] != 0) {
                i = 3;
            } else {
                iO--;
                i = 4;
            }
            int i5 = iO;
            int i6 = i;
            int i7 = i5 - i2;
            if (i7 > 0) {
                g(bArr, i2, i5);
            }
            int i8 = i3 - i5;
            long j = this.g - ((long) i8);
            b(i8, i7 < 0 ? -i7 : 0, j, this.m);
            h(j, i4, this.m);
            i2 = i5 + i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b(int r26, int r27, long r28, long r30) {
        /*
            Method dump skipped, instruction units count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw2.b(int, int, long, long):void");
    }

    @Override // defpackage.mz1
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        s7.g(this.h);
        this.d.d();
        this.e.d();
        this.f.d();
        this.a.d.j(0);
        jw2 jw2Var = this.k;
        if (jw2Var != null) {
            jw2Var.k = false;
            jw2Var.o = false;
            iw2 iw2Var = jw2Var.n;
            iw2Var.b = false;
            iw2Var.a = false;
        }
    }

    @Override // defpackage.mz1
    public final void d(boolean z) {
        vy2.t(this.j);
        String str = j29.a;
        if (z) {
            this.a.d.j(0);
            b(0, 0, this.g, this.m);
            h(this.g, 9, this.m);
            b(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.mz1
    public final void e(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    @Override // defpackage.mz1
    public final void f(x72 x72Var, ft8 ft8Var) {
        ft8Var.a();
        ft8Var.b();
        this.i = ft8Var.e;
        ft8Var.b();
        cp8 cp8VarO = x72Var.o(ft8Var.d, 2);
        this.j = cp8VarO;
        this.k = new jw2(cp8VarO, this.b, this.c);
        this.a.b(x72Var, ft8Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0137  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kw2.g(byte[], int, int):void");
    }

    public final void h(long j, int i, long j2) {
        if (!this.l || this.k.c) {
            this.d.e(i);
            this.e.e(i);
        }
        this.f.e(i);
        jw2 jw2Var = this.k;
        boolean z = this.n;
        jw2Var.i = i;
        jw2Var.l = j2;
        jw2Var.j = j;
        jw2Var.s = z;
        if (!jw2Var.b || i != 1) {
            if (!jw2Var.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        iw2 iw2Var = jw2Var.m;
        jw2Var.m = jw2Var.n;
        jw2Var.n = iw2Var;
        iw2Var.b = false;
        iw2Var.a = false;
        jw2Var.h = 0;
        jw2Var.k = true;
    }
}
