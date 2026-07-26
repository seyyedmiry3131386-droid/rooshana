package ir.mservices.market.social.users.common.recycler;

import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class OwnUsersEmptyData implements MyketRecyclerData, g32, wo2 {
    public static final int d = js6.holder_users_empty_view;
    public final int a;
    public final int b;
    public final boolean c;

    public OwnUsersEmptyData(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return d;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof OwnUsersEmptyData);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(OwnUsersEmptyData.class.hashCode());
    }

    public final int hashCode() {
        return OwnUsersEmptyData.class.hashCode();
    }
}
