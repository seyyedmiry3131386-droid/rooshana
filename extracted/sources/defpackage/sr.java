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
public final class sr {
    public final tr a;

    public sr(tr trVar) {
        js3.p(trVar, "appProfileService");
        this.a = trVar;
    }

    public final Object a(String str, Object obj, SuspendLambda suspendLambda) {
        tr trVar = this.a;
        trVar.getClass();
        z57 z57VarCreateRequestUrl = trVar.createRequestUrl("social", "v1/profiles/own/custom-app-lists/{listType}", b.O(new Pair("listType", str)), trVar.getCommonQueryParam());
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.social.profile.list.app.service.AppProfileService$deleteAppList$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.r(trVar, type, z57VarCreateRequestUrl, null, obj, suspendLambda);
    }

    public final Object b(Object obj, ContinuationImpl continuationImpl, boolean z) {
        tr trVar = this.a;
        trVar.getClass();
        z57 z57VarCreateRequestUrl = trVar.createRequestUrl("social", "v1/profiles/own/custom-app-lists/policies", null, trVar.getCommonQueryParam(b.O(new Pair(PackageListMetaDataDTO.KEY_ACTION, z ? AppStatusDto.Type.UPDATE : AppStatusDto.Type.ADD))));
        Type type = new TypeToken<SocialListPolicies>() { // from class: ir.mservices.market.social.profile.list.app.service.AppProfileService$getAppListPolicies$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.v(trVar, type, z57VarCreateRequestUrl, obj, continuationImpl, 504);
    }

    public final Object c(String str, String str2, ReportListType reportListType, Object obj, SuspendLambda suspendLambda) {
        ReportListRequestDto reportListRequestDto = new ReportListRequestDto(reportListType.getValue());
        tr trVar = this.a;
        trVar.getClass();
        z57 z57VarCreateRequestUrl = trVar.createRequestUrl("social", "v1/profiles/{accountKey}/custom-app-lists/{listType}/inappropriate", b.O(new Pair("accountKey", str), new Pair("listType", str2)), trVar.getCommonQueryParam());
        Type type = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.social.profile.list.app.service.AppProfileService$reportAppList$2
        }.getType();
        js3.o(type, "getType(...)");
        js3.m(z57VarCreateRequestUrl);
        return dy3.I(trVar, type, z57VarCreateRequestUrl, reportListRequestDto, obj, null, suspendLambda, 496);
    }
}
