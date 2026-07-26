package ir.mservices.market.pika.send;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import defpackage.a79;
import defpackage.bd;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cl1;
import defpackage.de;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.gp;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.nm5;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sj8;
import defpackage.sn8;
import defpackage.wp3;
import defpackage.x79;
import defpackage.y97;
import defpackage.yq2;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.common.model.ConnectionState;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment;
import ir.mservices.market.pika.send.recycler.InstalledAppData;
import ir.mservices.market.pika.send.recycler.SearchAppData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AvatarImageView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class InstalledAppsRecyclerListFragment extends Hilt_InstalledAppsRecyclerListFragment {
    public static final /* synthetic */ int n1 = 0;
    public lw8 i1;
    public dp3 j1;
    public final bi5 k1 = new bi5(g27.a(wp3.class), new de(22, this));
    public sn8 l1;
    public final o79 m1;

    public InstalledAppsRecyclerListFragment() {
        final InstalledAppsRecyclerListFragment$special$$inlined$viewModels$default$1 installedAppsRecyclerListFragment$special$$inlined$viewModels$default$1 = new InstalledAppsRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) installedAppsRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.m1 = new o79(g27.a(InstalledAppsViewModel.class), new bp2() { // from class: ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.pika.send.InstalledAppsRecyclerListFragment$special$$inlined$viewModels$default$4
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
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_DISCONNECT".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    NearbyRepository nearbyRepository = R1().t;
                    nearbyRepository.disconnect();
                    nearbyRepository.clearReceivedFiles();
                    this.J0.r(Integer.valueOf(rr6.pikaHome));
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_DISCONNECTED".equalsIgnoreCase(str2)) {
                NearbyRepository nearbyRepository2 = R1().t;
                nearbyRepository2.disconnect();
                nearbyRepository2.clearReceivedFiles();
                this.J0.r(Integer.valueOf(rr6.pikaHome));
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_installed_app);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void F1() {
        R1().e();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean G1() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    public final String Q1() {
        return dw1.n("InstalledAppsRecyclerListFragment_", this.H0);
    }

    public final InstalledAppsViewModel R1() {
        return (InstalledAppsViewModel) this.m1.getValue();
    }

    public final void S1() {
        String strL = L(rs6.disconnect_alert_dialog);
        js3.o(strL, "getString(...)");
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(Q1(), "DIALOG_KEY_DISCONNECT", null, 12), null, strL, L(rs6.disconnect), L(rs6.button_cancel), true)), -1);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        rn8 rn8Var = (rn8) F();
        if (rn8Var != null) {
            sn8 sn8Var = this.l1;
            js3.m(sn8Var);
            rn8Var.z(sn8Var.l);
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = sn8.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i2 = 0;
        sn8 sn8Var = (sn8) a79.f0(layoutInflaterFrom, js6.toolbar_nearby_connection, null, false, null);
        this.l1 = sn8Var;
        js3.m(sn8Var);
        ImageView imageView = sn8Var.w;
        imageView.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(y97.x());
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: vp3
            public final /* synthetic */ InstalledAppsRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ws5 ws5VarC;
                int i3 = i2;
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = this.b;
                switch (i3) {
                    case 0:
                        int i4 = InstalledAppsRecyclerListFragment.n1;
                        FragmentActivity fragmentActivityF = installedAppsRecyclerListFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                            break;
                        }
                        break;
                    default:
                        int i5 = InstalledAppsRecyclerListFragment.n1;
                        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                        actionBarEventBuilder.b("pika_disconnect");
                        actionBarEventBuilder.a();
                        installedAppsRecyclerListFragment.S1();
                        break;
                }
            }
        });
        sn8 sn8Var2 = this.l1;
        js3.m(sn8Var2);
        AvatarImageView avatarImageView = sn8Var2.v;
        avatarImageView.setSize(avatarImageView.getResources().getDimensionPixelSize(pq6.avatar_size_search_view));
        bi5 bi5Var = this.k1;
        AvatarImageView.setImage$default(avatarImageView, null, ((wp3) bi5Var.getValue()).a, null, null, 13, null);
        sn8 sn8Var3 = this.l1;
        js3.m(sn8Var3);
        sn8Var3.z.setText(((wp3) bi5Var.getValue()).a);
        if (js3.i(R1().t.getConnectionState().getValue(), ConnectionState.Disconnect.INSTANCE)) {
            sn8 sn8Var4 = this.l1;
            js3.m(sn8Var4);
            sn8Var4.A.setText(K().getString(rs6.disconnected_from));
        } else {
            sn8 sn8Var5 = this.l1;
            js3.m(sn8Var5);
            sn8Var5.x.setText(K().getString(rs6.disconnect));
            sn8 sn8Var6 = this.l1;
            js3.m(sn8Var6);
            sn8Var6.A.setText(K().getString(rs6.connected_to));
        }
        sn8 sn8Var7 = this.l1;
        js3.m(sn8Var7);
        final int i3 = 1;
        sn8Var7.x.setOnClickListener(new View.OnClickListener(this) { // from class: vp3
            public final /* synthetic */ InstalledAppsRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ws5 ws5VarC;
                int i32 = i3;
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = this.b;
                switch (i32) {
                    case 0:
                        int i4 = InstalledAppsRecyclerListFragment.n1;
                        FragmentActivity fragmentActivityF = installedAppsRecyclerListFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                            break;
                        }
                        break;
                    default:
                        int i5 = InstalledAppsRecyclerListFragment.n1;
                        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                        actionBarEventBuilder.b("pika_disconnect");
                        actionBarEventBuilder.a();
                        installedAppsRecyclerListFragment.S1();
                        break;
                }
            }
        });
        return super.Z(layoutInflater, viewGroup, bundle);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void a0() {
        super.a0();
        this.l1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(Q1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        if (js3.i(R1().t.getConnectionState().getValue(), ConnectionState.Disconnect.INSTANCE)) {
            NearbyRepository nearbyRepository = R1().t;
            nearbyRepository.disconnect();
            nearbyRepository.clearReceivedFiles();
            this.J0.r(Integer.valueOf(rr6.pikaHome));
        } else {
            S1();
        }
        return s40.g;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        cl1 cl1Var = new cl1(1, 3);
        final int i = 0;
        cl1Var.m = new og5(this) { // from class: up3
            public final /* synthetic */ InstalledAppsRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i2 = i;
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = this.b;
                switch (i2) {
                    case 0:
                        InstalledAppData installedAppData = (InstalledAppData) obj;
                        int i3 = InstalledAppsRecyclerListFragment.n1;
                        js3.p(view, "<unused var>");
                        js3.p((tp3) qg5Var, "<unused var>");
                        js3.p(installedAppData, "recyclerData");
                        String str = installedAppData.a;
                        installedAppsRecyclerListFragment.R1().r(null);
                        dp3 dp3Var = installedAppsRecyclerListFragment.j1;
                        if (dp3Var == null) {
                            js3.V("installManager");
                            throw null;
                        }
                        if (!dp3Var.G(str)) {
                            hh2.H(new hh2(installedAppsRecyclerListFragment.F(), installedAppsRecyclerListFragment.L(rs6.pika_send_uninstalled_app)));
                            return;
                        } else {
                            pk5.g(installedAppsRecyclerListFragment.J0, new NavIntentDirections.SendAppDetail(new tn7(str, ((wp3) installedAppsRecyclerListFragment.k1.getValue()).a)), -1);
                            return;
                        }
                    default:
                        oh7 oh7Var = (oh7) qg5Var;
                        int i4 = InstalledAppsRecyclerListFragment.n1;
                        js3.p(view, "<unused var>");
                        js3.p(oh7Var, "viewHolder");
                        js3.p((SearchAppData) obj, "<unused var>");
                        installedAppsRecyclerListFragment.R1().r(null);
                        oh7Var.x().x.setText("");
                        return;
                }
            }
        };
        final int i2 = 1;
        cl1Var.n = new og5(this) { // from class: up3
            public final /* synthetic */ InstalledAppsRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i22 = i2;
                InstalledAppsRecyclerListFragment installedAppsRecyclerListFragment = this.b;
                switch (i22) {
                    case 0:
                        InstalledAppData installedAppData = (InstalledAppData) obj;
                        int i3 = InstalledAppsRecyclerListFragment.n1;
                        js3.p(view, "<unused var>");
                        js3.p((tp3) qg5Var, "<unused var>");
                        js3.p(installedAppData, "recyclerData");
                        String str = installedAppData.a;
                        installedAppsRecyclerListFragment.R1().r(null);
                        dp3 dp3Var = installedAppsRecyclerListFragment.j1;
                        if (dp3Var == null) {
                            js3.V("installManager");
                            throw null;
                        }
                        if (!dp3Var.G(str)) {
                            hh2.H(new hh2(installedAppsRecyclerListFragment.F(), installedAppsRecyclerListFragment.L(rs6.pika_send_uninstalled_app)));
                            return;
                        } else {
                            pk5.g(installedAppsRecyclerListFragment.J0, new NavIntentDirections.SendAppDetail(new tn7(str, ((wp3) installedAppsRecyclerListFragment.k1.getValue()).a)), -1);
                            return;
                        }
                    default:
                        oh7 oh7Var = (oh7) qg5Var;
                        int i4 = InstalledAppsRecyclerListFragment.n1;
                        js3.p(view, "<unused var>");
                        js3.p(oh7Var, "viewHolder");
                        js3.p((SearchAppData) obj, "<unused var>");
                        installedAppsRecyclerListFragment.R1().r(null);
                        oh7Var.x().x.setText("");
                        return;
                }
            }
        };
        cl1Var.o = new nm5(23, this);
        return cl1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(Q1(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new InstalledAppsRecyclerListFragment$onViewCreated$1(this, null));
        y1().j(new gp(7, this));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return R1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
