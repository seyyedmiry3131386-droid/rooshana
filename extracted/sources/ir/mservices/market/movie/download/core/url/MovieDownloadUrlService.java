package ir.mservices.market.movie.download.core.url;

import com.google.gson.reflect.TypeToken;
import defpackage.dy3;
import defpackage.f88;
import defpackage.g51;
import defpackage.js3;
import defpackage.n99;
import defpackage.o2;
import defpackage.yd1;
import defpackage.z57;
import java.lang.reflect.Type;
import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieDownloadUrlService extends o2 {
    public static final Companion Companion = new Companion(null);
    private static final String URL_PATH_DOWNLOAD_URL = "v1/play-info/{playId}/download-url";
    private static final String URL_SERVICE = "movie-api";

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        private Companion() {
        }
    }

    public final Object fetchNewDownloadUrl(String str, String str2, String str3, Object obj, g51<? super n99> g51Var) {
        LinkedHashMap linkedHashMapO = b.O(new Pair("playId", str));
        LinkedHashMap linkedHashMapO2 = b.O(new Pair("quality", str2));
        if (str3 != null) {
            if (f88.n0(str3)) {
                str3 = null;
            }
            if (str3 != null) {
                linkedHashMapO2.put("refId", str3);
            }
        }
        z57 z57VarCreateRequestUrl = createRequestUrl(URL_SERVICE, URL_PATH_DOWNLOAD_URL, linkedHashMapO, getCommonQueryParam(linkedHashMapO2));
        Type type = new TypeToken<MovieDownloadUrlResponse>() { // from class: ir.mservices.market.movie.download.core.url.MovieDownloadUrlService.fetchNewDownloadUrl.2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.v(this, type, z57VarCreateRequestUrl, obj, g51Var, 504);
    }
}
