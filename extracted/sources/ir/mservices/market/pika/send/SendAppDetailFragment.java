package ir.mservices.market.pika.send;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.Lifecycle$State;
import defpackage.a79;
import defpackage.b77;
import defpackage.bd;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.cc7;
import defpackage.d04;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dv2;
import defpackage.dw1;
import defpackage.fa1;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.mm2;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q79;
import defpackage.rm2;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sj8;
import defpackage.sn7;
import defpackage.sn8;
import defpackage.tn7;
import defpackage.x79;
import defpackage.y97;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.PikaEventBuilder;
import ir.mservices.market.pika.common.model.ConnectionState;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class SendAppDetailFragment extends Hilt_SendAppDetailFragment implements mm2 {
    public static final /* synthetic */ int e1 = 0;
    public rm2 V0;
    public sn8 W0;
    public final o79 X0;
    public final bi5 Y0;
    public long Z0;
    public dp3 a1;
    public d04 b1;
    public lw8 c1;
    public dv2 d1;

    public SendAppDetailFragment() {
        final SendAppDetailFragment$special$$inlined$viewModels$default$1 sendAppDetailFragment$special$$inlined$viewModels$default$1 = new SendAppDetailFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.pika.send.SendAppDetailFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) sendAppDetailFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(SendAppViewModel.class), new bp2() { // from class: ir.mservices.market.pika.send.SendAppDetailFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.pika.send.SendAppDetailFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.pika.send.SendAppDetailFragment$special$$inlined$viewModels$default$4
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
        this.Y0 = new bi5(g27.a(tn7.class), new yw6(15, this));
    }

    public static final void k1(SendAppDetailFragment sendAppDetailFragment, String str, boolean z, boolean z2) {
        Drawable drawable;
        rm2 rm2Var = sendAppDetailFragment.V0;
        if (rm2Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = rm2Var.x;
        Resources resources = myketTextView.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_alert;
        try {
            drawable = q39.a(resources, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        Drawable drawableMutate = drawable.mutate();
        dv2 dv2Var = sendAppDetailFragment.d1;
        if (dv2Var == null) {
            js3.V("graphicUtils");
            throw null;
        }
        int iA = (int) dv2Var.a(12.0f);
        dv2 dv2Var2 = sendAppDetailFragment.d1;
        if (dv2Var2 == null) {
            js3.V("graphicUtils");
            throw null;
        }
        drawableMutate.setBounds(0, 0, iA, (int) dv2Var2.a(12.0f));
        if (z) {
            myketTextView.setTextColor(sj8.b().A);
            d04 d04Var = sendAppDetailFragment.b1;
            if (d04Var == null) {
                js3.V("languageHelper");
                throw null;
            }
            if (d04Var.f()) {
                myketTextView.setCompoundDrawables(null, null, drawableMutate, null);
            } else {
                myketTextView.setCompoundDrawables(drawableMutate, null, null, null);
            }
        } else if (z2) {
            ThemeData themeDataB = sj8.b();
            myketTextView.setTextColor(z2 ? themeDataB.x : themeDataB.m);
            myketTextView.setCompoundDrawables(null, null, null, null);
        } else {
            myketTextView.setTextColor(sj8.b().m);
            myketTextView.setCompoundDrawables(null, null, null, null);
        }
        myketTextView.setText(str);
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(l1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            String str2 = dialogDataModel.b;
            if ("DIALOG_KEY_SERVICE_DISCONNECTED".equalsIgnoreCase(str2)) {
                m1().s();
                this.J0.r(Integer.valueOf(rr6.receiveApp));
                return;
            }
            if ("DIALOG_KEY_DISCONNECTED".equalsIgnoreCase(str2)) {
                if (dialogDataModel.d == DialogResult.a) {
                    m1().s();
                    SendAppViewModel sendAppViewModelM1 = m1();
                    NearbyRepository nearbyRepository = sendAppViewModelM1.u;
                    nearbyRepository.disconnect();
                    nearbyRepository.clearReceivedFiles();
                    sendAppViewModelM1.x.b();
                    sendAppViewModelM1.y.a.cancel(10);
                    this.J0.r(Integer.valueOf(rr6.pikaHome));
                    return;
                }
                return;
            }
            if (!"DIALOG_KEY_CANCEL_SEND".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_DISCONNECT".equalsIgnoreCase(str2)) {
                    m1().s();
                    this.J0.r(Integer.valueOf(rr6.pikaHome));
                    return;
                }
                return;
            }
            long j = dialogDataModel.c.getLong("PAYLOAD_ID", -1L);
            if (dialogDataModel.d == DialogResult.a) {
                PikaEventBuilder pikaEventBuilder = new PikaEventBuilder();
                pikaEventBuilder.c.putString("on", "stop");
                pikaEventBuilder.a();
                m1().u.cancelPayloadSend(j);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_send_app);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        rn8 rn8Var = (rn8) F();
        if (rn8Var != null) {
            sn8 sn8Var = this.W0;
            js3.m(sn8Var);
            rn8Var.z(sn8Var.l);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        a79 a79VarC = fa1.c(layoutInflater, js6.fragment_send_app_detail, viewGroup, false);
        js3.o(a79VarC, "inflate(...)");
        rm2 rm2Var = (rm2) a79VarC;
        this.V0 = rm2Var;
        ConstraintLayout constraintLayout = rm2Var.z;
        d04 d04Var = this.b1;
        if (d04Var == null) {
            js3.V("languageHelper");
            throw null;
        }
        constraintLayout.setLayoutDirection(d04Var.c());
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = sn8.B;
        sn8 sn8Var = (sn8) a79.f0(layoutInflaterFrom, js6.toolbar_nearby_connection, null, false, null);
        this.W0 = sn8Var;
        js3.m(sn8Var);
        ImageView imageView = sn8Var.w;
        imageView.getDrawable().setColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY);
        imageView.setBackground(y97.x());
        imageView.setOnClickListener(new sn7(this, 3));
        sn8 sn8Var2 = this.W0;
        js3.m(sn8Var2);
        AvatarImageView avatarImageView = sn8Var2.v;
        avatarImageView.setSize(avatarImageView.getResources().getDimensionPixelSize(pq6.avatar_size_search_view));
        bi5 bi5Var = this.Y0;
        AvatarImageView.setImage$default(avatarImageView, null, ((tn7) bi5Var.getValue()).b, null, null, 13, null);
        sn8 sn8Var3 = this.W0;
        js3.m(sn8Var3);
        sn8Var3.z.setText(((tn7) bi5Var.getValue()).b);
        sn8 sn8Var4 = this.W0;
        js3.m(sn8Var4);
        sn8Var4.x.setOnClickListener(new sn7(this, 4));
        rm2 rm2Var2 = this.V0;
        if (rm2Var2 == null) {
            js3.V("binding");
            throw null;
        }
        rm2Var2.y.setDataAndCollect(m1().G);
        rm2 rm2Var3 = this.V0;
        if (rm2Var3 == null) {
            js3.V("binding");
            throw null;
        }
        View view = rm2Var3.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(l1());
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        rm2 rm2Var = this.V0;
        if (rm2Var == null) {
            js3.V("binding");
            throw null;
        }
        if (rm2Var.A.isEnabled()) {
            m1().s();
            this.J0.r(Integer.valueOf(rr6.installedApps));
        } else if (js3.i(m1().u.getConnectionState().getValue(), ConnectionState.Disconnect.INSTANCE)) {
            m1().s();
            SendAppViewModel sendAppViewModelM1 = m1();
            sendAppViewModelM1.u.clearReceivedFiles();
            sendAppViewModelM1.x.b();
            sendAppViewModelM1.y.a.cancel(10);
            this.J0.r(Integer.valueOf(rr6.pikaHome));
        } else {
            o1();
        }
        return s40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(l1(), this);
        rm2 rm2Var = this.V0;
        if (rm2Var == null) {
            js3.V("binding");
            throw null;
        }
        rm2Var.A.setEnabled(false);
        String str = ((tn7) this.Y0.getValue()).a;
        rm2 rm2Var2 = this.V0;
        if (rm2Var2 == null) {
            js3.V("binding");
            throw null;
        }
        AppIconView appIconView = rm2Var2.v;
        dp3 dp3Var = this.a1;
        if (dp3Var == null) {
            js3.V("installManager");
            throw null;
        }
        appIconView.setImageDrawable(dp3Var.i(str));
        rm2 rm2Var3 = this.V0;
        if (rm2Var3 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = rm2Var3.w;
        dp3 dp3Var2 = this.a1;
        if (dp3Var2 == null) {
            js3.V("installManager");
            throw null;
        }
        myketTextView.setText(dp3Var2.u(str));
        rm2 rm2Var4 = this.V0;
        if (rm2Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = rm2Var4.x;
        n1();
        dp3 dp3Var3 = this.a1;
        if (dp3Var3 == null) {
            js3.V("installManager");
            throw null;
        }
        myketTextView2.setText(lw8.h(dp3Var3.t(str)));
        rm2 rm2Var5 = this.V0;
        if (rm2Var5 == null) {
            js3.V("binding");
            throw null;
        }
        rm2Var5.A.setOnClickListener(new sn7(this, 0));
        rm2 rm2Var6 = this.V0;
        if (rm2Var6 == null) {
            js3.V("binding");
            throw null;
        }
        rm2Var6.x.setText(K().getString(rs6.app_in_progress));
        sn8 sn8Var = this.W0;
        js3.m(sn8Var);
        ImageView imageView = sn8Var.w;
        imageView.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        imageView.setBackground(y97.x());
        imageView.setOnClickListener(new sn7(this, 1));
        rm2 rm2Var7 = this.V0;
        if (rm2Var7 == null) {
            js3.V("binding");
            throw null;
        }
        rm2Var7.y.setOnClickListener(new sn7(this, 2));
        rm2 rm2Var8 = this.V0;
        if (rm2Var8 == null) {
            js3.V("binding");
            throw null;
        }
        cc7.d(rm2Var8.z, 0, 0, 0, 7);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SendAppDetailFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SendAppDetailFragment$onViewCreated$2(this, null));
    }

    public final String l1() {
        return dw1.n("SendAppDetailFragment_", this.H0);
    }

    public final SendAppViewModel m1() {
        return (SendAppViewModel) this.X0.getValue();
    }

    public final lw8 n1() {
        lw8 lw8Var = this.c1;
        if (lw8Var != null) {
            return lw8Var;
        }
        js3.V("uiUtils");
        throw null;
    }

    public final void o1() {
        String strL = L(rs6.disconnect_alert_dialog);
        js3.o(strL, "getString(...)");
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(l1(), "DIALOG_KEY_DISCONNECTED", null, 12), null, strL, L(rs6.disconnect), L(rs6.button_cancel), true)), -1);
    }
}
