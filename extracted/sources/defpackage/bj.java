package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bj extends tt9 {
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bj(List list, int i) {
        super(1, list);
        this.c = i;
    }

    @Override // defpackage.jj
    public final s70 a() {
        switch (this.c) {
            case 0:
                return new dv0((List) this.b, 0);
            case 1:
                return new su2((List) this.b, 0);
            case 2:
                return new dv0((List) this.b, 1);
            case 3:
                return new su2((List) this.b, 1);
            case 4:
                return new su2((List) this.b, 2);
            case 5:
                return new ls7((List) this.b);
            default:
                return new dv0((List) this.b, 2);
        }
    }
}
