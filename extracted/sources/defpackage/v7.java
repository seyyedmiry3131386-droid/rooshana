package defpackage;

import android.os.Handler;
import android.os.Looper;
import ir.mservices.market.app.detail.ui.AppDetailViewModel;
import ir.mservices.market.appUsage.model.a;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.manager.b;
import ir.mservices.market.version2.manager.player.doubleTap.customPlayer.views.CircleClipTapView;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.text.CharDirectionality;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v7 implements bp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ v7(int i) {
        this.a = i;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        String str;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        switch (i) {
            case 0:
                yu6.a.getClass();
                return Integer.valueOf(yu6.b.e().nextInt(2147418112) + 65536);
            case 1:
                b88 b88Var = b88.a;
                return new v74(b88Var, b88Var);
            case 2:
                int i2 = xj.b;
                return tx8Var;
            case 3:
                int i3 = hm.a;
                return fz1.g;
            case 4:
                int i4 = hm.a;
                return hy2.h;
            case 5:
                return AppDetailViewModel.getDownloadRefId$lambda$0();
            case 6:
                return AppDetailViewModel.getDownloadRefId$lambda$1();
            case 7:
                return new br5("ir.myket.navigation.navigator.AppNavKey.GameTab", gr.INSTANCE, new Annotation[0]);
            case 8:
                return new br5("ir.myket.navigation.navigator.AppNavKey.HomeTab", hr.INSTANCE, new Annotation[0]);
            case 9:
                return new br5("ir.myket.navigation.navigator.AppNavKey.MovieTab", ir.INSTANCE, new Annotation[0]);
            case 10:
                return new ih7(g27.a(kr.class), new zw3[]{g27.a(gr.class), g27.a(hr.class), g27.a(ir.class), g27.a(lr.class)}, new px3[]{new br5("ir.myket.navigation.navigator.AppNavKey.GameTab", gr.INSTANCE, new Annotation[0]), new br5("ir.myket.navigation.navigator.AppNavKey.HomeTab", hr.INSTANCE, new Annotation[0]), new br5("ir.myket.navigation.navigator.AppNavKey.MovieTab", ir.INSTANCE, new Annotation[0]), new br5("ir.myket.navigation.navigator.AppNavKey.UpdateTab", lr.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 11:
                return new br5("ir.myket.navigation.navigator.AppNavKey.UpdateTab", lr.INSTANCE, new Annotation[0]);
            case 12:
                return new qv(pp7.a, 0);
            case 13:
                a aVar = new a();
                aVar.b = (b) ((w91) ApplicationLauncher.o.b()).E0.get();
                return aVar;
            case 14:
                return new Handler(Looper.getMainLooper());
            case 15:
                return new qv(b88.a, 0);
            case 16:
                return new qv(b88.a, 0);
            case 17:
                return new k18(gu9.d(1308617531));
            case 18:
                str = "update_whats_new_more_visible";
                break;
            case 19:
                str = "update_whats_new_more";
                break;
            case 20:
                u58 u58Var = na0.a;
                return null;
            case 21:
                return new qv(b76.a, 0);
            case 22:
                List list = CharDirectionality.c;
                int iL = kotlin.collections.b.L(wu0.V(list, 10));
                if (iL < 16) {
                    iL = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iL);
                for (Object obj : (z0) list) {
                    linkedHashMap.put(Integer.valueOf(((CharDirectionality) obj).a), obj);
                }
                return linkedHashMap;
            case 23:
                int i5 = CircleClipTapView.p;
                return tx8Var;
            case 24:
                long j = fv0.z;
                return new lv0(j, fv0.j, fv0.A, fv0.k, fv0.e, fv0.E, fv0.n, fv0.F, fv0.o, fv0.R, fv0.t, fv0.S, fv0.u, fv0.a, fv0.g, fv0.I, fv0.r, fv0.Q, fv0.s, j, fv0.f, fv0.d, fv0.b, fv0.h, fv0.c, fv0.i, fv0.x, fv0.y, fv0.D, fv0.J, fv0.P, fv0.K, fv0.L, fv0.M, fv0.N, fv0.O, fv0.B, fv0.C, fv0.l, fv0.m, fv0.G, fv0.H, fv0.p, fv0.q, fv0.T, fv0.U, fv0.v, fv0.w);
            case 25:
                u58 u58Var2 = mv0.a;
                return Boolean.TRUE;
            case 26:
                str = "complete_review_more_visible";
                break;
            case 27:
                return tx8Var;
            case 28:
                u58 u58Var3 = i01.a;
                return null;
            default:
                sz0.b("Unexpected call to default provider");
                throw new KotlinNothingValueException();
        }
        dw1.y(str);
        return tx8Var;
    }
}
