package ir.mservices.market.gateway;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.bp2;
import defpackage.c24;
import defpackage.co1;
import defpackage.d;
import defpackage.d04;
import defpackage.d46;
import defpackage.ea7;
import defpackage.f57;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.g46;
import defpackage.j71;
import defpackage.jq;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw;
import defpackage.m88;
import defpackage.m91;
import defpackage.mq2;
import defpackage.nq2;
import defpackage.o79;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rm7;
import defpackage.rq2;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.uv1;
import defpackage.x2;
import defpackage.x79;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.common.ui.recycler.layoutManager.MyketGridLayoutManager;
import ir.mservices.market.gateway.ui.GatewayItemAction;
import ir.mservices.market.gateway.ui.GatewayListViewModel;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.MyketTextView;
import java.io.Serializable;
import java.util.List;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public abstract class GatewayBottomDialogFragment extends Hilt_GatewayBottomDialogFragment {
    public d04 h1;
    public mq2 i1;
    public final o79 j1;
    public final c24 k1;

    public static final class GatewayData implements Serializable {
        public final String a;
        public final String b;
        public final List c;
        public final String d;
        public final String e;
        public final String f;
        public final String g;
        public final String h;
        public final String i;
        public final Integer j;

        public GatewayData(String str, String str2, List list, String str3, String str4, String str5, String str6, String str7, String str8, Integer num) {
            js3.p(str, "paymentPrice");
            js3.p(str8, "layoutMode");
            this.a = str;
            this.b = str2;
            this.c = list;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = str7;
            this.i = str8;
            this.j = num;
        }
    }

    public GatewayBottomDialogFragment() {
        final GatewayBottomDialogFragment$special$$inlined$viewModels$default$1 gatewayBottomDialogFragment$special$$inlined$viewModels$default$1 = new GatewayBottomDialogFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.gateway.GatewayBottomDialogFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) gatewayBottomDialogFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.j1 = new o79(g27.a(GatewayListViewModel.class), new bp2() { // from class: ir.mservices.market.gateway.GatewayBottomDialogFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.gateway.GatewayBottomDialogFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.gateway.GatewayBottomDialogFragment$special$$inlined$viewModels$default$4
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
        this.k1 = kotlin.a.a(new x2(27, this));
    }

    public abstract GatewayData V0();

    public final GatewayListViewModel W0() {
        return (GatewayListViewModel) this.j1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.Y0 = true;
        this.Z0 = false;
        this.a1 = false;
    }

    public abstract void X0();

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        mq2 mq2Var;
        js3.p(layoutInflater, "inflater");
        if (m88.T(V0().i, "v1", true)) {
            int i = d46.L;
            DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
            d46 d46Var = (d46) fa1.c(layoutInflater, js6.payment_dialog, viewGroup, false);
            js3.o(d46Var, "inflate(...)");
            mq2Var = new mq2(d46Var);
        } else {
            int i2 = g46.L;
            DataBinderMapperImpl dataBinderMapperImpl2 = fa1.a;
            g46 g46Var = (g46) fa1.c(layoutInflater, js6.payment_gateway_dialog, viewGroup, false);
            js3.o(g46Var, "inflate(...)");
            mq2Var = new mq2(g46Var);
        }
        this.i1 = mq2Var;
        mq2Var.f.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().M, PorterDuff.Mode.MULTIPLY));
        mq2 mq2Var2 = this.i1;
        js3.m(mq2Var2);
        return mq2Var2.a;
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.d
    public final void b0() {
        this.i1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.base.BaseNewBottomDialogFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        StateListDrawable stateListDrawableA;
        js3.p(view, "view");
        super.k0(view, bundle);
        List list = V0().c;
        mq2 mq2Var = this.i1;
        js3.m(mq2Var);
        MyketTextView myketTextView = mq2Var.n;
        myketTextView.setText(V0().e);
        String str = V0().e;
        int i = 0;
        myketTextView.setVisibility((str == null || f88.n0(str)) ? 8 : 0);
        mq2 mq2Var2 = this.i1;
        js3.m(mq2Var2);
        MyketTextView myketTextView2 = mq2Var2.p;
        Context context = myketTextView2.getContext();
        int i2 = rs6.inapp_payment_version;
        Integer num = V0().j;
        myketTextView2.setText(context.getString(i2, num != null ? String.valueOf(num.intValue()) : null));
        myketTextView2.setVisibility(8);
        boolean zT = m88.T(V0().i, "v1", true);
        String str2 = V0().g;
        if (str2 == null || f88.n0(str2)) {
            mq2 mq2Var3 = this.i1;
            js3.m(mq2Var3);
            mq2Var3.h.setVisibility(8);
            mq2 mq2Var4 = this.i1;
            js3.m(mq2Var4);
            View view2 = mq2Var4.m;
            if (view2 != null) {
                view2.setVisibility(zT ? 8 : 0);
            }
        } else {
            mq2 mq2Var5 = this.i1;
            js3.m(mq2Var5);
            View view3 = mq2Var5.m;
            if (view3 != null) {
                view3.setVisibility(0);
            }
            mq2 mq2Var6 = this.i1;
            js3.m(mq2Var6);
            ConstraintLayout constraintLayout = mq2Var6.h;
            constraintLayout.setVisibility(0);
            if (zT) {
                Context context2 = constraintLayout.getContext();
                js3.o(context2, "getContext(...)");
                ea7 ea7Var = new ea7(context2);
                ea7Var.h = 0;
                ea7Var.j = true;
                ea7Var.b = sj8.b().q;
                ea7Var.d = 0;
                ea7Var.b();
                ea7Var.e = 96;
                ea7Var.b();
                ea7Var.f = 0;
                ea7Var.b();
                ea7Var.g = 96;
                ea7Var.b();
                stateListDrawableA = ea7Var.a();
            } else {
                Context context3 = constraintLayout.getContext();
                js3.o(context3, "getContext(...)");
                ea7 ea7Var2 = new ea7(context3);
                ea7Var2.h = 0;
                ea7Var2.j = true;
                ea7Var2.b = sj8.b().q;
                ea7Var2.c(96);
                stateListDrawableA = ea7Var2.a();
            }
            constraintLayout.setBackground(stateListDrawableA);
            mq2 mq2Var7 = this.i1;
            js3.m(mq2Var7);
            ImageView imageView = mq2Var7.j;
            String str3 = V0().h;
            if (str3 != null && !f88.n0(str3)) {
                f57 f57VarW = ((f57) zk8.Q(this, V0().h).m()).W(uv1.b());
                mq2 mq2Var8 = this.i1;
                js3.m(mq2Var8);
                f57VarW.P(mq2Var8.j);
                i = 0;
            }
            imageView.setVisibility(i);
            mq2 mq2Var9 = this.i1;
            js3.m(mq2Var9);
            mq2Var9.k.setText(V0().g);
        }
        mq2 mq2Var10 = this.i1;
        js3.m(mq2Var10);
        mq2Var10.i.setText(V0().b);
        mq2 mq2Var11 = this.i1;
        js3.m(mq2Var11);
        AppIconView appIconView = mq2Var11.g;
        appIconView.setVisibility(0);
        appIconView.setErrorImageResId(yq6.icon);
        AppIconView.setImageUrl$default(appIconView, V0().d, null, false, 6, null);
        mq2 mq2Var12 = this.i1;
        js3.m(mq2Var12);
        mq2Var12.o.setPrice(V0().a, V0().f);
        lw.b("Gateways must not be empty", null, list.isEmpty());
        lw.b("Gateways size must not be greater than 3", rm7.n(list.size(), "size:"), list.size() > 3);
        W0().r(new GatewayItemAction.SetMaxSpan(m88.T(V0().i, "v2", true) ? 1 : (yq2.n0(H()) && N0().c() == 1 && N0().e() > 700.0f) ? 4 : 3));
        mq2 mq2Var13 = this.i1;
        js3.m(mq2Var13);
        RecyclerView recyclerView = mq2Var13.d;
        recyclerView.setLayoutDirection(3);
        int i3 = 2;
        recyclerView.setOverScrollMode(2);
        MyketGridLayoutManager myketGridLayoutManager = new MyketGridLayoutManager(((Number) W0().A.a.getValue()).intValue());
        myketGridLayoutManager.K = new nq2(recyclerView, i);
        int dimensionPixelSize = recyclerView.getResources().getDimensionPixelSize(pq6.space_16);
        int dimensionPixelSize2 = recyclerView.getResources().getDimensionPixelSize(pq6.space_16) / 4;
        int iIntValue = ((Number) W0().A.a.getValue()).intValue();
        d04 d04Var = this.h1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        recyclerView.i(new co1(0, dimensionPixelSize, 0, dimensionPixelSize2, iIntValue, d04Var.f()));
        recyclerView.setLayoutManager(myketGridLayoutManager);
        recyclerView.setNestedScrollingEnabled(false);
        c24 c24Var = this.k1;
        recyclerView.setAdapter((rq2) c24Var.getValue());
        m91.l((rq2) c24Var.getValue(), new d(recyclerView, this, 26));
        recyclerView.j(new jq(i3));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new GatewayBottomDialogFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new GatewayBottomDialogFragment$onViewCreated$6(this, null));
        X0();
        mq2 mq2Var14 = this.i1;
        js3.m(mq2Var14);
        mq2Var14.b.setOnClickListener(new a(this));
    }
}
