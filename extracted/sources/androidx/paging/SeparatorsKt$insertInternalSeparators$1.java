package androidx.paging;

import defpackage.mq8;
import defpackage.rp2;
import defpackage.tb1;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SeparatorsKt", f = "Separators.kt", l = {82}, m = "insertInternalSeparators", v = 1)
final class SeparatorsKt$insertInternalSeparators$1<R, T extends R> extends ContinuationImpl {
    public mq8 a;
    public rp2 b;
    public ArrayList c;
    public ArrayList d;
    public Object e;
    public int f;
    public int g;
    public /* synthetic */ Object h;
    public int i;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return e.e(null, null, this);
    }
}
