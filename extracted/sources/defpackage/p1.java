package defpackage;

import com.google.common.collect.TreeMultiset;
import com.google.common.collect.w;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class p1 extends ii4 {
    public final /* synthetic */ int b;
    public final /* synthetic */ oa5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p1(oa5 oa5Var, int i) {
        super(2);
        this.b = i;
        this.c = oa5Var;
    }

    @Override // defpackage.ii4
    public oa5 f() {
        switch (this.b) {
            case 0:
                return (w) this.c;
            default:
                return (w2) this.c;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                return ((w) this.c).h();
            default:
                ((TreeMultiset) ((w2) this.c).v).getClass();
                throw null;
        }
    }

    @Override // defpackage.ii4, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.b) {
            case 0:
                return ((w) this.c).e();
            default:
                return ((w2) this.c).v.entrySet().size();
        }
    }
}
