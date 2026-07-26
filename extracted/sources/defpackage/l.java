package defpackage;

import androidx.compose.foundation.a;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ l(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        ri1 ri1Var;
        switch (this.a) {
            case 0:
                s01 s01Var = qm3.a;
                a aVar = this.b;
                um3 um3Var = (um3) y97.t(aVar, s01Var);
                if (um3Var == null) {
                    un3.a("clickable only supports IndicationNodeFactory instances provided to LocalIndication, but Indication was provided instead. Either migrate the Indication implementation to implement IndicationNodeFactory, or use the other clickable overload that takes an Indication parameter, and explicitly pass LocalIndication.current there. The Indication instance provided here was: " + um3Var);
                }
                um3 um3Var2 = aVar.y;
                aVar.y = um3Var;
                if (um3Var2 != null && !js3.i(um3Var, um3Var2) && ((ri1Var = aVar.A) != null || !aVar.H)) {
                    if (ri1Var != null) {
                        aVar.D0(ri1Var);
                    }
                    aVar.A = null;
                    aVar.M0();
                }
                return tx8.a;
            default:
                this.b.w.invoke();
                return Boolean.TRUE;
        }
    }
}
