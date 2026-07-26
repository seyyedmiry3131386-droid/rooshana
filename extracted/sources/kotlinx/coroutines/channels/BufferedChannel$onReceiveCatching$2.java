package kotlinx.coroutines.channels;

import defpackage.hp0;
import defpackage.jp0;
import defpackage.mh0;
import defpackage.rp2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onReceiveCatching$2 extends FunctionReferenceImpl implements rp2 {
    public static final BufferedChannel$onReceiveCatching$2 a = new BufferedChannel$onReceiveCatching$2();

    public BufferedChannel$onReceiveCatching$2() {
        super(3, a.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        a aVar = (a) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.b;
        aVar.getClass();
        if (obj3 == mh0.l) {
            obj3 = new hp0(aVar.u());
        }
        return new jp0(obj3);
    }
}
