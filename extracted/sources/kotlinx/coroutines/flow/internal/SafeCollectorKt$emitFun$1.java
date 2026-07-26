package kotlinx.coroutines.flow.internal;

import defpackage.g51;
import defpackage.rp2;
import defpackage.ze2;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class SafeCollectorKt$emitFun$1 extends FunctionReferenceImpl implements rp2 {
    public static final SafeCollectorKt$emitFun$1 a = new SafeCollectorKt$emitFun$1();

    public SafeCollectorKt$emitFun$1() {
        super(3, ze2.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        return ((ze2) obj).emit(obj2, (g51) obj3);
    }
}
