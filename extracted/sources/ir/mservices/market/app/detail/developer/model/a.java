package ir.mservices.market.app.detail.developer.model;

import defpackage.bp2;
import defpackage.ol1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol1 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(ol1 ol1Var, String str, Object obj, int i) {
        this.a = i;
        this.b = ol1Var;
        this.c = str;
        this.d = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new ir.mservices.market.model.paging.a(new DeveloperRepositoryImpl$getDeveloperAppsByPackageName$1$1(this.b, this.c, this.d, null), null);
            default:
                return new ir.mservices.market.model.paging.a(new DeveloperRepositoryImpl$getDeveloperAppsById$1$1(this.b, this.c, this.d, null), null);
        }
    }
}
