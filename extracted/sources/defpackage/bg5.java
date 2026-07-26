package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import ir.mservices.market.version2.webapi.responsedto.MyketVersionDTO;
import j$.util.Objects;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bg5 implements gb8, h32 {
    public final /* synthetic */ eg5 a;

    public /* synthetic */ bg5(eg5 eg5Var) {
        this.a = eg5Var;
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        Objects.toString((ErrorDTO) serializable);
        this.a.i(false);
    }

    @Override // defpackage.gb8
    public void onSuccess(Object obj) {
        MyketVersionDTO myketVersionDTO = (MyketVersionDTO) obj;
        Objects.toString(myketVersionDTO);
        int latestVersion = myketVersionDTO.getLatestVersion();
        eg5 eg5Var = this.a;
        if (latestVersion > 1028) {
            eg5Var.m(myketVersionDTO.getLatestVersion(), myketVersionDTO.getMessage(), myketVersionDTO.getTitle(), myketVersionDTO.getIntent(), myketVersionDTO.isForceUpdate());
            if (eg5Var.m < 0) {
                eg5Var.l();
            }
            if (myketVersionDTO.isForceUpdate()) {
                t32.b().g(new cg5());
            } else {
                t32 t32VarB = t32.b();
                eg5Var.j();
                t32VarB.g(new dg5());
            }
        } else {
            eg5Var.m(1028, myketVersionDTO.getMessage(), myketVersionDTO.getTitle(), myketVersionDTO.getIntent(), false);
            if (myketVersionDTO.getLatestVersion() < 1028) {
                myketVersionDTO.getLatestVersion();
            }
        }
        eg5Var.i(true);
    }
}
