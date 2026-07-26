package androidx.datastore.core;

import defpackage.g51;
import defpackage.lv6;
import defpackage.rb2;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.datastore.core.StorageConnectionKt$readData$2", f = "StorageConnection.kt", l = {63}, m = "invokeSuspend", v = 1)
final class StorageConnectionKt$readData$2 extends SuspendLambda implements rp2 {
    public int a;
    public /* synthetic */ lv6 b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        StorageConnectionKt$readData$2 storageConnectionKt$readData$2 = new StorageConnectionKt$readData$2(3, (g51) obj3);
        storageConnectionKt$readData$2.b = (lv6) obj;
        return storageConnectionKt$readData$2.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        lv6 lv6Var = this.b;
        this.a = 1;
        rb2 rb2Var = (rb2) lv6Var;
        if (rb2Var.b.get()) {
            throw new IllegalStateException("This scope has already been closed.");
        }
        Object objA = a.a(rb2Var.a, new FileReadScope$readData$2(rb2Var, null), this);
        return objA == coroutineSingletons ? coroutineSingletons : objA;
    }
}
