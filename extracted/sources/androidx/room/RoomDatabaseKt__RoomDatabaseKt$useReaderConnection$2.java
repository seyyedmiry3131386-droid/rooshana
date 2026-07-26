package androidx.room;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2", f = "RoomDatabase.kt", l = {472}, m = "invokeSuspend")
final class RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ d b;
    public final /* synthetic */ qp2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2(d dVar, qp2 qp2Var, g51 g51Var) {
        super(2, g51Var);
        this.b = dVar;
        this.c = qp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
        this.a = 1;
        Object objJ = this.b.j(true, this.c, this);
        return objJ == coroutineSingletons ? coroutineSingletons : objJ;
    }
}
