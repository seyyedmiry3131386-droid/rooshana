package ir.mservices.market.reels.ui.recycler;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import androidx.constraintlayout.widget.Group;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.hls.HlsMediaSource$Factory;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.common.collect.ImmutableList;
import defpackage.a79;
import defpackage.aj0;
import defpackage.ap4;
import defpackage.b17;
import defpackage.b77;
import defpackage.bp4;
import defpackage.bs1;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cc7;
import defpackage.ce;
import defpackage.cp4;
import defpackage.da4;
import defpackage.dp4;
import defpackage.e62;
import defpackage.ea7;
import defpackage.eb6;
import defpackage.ep;
import defpackage.ep4;
import defpackage.es1;
import defpackage.f88;
import defpackage.fp4;
import defpackage.gb6;
import defpackage.gp4;
import defpackage.hh2;
import defpackage.ig5;
import defpackage.jp4;
import defpackage.js3;
import defpackage.jx1;
import defpackage.k03;
import defpackage.k68;
import defpackage.lw;
import defpackage.og5;
import defpackage.p07;
import defpackage.p80;
import defpackage.pq6;
import defpackage.pt2;
import defpackage.q07;
import defpackage.q39;
import defpackage.q6;
import defpackage.qg5;
import defpackage.qp4;
import defpackage.qs6;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s07;
import defpackage.sj8;
import defpackage.t07;
import defpackage.tf5;
import defpackage.u03;
import defpackage.u07;
import defpackage.u80;
import defpackage.ur4;
import defpackage.vy2;
import defpackage.w17;
import defpackage.w50;
import defpackage.w91;
import defpackage.wp4;
import defpackage.x07;
import defpackage.yo4;
import defpackage.yq6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.reels.data.ProfileDto;
import ir.mservices.market.reels.data.ReelDto;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends u80 {
    public static final /* synthetic */ int B0 = 0;
    public final og5 A;
    public final ur4 A0;
    public final og5 B;
    public final og5 C;
    public final og5 D;
    public final og5 E;
    public final og5 F;
    public final og5 G;
    public final og5 H;
    public final k68 I;
    public final c5 J;
    public final d K;
    public ValueAnimator L;
    public q07 M;
    public p80 N;
    public eb6 O;
    public t07 P;
    public ce Q;
    public da4 R;
    public IOException S;
    public Handler T;
    public q6 U;
    public Integer V;
    public ViewPropertyAnimator W;
    public AnimatorSet X;
    public long Y;
    public long Z;
    public ValueAnimator x0;
    public boolean y0;
    public boolean z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(View view, og5 og5Var, og5 og5Var2, b17 b17Var, ir.mservices.market.reels.ui.a aVar, ir.mservices.market.reels.ui.a aVar2, b17 b17Var2, b17 b17Var3, b17 b17Var4, b17 b17Var5, b17 b17Var6) {
        super(view, og5Var, og5Var2);
        js3.p(b17Var, "onProfileClickListener");
        js3.p(aVar, "onLikeClickListener");
        js3.p(aVar2, "onDoubleTapLikeClickListener");
        js3.p(b17Var2, "onPauseAnalyticsListener");
        js3.p(b17Var3, "onStartAnalyticsListener");
        js3.p(b17Var4, "onFinishAnalyticsListener");
        js3.p(b17Var5, "onBackVisibilityChanged");
        js3.p(b17Var6, "onDownloadClickListener");
        this.A = b17Var;
        this.B = aVar;
        this.C = aVar2;
        this.D = b17Var2;
        this.E = b17Var3;
        this.F = b17Var4;
        this.G = b17Var5;
        this.H = b17Var6;
        this.z0 = true;
        this.A0 = new ur4(this, og5Var2, 13);
        w91 w91Var = (w91) qg5.r();
        this.y = (x07) w91Var.J0.get();
        this.I = (k68) w91Var.V.get();
        this.J = (c5) w91Var.L.get();
        this.K = (d) w91Var.S.get();
    }

    public static final void D(b bVar) {
        ViewPropertyAnimator viewPropertyAnimator = bVar.W;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        q07 q07Var = bVar.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = q07Var.O.animate().alpha(0.0f).setDuration(100L).withEndAction(new u03(20, bVar));
        bVar.W = viewPropertyAnimatorWithEndAction;
        if (viewPropertyAnimatorWithEndAction != null) {
            viewPropertyAnimatorWithEndAction.start();
        }
    }

    public static final void E(b bVar, bs1 bs1Var) {
        if (bs1Var != null) {
            q07 q07Var = bVar.M;
            if (q07Var == null) {
                js3.V("binding");
                throw null;
            }
            q07Var.A.setIndeterminate(false);
            es1 es1Var = (es1) bs1Var;
            int i = ((int) ((es1Var.i * ((long) 100)) / es1Var.h)) * 100;
            if (bVar.z0) {
                q07 q07Var2 = bVar.M;
                if (q07Var2 == null) {
                    js3.V("binding");
                    throw null;
                }
                q07Var2.A.setProgress(i);
                bVar.z0 = false;
                return;
            }
            ValueAnimator valueAnimator = bVar.L;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            q07 q07Var3 = bVar.M;
            if (q07Var3 == null) {
                js3.V("binding");
                throw null;
            }
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(q07Var3.A.getProgress(), i);
            valueAnimatorOfInt.setInterpolator(new DecelerateInterpolator());
            valueAnimatorOfInt.setDuration(1000L);
            valueAnimatorOfInt.addUpdateListener(new s07(bVar, 0));
            valueAnimatorOfInt.start();
            bVar.L = valueAnimatorOfInt;
        }
    }

    public static final void F(b bVar, ReelData reelData, ExoPlayer exoPlayer) {
        fp4 fp4Var;
        if (exoPlayer == null) {
            return;
        }
        int i = reelData.g;
        ReelDto reelDto = reelData.b;
        boolean z = true;
        if (i + 1 >= reelDto.getPlayUrls().size()) {
            bVar.M();
            return;
        }
        reelData.g++;
        HlsMediaSource$Factory hlsMediaSource$Factory = new HlsMediaSource$Factory(new pt2(17, new aj0(2, (byte) 0)));
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListQ = ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        String str = reelDto.getPlayUrls().get(reelData.g);
        Uri uri = str == null ? null : Uri.parse(str);
        if (((Uri) bp4Var.e) != null && ((UUID) bp4Var.d) == null) {
            z = false;
        }
        vy2.s(z);
        if (uri != null) {
            fp4Var = new fp4(uri, "application/x-mpegURL", ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : null, null, list, null, immutableListQ, -9223372036854775807L);
        } else {
            fp4Var = null;
        }
        k03 k03VarE = hlsMediaSource$Factory.d(new jp4("", new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4.K, gp4Var));
        e62 e62Var = (e62) exoPlayer;
        e62Var.c1();
        List listSingletonList = Collections.singletonList(k03VarE);
        e62Var.c1();
        e62Var.c1();
        e62Var.U0(listSingletonList, -1, -9223372036854775807L, true);
        bVar.z();
    }

    @Override // defpackage.u80
    public final void A() {
        gb6 gb6VarJ = J();
        if (gb6VarJ != null) {
            gb6VarJ.a();
        }
        q07 q07Var = this.M;
        if (q07Var != null) {
            q07Var.K.setPlayer(null);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    @Override // defpackage.u80
    public final void B() {
        Handler handler;
        t07 t07Var = this.P;
        if (t07Var != null) {
            q07 q07Var = this.M;
            if (q07Var == null) {
                js3.V("binding");
                throw null;
            }
            q07Var.C.x.remove(t07Var);
        }
        this.P = null;
        q6 q6Var = this.U;
        if (q6Var != null && (handler = this.T) != null) {
            handler.removeCallbacks(q6Var);
        }
        this.U = null;
        this.T = null;
        p80 p80Var = this.N;
        if (p80Var != null) {
            q07 q07Var2 = this.M;
            if (q07Var2 == null) {
                js3.V("binding");
                throw null;
            }
            q07Var2.y.j.remove(p80Var);
        }
        this.N = null;
        K();
        y();
        q07 q07Var3 = this.M;
        if (q07Var3 == null) {
            js3.V("binding");
            throw null;
        }
        q07Var3.O.setAlpha(1.0f);
        gb6 gb6VarJ = J();
        if (gb6VarJ != null) {
            gb6VarJ.x(0L);
        }
        AnimatorSet animatorSet = this.X;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        this.X = null;
        ValueAnimator valueAnimator = this.L;
        if (valueAnimator != null) {
            valueAnimator.removeAllUpdateListeners();
            valueAnimator.cancel();
        }
        this.L = null;
        this.R = null;
        this.V = null;
        this.S = null;
        ViewPropertyAnimator viewPropertyAnimator = this.W;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
        this.W = null;
    }

    @Override // defpackage.u80
    public final void C() {
        gb6 gb6VarJ = J();
        if (gb6VarJ != null) {
            gb6VarJ.x(0L);
            gb6VarJ.K();
        }
    }

    public final void G(bs1 bs1Var) {
        Integer numValueOf = bs1Var != null ? Integer.valueOf(((es1) bs1Var).f) : null;
        if (numValueOf != null && numValueOf.intValue() == 120) {
            q07 q07Var = this.M;
            if (q07Var != null) {
                q07Var.B.setImageResource(yq6.ic_download_start);
                return;
            } else {
                js3.V("binding");
                throw null;
            }
        }
        if (numValueOf != null && numValueOf.intValue() == 140) {
            q07 q07Var2 = this.M;
            if (q07Var2 == null) {
                js3.V("binding");
                throw null;
            }
            q07Var2.B.setImageResource(yq6.ic_download_finished);
            View view = this.a;
            hh2.H(new hh2(view.getContext(), view.getContext().getString(rs6.reels_downloaded_finished)));
            return;
        }
        boolean z = true;
        if (numValueOf != null && numValueOf.intValue() == 110) {
            q07 q07Var3 = this.M;
            if (q07Var3 == null) {
                js3.V("binding");
                throw null;
            }
            q07Var3.B.setImageResource(yq6.ic_download_cancel);
            q07 q07Var4 = this.M;
            if (q07Var4 == null) {
                js3.V("binding");
                throw null;
            }
            LoadingView loadingView = q07Var4.A;
            loadingView.setTrackColor(sj8.b().I.e);
            loadingView.setIndeterminate(true);
            return;
        }
        if (numValueOf == null || numValueOf.intValue() != 100) {
            if (numValueOf == null) {
                q07 q07Var5 = this.M;
                if (q07Var5 == null) {
                    js3.V("binding");
                    throw null;
                }
                q07Var5.B.setImageResource(yq6.ic_download_start);
                q07 q07Var6 = this.M;
                if (q07Var6 == null) {
                    js3.V("binding");
                    throw null;
                }
                LoadingView loadingView2 = q07Var6.A;
                loadingView2.setIndicatorColor(sj8.b().I.a);
                loadingView2.setTrackColor(sj8.b().I.a);
                loadingView2.setIndeterminate(false);
                return;
            }
            return;
        }
        q07 q07Var7 = this.M;
        if (q07Var7 == null) {
            js3.V("binding");
            throw null;
        }
        LoadingView loadingView3 = q07Var7.A;
        int i = ((es1) bs1Var).g;
        if (i != 101 && i != 102) {
            z = false;
        }
        loadingView3.setIndeterminate(z);
        q07 q07Var8 = this.M;
        if (q07Var8 == null) {
            js3.V("binding");
            throw null;
        }
        q07Var8.A.setTrackColor(sj8.b().I.e);
        q07 q07Var9 = this.M;
        if (q07Var9 != null) {
            q07Var9.B.setImageResource(yq6.ic_download_cancel);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final p07 H(String str, Map map, boolean z) {
        js3.p(str, "reelId");
        js3.p(map, "params");
        gb6 gb6VarJ = J();
        long duration = (gb6VarJ != null ? gb6VarJ.getDuration() : 0L) / ((long) 1000);
        long jD0 = 0;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gb6 gb6VarJ2 = J();
        if (gb6VarJ2 != null) {
            jD0 = gb6VarJ2.d0();
        }
        return new p07(duration, jCurrentTimeMillis, jD0 / 1000, str, z, map);
    }

    public final ImageView I() {
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        View viewFindViewById = q07Var.y.findViewById(rr6.play);
        js3.o(viewFindViewById, "findViewById(...)");
        return (ImageView) viewFindViewById;
    }

    public final gb6 J() {
        q07 q07Var = this.M;
        if (q07Var != null) {
            return q07Var.K.getPlayer();
        }
        js3.V("binding");
        throw null;
    }

    public final void K() {
        ImageView imageViewI = I();
        gb6 gb6VarJ = J();
        imageViewI.setVisibility(!((gb6VarJ != null ? gb6VarJ.B() : null) instanceof ExoPlaybackException) ? 0 : 8);
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        q07Var.E.d(false);
        q07 q07Var2 = this.M;
        if (q07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        Group group = q07Var2.G;
        js3.o(group, "loadingGroup");
        group.setVisibility(8);
    }

    public final void L(boolean z) {
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        PlayerControlView playerControlView = q07Var.y;
        playerControlView.m();
        playerControlView.setAlpha(z ? 0.0f : 1.0f);
        playerControlView.animate().alpha(z ? 1.0f : 0.0f).setDuration(100L).withEndAction(new ep(2, playerControlView, z)).start();
        N(z);
    }

    public final void M() {
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = q07Var.N;
        js3.o(myketTextView, "retry");
        myketTextView.setVisibility(0);
        q07 q07Var2 = this.M;
        if (q07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        q07Var2.E.d(false);
        Group group = q07Var.G;
        js3.o(group, "loadingGroup");
        group.setVisibility(8);
        Group group2 = q07Var.O;
        js3.o(group2, "shimmer");
        group2.setVisibility(8);
        I().setVisibility(8);
    }

    public final void N(boolean z) {
        if (z) {
            q07 q07Var = this.M;
            if (q07Var == null) {
                js3.V("binding");
                throw null;
            }
            DefaultTimeBar defaultTimeBar = q07Var.C;
            defaultTimeBar.setPlayedColor(sj8.d(sj8.f).b.e.a);
            defaultTimeBar.c(100L);
            return;
        }
        q07 q07Var2 = this.M;
        if (q07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        DefaultTimeBar defaultTimeBar2 = q07Var2.C;
        defaultTimeBar2.setPlayedColor(sj8.d(sj8.f).I.g);
        ValueAnimator valueAnimator = defaultTimeBar2.E;
        if (valueAnimator.isStarted()) {
            valueAnimator.cancel();
        }
        valueAnimator.setFloatValues(defaultTimeBar2.F, 0.0f);
        valueAnimator.setDuration(100L);
        valueAnimator.start();
    }

    public final void O(ReelDto reelDto, boolean z) {
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = q07Var.D;
        int i = 8;
        if (z) {
            myketTextView.setText(reelDto.getLikeMsgAfter());
            String likeMsgAfter = reelDto.getLikeMsgAfter();
            if (likeMsgAfter != null && !f88.n0(likeMsgAfter)) {
                i = 0;
            }
            myketTextView.setVisibility(i);
            return;
        }
        myketTextView.setText(reelDto.getLikeMsgBefore());
        String likeMsgBefore = reelDto.getLikeMsgBefore();
        if (likeMsgBefore != null && !f88.n0(likeMsgBefore)) {
            i = 0;
        }
        myketTextView.setVisibility(i);
    }

    public final void P(boolean z) {
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        LottieAnimationView lottieAnimationView = q07Var.R;
        if (z) {
            lottieAnimationView.setAnimation(qs6.small_heart_like);
        } else {
            lottieAnimationView.setAnimation(qs6.small_heart_dislike);
        }
        lottieAnimationView.f();
    }

    @Override // defpackage.qg5
    public final void s(MyketRecyclerData myketRecyclerData) {
        ReelData reelData = (ReelData) myketRecyclerData;
        js3.p(reelData, "data");
        gb6 gb6VarJ = J();
        ExoPlayer exoPlayer = gb6VarJ instanceof ExoPlayer ? (ExoPlayer) gb6VarJ : null;
        eb6 wp4Var = this.O;
        if (wp4Var == null) {
            wp4Var = new wp4(exoPlayer, this, reelData, 1);
        }
        this.O = wp4Var;
        if (exoPlayer != null) {
            ((e62) exoPlayer).m.a(wp4Var);
        }
        ce ig5Var = this.Q;
        if (ig5Var == null) {
            ig5Var = new ig5(this, 1);
        }
        this.Q = ig5Var;
        gb6 gb6VarJ2 = J();
        js3.n(gb6VarJ2, "null cannot be cast to non-null type androidx.media3.exoplayer.ExoPlayer");
        ((e62) ((ExoPlayer) gb6VarJ2)).u0(ig5Var);
        gb6 gb6VarJ3 = J();
        if (gb6VarJ3 != null) {
            gb6VarJ3.c();
        }
        L(false);
        View view = this.a;
        js3.o(view, "itemView");
        bt2.G(cc7.q(view), null, null, new ReelViewHolder$onAttach$1(null, reelData, this), 3);
        bt2.G(cc7.q(view), null, null, new ReelViewHolder$onAttach$2(null, reelData, this), 3);
        bt2.G(cc7.q(view), null, null, new ReelViewHolder$onAttach$3(null, reelData, this), 3);
        bt2.G(cc7.q(view), null, null, new ReelViewHolder$onAttach$4(null, reelData, this), 3);
    }

    @Override // defpackage.qg5
    public final void t(MyketRecyclerData myketRecyclerData) {
        Drawable drawable;
        ReelData reelData = (ReelData) myketRecyclerData;
        js3.p(reelData, "data");
        ReelDto reelDto = reelData.b;
        View view = this.a;
        Context context = view.getContext();
        reelData.g = 0;
        q07 q07Var = this.M;
        if (q07Var == null) {
            js3.V("binding");
            throw null;
        }
        DefaultTimeBar defaultTimeBar = q07Var.C;
        defaultTimeBar.setUnplayedColor(sj8.d(sj8.f).I.d);
        defaultTimeBar.setBufferedColor(sj8.d(sj8.f).N);
        defaultTimeBar.setPlayedColor(sj8.d(sj8.f).I.g);
        defaultTimeBar.setScrubberColor(sj8.d(sj8.f).b.e.a);
        q07 q07Var2 = this.M;
        if (q07Var2 == null) {
            js3.V("binding");
            throw null;
        }
        w17 w17Var = q07Var2.Q;
        View view2 = w17Var.v;
        Context context2 = view.getContext();
        js3.o(context2, "getContext(...)");
        ea7 ea7Var = new ea7(context2);
        ea7Var.b = sj8.b().b.e.g;
        ea7Var.c(view.getResources().getDimensionPixelSize(pq6.reel_avatar_size) / 2);
        ea7Var.h = 0;
        view2.setBackground(ea7Var.a());
        Context context3 = view.getContext();
        js3.o(context3, "getContext(...)");
        ea7 ea7Var2 = new ea7(context3);
        ea7Var2.b = sj8.b().b.e.g;
        ea7Var2.c(view.getResources().getDimensionPixelSize(pq6.space_4));
        ea7Var2.h = 0;
        StateListDrawable stateListDrawableA = ea7Var2.a();
        w17Var.y.setBackground(stateListDrawableA);
        w17Var.w.setBackground(stateListDrawableA);
        w17Var.x.setBackground(stateListDrawableA);
        q07 q07Var3 = this.M;
        if (q07Var3 == null) {
            js3.V("binding");
            throw null;
        }
        View view3 = q07Var3.F;
        Context context4 = view.getContext();
        js3.o(context4, "getContext(...)");
        ea7 ea7Var3 = new ea7(context4);
        ea7Var3.b = sj8.b().J.f;
        ea7Var3.c(view.getResources().getDimensionPixelSize(pq6.space_20));
        ea7Var3.h = view.getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var3.i = sj8.b().I.d;
        view3.setBackground(ea7Var3.a());
        q07 q07Var4 = this.M;
        if (q07Var4 == null) {
            js3.V("binding");
            throw null;
        }
        q07Var4.E.setIndicatorColor(sj8.c(sj8.f).j);
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(pq6.default_icon_size);
        Resources resources = view.getResources();
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
        q07 q07Var5 = this.M;
        if (q07Var5 == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = q07Var5.N;
        Context context5 = view.getContext();
        js3.o(context5, "getContext(...)");
        ea7 ea7Var4 = new ea7(context5);
        ea7Var4.b = sj8.b().J.f;
        ea7Var4.c(view.getResources().getDimensionPixelSize(pq6.space_20));
        ea7Var4.h = view.getResources().getDimensionPixelSize(pq6.border_size);
        ea7Var4.i = sj8.b().I.d;
        myketTextView.setBackground(ea7Var4.a());
        myketTextView.setCompoundDrawablesRelative(null, null, drawableMutate, null);
        myketTextView.setOnClickListener(new w50(myketTextView, this, 11));
        q07 q07Var6 = this.M;
        if (q07Var6 == null) {
            js3.V("binding");
            throw null;
        }
        GestureDetector gestureDetector = new GestureDetector(q07Var6.K.getContext(), new u07(this, reelData));
        q07 q07Var7 = this.M;
        if (q07Var7 == null) {
            js3.V("binding");
            throw null;
        }
        int i2 = 4;
        q07Var7.K.setOnTouchListener(new jx1(i2, gestureDetector));
        ImageView imageViewI = I();
        Context context6 = imageViewI.getContext();
        js3.o(context6, "getContext(...)");
        ea7 ea7Var5 = new ea7(context6);
        ea7Var5.h = 0;
        ea7Var5.p = sj8.c(sj8.f).O.c;
        ea7Var5.c(pq6.reel_play_controller_size / 2);
        ea7Var5.b = sj8.b().J.f;
        imageViewI.setBackground(ea7Var5.a());
        imageViewI.setOnClickListener(new tf5(this, imageViewI, reelData, i2));
        q07 q07Var8 = this.M;
        if (q07Var8 == null) {
            js3.V("binding");
            throw null;
        }
        Group group = q07Var8.M;
        ProfileDto profile = reelDto.getProfile();
        String nickName = profile != null ? profile.getNickName() : null;
        if (nickName == null || f88.n0(nickName)) {
            js3.o(group, "profileGroup");
            group.setVisibility(8);
        } else {
            js3.o(group, "profileGroup");
            group.setVisibility(0);
            AvatarImageView avatarImageView = q07Var8.L;
            avatarImageView.setSize(view.getResources().getDimensionPixelSize(pq6.reel_avatar_size));
            AvatarImageView.setImage$default(avatarImageView, reelDto.getProfile().getAvatarUrl(), reelDto.getProfile().getNickName(), null, null, 12, null);
            q07Var8.J.setText(reelDto.getProfile().getNickName());
        }
        q07 q07Var9 = this.M;
        if (q07Var9 == null) {
            js3.V("binding");
            throw null;
        }
        LoadingView loadingView = q07Var9.A;
        loadingView.setMax(10000);
        loadingView.setTrackThickness(view.getResources().getDimensionPixelSize(pq6.reel_loading_indicator_thickness));
        loadingView.setIndicatorSize(view.getResources().getDimensionPixelSize(pq6.reel_download_icon_size));
        if (this.I == null) {
            js3.V("storageUtils");
            throw null;
        }
        if (k68.r(reelDto.getReelId())) {
            q07Var9.B.setImageResource(yq6.ic_download_finished);
            loadingView.setVisibility(4);
        } else {
            G(null);
        }
        q07 q07Var10 = this.M;
        if (q07Var10 == null) {
            js3.V("binding");
            throw null;
        }
        PlayerView playerView = q07Var10.K;
        MyketTextView myketTextView2 = q07Var10.z;
        js3.o(myketTextView2, PackageListMetaDataDTO.KEY_DESCRIPTION);
        MyketTextView.setTextFromHtml$default(myketTextView2, reelDto.getDescription(), 2, null, null, false, 28, null);
        q07Var10.D.setText(reelDto.getLikeMsgBefore());
        P(reelDto.isLiked());
        O(reelDto, reelDto.isLiked());
        playerView.setKeepScreenOn(true);
        js3.m(context);
        e62 e62VarX = x(context, reelDto.getPlayUrls());
        playerView.setPlayer(e62VarX);
        q07Var10.y.setPlayer(e62VarX);
        MyketTextView myketTextView3 = q07Var10.J;
        js3.o(myketTextView3, "nickname");
        og5 og5Var = this.A;
        qg5.v(myketTextView3, og5Var, this, reelData);
        AvatarImageView avatarImageView2 = q07Var10.L;
        js3.o(avatarImageView2, "profile");
        qg5.v(avatarImageView2, og5Var, this, reelData);
        LottieAnimationView lottieAnimationView = q07Var10.R;
        js3.o(lottieAnimationView, "smallLike");
        qg5.v(lottieAnimationView, this.B, this, reelData);
        LottieAnimationView lottieAnimationView2 = q07Var10.I;
        js3.o(lottieAnimationView2, "mute");
        qg5.v(lottieAnimationView2, this.A0, this, Boolean.FALSE);
        ImageView imageView = q07Var10.B;
        js3.o(imageView, "downloadIcon");
        qg5.v(imageView, this.H, this, reelData);
    }

    @Override // defpackage.qg5
    public final void u(MyketRecyclerData myketRecyclerData) {
        gb6 gb6VarJ;
        js3.p((ReelData) myketRecyclerData, "data");
        eb6 eb6Var = this.O;
        if (eb6Var != null && (gb6VarJ = J()) != null) {
            gb6VarJ.O(eb6Var);
        }
        this.O = null;
        ce ceVar = this.Q;
        if (ceVar != null) {
            gb6 gb6VarJ2 = J();
            ExoPlayer exoPlayer = gb6VarJ2 instanceof ExoPlayer ? (ExoPlayer) gb6VarJ2 : null;
            if (exoPlayer != null) {
                e62 e62Var = (e62) exoPlayer;
                e62Var.c1();
                e62Var.s.f.e(ceVar);
            }
        }
        this.Q = null;
        this.z0 = true;
        B();
        gb6 gb6VarJ3 = J();
        if (gb6VarJ3 != null) {
            gb6VarJ3.stop();
        }
    }

    @Override // defpackage.qg5
    public final void w(a79 a79Var) {
        if (a79Var instanceof q07) {
            this.M = (q07) a79Var;
        } else {
            lw.g(null, "Incompatible view binding", null);
        }
    }

    @Override // defpackage.u80
    public final void y() {
        gb6 gb6VarJ = J();
        if (gb6VarJ != null) {
            gb6VarJ.b();
        }
    }

    @Override // defpackage.u80
    public final void z() {
        gb6 gb6VarJ = J();
        if (gb6VarJ != null) {
            gb6VarJ.c();
            gb6VarJ.K();
        }
    }
}
