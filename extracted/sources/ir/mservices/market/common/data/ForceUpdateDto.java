package ir.mservices.market.common.data;

import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.PackageListMetaDataDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class ForceUpdateDto implements Serializable {

    @vo7(PackageListMetaDataDTO.KEY_DESCRIPTION)
    private final String description;

    @vo7("globalMode")
    private boolean globalMode;

    public ForceUpdateDto(long j) {
        this(j, null, false, 6, null);
    }

    public final String getDescription() {
        return this.description;
    }

    public final long getFileLength() {
        return this.globalMode ? 1L : -1L;
    }

    public ForceUpdateDto(long j, String str) {
        this(j, str, false, 4, null);
    }

    public ForceUpdateDto(long j, String str, boolean z) {
        this.description = str;
        this.globalMode = z;
        this.globalMode = j > 0;
    }

    public /* synthetic */ ForceUpdateDto(long j, String str, boolean z, int i, yd1 yd1Var) {
        this(j, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z);
    }
}
