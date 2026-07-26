package defpackage;

import android.net.Uri;
import ir.mservices.market.app.detail.ui.Tracker;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class zp extends z {
    @Override // defpackage.r0
    public final dr3 a(er3 er3Var, q0 q0Var) throws UnsupportedEncodingException {
        String strG;
        js3.p(er3Var, "intentFragmentFactory");
        Uri data = q0Var.b.getData();
        String queryParameter = data != null ? data.getQueryParameter("id") : null;
        if (queryParameter == null || f88.n0(queryParameter)) {
            String strC = q0Var.c();
            if (strC != null) {
                if (!f88.c0(strC, "myket.ir", false)) {
                    strC = null;
                }
                if (strC != null) {
                    return new dr3(new NavIntentDirections.Main());
                }
            }
        } else {
            if (f88.n0(queryParameter)) {
                strG = null;
            } else {
                Regex regex = new Regex("[^A-Za-z0-9_.]");
                String strDecode = URLDecoder.decode(queryParameter, "UTF-8");
                js3.o(strDecode, "decode(...)");
                strG = regex.g(strDecode);
            }
            if (strG != null) {
                return new dr3(new NavIntentDirections.AppDetail(new hp(strG, false, new Tracker(LinkDTO.LINK_TYPE_EXTERNAL_LINK, "R1N0b3Jl", "app"), false, null, "R1N0b3Jl", null, null, null, null, null, null, null)));
            }
        }
        return null;
    }

    @Override // defpackage.z, defpackage.r0
    public final boolean b(q0 q0Var) {
        if (!super.b(q0Var)) {
            return false;
        }
        if (!m88.T(q0Var.c(), q0Var.b(rs6.play_domain), true)) {
            if (!m88.T(q0Var.c(), q0Var.b(rs6.market_domain), true)) {
                return false;
            }
            List listD = q0Var.d();
            if (listD == null || listD.indexOf(q0Var.b(rs6.external_intent_filters_host_details)) == -1) {
                listD = null;
            }
            if (listD == null) {
                return false;
            }
        }
        return true;
    }
}
