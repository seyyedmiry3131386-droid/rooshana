package ir.mservices.market.myAccount.inbox;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.bd;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.cl1;
import defpackage.co6;
import defpackage.d16;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lu7;
import defpackage.m88;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.t32;
import defpackage.tl3;
import defpackage.ul3;
import defpackage.x79;
import defpackage.y97;
import ir.mservices.market.activity.BaseFragmentContentActivity;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.core.notification.PushMessage;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myAccount.inbox.InboxRecyclerListFragment;
import ir.mservices.market.myAccount.inbox.recycler.InboxData;
import ir.mservices.market.myAccount.inbox.recycler.InboxHeaderData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.model.InboxInfoModel;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.mservices.market.viewModel.c;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxRecyclerListFragment extends Hilt_InboxRecyclerListFragment {
    public static final /* synthetic */ int l1 = 0;
    public final o79 i1;
    public ul3 j1;
    public co6 k1;

    public InboxRecyclerListFragment() {
        final InboxRecyclerListFragment$special$$inlined$viewModels$default$1 inboxRecyclerListFragment$special$$inlined$viewModels$default$1 = new InboxRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.myAccount.inbox.InboxRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) inboxRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(InboxViewModel.class), new bp2() { // from class: ir.mservices.market.myAccount.inbox.InboxRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.inbox.InboxRecyclerListFragment$special$$inlined$viewModels$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.myAccount.inbox.InboxRecyclerListFragment$special$$inlined$viewModels$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(Q1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            boolean zEqualsIgnoreCase = "DIALOG_KEY_ALERT_REMOVE".equalsIgnoreCase(str2);
            o79 o79Var = this.i1;
            if (zEqualsIgnoreCase && dialogDataModel.d == DialogResult.a) {
                InboxData inboxData = (InboxData) dt2.s(bundle2, "BUNDLE_KEY_DATA", InboxData.class);
                if (inboxData != null) {
                    InboxViewModel inboxViewModel = (InboxViewModel) o79Var.getValue();
                    bt2.G(y97.G(inboxViewModel), null, null, new InboxViewModel$removeItem$1(inboxViewModel, inboxData, null), 3);
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_ALERT_REMOVE_ALL".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                InboxViewModel inboxViewModel2 = (InboxViewModel) o79Var.getValue();
                bt2.G(y97.G(inboxViewModel2), null, null, new InboxViewModel$removeAll$1(inboxViewModel2, null), 3);
            } else if ("DIALOG_KEY_LINE_MENU".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a && m88.T(bundle.getString("BUNDLE_KEY_ID"), "REMOVE_MESSAGE", true)) {
                InboxData inboxData2 = (InboxData) dt2.s(bundle2, "BUNDLE_KEY_DATA", InboxData.class);
                Bundle bundle3 = new Bundle();
                bundle3.putSerializable("BUNDLE_KEY_DATA", inboxData2);
                pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(Q1(), "DIALOG_KEY_ALERT_REMOVE", bundle3, 8), null, L(rs6.inbox_remove_message), L(rs6.inbox_remove_title), L(rs6.return_change), true)), -1);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_inbox);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_notification);
        TextView textView = (TextView) view.findViewById(rr6.empty_message);
        if (textView != null) {
            textView.setVisibility(0);
            textView.setText(rs6.inbox_no_message_txt);
        }
        TextView textView2 = (TextView) view.findViewById(rr6.empty_title);
        if (textView2 != null) {
            textView2.setVisibility(0);
            textView2.setText(rs6.inbox_no_message);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String Q0(BaseFragmentContentActivity baseFragmentContentActivity) {
        String string = baseFragmentContentActivity.getString(rs6.menu_item_inbox);
        js3.o(string, "getString(...)");
        return string;
    }

    public final String Q1() {
        return dw1.n("InboxRecyclerListFragment_", this.H0);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(Q1());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        cl1 cl1Var = new cl1(v1(), 2);
        final int i = 0;
        cl1Var.n = new og5(this) { // from class: vl3
            public final /* synthetic */ InboxRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String strC;
                Uri.Builder builderBuildUpon;
                Uri.Builder builderAppendQueryParameter;
                Uri uriBuild;
                int i2 = i;
                int i3 = 0;
                InboxRecyclerListFragment inboxRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        InboxData inboxData = (InboxData) obj;
                        int i4 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((am3) qg5Var, "<unused var>");
                        js3.p(inboxData, "recyclerData");
                        InboxInfoModel inboxInfoModel = inboxData.a;
                        PushMessage pushMessageA = PushMessage.A(inboxInfoModel);
                        Uri uri = Uri.parse(inboxInfoModel.c());
                        if (uri.getQueryParameterNames().contains("currentTab")) {
                            uri = null;
                        }
                        if (uri == null || (builderBuildUpon = uri.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("currentTab", "true")) == null || (uriBuild = builderAppendQueryParameter.build()) == null || (strC = uriBuild.toString()) == null) {
                            strC = inboxInfoModel.c();
                        }
                        pushMessageA.B(strC);
                        if ("app_update".equalsIgnoreCase(pushMessageA.t()) || "app_install".equalsIgnoreCase(pushMessageA.t())) {
                            if (inboxRecyclerListFragment.k1 == null) {
                                js3.V("pushMessageListener");
                                throw null;
                            }
                            Context contextH = inboxRecyclerListFragment.H();
                            Intent intent = new Intent(contextH, (Class<?>) LaunchContentActivity.class);
                            intent.setAction("ir.mservices.market.ACTION_APPLICATION");
                            String str = "push-notif-app-update-" + pushMessageA.p();
                            String strP = pushMessageA.p();
                            Tracker tracker = new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, str, "notif");
                            js3.p(strP, "packageName");
                            js3.p(str, "refId");
                            intent.putExtra("BUNDLE_KEY_EXTERNAL_APPLICATION", new hp(strP, true, tracker, false, null, str, null, null, null, null, null, null, null).a());
                            intent.addFlags(268435456);
                            contextH.startActivity(intent);
                        } else {
                            if (inboxRecyclerListFragment.k1 == null) {
                                js3.V("pushMessageListener");
                                throw null;
                            }
                            co6.c(inboxRecyclerListFragment.H(), pushMessageA);
                        }
                        ul3 ul3Var = inboxRecyclerListFragment.j1;
                        if (ul3Var == null) {
                            js3.V("inboxManager");
                            throw null;
                        }
                        if (inboxInfoModel.t()) {
                            return;
                        }
                        inboxInfoModel.w();
                        ul3Var.c.z(inboxInfoModel, new pl3(ul3Var, inboxInfoModel, i3), new ql3(), ul3Var);
                        return;
                    case 1:
                        InboxData inboxData2 = (InboxData) obj;
                        int i5 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((am3) qg5Var, "<unused var>");
                        js3.p(inboxData2, "recyclerData");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("REMOVE_MESSAGE", inboxRecyclerListFragment.K().getString(rs6.inbox_remove_title), sj8.b().A));
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("BUNDLE_KEY_DATA", inboxData2);
                        pk5.g(inboxRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(inboxRecyclerListFragment.Q1(), "DIALOG_KEY_LINE_MENU", bundle, 8), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    default:
                        InboxHeaderData inboxHeaderData = (InboxHeaderData) obj;
                        int i6 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ml3) qg5Var, "<unused var>");
                        js3.p(inboxHeaderData, "recyclerData");
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("BUNDLE_KEY_DATA", inboxHeaderData);
                        pk5.g(inboxRecyclerListFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(inboxRecyclerListFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_ALL", bundle2, 8), null, inboxRecyclerListFragment.L(rs6.inbox_remove_all_messages_message), inboxRecyclerListFragment.L(rs6.remove_all_message), inboxRecyclerListFragment.L(rs6.return_change), true)), -1);
                        return;
                }
            }
        };
        final int i2 = 1;
        cl1Var.m = new og5(this) { // from class: vl3
            public final /* synthetic */ InboxRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String strC;
                Uri.Builder builderBuildUpon;
                Uri.Builder builderAppendQueryParameter;
                Uri uriBuild;
                int i22 = i2;
                int i3 = 0;
                InboxRecyclerListFragment inboxRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        InboxData inboxData = (InboxData) obj;
                        int i4 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((am3) qg5Var, "<unused var>");
                        js3.p(inboxData, "recyclerData");
                        InboxInfoModel inboxInfoModel = inboxData.a;
                        PushMessage pushMessageA = PushMessage.A(inboxInfoModel);
                        Uri uri = Uri.parse(inboxInfoModel.c());
                        if (uri.getQueryParameterNames().contains("currentTab")) {
                            uri = null;
                        }
                        if (uri == null || (builderBuildUpon = uri.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("currentTab", "true")) == null || (uriBuild = builderAppendQueryParameter.build()) == null || (strC = uriBuild.toString()) == null) {
                            strC = inboxInfoModel.c();
                        }
                        pushMessageA.B(strC);
                        if ("app_update".equalsIgnoreCase(pushMessageA.t()) || "app_install".equalsIgnoreCase(pushMessageA.t())) {
                            if (inboxRecyclerListFragment.k1 == null) {
                                js3.V("pushMessageListener");
                                throw null;
                            }
                            Context contextH = inboxRecyclerListFragment.H();
                            Intent intent = new Intent(contextH, (Class<?>) LaunchContentActivity.class);
                            intent.setAction("ir.mservices.market.ACTION_APPLICATION");
                            String str = "push-notif-app-update-" + pushMessageA.p();
                            String strP = pushMessageA.p();
                            Tracker tracker = new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, str, "notif");
                            js3.p(strP, "packageName");
                            js3.p(str, "refId");
                            intent.putExtra("BUNDLE_KEY_EXTERNAL_APPLICATION", new hp(strP, true, tracker, false, null, str, null, null, null, null, null, null, null).a());
                            intent.addFlags(268435456);
                            contextH.startActivity(intent);
                        } else {
                            if (inboxRecyclerListFragment.k1 == null) {
                                js3.V("pushMessageListener");
                                throw null;
                            }
                            co6.c(inboxRecyclerListFragment.H(), pushMessageA);
                        }
                        ul3 ul3Var = inboxRecyclerListFragment.j1;
                        if (ul3Var == null) {
                            js3.V("inboxManager");
                            throw null;
                        }
                        if (inboxInfoModel.t()) {
                            return;
                        }
                        inboxInfoModel.w();
                        ul3Var.c.z(inboxInfoModel, new pl3(ul3Var, inboxInfoModel, i3), new ql3(), ul3Var);
                        return;
                    case 1:
                        InboxData inboxData2 = (InboxData) obj;
                        int i5 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((am3) qg5Var, "<unused var>");
                        js3.p(inboxData2, "recyclerData");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("REMOVE_MESSAGE", inboxRecyclerListFragment.K().getString(rs6.inbox_remove_title), sj8.b().A));
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("BUNDLE_KEY_DATA", inboxData2);
                        pk5.g(inboxRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(inboxRecyclerListFragment.Q1(), "DIALOG_KEY_LINE_MENU", bundle, 8), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    default:
                        InboxHeaderData inboxHeaderData = (InboxHeaderData) obj;
                        int i6 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ml3) qg5Var, "<unused var>");
                        js3.p(inboxHeaderData, "recyclerData");
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("BUNDLE_KEY_DATA", inboxHeaderData);
                        pk5.g(inboxRecyclerListFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(inboxRecyclerListFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_ALL", bundle2, 8), null, inboxRecyclerListFragment.L(rs6.inbox_remove_all_messages_message), inboxRecyclerListFragment.L(rs6.remove_all_message), inboxRecyclerListFragment.L(rs6.return_change), true)), -1);
                        return;
                }
            }
        };
        final int i3 = 2;
        cl1Var.o = new og5(this) { // from class: vl3
            public final /* synthetic */ InboxRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                String strC;
                Uri.Builder builderBuildUpon;
                Uri.Builder builderAppendQueryParameter;
                Uri uriBuild;
                int i22 = i3;
                int i32 = 0;
                InboxRecyclerListFragment inboxRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        InboxData inboxData = (InboxData) obj;
                        int i4 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((am3) qg5Var, "<unused var>");
                        js3.p(inboxData, "recyclerData");
                        InboxInfoModel inboxInfoModel = inboxData.a;
                        PushMessage pushMessageA = PushMessage.A(inboxInfoModel);
                        Uri uri = Uri.parse(inboxInfoModel.c());
                        if (uri.getQueryParameterNames().contains("currentTab")) {
                            uri = null;
                        }
                        if (uri == null || (builderBuildUpon = uri.buildUpon()) == null || (builderAppendQueryParameter = builderBuildUpon.appendQueryParameter("currentTab", "true")) == null || (uriBuild = builderAppendQueryParameter.build()) == null || (strC = uriBuild.toString()) == null) {
                            strC = inboxInfoModel.c();
                        }
                        pushMessageA.B(strC);
                        if ("app_update".equalsIgnoreCase(pushMessageA.t()) || "app_install".equalsIgnoreCase(pushMessageA.t())) {
                            if (inboxRecyclerListFragment.k1 == null) {
                                js3.V("pushMessageListener");
                                throw null;
                            }
                            Context contextH = inboxRecyclerListFragment.H();
                            Intent intent = new Intent(contextH, (Class<?>) LaunchContentActivity.class);
                            intent.setAction("ir.mservices.market.ACTION_APPLICATION");
                            String str = "push-notif-app-update-" + pushMessageA.p();
                            String strP = pushMessageA.p();
                            Tracker tracker = new Tracker(LinkDTO.LINK_TYPE_INTERNAL_LINK, str, "notif");
                            js3.p(strP, "packageName");
                            js3.p(str, "refId");
                            intent.putExtra("BUNDLE_KEY_EXTERNAL_APPLICATION", new hp(strP, true, tracker, false, null, str, null, null, null, null, null, null, null).a());
                            intent.addFlags(268435456);
                            contextH.startActivity(intent);
                        } else {
                            if (inboxRecyclerListFragment.k1 == null) {
                                js3.V("pushMessageListener");
                                throw null;
                            }
                            co6.c(inboxRecyclerListFragment.H(), pushMessageA);
                        }
                        ul3 ul3Var = inboxRecyclerListFragment.j1;
                        if (ul3Var == null) {
                            js3.V("inboxManager");
                            throw null;
                        }
                        if (inboxInfoModel.t()) {
                            return;
                        }
                        inboxInfoModel.w();
                        ul3Var.c.z(inboxInfoModel, new pl3(ul3Var, inboxInfoModel, i32), new ql3(), ul3Var);
                        return;
                    case 1:
                        InboxData inboxData2 = (InboxData) obj;
                        int i5 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((am3) qg5Var, "<unused var>");
                        js3.p(inboxData2, "recyclerData");
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(new LineMenuItemData("REMOVE_MESSAGE", inboxRecyclerListFragment.K().getString(rs6.inbox_remove_title), sj8.b().A));
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("BUNDLE_KEY_DATA", inboxData2);
                        pk5.g(inboxRecyclerListFragment.J0, new NavIntentDirections.LineMenu(new c74(new DialogDataModel(inboxRecyclerListFragment.Q1(), "DIALOG_KEY_LINE_MENU", bundle, 8), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null)), -1);
                        return;
                    default:
                        InboxHeaderData inboxHeaderData = (InboxHeaderData) obj;
                        int i6 = InboxRecyclerListFragment.l1;
                        js3.p(view, "<unused var>");
                        js3.p((ml3) qg5Var, "<unused var>");
                        js3.p(inboxHeaderData, "recyclerData");
                        Bundle bundle2 = new Bundle();
                        bundle2.putSerializable("BUNDLE_KEY_DATA", inboxHeaderData);
                        pk5.g(inboxRecyclerListFragment.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(inboxRecyclerListFragment.Q1(), "DIALOG_KEY_ALERT_REMOVE_ALL", bundle2, 8), null, inboxRecyclerListFragment.L(rs6.inbox_remove_all_messages_message), inboxRecyclerListFragment.L(rs6.remove_all_message), inboxRecyclerListFragment.L(rs6.return_change), true)), -1);
                        return;
                }
            }
        };
        return cl1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ul3 ul3Var = this.j1;
        if (ul3Var == null) {
            js3.V("inboxManager");
            throw null;
        }
        ul3Var.d.j(lu7.P, false);
        t32.b().g(new tl3());
        this.J0.d(Q1(), this);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return (InboxViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(0, K().getDimensionPixelSize(pq6.space_12), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_8), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.inbox_max_span);
    }
}
