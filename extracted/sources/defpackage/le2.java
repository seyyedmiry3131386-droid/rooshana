package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class le2 implements be2 {
    public final float a;
    public final n38 b;

    public le2(float f, float f2, float f3) {
        this.a = f3;
        n38 n38Var = new n38();
        n38Var.a = 1.0f;
        n38Var.b = Math.sqrt(50.0d);
        n38Var.c = 1.0f;
        if (f < 0.0f) {
            yi6.a("Damping ratio must be non-negative");
        }
        n38Var.c = f;
        double d = n38Var.b;
        if (((float) (d * d)) <= 0.0f) {
            yi6.a("Spring stiffness constant must be positive.");
        }
        n38Var.b = Math.sqrt(f2);
        this.b = n38Var;
    }

    @Override // defpackage.sk
    public final x39 a(mt8 mt8Var) {
        return new o77(this);
    }

    @Override // defpackage.be2
    public final float b(long j, float f, float f2, float f3) {
        n38 n38Var = this.b;
        n38Var.a = f2;
        return Float.intBitsToFloat((int) (n38Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0211  */
    @Override // defpackage.be2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long c(float r33, float r34, float r35) {
        /*
            Method dump skipped, instruction units count: 581
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.le2.c(float, float, float):long");
    }

    @Override // defpackage.be2
    public final float d(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // defpackage.be2
    public final float e(long j, float f, float f2, float f3) {
        n38 n38Var = this.b;
        n38Var.a = f2;
        return Float.intBitsToFloat((int) (n38Var.a(f, f3, j / 1000000) >> 32));
    }
}
