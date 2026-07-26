package ir.mservices.market.version2.services;

import android.text.TextUtils;
import com.android.volley.Request$Priority;
import defpackage.bg5;
import defpackage.br3;
import defpackage.c35;
import defpackage.ck4;
import defpackage.cr3;
import defpackage.gb8;
import defpackage.h32;
import defpackage.hl5;
import defpackage.lw;
import defpackage.o2;
import defpackage.o40;
import defpackage.rm7;
import defpackage.t15;
import defpackage.vj3;
import defpackage.xv2;
import defpackage.z57;
import defpackage.zv2;
import ir.mservices.market.version2.webapi.requestdto.GrabberRequestDto;
import ir.mservices.market.version2.webapi.requestdto.SpixRequestDto;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends o2 {
    public final void g(String str, Object obj, gb8 gb8Var, h32 h32Var) {
        lw.d(null, null, gb8Var);
        lw.d(null, null, h32Var);
        lw.c(str, null);
        z57 z57Var = new z57(rm7.m('/', "https://www.aparat.com/etc/api/video/videohash/", str));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(gb8Var, h32Var);
        xv2 xv2Var = new xv2(0, z57Var, null, Request$Priority.a, true, obj, createVolleyErrorListener(h32Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.u = false;
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new GeneralService$4().getType();
        performRequest(xv2Var, h32Var);
    }

    public final void h(bg5 bg5Var, bg5 bg5Var2) {
        lw.d(null, null, bg5Var);
        lw.d(null, null, bg5Var2);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/version", null, null, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(bg5Var, bg5Var2);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.a, true, null, createVolleyErrorListener(bg5Var2), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new GeneralService$2().getType();
        performRequest(xv2Var, bg5Var2);
    }

    public final void i(ck4 ck4Var, hl5 hl5Var) {
        lw.d(null, null, ck4Var);
        lw.d(null, null, hl5Var);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/apiservers", null, null, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(ck4Var, hl5Var);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.b, true, null, createVolleyErrorListener(hl5Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new GeneralService$1().getType();
        performRequest(xv2Var, hl5Var);
    }

    public final void j(String str, String str2, Object obj, br3 br3Var, vj3 vj3Var) {
        lw.d(null, null, br3Var);
        lw.d(null, null, vj3Var);
        HashMap map = new HashMap();
        if (!TextUtils.isEmpty(str2)) {
            map.put("advertiseId", str2);
        }
        map.put("identifier", str);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/starter", null, null, getCommonQueryParam(map));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(br3Var, vj3Var);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.b, true, obj, createVolleyErrorListener(vj3Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap<>());
        xv2Var.w = new GeneralService$7().getType();
        performRequest(xv2Var, vj3Var);
    }

    public final void k(t15 t15Var, c35 c35Var) {
        lw.d(null, null, t15Var);
        lw.d(null, null, c35Var);
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/trackingconfigs", null, null, getCommonQueryParam());
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(t15Var, c35Var);
        xv2 xv2Var = new xv2(0, z57VarCreateRequestUrl, null, Request$Priority.b, true, null, createVolleyErrorListener(c35Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new GeneralService$3().getType();
        performRequest(xv2Var, c35Var);
    }

    public final void l(GrabberRequestDto grabberRequestDto, br3 br3Var, cr3 cr3Var) {
        z57 z57VarCreateRequestUrl = createRequestUrl("v1/grabber", null, null, null);
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(br3Var, cr3Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, grabberRequestDto, Request$Priority.b, false, null, createVolleyErrorListener(cr3Var), zv2VarCreateVolleySuccessListener, false);
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new GeneralService$10().getType();
        performRequest(xv2Var, null);
    }

    public final void m(String str, SpixRequestDto spixRequestDto) {
        z57 z57Var = new z57(o40.y("https://spix.myket.ir/", str, "/"));
        zv2 zv2VarCreateVolleySuccessListener = createVolleySuccessListener(null, null, true);
        xv2 xv2Var = new xv2(1, z57Var, spixRequestDto, Request$Priority.a, false, null, createVolleyErrorListener(null), zv2VarCreateVolleySuccessListener, false);
        xv2Var.u = false;
        xv2Var.p = getHeaders(new HashMap());
        xv2Var.w = new GeneralService$9().getType();
        performRequest(xv2Var, null);
    }
}
