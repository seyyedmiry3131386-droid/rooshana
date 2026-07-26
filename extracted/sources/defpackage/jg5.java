package defpackage;

import ir.mservices.market.views.MyketVideoView;
import ir.myket.callback.manager.a;

/* JADX INFO: loaded from: classes3.dex */
public final class jg5 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MyketVideoView b;

    public /* synthetic */ jg5(MyketVideoView myketVideoView, int i) {
        this.a = i;
        this.b = myketVideoView;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return ((lf7) this.b.getKoin().c.e).b(g27.a(hs5.class), null, null);
            default:
                return ((lf7) this.b.getKoin().c.e).b(g27.a(a.class), null, null);
        }
    }
}
