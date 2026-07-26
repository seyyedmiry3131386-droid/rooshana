package defpackage;

import android.content.Context;
import androidx.compose.animation.h;
import androidx.compose.animation.j;
import io.sentry.okhttp.c;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import ir.myket.network.server.a;
import ir.myket.persistent.db.MyketDatabase;
import java.io.File;
import java.net.ProxySelector;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.Result;
import kotlin.b;
import kotlin.text.Regex;
import okhttp3.logging.HttpLoggingInterceptor$Level;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r05 implements qp2 {
    public final /* synthetic */ int a;

    public /* synthetic */ r05(int i) {
        this.a = 20;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        Object objA;
        switch (this.a) {
            case 0:
                lf7 lf7Var = (lf7) obj;
                js3.p(lf7Var, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new n85((k85) lf7Var.b(g27.a(k85.class), null, null));
            case 1:
                lf7 lf7Var2 = (lf7) obj;
                js3.p(lf7Var2, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new vk7((qk7) lf7Var2.b(g27.a(qk7.class), null, null));
            case 2:
                lf7 lf7Var3 = (lf7) obj;
                Object objA2 = ((k87) lf7Var3.b(t61.f(lf7Var3, "$this$single", (b26) obj2, "<unused var>", k87.class), null, null)).a(c15.class);
                js3.o(objA2, "create(...)");
                return (c15) objA2;
            case 3:
                ((Integer) obj2).getClass();
                return new h(j.d(y97.c0(1.0f, 1600.0f, null, 4), 2), new j52(new kr8((j82) null, (uy7) null, (wo0) null, new zd7(0.7f, lq8.b, y97.c0(0.0f, 400.0f, null, 5)), (LinkedHashMap) null, 119)));
            case 4:
                js3.p((lf7) obj, "$this$scoped");
                js3.p((b26) obj2, "<unused var>");
                return new dl5();
            case 5:
                lf7 lf7Var4 = (lf7) obj;
                return new a(((vo) lf7Var4.b(t61.f(lf7Var4, "$this$single", (b26) obj2, "<unused var>", vo.class), null, null)).j, (ir.myket.persistent.datasource.a) lf7Var4.b(g27.a(ir.myket.persistent.datasource.a.class), null, null));
            case 6:
                lf7 lf7Var5 = (lf7) obj;
                hs5 hs5Var = (hs5) lf7Var5.b(t61.f(lf7Var5, "$this$single", (b26) obj2, "<unused var>", hs5.class), null, null);
                vo voVar = (vo) lf7Var5.b(g27.a(vo.class), null, null);
                hr3 hr3Var = (hr3) lf7Var5.b(g27.a(hr3.class), null, new a88("AUTH_INTERCEPTOR"));
                qe5 qe5Var = (qe5) lf7Var5.b(g27.a(qe5.class), null, null);
                g10 g10Var = (g10) lf7Var5.b(g27.a(g10.class), null, null);
                c cVar = (c) lf7Var5.b(g27.a(c.class), null, null);
                ProxySelector proxySelector = (ProxySelector) lf7Var5.b(g27.a(ProxySelector.class), null, null);
                gs5 gs5VarA = hs5Var.a();
                ArrayList arrayList = gs5VarA.c;
                List listC = br9.C(y11.e, y11.f, y11.g);
                js3.p(listC, "connectionSpecs");
                if (!listC.equals(gs5VarA.s)) {
                    gs5VarA.D = null;
                }
                gs5VarA.s = ih9.j(listC);
                y45 y45Var = new y45(8);
                if (!y45Var.equals(gs5VarA.m)) {
                    gs5VarA.D = null;
                }
                gs5VarA.m = y45Var;
                arrayList.add(hr3Var);
                arrayList.add(qe5Var);
                arrayList.add(cVar);
                if (voVar.i.length() > 0) {
                    gs5VarA.h = g10Var;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                js3.p(timeUnit, "unit");
                gs5VarA.y = ih9.b(20L, timeUnit);
                gs5VarA.z = ih9.b(20L, timeUnit);
                gs5VarA.A = ih9.b(20L, timeUnit);
                gs5VarA.x = ih9.b(20L, timeUnit);
                if (!proxySelector.equals(gs5VarA.n)) {
                    gs5VarA.D = null;
                }
                gs5VarA.n = proxySelector;
                return new hs5(gs5VarA);
            case 7:
                lf7 lf7Var6 = (lf7) obj;
                new Regex(".*(jpg|jpeg|png|gif|webp|svg|bmp|ico)(\\?.*)?$");
                return new br0();
            case 8:
                lf7 lf7Var7 = (lf7) obj;
                Context context = (Context) lf7Var7.b(t61.f(lf7Var7, "$this$single", (b26) obj2, "<unused var>", Context.class), null, null);
                gs5 gs5VarA2 = ((hs5) lf7Var7.b(g27.a(hs5.class), null, new a88("BASE_OK_HTTP"))).a();
                File cacheDir = context.getCacheDir();
                js3.o(cacheDir, "getCacheDir(...)");
                gs5VarA2.l = new fk0(cc2.p0(cacheDir, "http_cache"), 5242880L);
                return new hs5(gs5VarA2);
            case 9:
                js3.p((lf7) obj, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                final ne3 ne3Var = new ne3();
                ne3Var.d = HttpLoggingInterceptor$Level.c;
                return new hr3() { // from class: tm5
                    @Override // defpackage.hr3
                    public final g77 a(cw6 cw6Var) {
                        String strA;
                        dt4 dt4VarB;
                        w47 w47Var = cw6Var.e;
                        b57 b57Var = w47Var.d;
                        return (js3.i((b57Var == null || (dt4VarB = b57Var.b()) == null) ? null : dt4VarB.b, "image") || ((strA = w47Var.c.a("Accept")) != null && f88.c0(strA, "image/", false))) ? cw6Var.b(w47Var) : ne3Var.a(cw6Var);
                    }
                };
            case 10:
                js3.p((lf7) obj, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                Regex regex = dt4.e;
                return new rv3(ok4.A("application/json"), new nm5(24, hs9.l(new sm5(0))));
            case 11:
                lf7 lf7Var8 = (lf7) obj;
                js3.p(lf7Var8, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                hs5 hs5Var2 = (hs5) lf7Var8.b(g27.a(hs5.class), null, new a88("DEFAULT_OK_HTTP"));
                m87 m87Var = (m87) lf7Var8.b(g27.a(m87.class), null, null);
                k51 k51Var = (k51) lf7Var8.b(g27.a(k51.class), null, null);
                o77 o77Var = new o77(1);
                o77Var.a = hs5Var2;
                o77Var.i("https://myket.ir");
                ((ArrayList) o77Var.d).add(m87Var);
                ((ArrayList) o77Var.c).add(k51Var);
                return o77Var.j();
            case 12:
                lf7 lf7Var9 = (lf7) obj;
                return new m87((ir.myket.network.server.c) lf7Var9.b(t61.f(lf7Var9, "$this$single", (b26) obj2, "<unused var>", ir.myket.network.server.c.class), null, null));
            case 13:
                js3.p((lf7) obj, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new c(27);
            case 14:
                lf7 lf7Var10 = (lf7) obj;
                Context context2 = (Context) lf7Var10.b(t61.f(lf7Var10, "$this$single", (b26) obj2, "<unused var>", Context.class), null, null);
                vo voVar2 = (vo) lf7Var10.b(g27.a(vo.class), null, null);
                String str = voVar2.d;
                ay2 ay2Var = new ay2(0);
                ay2Var.a("Myket-PackageName", voVar2.a);
                String str2 = voVar2.b;
                ay2Var.a("Platform", str2);
                ay2Var.a(str2.equalsIgnoreCase("tv") ? "MyketTv-Version" : "Myket-Version", String.valueOf(1028));
                ay2Var.a("X-Device-Type", yq2.c0(context2));
                String property = System.getProperty("http.agent");
                if (property != null) {
                    ay2Var.a("User-Agent", property);
                }
                if (!str2.equals(LinkDTO.LINK_TYPE_MYKET_INTENT)) {
                    ay2Var.a("Store", voVar2.c);
                }
                if (!str.equals(voVar2.e)) {
                    ay2Var.a("authkey", "bXlrZXQtYWx0X059RSt5KC0qPi94Wy4zPXFodXI9aE5dVTE=");
                }
                if (str.equals(voVar2.g)) {
                    ay2Var.a("x-api-key", "PMAK-6774fdaf124eb80001fbe08d-8e8da3305785a0485763eb4fcd1d1800f6");
                }
                return ay2Var.e();
            case 15:
                lf7 lf7Var11 = (lf7) obj;
                X509TrustManager x509TrustManager = (X509TrustManager) lf7Var11.b(t61.f(lf7Var11, "$this$single", (b26) obj2, "<unused var>", X509TrustManager.class), null, null);
                try {
                    SSLContext sSLContext = SSLContext.getInstance("SSL");
                    sSLContext.init(null, new X509TrustManager[]{x509TrustManager}, new SecureRandom());
                    objA = sSLContext.getSocketFactory();
                    break;
                } catch (Throwable th) {
                    objA = b.a(th);
                }
                Throwable thA = Result.a(objA);
                if (thA != null) {
                    throw new RuntimeException(thA);
                }
                js3.o(objA, "getOrElse(...)");
                return (SSLSocketFactory) objA;
            case 16:
                lf7 lf7Var12 = (lf7) obj;
                Context context3 = (Context) lf7Var12.b(t61.f(lf7Var12, "$this$single", (b26) obj2, "<unused var>", Context.class), null, null);
                gs5 gs5VarA3 = ((hs5) lf7Var12.b(g27.a(hs5.class), null, new a88("BASE_OK_HTTP"))).a();
                File cacheDir2 = context3.getCacheDir();
                js3.o(cacheDir2, "getCacheDir(...)");
                gs5VarA3.l = new fk0(cc2.p0(cacheDir2, "web_cache"), 52428800L);
                return new hs5(gs5VarA3);
            case 17:
                lf7 lf7Var13 = (lf7) obj;
                js3.p(lf7Var13, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new nu0((vo) lf7Var13.b(g27.a(vo.class), null, null));
            case 18:
                lf7 lf7Var14 = (lf7) obj;
                js3.p(lf7Var14, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new qe5((Context) lf7Var14.b(g27.a(Context.class), null, null), (by2) lf7Var14.b(g27.a(by2.class), null, null), (ir.myket.persistent.datasource.a) lf7Var14.b(g27.a(ir.myket.persistent.datasource.a.class), null, null), (qu2) lf7Var14.b(g27.a(qu2.class), null, null), (vo) lf7Var14.b(g27.a(vo.class), null, null));
            case 19:
                lf7 lf7Var15 = (lf7) obj;
                js3.p(lf7Var15, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new ir.myket.network.server.c((Context) lf7Var15.b(g27.a(Context.class), null, null), (a) lf7Var15.b(g27.a(a.class), null, null));
            case 20:
                ((Integer) obj2).getClass();
                ct2.a(hs9.W(1), (qz0) obj);
                return tx8.a;
            case 21:
                ((Integer) obj).intValue();
                c32 c32Var = (c32) obj2;
                js3.p(c32Var, "item");
                return c32Var.a;
            case 22:
                return Integer.valueOf(((yk4) obj).P(((Integer) obj2).intValue()));
            case 23:
                return Integer.valueOf(((yk4) obj).n(((Integer) obj2).intValue()));
            case 24:
                return Integer.valueOf(((yk4) obj).a(((Integer) obj2).intValue()));
            case 25:
                return Integer.valueOf(((yk4) obj).l(((Integer) obj2).intValue()));
            case 26:
                lf7 lf7Var16 = (lf7) obj;
                js3.p(lf7Var16, "$this$single");
                js3.p((b26) obj2, "<unused var>");
                return new ir.myket.persistent.datasource.a((Context) lf7Var16.b(g27.a(Context.class), null, null));
            case 27:
                lf7 lf7Var17 = (lf7) obj;
                js3.p(lf7Var17, "$this$factory");
                js3.p((b26) obj2, "<unused var>");
                return new ir.myket.persistent.db.a((k85) lf7Var17.b(g27.a(k85.class), null, null));
            case 28:
                lf7 lf7Var18 = (lf7) obj;
                return ((MyketDatabase) lf7Var18.b(t61.f(lf7Var18, "$this$single", (b26) obj2, "<unused var>", MyketDatabase.class), null, null)).k();
            default:
                lf7 lf7Var19 = (lf7) obj;
                return ((MyketDatabase) lf7Var19.b(t61.f(lf7Var19, "$this$single", (b26) obj2, "<unused var>", MyketDatabase.class), null, null)).l();
        }
    }

    public /* synthetic */ r05(int i, byte b) {
        this.a = i;
    }

    public /* synthetic */ r05(int i, Object obj) {
        this.a = i;
    }
}
