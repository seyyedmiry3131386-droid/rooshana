package defpackage;

import io.noties.markwon.core.CoreProps$ListItemType;
import io.noties.markwon.core.spans.LinkSpan;

/* JADX INFO: loaded from: classes3.dex */
public final class bd0 {
    public final /* synthetic */ int a;

    public /* synthetic */ bd0(int i) {
        this.a = i;
    }

    public final Object a(rb4 rb4Var, xg5 xg5Var) {
        switch (this.a) {
            case 0:
                return new ad0((ui4) rb4Var.b, 0);
            case 1:
                return new iu0((ui4) rb4Var.b);
            case 2:
                return new ju0(0, (ui4) rb4Var.b);
            case 3:
                return new v02(0);
            case 4:
                return new gy2((ui4) rb4Var.b, ((Integer) ct2.e.a(xg5Var)).intValue());
            case 5:
                return new LinkSpan((ui4) rb4Var.b, (String) ct2.f.a(xg5Var), (sl3) rb4Var.d);
            case 6:
                if (CoreProps$ListItemType.a == ct2.b.a(xg5Var)) {
                    return new xh0((ui4) rb4Var.b, ((Integer) ct2.c.a(xg5Var)).intValue());
                }
                return new xv5((ui4) rb4Var.b, String.valueOf(ct2.d.a(xg5Var)).concat(". "));
            case 7:
                return new v02(1);
            default:
                return new ad0((ui4) rb4Var.b, 1);
        }
    }
}
