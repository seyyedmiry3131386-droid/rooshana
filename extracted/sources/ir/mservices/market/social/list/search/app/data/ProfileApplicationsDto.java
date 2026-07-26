package ir.mservices.market.social.list.search.app.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import defpackage.yd1;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.io.Serializable;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileApplicationsDto implements Serializable, bf5 {
    public static final Companion Companion = new Companion(null);
    private static final ProfileApplicationsDto Empty = new ProfileApplicationsDto(EmptyList.a, true);

    @vo7("eol")
    private final boolean eol;

    @vo7(CommonDataKt.HOME_MOVIE_TYPE_LIST)
    private final List<ApplicationDTO> list;

    public static final class Companion {
        public /* synthetic */ Companion(yd1 yd1Var) {
            this();
        }

        public final ProfileApplicationsDto getEmpty() {
            return ProfileApplicationsDto.Empty;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfileApplicationsDto(List<? extends ApplicationDTO> list, boolean z) {
        js3.p(list, CommonDataKt.HOME_MOVIE_TYPE_LIST);
        this.list = list;
        this.eol = z;
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<ApplicationDTO> getList() {
        return this.list;
    }
}
