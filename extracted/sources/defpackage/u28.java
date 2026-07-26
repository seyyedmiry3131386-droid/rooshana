package defpackage;

import android.net.Uri;
import ir.mservices.market.movie.download.core.model.MovieDownloadMetaData;
import ir.mservices.market.version2.download.DownloadTag;
import ir.mservices.market.version2.services.d;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixSpeedControlRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixUserRequestDto;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.random.Random$Default;

/* JADX INFO: loaded from: classes3.dex */
public final class u28 {
    public final lu7 a;
    public final d b;
    public final c5 c;
    public final LinkedHashMap d = new LinkedHashMap();

    public u28(ps1 ps1Var, xl5 xl5Var, lu7 lu7Var, d dVar, c5 c5Var) {
        this.a = lu7Var;
        this.b = dVar;
        this.c = c5Var;
        ps1Var.u(new t28(this, 0));
        xl5Var.d(new t28(this, 1));
    }

    public static final void a(u28 u28Var, bs1 bs1Var, int i, String str) {
        String str2;
        boolean zB;
        String lowerCase;
        LinkedHashMap linkedHashMap = u28Var.d;
        switch (i) {
            case 250:
            case 251:
                es1 es1Var = (es1) bs1Var;
                String strC = dh5.c(es1Var.f);
                js3.o(strC, "downloadStatusToString(...)");
                String strA = dh5.a(es1Var.g);
                js3.o(strA, "downloadDetailedStatusToString(...)");
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = es1Var.i;
                v28 v28Var = new v28(strC, strA, jCurrentTimeMillis, j);
                String str3 = es1Var.d;
                v28 v28Var2 = (v28) linkedHashMap.get(str3);
                if (v28Var2 != null) {
                    if (v28Var2.a.equals("PAUSED")) {
                        v28Var2 = null;
                    }
                    if (v28Var2 != null && (str2 = es1Var.b) != null && !f88.n0(str2)) {
                        String str4 = es1Var.b;
                        js3.o(str4, "getSourceUrl(...)");
                        Uri uri = Uri.parse(str4);
                        long j2 = jCurrentTimeMillis - v28Var2.c;
                        Object obj = es1Var.e;
                        if (obj instanceof DownloadTag) {
                            String str5 = lu7.D0;
                            js3.o(str5, "APP_SPEED_CONTROL_TIME_LIMIT");
                            String str6 = lu7.C0;
                            js3.o(str6, "APP_SPEED_CONTROL_SAMPLE_RATE");
                            zB = u28Var.b(j2, str5, str6);
                        } else if (obj instanceof MovieDownloadMetaData) {
                            String str7 = lu7.F0;
                            js3.o(str7, "MOVIE_SPEED_CONTROL_TIME_LIMIT");
                            String str8 = lu7.E0;
                            js3.o(str8, "MOVIE_SPEED_CONTROL_SAMPLE_RATE");
                            zB = u28Var.b(j2, str7, str8);
                        } else {
                            zB = false;
                        }
                        if (zB) {
                            js3.o(str3, "getKey(...)");
                            String host = uri.getHost();
                            if (host == null) {
                                host = "";
                            }
                            long j3 = j - v28Var2.d;
                            String str9 = v28Var2.a;
                            String str10 = v28Var2.b;
                            long j4 = es1Var.h;
                            String strQ = rm7.q(uri.getScheme(), "://", uri.getHost(), uri.getPath());
                            String queryParameter = uri.getQueryParameter("h");
                            if (queryParameter != null) {
                                lowerCase = queryParameter.toLowerCase(Locale.ROOT);
                                js3.o(lowerCase, "toLowerCase(...)");
                            } else {
                                lowerCase = null;
                            }
                            SpixSpeedControlRequestDto spixSpeedControlRequestDto = new SpixSpeedControlRequestDto(str3, host, j2, j3, str9, str10, strC, strA, str, j4, strQ, Boolean.parseBoolean(lowerCase), es1Var.j);
                            c5 c5Var = u28Var.c;
                            u28Var.b.m("speed-control", new SpixRequestDto(new SpixUserRequestDto(c5Var.a(), c5Var.b(), wq2.A(), wq2.x(), wq2.I(), wq2.C()), spixSpeedControlRequestDto));
                        }
                    }
                }
                linkedHashMap.put(str3, v28Var);
                if (es1Var.f == 140) {
                    linkedHashMap.remove(str3);
                }
                break;
            case 252:
                linkedHashMap.remove(((es1) bs1Var).d);
                break;
        }
    }

    public final boolean b(long j, String str, String str2) {
        lu7 lu7Var = this.a;
        if (j > lu7Var.c(1000, str)) {
            uq3 uq3Var = new uq3(0, 1000000, 1);
            Random$Default random$Default = yu6.a;
            js3.p(random$Default, "random");
            try {
                if (dy3.D(random$Default, uq3Var) < lu7Var.c(1, str2)) {
                    return true;
                }
            } catch (IllegalArgumentException e) {
                throw new NoSuchElementException(e.getMessage());
            }
        }
        return false;
    }
}
