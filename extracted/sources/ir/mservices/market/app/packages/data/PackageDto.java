package ir.mservices.market.app.packages.data;

import defpackage.bf5;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class PackageDto implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    private static final PackageDto empty = new PackageDto("", EmptyList.a, true, "", null);

    @vo7("appPlusMetaDataList")
    private final List<ApplicationDTO> appList;

    @vo7("eol")
    private final boolean eol;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("shareText")
    private final String shareText;

    @vo7("title")
    private final String title;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final PackageDto getEmpty() {
            return PackageDto.empty;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PackageDto(String str, List<? extends ApplicationDTO> list, boolean z, String str2, List<String> list2) {
        this.title = str;
        this.appList = list;
        this.eol = z;
        this.shareText = str2;
        this.ignoreConditions = list2;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final List<ApplicationDTO> getAppList() {
        return this.appList;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    public final String getShareText() {
        return this.shareText;
    }

    public final String getTitle() {
        return this.title;
    }
}
