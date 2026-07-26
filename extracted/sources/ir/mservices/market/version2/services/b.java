package ir.mservices.market.version2.services;

import android.text.TextUtils;
import com.android.volley.Request$Priority;
import defpackage.ck4;
import defpackage.j2;
import defpackage.jx8;
import defpackage.lw;
import defpackage.o2;
import defpackage.r2;
import defpackage.u4;
import defpackage.ub1;
import defpackage.ul1;
import defpackage.v4;
import defpackage.vo4;
import defpackage.xv2;
import defpackage.z57;
import defpackage.zv2;
import ir.mservices.market.version2.webapi.requestdto.LoginPinRequestDto;
import ir.mservices.market.version2.webapi.requestdto.ReferrerRequestDTO;
import ir.mservices.market.version2.webapi.requestdto.UnbindAllRequestDto;
import java.util.HashMap;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends o2 {
    public final void g(String str, Object obj, j2 j2Var, v4 v4Var) {
        lw.d(null, null, j2Var);
        lw.d(null, null, v4Var);
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            map.put("accountId", str);
        }
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/accounts", "{accountId}/info", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(j2Var, v4Var);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.b, true, obj, createVolleyErrorListener(v4Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AccountService$4().getType();
        performRequest(xv2Var, v4Var);
    }

    public final void h(String str, String str2, String str3, String str4, Object obj, LoginPinRequestDto loginPinRequestDto, u4 u4Var, r2 r2Var) {
        lw.d(null, null, u4Var);
        lw.d(null, null, r2Var);
        HashMap map = new HashMap();
        Pattern pattern = ul1.a;
        map.put("emailOrPhone", ub1.F(str2));
        if (!TextUtils.isEmpty(str)) {
            map.put("accountId", str);
        }
        HashMap map2 = new HashMap();
        map2.put("androidId", str3);
        if (!TextUtils.isEmpty(str4)) {
            map2.put("source", str4);
        }
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/accounts", "{accountId}/{emailOrPhone}/pin", map, getCommonQueryParam(map2));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(u4Var, r2Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, loginPinRequestDto, Request$Priority.b, false, obj, createVolleyErrorListener(r2Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AccountService$3().getType();
        performRequest(xv2Var, r2Var);
    }

    public final void i(String str, ReferrerRequestDTO referrerRequestDTO, vo4 vo4Var, ck4 ck4Var) {
        lw.d(null, null, vo4Var);
        lw.d(null, null, ck4Var);
        HashMap map = new HashMap();
        map.put("accountId", str);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/accounts", "{accountId}/referrer", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(vo4Var, ck4Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, referrerRequestDTO, Request$Priority.b, false, null, createVolleyErrorListener(ck4Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AccountService$2().getType();
        performRequest(xv2Var, ck4Var);
    }

    public final void j(String str, String str2, UnbindAllRequestDto unbindAllRequestDto, j2 j2Var, jx8 jx8Var) {
        lw.d(null, null, j2Var);
        lw.d(null, null, jx8Var);
        HashMap map = new HashMap();
        map.put("accountId", str);
        HashMap map2 = new HashMap();
        map2.put("androidId", str2);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/accounts", "{accountId}/unbind/all", map, getCommonQueryParam(map2));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(j2Var, jx8Var);
        xv2 xv2Var = new xv2(2, z57VarCreateRequestUrl, unbindAllRequestDto, Request$Priority.b, false, "REQUEST_TAG_UNBIND_ALL", createVolleyErrorListener(jx8Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AccountService$1().getType();
        performRequest(xv2Var, jx8Var);
    }
}
