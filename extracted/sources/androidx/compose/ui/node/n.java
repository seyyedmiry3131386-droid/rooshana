package androidx.compose.ui.node;

import defpackage.b96;
import defpackage.h31;
import defpackage.nd2;
import defpackage.yk4;

/* JADX INFO: loaded from: classes.dex */
public final class n implements yk4 {
    public final yk4 a;
    public final NodeMeasuringIntrinsics$IntrinsicMinMax b;
    public final NodeMeasuringIntrinsics$IntrinsicWidthHeight c;

    public n(yk4 yk4Var, NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax, NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight) {
        this.a = yk4Var;
        this.b = nodeMeasuringIntrinsics$IntrinsicMinMax;
        this.c = nodeMeasuringIntrinsics$IntrinsicWidthHeight;
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
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight = this.c;
        NodeMeasuringIntrinsics$IntrinsicWidthHeight nodeMeasuringIntrinsics$IntrinsicWidthHeight2 = NodeMeasuringIntrinsics$IntrinsicWidthHeight.a;
        NodeMeasuringIntrinsics$IntrinsicMinMax nodeMeasuringIntrinsics$IntrinsicMinMax = this.b;
        yk4 yk4Var = this.a;
        if (nodeMeasuringIntrinsics$IntrinsicWidthHeight == nodeMeasuringIntrinsics$IntrinsicWidthHeight2) {
            return new nd2(nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.b ? yk4Var.n(h31.g(j)) : yk4Var.l(h31.g(j)), h31.c(j) ? h31.g(j) : 32767, 2);
        }
        return new nd2(h31.d(j) ? h31.h(j) : 32767, nodeMeasuringIntrinsics$IntrinsicMinMax == NodeMeasuringIntrinsics$IntrinsicMinMax.b ? yk4Var.a(h31.h(j)) : yk4Var.P(h31.h(j)), 2);
    }

    @Override // defpackage.yk4
    public final Object v() {
        return this.a.v();
    }
}
