package ir.mservices.market.pika.send.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class InstalledAppsTitleData implements MyketRecyclerData, g32 {
    public static final int b = js6.holder_installed_app_title;
    public final int a;

    public InstalledAppsTitleData(int i) {
        this.a = i;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!InstalledAppsTitleData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.pika.send.recycler.InstalledAppsTitleData");
        return this.a == ((InstalledAppsTitleData) obj).a;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "TitleData";
    }

    public final int hashCode() {
        return this.a;
    }
}
