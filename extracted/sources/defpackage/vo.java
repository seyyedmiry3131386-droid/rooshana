package defpackage;

import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.webapi.responsedto.LinkDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class vo {
    public final String a = NearbyRepository.SERVICE_ID;
    public final String b = LinkDTO.LINK_TYPE_MYKET_INTENT;
    public final String c = LinkDTO.LINK_TYPE_MYKET_INTENT;
    public final String d = "primaryClientProductMyket";
    public final String e = "product";
    public final String f = "alpha";
    public final String g = "";
    public final String h = "";
    public final String i = "";
    public final String j = "{\"asl\":[\"https://apiserver.myket.ir\",\"https://apiserver236.myket.ir\",\"https://apiserver216.myket.ir\"],\"serviceServerLists\":[{\"serviceList\":[\"profiles\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"social\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"articles\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"mynet\"],\"serverList\":[\"https://profile.myket.ir\"]},{\"serviceList\":[\"mapi\"],\"serverList\":[\"https://plus.myket.ir\"]},{\"serviceList\":[\"onesignal\"],\"serverList\":[\"https://onesignal.myket.ir\"]},{\"serviceList\":[\"movie-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"reel-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"purchase-api\"],\"serverList\":[\"https://movies.myket.ir\"]},{\"serviceList\":[\"subscription\"],\"serverList\":[\"https://kai.myket.ir\"]},{\"serviceList\":[\"financial\"],\"serverList\":[\"https://paygiri.myket.ir\"]},{\"serviceList\":[\"user/supports\"],\"serverList\":[\"https://paygiri.myket.ir\"]}]}";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vo)) {
            return false;
        }
        vo voVar = (vo) obj;
        return this.a.equals(voVar.a) && this.b.equals(voVar.b) && this.c.equals(voVar.c) && this.d.equals(voVar.d) && this.e.equals(voVar.e) && this.f.equals(voVar.f) && this.g.equals(voVar.g) && this.h.equals(voVar.h) && this.i.equals(voVar.i) && this.j.equals(voVar.j);
    }

    public final int hashCode() {
        return rm7.k(this.j, (((this.i.hashCode() + rm7.k(this.h, rm7.k(this.g, rm7.k(this.f, rm7.k(this.e, rm7.k(this.d, rm7.k(this.c, rm7.k(this.b, ((this.a.hashCode() * 31) + 1028) * 31, 31), 31), 31), 31), 31), 31), 31)) * 31) + 1231) * 31, 31);
    }

    public final String toString() {
        StringBuilder sbT = rm7.t("AppConfigData(applicationId=", this.a, ", versionCode=1028, platform=", this.b, ", store=");
        o40.I(this.c, ", server=", this.d, ", serverProduct=", sbT);
        o40.I(this.e, ", serverDevelop=", this.f, ", serverMock=", sbT);
        o40.I(this.g, ", baseUrl=", this.h, ", tvBaseUrl=", sbT);
        return dw1.p(this.i, ", isPublishedVersion=true, initAppServers=", this.j, ", tvStoreConfigData=null)", sbT);
    }
}
