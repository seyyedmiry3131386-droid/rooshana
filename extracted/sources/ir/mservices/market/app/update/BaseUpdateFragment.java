package ir.mservices.market.app.update;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.ba7;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.bt5;
import defpackage.bz8;
import defpackage.c24;
import defpackage.d11;
import defpackage.d16;
import defpackage.dp3;
import defpackage.ds6;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.e71;
import defpackage.e80;
import defpackage.ea7;
import defpackage.em6;
import defpackage.f60;
import defpackage.fa1;
import defpackage.fp6;
import defpackage.fu0;
import defpackage.g27;
import defpackage.g51;
import defpackage.hp;
import defpackage.i04;
import defpackage.j71;
import defpackage.ja1;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.kh2;
import defpackage.lw;
import defpackage.o04;
import defpackage.o30;
import defpackage.o79;
import defpackage.og5;
import defpackage.p3;
import defpackage.pj;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.ps1;
import defpackage.q79;
import defpackage.qg5;
import defpackage.qp2;
import defpackage.qq4;
import defpackage.qs6;
import defpackage.r79;
import defpackage.rn8;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s30;
import defpackage.s90;
import defpackage.sg4;
import defpackage.sj8;
import defpackage.t32;
import defpackage.t61;
import defpackage.t90;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.uk;
import defpackage.up1;
import defpackage.vk;
import defpackage.wk;
import defpackage.wt;
import defpackage.x79;
import defpackage.xz8;
import defpackage.y97;
import defpackage.yq2;
import defpackage.zk8;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl;
import ir.mservices.market.app.update.recycler.AppUpdateData;
import ir.mservices.market.app.update.recycler.UpdateHeaderData;
import ir.mservices.market.appDetail.ToolbarData;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.SubmitReviewData;
import ir.mservices.market.core.Font$CustomTypefaceSpan;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.StartApplicationData;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.AppIconView;
import ir.mservices.market.views.BigFillOvalButton;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import ir.mservices.market.views.MyMarketView;
import ir.mservices.market.views.MyketTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class BaseUpdateFragment extends Hilt_BaseUpdateFragment {
    public static final /* synthetic */ int p1 = 0;
    public final o79 i1;
    public xz8 j1;
    public zk8 k1;
    public final l l1;
    public ps1 m1;
    public ir.mservices.market.version2.manager.a n1;
    public wt o1;

    /* JADX INFO: renamed from: ir.mservices.market.app.update.BaseUpdateFragment$onEvent$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.app.update.BaseUpdateFragment$onEvent$1", f = "UpdateFragment.kt", l = {696}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BaseUpdateFragment.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                this.a = 1;
                if (kotlinx.coroutines.a.e(100L, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            BaseUpdateFragment.this.N1(0);
            return tx8.a;
        }
    }

    public BaseUpdateFragment() {
        final BaseUpdateFragment$special$$inlined$viewModels$default$1 baseUpdateFragment$special$$inlined$viewModels$default$1 = new BaseUpdateFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.update.BaseUpdateFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) baseUpdateFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(UpdateViewModel.class), new bp2() { // from class: ir.mservices.market.app.update.BaseUpdateFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.update.BaseUpdateFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.app.update.BaseUpdateFragment$special$$inlined$viewModels$default$4
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
        this.k1 = wk.q;
        this.l1 = ja1.b(null);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        super.B(bundle, str);
        if (str.equalsIgnoreCase(S1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            Bundle bundle2 = dialogDataModel.c;
            String str2 = dialogDataModel.b;
            if (!"DIALOG_KEY_ALERT_INACTIVE".equalsIgnoreCase(str2)) {
                if ("DIALOG_KEY_UPDATE_ALL_CONFIRM".equalsIgnoreCase(str2) && dialogDataModel.d == DialogResult.a) {
                    Y1();
                    return;
                }
                return;
            }
            if (dialogDataModel.d == DialogResult.a) {
                String string = bundle2.getString("packageName", "");
                boolean z = bundle2.getBoolean("isActive");
                UpdateViewModel updateViewModelT1 = T1();
                js3.m(string);
                bt2.G(y97.G(updateViewModelT1), null, null, new UpdateViewModel$changeActivateType$1(updateViewModelT1, string, z, null), 3);
                updateViewModelT1.I.a.b(!z ? "update_active" : "update_deactive", "package_name", string);
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_updates);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void F1() {
        T1().m(true);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.all_updates_done);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        textView.setVisibility(0);
        textView.setText(rs6.no_item_in_update_list);
        TextView textView2 = (TextView) view.findViewById(rr6.empty_message);
        textView2.setVisibility(0);
        textView2.setText(rs6.all_app_update_message);
        BigFillOvalButton bigFillOvalButton = (BigFillOvalButton) view.findViewById(rr6.action_button);
        bigFillOvalButton.setVisibility(0);
        bigFillOvalButton.setText(bigFillOvalButton.getResources().getString(rs6.notification_alert_button));
        bigFillOvalButton.setOnClickListener(new t90(this, 1));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int O0() {
        return 4;
    }

    public abstract boolean Q1();

    public final void R1() {
        DialogDataModel dialogDataModel = new DialogDataModel(S1(), "DIALOG_KEY_UPDATE_ALL_CONFIRM", null, 12);
        String strL = L(rs6.update_all_confirm);
        js3.o(strL, "getString(...)");
        pk5.g(this.J0, new NavIntentDirections.Confirm(new d11(dialogDataModel, strL, L(rs6.dismiss), L(rs6.update_all_title), sj8.b().c, sj8.b().d, sj8.b())), -1);
    }

    public final String S1() {
        return t61.j(getClass().getSimpleName(), "_", this.H0);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        bt5 bt5VarF = F();
        rn8 rn8Var = bt5VarF instanceof rn8 ? (rn8) bt5VarF : null;
        if (rn8Var != null) {
            xz8 xz8Var = this.j1;
            rn8Var.z(xz8Var != null ? xz8Var.l : null);
        }
    }

    public final UpdateViewModel T1() {
        return (UpdateViewModel) this.i1.getValue();
    }

    public final void U1(AppUpdateData appUpdateData) {
        o30 o30Var = appUpdateData.c;
        String str = o30Var.n;
        ps1 ps1Var = this.m1;
        if (ps1Var == null) {
            js3.V("downloadManager");
            throw null;
        }
        int iL = ps1Var.l(str);
        if (iL == 110 || iL == 100 || iL == 140 || iL == 150) {
            ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
            clickEventBuilder.b(appUpdateData.m ? "update_review_open_progress" : "update_review_close_progress");
            clickEventBuilder.a();
        } else {
            dw1.y("update_review");
        }
        ApplicationDTO applicationDTO = new ApplicationDTO();
        applicationDTO.setVersion(appUpdateData.d);
        int i = o30Var.f;
        String str2 = o30Var.n;
        applicationDTO.setVersionCode(i);
        applicationDTO.setPackageName(str2);
        applicationDTO.setFileSize(o30Var.g);
        applicationDTO.setRealPrice(o30Var.e);
        applicationDTO.setIconPath(o30Var.i);
        applicationDTO.setTitle(o30Var.h);
        applicationDTO.setFree(o30Var.k);
        applicationDTO.setRefId("UpdateList");
        applicationDTO.setTotalRating(appUpdateData.n);
        float f = appUpdateData.n;
        String packageName = applicationDTO.getPackageName();
        String iconPath = applicationDTO.getIconPath();
        String title = applicationDTO.getTitle();
        String refId = applicationDTO.getRefId();
        js3.o(refId, "getRefId(...)");
        int versionCode = applicationDTO.getVersionCode();
        long fileSize = applicationDTO.getFileSize();
        boolean zIsIncompatible = applicationDTO.isIncompatible();
        String buttonText = applicationDTO.getButtonText();
        float totalRating = applicationDTO.getTotalRating();
        Boolean boolValueOf = Boolean.valueOf(applicationDTO.isFree());
        Boolean boolValueOf2 = Boolean.valueOf(applicationDTO.hasMainData());
        Boolean boolValueOf3 = Boolean.valueOf(applicationDTO.hasPatchData());
        applicationDTO.getCategoryName();
        CommentScenario.SubmitReview submitReview = new CommentScenario.SubmitReview(new SubmitReviewData(str2, f, null, false, true, new ToolbarData(packageName, iconPath, title, refId, versionCode, fileSize, zIsIncompatible, buttonText, totalRating, boolValueOf, boolValueOf2, boolValueOf3, applicationDTO.getForceUpdate(), applicationDTO.getInstallCallbackUrl(), applicationDTO.getCallbackUrl()), "_update", "UPDATE", 4, null));
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            pk5.c(fragmentActivityF, submitReview);
        }
    }

    public final void V1(View view) {
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().p;
        ea7Var.c(96);
        ea7Var.j = true;
        ea7Var.h = 0;
        ea7Var.k = sj8.b().p;
        ea7Var.m = 0;
        ea7Var.d(96);
        ea7Var.o = true;
        view.setBackground(ea7Var.a());
        view.setOnClickListener(new t90(this, 0));
        view.setVisibility(0);
    }

    public abstract boolean W1();

    public final void X1(StartApplicationData startApplicationData, String str, String str2, AppIconView appIconView, Tracker tracker) {
        pk5.f(this.J0, new NavIntentDirections.AppDetail(new hp(startApplicationData.getAppBarSampleData().getPackageName(), false, tracker, s1().b(appIconView.getDrawable()) != null, null, str, str2, null, startApplicationData, null, null, null, null)));
    }

    public final void Y1() {
        if (!dp3.c(H())) {
            t32.b().g(new e80(5001));
            return;
        }
        pk5.g(this.J0, new NavIntentDirections.Progress(new em6(new DialogDataModel(S1(), "DIALOG_KEY_NO_RESULT", null, 12), false)), -1);
        UpdateViewModel updateViewModelT1 = T1();
        updateViewModelT1.E0.clear();
        List listJ0 = kotlin.collections.a.J0(((AppUpdateRepositoryImpl) updateViewModelT1.y).a(false), updateViewModelT1.H0);
        fu0 fu0VarG = y97.G(updateViewModelT1);
        ug1 ug1Var = up1.a;
        updateViewModelT1.F0 = bt2.G(fu0VarG, sg4.a, null, new UpdateViewModel$updateAll$1(listJ0, updateViewModelT1, null), 2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Object value;
        Object value2;
        js3.p(layoutInflater, "inflater");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = xz8.D;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        xz8 xz8Var = (xz8) fa1.c(layoutInflaterFrom, js6.update_toolbar_view, viewGroup, false);
        int i2 = 2;
        if (W1()) {
            ImageView imageView = xz8Var.v;
            js3.m(imageView);
            imageView.setVisibility(0);
            imageView.setColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY);
            imageView.setOnClickListener(new t90(this, i2));
        }
        MyMarketView myMarketView = xz8Var.w;
        ImageView imageView2 = xz8Var.z;
        LottieAnimationView lottieAnimationView = xz8Var.y;
        RelativeLayout relativeLayout = xz8Var.A;
        MyketTextView myketTextView = xz8Var.C;
        myMarketView.setOnClickListener(new t90(this, 3));
        xz8Var.x.setOnClickListener(new t90(this, 4));
        SpannableString spannableString = new SpannableString(K().getString(rs6.menu_item_updates));
        spannableString.setSpan((Font$CustomTypefaceSpan) kh2.b.c.c, 0, spannableString.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(K().getDimensionPixelSize(pq6.font_size_large)), 0, spannableString.length(), 33);
        myketTextView.setText(spannableString);
        myketTextView.setPaddingRelative(W1() ? K().getDimensionPixelSize(pq6.space_8) : yq2.n0(H()) ? K().getDimensionPixelSize(pq6.space_12) : K().getDimensionPixelSize(pq6.space_16), 0, 0, 0);
        boolean z = T1().y0;
        l lVar = this.l1;
        if (z) {
            lottieAnimationView.setVisibility(4);
            MyketTextView myketTextView2 = xz8Var.B;
            js3.o(myketTextView2, "scheduleText");
            myketTextView2.setVisibility(8);
            do {
                value = lVar.getValue();
            } while (!lVar.n(value, Boolean.TRUE));
            js3.m(imageView2);
            V1(imageView2);
            imageView2.setColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY);
        } else {
            do {
                value2 = lVar.getValue();
            } while (!lVar.n(value2, Boolean.FALSE));
            js3.o(relativeLayout, "scheduleLayout");
            V1(relativeLayout);
            relativeLayout.getLayoutTransition().setDuration(1000L);
            imageView2.setVisibility(4);
            lottieAnimationView.setAnimation(sj8.g == ThemeMode.b ? qs6.schedule_dark : qs6.schedule_light);
            lottieAnimationView.h.b.addUpdateListener(new pj(xz8Var, this, i2));
            bt2.G(androidx.lifecycle.b.a(this), null, null, new BaseUpdateFragment$setToolbarView$1$6$2(this, lottieAnimationView, null), 3);
            T1().y0 = true;
        }
        this.j1 = xz8Var;
        return super.Z(layoutInflater, viewGroup, bundle);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        super.b0();
        this.J0.x(S1());
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ir.mservices.market.app.update.a] */
    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        bn6 bn6Var = new bn6(F());
        bz8 bz8Var = new bz8(v1(), p3.g(F()), this.F0.f());
        bz8Var.q = new qq4(this, bn6Var);
        bz8Var.n = new r79(8, bn6Var);
        bz8Var.o = new s90(this, 6);
        bz8Var.p = new s90(this, 7);
        bz8Var.r = new s90(this, 8);
        bz8Var.v = new s90(this, 9);
        bz8Var.s = new s90(this, 1);
        bz8Var.w = new og5() { // from class: ir.mservices.market.app.update.a
            @Override // defpackage.og5
            public final void m(View view, qg5 qg5Var, Object obj) {
                int i = BaseUpdateFragment.p1;
                js3.p(view, "<unused var>");
                js3.p((ir.mservices.market.app.update.recycler.b) qg5Var, "<unused var>");
                js3.p((UpdateHeaderData) obj, "<unused var>");
                BaseUpdateFragment baseUpdateFragment = this.a;
                if (!((Boolean) baseUpdateFragment.T1().S.a.getValue()).booleanValue()) {
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b("update_all");
                    clickEventBuilder.a();
                    baseUpdateFragment.R1();
                    return;
                }
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("update_all_pause");
                clickEventBuilder2.a();
                UpdateViewModel updateViewModelT1 = baseUpdateFragment.T1();
                ps1 ps1Var = updateViewModelT1.C;
                bt2.G(y97.G(updateViewModelT1), null, null, new UpdateViewModel$pauseAllDownloading$1(updateViewModelT1, null), 3);
                ArrayList arrayListA = ((AppUpdateRepositoryImpl) updateViewModelT1.y).a(false);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListA) {
                    if (((s30) obj2).b) {
                        arrayList.add(obj2);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    s30 s30Var = (s30) it.next();
                    o30 o30Var = s30Var.a;
                    String str = o30Var.n;
                    Integer numValueOf = Integer.valueOf(o30Var.f);
                    ps1Var.getClass();
                    lw.c(str, null);
                    AppDownloadInfo appDownloadInfoI = ps1Var.i(str, numValueOf);
                    if ((appDownloadInfoI != null ? appDownloadInfoI.getStatus() : 190) == 110) {
                        ps1Var.s(s30Var.a.n);
                    }
                }
                ArrayList<s30> arrayList2 = new ArrayList();
                for (Object obj3 : arrayListA) {
                    if (((s30) obj3).b) {
                        arrayList2.add(obj3);
                    }
                }
                for (s30 s30Var2 : arrayList2) {
                    o30 o30Var2 = s30Var2.a;
                    String str2 = o30Var2.n;
                    Integer numValueOf2 = Integer.valueOf(o30Var2.f);
                    ps1Var.getClass();
                    lw.c(str2, null);
                    AppDownloadInfo appDownloadInfoI2 = ps1Var.i(str2, numValueOf2);
                    if ((appDownloadInfoI2 == null ? 190 : appDownloadInfoI2.getStatus()) == 100) {
                        ps1Var.s(s30Var2.a.n);
                    }
                }
            }
        };
        bz8Var.t = new s90(this, 2);
        bz8Var.u = new s90(this, 3);
        bz8Var.y = new s90(this, 4);
        bz8Var.z = new s90(this, 5);
        bz8Var.x = new bn6(F());
        return bz8Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        y1().setOnCreateContextMenuListener(this);
        this.J0.d(S1(), this);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseUpdateFragment$onViewCreated$1(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseUpdateFragment$onViewCreated$2(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new BaseUpdateFragment$onViewCreated$3(this, null));
        bt2.G(androidx.lifecycle.b.a(N()), null, null, new BaseUpdateFragment$onViewCreated$4(this, null), 3);
        ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1 = B1();
        if (extendedSwipeRefreshLayoutB1 != null) {
            extendedSwipeRefreshLayoutB1.setOnRefreshListener(new s90(this, 0));
        }
        if (Q1()) {
            Bundle bundle2 = this.g;
            if (bundle2 != null) {
                bundle2.putBoolean("BUNDLE_KEY_UPDATE_ALL", false);
            }
            R1();
        }
        bt2.G(androidx.lifecycle.b.a(N()), null, null, new BaseUpdateFragment$onViewCreated$6(this, null), 3);
        bt2.G(androidx.lifecycle.b.a(N()), null, null, new BaseUpdateFragment$onViewCreated$7(this, null), 3);
        bt2.G(androidx.lifecycle.b.a(N()), null, null, new BaseUpdateFragment$onViewCreated$8(this, null), 3);
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return T1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int n1() {
        if (this instanceof ba7) {
            return K().getDimensionPixelSize(pq6.bottom_navigation_height);
        }
        return 0;
    }

    public final void onEvent(f60 f60Var) {
        js3.p(f60Var, "event");
        if (f60Var.a == 5001 && dp3.c(H())) {
            Y1();
        }
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final View p1(ViewGroup viewGroup) {
        View view = fa1.c(LayoutInflater.from(F()), js6.empty_view_button, viewGroup, false).l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int q1() {
        return fp6.layout_animation_fall_down_fast;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(((Boolean) T1().B0.a.getValue()).booleanValue() ? 0 : K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.horizontal_space_outer), 0, 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.update_max_span);
    }

    public final void onEvent(i04 i04Var) {
        LottieAnimationView lottieAnimationView;
        LottieAnimationView lottieAnimationView2;
        uk ukVar = uk.q;
        vk vkVar = vk.q;
        js3.p(i04Var, "event");
        int i = i04Var.a;
        if (Math.abs(i) == K().getDimensionPixelSize(pq6.actionbar_size) + i04Var.b && (js3.i(this.k1, wk.q) || js3.i(this.k1, vkVar))) {
            xz8 xz8Var = this.j1;
            if (xz8Var != null && (lottieAnimationView2 = xz8Var.y) != null) {
                lottieAnimationView2.l = false;
                lottieAnimationView2.h.l();
            }
            this.k1 = ukVar;
        }
        if (i < 0 || !js3.i(this.k1, ukVar)) {
            return;
        }
        xz8 xz8Var2 = this.j1;
        if (xz8Var2 != null && (lottieAnimationView = xz8Var2.y) != null) {
            lottieAnimationView.g();
        }
        this.k1 = vkVar;
    }

    public final void onEvent(o04 o04Var) {
        js3.p(o04Var, "event");
        if (o04Var.a == 3) {
            bt2.G(androidx.lifecycle.b.a(N()), null, null, new AnonymousClass1(null), 3);
        }
    }
}
