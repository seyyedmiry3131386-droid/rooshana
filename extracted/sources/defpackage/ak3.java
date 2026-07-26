package defpackage;

import ir.mservices.market.app.update.common.manager.b;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ak3 implements gb8, h32 {
    public final /* synthetic */ b a;

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        lw.g((SQLException) serializable, null, null);
        l lVar = this.a.c;
        ArrayList arrayList = new ArrayList();
        lVar.getClass();
        lVar.p(null, arrayList);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        this.a.c.o((List) obj);
    }
}
