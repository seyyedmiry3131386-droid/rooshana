package ir.mservices.market.common.ext.model;

import defpackage.bp2;
import defpackage.wv8;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements bp2 {
    public final /* synthetic */ wv8 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ c(wv8 wv8Var, String str, Object obj, boolean z) {
        this.a = wv8Var;
        this.b = str;
        this.c = obj;
        this.d = z;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        return new ir.mservices.market.model.paging.a(new ExtensionAppsRepositoryImpl$getExtensionApps$1$1(this.a, this.b, this.c, this.d, null), null);
    }
}
