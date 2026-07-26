package ir.mservices.market.reels.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.widget.ImageView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle$State;
import androidx.recyclerview.widget.o;
import androidx.viewpager2.widget.ViewPager2;
import defpackage.a27;
import defpackage.b77;
import defpackage.bp2;
import defpackage.bt2;
import defpackage.c17;
import defpackage.c24;
import defpackage.cc2;
import defpackage.cd;
import defpackage.d17;
import defpackage.ea7;
import defpackage.fa1;
import defpackage.g27;
import defpackage.hw7;
import defpackage.j71;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k68;
import defpackage.km2;
import defpackage.o79;
import defpackage.og5;
import defpackage.p07;
import defpackage.pq6;
import defpackage.q39;
import defpackage.q40;
import defpackage.q79;
import defpackage.qg5;
import defpackage.ql0;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.u03;
import defpackage.u80;
import defpackage.ur4;
import defpackage.v07;
import defpackage.w50;
import defpackage.wn5;
import defpackage.x07;
import defpackage.x79;
import defpackage.y97;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.yw6;
import defpackage.zz0;
import ir.mservices.market.activity.BaseActivity;
import ir.mservices.market.reels.data.AdAppInfoDto;
import ir.mservices.market.reels.data.AdLinkInfoDto;
import ir.mservices.market.reels.data.AnalyticsEventDto;
import ir.mservices.market.reels.data.ProfileDto;
import ir.mservices.market.reels.data.ReelAdDto;
import ir.mservices.market.reels.data.ReelAdType;
import ir.mservices.market.reels.data.ReelDto;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.reels.ui.ReelsViewModel;
import ir.mservices.market.reels.ui.recycler.BaseReelData;
import ir.mservices.market.reels.ui.recycler.ReelAdData;
import ir.mservices.market.reels.ui.recycler.ReelData;
import ir.mservices.market.reels.ui.recycler.a;
import ir.mservices.market.reels.ui.recycler.b;
import ir.mservices.market.social.profile.user.UserProfileRefId;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.views.MyketTextView;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$IntRef;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsFragment extends Hilt_ReelsFragment {
    public static final /* synthetic */ int i1 = 0;
    public x07 V0;
    public k68 W0;
    public final Object X0 = kotlin.a.b(LazyThreadSafetyMode.a, new yw6(2, this));
    public int Y0 = -1;
    public v07 Z0;
    public km2 a1;
    public boolean b1;
    public final o79 c1;
    public ViewPropertyAnimator d1;
    public ValueAnimator e1;
    public boolean f1;
    public boolean g1;
    public zz0 h1;

    public ReelsFragment() {
        final ReelsFragment$special$$inlined$viewModels$default$1 reelsFragment$special$$inlined$viewModels$default$1 = new ReelsFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.reels.ui.ReelsFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) reelsFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.c1 = new o79(g27.a(ReelsViewModel.class), new bp2() { // from class: ir.mservices.market.reels.ui.ReelsFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.reels.ui.ReelsFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.reels.ui.ReelsFragment$special$$inlined$viewModels$default$4
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

    public static String k1(String str, p07 p07Var) {
        if (str == null || p07Var == null) {
            return null;
        }
        Uri.Builder builderAppendQueryParameter = Uri.parse(str).buildUpon().appendQueryParameter("reelId", p07Var.d).appendQueryParameter("autoScroll", String.valueOf(p07Var.e)).appendQueryParameter("duration", String.valueOf(p07Var.a)).appendQueryParameter("currentPlayedSeconds", String.valueOf(p07Var.c)).appendQueryParameter("createdAt", String.valueOf(p07Var.b));
        for (Map.Entry entry : p07Var.f.entrySet()) {
            builderAppendQueryParameter.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderAppendQueryParameter.toString();
    }

    public static b n1(ReelsFragment reelsFragment) {
        int iM1 = reelsFragment.m1();
        km2 km2Var = reelsFragment.a1;
        js3.m(km2Var);
        ViewPager2 viewPager2 = km2Var.B;
        js3.o(viewPager2, "viewPager");
        o oVarI = a27.h(viewPager2).I(iM1);
        if (!(oVarI instanceof b)) {
            oVarI = null;
        }
        return (b) oVarI;
    }

    public static void s1(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            Object systemService = context.getSystemService("vibrator");
            js3.n(systemService, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(50L, -1));
        } else {
            Object systemService2 = context.getSystemService("vibrator");
            js3.n(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
            ((Vibrator) systemService2).vibrate(50L);
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final String C() {
        String strL = L(rs6.page_name_reels);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final int G0(Context context) {
        return 0;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean U0() {
        return false;
    }

    @Override // androidx.fragment.app.d
    public final View Z(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        js3.p(layoutInflater, "inflater");
        FragmentActivity fragmentActivityF = F();
        BaseActivity baseActivity = fragmentActivityF instanceof BaseActivity ? (BaseActivity) fragmentActivityF : null;
        if (baseActivity != null) {
            ir.mservices.market.core.ext.a.m(baseActivity, sj8.b().N, ThemeMode.b);
        }
        FragmentActivity fragmentActivityF2 = F();
        BaseActivity baseActivity2 = fragmentActivityF2 instanceof BaseActivity ? (BaseActivity) fragmentActivityF2 : null;
        if (baseActivity2 != null) {
            ir.mservices.market.core.ext.a.k(baseActivity2, sj8.b().J.a, ThemeMode.b);
        }
        p1(true);
        int i = km2.C;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        km2 km2Var = (km2) fa1.c(layoutInflater, js6.fragment_reels, viewGroup, false);
        this.a1 = km2Var;
        View view = km2Var.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        File file;
        super.b0();
        zz0 zz0Var = this.h1;
        if (zz0Var != null) {
            km2 km2Var = this.a1;
            js3.m(km2Var);
            ((ArrayList) km2Var.B.c.b).remove(zz0Var);
        }
        this.h1 = null;
        ViewPropertyAnimator viewPropertyAnimator = this.d1;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.d1 = null;
        ValueAnimator valueAnimator = this.e1;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.e1 = null;
        b bVarN1 = n1(this);
        if (bVarN1 != null) {
            bVarN1.B();
        }
        km2 km2Var2 = this.a1;
        js3.m(km2Var2);
        km2Var2.B.setAdapter(null);
        this.Z0 = null;
        x07 x07Var = this.V0;
        if (x07Var == null) {
            js3.V("reelsCacheManager");
            throw null;
        }
        cc2.o0(x07Var.c);
        hw7 hw7Var = x07Var.b;
        if (hw7Var != null) {
            synchronized (hw7Var) {
                if (!hw7Var.i) {
                    hw7Var.e.clear();
                    hw7Var.l();
                    try {
                        try {
                            hw7Var.c.x();
                            file = hw7Var.a;
                        } catch (IOException e) {
                            wn5.H("SimpleCache", "Storing index file failed", e);
                            file = hw7Var.a;
                        }
                        hw7.o(file);
                        hw7Var.i = true;
                    } catch (Throwable th) {
                        hw7.o(hw7Var.a);
                        hw7Var.i = true;
                        throw th;
                    }
                }
            }
        }
        x07Var.b = null;
        p1(false);
        this.a1 = null;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean b1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final boolean d1() {
        return false;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        return q40.g;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void f0() {
        super.f0();
        js3.m(this.a1);
        b bVarN1 = n1(this);
        if (bVarN1 != null) {
            bVarN1.I().setImageResource(yq6.ic_pause);
        }
        int iM1 = m1();
        km2 km2Var = this.a1;
        js3.m(km2Var);
        ViewPager2 viewPager2 = km2Var.B;
        js3.o(viewPager2, "viewPager");
        o oVarI = a27.h(viewPager2).I(iM1);
        if (!(oVarI instanceof u80)) {
            oVarI = null;
        }
        u80 u80Var = (u80) oVarI;
        if (u80Var != null) {
            u80Var.y();
        }
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void g0() {
        super.g0();
        js3.m(this.a1);
        b bVarN1 = n1(this);
        if (bVarN1 != null) {
            bVarN1.I().setImageResource(yq6.ic_pause);
        }
        int iM1 = m1();
        km2 km2Var = this.a1;
        js3.m(km2Var);
        ViewPager2 viewPager2 = km2Var.B;
        js3.o(viewPager2, "viewPager");
        o oVarI = a27.h(viewPager2).I(iM1);
        if (!(oVarI instanceof u80)) {
            oVarI = null;
        }
        u80 u80Var = (u80) oVarI;
        if (u80Var != null) {
            u80Var.z();
        }
    }

    /* JADX WARN: Type inference failed for: r1v22, types: [b17] */
    /* JADX WARN: Type inference failed for: r1v23, types: [ir.mservices.market.reels.ui.a] */
    /* JADX WARN: Type inference failed for: r1v25, types: [ir.mservices.market.reels.ui.a] */
    /* JADX WARN: Type inference failed for: r8v10, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v11, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v2, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v3, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v4, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v5, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v6, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v7, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v8, types: [b17] */
    /* JADX WARN: Type inference failed for: r8v9, types: [b17] */
    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void k0(final View view, Bundle bundle) {
        Drawable drawable;
        js3.p(view, "view");
        super.k0(view, bundle);
        km2 km2Var = this.a1;
        js3.m(km2Var);
        MyketTextView myketTextView = km2Var.z;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().J.f;
        ea7Var.c(K().getDimensionPixelSize(pq6.space_20));
        ea7Var.h = K().getDimensionPixelSize(pq6.border_size);
        ea7Var.i = sj8.b().I.d;
        myketTextView.setBackground(ea7Var.a());
        myketTextView.setOnClickListener(new w50(km2Var, this, 12));
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(sj8.c(sj8.f).j, PorterDuff.Mode.MULTIPLY);
        Resources resourcesK = K();
        js3.o(resourcesK, "getResources(...)");
        int i = yq6.ic_retry;
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
        Drawable drawableMutate = drawable.mutate();
        drawableMutate.setColorFilter(porterDuffColorFilter);
        final int i2 = 0;
        drawableMutate.setBounds(0, 0, K().getDimensionPixelSize(pq6.default_icon_size), K().getDimensionPixelSize(pq6.default_icon_size));
        myketTextView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        MyketTextView myketTextView2 = km2Var.w;
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.b = sj8.b().J.f;
        ea7Var2.c(K().getDimensionPixelSize(pq6.space_20));
        ea7Var2.h = K().getDimensionPixelSize(pq6.border_size);
        ea7Var2.i = sj8.b().I.d;
        myketTextView2.setBackground(ea7Var2.a());
        km2Var.x.setIndicatorColor(sj8.c(sj8.f).j);
        ImageView imageView = km2Var.v;
        int dimensionPixelSize = imageView.getResources().getDimensionPixelSize(pq6.toolbar_back_padding);
        final int i3 = 2;
        imageView.setBackground(y97.z(sj8.c(sj8.f).O.c, ((dimensionPixelSize * 2) + imageView.getResources().getDimensionPixelSize(pq6.default_icon_size)) / 2.0f));
        imageView.setOnClickListener(new cd(27, this));
        final int i4 = 1;
        v07 v07Var = new v07(1);
        v07Var.y(new c17(this, i4));
        v07Var.n = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i5 = i2;
                int i6 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i5) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i8 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i6);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        v07Var.o = new og5(this) { // from class: ir.mservices.market.reels.ui.a
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i5 = i2;
                View view3 = view;
                ReelsFragment reelsFragment = this.b;
                b bVar = (b) qg5Var;
                ReelData reelData = (ReelData) obj;
                switch (i5) {
                    case 0:
                        int i6 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        Context context3 = view3.getContext();
                        js3.o(context3, "getContext(...)");
                        ReelsFragment.s1(context3);
                        ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                        ReelDto reelDto = reelData.b;
                        boolean zIsLiked = reelDto.isLiked();
                        String reelId = reelDto.getReelId();
                        js3.p(reelId, "reelId");
                        bt2.G(y97.G(reelsViewModelO1), null, null, new ReelsViewModel$toggleLike$1(reelsViewModelO1, reelId, zIsLiked, null), 3);
                        break;
                    default:
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        Context context4 = view3.getContext();
                        js3.o(context4, "getContext(...)");
                        ReelsFragment.s1(context4);
                        ReelsViewModel reelsViewModelO12 = reelsFragment.o1();
                        String reelId2 = reelData.b.getReelId();
                        js3.p(reelId2, "reelId");
                        bt2.G(y97.G(reelsViewModelO12), null, null, new ReelsViewModel$doubleLike$1(reelsViewModelO12, reelId2, null), 3);
                        break;
                }
            }
        };
        v07Var.y = new ur4(this, view, 14);
        v07Var.p = new og5(this) { // from class: ir.mservices.market.reels.ui.a
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                int i5 = i4;
                View view3 = view;
                ReelsFragment reelsFragment = this.b;
                b bVar = (b) qg5Var;
                ReelData reelData = (ReelData) obj;
                switch (i5) {
                    case 0:
                        int i6 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        Context context3 = view3.getContext();
                        js3.o(context3, "getContext(...)");
                        ReelsFragment.s1(context3);
                        ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                        ReelDto reelDto = reelData.b;
                        boolean zIsLiked = reelDto.isLiked();
                        String reelId = reelDto.getReelId();
                        js3.p(reelId, "reelId");
                        bt2.G(y97.G(reelsViewModelO1), null, null, new ReelsViewModel$toggleLike$1(reelsViewModelO1, reelId, zIsLiked, null), 3);
                        break;
                    default:
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p(bVar, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        Context context4 = view3.getContext();
                        js3.o(context4, "getContext(...)");
                        ReelsFragment.s1(context4);
                        ReelsViewModel reelsViewModelO12 = reelsFragment.o1();
                        String reelId2 = reelData.b.getReelId();
                        js3.p(reelId2, "reelId");
                        bt2.G(y97.G(reelsViewModelO12), null, null, new ReelsViewModel$doubleLike$1(reelsViewModelO12, reelId2, null), 3);
                        break;
                }
            }
        };
        v07Var.r = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i5 = i4;
                int i6 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i5) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i8 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i6);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        v07Var.q = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i5 = i3;
                int i6 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i5) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i8 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i6);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i5 = 3;
        v07Var.s = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i5;
                int i6 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i8 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i6);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i6 = 4;
        v07Var.m = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i6;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i7 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i8 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i7 = 5;
        v07Var.t = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i7;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i72 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i8 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i8 = 6;
        v07Var.l = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i8;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i72 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i82 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i9 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i9 = 7;
        v07Var.u = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i9;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i72 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i82 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i92 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i10 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i10 = 8;
        v07Var.v = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i10;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i72 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i82 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i92 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i102 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i11 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i11 = 9;
        v07Var.w = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i11;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i72 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i82 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i92 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i102 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i112 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i12 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        final int i12 = 10;
        v07Var.x = new og5(this) { // from class: b17
            public final /* synthetic */ ReelsFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) throws Throwable {
                int i52 = i12;
                int i62 = 0;
                ReelsFragment reelsFragment = this.b;
                switch (i52) {
                    case 0:
                        ReelData reelData = (ReelData) obj;
                        int i72 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData, "recyclerData");
                        ReelDto reelDto = reelData.b;
                        FragmentActivity fragmentActivityF = reelsFragment.F();
                        if (fragmentActivityF != null) {
                            ProfileDto profile = reelDto.getProfile();
                            String accountKey = profile != null ? profile.getAccountKey() : null;
                            ProfileDto profile2 = reelDto.getProfile();
                            pk5.e(fragmentActivityF, accountKey, profile2 != null ? profile2.getNickName() : null, UserProfileRefId.k);
                            return;
                        }
                        return;
                    case 1:
                        ReelData reelData2 = (ReelData) obj;
                        int i82 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData2, "recyclerData");
                        AnalyticsEventDto analyticsEventDto = reelData2.c;
                        String strK1 = ReelsFragment.k1(analyticsEventDto != null ? analyticsEventDto.getStart() : null, reelData2.h);
                        if (strK1 != null) {
                            reelsFragment.l1().b(new ql0(strK1, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 2:
                        ReelData reelData3 = (ReelData) obj;
                        int i92 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData3, "recyclerData");
                        AnalyticsEventDto analyticsEventDto2 = reelData3.c;
                        String strK12 = ReelsFragment.k1(analyticsEventDto2 != null ? analyticsEventDto2.getPause() : null, reelData3.h);
                        if (strK12 != null) {
                            reelsFragment.l1().b(new ql0(strK12, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 3:
                        ReelData reelData4 = (ReelData) obj;
                        int i102 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData4, "recyclerData");
                        AnalyticsEventDto analyticsEventDto3 = reelData4.c;
                        String strK13 = ReelsFragment.k1(analyticsEventDto3 != null ? analyticsEventDto3.getFinish() : null, reelData4.h);
                        if (strK13 != null) {
                            reelsFragment.l1().b(new ql0(strK13, CallbackUrlType.l, 0));
                            return;
                        }
                        return;
                    case 4:
                        Boolean bool = (Boolean) obj;
                        bool.getClass();
                        int i112 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        l lVar = reelsFragment.o1().B;
                        lVar.getClass();
                        lVar.p(null, bool);
                        return;
                    case 5:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        int i122 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        reelsFragment.r1(zBooleanValue);
                        return;
                    case 6:
                        int i13 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((u80) qg5Var, "<unused var>");
                        js3.p((BaseReelData) obj, "<unused var>");
                        reelsFragment.g1 = true;
                        int iM1 = reelsFragment.m1() + 1;
                        v07 v07Var2 = reelsFragment.Z0;
                        if (iM1 < (v07Var2 != null ? v07Var2.c() : 0)) {
                            reelsFragment.f1 = true;
                            km2 km2Var2 = reelsFragment.a1;
                            js3.m(km2Var2);
                            final ViewPager2 viewPager2 = km2Var2.B;
                            js3.o(viewPager2, "viewPager");
                            ValueAnimator valueAnimator = reelsFragment.e1;
                            c17 c17Var = new c17(reelsFragment, i62);
                            if (iM1 == viewPager2.getCurrentItem()) {
                                return;
                            }
                            int height = viewPager2.getOrientation() == 1 ? viewPager2.getHeight() : viewPager2.getWidth();
                            final boolean z = iM1 > viewPager2.getCurrentItem();
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, height);
                            c17Var.invoke(valueAnimatorOfInt);
                            final Ref$IntRef ref$IntRef = new Ref$IntRef();
                            valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: r89
                                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                                    js3.p(valueAnimator2, "valueAnimator");
                                    Object animatedValue = valueAnimator2.getAnimatedValue();
                                    Integer num = animatedValue instanceof Integer ? (Integer) animatedValue : null;
                                    int iIntValue = num != null ? num.intValue() : 0;
                                    Ref$IntRef ref$IntRef2 = ref$IntRef;
                                    float f = (iIntValue - ref$IntRef2.a) * (z ? -1.0f : 1.0f);
                                    p82 p82Var = viewPager2.n;
                                    boolean z2 = p82Var.b.m;
                                    if (z2 && z2) {
                                        float f2 = p82Var.f - f;
                                        p82Var.f = f2;
                                        int iRound = Math.round(f2 - p82Var.g);
                                        p82Var.g += iRound;
                                        long jUptimeMillis = SystemClock.uptimeMillis();
                                        boolean z3 = p82Var.a.getOrientation() == 0;
                                        int i14 = z3 ? iRound : 0;
                                        int i15 = z3 ? 0 : iRound;
                                        float f3 = z3 ? p82Var.f : 0.0f;
                                        float f4 = z3 ? 0.0f : p82Var.f;
                                        p82Var.c.scrollBy(i14, i15);
                                        MotionEvent motionEventObtain = MotionEvent.obtain(p82Var.h, jUptimeMillis, 2, f3, f4, 0);
                                        p82Var.d.addMovement(motionEventObtain);
                                        motionEventObtain.recycle();
                                    }
                                    ref$IntRef2.a = iIntValue;
                                }
                            });
                            valueAnimatorOfInt.addListener(new jw1(viewPager2, c17Var, 3));
                            valueAnimatorOfInt.setDuration(550L);
                            valueAnimatorOfInt.setInterpolator(new w82(1));
                            valueAnimatorOfInt.start();
                            return;
                        }
                        return;
                    case 7:
                        ReelData reelData5 = (ReelData) obj;
                        int i14 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((b) qg5Var, "<unused var>");
                        js3.p(reelData5, "recyclerData");
                        if (reelsFragment.W0 == null) {
                            js3.V("storageUtils");
                            throw null;
                        }
                        ReelDto reelDto2 = reelData5.b;
                        if (!k68.r(reelDto2.getReelId())) {
                            ReelsViewModel reelsViewModelO1 = reelsFragment.o1();
                            String reelId = reelDto2.getReelId();
                            js3.p(reelId, "reelId");
                            reelsViewModelO1.v.c(reelId);
                            return;
                        }
                        k68 k68Var = reelsFragment.W0;
                        if (k68Var != null) {
                            k68Var.t("reels");
                            return;
                        } else {
                            js3.V("storageUtils");
                            throw null;
                        }
                    case 8:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        int i15 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData, "reelAdData");
                        reelsFragment.q1(reelAdData);
                        Context contextH = reelsFragment.H();
                        AdAppInfoDto appInfo = reelAdData.b.getAppInfo();
                        if (contextH == null || appInfo == null) {
                            return;
                        }
                        Intent intent = new Intent("ir.myket.player.action.OPEN_APPLICATION");
                        intent.setPackage(contextH.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_PACKAGE_NAME", appInfo.getPackageName());
                        intent.putExtra("EXTRA_MOVIE_AD_IS_DOWNLOAD", false);
                        intent.putExtra("EXTRA_MOVIE_AD_CALLBACK_URL", appInfo.getCallbackUrl());
                        intent.putExtra("EXTRA_MOVIE_AD_INSTALL_CALLBACK_URL", appInfo.getInstallCallbackUrl());
                        contextH.startActivity(intent);
                        return;
                    case 9:
                        ReelAdData reelAdData2 = (ReelAdData) obj;
                        int i16 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(reelAdData2, "reelAdData");
                        reelsFragment.q1(reelAdData2);
                        Context contextH2 = reelsFragment.H();
                        AdLinkInfoDto linkInfo = reelAdData2.b.getLinkInfo();
                        int i17 = sj8.b().j;
                        if (contextH2 == null || linkInfo == null) {
                            return;
                        }
                        String strJ = js8.j(linkInfo.getUrl(), null, null, null, null, true);
                        if (js3.i(linkInfo.getChrome(), Boolean.TRUE)) {
                            if (wn5.d(contextH2)) {
                                wn5.a0(i17, contextH2, strJ);
                                return;
                            } else {
                                js8.t(12, contextH2, strJ, null);
                                return;
                            }
                        }
                        Intent intent2 = new Intent("ir.myket.player.action.OPEN_URL");
                        intent2.setFlags(268435456);
                        intent2.putExtra("BUNDLE_KEY_URL", strJ);
                        intent2.putExtra("BUNDLE_KEY_TITLE", linkInfo.getCallToAction());
                        contextH2.startActivity(intent2);
                        return;
                    default:
                        String str = (String) obj;
                        int i18 = ReelsFragment.i1;
                        js3.p(view2, "<unused var>");
                        js3.p((a) qg5Var, "<unused var>");
                        js3.p(str, "callbackUrl");
                        reelsFragment.l1().b(new ql0(str, CallbackUrlType.l, 0));
                        return;
                }
            }
        };
        this.Z0 = v07Var;
        km2 km2Var2 = this.a1;
        js3.m(km2Var2);
        ViewPager2 viewPager2 = km2Var2.B;
        viewPager2.setAdapter(this.Z0);
        viewPager2.setOffscreenPageLimit(2);
        zz0 zz0Var = new zz0(i3, this);
        this.h1 = zz0Var;
        ((ArrayList) viewPager2.c.b).add(zz0Var);
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ReelsFragment$onViewCreated$4(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ReelsFragment$onViewCreated$5(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.d, new ReelsFragment$onViewCreated$6(this, null));
        ir.mservices.market.version2.core.utils.a.d(this, Lifecycle$State.c, new ReelsFragment$onViewCreated$7(this, null));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    public final ir.myket.callback.manager.a l1() {
        return (ir.myket.callback.manager.a) this.X0.getValue();
    }

    public final int m1() {
        int i = this.Y0;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    public final ReelsViewModel o1() {
        return (ReelsViewModel) this.c1.getValue();
    }

    public final void p1(boolean z) {
        Window window;
        Window window2;
        if (z) {
            FragmentActivity fragmentActivityF = F();
            if (fragmentActivityF == null || (window2 = fragmentActivityF.getWindow()) == null) {
                return;
            }
            window2.addFlags(128);
            return;
        }
        FragmentActivity fragmentActivityF2 = F();
        if (fragmentActivityF2 == null || (window = fragmentActivityF2.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    public final void q1(ReelAdData reelAdData) {
        String clickCallback;
        AdLinkInfoDto linkInfo;
        ReelAdType reelAdType = reelAdData.d;
        ReelAdDto reelAdDto = reelAdData.b;
        int i = d17.a[reelAdType.ordinal()];
        if (i == 1) {
            AdAppInfoDto appInfo = reelAdDto.getAppInfo();
            if (appInfo == null || (clickCallback = appInfo.getClickCallback()) == null) {
                return;
            }
        } else if (i != 2 || (linkInfo = reelAdDto.getLinkInfo()) == null || (clickCallback = linkInfo.getClickCallback()) == null) {
            return;
        }
        l1().b(new ql0(clickCallback, CallbackUrlType.l, 0));
    }

    public final void r1(boolean z) {
        if (z) {
            km2 km2Var = this.a1;
            js3.m(km2Var);
            if (km2Var.v.getAlpha() != 1.0f) {
                km2 km2Var2 = this.a1;
                js3.m(km2Var2);
                km2Var2.v.setAlpha(0.0f);
                km2 km2Var3 = this.a1;
                js3.m(km2Var3);
                km2Var3.A.setAlpha(0.0f);
                km2 km2Var4 = this.a1;
                js3.m(km2Var4);
                ImageView imageView = km2Var4.v;
                js3.o(imageView, "back");
                imageView.setVisibility(0);
                km2 km2Var5 = this.a1;
                js3.m(km2Var5);
                km2Var5.v.animate().alpha(1.0f).setDuration(100L);
                km2 km2Var6 = this.a1;
                js3.m(km2Var6);
                km2Var6.A.animate().alpha(1.0f).setDuration(100L);
                return;
            }
        }
        if (z) {
            return;
        }
        km2 km2Var7 = this.a1;
        js3.m(km2Var7);
        if (km2Var7.v.getAlpha() == 0.0f) {
            return;
        }
        km2 km2Var8 = this.a1;
        js3.m(km2Var8);
        km2Var8.v.setAlpha(1.0f);
        km2 km2Var9 = this.a1;
        js3.m(km2Var9);
        km2Var9.A.setAlpha(1.0f);
        km2 km2Var10 = this.a1;
        js3.m(km2Var10);
        this.d1 = km2Var10.v.animate().alpha(0.0f).setDuration(100L).withEndAction(new u03(21, this));
        km2 km2Var11 = this.a1;
        js3.m(km2Var11);
        km2Var11.A.animate().alpha(0.0f).setDuration(100L);
    }
}
