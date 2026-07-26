package ir.mservices.market.views;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.databinding.DataBinderMapperImpl;
import androidx.media3.ui.DefaultTimeBar;
import com.google.common.collect.ImmutableList;
import defpackage.ap4;
import defpackage.at2;
import defpackage.b77;
import defpackage.bp2;
import defpackage.bp4;
import defpackage.cd;
import defpackage.ch3;
import defpackage.cp4;
import defpackage.d04;
import defpackage.dp4;
import defpackage.e62;
import defpackage.ep4;
import defpackage.fa1;
import defpackage.fp4;
import defpackage.gb6;
import defpackage.gg5;
import defpackage.gp4;
import defpackage.hg5;
import defpackage.hh2;
import defpackage.hs5;
import defpackage.ig1;
import defpackage.ig5;
import defpackage.j29;
import defpackage.jg5;
import defpackage.jp4;
import defpackage.js3;
import defpackage.js6;
import defpackage.kg5;
import defpackage.lw;
import defpackage.mz3;
import defpackage.n52;
import defpackage.ob4;
import defpackage.pa2;
import defpackage.pz3;
import defpackage.q39;
import defpackage.qg1;
import defpackage.ql0;
import defpackage.qp4;
import defpackage.qs3;
import defpackage.rr6;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.sv0;
import defpackage.t7;
import defpackage.vi0;
import defpackage.vy2;
import defpackage.w50;
import defpackage.x57;
import defpackage.y97;
import defpackage.yo4;
import defpackage.yq6;
import defpackage.z49;
import defpackage.z59;
import ir.mservices.market.movie.ui.detail.recycler.MovieTrailerData;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.ThemeData;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.activity.IbexActivity;
import ir.mservices.market.version2.manager.player.VideoViewController;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import kotlin.LazyThreadSafetyMode;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketVideoView extends Hilt_MyketVideoView implements z49, pz3 {
    public static final /* synthetic */ int C = 0;
    public bp2 A;
    public Drawable B;
    public d j;
    public x57 k;
    public d04 l;
    public final Object m;
    public final Object n;
    public final kg5 o;
    public VideoViewController p;
    public e62 q;
    public String r;
    public String s;
    public hg5 t;
    public String u;
    public String v;
    public ThemeData w;
    public MovieTrailerData x;
    public boolean y;
    public t7 z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketVideoView(Context context) {
        this(context, null, 6, 0);
        js3.p(context, "context");
    }

    public static void d(MyketVideoView myketVideoView, Context context) {
        if (myketVideoView.q == null) {
            if (!s7.G(context)) {
                hh2.H(new hh2(context, context.getString(rs6.internet_connection_exception)));
                return;
            }
            hg5 hg5Var = myketVideoView.t;
            if (hg5Var != null) {
                hg5Var.h();
            }
            pa2 pa2Var = new pa2(myketVideoView.getOkHttpClient());
            pa2Var.b = j29.K(myketVideoView.getContext(), "");
            qs3 qs3Var = new qs3(24, pa2Var);
            n52 n52Var = new n52(myketVideoView.getContext());
            qg1 qg1Var = new qg1(myketVideoView.getContext());
            qg1Var.c = true;
            n52Var.c(qg1Var);
            n52Var.b(new ig1(qs3Var));
            e62 e62VarA = n52Var.a();
            myketVideoView.q = e62VarA;
            e62VarA.m.a(new ch3(1, myketVideoView));
            e62 e62Var = myketVideoView.q;
            if (e62Var != null) {
                e62Var.u0(new ig5(myketVideoView, 0));
            }
            kg5 kg5Var = myketVideoView.o;
            if (kg5Var == null) {
                js3.V("binding");
                throw null;
            }
            z59 z59Var = (z59) fa1.a(kg5Var.l.findViewById(rr6.controller_layout));
            if (z59Var != null) {
                Context applicationContext = ApplicationLauncher.o.getApplicationContext();
                js3.o(applicationContext, "getContext(...)");
                VideoViewController videoViewController = new VideoViewController(z59Var, applicationContext);
                myketVideoView.p = videoViewController;
                videoViewController.a = myketVideoView;
            }
            kg5 kg5Var2 = myketVideoView.o;
            if (kg5Var2 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var2.z.setPlayer(myketVideoView.q);
            kg5 kg5Var3 = myketVideoView.o;
            if (kg5Var3 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var3.z.setClickable(false);
            if (TextUtils.isEmpty(myketVideoView.s) || !TextUtils.isEmpty(myketVideoView.r)) {
                String str = myketVideoView.r;
                if (str != null) {
                    myketVideoView.h(str);
                }
            } else {
                myketVideoView.getAparatIdUrl();
            }
            myketVideoView.setClickable(false);
            myketVideoView.m(true);
            kg5 kg5Var4 = myketVideoView.o;
            if (kg5Var4 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var4.z.setVisibility(8);
            kg5 kg5Var5 = myketVideoView.o;
            if (kg5Var5 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var5.w.setVisibility(8);
            kg5 kg5Var6 = myketVideoView.o;
            if (kg5Var6 != null) {
                kg5Var6.A.setVisibility(8);
            } else {
                js3.V("binding");
                throw null;
            }
        }
    }

    public static final void g(MyketVideoView myketVideoView, boolean z, int i) {
        if (i == 1) {
            kg5 kg5Var = myketVideoView.o;
            if (kg5Var == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var.w.setVisibility(0);
            myketVideoView.setKeepScreenOn(true);
            return;
        }
        if (i == 2) {
            myketVideoView.setKeepScreenOn(true);
            return;
        }
        if (i != 3) {
            if (i != 4) {
                myketVideoView.setKeepScreenOn(false);
                return;
            } else {
                myketVideoView.A.invoke();
                return;
            }
        }
        if (z) {
            kg5 kg5Var2 = myketVideoView.o;
            if (kg5Var2 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var2.v.setVisibility(8);
            kg5 kg5Var3 = myketVideoView.o;
            if (kg5Var3 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var3.w.setVisibility(8);
            hg5 hg5Var = myketVideoView.t;
            if (hg5Var != null) {
                hg5Var.e();
            }
            myketVideoView.m(false);
            kg5 kg5Var4 = myketVideoView.o;
            if (kg5Var4 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var4.z.setVisibility(0);
            kg5 kg5Var5 = myketVideoView.o;
            if (kg5Var5 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var5.w.setVisibility(8);
            kg5 kg5Var6 = myketVideoView.o;
            if (kg5Var6 == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var6.A.setVisibility(8);
            String str = myketVideoView.u;
            if (str != null && str.length() > 0) {
                try {
                    Uri uri = Uri.parse(myketVideoView.u);
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
                    ir.myket.callback.manager.a callbackUrlManager = myketVideoView.getCallbackUrlManager();
                    String string = builderAppendQueryParameter.toString();
                    js3.o(string, "toString(...)");
                    callbackUrlManager.b(new ql0(string, CallbackUrlType.d, 0));
                } catch (Exception e) {
                    lw.g(e, "start video callback failed", myketVideoView.u);
                }
            }
            myketVideoView.setKeepScreenOn(true);
        }
    }

    private final void getAparatIdUrl() {
        getGeneralService().g(this.s, this, new gg5(this), new gg5(this));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    private final ir.myket.callback.manager.a getCallbackUrlManager() {
        return (ir.myket.callback.manager.a) this.n.getValue();
    }

    private final int getHintColor() {
        return js3.i(this.v, "MOVIE") ? sj8.b().j : sj8.b().c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [c24, java.lang.Object] */
    private final hs5 getOkHttpClient() {
        return (hs5) this.m.getValue();
    }

    private final long getVideoDuration() {
        e62 e62Var = this.q;
        if (e62Var != null) {
            return e62Var.d0();
        }
        return 0L;
    }

    public static /* synthetic */ void setVideoBannerStyle$default(MyketVideoView myketVideoView, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            num2 = null;
        }
        myketVideoView.setVideoBannerStyle(num, num2);
    }

    @Override // defpackage.z49
    public final void a(boolean z) {
        e62 e62Var = this.q;
        if (e62Var != null) {
            e62Var.C(z);
        }
        e62 e62Var2 = this.q;
        if (e62Var2 != null) {
            e62Var2.e();
        }
    }

    @Override // defpackage.z49
    public final void f() {
        Intent intent = new Intent(getContext(), (Class<?>) IbexActivity.class);
        intent.putExtra("BUNDLE_KEY_APARAT_VIDEO_ID", this.s);
        intent.putExtra("BUNDLE_KEY_VIDEO_URL", this.r);
        intent.putExtra("BUNDLE_KEY_VIDEO_DURATION", getVideoDuration());
        intent.putExtra("BUNDLE_KEY_START_CALLBACK_URL", this.u);
        intent.putExtra("type", this.v);
        MovieTrailerData movieTrailerData = this.x;
        intent.putExtra("BUNDLE_KEY_IBEX_DATA", movieTrailerData != null ? movieTrailerData.b : null);
        if (intent.resolveActivity(getContext().getPackageManager()) == null) {
            Context context = getContext();
            hh2.H(new hh2(context, context != null ? context.getString(rs6.uncatchable_intent) : null));
            i();
            return;
        }
        VideoViewController videoViewController = this.p;
        if (videoViewController != null) {
            videoViewController.l(false);
            videoViewController.b = false;
        }
        a(false);
        t7 t7Var = this.z;
        if (t7Var != null) {
            t7Var.a(intent);
        } else {
            getContext().startActivity(intent);
        }
    }

    public final d getGeneralService() {
        d dVar = this.j;
        if (dVar != null) {
            return dVar;
        }
        js3.V("generalService");
        throw null;
    }

    @Override // defpackage.pz3
    public /* bridge */ mz3 getKoin() {
        return at2.getKoin();
    }

    public final d04 getLanguageHelper() {
        d04 d04Var = this.l;
        if (d04Var != null) {
            return d04Var;
        }
        js3.V("languageHelper");
        throw null;
    }

    public final bp2 getPlayerEndedListener() {
        return this.A;
    }

    public final x57 getRequestProxy() {
        x57 x57Var = this.k;
        if (x57Var != null) {
            return x57Var;
        }
        js3.V("requestProxy");
        throw null;
    }

    public final void h(String str) {
        fp4 fp4Var;
        int iB;
        VideoViewController videoViewController = this.p;
        if (videoViewController != null) {
            ThemeData themeData = this.w;
            String str2 = this.v;
            z59 z59Var = videoViewController.c;
            js3.p(themeData, "seekbarTheme");
            int i = themeData.j;
            AlphaColor alphaColor = themeData.I;
            int i2 = themeData.c;
            js3.p(str2, "videoType");
            if (str2.equals("APP")) {
                iB = sv0.b(0.5f, i2, alphaColor.a);
                i = i2;
            } else if (str2.equals("MOVIE")) {
                iB = sv0.b(0.5f, i, alphaColor.a);
            } else {
                i = -1;
                iB = -1;
            }
            DefaultTimeBar defaultTimeBar = z59Var.x;
            defaultTimeBar.setBufferedColor(iB);
            defaultTimeBar.setPlayedColor(i);
            defaultTimeBar.setScrubberColor(i);
        }
        e62 e62Var = this.q;
        if (e62Var != null) {
            e62Var.i0();
        }
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
        kg5 kg5Var = this.o;
        if (kg5Var == null) {
            js3.V("binding");
            throw null;
        }
        gb6 player = kg5Var.z.getPlayer();
        if (player != null) {
            player.J(jp4Var);
            player.c();
            player.C(true);
        }
    }

    public final void i() {
        n();
        m(false);
        VideoViewController videoViewController = this.p;
        if (videoViewController != null) {
            videoViewController.l(true);
            videoViewController.b = true;
        }
        getRequestProxy().a(this);
        kg5 kg5Var = this.o;
        if (kg5Var == null) {
            js3.V("binding");
            throw null;
        }
        kg5Var.z.setPlayer(null);
        kg5 kg5Var2 = this.o;
        if (kg5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        kg5Var2.z.setVisibility(8);
        kg5 kg5Var3 = this.o;
        if (kg5Var3 == null) {
            js3.V("binding");
            throw null;
        }
        kg5Var3.v.setVisibility(0);
        e62 e62Var = this.q;
        if (e62Var != null) {
            e62Var.stop();
        }
        e62 e62Var2 = this.q;
        if (e62Var2 != null) {
            e62Var2.a();
        }
        this.q = null;
        this.p = null;
    }

    public final void m(boolean z) {
        kg5 kg5Var = this.o;
        if (kg5Var == null) {
            js3.V("binding");
            throw null;
        }
        MyketTextView myketTextView = kg5Var.y;
        js3.o(myketTextView, "loadingText");
        myketTextView.setVisibility(z ? 0 : 8);
        kg5 kg5Var2 = this.o;
        if (kg5Var2 == null) {
            js3.V("binding");
            throw null;
        }
        LoadingView loadingView = kg5Var2.x;
        js3.o(loadingView, "loading");
        loadingView.setVisibility(z ? 0 : 8);
        kg5 kg5Var3 = this.o;
        if (kg5Var3 != null) {
            kg5Var3.x.d(z);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final void n() {
        Drawable drawable;
        Drawable drawable2;
        setKeepScreenOn(false);
        setClickable(true);
        kg5 kg5Var = this.o;
        if (kg5Var == null) {
            js3.V("binding");
            throw null;
        }
        kg5Var.A.setVisibility(0);
        if (this.y) {
            Resources resources = getResources();
            js3.o(resources, "getResources(...)");
            int i = yq6.ic_replay;
            try {
                drawable2 = q39.a(resources, i, null);
                if (drawable2 == null) {
                    ThreadLocal threadLocal = b77.a;
                    drawable2 = resources.getDrawable(i, null);
                    if (drawable2 == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused) {
                ThreadLocal threadLocal2 = b77.a;
                drawable2 = resources.getDrawable(i, null);
                if (drawable2 == null) {
                    throw new Resources.NotFoundException();
                }
            }
            setVideoActionDrawable(drawable2);
        } else if (this.B == null) {
            Resources resources2 = getResources();
            js3.o(resources2, "getResources(...)");
            int i2 = yq6.ic_play_video;
            try {
                drawable = q39.a(resources2, i2, null);
                if (drawable == null) {
                    ThreadLocal threadLocal3 = b77.a;
                    drawable = resources2.getDrawable(i2, null);
                    if (drawable == null) {
                        throw new Resources.NotFoundException();
                    }
                }
            } catch (Exception unused2) {
                ThreadLocal threadLocal4 = b77.a;
                drawable = resources2.getDrawable(i2, null);
                if (drawable == null) {
                    throw new Resources.NotFoundException();
                }
            }
            setVideoActionDrawable(drawable);
        }
        if (kg5Var != null) {
            kg5Var.w.setVisibility(0);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final void setActivityResultLauncher(t7 t7Var) {
        this.z = t7Var;
    }

    public final void setAparatId(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.s = str;
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        if (!z) {
            kg5 kg5Var = this.o;
            if (kg5Var == null) {
                js3.V("binding");
                throw null;
            }
            kg5Var.A.setVisibility(8);
        }
        super.setClickable(z);
    }

    public final void setGeneralService(d dVar) {
        js3.p(dVar, "<set-?>");
        this.j = dVar;
    }

    public final void setImageUrl(String str, String str2) {
        lw.b(null, null, TextUtils.isEmpty(str2));
        lw.d(null, null, str2);
        kg5 kg5Var = this.o;
        if (kg5Var != null) {
            kg5Var.w.c(str, str2);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final void setLanguageHelper(d04 d04Var) {
        js3.p(d04Var, "<set-?>");
        this.l = d04Var;
    }

    public final void setPlayerEndedListener(bp2 bp2Var) {
        js3.p(bp2Var, "<set-?>");
        this.A = bp2Var;
    }

    public final void setRequestProxy(x57 x57Var) {
        js3.p(x57Var, "<set-?>");
        this.k = x57Var;
    }

    public final void setSeekbarTheme(ThemeData themeData) {
        js3.p(themeData, "seekbarTheme");
        this.w = themeData;
    }

    public final void setShowReplayIcon(boolean z) {
        this.y = z;
    }

    public final void setSize(int i, int i2) {
        kg5 kg5Var = this.o;
        if (kg5Var != null) {
            kg5Var.w.setSize(i, i2);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final void setStartCallbackUrl(String str) {
        this.u = str;
    }

    public final void setTrailerData(MovieTrailerData movieTrailerData) {
        js3.p(movieTrailerData, "movieTrailerData");
        this.x = movieTrailerData;
    }

    public final void setVideoActionDrawable(Drawable drawable) {
        js3.p(drawable, "drawable");
        this.B = drawable;
        kg5 kg5Var = this.o;
        if (kg5Var != null) {
            kg5Var.A.setImageDrawable(drawable);
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final void setVideoBannerStyle(Integer num, Integer num2) {
        kg5 kg5Var = this.o;
        if (kg5Var == null) {
            js3.V("binding");
            throw null;
        }
        ScreenshotView screenshotView = kg5Var.w;
        js3.o(screenshotView, "imageView");
        ScreenshotView.setStyle$default(screenshotView, num, num2, null, 4, null);
    }

    public final void setVideoListener(hg5 hg5Var) {
        this.t = hg5Var;
    }

    public final void setVideoType(String str) {
        js3.p(str, "videoType");
        this.v = str;
        kg5 kg5Var = this.o;
        if (kg5Var != null) {
            kg5Var.x.setIndicatorColor(getHintColor());
        } else {
            js3.V("binding");
            throw null;
        }
    }

    public final void setVideoUrl(String str) {
        this.r = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MyketVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
        js3.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyketVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        js3.p(context, "context");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        int i2 = kg5.B;
        DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
        int i3 = 1;
        kg5 kg5Var = (kg5) fa1.c(layoutInflaterFrom, js6.myket_video_view, this, true);
        js3.o(kg5Var, "inflate(...)");
        this.o = kg5Var;
        kg5Var.v.setBackground(y97.B(0.0f, sj8.b().O.c, 1));
        n();
        kg5 kg5Var2 = this.o;
        if (kg5Var2 != null) {
            kg5Var2.v.setOnClickListener(new w50(this, context, 9));
            kg5 kg5Var3 = this.o;
            if (kg5Var3 != null) {
                View videoSurfaceView = kg5Var3.z.getVideoSurfaceView();
                if (videoSurfaceView != null) {
                    videoSurfaceView.setOnClickListener(new cd(16, this));
                }
                kg5 kg5Var4 = this.o;
                if (kg5Var4 != null) {
                    kg5Var4.x.setIndicatorColor(getHintColor());
                    LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.a;
                    this.m = kotlin.a.b(lazyThreadSafetyMode, new jg5(this, 0));
                    this.n = kotlin.a.b(lazyThreadSafetyMode, new jg5(this, i3));
                    this.v = "APP";
                    this.w = sj8.c(sj8.f);
                    this.A = new ob4(26);
                    return;
                }
                js3.V("binding");
                throw null;
            }
            js3.V("binding");
            throw null;
        }
        js3.V("binding");
        throw null;
    }

    public /* synthetic */ MyketVideoView(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }
}
