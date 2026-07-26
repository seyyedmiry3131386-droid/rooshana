package ir.mservices.market.version2.services;

import com.android.volley.Request$Priority;
import defpackage.do3;
import defpackage.gb8;
import defpackage.lw;
import defpackage.o2;
import defpackage.pt2;
import defpackage.xv2;
import defpackage.yq2;
import defpackage.z57;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.webapi.requestdto.AuthorizeRequestDto;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements gb8 {
    public final /* synthetic */ o2 a;

    public a(o2 o2Var) {
        this.a = o2Var;
    }

    @Override // defpackage.gb8
    public final void onSuccess(Object obj) {
        AuthorizeRequestDto authorizeRequestDto = (AuthorizeRequestDto) obj;
        lw.f(null, "authorize count must be 1", o2.authorizeCount == 1);
        o2 o2Var = this.a;
        z57 z57VarCreateRequestUrl = o2Var.createRequestUrl("v1/devices", "authorize", null, null);
        pt2 pt2Var = new pt2(3, o2Var);
        xv2 xv2Var = new xv2(1, z57VarCreateRequestUrl, authorizeRequestDto, Request$Priority.d, false, null, o2Var.createVolleyErrorListener(pt2Var), o2Var.createVolleySuccessListener(new do3(o2Var, authorizeRequestDto), pt2Var), true);
        xv2Var.u = false;
        xv2Var.w = new AbstractService$3$1().getType();
        HashMap map = new HashMap();
        map.put("Myket-Version", String.valueOf(1028));
        map.put("Myket-PackageName", NearbyRepository.SERVICE_ID);
        map.put("Platform", LinkDTO.LINK_TYPE_MYKET_INTENT);
        map.put("X-Device-Type", yq2.c0(o2Var.context));
        map.put("Myket-SessionId", ApplicationLauncher.o.c());
        xv2Var.p = map;
        o2Var.requestProxy.a.a(xv2Var);
    }
}
