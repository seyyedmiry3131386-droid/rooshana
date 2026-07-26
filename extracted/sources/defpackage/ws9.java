package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ws9 extends pk9 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ws9(String str, int i) {
        super(str);
        this.c = i;
    }

    @Override // defpackage.pk9
    public final xk9 b(o77 o77Var, List list) {
        switch (this.c) {
            case 0:
                return xk9.p0;
            case 1:
            case 2:
                return this;
            case 3:
                return new nk9(Double.valueOf(0.0d));
            default:
                return xk9.p0;
        }
    }
}
