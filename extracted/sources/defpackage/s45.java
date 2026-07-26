package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.social.profile.list.data.ReportListRequestDto;
import ir.mservices.market.social.profile.list.data.ReportListType;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.version2.webapi.requestdto.AppStatusDto;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.lang.reflect.Type;
import kotlin.Pair;
import kotlin.collections.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class s45 {
    public final t45 a;

    public s45(t45 t45Var) {
        js3.p(t45Var, "movieProfileService");
        this.a = t45Var;
    }

    public final Object a(String str, Object obj, SuspendLambda suspendLambda) {
        t45 t45Var = this.a;
        t45Var.getClass();
        z57 z57VarCreateRequestUrl = t45Var.createRequestUrl("social", "v1/profiles/own/custom-movie-lists/{listType}", b.O(new Pair("listType", str)), t45Var.getCommonQueryParam());
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.social.profile.list.movie.service.MovieProfileService$deleteMovieList$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.r(t45Var, type, z57VarCreateRequestUrl, null, obj, suspendLambda);
    }

    public final Object b(Object obj, ContinuationImpl continuationImpl, boolean z) {
        t45 t45Var = this.a;
        t45Var.getClass();
        z57 z57VarCreateRequestUrl = t45Var.createRequestUrl("social", "v1/profiles/own/custom-movie-lists/policies", null, t45Var.getCommonQueryParam(b.O(new Pair(PackageListMetaDataDTO.KEY_ACTION, z ? AppStatusDto.Type.UPDATE : AppStatusDto.Type.ADD))));
        Type type = new TypeToken<SocialListPolicies>() { // from class: ir.mservices.market.social.profile.list.movie.service.MovieProfileService$getMovieListPolicies$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.v(t45Var, type, z57VarCreateRequestUrl, obj, continuationImpl, 504);
    }

    public final Object c(String str, String str2, ReportListType reportListType, Object obj, SuspendLambda suspendLambda) {
        ReportListRequestDto reportListRequestDto = new ReportListRequestDto(reportListType.getValue());
        t45 t45Var = this.a;
        t45Var.getClass();
        z57 z57VarCreateRequestUrl = t45Var.createRequestUrl("social", "v1/profiles/{accountKey}/custom-movie-lists/{listType}/inappropriate", b.O(new Pair("accountKey", str), new Pair("listType", str2)), t45Var.getCommonQueryParam());
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.social.profile.list.movie.service.MovieProfileService$reportMovieList$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.I(t45Var, type, z57VarCreateRequestUrl, reportListRequestDto, obj, null, suspendLambda, 496);
    }
}
