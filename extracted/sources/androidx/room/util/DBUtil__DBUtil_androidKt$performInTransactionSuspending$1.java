package androidx.room.util;

import defpackage.bt2;
import defpackage.tb1;
import defpackage.w61;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {97, 262, 264, 264}, m = "performInTransactionSuspending")
final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$1<R> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.a = obj;
        int i = (this.b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i == 0) {
            b.b(obj);
            throw null;
        }
        if (i == 1) {
            b.b(obj);
            return obj;
        }
        if (i == 2) {
            b.b(obj);
            return obj;
        }
        if (i != 3) {
            if (i != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
            return obj;
        }
        b.b(obj);
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(null, null, null);
        this.b = 4;
        Object objZ = bt2.Z((w61) obj, dBUtil__DBUtil_androidKt$performInTransactionSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1, this);
        return objZ == coroutineSingletons ? coroutineSingletons : objZ;
    }
}
