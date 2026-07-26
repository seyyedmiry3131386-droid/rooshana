package defpackage;

import android.view.View;
import android.view.ViewGroup;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.app.detail.developer.ui.recycler.AppDeveloperInfoModuleData;
import ir.mservices.market.app.detail.developer.ui.recycler.DeveloperPageTitleRowData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.myAccount.inbox.recycler.InboxData;
import ir.mservices.market.myAccount.inbox.recycler.InboxHeaderData;
import ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData;
import ir.mservices.market.pika.receive.recycler.ReceivedAppData;
import ir.mservices.market.pika.send.recycler.InstalledAppData;
import ir.mservices.market.pika.send.recycler.InstalledAppsTitleData;
import ir.mservices.market.pika.send.recycler.SearchAppData;
import ir.mservices.market.social.requests.recycler.RequestAccountData;
import ir.mservices.market.version2.ui.recycler.adapter.a;

/* JADX INFO: loaded from: classes3.dex */
public final class cl1 extends a {
    public final /* synthetic */ int l;
    public Object m;
    public og5 n;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl1(int i, int i2) {
        super(i);
        this.l = i2;
    }

    @Override // ir.mservices.market.version2.ui.recycler.adapter.a
    public final qg5 I(int i, View view, ViewGroup viewGroup) {
        qg5 aqVar;
        qg5 ml3Var;
        qg5 oh7Var;
        switch (this.l) {
            case 0:
                if (i == AppData.d) {
                    ll1 ll1Var = (ll1) this.n;
                    if (ll1Var == null) {
                        js3.V("onAppClickListener");
                        throw null;
                    }
                    bn6 bn6Var = (bn6) this.m;
                    if (bn6Var == null) {
                        js3.V("fastDownloadClickListener");
                        throw null;
                    }
                    aqVar = new ir.mservices.market.app.common.recycler.a(view, ll1Var, bn6Var, null);
                } else {
                    if (i != AppDeveloperInfoModuleData.b) {
                        if (i == DividerData.k) {
                            return new oq1(view);
                        }
                        if (i == DeveloperPageTitleRowData.b) {
                            return new l5(4, view);
                        }
                        return null;
                    }
                    ll1 ll1Var2 = (ll1) this.o;
                    if (ll1Var2 == null) {
                        js3.V("onInfoClickListener");
                        throw null;
                    }
                    aqVar = new aq(view, ll1Var2);
                }
                return aqVar;
            case 1:
                if (i != InCompleteReviewData.d) {
                    return null;
                }
                cl3 cl3Var = (cl3) this.o;
                if (cl3Var == null) {
                    js3.V("onAppClickListener");
                    throw null;
                }
                cl3 cl3Var2 = (cl3) this.n;
                if (cl3Var2 == null) {
                    js3.V("onReviewClickListener");
                    throw null;
                }
                cl3 cl3Var3 = (cl3) this.m;
                if (cl3Var3 != null) {
                    return new ir.mservices.market.myReview.incomplete.recycler.a(view, cl3Var, cl3Var2, cl3Var3);
                }
                js3.V("onRatingClickListener");
                throw null;
            case 2:
                if (i == InboxData.c) {
                    vl3 vl3Var = (vl3) this.m;
                    if (vl3Var == null) {
                        js3.V("onMoreMenuClickListener");
                        throw null;
                    }
                    vl3 vl3Var2 = (vl3) this.n;
                    if (vl3Var2 == null) {
                        js3.V("onInboxClickListener");
                        throw null;
                    }
                    ml3Var = new am3(view, vl3Var, vl3Var2);
                } else {
                    if (i != InboxHeaderData.b) {
                        return null;
                    }
                    vl3 vl3Var3 = (vl3) this.o;
                    if (vl3Var3 == null) {
                        js3.V("onSectionClickListener");
                        throw null;
                    }
                    ml3Var = new ml3(view, vl3Var3);
                }
                return ml3Var;
            case 3:
                if (i == InstalledAppData.e) {
                    up3 up3Var = (up3) this.m;
                    if (up3Var == null) {
                        js3.V("onInstalledAppClickListener");
                        throw null;
                    }
                    oh7Var = new tp3(view, up3Var);
                } else {
                    if (i == InstalledAppsTitleData.b) {
                        return new l5(8, view);
                    }
                    if (i == DividerData.k) {
                        return new oq1(view);
                    }
                    if (i != SearchAppData.a) {
                        return null;
                    }
                    up3 up3Var2 = (up3) this.n;
                    if (up3Var2 == null) {
                        js3.V("onCloseClickListener");
                        throw null;
                    }
                    nm5 nm5Var = (nm5) this.o;
                    if (nm5Var == null) {
                        js3.V("pikaSearchCallback");
                        throw null;
                    }
                    oh7Var = new oh7(view, up3Var2, nm5Var);
                }
                return oh7Var;
            case 4:
                if (i != ReceivedAppData.h) {
                    if (i == DividerData.k) {
                        return new oq1(view);
                    }
                    return null;
                }
                ir.mservices.market.pika.receive.a aVar = (ir.mservices.market.pika.receive.a) this.m;
                if (aVar == null) {
                    js3.V("onInstalledAppClickListener");
                    throw null;
                }
                kw6 kw6Var = (kw6) this.o;
                if (kw6Var == null) {
                    js3.V("onCancelClickListener");
                    throw null;
                }
                y45 y45Var = (y45) this.n;
                if (y45Var != null) {
                    return new ir.mservices.market.pika.receive.recycler.a(view, aVar, kw6Var, y45Var);
                }
                js3.V("onRunClickListener");
                throw null;
            default:
                if (i != RequestAccountData.d) {
                    return null;
                }
                m57 m57Var = (m57) this.m;
                if (m57Var == null) {
                    js3.V("onRequestClickListener");
                    throw null;
                }
                m57 m57Var2 = (m57) this.n;
                if (m57Var2 == null) {
                    js3.V("onDismissClickListener");
                    throw null;
                }
                m57 m57Var3 = (m57) this.o;
                if (m57Var3 != null) {
                    return new ir.mservices.market.social.requests.recycler.a(view, m57Var, m57Var2, m57Var3);
                }
                js3.V("onApproveClickListener");
                throw null;
        }
    }
}
