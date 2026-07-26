package defpackage;

import ir.myket.network.server.a;
import ir.myket.network.server.b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cp7 {
    public final a a;
    public final int b;
    public final ArrayList c;
    public int d;
    public int e;
    public String f;

    public cp7(a aVar, int i, ArrayList arrayList, int i2, String str) {
        js3.p(aVar, "appServersStorage");
        js3.p(str, "logName");
        this.a = aVar;
        this.b = i;
        this.c = arrayList;
        this.d = i2;
        lw.f(null, null, i2 >= 0 && i2 < arrayList.size());
        a(this.d);
    }

    public final void a(int i) {
        int i2 = this.d;
        ArrayList arrayList = this.c;
        if (i2 >= 0) {
            b bVar = (b) arrayList.get(i2);
            bVar.getClass();
            if (!bVar.b.remove(this)) {
                bVar.toString();
            }
        }
        this.d = i;
        b bVar2 = (b) arrayList.get(i);
        bVar2.getClass();
        if (!bVar2.b.addIfAbsent(this)) {
            bVar2.toString();
        }
        this.f = bVar2.a;
        bVar2.toString();
    }
}
