package defpackage;

import ir.mservices.market.gateway.GatewayBottomDialogFragment;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import ir.mservices.market.views.MyketTextView;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class oq2 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ GatewayBottomDialogFragment b;

    public /* synthetic */ oq2(GatewayBottomDialogFragment gatewayBottomDialogFragment, int i) {
        this.a = i;
        this.b = gatewayBottomDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        switch (this.a) {
            case 0:
                GatewayDTO gatewayDTO = (GatewayDTO) obj;
                GatewayBottomDialogFragment gatewayBottomDialogFragment = this.b;
                mq2 mq2Var = gatewayBottomDialogFragment.i1;
                js3.m(mq2Var);
                mq2Var.b.setTitles(gatewayDTO.getButtonText(), null);
                mq2 mq2Var2 = gatewayBottomDialogFragment.i1;
                js3.m(mq2Var2);
                MyketTextView myketTextView = mq2Var2.c;
                if (myketTextView != null) {
                    myketTextView.setText(gatewayDTO.getDescription());
                }
                break;
            case 1:
                Object objE = ((rq2) this.b.k1.getValue()).E((a06) obj, g51Var);
                if (objE != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                Object objA = ((bz6) obj).a.a(new oq2(this.b, 1), g51Var);
                if (objA != CoroutineSingletons.a) {
                    break;
                }
                break;
        }
        return tx8.a;
    }
}
