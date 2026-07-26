package ir.mservices.market.version2.services;

import android.text.TextUtils;
import com.android.volley.Request$Priority;
import defpackage.bn6;
import defpackage.dr1;
import defpackage.en;
import defpackage.eq;
import defpackage.f88;
import defpackage.gb8;
import defpackage.gd1;
import defpackage.h32;
import defpackage.hy2;
import defpackage.ie5;
import defpackage.is1;
import defpackage.j2;
import defpackage.lw;
import defpackage.nk3;
import defpackage.o2;
import defpackage.oe5;
import defpackage.pa2;
import defpackage.pe5;
import defpackage.pr;
import defpackage.t15;
import defpackage.u4;
import defpackage.ur4;
import defpackage.v4;
import defpackage.vp7;
import defpackage.xv2;
import defpackage.z57;
import defpackage.zg3;
import defpackage.zv2;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.version2.activity.InAppPurchaseActivity;
import ir.mservices.market.version2.activity.WebViewActivityImpl.InAppPurchaseWebview;
import ir.mservices.market.version2.fragments.IbexFragment;
import ir.mservices.market.version2.webapi.requestdto.AppPaymentRequestDto;
import ir.mservices.market.version2.webapi.requestdto.ApplicationSkusRequestDto;
import ir.mservices.market.version2.webapi.requestdto.DownloadUriRequestDto;
import ir.mservices.market.version2.webapi.requestdto.InAppPaymentRequestDto;
import ir.mservices.market.version2.webapi.requestdto.LikeAppRequestDto;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends o2 {
    public dr1 a;

    public final void g(String str, int i, String str2, String str3, String str4, String str5, String str6, boolean z, en enVar, gd1 gd1Var) {
        lw.d(null, null, enVar);
        lw.d(null, null, gd1Var);
        lw.d(null, null, str);
        HashMap map = new HashMap();
        map.put("packageName", str);
        HashMap map2 = new HashMap();
        map2.put("versionCode", String.valueOf(i));
        if (!TextUtils.isEmpty(str3)) {
            map2.put("tag", str3);
        }
        map2.put("refId", (str2 == null || f88.n0(str2)) ? "ClientUnknown" : str2);
        lw.f(null, "download finish refId must not be empty", !TextUtils.isEmpty(str2));
        if (!TextUtils.isEmpty(str4)) {
            map2.put("hsh", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            map2.put("type", str5);
        }
        lw.b("downloadRef must not be empty", null, TextUtils.isEmpty(str6));
        if (!TextUtils.isEmpty(str6)) {
            map2.put("buttonPlace", str6);
        }
        map2.put("isUpdate", String.valueOf(z));
        xv2 xv2Var = new xv2(1, createRequestUrl("v1/applications", "{packageName}/downloadfinished", map, getCommonQueryParam(map2)), new hy2(28), Request$Priority.a, false, null, createVolleyErrorListener(gd1Var), createVolleySuccessListener(enVar, gd1Var), false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$14().getType();
        performRequest(xv2Var, gd1Var);
    }

    public final void h(String str, String str2, oe5 oe5Var, oe5 oe5Var2) {
        lw.d(null, null, oe5Var);
        lw.d(null, null, oe5Var2);
        HashMap map = new HashMap();
        map.put("packageName", str);
        map.put("purchaseToken", str2);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/applications", "{packageName}/purchases/{purchaseToken}/consume", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(oe5Var, oe5Var2);
        xv2 xv2Var = new xv2(2, z57VarCreateRequestUrl, new eq(29), Request$Priority.b, false, null, createVolleyErrorListener(oe5Var2), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$2().getType();
        performRequest(xv2Var, oe5Var2);
    }

    public final void i(String str, String str2, long j, pa2 pa2Var, t15 t15Var) {
        lw.d(null, null, pa2Var);
        lw.d(null, null, t15Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            map2.put("accountId", str2);
        }
        map2.put("nonce", j + "");
        xv2 xv2Var = new xv2(0, createRequestUrl("v1/applications", "{packageName}/license", map, getCommonQueryParam(map2)), null, Request$Priority.d, true, "", createVolleyErrorListener(t15Var), createVolleySuccessListener(pa2Var, t15Var), false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$15().getType();
        performRequest(xv2Var, t15Var);
    }

    public final void j(String str, String str2, String str3, boolean z, boolean z2, String str4, pr prVar, j2 j2Var) {
        lw.d(null, null, prVar);
        lw.d(null, null, j2Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        AppPaymentRequestDto appPaymentRequestDto = new AppPaymentRequestDto(str2, str3, z, String.valueOf(z2), str4);
        z57 z57VarCreateRequestUrl = createRequestUrl("v2/applications", "{packageName}/payment-configs/purchase-app", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(prVar, j2Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, appPaymentRequestDto, Request$Priority.b, false, "PURCHASE_APPLICATION_REQUEST_TAG", createVolleyErrorListener(j2Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$11().getType();
        performRequest(xv2Var, j2Var);
    }

    public final void k(String str, Integer num, ur4 ur4Var, ie5 ie5Var) {
        lw.d(null, null, ur4Var);
        lw.d(null, null, ie5Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        HashMap map2 = new HashMap();
        map2.put("currentVersionCode", num + "");
        xv2 xv2Var = new xv2(0, createRequestUrl("v1/applications", "{packageName}", map, getCommonQueryParam(map2)), null, Request$Priority.b, true, "GET_APP_VERSION_DESCRIPTION_TAG", createVolleyErrorListener(ie5Var), createVolleySuccessListener(ur4Var, ie5Var), false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$16().getType();
        performRequest(xv2Var, ie5Var);
    }

    public final void l(String str, IbexFragment ibexFragment, zg3 zg3Var, zg3 zg3Var2) {
        lw.d(null, null, zg3Var);
        lw.d(null, null, zg3Var2);
        HashMap map = new HashMap();
        map.put("packageName", str);
        HashMap map2 = new HashMap();
        if (!TextUtils.isEmpty(null)) {
            map2.put("currentApkHash", null);
            lw.f(null, null, false);
        }
        z57 z57VarCreateRequestUrl = createRequestUrl("v2/applications", "{packageName}", map, getCommonQueryParam(map2));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(zg3Var, zg3Var2);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.b, true, ibexFragment, createVolleyErrorListener(zg3Var2), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$7().getType();
        performRequest(xv2Var, zg3Var2);
    }

    public final void m(String str, vp7 vp7Var, bn6 bn6Var, Integer num, String str2, String str3, int i, float f, String str4, long j) {
        lw.d(null, null, vp7Var);
        lw.d(null, null, bn6Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        HashMap map2 = new HashMap();
        map2.put("mhw", Integer.toString(i));
        map2.put("dp", Float.toString(f));
        map2.put("pref", str4);
        map2.put("showNotification", String.valueOf(!ir.mservices.market.core.notification.a.d(((ir.mservices.market.core.notification.a) this.a.get()).i, "download")));
        if (num != null) {
            map2.put("currentVersionCode", num + "");
        }
        if (!TextUtils.isEmpty(str2)) {
            map2.put("refId", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            map2.put("data", str3);
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("q", null);
        }
        if (!TextUtils.isEmpty(null)) {
            map2.put("caller", null);
        }
        map2.put("currentSize", String.valueOf(j));
        xv2 xv2Var = new xv2(0, createRequestUrl("v2/applications", "{packageName}", map, getCommonQueryParam(map2)), null, Request$Priority.b, true, "APPLICATION_REQUEST_TAG", createVolleyErrorListener(bn6Var), createVolleySuccessListener(vp7Var, bn6Var), false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$5().getType();
        performRequest(xv2Var, bn6Var);
    }

    public final void n(String str, ApplicationSkusRequestDto applicationSkusRequestDto, pe5 pe5Var, pe5 pe5Var2) {
        lw.d(null, null, pe5Var);
        lw.d(null, null, pe5Var2);
        HashMap map = new HashMap();
        map.put("packageName", str);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/applications", "{packageName}/purchases/skus", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(pe5Var, pe5Var2);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, applicationSkusRequestDto, Request$Priority.b, false, null, createVolleyErrorListener(pe5Var2), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$3().getType();
        performRequest(xv2Var, pe5Var2);
    }

    public final void o(String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, String str6, int i, Integer num, InAppPurchaseActivity inAppPurchaseActivity, nk3 nk3Var, v4 v4Var) {
        lw.d(null, null, nk3Var);
        lw.d(null, null, v4Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        InAppPaymentRequestDto inAppPaymentRequestDto = new InAppPaymentRequestDto(str2, str3, str4, z, String.valueOf(z2), str5, str6, i, num);
        z57 z57VarCreateRequestUrl = createRequestUrl("v2/applications", "{packageName}/payment-configs/purchase-in-app", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(nk3Var, v4Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, inAppPaymentRequestDto, Request$Priority.b, false, inAppPurchaseActivity, createVolleyErrorListener(v4Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$12().getType();
        performRequest(xv2Var, v4Var);
    }

    public final void p(String str, String str2, String str3, InAppPurchaseWebview inAppPurchaseWebview, gb8 gb8Var, h32 h32Var) {
        lw.d(null, null, gb8Var);
        lw.d(null, null, h32Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        if (!TextUtils.isEmpty(str2)) {
            map.put("accountId", str2);
        }
        HashMap map2 = new HashMap();
        map2.put("type", str3);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/applications", "{packageName}/purchases/{accountId}", map, getCommonQueryParam(map2));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(gb8Var, h32Var);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.b, true, inAppPurchaseWebview, createVolleyErrorListener(h32Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$4().getType();
        performRequest(xv2Var, h32Var);
    }

    public final void q(String str, String str2, LikeAppRequestDto likeAppRequestDto, CommentViewModel commentViewModel, en enVar, ir.mservices.market.common.comment.a aVar) {
        lw.d(null, null, enVar);
        lw.d(null, null, aVar);
        HashMap map = new HashMap();
        map.put("packageName", str);
        map.put("reviewId", str2);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/applications", "{packageName}/reviews/{reviewId}/likes", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(enVar, aVar);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, likeAppRequestDto, Request$Priority.b, false, commentViewModel, createVolleyErrorListener(aVar), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$8().getType();
        performRequest(xv2Var, aVar);
    }

    public final void r(String str, DownloadUriRequestDto downloadUriRequestDto, is1 is1Var, u4 u4Var) {
        lw.d(null, null, is1Var);
        lw.d(null, null, u4Var);
        HashMap map = new HashMap();
        map.put("packageName", str);
        z57 z57VarCreateRequestUrl = createRequestUrl("v2/applications", "{packageName}/uri", map, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(is1Var, u4Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, downloadUriRequestDto, Request$Priority.b, false, null, createVolleyErrorListener(u4Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new AppService$9().getType();
        performRequest(xv2Var, u4Var);
    }
}
