package defpackage;

import ir.mservices.market.version2.manager.serverUrl.a;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class xo7 {
    public final String a;
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public int b = 0;

    public xo7(String str) {
        this.a = str;
    }

    public final void a(int i) {
        lw.f(null, null, i > 0);
        this.b += i;
        for (dp7 dp7Var : this.c) {
            int i2 = dp7Var.e + i;
            dp7Var.e = i2;
            if (i2 > dp7Var.a) {
                dp7Var.e = 0;
                ArrayList arrayList = dp7Var.f;
                int i3 = dp7Var.g;
                lw.f(null, null, i3 >= 0 && i3 < arrayList.size());
                if (arrayList.size() > 1) {
                    int i4 = 0;
                    for (int i5 = 1; i5 < arrayList.size(); i5++) {
                        if (((xo7) arrayList.get(i5)).b < ((xo7) arrayList.get(i4)).b) {
                            i4 = i5;
                        }
                    }
                    dp7Var.a(i4);
                    a aVar = dp7Var.d;
                    int i6 = dp7Var.c;
                    int i7 = dp7Var.g;
                    ms msVar = i6 == -1 ? aVar.a.defaultServerList : aVar.a.serviceServerLists.get(i6).serverList;
                    msVar.index = i7;
                    lw.f(null, null, i7 >= 0 && i7 < msVar.servers.size());
                    aVar.a(aVar.a);
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerInfo{url='");
        sb.append(this.a);
        sb.append("', networkErrorWeight=");
        return dw1.q(sb, this.b, '}');
    }
}
