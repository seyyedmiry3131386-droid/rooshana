package defpackage;

import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.Surface;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.material.ripple.RippleHostView;
import androidx.constraintlayout.widget.Group;
import androidx.core.widget.NestedScrollView;
import androidx.databinding.DataBinderMapperImpl;
import androidx.lifecycle.Lifecycle$Event;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import androidx.media3.session.MediaSessionService;
import androidx.media3.ui.PlayerControlView;
import androidx.media3.ui.PlayerView;
import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.timepicker.MaterialTimePicker;
import com.google.android.material.timepicker.l;
import com.microsoft.clarity.g.S;
import com.microsoft.clarity.i.P;
import ir.mservices.market.activity.LaunchContentActivity;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.common.comment.SubmitCommentFragment;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.myMarket.MyMarketRecyclerListFragment;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.pika.connect.PikaConnectFragment;
import ir.mservices.market.reels.ui.ReelsFragment;
import ir.mservices.market.reels.ui.recycler.a;
import ir.mservices.market.reels.ui.recycler.b;
import ir.mservices.market.theme.ThemeMode;
import ir.mservices.market.views.SearchView;
import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u03 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ u03(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005b A[Catch: all -> 0x0021, TryCatch #0 {, blocks: (B:6:0x0017, B:8:0x001b, B:15:0x0026, B:19:0x002c, B:25:0x0038, B:27:0x003c, B:29:0x0042, B:31:0x004c, B:33:0x0056, B:35:0x0067, B:34:0x005b, B:36:0x0069, B:38:0x007d, B:40:0x0085), top: B:48:0x0017 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a() {
        /*
            r9 = this;
            java.lang.Object r0 = r9.b
            en5 r0 = (defpackage.en5) r0
            java.lang.ref.WeakReference r1 = r0.a
            java.lang.Object r1 = r1.get()
            sd1 r1 = (defpackage.sd1) r1
            if (r1 == 0) goto Laa
            fn5 r0 = r0.c
            int r0 = r0.b()
            td1 r2 = r1.a
            monitor-enter(r2)
            int r1 = r2.n     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L24
            boolean r3 = r2.e     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L24
            monitor-exit(r2)
            return
        L21:
            r0 = move-exception
            goto La8
        L24:
            if (r1 != r0) goto L2c
            java.lang.String r1 = r2.o     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L2c
            monitor-exit(r2)
            return
        L2c:
            r2.n = r0     // Catch: java.lang.Throwable -> L21
            r1 = 1
            if (r0 == r1) goto La6
            if (r0 == 0) goto La6
            r1 = 8
            if (r0 != r1) goto L38
            goto La6
        L38:
            java.lang.String r1 = r2.o     // Catch: java.lang.Throwable -> L21
            if (r1 != 0) goto L69
            android.content.Context r1 = r2.a     // Catch: java.lang.Throwable -> L21
            java.lang.String r3 = defpackage.j29.a     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L5b
            java.lang.String r3 = "phone"
            java.lang.Object r1 = r1.getSystemService(r3)     // Catch: java.lang.Throwable -> L21
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L5b
            java.lang.String r1 = r1.getNetworkCountryIso()     // Catch: java.lang.Throwable -> L21
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L21
            if (r3 != 0) goto L5b
            java.lang.String r1 = defpackage.wu8.M(r1)     // Catch: java.lang.Throwable -> L21
            goto L67
        L5b:
            java.util.Locale r1 = java.util.Locale.getDefault()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = r1.getCountry()     // Catch: java.lang.Throwable -> L21
            java.lang.String r1 = defpackage.wu8.M(r1)     // Catch: java.lang.Throwable -> L21
        L67:
            r2.o = r1     // Catch: java.lang.Throwable -> L21
        L69:
            long r0 = r2.a(r0)     // Catch: java.lang.Throwable -> L21
            r2.l = r0     // Catch: java.lang.Throwable -> L21
            td8 r0 = r2.d     // Catch: java.lang.Throwable -> L21
            r0.getClass()     // Catch: java.lang.Throwable -> L21
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L21
            int r3 = r2.g     // Catch: java.lang.Throwable -> L21
            r8 = 0
            if (r3 <= 0) goto L84
            long r3 = r2.h     // Catch: java.lang.Throwable -> L21
            long r3 = r0 - r3
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L21
            r5 = r3
            goto L85
        L84:
            r5 = r8
        L85:
            long r3 = r2.i     // Catch: java.lang.Throwable -> L21
            long r6 = r2.l     // Catch: java.lang.Throwable -> L21
            r2.b(r3, r5, r6)     // Catch: java.lang.Throwable -> L21
            r2.h = r0     // Catch: java.lang.Throwable -> L21
            r0 = 0
            r2.i = r0     // Catch: java.lang.Throwable -> L21
            r2.k = r0     // Catch: java.lang.Throwable -> L21
            r2.j = r0     // Catch: java.lang.Throwable -> L21
            az7 r0 = r2.f     // Catch: java.lang.Throwable -> L21
            java.util.ArrayList r1 = r0.a     // Catch: java.lang.Throwable -> L21
            r1.clear()     // Catch: java.lang.Throwable -> L21
            r1 = -1
            r0.c = r1     // Catch: java.lang.Throwable -> L21
            r0.d = r8     // Catch: java.lang.Throwable -> L21
            r0.e = r8     // Catch: java.lang.Throwable -> L21
            monitor-exit(r2)
            return
        La6:
            monitor-exit(r2)
            return
        La8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
        Laa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u03.a():void");
    }

    private final void b() {
        rb4 rb4Var = (rb4) this.b;
        synchronized (((ArrayDeque) rb4Var.e)) {
            SharedPreferences.Editor editorEdit = ((SharedPreferences) rb4Var.b).edit();
            String str = (String) rb4Var.c;
            StringBuilder sb = new StringBuilder();
            Iterator it = ((ArrayDeque) rb4Var.e).iterator();
            while (it.hasNext()) {
                sb.append((String) it.next());
                sb.append((String) rb4Var.d);
            }
            editorEdit.putString(str, sb.toString()).commit();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        LottieAnimationView lottieAnimationView;
        switch (this.a) {
            case 0:
                ((pt2) this.b).x();
                return;
            case 1:
                ((LaunchContentActivity) ((h40) this.b).e).z0 = false;
                return;
            case 2:
                n29.b((InputStream) this.b);
                return;
            case 3:
                n29.b((ZipInputStream) this.b);
                return;
            case 4:
                ((cg4) this.b).d();
                return;
            case 5:
                MaterialButton.a((MaterialButton) this.b);
                return;
            case 6:
                Object obj = ((MaterialTimePicker) this.b).Y0;
                if (obj instanceof l) {
                    ((l) obj).d();
                    return;
                }
                return;
            case 7:
                ((gn4) this.b).a();
                return;
            case 8:
                synchronized (((MediaSessionService) this.b).a) {
                    break;
                }
                return;
            case 9:
                MyMarketRecyclerListFragment myMarketRecyclerListFragment = (MyMarketRecyclerListFragment) this.b;
                if (myMarketRecyclerListFragment.p1 == null) {
                    return;
                }
                xf5 xf5VarT1 = myMarketRecyclerListFragment.T1();
                MenuItem menuItem = myMarketRecyclerListFragment.p1;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(myMarketRecyclerListFragment.H());
                int i = pk8.w;
                DataBinderMapperImpl dataBinderMapperImpl = fa1.a;
                View view = ((pk8) a79.f0(layoutInflaterFrom, js6.theme_toggle, null, false, null)).l;
                js3.o(view, "getRoot(...)");
                View viewI = xf5VarT1.i(myMarketRecyclerListFragment, menuItem, view);
                if (viewI != null) {
                    ((ImageView) viewI.findViewById(rr6.icon)).setVisibility(8);
                    LottieAnimationView lottieAnimationView2 = (LottieAnimationView) viewI.findViewById(rr6.animation);
                    lottieAnimationView2.setAnimation(sj8.g == ThemeMode.b ? qs6.sun_to_moon : qs6.moon_to_sun);
                    lottieAnimationView2.f();
                    lottieAnimationView2.h.b.addListener(new rj(5, myMarketRecyclerListFragment));
                    return;
                }
                return;
            case 10:
                pm8 pm8Var = (pm8) ((hh2) this.b).c;
                if (pm8Var == null || (lottieAnimationView = pm8Var.w) == null) {
                    return;
                }
                lottieAnimationView.f();
                return;
            case 11:
                ((pa2) this.b).E(true);
                return;
            case 12:
                a();
                return;
            case 13:
                P.a((P) this.b);
                return;
            case 14:
                PikaConnectFragment pikaConnectFragment = (PikaConnectFragment) this.b;
                int i2 = PikaConnectFragment.Y0;
                pk5.g(pikaConnectFragment.J0, new NavIntentDirections.AppDetail(new hp(NearbyRepository.SERVICE_ID, true, new Tracker("pika", "myketPika", "app"), false, null, "myketPika", null, null, null, new Utm("myketPika", 30), null, null, null)), -1);
                return;
            case 15:
                ((bb6) this.b).k--;
                return;
            case 16:
                PlayerControlView playerControlView = (PlayerControlView) this.b;
                float[] fArr = PlayerControlView.d1;
                playerControlView.t();
                return;
            case 17:
                ((PlayerView) this.b).invalidate();
                return;
            case 18:
                ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) this.b;
                i64 i64Var = processLifecycleOwner.f;
                if (processLifecycleOwner.b == 0) {
                    processLifecycleOwner.c = true;
                    i64Var.d(Lifecycle$Event.ON_PAUSE);
                }
                if (processLifecycleOwner.a == 0 && processLifecycleOwner.c) {
                    i64Var.d(Lifecycle$Event.ON_STOP);
                    processLifecycleOwner.d = true;
                    return;
                }
                return;
            case 19:
                a aVar = (a) this.b;
                g07 g07Var = aVar.G;
                if (g07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                Group group = g07Var.K;
                js3.o(group, "shimmer");
                group.setVisibility(8);
                aVar.I = null;
                return;
            case 20:
                b bVar = (b) this.b;
                q07 q07Var = bVar.M;
                if (q07Var == null) {
                    js3.V("binding");
                    throw null;
                }
                Group group2 = q07Var.O;
                js3.o(group2, "shimmer");
                group2.setVisibility(8);
                bVar.W = null;
                return;
            case 21:
                km2 km2Var = ((ReelsFragment) this.b).a1;
                js3.m(km2Var);
                ImageView imageView = km2Var.v;
                js3.o(imageView, "back");
                imageView.setVisibility(8);
                return;
            case 22:
                RippleHostView.setRippleState$lambda$1((RippleHostView) this.b);
                return;
            case 23:
                S.a((S) this.b);
                return;
            case 24:
                SearchView searchView = (SearchView) this.b;
                searchView.e.H.setVisibility(0);
                searchView.e.H.setAlpha(0.0f);
                return;
            case 25:
                ((eo5) this.b).d();
                return;
            case 26:
                b();
                return;
            case 27:
                cf0 cf0Var = (cf0) this.b;
                cf0Var.c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) cf0Var.e;
                b79 b79Var = sideSheetBehavior.i;
                if (b79Var != null && b79Var.h()) {
                    cf0Var.c(cf0Var.b);
                    return;
                } else {
                    if (sideSheetBehavior.h == 2) {
                        sideSheetBehavior.z(cf0Var.b);
                        return;
                    }
                    return;
                }
            case 28:
                SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) this.b;
                Surface surface = sphericalGLSurfaceView.h;
                if (surface != null) {
                    Iterator it = sphericalGLSurfaceView.a.iterator();
                    while (it.hasNext()) {
                        ((b62) it.next()).a.W0(null);
                    }
                }
                SurfaceTexture surfaceTexture = sphericalGLSurfaceView.g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                }
                if (surface != null) {
                    surface.release();
                }
                sphericalGLSurfaceView.g = null;
                sphericalGLSurfaceView.h = null;
                return;
            default:
                SubmitCommentFragment submitCommentFragment = (SubmitCommentFragment) this.b;
                gw0 gw0Var = submitCommentFragment.b1;
                js3.m(gw0Var);
                NestedScrollView nestedScrollView = gw0Var.H;
                gw0 gw0Var2 = submitCommentFragment.b1;
                js3.m(gw0Var2);
                nestedScrollView.u(0 - nestedScrollView.getScrollX(), gw0Var2.G.getTop() - nestedScrollView.getScrollY(), false);
                return;
        }
    }
}
