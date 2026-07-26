package ir.mservices.market.app.bookmark.ui;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.TextView;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.b77;
import defpackage.bn6;
import defpackage.bp2;
import defpackage.br9;
import defpackage.c24;
import defpackage.d16;
import defpackage.ds6;
import defpackage.f88;
import defpackage.g27;
import defpackage.j71;
import defpackage.js3;
import defpackage.jx2;
import defpackage.lm;
import defpackage.o79;
import defpackage.pq6;
import defpackage.pt2;
import defpackage.q39;
import defpackage.q79;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.u95;
import defpackage.v4;
import defpackage.x2;
import defpackage.x79;
import defpackage.yq6;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.ExtendedSwipeRefreshLayout;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class AppBookmarkRecyclerListFragment extends Hilt_AppBookmarkRecyclerListFragment {
    public static final /* synthetic */ int j1 = 0;
    public final o79 i1;

    public AppBookmarkRecyclerListFragment() {
        final x2 x2Var = new x2(4, this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$special$$inlined$viewModels$default$1
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) x2Var.invoke();
            }
        });
        this.i1 = new o79(g27.a(AppBookmarkViewModel.class), new bp2() { // from class: ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$special$$inlined$viewModels$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$special$$inlined$viewModels$default$4
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
        }, new bp2() { // from class: ir.mservices.market.app.bookmark.ui.AppBookmarkRecyclerListFragment$special$$inlined$viewModels$default$3
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

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_app_bookmark);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean D0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return true;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final void K1(View view) {
        Drawable drawable;
        super.K1(view);
        View viewFindViewById = view.findViewById(rr6.empty_icon);
        js3.o(viewFindViewById, "findViewById(...)");
        ir.mservices.market.core.ext.a.e((LottieAnimationView) viewFindViewById, qs6.no_bookmark);
        TextView textView = (TextView) view.findViewById(rr6.empty_title);
        textView.setVisibility(0);
        textView.setText(rs6.any_bookmark_txt);
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        int i = yq6.ic_other_error;
        try {
            drawable = q39.a(resourcesK, i, null);
            if (drawable == null) {
                ThreadLocal threadLocal = b77.a;
                drawable = resourcesK.getDrawable(i, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
        } catch (Exception unused) {
            ThreadLocal threadLocal2 = b77.a;
            drawable = resourcesK.getDrawable(i, null);
            if (drawable == null) {
                throw new Resources.NotFoundException();
            }
        }
        drawable.setColorFilter(new PorterDuffColorFilter(sj8.b().n, PorterDuff.Mode.MULTIPLY));
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.icon_info_span_size);
        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        String string = K().getString(rs6.no_app_bookmark_description);
        js3.o(string, "getString(...)");
        int iL0 = f88.l0(string, "0", 0, false, 6);
        TextView textView2 = (TextView) view.findViewById(rr6.empty_message);
        textView2.setVisibility(0);
        SpannableString spannableString = new SpannableString(textView2.getResources().getString(rs6.no_app_bookmark_description));
        spannableString.setSpan(new ImageSpan(drawable), iL0, iL0 + 1, 18);
        textView2.setText(spannableString);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final List L0() {
        return br9.B(Q1());
    }

    public final AppBookmarkViewModel Q1() {
        return (AppBookmarkViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        lm lmVar = new lm(v1(), 0);
        lmVar.m = new bn6(F());
        lmVar.n = new v4(4, this);
        lmVar.k = new pt2(6, this);
        return lmVar;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ExtendedSwipeRefreshLayout extendedSwipeRefreshLayoutB1 = B1();
        if (extendedSwipeRefreshLayoutB1 != null) {
            extendedSwipeRefreshLayoutB1.setDistanceToTriggerSync(Integer.MAX_VALUE);
        }
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new AppBookmarkRecyclerListFragment$onViewCreated$1(this, null));
        AppBookmarkViewModel appBookmarkViewModelQ1 = Q1();
        appBookmarkViewModelQ1.x(new u95("on", "x"));
        appBookmarkViewModelQ1.s();
        Q1().e();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return Q1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        return new d16(K().getDimensionPixelSize(pq6.space_s), K().getDimensionPixelSize(pq6.horizontal_space_outer), K().getDimensionPixelSize(pq6.space_s), 0, v1(), false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return K().getInteger(ds6.bookmark_max_span);
    }
}
