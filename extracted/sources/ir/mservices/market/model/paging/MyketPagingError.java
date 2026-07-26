package ir.mservices.market.model.paging;

import defpackage.js3;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;

/* JADX INFO: loaded from: classes3.dex */
public final class MyketPagingError extends Throwable {
    public final ErrorDTO a;

    public MyketPagingError(ErrorDTO errorDTO) {
        js3.p(errorDTO, "errorDto");
        this.a = errorDTO;
    }
}
