package ir.mservices.market.movie.download.core.source;

import defpackage.bs1;
import defpackage.c35;
import defpackage.es1;
import defpackage.f85;
import defpackage.f88;
import defpackage.is3;
import defpackage.j25;
import defpackage.ja1;
import defpackage.js3;
import defpackage.k68;
import defpackage.nr1;
import defpackage.p25;
import defpackage.pa1;
import defpackage.q25;
import defpackage.r25;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.s25;
import defpackage.ss1;
import defpackage.t25;
import defpackage.u25;
import defpackage.wn5;
import defpackage.wu0;
import defpackage.xf5;
import defpackage.xl5;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.movie.download.core.url.MovieDownloadUrlService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.b;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements nr1 {
    public final xl5 a;
    public final xf5 b;
    public final MovieDownloadUrlService c;
    public final f85 d;
    public final k68 e;
    public final ir.mservices.market.core.notification.a f;
    public final l g;
    public final l h;
    public final l i;
    public final l j;
    public final l k;
    public final rv6 l;
    public final l m;
    public final rv6 n;

    public a(xl5 xl5Var, xf5 xf5Var, MovieDownloadUrlService movieDownloadUrlService, f85 f85Var, k68 k68Var, ir.mservices.market.core.notification.a aVar) {
        js3.p(xl5Var, "nene");
        js3.p(xf5Var, "myketUiUtils");
        js3.p(movieDownloadUrlService, "urlService");
        js3.p(f85Var, "urlCaching");
        js3.p(k68Var, "storageUtils");
        js3.p(aVar, "notificationController");
        this.a = xl5Var;
        this.b = xf5Var;
        this.c = movieDownloadUrlService;
        this.d = f85Var;
        this.e = k68Var;
        this.f = aVar;
        this.g = ja1.b(b.I());
        this.h = ja1.b(b.I());
        this.i = ja1.b(b.I());
        this.j = ja1.b("");
        List<bs1> listC = xl5Var.c();
        js3.o(listC, "getDownloadInfosList(...)");
        int iL = b.L(wu0.V(listC, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iL < 16 ? 16 : iL);
        for (bs1 bs1Var : listC) {
            js3.m(bs1Var);
            String str = ((es1) bs1Var).d;
            js3.o(str, "getKey(...)");
            List listY0 = f88.y0(str, new String[]{"/"}, 6);
            linkedHashMap.put(listY0.get(0) + "/" + listY0.get(1), b(a(bs1Var)));
        }
        l lVarB = ja1.b(linkedHashMap);
        this.k = lVarB;
        this.l = new rv6(lVarB);
        l lVarB2 = ja1.b(Boolean.FALSE);
        this.m = lVarB2;
        this.n = new rv6(lVarB2);
        this.a.d(this);
    }

    public final j25 a(bs1 bs1Var) {
        if (bs1Var == null) {
            return null;
        }
        String str = wn5.d0(bs1Var) + "/sub";
        xl5 xl5Var = this.a;
        es1 es1VarB = xl5Var.b(str);
        es1 es1VarB2 = xl5Var.b(wn5.d0(bs1Var) + "/media");
        if (es1VarB2 != null) {
            return new j25(es1VarB2, es1VarB);
        }
        return null;
    }

    public final u25 b(j25 j25Var) {
        Integer numValueOf = j25Var != null ? Integer.valueOf(j25Var.i()) : null;
        l lVar = this.h;
        l lVar2 = this.g;
        if (numValueOf != null && numValueOf.intValue() == 110) {
            is3.c(lVar2, j25Var.c(), true);
            is3.c(lVar, j25Var.f(), true);
            return new t25(rs6.movie_download_in_queue_state, Integer.valueOf(j25Var.g()));
        }
        if (numValueOf != null && numValueOf.intValue() == 140) {
            is3.c(lVar2, j25Var.c(), false);
            is3.c(lVar, j25Var.f(), false);
            boolean zA = j25Var.a(new ss1(new c35(this.e)));
            l lVar3 = this.i;
            if (zA) {
                is3.c(lVar3, j25Var.f(), true);
                return new s25(j25Var.d());
            }
            is3.c(lVar3, j25Var.f(), false);
            return new p25(Integer.valueOf(j25Var.g()));
        }
        if (numValueOf != null && numValueOf.intValue() == 130) {
            is3.c(lVar2, j25Var.c(), false);
            is3.c(lVar, j25Var.f(), false);
            int iB = j25Var.b();
            this.b.getClass();
            return new r25(Integer.valueOf(xf5.d(iB)), null, 2);
        }
        if (numValueOf != null && numValueOf.intValue() == 100) {
            is3.c(lVar2, j25Var.c(), true);
            is3.c(lVar, j25Var.f(), true);
            if (j25Var.b() == 104) {
                return new t25(rs6.movie_download_post_process, Integer.valueOf(j25Var.g()));
            }
            long j = j25Var.a.k;
            bs1 bs1Var = j25Var.b;
            return new q25(j25Var.g(), j + (bs1Var != null ? ((es1) bs1Var).k : 0L));
        }
        if ((numValueOf == null || numValueOf.intValue() != 150) && ((numValueOf == null || numValueOf.intValue() != 120) && (numValueOf == null || numValueOf.intValue() != 190))) {
            return null;
        }
        is3.c(lVar2, j25Var.c(), false);
        is3.c(lVar, j25Var.f(), false);
        return new p25(Integer.valueOf(j25Var.g()));
    }

    public final void c() {
        xl5 xl5Var = this.a;
        List listC = xl5Var.c();
        pa1 pa1Var = xl5Var.a;
        js3.m(listC);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listC) {
            if (((es1) ((bs1) obj)).f == 110) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                pa1Var.e((es1) ((bs1) it.next()));
            } catch (Throwable th) {
                kotlin.b.a(th);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : listC) {
            if (((es1) ((bs1) obj2)).f == 100) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            try {
                pa1Var.e((es1) ((bs1) it2.next()));
            } catch (Throwable th2) {
                kotlin.b.a(th2);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(ir.mservices.market.movie.download.core.model.MovieDownloadMetaData r22, java.lang.Object r23, ir.mservices.market.movie.download.core.b r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.download.core.source.a.d(ir.mservices.market.movie.download.core.model.MovieDownloadMetaData, java.lang.Object, ir.mservices.market.movie.download.core.b, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
        js3.p(bs1Var, "downloadInfo");
        j25 j25VarA = a(bs1Var);
        if (j25VarA != null) {
            long j = j25VarA.a.k;
            bs1 bs1Var2 = j25VarA.b;
            q25 q25Var = new q25(j25VarA.g(), j + (bs1Var2 != null ? ((es1) bs1Var2).k : 0L));
            String str = ((es1) bs1Var).d;
            js3.o(str, "getKey(...)");
            List listY0 = f88.y0(str, new String[]{"/"}, 6);
            is3.d(this.k, listY0.get(0) + "/" + listY0.get(1), q25Var);
            this.f.t(q25Var, j25VarA);
        }
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        List listY0;
        js3.p(es1Var, "downloadInfo");
        String str = es1Var.d;
        j25 j25VarA = a(es1Var);
        if (j25VarA != null) {
            ir.mservices.market.core.notification.a aVar = this.f;
            if (i == 252) {
                aVar.getClass();
                MovieDownloadMetaData movieDownloadMetaDataD = j25VarA.d();
                String str2 = movieDownloadMetaDataD.a + "/" + movieDownloadMetaDataD.f;
                aVar.g.remove(str2);
                aVar.f.remove(str2);
                aVar.i();
            }
            if (i == 250) {
                do {
                    lVar2 = this.j;
                    value2 = lVar2.getValue();
                    js3.o(str, "getKey(...)");
                    listY0 = f88.y0(str, new String[]{"/"}, 6);
                } while (!lVar2.n(value2, listY0.get(0) + "/" + listY0.get(1)));
            }
            if (i != 251) {
                return;
            }
            u25 u25VarB = b(j25VarA);
            if (u25VarB != null) {
                js3.o(str, "getKey(...)");
                List listY02 = f88.y0(str, new String[]{"/"}, 6);
                is3.d(this.k, listY02.get(0) + "/" + listY02.get(1), u25VarB);
                aVar.t(u25VarB, j25VarA);
            }
            do {
                lVar = this.m;
                value = lVar.getValue();
                ((Boolean) value).getClass();
                js3.o(this.a.a.c.f(), "getDownloadingDownloadInfos(...)");
            } while (!lVar.n(value, Boolean.valueOf(!r0.isEmpty())));
        }
    }
}
