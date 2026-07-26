package ir.mservices.market.common.comment;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$State;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a67;
import defpackage.aa8;
import defpackage.b77;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.br9;
import defpackage.c24;
import defpackage.dd;
import defpackage.dt2;
import defpackage.dw1;
import defpackage.f88;
import defpackage.fa1;
import defpackage.fw0;
import defpackage.g27;
import defpackage.gw0;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx1;
import defpackage.jx2;
import defpackage.lw8;
import defpackage.mm2;
import defpackage.o79;
import defpackage.pk5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q40;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rs6;
import defpackage.s40;
import defpackage.sj8;
import defpackage.u03;
import defpackage.ue7;
import defpackage.x79;
import defpackage.xs0;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.yw6;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class SubmitCommentFragment extends Hilt_SubmitCommentFragment implements mm2 {
    public static final /* synthetic */ int e1 = 0;
    public fw0 V0;
    public lw8 W0;
    public final o79 X0;
    public final o79 Y0;
    public final bi5 Z0;
    public String a1;
    public gw0 b1;
    public Float c1;
    public u03 d1;

    public SubmitCommentFragment() {
        final SubmitCommentFragment$special$$inlined$viewModels$default$1 submitCommentFragment$special$$inlined$viewModels$default$1 = new SubmitCommentFragment$special$$inlined$viewModels$default$1(this);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.c;
        final c24 c24VarB = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) submitCommentFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.X0 = new o79(g27.a(CommentViewModel.class), new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$4
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
        final SubmitCommentFragment$special$$inlined$viewModels$default$6 submitCommentFragment$special$$inlined$viewModels$default$6 = new SubmitCommentFragment$special$$inlined$viewModels$default$6(this);
        final c24 c24VarB2 = kotlin.a.b(lazyThreadSafetyMode, new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$7
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) submitCommentFragment$special$$inlined$viewModels$default$6.invoke();
            }
        });
        this.Y0 = new o79(g27.a(SubmitCommentViewModel.class), new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB2.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                q79 q79VarH;
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return (jx2Var == null || (q79VarH = jx2Var.h()) == null) ? this.g.h() : q79VarH;
            }
        }, new bp2() { // from class: ir.mservices.market.common.comment.SubmitCommentFragment$special$$inlined$viewModels$default$9
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                x79 x79Var = (x79) c24VarB2.getValue();
                jx2 jx2Var = x79Var instanceof jx2 ? (jx2) x79Var : null;
                return jx2Var != null ? jx2Var.i() : j71.b;
            }
        });
        this.Z0 = new bi5(g27.a(aa8.class), new yw6(19, this));
    }

    @Override // defpackage.mm2
    public final void B(Bundle bundle, String str) {
        js3.p(str, "requestKey");
        js3.p(bundle, "result");
        if (str.equalsIgnoreCase(l1())) {
            Object objP = dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            js3.n(objP, "null cannot be cast to non-null type ir.mservices.market.version2.fragments.dialog.DialogDataModel");
            DialogDataModel dialogDataModel = (DialogDataModel) objP;
            if ("DIALOG_KEY_EXIT_NOTICE".equalsIgnoreCase(dialogDataModel.b)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult == DialogResult.a) {
                    dw1.y("review_back_exit");
                    ((CommentViewModel) this.X0.getValue()).g(k1().a);
                } else if (dialogResult == DialogResult.b) {
                    boolean z = bundle.getBoolean("BUNDLE_KEY_CANCEL_TEXT");
                    ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                    clickEventBuilder.b(z ? "review_back_continue" : "review_back_cancel");
                    clickEventBuilder.a();
                }
            }
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_comment);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String I0() {
        return k1().a;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        int i = gw0.J;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        gw0 gw0Var = (gw0) fa1.c(layoutInflater, js6.comment, viewGroup, false);
        this.b1 = gw0Var;
        js3.m(gw0Var);
        View view = gw0Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        this.J0.x(l1());
        gw0 gw0Var = this.b1;
        js3.m(gw0Var);
        gw0Var.H.removeCallbacks(this.d1);
        this.d1 = null;
        this.b1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        gw0 gw0Var = this.b1;
        js3.m(gw0Var);
        Editable text = gw0Var.w.getText();
        if (text == null || text.length() == 0) {
            int i = (int) k1().b;
            gw0 gw0Var2 = this.b1;
            js3.m(gw0Var2);
            if (i == ((int) gw0Var2.G.getRating()) && !k1().c) {
                ((CommentViewModel) this.X0.getValue()).g(k1().a);
                return q40.g;
            }
        }
        pk5.g(this.J0, new NavIntentDirections.AlertButtonComponent(new dd(new DialogDataModel(l1(), "DIALOG_KEY_EXIT_NOTICE", null, 12), null, -1, null, L(rs6.exit_notice_submitting_comment), L(rs6.exit_submit_comment_button), L(rs6.continue_submit_comment_button), sj8.b().c, sj8.b().d, sj8.b(), 0)), -1);
        return s40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        Drawable drawable;
        js3.p(view, "view");
        super.k0(view, bundle);
        this.J0.d(l1(), this);
        gw0 gw0Var = this.b1;
        js3.m(gw0Var);
        int i = 4;
        int i2 = 0;
        for (Object obj : br9.C(gw0Var.z, gw0Var.A, gw0Var.B, gw0Var.C, gw0Var.D, gw0Var.E)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                br9.P();
                throw null;
            }
            LottieAnimationView lottieAnimationView = (LottieAnimationView) obj;
            lottieAnimationView.setAnimation(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? qs6.star_zero : qs6.star_five : qs6.star_four : qs6.star_three : qs6.star_two : qs6.star_one);
            lottieAnimationView.setRepeatCount(-1);
            i2 = i3;
        }
        gw0 gw0Var2 = this.b1;
        js3.m(gw0Var2);
        MyketRatingBar myketRatingBar = gw0Var2.G;
        myketRatingBar.setStarStyle(sj8.b().c, MyketRatingBar.e, false, myketRatingBar.getResources().getDimensionPixelSize(pq6.space_4));
        this.d1 = new u03(29, this);
        gw0 gw0Var3 = this.b1;
        js3.m(gw0Var3);
        MyketRatingBar myketRatingBar2 = gw0Var3.G;
        js3.o(myketRatingBar2, "ratingbar");
        myketRatingBar2.setVisibility(k1().d ? 0 : 8);
        gw0 gw0Var4 = this.b1;
        js3.m(gw0Var4);
        MyketTextView myketTextView = gw0Var4.F;
        js3.o(myketTextView, "rateDescription");
        myketTextView.setVisibility(k1().d ? 8 : 0);
        gw0 gw0Var5 = this.b1;
        js3.m(gw0Var5);
        MyketEditText myketEditText = gw0Var5.w;
        Resources resources = myketEditText.getResources();
        js3.o(resources, "getResources(...)");
        int i4 = yq6.shape_edittext_tag;
        try {
            drawable = q39.a(resources, i4, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resources.getDrawable(i4, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resources.getDrawable(i4, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        myketEditText.setBackground(drawable);
        myketEditText.setTextColor(sj8.b().m);
        myketEditText.setHintTextColor(sj8.b().n);
        gw0 gw0Var6 = this.b1;
        js3.m(gw0Var6);
        gw0Var6.x.setTextColor(sj8.b().A);
        gw0 gw0Var7 = this.b1;
        js3.m(gw0Var7);
        MyketEditText myketEditText2 = gw0Var7.w;
        String str = k1().g;
        myketEditText2.setText(str != null ? f88.J0(str).toString() : null);
        gw0 gw0Var8 = this.b1;
        js3.m(gw0Var8);
        gw0Var8.w.setOnFocusChangeListener(new xs0(i, this));
        gw0 gw0Var9 = this.b1;
        js3.m(gw0Var9);
        gw0Var9.w.setOnTouchListener(new jx1(7, this));
        gw0 gw0Var10 = this.b1;
        js3.m(gw0Var10);
        gw0Var10.G.setUpdateRatingListener(new a67(18, this));
        gw0 gw0Var11 = this.b1;
        js3.m(gw0Var11);
        gw0Var11.v.setOnClickListener(new ue7(4, this));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SubmitCommentFragment$onViewCreated$8(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new SubmitCommentFragment$onViewCreated$9(this, null));
    }

    public final aa8 k1() {
        return (aa8) this.Z0.getValue();
    }

    public final String l1() {
        return dw1.n("SubmitCommentFragment_", this.H0);
    }
}
