package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class gi4 extends rq8 {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gi4(Iterator it, int i) {
        super(it);
        this.b = i;
    }

    @Override // defpackage.rq8
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return ((Map.Entry) obj).getKey();
            case 1:
                return ((Map.Entry) obj).getValue();
            case 2:
                return ((pa5) obj).b();
            default:
                return new ra5((Map.Entry) obj, 0);
        }
    }
}
