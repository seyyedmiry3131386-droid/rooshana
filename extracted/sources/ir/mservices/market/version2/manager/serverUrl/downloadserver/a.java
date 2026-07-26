package ir.mservices.market.version2.manager.serverUrl.downloadserver;

import android.text.TextUtils;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import defpackage.bs1;
import defpackage.es1;
import defpackage.lu7;
import defpackage.lw;
import defpackage.nr1;
import defpackage.rk1;
import defpackage.vv2;
import j$.util.Objects;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements nr1 {
    public static final vv2 c;
    public final lu7 a;
    public final Map b;

    static {
        rk1.a("DownloadServerMonitor");
        c = new vv2();
    }

    public a(lu7 lu7Var) {
        this.a = lu7Var;
        Map map = null;
        String strF = lu7Var.f(lu7.D, null);
        if (strF != null) {
            try {
                vv2 vv2Var = c;
                Type type = new DownloadServerMonitor$2().getType();
                vv2Var.getClass();
                map = (Map) vv2Var.b(strF, TypeToken.get(type));
            } catch (JsonParseException e) {
                lw.g(e, null, null);
            }
        }
        map = map == null ? new HashMap() : map;
        map.toString();
        this.b = map;
    }

    public final void a() {
        Map map = this.b;
        try {
            this.a.i(lu7.D, c.g(map, new DownloadServerMonitor$1().getType()));
            Objects.toString(map);
        } catch (JsonParseException e) {
            lw.g(e, null, null);
        }
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        String str;
        if (i != 252) {
            int i2 = es1Var.f;
            int i3 = es1Var.g;
            if (TextUtils.isEmpty(es1Var.b) || i2 != 130) {
                return;
            }
            if (i3 == 1333 || i3 == 1335 || i3 == 1334 || i3 == 136 || i3 == 133 || i3 == 1332) {
                Map map = this.b;
                Iterator it = map.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        str = "";
                        break;
                    } else {
                        str = (String) it.next();
                        if (es1Var.b.startsWith(str)) {
                            break;
                        }
                    }
                }
                map.put(str, Long.valueOf(System.currentTimeMillis()));
                a();
            }
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
    }
}
