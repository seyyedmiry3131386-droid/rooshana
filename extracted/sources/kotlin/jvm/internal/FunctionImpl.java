package kotlin.jvm.internal;

import defpackage.bp2;
import defpackage.cp2;
import defpackage.dp2;
import defpackage.ep2;
import defpackage.fp2;
import defpackage.gp2;
import defpackage.hp2;
import defpackage.ip2;
import defpackage.jp2;
import defpackage.kp2;
import defpackage.lp2;
import defpackage.mp2;
import defpackage.np2;
import defpackage.op2;
import defpackage.pp2;
import defpackage.qp2;
import defpackage.qz0;
import defpackage.rm7;
import defpackage.rp2;
import defpackage.sp2;
import defpackage.tp2;
import defpackage.up2;
import defpackage.vp2;
import defpackage.wp2;
import defpackage.xp2;
import defpackage.yj1;
import ir.myket.common.utils.extensions.FlowExtenstionsKt$combine$$inlined$combine$1$3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
@yj1
@Deprecated
public abstract class FunctionImpl implements np2, Serializable, bp2, dp2, qp2, rp2, sp2, tp2, up2, vp2, wp2, xp2, cp2, ep2, fp2, gp2, hp2, ip2, jp2, kp2, lp2, mp2, op2, pp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        b(3);
        throw new UnsupportedOperationException();
    }

    public final void b(int i) {
        if (getArity() == i) {
            return;
        }
        StringBuilder sbR = rm7.r(i, "Wrong function arity, expected: ", ", actual: ");
        sbR.append(getArity());
        throw new IllegalStateException(sbR.toString());
    }

    @Override // defpackage.sp2
    public final Object g(Object obj, Object obj2, Object obj3, Object obj4) {
        b(4);
        throw new UnsupportedOperationException();
    }

    public abstract int getArity();

    @Override // defpackage.fp2
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, FlowExtenstionsKt$combine$$inlined$combine$1$3 flowExtenstionsKt$combine$$inlined$combine$1$3) {
        b(12);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.wp2
    public final Object i(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, qz0 qz0Var, Integer num) {
        b(8);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        b(0);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        b(1);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        b(2);
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.tp2
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b(5);
        throw new UnsupportedOperationException();
    }
}
