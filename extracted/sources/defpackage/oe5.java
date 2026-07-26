package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ApplicationStateDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oe5 implements gb8, h32 {
    public final /* synthetic */ sp2 a;

    public /* synthetic */ oe5(sp2 sp2Var) {
        this.a = sp2Var;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        Objects.toString(errorDTO);
        String strN = (errorDTO.getCode() == 2 || errorDTO.getCode() == -1) ? "NO_REPORT" : rm7.n(errorDTO.getCode(), "-SERVER_ERROR-");
        String strQ = bl4.q(errorDTO.getHttpStatus(), "http(", ")");
        String host = errorDTO.getHost();
        js3.o(host, "getHost(...)");
        this.a.g(6, strN, strQ, host);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        ResultDTO resultDTO = (ResultDTO) obj;
        int i = 5;
        switch (resultDTO.getCode()) {
            case 1:
                i = 0;
                break;
            case 2:
            case 6:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 8;
                break;
            default:
                lw.g(null, "Not a valid result code", null);
            case 5:
                i = 6;
                break;
        }
        this.a.g(Integer.valueOf(i), "", bl4.q(resultDTO.getCode(), "consume(", ")"), ApplicationStateDto.STATE_NONE);
    }
}
