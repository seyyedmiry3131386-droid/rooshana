package ir.mservices.market.common.ext.model;

import defpackage.bp2;
import defpackage.wv8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements bp2 {
    public final /* synthetic */ wv8 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b(wv8 wv8Var, Object obj, boolean z) {
        this.a = wv8Var;
        this.b = obj;
        this.c = z;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        return new ir.mservices.market.model.paging.b(new ExtensionAppsRepositoryImpl$getExtensionUpdateApps$1$1(this.a, this.b, this.c, null));
    }
}
