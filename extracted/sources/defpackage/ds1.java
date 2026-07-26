package defpackage;

import android.net.Uri;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class ds1 extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) throws UnsupportedEncodingException {
        Object obj;
        String queryParameter;
        List listE;
        String strG;
        js3.p(er3Var, "intentFragmentFactory");
        Uri data = q0Var.b.getData();
        String queryParameter2 = data != null ? data.getQueryParameter("deeplink") : null;
        String str = q0Var.l;
        Utm utm = new Utm(null, 31);
        Map mapF = q0Var.f();
        if (mapF != null) {
            obj = mapF.get("package");
            queryParameter = js8.p(q0Var.b.getData(), "refId");
            utm.a = (String) mapF.get("utm_source");
            utm.e = (String) mapF.get("utm_medium");
            utm.d = (String) mapF.get("utm_campaign");
            utm.c = (String) mapF.get("utm_content");
            utm.b = (String) mapF.get("utm_term");
        } else {
            obj = null;
            queryParameter = null;
        }
        CharSequence charSequence = (CharSequence) obj;
        if ((charSequence == null || charSequence.length() == 0) && (listE = q0Var.e()) != null && !listE.isEmpty()) {
            List listE2 = q0Var.e();
            obj = listE2 != null ? (String) a.q0(0, listE2) : null;
            Uri data2 = q0Var.b.getData();
            if (data2 != null) {
                queryParameter = data2.getQueryParameter("refId");
                utm.a = data2.getQueryParameter("utm_source");
                utm.e = data2.getQueryParameter("utm_medium");
                utm.d = data2.getQueryParameter("utm_campaign");
                utm.c = data2.getQueryParameter("utm_content");
                utm.b = data2.getQueryParameter("utm_term");
            }
        }
        String str2 = (String) obj;
        if (str2 == null || f88.n0(str2)) {
            strG = null;
        } else {
            Regex regex = new Regex("[^A-Za-z0-9_.]");
            String strDecode = URLDecoder.decode(str2, "UTF-8");
            js3.o(strDecode, "decode(...)");
            strG = regex.g(strDecode);
        }
        if (strG != null) {
            String str3 = !f88.n0(strG) ? strG : null;
            if (str3 != null) {
                Tracker tracker = new Tracker(LinkDTO.LINK_TYPE_EXTERNAL_LINK, queryParameter, "download");
                if (queryParameter == null || f88.n0(queryParameter)) {
                    queryParameter = "OpenIntent";
                }
                return new dr3(new NavIntentDirections.AppDetail(new hp(str3, true, tracker, false, null, queryParameter, null, null, null, utm, str, queryParameter2, null)));
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_download), true);
    }
}
