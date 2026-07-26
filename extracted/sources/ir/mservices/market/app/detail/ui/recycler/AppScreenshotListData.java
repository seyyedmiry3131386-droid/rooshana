package ir.mservices.market.app.detail.ui.recycler;

import android.os.Parcelable;
import defpackage.bz6;
import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class AppScreenshotListData implements MyketRecyclerData, wo2, g32 {
    public static final int d = js6.holder_app_screenshot;
    public final bz6 a;
    public final boolean b;
    public Parcelable c;

    public AppScreenshotListData(bz6 bz6Var) {
        this.a = bz6Var;
        this.b = false;
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
        if (this == obj) {
            return true;
        }
        return AppScreenshotListData.class.equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(AppScreenshotListData.class.hashCode());
    }

    public final int hashCode() {
        return AppScreenshotListData.class.hashCode();
    }

    public AppScreenshotListData(bz6 bz6Var, boolean z) {
        this.a = bz6Var;
        this.b = z;
    }
}
