package ir.mservices.market.pika.common.model;

import android.content.Context;
import defpackage.on6;

/* JADX INFO: loaded from: classes3.dex */
public final class NearbyRepository_Factory implements on6 {
    private final on6 contextProvider;

    private NearbyRepository_Factory(on6 on6Var) {
        this.contextProvider = on6Var;
    }

    public static NearbyRepository_Factory create(on6 on6Var) {
        return new NearbyRepository_Factory(on6Var);
    }

    public static NearbyRepository newInstance(Context context) {
        return new NearbyRepository(context);
    }

    @Override // defpackage.pn6
    public NearbyRepository get() {
        return newInstance((Context) this.contextProvider.get());
    }
}
