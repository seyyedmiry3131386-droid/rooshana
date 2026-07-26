package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class e05 extends o2 {
    public final Object g(Object obj, String str, ContinuationImpl continuationImpl) {
        z57 z57VarCreateRequestUrl = createRequestUrl("movie-api", "v1/bookmarks", null, getCommonQueryParam(b.O(new Pair("movieId", str))));
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.movie.ui.bookmark.services.MovieBookmarkService$deleteBookmarks$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.r(this, type, z57VarCreateRequestUrl, null, obj, continuationImpl);
    }
}
