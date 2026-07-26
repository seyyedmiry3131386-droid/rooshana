package ir.mservices.market.pika.receive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a79;
import defpackage.am2;
import defpackage.bd;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c24;
import defpackage.cl1;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.dw4;
import defpackage.fa1;
import defpackage.fw4;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.kw6;
import defpackage.lk2;
import defpackage.lw;
import defpackage.mw6;
import defpackage.n15;
import defpackage.o79;
import defpackage.og5;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q79;
import defpackage.qb4;
import defpackage.qg5;
import defpackage.qs6;
import defpackage.rb4;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s40;
import defpackage.s7;
import defpackage.sj8;
import defpackage.sn8;
import defpackage.x79;
import defpackage.xf5;
import defpackage.y45;
import defpackage.y76;
import defpackage.y97;
import defpackage.yq2;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.pika.PikaEventBuilder;
import ir.mservices.market.pika.common.model.ByteArrayResult;
import ir.mservices.market.pika.common.model.ConnectionState;
import ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment;
import ir.mservices.market.pika.receive.recycler.ReceivedAppData;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AvatarImageView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class ReceiveAppRecyclerListFragment extends Hilt_ReceiveAppRecyclerListFragment {
    public static final /* synthetic */ int p1 = 0;
    public fw4 i1;
    public xf5 j1;
    public lk2 k1;
    public sn8 l1;
    public final bi5 m1 = new bi5(g27.a(mw6.class), new n15(29, this));
    public final o79 n1;
    public final ReceiveAppRecyclerListFragment$installBroadCast$1 o1;

    /* JADX WARN: Type inference failed for: r0v4, types: [ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$installBroadCast$1] */
    public ReceiveAppRecyclerListFragment() {
        final ReceiveAppRecyclerListFragment$special$$inlined$viewModels$default$1 receiveAppRecyclerListFragment$special$$inlined$viewModels$default$1 = new ReceiveAppRecyclerListFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) receiveAppRecyclerListFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.n1 = new o79(g27.a(ReceiveViewModel.class), new bp2() { // from class: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$special$$inlined$viewModels$default$4
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
        this.o1 = new BroadcastReceiver() { // from class: ir.mservices.market.pika.receive.ReceiveAppRecyclerListFragment$installBroadCast$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                Bundle extras;
                Intent intent2;
                lk2 lk2Var;
                js3.p(context, "context");
                js3.p(intent, "intent");
                if (!js3.i(intent.getAction(), "PACKAGE_INSTALLER_CONFIRM_INTENT") || (extras = intent.getExtras()) == null || (intent2 = (Intent) dt2.p(extras, "android.intent.extra.INTENT", Intent.class)) == null) {
                    return;
                }
                String stringExtra = intent2.getStringExtra("android.content.pm.extra.PACKAGE_NAME");
                int intExtra = intent2.getIntExtra("android.content.pm.extra.SESSION_ID", -1);
                int intExtra2 = intent2.getIntExtra("android.content.pm.extra.STATUS", -999);
                Object obj = null;
                ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.a;
                if (intExtra2 == -1) {
                    try {
                        int i = ReceiveAppRecyclerListFragment.p1;
                        receiveAppRecyclerListFragment.R1().y = intExtra;
                        Bundle extras2 = intent2.getExtras();
                        Intent intent3 = extras2 != null ? (Intent) dt2.p(extras2, "android.intent.extra.INTENT", Intent.class) : null;
                        if (dp3.c(receiveAppRecyclerListFragment.F())) {
                            receiveAppRecyclerListFragment.R1().t(stringExtra, intExtra, intExtra2);
                        } else {
                            receiveAppRecyclerListFragment.R1().t(stringExtra, intExtra, 3);
                        }
                        if (intent3 == null || (lk2Var = receiveAppRecyclerListFragment.k1) == null) {
                            return;
                        }
                        lk2Var.a(intent3);
                        return;
                    } catch (Exception e) {
                        lw.g(e, "ReceiveAppRecyclerListFragment installBroadCast failed!", null);
                        return;
                    }
                }
                if (intExtra2 == 0 || intExtra2 == 3) {
                    int i2 = ReceiveAppRecyclerListFragment.p1;
                    receiveAppRecyclerListFragment.R1().t(stringExtra, intExtra, intExtra2);
                    return;
                }
                int i3 = ReceiveAppRecyclerListFragment.p1;
                if (stringExtra == null || stringExtra.length() <= 0) {
                    return;
                }
                Iterable iterable = (Iterable) receiveAppRecyclerListFragment.R1().t.getReceivedByteArray().getValue();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : iterable) {
                    if (obj2 instanceof ByteArrayResult.AppInfo) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (js3.i(((ByteArrayResult.AppInfo) next).getPackageName(), stringExtra)) {
                        obj = next;
                        break;
                    }
                }
                ByteArrayResult.AppInfo appInfo = (ByteArrayResult.AppInfo) obj;
                if (appInfo != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("BUNDLE_KEY_PACKAGE_KEY", stringExtra);
                    bundle.putInt("SESSION_ID", intExtra);
                    bundle.putInt("BUNDLE_KEY_INSTALLATION_STATUS", intExtra2);
                    DialogDataModel dialogDataModel = new DialogDataModel(receiveAppRecyclerListFragment.Q1(), "DIALOG_KEY_INSTALL_RESULT_RETRY", bundle, 8);
                    String name = appInfo.getName();
                    Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(appInfo.getImg(), 0, appInfo.getImg().length);
                    js3.o(bitmapDecodeByteArray, "decodeByteArray(...)");
                    pk5.g(receiveAppRecyclerListFragment.J0, new NavIntentDirections.InstallFailed(new y76(dialogDataModel, name, bitmapDecodeByteArray)), -1);
                }
            }
        };
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
            Bundle bundle2 = dialogDataModel.c;
            if ("DIALOG_KEY_DISCONNECTED".equalsIgnoreCase(str2)) {
                boolean z = bundle2.getBoolean("IS_BACK_SCENARIO", false);
                if (dialogDataModel.d == DialogResult.a) {
                    if (!z) {
                        R1().t.disconnect();
                        return;
                    }
                    R1().t.disconnect();
                    ReceiveViewModel receiveViewModelR1 = R1();
                    receiveViewModelR1.t.clearReceivedFiles();
                    receiveViewModelR1.u.b();
                    receiveViewModelR1.w.a.cancel(10);
                    this.J0.r(Integer.valueOf(rr6.pikaHome));
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_CANCEL_RECEIVE".equalsIgnoreCase(str2)) {
                long j = bundle2.getLong("PAYLOAD_ID", -1L);
                if (dialogDataModel.d == DialogResult.a) {
                    PikaEventBuilder pikaEventBuilder = new PikaEventBuilder();
                    pikaEventBuilder.c.putString("on", "stop");
                    pikaEventBuilder.a();
                    R1().t.cancelPayloadSend(j);
                    return;
                }
                return;
            }
            if ("DIALOG_KEY_INSTALL_RESULT_RETRY".equalsIgnoreCase(str2) && bundle.getBoolean("BUNDLE_KEY_CANCEL_TEXT")) {
                R1().t(bundle2.getString("packageName", null), bundle2.getInt("SESSION_ID", -1), bundle2.getInt("BUNDLE_KEY_INSTALLATION_STATUS", -1));
                return;
            }
            if ("DIALOG_KEY_MIUI_TIP".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                xf5 xf5Var = this.j1;
                if (xf5Var == null) {
                    js3.V("myketUIUtils");
                    throw null;
                }
                FragmentActivity fragmentActivityF = F();
                am2 am2Var = this.J0;
                String string = K().getString(rs6.install_tip);
                js3.o(string, "getString(...)");
                xf5Var.k(fragmentActivityF, am2Var, "https://myket.ir/support/pages/xiaomi-bundle-apps-issue/", string, false, false, false, false, true, false);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String string = K().getString(rs6.page_name_receive_app);
        js3.o(string, "getString(...)");
        return string;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(rr6.empty_icon);
        lottieAnimationView.setRepeatCount(-1);
        lottieAnimationView.setRepeatMode(1);
        ir.mservices.market.core.ext.a.e(lottieAnimationView, qs6.pika_waiting);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        textView.setText(textView.getResources().getString(rs6.wait_for_sender));
        TextView textView2 = (TextView) view.findViewById(rr6.empty_message);
        textView2.setText(textView2.getResources().getString(rs6.receive_app_desc));
        textView2.setVisibility(0);
    }

    public final String Q1() {
        return dw1.n("ReceiveAppRecyclerListFragment_", this.H0);
    }

    public final ReceiveViewModel R1() {
        return (ReceiveViewModel) this.n1.getValue();
    }

    public final void S1(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("IS_BACK_SCENARIO", z);
        String strL = L(rs6.disconnect_alert_dialog);
        js3.o(strL, "getString(...)");
        pk5.g(this.J0, new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(Q1(), "DIALOG_KEY_DISCONNECTED", bundle, 8), null, strL, L(rs6.disconnect), L(rs6.button_cancel), true)), -1);
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

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("PACKAGE_INSTALLER_CONFIRM_INTENT");
        Context contextH = H();
        if (contextH != null) {
            rb4 rb4VarW = rb4.w(contextH);
            ReceiveAppRecyclerListFragment$installBroadCast$1 receiveAppRecyclerListFragment$installBroadCast$1 = this.o1;
            synchronized (((HashMap) rb4VarW.c)) {
                try {
                    qb4 qb4Var = new qb4(intentFilter, receiveAppRecyclerListFragment$installBroadCast$1);
                    ArrayList arrayList = (ArrayList) ((HashMap) rb4VarW.c).get(receiveAppRecyclerListFragment$installBroadCast$1);
                    if (arrayList == null) {
                        arrayList = new ArrayList(1);
                        ((HashMap) rb4VarW.c).put(receiveAppRecyclerListFragment$installBroadCast$1, arrayList);
                    }
                    arrayList.add(qb4Var);
                    for (int i = 0; i < intentFilter.countActions(); i++) {
                        String action = intentFilter.getAction(i);
                        ArrayList arrayList2 = (ArrayList) ((HashMap) rb4VarW.d).get(action);
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList(1);
                            ((HashMap) rb4VarW.d).put(action, arrayList2);
                        }
                        arrayList2.add(qb4Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void a0() {
        super.a0();
        Context contextH = H();
        if (contextH != null) {
            rb4 rb4VarW = rb4.w(contextH);
            ReceiveAppRecyclerListFragment$installBroadCast$1 receiveAppRecyclerListFragment$installBroadCast$1 = this.o1;
            synchronized (((HashMap) rb4VarW.c)) {
                try {
                    ArrayList arrayList = (ArrayList) ((HashMap) rb4VarW.c).remove(receiveAppRecyclerListFragment$installBroadCast$1);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            qb4 qb4Var = (qb4) arrayList.get(size);
                            qb4Var.d = true;
                            for (int i = 0; i < qb4Var.a.countActions(); i++) {
                                String action = qb4Var.a.getAction(i);
                                ArrayList arrayList2 = (ArrayList) ((HashMap) rb4VarW.d).get(action);
                                if (arrayList2 != null) {
                                    for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
                                        qb4 qb4Var2 = (qb4) arrayList2.get(size2);
                                        if (qb4Var2.b == receiveAppRecyclerListFragment$installBroadCast$1) {
                                            qb4Var2.d = true;
                                            arrayList2.remove(size2);
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        ((HashMap) rb4VarW.d).remove(action);
                                    }
                                }
                            }
                        }
                    }
                } finally {
                }
            }
        }
        this.l1 = null;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(Q1());
        lk2 lk2Var = this.k1;
        if (lk2Var != null) {
            lk2Var.b();
        }
        this.k1 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        if (js3.i(R1().t.getConnectionState().getValue(), ConnectionState.Disconnect.INSTANCE)) {
            ReceiveViewModel receiveViewModelR1 = R1();
            receiveViewModelR1.t.clearReceivedFiles();
            receiveViewModelR1.u.b();
            receiveViewModelR1.w.a.cancel(10);
            this.J0.r(Integer.valueOf(rr6.pikaHome));
        } else {
            S1(true);
        }
        return s40.g;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        cl1 cl1Var = new cl1(1, 4);
        cl1Var.m = new og5() { // from class: ir.mservices.market.pika.receive.a
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                ReceivedAppData receivedAppData = (ReceivedAppData) obj;
                int i = ReceiveAppRecyclerListFragment.p1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.pika.receive.recycler.a) qg5Var, "<unused var>");
                js3.p(receivedAppData, "recyclerData");
                long j = receivedAppData.a;
                boolean z = receivedAppData.f;
                String str = receivedAppData.b;
                PikaEventBuilder pikaEventBuilder = new PikaEventBuilder();
                pikaEventBuilder.c.putString("on", "install");
                pikaEventBuilder.a();
                ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.a;
                if (receiveAppRecyclerListFragment.i1 == null) {
                    js3.V("miuiUtils");
                    throw null;
                }
                if (!fw4.e() || !fw4.c() || !fw4.d()) {
                    if (z) {
                        receiveAppRecyclerListFragment.R1().u(j, str);
                        return;
                    } else {
                        receiveAppRecyclerListFragment.R1().s(j, str);
                        return;
                    }
                }
                if (z) {
                    pk5.g(receiveAppRecyclerListFragment.J0, new NavIntentDirections.MiuiTip(new dw4(new DialogDataModel(receiveAppRecyclerListFragment.Q1(), "DIALOG_KEY_MIUI_TIP", null, 12))), -1);
                    return;
                }
                ReceiveViewModel receiveViewModelR1 = receiveAppRecyclerListFragment.R1();
                long j2 = receivedAppData.a;
                js3.p(str, "packageName");
                String str2 = (String) receiveViewModelR1.u.c.get(Long.valueOf(j2));
                if (str2 != null) {
                    bt2.G(y97.G(receiveViewModelR1), null, null, new ReceiveViewModel$installAppWithIntent$1$1(receiveViewModelR1, j2, str, str2, null), 3);
                }
            }
        };
        cl1Var.n = new y45(21);
        cl1Var.o = new kw6(this);
        return cl1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        this.k1 = (lk2) n0(new kw6(this), new s7(2));
        this.J0.d(Q1(), this);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = sn8.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        final int i2 = 0;
        sn8 sn8Var = (sn8) a79.f0(layoutInflaterFrom, js6.toolbar_nearby_connection, null, false, null);
        ImageView imageView = sn8Var.w;
        imageView.getDrawable().setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: lw6
            public final /* synthetic */ ReceiveAppRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ws5 ws5VarC;
                int i3 = i2;
                ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.b;
                switch (i3) {
                    case 0:
                        int i4 = ReceiveAppRecyclerListFragment.p1;
                        FragmentActivity fragmentActivityF = receiveAppRecyclerListFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                            break;
                        }
                        break;
                    default:
                        int i5 = ReceiveAppRecyclerListFragment.p1;
                        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                        actionBarEventBuilder.b("pika_disconnect");
                        actionBarEventBuilder.a();
                        receiveAppRecyclerListFragment.S1(false);
                        break;
                }
            }
        });
        AvatarImageView avatarImageView = sn8Var.v;
        avatarImageView.setSize(K().getDimensionPixelSize(pq6.avatar_size_search_view));
        bi5 bi5Var = this.m1;
        AvatarImageView.setImage$default(avatarImageView, null, ((mw6) bi5Var.getValue()).a, null, null, 13, null);
        sn8Var.z.setText(((mw6) bi5Var.getValue()).a);
        final int i3 = 1;
        sn8Var.x.setOnClickListener(new View.OnClickListener(this) { // from class: lw6
            public final /* synthetic */ ReceiveAppRecyclerListFragment b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                ws5 ws5VarC;
                int i32 = i3;
                ReceiveAppRecyclerListFragment receiveAppRecyclerListFragment = this.b;
                switch (i32) {
                    case 0:
                        int i4 = ReceiveAppRecyclerListFragment.p1;
                        FragmentActivity fragmentActivityF = receiveAppRecyclerListFragment.F();
                        if (fragmentActivityF != null && (ws5VarC = fragmentActivityF.c()) != null) {
                            ws5VarC.b();
                            break;
                        }
                        break;
                    default:
                        int i5 = ReceiveAppRecyclerListFragment.p1;
                        ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                        actionBarEventBuilder.b("pika_disconnect");
                        actionBarEventBuilder.a();
                        receiveAppRecyclerListFragment.S1(false);
                        break;
                }
            }
        });
        this.l1 = sn8Var;
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ReceiveAppRecyclerListFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ReceiveAppRecyclerListFragment$onViewCreated$3(this, null));
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
