package ir.mservices.market.movie.streamers;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.h;
import defpackage.b77;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.c24;
import defpackage.d16;
import defpackage.d78;
import defpackage.ea7;
import defpackage.eq6;
import defpackage.f78;
import defpackage.f88;
import defpackage.fa1;
import defpackage.g27;
import defpackage.g78;
import defpackage.h78;
import defpackage.j71;
import defpackage.j78;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.n35;
import defpackage.o79;
import defpackage.ok4;
import defpackage.p3;
import defpackage.pq6;
import defpackage.q79;
import defpackage.rn8;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sv0;
import defpackage.ue7;
import defpackage.vr1;
import defpackage.x79;
import defpackage.yq6;
import defpackage.yu7;
import defpackage.yw6;
import ir.mservices.market.activity.BaseContentActivity;
import ir.mservices.market.movie.streamers.data.StreamerToolbarData;
import ir.mservices.market.viewModel.c;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.ScreenshotView;
import java.util.Arrays;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerProfileFragment extends Hilt_StreamerProfileFragment {
    public static final /* synthetic */ int s1 = 0;
    public final o79 i1;
    public final bi5 j1;
    public final c24 k1;
    public d78 l1;
    public j78 m1;
    public boolean n1;
    public int o1;
    public boolean p1;
    public int q1;
    public int r1;

    public StreamerProfileFragment() {
        final StreamerProfileFragment$special$$inlined$viewModels$default$1 streamerProfileFragment$special$$inlined$viewModels$default$1 = new StreamerProfileFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.movie.streamers.StreamerProfileFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) streamerProfileFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.i1 = new o79(g27.a(StreamerProfileViewModel.class), new bp2() { // from class: ir.mservices.market.movie.streamers.StreamerProfileFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.movie.streamers.StreamerProfileFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.movie.streamers.StreamerProfileFragment$special$$inlined$viewModels$default$4
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
        this.j1 = new bi5(g27.a(h78.class), new yw6(18, this));
        this.k1 = a.a(new yu7(2, this));
        this.o1 = -1;
        this.q1 = -1;
        this.r1 = sj8.b().N;
    }

    public static final void Q1(StreamerProfileFragment streamerProfileFragment, boolean z) {
        j78 j78Var = streamerProfileFragment.m1;
        if (j78Var == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        ScreenshotView screenshotView = j78Var.v;
        js3.m(screenshotView);
        int i = 8;
        screenshotView.setVisibility(z ? 0 : 8);
        ScreenshotView.setStyle$default(screenshotView, null, Integer.valueOf(screenshotView.getResources().getDimensionPixelSize(pq6.space_8)), null, 5, null);
        StreamerToolbarData streamerToolbarData = (StreamerToolbarData) streamerProfileFragment.S1().B.a.getValue();
        screenshotView.c("", streamerToolbarData != null ? streamerToolbarData.getAvatarUrl() : null);
        MyketTextView myketTextView = j78Var.x;
        js3.m(myketTextView);
        myketTextView.setVisibility(z ? 0 : 8);
        StreamerToolbarData streamerToolbarData2 = (StreamerToolbarData) streamerProfileFragment.S1().B.a.getValue();
        myketTextView.setText(streamerToolbarData2 != null ? streamerToolbarData2.getName() : null);
        MyketTextView myketTextView2 = j78Var.y;
        StreamerToolbarData streamerToolbarData3 = (StreamerToolbarData) streamerProfileFragment.S1().B.a.getValue();
        String subtitle = streamerToolbarData3 != null ? streamerToolbarData3.getSubtitle() : null;
        js3.m(myketTextView2);
        if (z && subtitle != null && !f88.n0(subtitle)) {
            i = 0;
        }
        myketTextView2.setVisibility(i);
        myketTextView2.setText(subtitle);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_streamer_profile);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean H1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final boolean M1() {
        return this.p1;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int P0() {
        return this.r1;
    }

    public final int R1() {
        TypedValue typedValue = new TypedValue();
        K().getValue(pq6.streamer_header_banner_height_percent, typedValue, true);
        return ((Boolean) this.k1.getValue()).booleanValue() ? ok4.t(this.q1, 0, (int) (typedValue.getFloat() * p3.g(F()).b)) : this.q1;
    }

    public final StreamerProfileViewModel S1() {
        return (StreamerProfileViewModel) this.i1.getValue();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void T(Bundle bundle) {
        super.T(bundle);
        rn8 rn8Var = (rn8) F();
        if (rn8Var != null) {
            j78 j78Var = this.m1;
            if (j78Var == null) {
                js3.V("toolbarBinding");
                throw null;
            }
            rn8Var.z(j78Var.l);
        }
        rn8 rn8Var2 = (rn8) F();
        if (rn8Var2 != null) {
            Resources resourcesK = K();
            int i = eq6.transparent;
            ThreadLocal threadLocal = b77.a;
            ((BaseContentActivity) rn8Var2).a0(resourcesK.getColor(i, null));
        }
        rn8 rn8Var3 = (rn8) F();
        if (rn8Var3 != null) {
            d78 d78Var = this.l1;
            if (d78Var != null) {
                rn8Var3.u(d78Var.l);
            } else {
                js3.V("collapseBinding");
                throw null;
            }
        }
    }

    public final void T1(int i) {
        j78 j78Var = this.m1;
        if (j78Var == null) {
            js3.V("toolbarBinding");
            throw null;
        }
        ImageView imageView = j78Var.w;
        Context context = imageView.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = Color.parseColor(String.format("#%02x%06X", Arrays.copyOf(new Object[]{Integer.valueOf((((255 - i) * 178) / 255) & 255), Integer.valueOf(sj8.b().n & 16777215)}, 2)));
        ea7Var.c(96);
        ea7Var.j = true;
        ea7Var.h = 0;
        imageView.setBackground(ea7Var.a());
        imageView.getDrawable().setColorFilter(new PorterDuffColorFilter(sv0.b(i / 255.0f, sj8.b().l, sj8.b().n), PorterDuff.Mode.MULTIPLY));
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewTreeObserver viewTreeObserver;
        Window window;
        js3.p(layoutInflater, "inflater");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(H());
        int i = j78.z;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        j78 j78Var = (j78) fa1.c(layoutInflaterFrom, js6.streamer_profile_toolbar_view, null, false);
        js3.o(j78Var, "inflate(...)");
        this.m1 = j78Var;
        j78Var.w.setOnClickListener(new ue7(3, this));
        T1(0);
        this.q1 = (p3.g(F()).a * 138) / 360;
        FragmentActivity fragmentActivityF = F();
        View decorView = (fragmentActivityF == null || (window = fragmentActivityF.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null && (viewTreeObserver = decorView.getViewTreeObserver()) != null) {
            viewTreeObserver.addOnPreDrawListener(new g78(decorView, this));
        }
        LayoutInflater layoutInflaterFrom2 = LayoutInflater.from(H());
        int i2 = d78.z;
        d78 d78Var = (d78) fa1.c(layoutInflaterFrom2, js6.streamer_profile_collapse_view, null, false);
        js3.o(d78Var, "inflate(...)");
        this.l1 = d78Var;
        ImageView imageView = d78Var.w;
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        imageView.setImageDrawable(p3.k(resourcesK, yq6.streamer_header_dark_shadow));
        d78 d78Var2 = this.l1;
        if (d78Var2 == null) {
            js3.V("collapseBinding");
            throw null;
        }
        ImageView imageView2 = d78Var2.y;
        Resources resourcesK2 = K();
        js3.o(resourcesK2, "getResources(...)");
        imageView2.setImageDrawable(p3.k(resourcesK2, yq6.streamer_header_yellow_shadow));
        return super.Z(layoutInflater, viewGroup, bundle);
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean Z0() {
        return true;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean a1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean c1() {
        return false;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final ir.mservices.market.version2.ui.recycler.adapter.a j1() {
        vr1 vr1Var = new vr1(p3.g(F()), this.F0.f(), 3);
        vr1Var.o = new f78(this, 0);
        vr1Var.p = new f78(this, 1);
        vr1Var.q = new f78(this, 2);
        vr1Var.s = new f78(this, 3);
        vr1Var.r = new f78(this, 4);
        vr1Var.t = new f78(this, 5);
        return vr1Var;
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new StreamerProfileFragment$onViewCreated$1(this, null));
        if (!this.n1) {
            d78 d78Var = this.l1;
            if (d78Var == null) {
                js3.V("collapseBinding");
                throw null;
            }
            ViewGroup.LayoutParams layoutParams = d78Var.x.getLayoutParams();
            js3.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = R1();
            this.n1 = true;
        }
        y1().setOverScrollMode(2);
        y1().setItemAnimator(null);
        y1().j(new n35(new int[]{0, 0}, this, 3));
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final c l1() {
        return S1();
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final h t1() {
        int dimensionPixelSize = K().getDimensionPixelSize(pq6.horizontal_space_inner) + K().getDimensionPixelSize(pq6.horizontal_space_outer);
        int[] iArr = {0, 0};
        y1().getLocationOnScreen(iArr);
        return new d16((R1() - iArr[1]) - (K().getDimensionPixelSize(pq6.streamer_avatar_icon) / 2), K().getDimensionPixelSize(pq6.space_16), dimensionPixelSize, dimensionPixelSize, 0, 0, 1, false, this.F0.f());
    }

    @Override // ir.mservices.market.version2.fragments.recycle.PagingRecyclerListContentFragment
    public final int v1() {
        return 1;
    }
}
