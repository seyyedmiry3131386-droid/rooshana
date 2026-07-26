package defpackage;

import ir.mservices.market.activity.BaseNavigationContentActivity;

/* JADX INFO: loaded from: classes3.dex */
public final class f80 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseNavigationContentActivity b;

    public /* synthetic */ f80(BaseNavigationContentActivity baseNavigationContentActivity, int i) {
        this.a = i;
        this.b = baseNavigationContentActivity;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.h();
            case 1:
                return this.b.m();
            default:
                return this.b.i();
        }
    }
}
