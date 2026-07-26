package ir.mservices.market.social.mynet.view;

import defpackage.d04;
import defpackage.f19;
import defpackage.u91;
import ir.mservices.market.views.FlowLayoutView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Hilt_UserInfoTagsView extends FlowLayoutView {
    public boolean d;

    @Override // ir.mservices.market.views.Hilt_FlowLayoutView
    public final void a() {
        if (this.d) {
            return;
        }
        this.d = true;
        ((UserInfoTagsView) this).c = (d04) ((u91) ((f19) e())).a.p.get();
    }
}
