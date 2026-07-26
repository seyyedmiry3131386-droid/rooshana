package ir.mservices.market.reels.ui.recycler;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.d;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.a79;
import defpackage.b17;
import defpackage.b77;
import defpackage.br9;
import defpackage.bt2;
import defpackage.c9;
import defpackage.cc7;
import defpackage.ea7;
import defpackage.eb6;
import defpackage.f57;
import defpackage.f88;
import defpackage.g07;
import defpackage.gb6;
import defpackage.i07;
import defpackage.js3;
import defpackage.k07;
import defpackage.l07;
import defpackage.lw;
import defpackage.lw8;
import defpackage.na7;
import defpackage.og5;
import defpackage.pq6;
import defpackage.q39;
import defpackage.qg5;
import defpackage.qs6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.u03;
import defpackage.u80;
import defpackage.ur4;
import defpackage.uv1;
import defpackage.w17;
import defpackage.w50;
import defpackage.w91;
import defpackage.x07;
import defpackage.yq6;
import defpackage.zk8;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.reels.data.AdAppInfoDto;
import ir.mservices.market.reels.data.AdContentDto;
import ir.mservices.market.reels.data.AdLinkInfoDto;
import ir.mservices.market.reels.data.ReelAdDto;
import ir.mservices.market.reels.ui.recycler.ReelAdData;
import ir.mservices.market.reels.ui.recycler.a;
import ir.mservices.market.views.MyketTextView;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends u80 {
    public static final /* synthetic */ int V = 0;
    public final og5 A;
    public final og5 B;
    public final og5 C;
    public final og5 D;
    public final lw8 E;
    public ValueAnimator F;
    public g07 G;
    public eb6 H;
    public ViewPropertyAnimator I;
    public Handler J;
    public final LinkedHashSet K;
    public l07 L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public final i07 T;
    public final i07 U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r2v7, types: [i07] */
    /* JADX WARN: Type inference failed for: r2v8, types: [i07] */
    public a(View view, og5 og5Var, og5 og5Var2, b17 b17Var, b17 b17Var2, b17 b17Var3, ur4 ur4Var) {
        super(view, og5Var, og5Var2);
        js3.p(b17Var, "onAppInfoClickListener");
        js3.p(b17Var2, "onLinkInfoClickListener");
        js3.p(b17Var3, "onAnalyticsCallbackListener");
        js3.p(ur4Var, "onAdLikeClickListener");
        this.A = b17Var;
        this.B = b17Var2;
        this.C = b17Var3;
        this.D = ur4Var;
        w91 w91Var = (w91) qg5.r();
        this.y = (x07) w91Var.J0.get();
        this.E = (lw8) w91Var.E.get();
        this.K = new LinkedHashSet();
        final int i = 0;
        this.T = new og5(this) { // from class: i07
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                a aVar = (a) qg5Var;
                switch (i) {
                    case 0:
                        ((Boolean) obj).booleanValue();
                        js3.p(view2, "view");
                        js3.p(aVar, "viewHolder");
                        a aVar2 = this.b;
                        aVar2.x.m(view2, aVar, Boolean.valueOf(!js3.h(aVar2.F() != null ? Float.valueOf(r0.s()) : null, 0.0f)));
                        return;
                    default:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        js3.p(view2, "view");
                        js3.p(aVar, "viewHolder");
                        js3.p(reelAdData, "recyclerData");
                        boolean z = reelAdData.c;
                        reelAdData.c = !z;
                        a aVar3 = this.b;
                        g07 g07Var = aVar3.G;
                        if (g07Var == null) {
                            js3.V("binding");
                            throw null;
                        }
                        LottieAnimationView lottieAnimationView = g07Var.A;
                        if (z) {
                            lottieAnimationView.setAnimation(qs6.small_heart_dislike);
                        } else {
                            lottieAnimationView.setAnimation(qs6.small_heart_like);
                        }
                        lottieAnimationView.f();
                        aVar3.D.m(view2, aVar, reelAdData);
                        return;
                }
            }
        };
        final int i2 = 1;
        this.U = new og5(this) { // from class: i07
            public final /* synthetic */ a b;

            {
                this.b = this;
            }

            @Override // defpackage.og5
            public final void m(View view2, qg5 qg5Var, Object obj) {
                a aVar = (a) qg5Var;
                switch (i2) {
                    case 0:
                        ((Boolean) obj).booleanValue();
                        js3.p(view2, "view");
                        js3.p(aVar, "viewHolder");
                        a aVar2 = this.b;
                        aVar2.x.m(view2, aVar, Boolean.valueOf(!js3.h(aVar2.F() != null ? Float.valueOf(r0.s()) : null, 0.0f)));
                        return;
                    default:
                        ReelAdData reelAdData = (ReelAdData) obj;
                        js3.p(view2, "view");
                        js3.p(aVar, "viewHolder");
                        js3.p(reelAdData, "recyclerData");
                        boolean z = reelAdData.c;
                        reelAdData.c = !z;
                        a aVar3 = this.b;
                        g07 g07Var = aVar3.G;
                        if (g07Var == null) {
                            js3.V("binding");
                            throw null;
                        }
                        LottieAnimationView lottieAnimationView = g07Var.A;
                        if (z) {
                            lottieAnimationView.setAnimation(qs6.small_heart_dislike);
                        } else {
                            lottieAnimationView.setAnimation(qs6.small_heart_like);
                        }
                        lottieAnimationView.f();
                        aVar3.D.m(view2, aVar, reelAdData);
                        return;
                }
            }
        };
    }

    public static final void D(a aVar) {
        ViewPropertyAnimator viewPropertyAnimator = aVar.I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        g07 g07Var = aVar.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = g07Var.K.animate().alpha(0.0f).setDuration(100L).withEndAction(new u03(19, aVar));
        aVar.I = viewPropertyAnimatorWithEndAction;
        if (viewPropertyAnimatorWithEndAction != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
    }

    public static final void E(a aVar, String str) {
        if (str == null || f88.n0(str)) {
            return;
        }
        og5 og5Var = aVar.C;
        View view = aVar.a;
        js3.o(view, "itemView");
        og5Var.m(view, aVar, str);
    }

    @Override // defpackage.u80
    public final void A() {
        gb6 gb6VarF = F();
        if (gb6VarF != null) {
            gb6VarF.a();
        }
        g07 g07Var = this.G;
        if (g07Var != null) {
            g07Var.H.setPlayer(null);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.u80
    public final void B() {
        Handler handler;
        l07 l07Var = this.L;
        if (l07Var != null && (handler = this.J) != null) {
            handler.removeCallbacks(l07Var);
        }
        this.K.clear();
        this.L = null;
        this.J = null;
        G();
        y();
        g07 g07Var = this.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        g07Var.K.setAlpha(1.0f);
        gb6 gb6VarF = F();
        if (gb6VarF != null) {
            gb6VarF.x(0L);
        }
        ViewPropertyAnimator viewPropertyAnimator = this.I;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.I = null;
        ValueAnimator valueAnimator = this.F;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.F = null;
        g07 g07Var2 = this.G;
        if (g07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        g07Var2.v.setTextColor(sj8.b().I.a);
        I();
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = false;
        this.Q = false;
        this.R = false;
        this.S = false;
    }

    @Override // defpackage.u80
    public final void C() {
        gb6 gb6VarF = F();
        if (gb6VarF != null) {
            gb6VarF.x(0L);
            gb6VarF.K();
        }
    }

    public final gb6 F() {
        g07 g07Var = this.G;
        if (g07Var != null) {
            return g07Var.H.getPlayer();
        }
        js3.V("binding");
        throw null;
    }

    public final void G() {
        g07 g07Var = this.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        g07Var.C.d(false);
        g07 g07Var2 = this.G;
        if (g07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        Group group = g07Var2.E;
        js3.o(group, "loadingGroup");
        group.setVisibility(8);
    }

    public final void H(ReelAdData reelAdData) {
        Handler handler;
        I();
        AdContentDto content = reelAdData.b.getContent();
        long duration = ((long) content.getDuration()) * 1000;
        long viewOffset = ((long) content.getViewOffset()) * 1000;
        long j = 4;
        long j2 = duration / j;
        long j3 = duration / ((long) 2);
        long j4 = (((long) 3) * duration) / j;
        long j5 = duration - 1000;
        synchronized (zk8.class) {
            Handler handler2 = zk8.a;
            if (handler2 == null) {
                handler2 = new Handler(Looper.getMainLooper());
                zk8.a = handler2;
            }
            handler = handler2;
        }
        this.J = handler;
        l07 l07Var = new l07(this, reelAdData, j2, j3, j4, j5, viewOffset);
        this.L = l07Var;
        handler.post(l07Var);
        z();
    }

    public final void I() {
        g07 g07Var = this.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        ConstraintLayout constraintLayout = g07Var.J;
        MyketTextView myketTextView = g07Var.v;
        d dVar = new d();
        dVar.f(constraintLayout);
        dVar.e(myketTextView.getId(), 3);
        dVar.e(myketTextView.getId(), 4);
        dVar.h(myketTextView.getId(), 3, 0, 4);
        dVar.h(myketTextView.getId(), 7, 0, 7);
        dVar.h(myketTextView.getId(), 6, g07Var.G.getId(), 7);
        dVar.b(constraintLayout);
        J();
    }

    public final void J() {
        View view = this.a;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_24);
        int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.border_size);
        g07 g07Var = this.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = g07Var.v;
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().N;
        ea7Var.c(dimensionPixelSize);
        ea7Var.h = dimensionPixelSize2;
        ea7Var.i = sj8.c(sj8.f).v;
        myketTextView.setBackground(ea7Var.a());
    }

    public final void K(ReelAdData reelAdData, String str, String str2, String str3, String str4, og5 og5Var) throws Throwable {
        Throwable th;
        int dimensionPixelSize;
        g07 g07Var = this.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = g07Var.v;
        boolean z = str == null || f88.n0(str);
        g07 g07Var2 = this.G;
        if (g07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = g07Var2.O;
        js3.o(myketTextView2, "title");
        ViewGroup.LayoutParams layoutParams = myketTextView2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        View view = this.a;
        if (z) {
            th = null;
            dimensionPixelSize = 0;
        } else {
            th = null;
            dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.space_12);
        }
        marginLayoutParams.setMarginStart(dimensionPixelSize);
        myketTextView2.setLayoutParams(marginLayoutParams);
        g07 g07Var3 = this.G;
        if (g07Var3 == null) {
            js3.V("binding");
            throw th;
        }
        ImageView imageView = g07Var3.y;
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        if (layoutParams2 != null) {
            if (z) {
                layoutParams2.width = 1;
            } else {
                int dimensionPixelSize2 = view.getResources().getDimensionPixelSize(pq6.reel_ad_icon_size);
                layoutParams2.width = dimensionPixelSize2;
                layoutParams2.height = dimensionPixelSize2;
            }
            imageView.setVisibility(z ? 4 : 0);
            imageView.setLayoutParams(layoutParams2);
            imageView.requestLayout();
        }
        if (!z) {
            Context context = view.getContext();
            js3.o(context, "getContext(...)");
            ((f57) zk8.O(context, str).G(new na7(view.getResources().getDimensionPixelSize(pq6.space_4)))).W(uv1.b()).P(g07Var.y);
        }
        J();
        myketTextView.setTextColor(sj8.b().I.a);
        myketTextView.setText(str4);
        g07Var.z.setText(str4);
        qg5.v(myketTextView, og5Var, this, reelAdData);
        MyketTextView myketTextView3 = g07Var.O;
        js3.m(myketTextView3);
        myketTextView3.setVisibility((str2 == null || f88.n0(str2)) ? 8 : 0);
        myketTextView3.setText(str2);
        MyketTextView myketTextView4 = g07Var.N;
        js3.m(myketTextView4);
        myketTextView4.setVisibility((str3 == null || f88.n0(str3)) ? 8 : 0);
        myketTextView4.setText(str3);
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ReelAdData reelAdData = (ReelAdData) myketRecyclerData;
        js3.p(reelAdData, "data");
        eb6 c9Var = this.H;
        if (c9Var == null) {
            c9Var = new c9(this, reelAdData, 3);
        }
        this.H = c9Var;
        gb6 gb6VarF = F();
        if (gb6VarF != null) {
            gb6VarF.n(c9Var);
        }
        gb6 gb6VarF2 = F();
        if (gb6VarF2 != null) {
            gb6VarF2.c();
        }
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ReelAdViewHolder$onAttach$1(reelAdData, this, null), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) throws Throwable {
        Drawable drawable;
        a aVar;
        AdLinkInfoDto linkInfo;
        ReelAdData reelAdData = (ReelAdData) myketRecyclerData;
        js3.p(reelAdData, "data");
        ReelAdDto reelAdDto = reelAdData.b;
        g07 g07Var = this.G;
        if (g07Var == null) {
            js3.V("binding");
            throw null;
        }
        PlayerView playerView = g07Var.H;
        w17 w17Var = g07Var.M;
        View view = w17Var.v;
        View view2 = this.a;
        Context context = view2.getContext();
        js3.o(context, "getContext(...)");
        ea7 ea7Var = new ea7(context);
        ea7Var.b = sj8.b().b.e.g;
        ea7Var.c(view2.getResources().getDimensionPixelSize(pq6.reel_avatar_size) / 2);
        ea7Var.h = 0;
        view.setBackground(ea7Var.a());
        Context context2 = view2.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var2 = new ea7(context2);
        ea7Var2.b = sj8.b().b.e.g;
        ea7Var2.c(view2.getResources().getDimensionPixelSize(pq6.space_4));
        ea7Var2.h = 0;
        StateListDrawable stateListDrawableA = ea7Var2.a();
        w17Var.y.setBackground(stateListDrawableA);
        w17Var.w.setBackground(stateListDrawableA);
        w17Var.x.setBackground(stateListDrawableA);
        g07 g07Var2 = this.G;
        if (g07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        View view3 = g07Var2.D;
        Context context3 = view2.getContext();
        js3.o(context3, "getContext(...)");
        ea7 ea7Var3 = new ea7(context3);
        ea7Var3.b = sj8.b().J.f;
        ea7Var3.c(view2.getResources().getDimensionPixelSize(pq6.space_20));
        ea7Var3.h = view2.getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var3.i = sj8.b().I.d;
        view3.setBackground(ea7Var3.a());
        g07 g07Var3 = this.G;
        if (g07Var3 == null) {
            js3.V("binding");
            throw null;
        }
        g07Var3.C.setIndicatorColor(sj8.c(sj8.f).j);
        int dimensionPixelSize = view2.getResources().getDimensionPixelSize(pq6.default_icon_size);
        Resources resources = view2.getResources();
        js3.o(resources, "getResources(...)");
        int i = yq6.ic_retry;
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
        drawableMutate.setColorFilter(new PorterDuffColorFilter(sj8.c(sj8.f).j, PorterDuff.Mode.MULTIPLY));
        drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
        g07 g07Var4 = this.G;
        if (g07Var4 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = g07Var4.I;
        Context context4 = view2.getContext();
        js3.o(context4, "getContext(...)");
        ea7 ea7Var4 = new ea7(context4);
        ea7Var4.b = sj8.b().J.f;
        ea7Var4.c(view2.getResources().getDimensionPixelSize(pq6.space_20));
        ea7Var4.h = view2.getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var4.i = sj8.b().I.d;
        myketTextView.setBackground(ea7Var4.a());
        myketTextView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        myketTextView.setOnClickListener(new w50(myketTextView, this, 10));
        g07 g07Var5 = this.G;
        if (g07Var5 == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = g07Var5.A;
        lottieAnimationView.setAnimation(qs6.small_heart_dislike);
        lottieAnimationView.setProgress(1.0f);
        String heartCount = reelAdDto.getContent().getHeartCount();
        g07 g07Var6 = this.G;
        if (g07Var6 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView2 = g07Var6.B;
        js3.m(myketTextView2);
        myketTextView2.setVisibility((heartCount == null || f88.n0(heartCount)) ? 8 : 0);
        lw8 lw8Var = this.E;
        if (lw8Var == null) {
            js3.V("uiUtils");
            throw null;
        }
        myketTextView2.setText(lw8.e(lw8Var, heartCount));
        int i2 = k07.a[reelAdData.d.ordinal()];
        if (i2 == 1) {
            aVar = this;
            AdAppInfoDto appInfo = reelAdDto.getAppInfo();
            if (appInfo != null) {
                String iconUrl = appInfo.getIconUrl();
                String title = appInfo.getTitle();
                String subtitle = appInfo.getSubtitle();
                String string = view2.getResources().getString(rs6.install_app);
                js3.o(string, "getString(...)");
                aVar.K(reelAdData, iconUrl, title, subtitle, string, aVar.A);
            }
        } else if (i2 == 2 && (linkInfo = reelAdDto.getLinkInfo()) != null) {
            String iconUrl2 = linkInfo.getIconUrl();
            String title2 = linkInfo.getTitle();
            String subtitle2 = linkInfo.getSubtitle();
            String callToAction = linkInfo.getCallToAction();
            if (callToAction == null || f88.n0(callToAction)) {
                callToAction = view2.getResources().getString(rs6.more_information);
                js3.o(callToAction, "getString(...)");
            }
            String str = callToAction;
            aVar = this;
            aVar.K(reelAdData, iconUrl2, title2, subtitle2, str, this.B);
        } else {
            aVar = this;
        }
        playerView.setKeepScreenOn(true);
        Context context5 = view2.getContext();
        js3.o(context5, "getContext(...)");
        playerView.setPlayer(x(context5, br9.B(reelAdDto.getContent().getUrl())));
        g07 g07Var7 = aVar.G;
        if (g07Var7 == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView2 = g07Var7.G;
        js3.o(lottieAnimationView2, "mute");
        qg5.v(lottieAnimationView2, aVar.T, this, Boolean.FALSE);
        g07 g07Var8 = aVar.G;
        if (g07Var8 == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView3 = g07Var8.A;
        js3.o(lottieAnimationView3, "like");
        qg5.v(lottieAnimationView3, aVar.U, this, reelAdData);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        gb6 gb6VarF;
        js3.p((ReelAdData) myketRecyclerData, "data");
        eb6 eb6Var = this.H;
        if (eb6Var != null && (gb6VarF = F()) != null) {
            gb6VarF.O(eb6Var);
        }
        this.H = null;
        B();
        gb6 gb6VarF2 = F();
        if (gb6VarF2 != null) {
            gb6VarF2.stop();
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof g07) {
            this.G = (g07) a79Var;
        } else {
            lw.g(null, "Incompatible view binding", null);
        }
    }

    @Override // defpackage.u80
    public final void y() {
        gb6 gb6VarF = F();
        if (gb6VarF != null) {
            gb6VarF.b();
        }
    }

    @Override // defpackage.u80
    public final void z() {
        gb6 gb6VarF = F();
        if (gb6VarF != null) {
            gb6VarF.c();
            gb6VarF.K();
        }
    }
}
