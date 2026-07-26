package defpackage;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.text.contextmenu.internal.a;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.e;
import com.google.firebase.messaging.EnhancedIntentService;
import com.microsoft.clarity.ClarityConfig;
import com.microsoft.clarity.a.I;
import com.microsoft.clarity.g.b0;
import com.microsoft.clarity.k.InterfaceC0098d;
import io.sentry.cache.f;
import io.sentry.k;
import io.sentry.k6;
import io.sentry.m6;
import io.sentry.protocol.v;
import io.sentry.y3;
import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ii implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ii(vg1 vg1Var, d30 d30Var, p58 p58Var, l20 l20Var) {
        this.a = 5;
        this.b = vg1Var;
        this.c = d30Var;
        this.d = l20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, tw1] */
    @Override // java.lang.Runnable
    public final void run() {
        final int i = 1;
        wp7 wp7Var = null;
        final int i2 = 0;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                a aVar = (a) this.b;
                gi giVar = (gi) this.c;
                hi hiVar = (hi) this.d;
                ActionMode actionModeStartActionMode = aVar.a.startActionMode(new ue2(giVar), 1);
                js3.i(aVar.h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    hiVar.close();
                    return;
                }
                return;
            case 1:
                ((ir.mservices.market.version2.manager.a) this.b).g((FragmentActivity) this.c, (ArrayList) this.d);
                return;
            case 2:
                n00 n00Var = (n00) this.b;
                final b bVar = (b) this.c;
                final hc1 hc1Var = (hc1) this.d;
                b62 b62Var = n00Var.c;
                String str = j29.a;
                hd1 hd1Var = b62Var.a.s;
                final be beVarA0 = hd1Var.a0();
                hd1Var.b0(beVarA0, 1009, new q94(beVarA0, bVar, hc1Var, i) { // from class: ed1
                    public final /* synthetic */ int a;
                    public final /* synthetic */ be b;
                    public final /* synthetic */ b c;

                    {
                        this.a = i;
                    }

                    @Override // defpackage.q94
                    public final void invoke(Object obj) {
                        switch (this.a) {
                            case 0:
                                ((ce) obj).B(this.b, this.c);
                                break;
                            default:
                                ((ce) obj).O(this.b, this.c);
                                break;
                        }
                    }
                });
                return;
            case 3:
                qq4 qq4Var = (qq4) this.b;
                il0 il0Var = (il0) this.c;
                h77 h77Var = (h77) this.d;
                vd1 vd1Var = (vd1) qq4Var.b;
                if (vd1Var.b.r0()) {
                    il0Var.o(vd1Var, new IOException("Canceled"));
                    return;
                } else {
                    il0Var.e(vd1Var, h77Var);
                    return;
                }
            case 4:
                ((il0) this.c).o((vd1) ((qq4) this.b).b, (Throwable) this.d);
                return;
            case 5:
                vg1 vg1Var = (vg1) this.b;
                d30 d30Var = (d30) this.c;
                String str2 = d30Var.a;
                l20 l20Var = (l20) this.d;
                vg1Var.getClass();
                Logger logger = vg1.f;
                try {
                    bs8 bs8VarA = vg1Var.c.a(str2);
                    if (bs8VarA == null) {
                        String str3 = "Transport backend '" + str2 + "' is not registered";
                        logger.warning(str3);
                        new IllegalArgumentException(str3);
                    } else {
                        ((qb7) vg1Var.e).y(new tg1((Object) vg1Var, (Object) d30Var, (Object) ((un0) bs8VarA).a(l20Var), (int) (objArr == true ? 1 : 0)));
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    return;
                }
            case 6:
                ViewGroup viewGroup = (ViewGroup) this.b;
                View view = (View) this.c;
                ch1 ch1Var = (ch1) this.d;
                js3.p(viewGroup, "$container");
                js3.p(ch1Var, "this$0");
                viewGroup.endViewTransition(view);
                ((p28) ch1Var.c.b).c(ch1Var);
                return;
            case 7:
                sw1 sw1Var = (sw1) this.b;
                this.c.b(sw1Var.a, sw1Var.b, (Exception) this.d);
                return;
            case 8:
                gu guVar = (gu) this.b;
                ct2 ct2Var = (ct2) this.c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.d;
                try {
                    bi2 bi2VarX = hs9.x(guVar.a);
                    if (bi2VarX == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    ai2 ai2Var = (ai2) ((yz1) bi2VarX.b);
                    synchronized (ai2Var.d) {
                        ai2Var.f = threadPoolExecutor;
                        break;
                    }
                    ((yz1) bi2VarX.b).a(new a02(ct2Var, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    ct2Var.q(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 9:
                EnhancedIntentService enhancedIntentService = (EnhancedIntentService) this.b;
                Intent intent = (Intent) this.c;
                cf8 cf8Var = (cf8) this.d;
                int i3 = EnhancedIntentService.f;
                try {
                    enhancedIntentService.c(intent);
                    return;
                } finally {
                    cf8Var.b(null);
                }
            case 10:
                I.a((Application) this.b, (ClarityConfig) this.c, (InterfaceC0098d) this.d);
                return;
            case 11:
                gn4 gn4Var = (gn4) this.b;
                String str4 = (String) this.c;
                Bundle bundle = (Bundle) this.d;
                gn4Var.k0();
                fn4 fn4Var = gn4Var.c;
                zx8 it = (!fn4Var.E() ? xp7.b : fn4Var.g0()).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        wp7 wp7Var2 = (wp7) it.next();
                        if (wp7Var2.a == 0 && wp7Var2.b.equals(str4)) {
                            wp7Var = wp7Var2;
                        }
                    }
                }
                if (wp7Var != null) {
                    gn4Var.k0();
                    if ((!fn4Var.E() ? xp7.b : fn4Var.g0()).a.contains(wp7Var)) {
                        wp7 wp7Var3 = new wp7(bundle, str4);
                        Bundle bundle2 = Bundle.EMPTY;
                        gn4Var.k0();
                        n94 n94VarK0 = fn4Var.E() ? fn4Var.k0(wp7Var3) : ja1.y(new bq7(-100));
                        n94VarK0.e(new g6(14, n94VarK0, new yy1(str4), objArr2 == true ? 1 : 0), e.a());
                        return;
                    }
                    return;
                }
                return;
            case 12:
                cq4 cq4Var = (cq4) this.b;
                lj3 lj3Var = (lj3) this.c;
                ks4 ks4Var = (ks4) this.d;
                hd1 hd1Var2 = cq4Var.c;
                ImmutableList immutableListS = lj3Var.S();
                on onVar = hd1Var2.d;
                gb6 gb6Var = hd1Var2.g;
                gb6Var.getClass();
                onVar.getClass();
                onVar.b = ImmutableList.n(immutableListS);
                if (!immutableListS.isEmpty()) {
                    onVar.e = (ks4) immutableListS.get(0);
                    ks4Var.getClass();
                    onVar.f = ks4Var;
                }
                if (((ks4) onVar.d) == null) {
                    onVar.d = on.j(gb6Var, (ImmutableList) onVar.b, (ks4) onVar.e, (yl8) onVar.a);
                }
                onVar.y(gb6Var.S());
                return;
            case 13:
                kl4 kl4Var = (kl4) this.b;
                hq4 hq4Var = (hq4) this.c;
                KeyEvent keyEvent = (KeyEvent) this.d;
                xq4 xq4Var = (xq4) kl4Var.c;
                if (xq4Var.i(hq4Var)) {
                    xq4Var.b(keyEvent, false, false);
                } else {
                    hr4 hr4Var = xq4Var.h;
                    jr4 jr4Var = hq4Var.a;
                    jr4Var.getClass();
                    hr4Var.getClass();
                    hr4Var.H(1, new yq4(hr4Var, 7), jr4Var, true);
                }
                kl4Var.b = null;
                return;
            case 14:
                xq4 xq4Var2 = (xq4) this.b;
                sr4 sr4Var = (sr4) this.c;
                iq4 iq4Var = (iq4) this.d;
                if (xq4Var2.j()) {
                    return;
                }
                qg6 qg6Var = xq4Var2.t;
                sr4Var.getClass();
                y97.Y(qg6Var, iq4Var);
                return;
            case 15:
                ws4 ws4Var = (ws4) this.b;
                Pair pair = (Pair) this.c;
                ((hd1) ws4Var.b.i).b(((Integer) pair.first).intValue(), (ks4) pair.second, (Exception) this.d);
                return;
            case 16:
                kg6.a((kg6) this.b, (SurfaceView) this.c, (u03) this.d);
                return;
            case 17:
                n94 n94Var = (n94) this.b;
                rq7 rq7Var = (rq7) this.c;
                try {
                    try {
                        rq7Var.m(((uw) this.d).mo52apply(ja1.t(n94Var)));
                        return;
                    } catch (Throwable th2) {
                        rq7Var.l(th2);
                        return;
                    }
                } catch (Error e2) {
                    e = e2;
                    rq7Var.l(e);
                    return;
                } catch (CancellationException unused) {
                    rq7Var.cancel(false);
                    return;
                } catch (RuntimeException e3) {
                    e = e3;
                    rq7Var.l(e);
                    return;
                } catch (ExecutionException e4) {
                    e = e4;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    rq7Var.l(e);
                    return;
                }
            case 18:
                rq7 rq7Var2 = (rq7) this.b;
                lo4 lo4Var = (lo4) this.c;
                bq7 bq7Var = (bq7) this.d;
                try {
                    if (rq7Var2.a instanceof c0) {
                        return;
                    }
                    lo4Var.run();
                    rq7Var2.k(bq7Var);
                    return;
                } catch (Throwable th3) {
                    rq7Var2.l(th3);
                    return;
                }
            case 19:
                n00 n00Var2 = (n00) this.b;
                final b bVar2 = (b) this.c;
                final hc1 hc1Var2 = (hc1) this.d;
                b62 b62Var2 = n00Var2.c;
                String str5 = j29.a;
                hd1 hd1Var3 = b62Var2.a.s;
                final be beVarA02 = hd1Var3.a0();
                hd1Var3.b0(beVarA02, 1017, new q94(beVarA02, bVar2, hc1Var2, i2) { // from class: ed1
                    public final /* synthetic */ int a;
                    public final /* synthetic */ be b;
                    public final /* synthetic */ b c;

                    {
                        this.a = i2;
                    }

                    @Override // defpackage.q94
                    public final void invoke(Object obj) {
                        switch (this.a) {
                            case 0:
                                ((ce) obj).B(this.b, this.c);
                                break;
                            default:
                                ((ce) obj).O(this.b, this.c);
                                break;
                        }
                    }
                });
                return;
            case 20:
                b0.b((bp2) this.b, (dp2) this.c, (bp2) this.d);
                return;
            default:
                f fVar = (f) this.b;
                Object obj = (k6) this.c;
                y3 y3Var = (y3) this.d;
                if (obj != null) {
                    fVar.d(obj, "trace.json");
                    return;
                }
                k kVar = y3Var.s;
                k6 k6Var = new k6((v) kVar.b, (m6) kVar.c, "default", null);
                k6Var.i = "auto";
                fVar.d(k6Var, "trace.json");
                return;
        }
    }

    public /* synthetic */ ii(xp4 xp4Var, gn4 gn4Var, String str, Bundle bundle) {
        this.a = 11;
        this.b = gn4Var;
        this.c = str;
        this.d = bundle;
    }

    public /* synthetic */ ii(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
