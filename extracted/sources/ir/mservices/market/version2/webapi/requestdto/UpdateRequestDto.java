package ir.mservices.market.version2.webapi.requestdto;

import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class UpdateRequestDto implements RequestDTO {

    @vo7("apps")
    private List<? extends UpdateListDto> apps;

    @vo7("fm")
    private long freeMemory;

    @vo7("tm")
    private long totalMemory;

    public UpdateRequestDto(List<? extends UpdateListDto> list, long j, long j2) {
        this.apps = list;
        this.totalMemory = j;
        this.freeMemory = j2;
    }

    public final List<UpdateListDto> getApps() {
        return this.apps;
    }

    public final long getFreeMemory() {
        return this.freeMemory;
    }

    public final long getTotalMemory() {
        return this.totalMemory;
    }

    public final void setApps(List<? extends UpdateListDto> list) {
        this.apps = list;
    }

    public final void setFreeMemory(long j) {
        this.freeMemory = j;
    }

    public final void setTotalMemory(long j) {
        this.totalMemory = j;
    }

    public /* synthetic */ UpdateRequestDto(List list, long j, long j2, int i, yd1 yd1Var) {
        this(list, (i & 2) != 0 ? 0L : j, (i & 4) != 0 ? 0L : j2);
    }
}
