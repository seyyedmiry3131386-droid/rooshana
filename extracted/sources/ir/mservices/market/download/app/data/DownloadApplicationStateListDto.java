package ir.mservices.market.download.app.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.common.ext.data.ExtensionPointDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class DownloadApplicationStateListDto implements Serializable, bf5 {

    @vo7("downloadingAppListExt")
    private final ExtensionPointDto downloadingExt;

    @vo7("items")
    private final List<ApplicationStateDto> items;

    /* JADX WARN: Multi-variable type inference failed */
    public DownloadApplicationStateListDto(List<? extends ApplicationStateDto> list, ExtensionPointDto extensionPointDto) {
        js3.p(list, "items");
        this.items = list;
        this.downloadingExt = extensionPointDto;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return true;
    }

    public final ExtensionPointDto getDownloadingExt() {
        return this.downloadingExt;
    }

    public final List<ApplicationStateDto> getItems() {
        return this.items;
    }

    public /* synthetic */ DownloadApplicationStateListDto(List list, ExtensionPointDto extensionPointDto, int i, yd1 yd1Var) {
        this(list, (i & 2) != 0 ? null : extensionPointDto);
    }
}
