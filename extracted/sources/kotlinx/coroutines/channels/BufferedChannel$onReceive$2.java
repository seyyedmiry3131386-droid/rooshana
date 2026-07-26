package kotlinx.coroutines.channels;

import defpackage.mh0;
import defpackage.rp2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class BufferedChannel$onReceive$2 extends FunctionReferenceImpl implements rp2 {
    public static final BufferedChannel$onReceive$2 a = new BufferedChannel$onReceive$2();

    public BufferedChannel$onReceive$2() {
        super(3, a.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) throws Throwable {
        a aVar = (a) obj;
        AtomicLongFieldUpdater atomicLongFieldUpdater = a.b;
        aVar.getClass();
        if (obj3 != mh0.l) {
            return obj3;
        }
        throw aVar.v();
    }
}
