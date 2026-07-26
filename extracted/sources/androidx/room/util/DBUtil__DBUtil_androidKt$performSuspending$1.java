package androidx.room.util;

import androidx.room.d;
import defpackage.dp2;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", l = {262, 264, 264}, m = "performSuspending")
final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends ContinuationImpl {
    public d a;
    public dp2 b;
    public boolean c;
    public boolean d;
    public /* synthetic */ Object e;
    public int f;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.f |= Integer.MIN_VALUE;
        return a.b(this, null, null, false, false);
    }
}
