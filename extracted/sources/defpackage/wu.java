package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class wu extends c26 {
    public final double[] v;
    public final vu[] w;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0037  */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, wu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public wu(int[] r33, double[] r34, double[][] r35) {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wu.<init>(int[], double[], double[][]):void");
    }

    @Override // defpackage.c26
    public final double B(double d) {
        vu[] vuVarArr = this.w;
        double d2 = vuVarArr[0].c;
        if (d < d2) {
            d = d2;
        }
        if (d > vuVarArr[vuVarArr.length - 1].d) {
            d = vuVarArr[vuVarArr.length - 1].d;
        }
        for (int i = 0; i < vuVarArr.length; i++) {
            vu vuVar = vuVarArr[i];
            if (d <= vuVar.d) {
                if (vuVar.r) {
                    return vuVar.l;
                }
                vuVar.g(d);
                return vuVarArr[i].a();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.c26
    public final void C(double d, double[] dArr) {
        vu[] vuVarArr = this.w;
        double d2 = vuVarArr[0].c;
        if (d < d2) {
            d = d2;
        } else if (d > vuVarArr[vuVarArr.length - 1].d) {
            d = vuVarArr[vuVarArr.length - 1].d;
        }
        for (int i = 0; i < vuVarArr.length; i++) {
            vu vuVar = vuVarArr[i];
            if (d <= vuVar.d) {
                if (vuVar.r) {
                    dArr[0] = vuVar.l;
                    dArr[1] = vuVar.m;
                    return;
                } else {
                    vuVar.g(d);
                    dArr[0] = vuVarArr[i].a();
                    dArr[1] = vuVarArr[i].b();
                    return;
                }
            }
        }
    }

    @Override // defpackage.c26
    public final double[] D() {
        return this.v;
    }

    @Override // defpackage.c26
    public final double w(double d) {
        vu[] vuVarArr = this.w;
        vu vuVar = vuVarArr[0];
        double d2 = vuVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (vuVar.r) {
                return (d3 * vuVarArr[0].l) + vuVar.c(d2);
            }
            vuVar.g(d2);
            return (vuVarArr[0].a() * d3) + vuVarArr[0].e();
        }
        if (d > vuVarArr[vuVarArr.length - 1].d) {
            double d4 = vuVarArr[vuVarArr.length - 1].d;
            double d5 = d - d4;
            int length = vuVarArr.length - 1;
            return (d5 * vuVarArr[length].l) + vuVarArr[length].c(d4);
        }
        for (int i = 0; i < vuVarArr.length; i++) {
            vu vuVar2 = vuVarArr[i];
            if (d <= vuVar2.d) {
                if (vuVar2.r) {
                    return vuVar2.c(d);
                }
                vuVar2.g(d);
                return vuVarArr[i].e();
            }
        }
        return Double.NaN;
    }

    @Override // defpackage.c26
    public final void x(double d, double[] dArr) {
        vu[] vuVarArr = this.w;
        vu vuVar = vuVarArr[0];
        double d2 = vuVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (vuVar.r) {
                double dC = vuVar.c(d2);
                vu vuVar2 = vuVarArr[0];
                dArr[0] = (vuVar2.l * d3) + dC;
                dArr[1] = (d3 * vuVarArr[0].m) + vuVar2.d(d2);
                return;
            }
            vuVar.g(d2);
            dArr[0] = (vuVarArr[0].a() * d3) + vuVarArr[0].e();
            dArr[1] = (vuVarArr[0].b() * d3) + vuVarArr[0].f();
            return;
        }
        if (d <= vuVarArr[vuVarArr.length - 1].d) {
            for (int i = 0; i < vuVarArr.length; i++) {
                vu vuVar3 = vuVarArr[i];
                if (d <= vuVar3.d) {
                    if (vuVar3.r) {
                        dArr[0] = vuVar3.c(d);
                        dArr[1] = vuVarArr[i].d(d);
                        return;
                    } else {
                        vuVar3.g(d);
                        dArr[0] = vuVarArr[i].e();
                        dArr[1] = vuVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = vuVarArr[vuVarArr.length - 1].d;
        double d5 = d - d4;
        int length = vuVarArr.length - 1;
        vu vuVar4 = vuVarArr[length];
        if (vuVar4.r) {
            double dC2 = vuVar4.c(d4);
            vu vuVar5 = vuVarArr[length];
            dArr[0] = (vuVar5.l * d5) + dC2;
            dArr[1] = (d5 * vuVarArr[length].m) + vuVar5.d(d4);
            return;
        }
        vuVar4.g(d);
        dArr[0] = (vuVarArr[length].a() * d5) + vuVarArr[length].e();
        dArr[1] = (vuVarArr[length].b() * d5) + vuVarArr[length].f();
    }

    @Override // defpackage.c26
    public final void y(double d, float[] fArr) {
        vu[] vuVarArr = this.w;
        vu vuVar = vuVarArr[0];
        double d2 = vuVar.c;
        if (d < d2) {
            double d3 = d - d2;
            if (vuVar.r) {
                double dC = vuVar.c(d2);
                vu vuVar2 = vuVarArr[0];
                fArr[0] = (float) ((vuVar2.l * d3) + dC);
                fArr[1] = (float) ((d3 * vuVarArr[0].m) + vuVar2.d(d2));
                return;
            }
            vuVar.g(d2);
            fArr[0] = (float) ((vuVarArr[0].a() * d3) + vuVarArr[0].e());
            fArr[1] = (float) ((vuVarArr[0].b() * d3) + vuVarArr[0].f());
            return;
        }
        if (d <= vuVarArr[vuVarArr.length - 1].d) {
            for (int i = 0; i < vuVarArr.length; i++) {
                vu vuVar3 = vuVarArr[i];
                if (d <= vuVar3.d) {
                    if (vuVar3.r) {
                        fArr[0] = (float) vuVar3.c(d);
                        fArr[1] = (float) vuVarArr[i].d(d);
                        return;
                    } else {
                        vuVar3.g(d);
                        fArr[0] = (float) vuVarArr[i].e();
                        fArr[1] = (float) vuVarArr[i].f();
                        return;
                    }
                }
            }
            return;
        }
        double d4 = vuVarArr[vuVarArr.length - 1].d;
        double d5 = d - d4;
        int length = vuVarArr.length - 1;
        vu vuVar4 = vuVarArr[length];
        if (!vuVar4.r) {
            vuVar4.g(d);
            fArr[0] = (float) vuVarArr[length].e();
            fArr[1] = (float) vuVarArr[length].f();
        } else {
            double dC2 = vuVar4.c(d4);
            vu vuVar5 = vuVarArr[length];
            fArr[0] = (float) ((vuVar5.l * d5) + dC2);
            fArr[1] = (float) ((d5 * vuVarArr[length].m) + vuVar5.d(d4));
        }
    }
}
