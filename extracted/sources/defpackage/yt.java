package defpackage;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yt implements vz8, iz8 {
    public final /* synthetic */ zt a;

    @Override // defpackage.vz8
    public void a(Map map, String str) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zt ztVar = this.a;
        ztVar.j(jCurrentTimeMillis);
        if (ztVar.k) {
            ztVar.i(true);
        }
    }

    @Override // defpackage.iz8
    public void b() {
        zt ztVar = this.a;
        if (ztVar.k) {
            ztVar.i(false);
        }
    }
}
