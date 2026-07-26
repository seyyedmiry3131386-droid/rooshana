package defpackage;

import android.content.Context;
import androidx.compose.foundation.gestures.q;
import androidx.compose.foundation.lazy.layout.e;
import androidx.compose.material3.n;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.ui.node.m;
import androidx.media3.exoplayer.ExoPlayer;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.myket.player.domain.models.PlayerMovieData;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.Ref$IntRef;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f8 implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f8(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i;
        int i2 = this.a;
        j9 j9Var = j9.a;
        tx8 tx8Var = tx8.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i2) {
            case 0:
                Context context = (Context) obj3;
                m8 m8Var = (m8) obj2;
                wb5 wb5Var = (wb5) obj;
                bl4.H("on", "player_ad_button_app", "movie_click");
                th0.k(b.M(new Pair("on", dy3.k ? "player_ad_button_land" : "player_ad_button_port")), "movie_click");
                fz1.p();
                if (((Boolean) wb5Var.getValue()).booleanValue()) {
                    ok4.O(context, m8Var, false);
                } else {
                    wb5Var.setValue(Boolean.TRUE);
                }
                return tx8Var;
            case 1:
                bl4.H("on", "player_ad_back", "movie_click");
                ((dp2) obj3).invoke(((qz4) obj2).c.k);
                ((wb5) obj).setValue(Boolean.FALSE);
                return tx8Var;
            case 2:
                bl4.H("on", "player_ad_skip", "movie_click");
                ((dp2) obj3).invoke(((qz4) obj2).c.j);
                ((dp2) obj).invoke(j9Var);
                return tx8Var;
            case 3:
                return ja1.B((ExoPlayer) obj3, (ub) obj2, (xc6) obj);
            case 4:
                ((dp2) obj3).invoke(vb6.a);
                ((wb5) obj).setValue(null);
                ((lf7) obj2).a();
                return tx8Var;
            case 5:
                ((dp2) obj3).invoke(((t9) obj2).e);
                ((dp2) obj).invoke(j9Var);
                return tx8Var;
            case 6:
                ((e40) obj3).a();
                AtomicInt atomicInt = (AtomicInt) ((rb4) obj2).d;
                int i3 = ((Ref$IntRef) obj).a;
                do {
                    i = atomicInt.get();
                } while (!atomicInt.compareAndSet(i, ((i >>> 27) & 15) == i3 ? i - 1 : i));
                return tx8Var;
            case 7:
                androidx.compose.foundation.relocation.b bVar = (androidx.compose.foundation.relocation.b) obj3;
                sy6 sy6VarC0 = androidx.compose.foundation.relocation.b.C0(bVar, (m) obj2, (bp2) obj);
                if (sy6VarC0 == null) {
                    return null;
                }
                androidx.compose.foundation.gestures.b bVar2 = bVar.o;
                if (zq3.b(bVar2.u, 0L)) {
                    un3.c("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return sy6VarC0.i(bVar2.F0(sy6VarC0, bVar2.u, 0L) ^ (-9223372034707292160L));
            case 8:
                at2 at2Var = ((io0) obj3).b;
                js3.m(at2Var);
                return at2Var.T(((sc) obj).h.d, ((ww2) obj2).a());
            case 9:
                androidx.compose.foundation.gestures.b bVar3 = (androidx.compose.foundation.gestures.b) obj3;
                q qVar = (q) obj2;
                wg0 wg0Var = (wg0) obj;
                pj9 pj9Var = bVar3.s;
                while (true) {
                    zb5 zb5Var = (zb5) pj9Var.a;
                    int i4 = zb5Var.c;
                    if (i4 != 0) {
                        if (i4 == 0) {
                            throw new NoSuchElementException("MutableVector is empty.");
                        }
                        sy6 sy6Var = (sy6) ((z31) zb5Var.a[i4 - 1]).a.invoke();
                        if (sy6Var == null ? true : androidx.compose.foundation.gestures.b.D0(bVar3, sy6Var, 0L, 0L, 3)) {
                            zb5 zb5Var2 = (zb5) pj9Var.a;
                            ((z31) zb5Var2.l(zb5Var2.c - 1)).b.resumeWith(tx8Var);
                        }
                    }
                }
                if (bVar3.t) {
                    sy6 sy6Var2 = (sy6) bVar3.r.invoke();
                    if (sy6Var2 != null && androidx.compose.foundation.gestures.b.D0(bVar3, sy6Var2, 0L, 0L, 3)) {
                        bVar3.t = false;
                    }
                }
                qVar.e = androidx.compose.foundation.gestures.b.C0(bVar3, wg0Var, 0L);
                return tx8Var;
            case 10:
                ((dp2) obj3).invoke(10);
                ((dp2) obj2).invoke((dc6) ((ah4) obj).d);
                return tx8Var;
            case 11:
                androidx.compose.foundation.lazy.b bVar4 = (androidx.compose.foundation.lazy.b) obj2;
                s34 s34Var = (s34) ((ck1) obj3).getValue();
                return new t34(bVar4, s34Var, (l24) obj, new e((uq3) ((b34) bVar4.e.e).getValue(), s34Var));
            case 12:
                ((bp2) obj3).invoke();
                th0.k(b.M(new Pair("on", "player_settings")), "movie_click");
                ((dl5) obj2).a(new cr(new af6(((ve6) obj).a)));
                return tx8Var;
            case 13:
                bp2 bp2Var = (bp2) obj;
                int size = ((ArrayList) obj3).size() - ((ee7) obj2).a().size();
                for (int i5 = 0; i5 < size; i5++) {
                    bp2Var.invoke();
                }
                return tx8Var;
            case 14:
                ge geVar = (ge) obj3;
                fz7 fz7Var = (fz7) obj2;
                lv5 lv5Var = (lv5) obj;
                if (geVar != null) {
                    fz7Var.a(fz7Var.c(geVar) - fz7Var.t);
                }
                List listC = wn5.c(fz7Var, null, fz7Var.t, null);
                gz0 gz0Var = (gz0) a.v0(listC);
                Integer num = gz0Var != null ? gz0Var.b : null;
                List listA = lv5Var.a(num);
                if (num != null && !listA.isEmpty()) {
                    listA = a.z0(a.j0(listA), br9.B(new gz0(((gz0) a.o0(listA)).a, null, num)));
                }
                return new fz0(a.z0(listA, listC));
            case 15:
                ((bp2) obj3).invoke();
                th0.k(b.M(new Pair("on", "player_report_other")), "movie_click");
                ((dl5) obj2).a(new cr(new ze6((xc6) obj)));
                return tx8Var;
            case 16:
                bl4.H("on", xa7.c("player_report_other", "cancel"), "movie_click");
                ir.myket.player.ui.client.utils.extensions.a.a((n) obj3, (e71) obj2, (bp2) obj, new v7(27));
                return tx8Var;
            case 17:
                ((dl5) obj3).a(new cr(new ve6((xc6) obj2, ((PlayerMovieData) obj).d.e)));
                return tx8Var;
            case 18:
                return new oe7((v48) obj3, (String[]) obj2, ((pr7) ((sk6) obj).b).d() ? rs6.gprs_wifi : rs6.only_wifi);
            case 19:
                return new ir.mservices.market.setting.model.a((v48) obj3, (xb5) obj2, (dp2) obj);
            case 20:
                dl5 dl5Var = (dl5) obj2;
                af6 af6Var = (af6) obj;
                ((bp2) obj3).invoke();
                th0.k(b.M(new Pair("on", xa7.c("player_report", dy3.k ? "land" : CommonDataKt.MOVIE_IMAGE_TYPE_PORTRAIT))), "movie_click");
                dl5Var.a(new cr(new xe6(af6Var.a)));
                return tx8Var;
            case 21:
                return new gv7((ExtensionPointDto) obj3, (Context) ((t15) obj2).b, (String) obj);
            default:
                return new gv7((List) obj3, (v48) obj2, (v48) obj);
        }
    }
}
