package defpackage;

import ir.myket.persistent.datasource.a;
import ir.myket.persistent.datasource.b;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class j10 {
    public final a a;

    public j10(a aVar) {
        this.a = aVar;
    }

    public final String a() {
        a aVar = this.a;
        b bVar = aVar.d;
        ox3[] ox3VarArr = a.n;
        String str = (String) bVar.a(aVar, ox3VarArr[2]);
        if (str != null) {
            if (f88.n0(str)) {
                str = null;
            }
            if (str != null) {
                return str;
            }
        }
        String string = UUID.randomUUID().toString();
        js3.o(string, "toString(...)");
        bVar.b(aVar, ox3VarArr[2], string);
        return string;
    }
}
