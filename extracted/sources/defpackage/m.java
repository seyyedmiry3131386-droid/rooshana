package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import androidx.compose.animation.core.c;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.f;
import androidx.compose.foundation.gestures.g;
import androidx.compose.material3.k;
import androidx.compose.material3.n;
import androidx.compose.ui.node.i;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.app.detail.ui.recycler.AppRatingModuleData;
import ir.mservices.market.app.detail.ui.recycler.AppScreenshotData;
import ir.mservices.market.app.detail.ui.recycler.d;
import ir.mservices.market.app.home.HomeViewModel;
import ir.mservices.market.app.home.data.HomeExtensionAppsDto;
import ir.mservices.market.app.home.data.HomeVideoListDto;
import ir.mservices.market.app.home.ui.recycler.HomeExtensionReviewData;
import ir.mservices.market.app.home.ui.recycler.b;
import ir.mservices.market.app.url.recycler.AppReviewData;
import ir.mservices.market.app.url.recycler.a;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.download.app.DownloadViewModel;
import ir.mservices.market.movie.data.webapi.BackgroundImageDto;
import ir.mservices.market.movie.data.webapi.MovieListDto;
import ir.mservices.market.myReview.incomplete.recycler.InCompleteReviewData;
import ir.mservices.market.version2.webapi.responsedto.HomeBannerAppsDto;
import ir.mservices.market.views.MyketRatingBar;
import ir.myket.player.provider.service.PlaybackService;
import java.io.IOException;
import java.util.Map;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m(Object obj, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dp2
    public final Object invoke(Object obj) throws Exception {
        ws5 ws5VarC;
        int i = 11;
        switch (this.a) {
            case 0:
                ((ab5) this.b).b((qj6) this.c);
                return tx8.a;
            case 1:
                d dVar = (d) this.b;
                AppRatingModuleData appRatingModuleData = (AppRatingModuleData) this.c;
                ((Integer) obj).intValue();
                og5 og5Var = dVar.w;
                if (og5Var == null) {
                    return null;
                }
                MyketRatingBar myketRatingBar = dVar.y().w;
                js3.o(myketRatingBar, "ratingbar");
                og5Var.m(myketRatingBar, dVar, appRatingModuleData);
                return tx8.a;
            case 2:
                a aVar = (a) this.b;
                AppReviewData appReviewData = (AppReviewData) this.c;
                ((Integer) obj).intValue();
                og5 og5Var2 = aVar.y;
                if (og5Var2 == null) {
                    return null;
                }
                o23 o23Var = aVar.z;
                if (o23Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketRatingBar myketRatingBar2 = o23Var.A;
                js3.o(myketRatingBar2, "ratingbar");
                og5Var2.m(myketRatingBar2, aVar, appReviewData);
                return tx8.a;
            case 3:
                bs bsVar = (bs) this.b;
                AppScreenshotData appScreenshotData = (AppScreenshotData) this.c;
                js3.p((Drawable) obj, "it");
                h83 h83Var = bsVar.y;
                if (h83Var == null) {
                    js3.V("binding");
                    throw null;
                }
                FrameLayout frameLayout = h83Var.v;
                js3.o(frameLayout, "clickableLayout");
                qg5.v(frameLayout, bsVar.w, bsVar, appScreenshotData);
                return tx8.a;
            case 4:
                Context context = (Context) this.b;
                ub5 ub5Var = (ub5) this.c;
                vd6 vd6Var = (vd6) obj;
                js3.p(vd6Var, "it");
                if (vd6Var instanceof rd6) {
                    FragmentActivity fragmentActivityQ = y40.q(context);
                    if (fragmentActivityQ != null && (ws5VarC = fragmentActivityQ.c()) != null) {
                        ws5VarC.b();
                    }
                } else if (vd6Var instanceof sd6) {
                    ub5Var.e(((sd6) vd6Var).a);
                } else if (vd6Var instanceof td6) {
                    ContextCompat.startForegroundService(context, new Intent(context, (Class<?>) PlaybackService.class));
                }
                return tx8.a;
            case 5:
                c40 c40Var = (c40) this.b;
                d40 d40Var = (d40) this.c;
                tx8 tx8Var = tx8.a;
                bl8 bl8Var = c40Var.o;
                if (bl8Var != null) {
                    bl8Var.b();
                }
                c40Var.o = null;
                hx0 hx0Var = d40Var.c;
                if (hx0Var != null) {
                    hx0Var.V(tx8Var);
                }
                d40Var.c = null;
                return tx8Var;
            case 6:
                i40 i40Var = (i40) this.b;
                xy0 xy0Var = (xy0) this.c;
                ai0 ai0Var = i40Var.a;
                if (ai0Var != null) {
                    ai0.d(ai0Var, xy0Var.b);
                } else {
                    ws5 ws5Var = i40Var.b;
                    if (ws5Var == null) {
                        throw new IllegalStateException("Unreachable");
                    }
                    h40 h40Var = xy0Var.a;
                    js3.p(h40Var, "onBackPressedCallback");
                    qs5 qs5Var = new qs5(h40Var, new ss5(null, h40Var));
                    h40Var.a.add(qs5Var);
                    ai0.d(ws5Var.b, qs5Var);
                }
                return new qf(i40Var, xy0Var, 2);
            case 7:
                re5 re5Var = (re5) this.b;
                ir.mservices.market.version2.ui.recycler.adapter.a aVar2 = (ir.mservices.market.version2.ui.recycler.adapter.a) this.c;
                aw0 aw0Var = (aw0) obj;
                js3.p(aw0Var, "loadStates");
                re5Var.A(aVar2.J() ? aw0Var.a : aw0Var.c);
                return tx8.a;
            case 8:
                eh ehVar = (eh) this.b;
                ch0 ch0Var = (ch0) this.c;
                i iVar = (i) obj;
                iVar.a();
                o40.j(iVar, ehVar, ch0Var, 0.0f, null, 60);
                return tx8.a;
            case 9:
                vw5 vw5Var = (vw5) this.b;
                ch0 ch0Var2 = (ch0) this.c;
                i iVar2 = (i) obj;
                iVar2.a();
                o40.j(iVar2, vw5Var.p, ch0Var2, 0.0f, null, 60);
                return tx8.a;
            case 10:
                ((zb5) ((pj9) this.b).a).k((z31) this.c);
                return tx8.a;
            case 11:
                ul0 ul0Var = (ul0) this.b;
                vl0 vl0Var = (vl0) this.c;
                mb7 mb7Var = (mb7) obj;
                js3.p(mb7Var, "_connection");
                ul0Var.b.H(mb7Var, vl0Var);
                return tx8.a;
            case 12:
                x44 x44Var = (x44) this.b;
                ch0 ch0Var3 = (ch0) this.c;
                i iVar3 = (i) obj;
                iVar3.a();
                if (((Boolean) ((s08) x44Var.s).getValue()).booleanValue() || ((Boolean) ((s08) x44Var.t).getValue()).booleanValue()) {
                    o40.k(iVar3, ch0Var3, 0L, 0L, 0.0f, null, 126);
                }
                return tx8.a;
            case 13:
                mp1 mp1Var = (mp1) this.b;
                ry ryVar = (ry) this.c;
                js3.p((IOException) obj, "it");
                synchronized (mp1Var) {
                    ryVar.e();
                }
                return tx8.a;
            case 14:
                return DownloadViewModel.getExtensionApps$lambda$0((DownloadViewModel) this.b, (ExtensionPointDto) this.c, (HomeExtensionAppsDto) obj);
            case 15:
                ke keVar = (ke) this.b;
                g gVar = (g) this.c;
                long jH = nr5.h(1.0f, ((pu1) obj).a);
                Orientation orientation = gVar.J;
                rp2 rp2Var = f.a;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (orientation == Orientation.a ? 4294967295L & jH : jH >> 32));
                androidx.compose.material3.internal.d dVar2 = keVar.a;
                dVar2.m.a(dVar2.f(fIntBitsToFloat), 0.0f);
                return tx8.a;
            case 16:
                ((ab5) this.b).b((gr3) this.c);
                return tx8.a;
            case 17:
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.b;
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.c;
                ij4 ij4Var = (ij4) obj;
                if (ref$IntRef.a == -1) {
                    ref$IntRef.a = ij4Var.b().a;
                }
                ref$IntRef2.a = ij4Var.b().b + 1;
                return "";
            case 18:
                ky2 ky2Var = (ky2) this.b;
                String str = (String) this.c;
                pb5 pb5Var = (pb5) obj;
                ky2Var.getClass();
                pb5Var.e(ky2.d, str);
                ky2Var.h(pb5Var, str);
                return null;
            case 19:
                b bVar = (b) this.b;
                HomeExtensionReviewData homeExtensionReviewData = (HomeExtensionReviewData) this.c;
                ((Integer) obj).getClass();
                kb3 kb3Var = bVar.A;
                if (kb3Var == null) {
                    return null;
                }
                MyketRatingBar myketRatingBar3 = bVar.x().A;
                js3.o(myketRatingBar3, "ratingbar");
                kb3Var.m(myketRatingBar3, bVar, homeExtensionReviewData);
                return tx8.a;
            case 20:
                return HomeViewModel.getMovieNestedList$lambda$0((BackgroundImageDto) this.b, (String) this.c, (MovieListDto) obj);
            case 21:
                return HomeViewModel.getHomeBannerApps$lambda$0((HomeViewModel) this.b, (HomeBannerAppsDto) this.c, (HomeBannerAppsDto) obj);
            case 22:
                return HomeViewModel.getHomeVideoApps$lambda$0((HomeViewModel) this.b, (HomeVideoListDto) this.c, (HomeVideoListDto) obj);
            case 23:
                ir.mservices.market.myReview.incomplete.recycler.a aVar3 = (ir.mservices.market.myReview.incomplete.recycler.a) this.b;
                InCompleteReviewData inCompleteReviewData = (InCompleteReviewData) this.c;
                ((Integer) obj).intValue();
                og5 og5Var3 = aVar3.y;
                if (og5Var3 == null) {
                    return null;
                }
                d33 d33Var = aVar3.z;
                if (d33Var == null) {
                    js3.V("binding");
                    throw null;
                }
                MyketRatingBar myketRatingBar4 = d33Var.B;
                js3.o(myketRatingBar4, "ratingbar");
                og5Var3.m(myketRatingBar4, aVar3, inCompleteReviewData);
                return tx8.a;
            case 24:
                c cVar = (c) this.b;
                jn3 jn3Var = (jn3) this.c;
                cVar.a.b(jn3Var);
                ((s08) cVar.b).setValue(Boolean.TRUE);
                return new qf(cVar, jn3Var, 3);
            case 25:
                pj3 pj3Var = (pj3) this.b;
                androidx.compose.runtime.internal.a aVar4 = (androidx.compose.runtime.internal.a) this.c;
                s34 s34Var = (s34) obj;
                js3.p(s34Var, "$this$LazyColumn");
                s34Var.b(((o) pj3Var).a(), new wb(new sy0(i), pj3Var, 5), new it3(pj3Var, 0), new androidx.compose.runtime.internal.a(2039820996, new jt3(pj3Var, aVar4, pj3Var), true));
                return tx8.a;
            case 26:
                c44 c44Var = (c44) this.b;
                Object obj2 = this.c;
                c44Var.c.i(obj2);
                return new qf(c44Var, obj2, 4);
            case 27:
                return new c44((fd7) this.b, (Map) obj, (bd7) this.c);
            case 28:
                n nVar = (n) this.b;
                androidx.compose.animation.core.a aVar5 = (androidx.compose.animation.core.a) this.c;
                o87 o87Var = (o87) obj;
                float fE = nVar.d.e();
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & o87Var.n));
                if (!Float.isNaN(fE) && !Float.isNaN(fIntBitsToFloat2) && fIntBitsToFloat2 != 0.0f) {
                    float fFloatValue = ((Number) aVar5.d()).floatValue();
                    o87Var.i(k.d(o87Var, fFloatValue));
                    o87Var.j(k.e(o87Var, fFloatValue));
                    o87Var.n(lb7.a(0.5f, (fE + fIntBitsToFloat2) / fIntBitsToFloat2));
                }
                return tx8.a;
            default:
                String str2 = (String) this.b;
                bp2 bp2Var = (bp2) this.c;
                nn7 nn7Var = (nn7) obj;
                ox3[] ox3VarArr = androidx.compose.ui.semantics.f.a;
                androidx.compose.ui.semantics.g gVar2 = androidx.compose.ui.semantics.d.t;
                ox3 ox3Var = androidx.compose.ui.semantics.f.a[11];
                nn7Var.a(gVar2, Float.valueOf(1.0f));
                androidx.compose.ui.semantics.f.d(nn7Var, str2);
                nn7Var.a(androidx.compose.ui.semantics.a.b, new e3(null, new uw2(1, bp2Var)));
                return tx8.a;
        }
    }
}
