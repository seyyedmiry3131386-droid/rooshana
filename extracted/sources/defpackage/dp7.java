package defpackage;

import ir.mservices.market.version2.manager.serverUrl.a;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class dp7 {
    public final int a;
    public final String b;
    public final int c;
    public final a d;
    public final ArrayList f;
    public int g;
    public int e = 0;
    public String h = null;

    public dp7(a aVar, int i, ArrayList arrayList, int i2, int i3, String str) {
        boolean z = false;
        this.f = null;
        if (i2 >= 0 && i2 < arrayList.size()) {
            z = true;
        }
        lw.f(null, null, z);
        this.d = aVar;
        this.c = i;
        this.f = arrayList;
        this.a = i3;
        this.b = str;
        this.g = -1;
        a(i2);
    }

    public final void a(int i) {
        int i2 = this.g;
        ArrayList arrayList = this.f;
        if (i2 >= 0) {
            xo7 xo7Var = (xo7) arrayList.get(i2);
            if (!xo7Var.c.remove(this)) {
                xo7Var.toString();
                Objects.toString(this);
            }
        }
        this.g = i;
        xo7 xo7Var2 = (xo7) arrayList.get(i);
        CopyOnWriteArrayList copyOnWriteArrayList = xo7Var2.c;
        if (copyOnWriteArrayList.contains(this)) {
            xo7Var2.toString();
            Objects.toString(this);
        } else {
            copyOnWriteArrayList.add(this);
        }
        this.h = xo7Var2.a;
        xo7Var2.toString();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ServerSwitch{LOG_NAME='");
        sb.append(this.b);
        sb.append("', networkErrorWeight=");
        sb.append(this.e);
        sb.append(", serverInfoList=");
        sb.append(this.f);
        sb.append(", currentServerUrl='");
        return dw1.s(sb, this.h, "'}");
    }
}
