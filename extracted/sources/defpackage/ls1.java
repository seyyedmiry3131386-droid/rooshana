package defpackage;

import android.os.Looper;
import android.text.TextUtils;
import ir.mservices.market.version2.manager.serverUrl.downloadserver.a;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ls1 extends ow7 {
    public final /* synthetic */ ps1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ls1(ps1 ps1Var) {
        super(2);
        this.f = ps1Var;
    }

    @Override // defpackage.ow7
    public final Object K(Object[] objArr) {
        String str;
        a aVar = this.f.d;
        List<String> list = ((List[]) objArr)[0];
        aVar.getClass();
        lw.b(null, null, list.isEmpty());
        if (zk8.b <= 0) {
            zk8.b = Looper.getMainLooper().getThread().getId();
        }
        lw.f(null, null, Thread.currentThread().getId() == zk8.b);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                str = "";
                break;
            }
            str = (String) it.next();
            Long l = (Long) aVar.b.get(str);
            if (l == null || l.longValue() == 0) {
                break;
            }
            if (System.currentTimeMillis() - l.longValue() > 3600000) {
                aVar.b.put(str, 0L);
                break;
            }
        }
        if (TextUtils.isEmpty(str)) {
            str = (String) list.get(0);
        }
        for (String str2 : list) {
            if (!aVar.b.containsKey(str2)) {
                aVar.b.put(str2, 0L);
            }
        }
        aVar.a();
        return str;
    }
}
