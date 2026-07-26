package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dr4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qg6 b;
    public final /* synthetic */ int c;

    public /* synthetic */ dr4(qg6 qg6Var, int i, int i2) {
        this.a = i2;
        this.b = qg6Var;
        this.c = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qg6 qg6Var = this.b;
                if (qg6Var.f0(25) || qg6Var.f0(33)) {
                    boolean zF0 = qg6Var.f0(33);
                    int i = this.c;
                    if (!zF0) {
                        qg6Var.I0(i);
                    } else {
                        qg6Var.J0(i, 1);
                    }
                }
                break;
            default:
                qg6 qg6Var2 = this.b;
                if (qg6Var2.f0(26) || qg6Var2.f0(34)) {
                    int i2 = this.c;
                    if (i2 == -100) {
                        if (!qg6Var2.f0(34)) {
                            qg6Var2.H0(true);
                        } else {
                            qg6Var2.G0(1, true);
                        }
                    } else if (i2 == -1) {
                        if (!qg6Var2.f0(34)) {
                            qg6Var2.l0();
                        } else {
                            qg6Var2.m0(1);
                        }
                    } else if (i2 == 1) {
                        if (!qg6Var2.f0(34)) {
                            qg6Var2.w0();
                        } else {
                            qg6Var2.x0(1);
                        }
                    } else if (i2 == 100) {
                        if (!qg6Var2.f0(34)) {
                            qg6Var2.H0(false);
                        } else {
                            qg6Var2.G0(1, false);
                        }
                    } else if (i2 != 101) {
                        o40.E(i2, "onAdjustVolume: Ignoring unknown direction: ", "VolumeProviderCompat");
                    } else if (!qg6Var2.f0(34)) {
                        qg6Var2.z0();
                        qg6Var2.H0(true);
                    } else {
                        qg6Var2.z0();
                        qg6Var2.G0(1, true);
                    }
                }
                break;
        }
    }
}
