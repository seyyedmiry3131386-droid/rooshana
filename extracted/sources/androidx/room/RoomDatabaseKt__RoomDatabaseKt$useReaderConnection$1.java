package androidx.room;

import defpackage.bt2;
import defpackage.sm0;
import defpackage.tb1;
import defpackage.w61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", l = {471, 471}, m = "useReaderConnection")
final class RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$1<R> extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.a = obj;
        int i = (this.b | Integer.MIN_VALUE) - Integer.MIN_VALUE;
        this.b = i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.b = 1;
            obj = androidx.room.util.a.a(null, false, this);
            if (obj != coroutineSingletons) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        w61 w61VarL0 = ((w61) obj).l0(sm0.c);
        RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 roomDatabaseKt__RoomDatabaseKt$useReaderConnection$2 = new RoomDatabaseKt__RoomDatabaseKt$useReaderConnection$2(null, null, null);
        this.b = 2;
        Object objZ = bt2.Z(w61VarL0, roomDatabaseKt__RoomDatabaseKt$useReaderConnection$2, this);
        return objZ == coroutineSingletons ? coroutineSingletons : objZ;
    }
}
