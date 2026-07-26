package ir.mservices.market.version2.manager.serverUrl;

import com.google.gson.JsonParseException;
import defpackage.lu7;
import defpackage.lw;
import defpackage.qs;
import defpackage.vv2;
import ir.mservices.market.version2.webapi.responsedto.ServerUrlDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final vv2 c = new vv2();
    public qs a;
    public final lu7 b;

    public a(lu7 lu7Var) {
        qs qsVar;
        this.b = lu7Var;
        String strF = lu7Var.f(lu7.C, null);
        vv2 vv2Var = c;
        if (strF == null) {
            qsVar = null;
        } else {
            try {
                qsVar = (qs) vv2Var.c(strF, qs.class);
            } catch (JsonParseException e) {
                lw.g(e, null, null);
                qsVar = null;
            }
        }
        this.a = qsVar;
        if (qsVar == null) {
            try {
                this.a = qs.b((ServerUrlDTO) vv2Var.c("{\"asl\":[\"https://apiserver.myket.ir\",\"https://apiserver236.myket.ir\",\"https://apiserver216.myket.ir\"],\"serviceServerLists\":[{\"serviceList\":[\"profiles\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"social\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"articles\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"mynet\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"mapi\"],\"serverList\":[\"https://plus.myket.ir\"]},{\"serviceList\":[\"onesignal\"],\"serverList\":[\"https://onesignal.myket.ir\"]},{\"serviceList\":[\"movie-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"reel-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"purchase-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"subscription\"],\"serverList\":[\"https://kai.myket.ir\"]},{\"serviceList\":[\"financial\"],\"serverList\":[\"https://paygiri.myket.ir\"]},{\"serviceList\":[\"user/supports\"],\"serverList\":[\"https://paygiri.myket.ir\"]}]}", ServerUrlDTO.class), null);
            } catch (AppServersModel$AppServersParseException e2) {
                throw new RuntimeException("Init app servers (in gradle) are not correct, init app servers = {\"asl\":[\"https://apiserver.myket.ir\",\"https://apiserver236.myket.ir\",\"https://apiserver216.myket.ir\"],\"serviceServerLists\":[{\"serviceList\":[\"profiles\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"social\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"articles\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"mynet\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"mapi\"],\"serverList\":[\"https://plus.myket.ir\"]},{\"serviceList\":[\"onesignal\"],\"serverList\":[\"https://onesignal.myket.ir\"]},{\"serviceList\":[\"movie-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"reel-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"purchase-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"subscription\"],\"serverList\":[\"https://kai.myket.ir\"]},{\"serviceList\":[\"financial\"],\"serverList\":[\"https://paygiri.myket.ir\"]},{\"serviceList\":[\"user/supports\"],\"serverList\":[\"https://paygiri.myket.ir\"]}]}", e2);
            }
        }
    }

    public final void a(qs qsVar) {
        lw.d(null, null, qsVar);
        try {
            this.b.i(lu7.C, c.g(qsVar, new AppServersStorage$1().getType()));
        } catch (JsonParseException e) {
            lw.g(e, null, null);
        }
    }
}
