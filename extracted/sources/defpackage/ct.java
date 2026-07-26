package defpackage;

import com.android.volley.Request$Priority;
import com.google.gson.reflect.TypeToken;
import ir.mservices.market.version2.webapi.requestdto.AppStorageRequestDTO;
import ir.mservices.market.version2.webapi.responsedto.AppStorageDto;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes3.dex */
public final class ct extends o2 {
    public final void g(String str, je5 je5Var, ie5 ie5Var) {
        js3.p(str, "packageName");
        xv2 xv2Var = new xv2(0, createRequestUrl("v1/app-storage", "{packageName}", b.O(new Pair("packageName", str)), getCommonQueryParam()), null, Request$Priority.b, false, null, createVolleyErrorListener(ie5Var), createVolleySuccessListener(je5Var, ie5Var), false);
        xv2Var.u = false;
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new TypeToken<AppStorageDto>() { // from class: ir.mservices.market.version2.services.AppStorageService$loadData$gsonRequest$1$1
        }.getType();
        performRequest(xv2Var, ie5Var);
    }

    public final void h(String str, AppStorageRequestDTO appStorageRequestDTO, je5 je5Var, ie5 ie5Var) {
        js3.p(str, "packageName");
        xv2 xv2Var = new xv2(2, createRequestUrl("v1/app-storage", "{packageName}", b.O(new Pair("packageName", str)), getCommonQueryParam()), appStorageRequestDTO, Request$Priority.b, false, null, createVolleyErrorListener(ie5Var), createVolleySuccessListener(je5Var, ie5Var), false);
        xv2Var.u = false;
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new TypeToken<ResultDTO>() { // from class: ir.mservices.market.version2.services.AppStorageService$saveData$gsonRequest$1$1
        }.getType();
        performRequest(xv2Var, ie5Var);
    }
}
