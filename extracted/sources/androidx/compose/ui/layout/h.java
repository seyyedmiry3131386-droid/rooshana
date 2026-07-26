package androidx.compose.ui.layout;

import defpackage.b96;
import defpackage.h31;
import defpackage.nd2;
import defpackage.yk4;

/* JADX INFO: loaded from: classes.dex */
public final class h implements yk4 {
    public final yk4 a;
    public final MeasuringIntrinsics$IntrinsicMinMax b;
    public final MeasuringIntrinsics$IntrinsicWidthHeight c;

    public h(yk4 yk4Var, MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax, MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight) {
        this.a = yk4Var;
        this.b = measuringIntrinsics$IntrinsicMinMax;
        this.c = measuringIntrinsics$IntrinsicWidthHeight;
    }

    @Override // defpackage.yk4
    public final int P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.yk4
    public final int a(int i) {
        return this.a.a(i);
    }

    @Override // defpackage.yk4
    public final int l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.yk4
    public final int n(int i) {
        return this.a.n(i);
    }

    @Override // defpackage.yk4
    public final b96 t(long j) {
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight = this.c;
        MeasuringIntrinsics$IntrinsicWidthHeight measuringIntrinsics$IntrinsicWidthHeight2 = MeasuringIntrinsics$IntrinsicWidthHeight.a;
        MeasuringIntrinsics$IntrinsicMinMax measuringIntrinsics$IntrinsicMinMax = this.b;
        yk4 yk4Var = this.a;
        if (measuringIntrinsics$IntrinsicWidthHeight == measuringIntrinsics$IntrinsicWidthHeight2) {
            return new nd2(measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.b ? yk4Var.n(h31.g(j)) : yk4Var.l(h31.g(j)), h31.c(j) ? h31.g(j) : 32767, 1);
        }
        return new nd2(h31.d(j) ? h31.h(j) : 32767, measuringIntrinsics$IntrinsicMinMax == MeasuringIntrinsics$IntrinsicMinMax.b ? yk4Var.a(h31.h(j)) : yk4Var.P(h31.h(j)), 1);
    }

    @Override // defpackage.yk4
    public final Object v() {
        return this.a.v();
    }
}
