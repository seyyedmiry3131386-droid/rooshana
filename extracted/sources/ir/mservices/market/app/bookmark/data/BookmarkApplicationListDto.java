package ir.mservices.market.app.bookmark.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.yd1;
import ir.mservices.market.common.data.DownloadSummeryApplicationDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class BookmarkApplicationListDto implements Serializable, bf5 {
    private final List<DownloadSummeryApplicationDto> applications;
    private final boolean eol;

    /* JADX WARN: Multi-variable type inference failed */
    public BookmarkApplicationListDto(List<? extends DownloadSummeryApplicationDto> list, boolean z) {
        js3.p(list, "applications");
        this.applications = list;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final List<DownloadSummeryApplicationDto> getApplications() {
        return this.applications;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public /* synthetic */ BookmarkApplicationListDto(List list, boolean z, int i, yd1 yd1Var) {
        this(list, (i & 2) != 0 ? false : z);
    }
}
