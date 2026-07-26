package androidx.room;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", l = {501, 501}, m = "useWriterConnection")
final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1<R> extends ContinuationImpl {
    public d a;
    public /* synthetic */ Object b;
    public int c;

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004e, code lost:
    
        if (r6 == r1) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            r5.b = r6
            int r0 = r5.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r0 | r1
            int r0 = r0 - r1
            r5.c = r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L29
            if (r0 == r4) goto L23
            if (r0 != r3) goto L1b
            androidx.room.d r0 = r5.a
            kotlin.b.b(r6)
            goto L51
        L1b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L23:
            androidx.room.d r0 = r5.a
            kotlin.b.b(r6)
            goto L39
        L29:
            kotlin.b.b(r6)
            r5.a = r2
            r5.c = r4
            r6 = 0
            w61 r6 = androidx.room.util.a.a(r2, r6, r5)
            if (r6 != r1) goto L38
            goto L50
        L38:
            r0 = r2
        L39:
            w61 r6 = (defpackage.w61) r6
            sm0 r4 = defpackage.sm0.c
            w61 r6 = r6.l0(r4)
            androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2 r4 = new androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$2
            r4.<init>(r0, r2, r2)
            r5.a = r0
            r5.c = r3
            java.lang.Object r6 = defpackage.bt2.Z(r6, r4, r5)
            if (r6 != r1) goto L51
        L50:
            return r1
        L51:
            androidx.room.a r0 = r0.d()
            r0.b()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
