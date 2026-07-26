package kotlinx.coroutines.channels;

import defpackage.js3;
import defpackage.kp0;
import defpackage.mh0;
import defpackage.qp2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class BufferedChannelKt$createSegmentFunction$1 extends FunctionReferenceImpl implements qp2 {
    public static final BufferedChannelKt$createSegmentFunction$1 a = new BufferedChannelKt$createSegmentFunction$1();

    public BufferedChannelKt$createSegmentFunction$1() {
        super(2, mh0.class, "createSegment", "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;", 1);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        long jLongValue = ((Number) obj).longValue();
        kp0 kp0Var = (kp0) obj2;
        kp0 kp0Var2 = mh0.a;
        a aVar = kp0Var.e;
        js3.m(aVar);
        return new kp0(jLongValue, kp0Var, aVar, 0);
    }
}
