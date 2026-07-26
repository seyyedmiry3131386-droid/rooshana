package ir.mservices.market.version2.fragments;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.DataBinderMapperImpl;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.ui.DefaultTimeBar;
import androidx.media3.ui.PlayerControlView;
import com.google.common.collect.ImmutableList;
import defpackage.ah3;
import defpackage.aj0;
import defpackage.ap4;
import defpackage.bh3;
import defpackage.bi5;
import defpackage.bp2;
import defpackage.bp4;
import defpackage.c24;
import defpackage.cd;
import defpackage.ch3;
import defpackage.cp4;
import defpackage.dh3;
import defpackage.dp4;
import defpackage.e62;
import defpackage.eh3;
import defpackage.ep4;
import defpackage.fa1;
import defpackage.fh3;
import defpackage.fp4;
import defpackage.g27;
import defpackage.gb6;
import defpackage.gp4;
import defpackage.hh2;
import defpackage.ig1;
import defpackage.j29;
import defpackage.j71;
import defpackage.jp4;
import defpackage.js3;
import defpackage.js6;
import defpackage.jx2;
import defpackage.k6;
import defpackage.ld6;
import defpackage.lw;
import defpackage.n52;
import defpackage.o79;
import defpackage.p3;
import defpackage.p80;
import defpackage.pq6;
import defpackage.q40;
import defpackage.q79;
import defpackage.qg1;
import defpackage.ql0;
import defpackage.qp4;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.sj8;
import defpackage.sv0;
import defpackage.tg1;
import defpackage.vi0;
import defpackage.vy2;
import defpackage.w90;
import defpackage.wv8;
import defpackage.x79;
import defpackage.xg3;
import defpackage.yo4;
import defpackage.yq2;
import defpackage.yq6;
import defpackage.zg3;
import ir.mservices.market.movie.ui.ibex.IbexAction;
import ir.mservices.market.movie.ui.ibex.IbexViewModel;
import ir.mservices.market.movie.ui.player.BaseMovieAction;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.player.IbexController;
import ir.mservices.market.version2.manager.player.doubleTap.DoubleTapPlayerView;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.PlayerOverlay;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.SecondsView;
import ir.mservices.market.version2.services.c;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import ir.myket.core.utils.GraphicUtils$Dimension;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes3.dex */
public class IbexFragment extends Hilt_IbexFragment {
    public static final /* synthetic */ int r1 = 0;
    public c e1;
    public d f1;
    public fh3 i1;
    public IbexController j1;
    public e62 l1;
    public final aj0 m1;
    public final zg3 n1;
    public boolean o1;
    public final o79 p1;
    public boolean q1;
    public final Object g1 = kotlin.a.b(LazyThreadSafetyMode.a, new dh3(this, 0));
    public final bi5 h1 = new bi5(g27.a(eh3.class), new dh3(this, 1));
    public String k1 = "APP";

    public IbexFragment() {
        aj0 aj0Var = new aj0(2, (byte) 0);
        aj0Var.e = j29.K(ApplicationLauncher.o.getApplicationContext(), "");
        this.m1 = aj0Var;
        this.n1 = new zg3(this, 0);
        final IbexFragment$special$$inlined$viewModels$default$1 ibexFragment$special$$inlined$viewModels$default$1 = new IbexFragment$special$$inlined$viewModels$default$1(this);
        final c24 c24VarB = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: ir.mservices.market.version2.fragments.IbexFragment$special$$inlined$viewModels$default$2
            {
                super(0);
            }

            @Override // defpackage.bp2
            public final Object invoke() {
                return (x79) ibexFragment$special$$inlined$viewModels$default$1.invoke();
            }
        });
        this.p1 = new o79(g27.a(IbexViewModel.class), new bp2() { // from class: ir.mservices.market.version2.fragments.IbexFragment$special$$inlined$viewModels$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
            @Override // defpackage.bp2
            public final Object invoke() {
                return ((x79) c24VarB.getValue()).m();
            }
        }, new bp2() { // from class: ir.mservices.market.version2.fragments.IbexFragment$special$$inlined$viewModels$default$5
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
        }, new bp2() { // from class: ir.mservices.market.version2.fragments.IbexFragment$special$$inlined$viewModels$default$4
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
        String strL = L(rs6.page_name_ibex);
        js3.o(strL, "getString(...)");
        return strL;
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void T(Bundle bundle) {
        super.T(bundle);
        x1();
        new bh3(this, F()).enable();
    }

    @Override // ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void X(Bundle bundle) {
        super.X(bundle);
        this.k1 = ((eh3) this.h1.getValue()).e;
    }

    @Override // defpackage.z49
    public final void a(boolean z) {
        e62 e62Var = this.l1;
        if (e62Var == null) {
            js3.V("exoPlayer");
            throw null;
        }
        e62Var.C(z);
        e62 e62Var2 = this.l1;
        if (e62Var2 != null) {
            e62Var2.e();
        } else {
            js3.V("exoPlayer");
            throw null;
        }
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment, ir.mservices.market.version2.fragments.base.BaseFragment, androidx.fragment.app.d
    public final void b0() throws Exception {
        e62 e62Var = this.l1;
        if (e62Var == null) {
            js3.V("exoPlayer");
            throw null;
        }
        e62Var.a();
        fh3 fh3Var = this.i1;
        js3.m(fh3Var);
        SecondsView secondsView = fh3Var.y.r;
        secondsView.D = null;
        secondsView.E = null;
        secondsView.F = null;
        secondsView.G = null;
        secondsView.H = null;
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        PlayerControlView playerControlView = fh3Var2.v;
        js3.o(playerControlView, "controller");
        ld6 ld6Var = this.V0;
        if (ld6Var != null) {
            playerControlView.j.remove(ld6Var);
        }
        this.V0 = null;
        m1().a = null;
        this.i1 = null;
        super.b0();
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment
    public final yq2 e1() {
        this.q1 = true;
        a(false);
        return q40.g;
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment, defpackage.z49
    public final void f() {
        super.f();
        this.o1 = true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, z49] */
    @Override // ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public final void f0() {
        IbexController ibexControllerS1 = s1();
        ibexControllerS1.b = false;
        ?? r2 = ibexControllerS1.a;
        if (r2 != 0) {
            r2.a(false);
        }
        ibexControllerS1.l(ibexControllerS1.b);
        super.f0();
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment, ir.mservices.market.common.base.BaseContentFragment, androidx.fragment.app.d
    public void k0(View view, Bundle bundle) {
        js3.p(view, "view");
        super.k0(view, bundle);
        int i = K().getConfiguration().orientation;
        BaseMovieViewModel baseMovieViewModel = (BaseMovieViewModel) this.Z0.getValue();
        BaseMovieAction.ScreenOrientationChangeAction screenOrientationChangeAction = new BaseMovieAction.ScreenOrientationChangeAction(i);
        int i2 = 1;
        int i3 = 0;
        baseMovieViewModel.r(screenOrientationChangeAction);
        Context context = view.getContext();
        js3.o(context, "getContext(...)");
        q1(false);
        p1(true);
        n52 n52Var = new n52(context);
        qg1 qg1Var = new qg1(context);
        qg1Var.c = true;
        n52Var.c(qg1Var);
        n52Var.b(new ig1(this.n1));
        e62 e62VarA = n52Var.a();
        this.l1 = e62VarA;
        e62VarA.m.a(new ch3(i3, this));
        fh3 fh3Var = this.i1;
        js3.m(fh3Var);
        fh3Var.z.setControllerShowTimeoutMs(-1);
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        DoubleTapPlayerView doubleTapPlayerView = fh3Var2.z;
        e62 e62Var = this.l1;
        if (e62Var == null) {
            js3.V("exoPlayer");
            throw null;
        }
        doubleTapPlayerView.setPlayer(e62Var);
        fh3 fh3Var3 = this.i1;
        js3.m(fh3Var3);
        PlayerOverlay playerOverlay = fh3Var3.y;
        e62 e62Var2 = this.l1;
        if (e62Var2 == null) {
            js3.V("exoPlayer");
            throw null;
        }
        playerOverlay.getClass();
        playerOverlay.v = e62Var2;
        fh3 fh3Var4 = this.i1;
        js3.m(fh3Var4);
        PlayerOverlay playerOverlay2 = fh3Var4.y;
        js3.o(playerOverlay2, "playerOverlay");
        if (this.F0.e()) {
            playerOverlay2.setLayoutDirection(1);
        }
        fh3 fh3Var5 = this.i1;
        js3.m(fh3Var5);
        PlayerControlView playerControlView = fh3Var5.v;
        js3.o(playerControlView, "controller");
        ld6 p80Var = this.V0;
        if (p80Var == null) {
            p80Var = new p80(i3, this);
        }
        this.V0 = p80Var;
        playerControlView.j.add(p80Var);
        fh3 fh3Var6 = this.i1;
        js3.m(fh3Var6);
        fh3Var6.z.requestFocus();
        fh3 fh3Var7 = this.i1;
        js3.m(fh3Var7);
        fh3Var7.z.setKeepScreenOn(true);
        fh3 fh3Var8 = this.i1;
        js3.m(fh3Var8);
        fh3Var8.z.setControllerShowTimeoutMs(3000);
        x1();
        fh3 fh3Var9 = this.i1;
        js3.m(fh3Var9);
        DoubleTapPlayerView doubleTapPlayerView2 = fh3Var9.z;
        js3.o(doubleTapPlayerView2, "playerView");
        fh3 fh3Var10 = this.i1;
        js3.m(fh3Var10);
        PlayerOverlay playerOverlay3 = fh3Var10.y;
        js3.o(playerOverlay3, "playerOverlay");
        playerOverlay3.w = new wv8(doubleTapPlayerView2, this, playerOverlay3, 7);
        doubleTapPlayerView2.setDoubleTapDelay(800L);
        fh3 fh3Var11 = this.i1;
        js3.m(fh3Var11);
        PlayerControlView playerControlView2 = fh3Var11.v;
        e62 e62Var3 = this.l1;
        if (e62Var3 == null) {
            js3.V("exoPlayer");
            throw null;
        }
        playerControlView2.setPlayer(e62Var3);
        fh3 fh3Var12 = this.i1;
        js3.m(fh3Var12);
        fh3Var12.z.setOnClickListener(new ah3(this, i3));
        fh3 fh3Var13 = this.i1;
        js3.m(fh3Var13);
        fh3Var13.w.setOnClickListener(new ah3(this, i2));
        fh3 fh3Var14 = this.i1;
        js3.m(fh3Var14);
        ConstraintLayout constraintLayout = fh3Var14.x;
        js3.o(constraintLayout, "layout");
        fh3 fh3Var15 = this.i1;
        js3.m(fh3Var15);
        DoubleTapPlayerView doubleTapPlayerView3 = fh3Var15.z;
        js3.o(doubleTapPlayerView3, "playerView");
        constraintLayout.setOnClickListener(new cd(4, doubleTapPlayerView3));
        bi5 bi5Var = this.h1;
        String str = ((eh3) bi5Var.getValue()).b;
        String str2 = ((eh3) bi5Var.getValue()).d;
        String str3 = ((eh3) bi5Var.getValue()).c;
        if (str != null && str.length() != 0) {
            s1().t(false);
            c cVar = this.e1;
            if (cVar != null) {
                cVar.l(str, this, new zg3(this, 2), new zg3(this, 3));
                return;
            } else {
                js3.V("appService");
                throw null;
            }
        }
        if (str2 != null && str2.length() != 0) {
            v1(str2, "");
        } else if (str3 != null && str3.length() != 0) {
            w1(str3, "");
        } else {
            lw.g(null, "AppVideoPlayerFragment all arguments for playing video are empty!!", null);
            t1();
        }
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment
    public final View k1(LayoutInflater layoutInflater) {
        int iB;
        int i;
        int i2 = fh3.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        fh3 fh3Var = (fh3) fa1.c(layoutInflater, js6.ibex_fragment, null, false);
        this.i1 = fh3Var;
        js3.m(fh3Var);
        xg3 xg3Var = (xg3) fa1.a(fh3Var.l.findViewById(rr6.controller_layout));
        if (xg3Var != null) {
            Context context = xg3Var.l.getContext();
            js3.o(context, "getContext(...)");
            this.j1 = new IbexController(this, xg3Var, context);
            s1().a = this;
            this.X0 = s1();
            q1(false);
        }
        IbexController ibexControllerS1 = s1();
        String str = this.k1;
        xg3 xg3Var2 = ibexControllerS1.d;
        ThemeData themeData = ibexControllerS1.h;
        js3.p(str, "videoType");
        if (str.equals("APP")) {
            iB = sv0.b(0.5f, themeData.c, themeData.I.a);
            i = themeData.c;
        } else if (str.equals("MOVIE")) {
            iB = sv0.b(0.5f, themeData.j, themeData.I.a);
            i = themeData.j;
        } else {
            iB = -1;
            i = -1;
        }
        DefaultTimeBar defaultTimeBar = xg3Var2.x;
        defaultTimeBar.setBufferedColor(iB);
        defaultTimeBar.setPlayedColor(i);
        defaultTimeBar.setScrubberColor(i);
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        View view = fh3Var2.l;
        js3.o(view, "getRoot(...)");
        return view;
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment
    public final int l1() {
        return js3.i(this.k1, "MOVIE") ? sj8.c(sj8.f).j : sj8.c(sj8.f).c;
    }

    @Override // ir.mservices.market.version2.fragments.BasePlayerVideoFragment
    public final void o1() {
        super.o1();
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        w90Var.E.setOnClickListener(new ah3(this, 2));
    }

    @Override // androidx.fragment.app.d, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        js3.p(configuration, "newConfig");
        this.H = true;
        if (!this.q1) {
            x1();
            fh3 fh3Var = this.i1;
            js3.m(fh3Var);
            fh3Var.z.requestLayout();
            xg3 xg3Var = s1().d;
            boolean z = ((Number) ((BaseMovieViewModel) this.Z0.getValue()).w.a.getValue()).intValue() == 1;
            xg3Var.z.setVisibility(0);
            xg3Var.z.setImageResource(z ? yq6.ic_fullscreen : yq6.ic_fullscreen_exit);
        }
        this.q1 = false;
    }

    public final IbexController s1() {
        IbexController ibexController = this.j1;
        if (ibexController != null) {
            return ibexController;
        }
        js3.V("ibexController");
        throw null;
    }

    public final void t1() {
        Context contextH = H();
        hh2 hh2Var = new hh2(contextH, contextH != null ? contextH.getString(rs6.video_not_found) : null);
        hh2Var.G();
        hh2.H(hh2Var);
        FragmentActivity fragmentActivityF = F();
        if (fragmentActivityF != null) {
            fragmentActivityF.finish();
        }
    }

    /* JADX WARN: Type inference failed for: r10v9, types: [c24, java.lang.Object] */
    public void u1(int i, boolean z) {
        k6 k6VarM1 = m1();
        if (i == 3) {
            k6VarM1.t(true);
            k6VarM1.v(true);
        } else {
            k6VarM1.v(false);
        }
        if (i == 1) {
            n1(true);
        } else if (i == 2) {
            p1(true);
            n1(true);
        } else if (i != 3) {
            n1(false);
        } else {
            e62 e62Var = this.l1;
            if (e62Var == null) {
                js3.V("exoPlayer");
                throw null;
            }
            n1(e62Var.H());
            p1(false);
        }
        if (i == 3) {
            o79 o79Var = this.p1;
            Object value = ((IbexViewModel) o79Var.getValue()).y.a.getValue();
            if (((Number) value).longValue() == -1) {
                value = null;
            }
            Long l = (Long) value;
            if (l != null) {
                long jLongValue = l.longValue();
                e62 e62Var2 = this.l1;
                if (e62Var2 == null) {
                    js3.V("exoPlayer");
                    throw null;
                }
                e62Var2.q0(5, jLongValue);
                ((IbexViewModel) o79Var.getValue()).r(IbexAction.ResetVideoDurationAction.INSTANCE);
            }
            String str = ((eh3) this.h1.getValue()).a;
            if (str == null || str.length() == 0 || ((Boolean) ((IbexViewModel) o79Var.getValue()).w.a.getValue()).booleanValue()) {
                return;
            }
            ((IbexViewModel) o79Var.getValue()).r(IbexAction.CallbackCalledAction.INSTANCE);
            try {
                Uri uri = Uri.parse(str);
                String str2 = "6PR%+sUJH6ShBt&a*R!jcA^k52_" + uri.getQueryParameter("guid");
                js3.p(str2, ConfirmDTO.INPUT_TYPE_TEXT);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                Charset charsetForName = Charset.forName("iso-8859-1");
                js3.o(charsetForName, "forName(...)");
                byte[] bytes = str2.getBytes(charsetForName);
                js3.o(bytes, "getBytes(...)");
                messageDigest.update(bytes, 0, str2.length());
                byte[] bArrDigest = messageDigest.digest();
                js3.o(bArrDigest, "digest(...)");
                Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("sec", vi0.a(bArrDigest, false));
                ir.myket.callback.manager.a aVar = (ir.myket.callback.manager.a) this.g1.getValue();
                String string = builderAppendQueryParameter.toString();
                js3.o(string, "toString(...)");
                aVar.b(new ql0(string, CallbackUrlType.b, 0));
            } catch (Exception e) {
                lw.g(e, "start video callback failed", str);
            }
        }
    }

    public final void v1(String str, String str2) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.a = "";
        d dVar = this.f1;
        if (dVar != null) {
            dVar.g(str, this, new tg1(this, ref$ObjectRef, str2, 4), new zg3(this, 1));
        } else {
            js3.V("generalService");
            throw null;
        }
    }

    public final void w1(String str, String str2) {
        fp4 fp4Var;
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        w90Var.F.setText(str2);
        e62 e62Var = this.l1;
        if (e62Var == null) {
            js3.V("exoPlayer");
            throw null;
        }
        e62Var.i0();
        yo4 yo4Var = new yo4();
        bp4 bp4Var = new bp4();
        List list = Collections.EMPTY_LIST;
        ImmutableList immutableListQ = ImmutableList.q();
        dp4 dp4Var = new dp4();
        gp4 gp4Var = gp4.d;
        Uri uri = str == null ? null : Uri.parse(str);
        vy2.s(((Uri) bp4Var.e) == null || ((UUID) bp4Var.d) != null);
        if (uri != null) {
            fp4Var = new fp4(uri, null, ((UUID) bp4Var.d) != null ? new cp4(bp4Var) : null, null, list, null, immutableListQ, -9223372036854775807L);
        } else {
            fp4Var = null;
        }
        jp4 jp4Var = new jp4("", new ap4(yo4Var), fp4Var, new ep4(dp4Var), qp4.K, gp4Var);
        fh3 fh3Var = this.i1;
        js3.m(fh3Var);
        gb6 player = fh3Var.z.getPlayer();
        if (player != null) {
            player.J(jp4Var);
            player.c();
            player.C(true);
        }
        s1().t(true);
    }

    public final void x1() {
        w90 w90Var = this.Y0;
        js3.m(w90Var);
        ViewGroup.LayoutParams layoutParams = w90Var.x.getLayoutParams();
        js3.n(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) layoutParams;
        o79 o79Var = this.Z0;
        if (((Number) ((BaseMovieViewModel) o79Var.getValue()).w.a.getValue()).intValue() == 1) {
            layoutParams2.e = 0;
            layoutParams2.h = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = 0;
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = 0;
            w90 w90Var2 = this.Y0;
            js3.m(w90Var2);
            w90Var2.x.setVisibility(0);
            w90 w90Var3 = this.Y0;
            js3.m(w90Var3);
            w90Var3.G.setVisibility(0);
        } else {
            if (this.F0.f()) {
                layoutParams2.e = rr6.guideline;
                layoutParams2.h = 0;
            } else {
                layoutParams2.e = 0;
                layoutParams2.h = rr6.guideline;
            }
            int dimensionPixelSize = K().getDimensionPixelSize(pq6.margin_default_v2);
            ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = dimensionPixelSize;
            ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin = dimensionPixelSize;
            w90 w90Var4 = this.Y0;
            js3.m(w90Var4);
            w90Var4.x.setVisibility(8);
            w90 w90Var5 = this.Y0;
            js3.m(w90Var5);
            w90Var5.G.setVisibility(8);
        }
        if (((Number) ((BaseMovieViewModel) o79Var.getValue()).w.a.getValue()).intValue() != 1) {
            fh3 fh3Var = this.i1;
            js3.m(fh3Var);
            ViewGroup.LayoutParams layoutParams3 = fh3Var.z.getLayoutParams();
            if (layoutParams3 != null) {
                layoutParams3.height = -1;
                return;
            }
            return;
        }
        GraphicUtils$Dimension graphicUtils$DimensionG = p3.g(F());
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        ViewGroup.LayoutParams layoutParams4 = fh3Var2.z.getLayoutParams();
        if (layoutParams4 != null) {
            layoutParams4.height = (int) (graphicUtils$DimensionG.a * 0.5625f);
        }
    }

    public final void y1(boolean z) {
        AlphaAnimation alphaAnimation;
        fh3 fh3Var = this.i1;
        js3.m(fh3Var);
        fh3Var.z.setUseController(false);
        e62 e62Var = this.l1;
        if (e62Var == null) {
            js3.V("exoPlayer");
            throw null;
        }
        boolean zH = e62Var.H();
        fh3 fh3Var2 = this.i1;
        js3.m(fh3Var2);
        fh3Var2.v.setShowTimeoutMs(zH ? 3000 : -1);
        fh3 fh3Var3 = this.i1;
        js3.m(fh3Var3);
        fh3Var3.z.setControllerShowTimeoutMs(zH ? 3000 : -1);
        if (z) {
            fh3 fh3Var4 = this.i1;
            js3.m(fh3Var4);
            fh3Var4.v.m();
            alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        } else {
            fh3 fh3Var5 = this.i1;
            js3.m(fh3Var5);
            fh3Var5.v.g();
            alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        }
        alphaAnimation.setInterpolator(new DecelerateInterpolator());
        alphaAnimation.setDuration(500L);
        AnimationSet animationSet = new AnimationSet(false);
        animationSet.addAnimation(alphaAnimation);
        fh3 fh3Var6 = this.i1;
        js3.m(fh3Var6);
        fh3Var6.v.setAnimation(animationSet);
    }
}
