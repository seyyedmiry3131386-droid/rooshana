package defpackage;

import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;
import kotlin.b;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes3.dex */
public final class p2 implements h32, il0 {
    public final /* synthetic */ om0 a;

    public /* synthetic */ p2(om0 om0Var) {
        this.a = om0Var;
    }

    @Override // defpackage.il0
    public void e(dl0 dl0Var, h77 h77Var) {
        boolean z = h77Var.a.q;
        om0 om0Var = this.a;
        if (z) {
            om0Var.resumeWith(h77Var.b);
        } else {
            om0Var.resumeWith(b.a(new HttpException(h77Var)));
        }
    }

    @Override // defpackage.h32
    public void j(Serializable serializable) {
        ErrorDTO errorDTO = (ErrorDTO) serializable;
        js3.m(errorDTO);
        this.a.resumeWith(new h99(errorDTO));
    }

    @Override // defpackage.il0
    public void o(dl0 dl0Var, Throwable th) {
        this.a.resumeWith(b.a(th));
    }
}
