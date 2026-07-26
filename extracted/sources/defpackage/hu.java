package defpackage;

import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.Map;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class hu extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) throws UnsupportedEncodingException {
        Object next;
        String strG;
        js3.p(er3Var, "intentFragmentFactory");
        Map mapF = q0Var.f();
        if (mapF == null) {
            return null;
        }
        String str = (String) mapF.get("package");
        Iterator it = mapF.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (m88.T((String) next, "refId", true)) {
                break;
            }
        }
        String str2 = (String) next;
        String str3 = str2 != null ? (String) mapF.get(str2) : null;
        String str4 = (String) mapF.get("ls");
        if (str4 == null) {
            str4 = "";
        }
        String str5 = str4;
        String str6 = q0Var.l;
        Utm utm = new Utm((String) mapF.get("utm_source"), (String) mapF.get("utm_term"), (String) mapF.get("utm_content"), (String) mapF.get("utm_campaign"), (String) mapF.get("utm_medium"));
        if (str == null || f88.n0(str)) {
            strG = null;
        } else {
            Regex regex = new Regex("[^A-Za-z0-9_.]");
            String strDecode = URLDecoder.decode(str, "UTF-8");
            js3.o(strDecode, "decode(...)");
            strG = regex.g(strDecode);
        }
        if (strG == null) {
            return null;
        }
        String str7 = !f88.n0(strG) ? strG : null;
        if (str7 != null) {
            return new dr3(new NavIntentDirections.AppDetail(new hp(str7, false, new Tracker(LinkDTO.LINK_TYPE_EXTERNAL_LINK, str3, "app"), false, null, str5, null, null, null, utm, str6, null, null)));
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_application), true);
    }
}
