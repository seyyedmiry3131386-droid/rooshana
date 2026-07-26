package ir.mservices.market.app.recommended.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ApplicationListDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("ignoreConditions")
    private final List<String> ignoreConditions;

    @vo7("applications")
    private final List<ApplicationDTO> list;

    /* JADX WARN: Multi-variable type inference failed */
    public ApplicationListDto(List<? extends ApplicationDTO> list, boolean z, List<String> list2) {
        js3.p(list, CommonDataKt.HOME_MOVIE_TYPE_LIST);
        this.list = list;
        this.eol = z;
        this.ignoreConditions = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApplicationListDto copy$default(ApplicationListDto applicationListDto, List list, boolean z, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = applicationListDto.list;
        }
        if ((i & 2) != 0) {
            z = applicationListDto.eol;
        }
        if ((i & 4) != 0) {
            list2 = applicationListDto.ignoreConditions;
        }
        return applicationListDto.copy(list, z, list2);
    }

    public final List<ApplicationDTO> component1() {
        return this.list;
    }

    public final boolean component2() {
        return this.eol;
    }

    public final List<String> component3() {
        return this.ignoreConditions;
    }

    public final ApplicationListDto copy(List<? extends ApplicationDTO> list, boolean z, List<String> list2) {
        js3.p(list, CommonDataKt.HOME_MOVIE_TYPE_LIST);
        return new ApplicationListDto(list, z, list2);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApplicationListDto)) {
            return false;
        }
        ApplicationListDto applicationListDto = (ApplicationListDto) obj;
        return js3.i(this.list, applicationListDto.list) && this.eol == applicationListDto.eol && js3.i(this.ignoreConditions, applicationListDto.ignoreConditions);
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<String> getIgnoreConditions() {
        return this.ignoreConditions;
    }

    public final List<ApplicationDTO> getList() {
        return this.list;
    }

    public int hashCode() {
        int iHashCode = ((this.list.hashCode() * 31) + (this.eol ? 1231 : 1237)) * 31;
        List<String> list = this.ignoreConditions;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "ApplicationListDto(list=" + this.list + ", eol=" + this.eol + ", ignoreConditions=" + this.ignoreConditions + ")";
    }
}
