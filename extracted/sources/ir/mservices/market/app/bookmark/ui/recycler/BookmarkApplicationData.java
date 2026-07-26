package ir.mservices.market.app.bookmark.ui.recycler;

import defpackage.fu7;
import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.pv6;
import defpackage.rv6;
import defpackage.vb7;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import ir.mservices.market.version2.ui.recycler.data.MultiSelectRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkApplicationData extends MultiSelectRecyclerData implements g32 {
    public static final int k = js6.holder_multi_select_bookmark;
    public final vb7 h;
    public final fu7 i;
    public final DownloadSummeryApplicationDto j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BookmarkApplicationData(rv6 rv6Var, vb7 vb7Var, pv6 pv6Var, DownloadSummeryApplicationDto downloadSummeryApplicationDto) {
        super(rv6Var);
        js3.p(rv6Var, "multiselectVisibilityChangeState");
        js3.p(pv6Var, "installStateFlow");
        this.h = vb7Var;
        this.i = pv6Var;
        this.j = downloadSummeryApplicationDto;
        downloadSummeryApplicationDto.getFileSize();
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return k;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!BookmarkApplicationData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.bookmark.ui.recycler.BookmarkApplicationData");
        BookmarkApplicationData bookmarkApplicationData = (BookmarkApplicationData) obj;
        return js3.i(this.j, bookmarkApplicationData.j) && this.f == bookmarkApplicationData.f && ((Boolean) this.e.a.getValue()).booleanValue() == ((Boolean) bookmarkApplicationData.e.a.getValue()).booleanValue() && ((Boolean) this.a.getValue()).booleanValue() == ((Boolean) bookmarkApplicationData.a.getValue()).booleanValue() && this.g == bookmarkApplicationData.g;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String packageName = this.j.getPackageName();
        js3.o(packageName, "getPackageName(...)");
        return packageName;
    }

    public final int hashCode() {
        return this.j.hashCode();
    }
}
