package defpackage;

import android.content.Context;
import ir.mservices.market.app.update.UpdateViewModel;
import java.util.Map;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zz8 implements vz8, iz8 {
    public final /* synthetic */ UpdateViewModel a;

    public /* synthetic */ zz8(UpdateViewModel updateViewModel) {
        this.a = updateViewModel;
    }

    @Override // defpackage.vz8
    public void a(Map map, String str) {
        r30 r30Var = r30.j;
        UpdateViewModel updateViewModel = this.a;
        updateViewModel.Z = r30Var;
        updateViewModel.e();
    }

    @Override // defpackage.iz8
    public void b() {
        UpdateViewModel updateViewModel = this.a;
        l lVar = updateViewModel.V;
        Boolean bool = Boolean.FALSE;
        lVar.getClass();
        lVar.p(null, bool);
        String string = ((Context) updateViewModel.w.c).getString(rs6.update_error);
        js3.o(string, "getString(...)");
        updateViewModel.f(string);
    }
}
