package defpackage;

import android.net.Uri;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.app.detail.ui.Utm;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class jp extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) throws UnsupportedEncodingException {
        String strG;
        String str = "";
        js3.p(er3Var, "intentFragmentFactory");
        Uri data = q0Var.b.getData();
        String queryParameter = data != null ? data.getQueryParameter("id") : null;
        if (queryParameter == null || f88.n0(queryParameter)) {
            strG = null;
        } else {
            Regex regex = new Regex("[^A-Za-z0-9_.]");
            String strDecode = URLDecoder.decode(queryParameter, "UTF-8");
            js3.o(strDecode, "decode(...)");
            strG = regex.g(strDecode);
        }
        String strP = js8.p(q0Var.b.getData(), "refId");
        if (strG == null || f88.n0(strG)) {
            return null;
        }
        try {
            Uri data2 = q0Var.b.getData();
            String queryParameter2 = data2 != null ? data2.getQueryParameter("ls") : null;
            if (queryParameter2 != null) {
                str = queryParameter2;
            }
        } catch (Exception unused) {
        }
        String str2 = str;
        Uri data3 = q0Var.b.getData();
        String queryParameter3 = data3 != null ? data3.getQueryParameter("deeplink") : null;
        String str3 = q0Var.l;
        Uri data4 = q0Var.b.getData();
        String queryParameter4 = data4 != null ? data4.getQueryParameter("utm_source") : null;
        Uri data5 = q0Var.b.getData();
        String queryParameter5 = data5 != null ? data5.getQueryParameter("utm_medium") : null;
        Uri data6 = q0Var.b.getData();
        String queryParameter6 = data6 != null ? data6.getQueryParameter("utm_campaign") : null;
        Uri data7 = q0Var.b.getData();
        String queryParameter7 = data7 != null ? data7.getQueryParameter("utm_content") : null;
        Uri data8 = q0Var.b.getData();
        return new dr3(new NavIntentDirections.AppDetail(new hp(strG, false, new Tracker(LinkDTO.LINK_TYPE_EXTERNAL_LINK, strP, "app"), false, null, str2, null, null, null, new Utm(queryParameter4, data8 != null ? data8.getQueryParameter("utm_term") : null, queryParameter7, queryParameter6, queryParameter5), str3, queryParameter3, null)));
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        return super.b(q0Var) && m88.T(q0Var.c(), q0Var.b(rs6.external_intent_filters_host_details), true);
    }
}
