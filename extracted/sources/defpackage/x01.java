package defpackage;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.w;
import com.google.common.primitives.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x01 extends p1 {
    public final /* synthetic */ ConcurrentHashMultiset d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x01(ConcurrentHashMultiset concurrentHashMultiset) {
        super(concurrentHashMultiset, 0);
        this.d = concurrentHashMultiset;
    }

    @Override // defpackage.p1, defpackage.ii4
    public final oa5 f() {
        return this.d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray() {
        w wVar = (w) this.c;
        int iE = wVar.e();
        vy2.m(iE, "arraySize");
        ArrayList arrayList = new ArrayList(a.f(((long) iE) + 5 + ((long) (iE / 10))));
        s7.c(arrayList, wVar.h());
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final Object[] toArray(Object[] objArr) {
        w wVar = (w) this.c;
        int iE = wVar.e();
        vy2.m(iE, "arraySize");
        ArrayList arrayList = new ArrayList(a.f(((long) iE) + 5 + ((long) (iE / 10))));
        s7.c(arrayList, wVar.h());
        return arrayList.toArray(objArr);
    }
}
