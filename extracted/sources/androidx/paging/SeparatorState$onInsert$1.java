package androidx.paging;

import defpackage.tb1;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.SeparatorState", f = "Separators.kt", l = {310, 373, 385, 391, 403, 412, 437, 446, 460, 471}, m = "onInsert", v = 1)
final class SeparatorState$onInsert$1 extends ContinuationImpl {
    public i a;
    public ArrayList b;
    public ArrayList c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public ArrayList i;
    public boolean j;
    public int k;
    public int l;
    public int m;
    public /* synthetic */ Object n;
    public final /* synthetic */ o o;
    public int p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SeparatorState$onInsert$1(o oVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.o = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.n = obj;
        this.p |= Integer.MIN_VALUE;
        return this.o.b(null, this);
    }
}
