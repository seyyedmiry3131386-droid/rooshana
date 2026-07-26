package defpackage;

import android.view.View;
import ir.mservices.market.app.detail.more.ui.recycler.MoreInformationData;
import ir.mservices.market.app.detail.ui.recycler.ReviewEmptyData;
import ir.mservices.market.app.home.ui.recycler.HomeTopBannerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.feedback.recycler.FeedbackTransactionHeaderData;
import ir.mservices.market.pika.connect.recycler.PikaSelectDeviceTitleData;
import ir.mservices.market.version2.ui.recycler.EmptyData;

/* JADX INFO: loaded from: classes3.dex */
public final class m12 extends qg5 {
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m12(int i, View view) {
        super(view);
        this.w = i;
    }

    @Override // defpackage.qg5
    public void s(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 2:
                js3.p((HomeTopBannerData) myketRecyclerData, "data");
                js3.V("binding");
                throw null;
            default:
                super.s(myketRecyclerData);
                return;
        }
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 0:
                js3.p((EmptyData) myketRecyclerData, "data");
                return;
            case 1:
                js3.p((FeedbackTransactionHeaderData) myketRecyclerData, "data");
                return;
            case 2:
                js3.p((HomeTopBannerData) myketRecyclerData, "data");
                js3.V("binding");
                throw null;
            case 3:
                js3.p((MoreInformationData) myketRecyclerData, "data");
                return;
            case 4:
                js3.p((PikaSelectDeviceTitleData) myketRecyclerData, "data");
                return;
            default:
                js3.p((ReviewEmptyData) myketRecyclerData, "data");
                return;
        }
    }

    @Override // defpackage.qg5, androidx.recyclerview.widget.o
    public String toString() {
        switch (this.w) {
            case 0:
                return t61.j(super.toString(), "  ", m12.class.getName());
            default:
                return super.toString();
        }
    }

    @Override // defpackage.qg5
    public void u(MyketRecyclerData myketRecyclerData) {
        switch (this.w) {
            case 2:
                js3.p((HomeTopBannerData) myketRecyclerData, "data");
                js3.V("binding");
                throw null;
            default:
                super.u(myketRecyclerData);
                return;
        }
    }

    @Override // defpackage.qg5
    public void w(a79 a79Var) {
        switch (this.w) {
            case 2:
                if (a79Var instanceof z23) {
                    js3.V("binding");
                    throw null;
                }
                lw.g(null, "binding is incompatible", null);
                return;
            default:
                return;
        }
    }
}
