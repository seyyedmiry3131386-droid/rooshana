package defpackage;

import ir.myket.movie.common.domain.models.RestrictionButton;
import ir.myket.movie.common.domain.models.SampleWatch;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vc7 implements rp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SampleWatch b;

    public /* synthetic */ vc7(SampleWatch sampleWatch, int i) {
        this.a = i;
        this.b = sampleWatch;
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                qz0 qz0Var = (qz0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var.R(iIntValue & 1, (iIntValue & 17) != 16)) {
                    RestrictionButton restrictionButton = this.b.e;
                    String str = restrictionButton != null ? restrictionButton.a : null;
                    if (str == null) {
                        str = "";
                    }
                    mi8.b(str, null, 0L, 0L, 0L, null, 0L, 2, false, 0, 0, ((wf5) qz0Var.j(aw8.a)).d, qz0Var, 0, 384, 126974);
                } else {
                    qz0Var.U();
                }
                break;
            case 1:
                qz0 qz0Var2 = (qz0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var2.R(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    RestrictionButton restrictionButton2 = this.b.e;
                    String str2 = restrictionButton2 != null ? restrictionButton2.a : null;
                    if (str2 == null) {
                        str2 = "";
                    }
                    mi8.b(str2, null, 0L, 0L, 0L, null, 0L, 2, false, 2, 0, ((wf5) qz0Var2.j(aw8.a)).d, qz0Var2, 0, 24960, 110590);
                } else {
                    qz0Var2.U();
                }
                break;
            default:
                qz0 qz0Var3 = (qz0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                js3.p((db7) obj, "$this$Button");
                if (qz0Var3.R(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    RestrictionButton restrictionButton3 = this.b.e;
                    String strF = restrictionButton3 != null ? restrictionButton3.a : null;
                    if (strF == null) {
                        qz0Var3.a0(-1841511438);
                        strF = ln2.f(vs6.player_subscription_dialog_button_text, qz0Var3);
                        qz0Var3.q(false);
                    } else {
                        qz0Var3.a0(-1841512895);
                        qz0Var3.q(false);
                    }
                    mi8.b(strF, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((wf5) qz0Var3.j(aw8.a)).c, qz0Var3, 0, 0, 131070);
                } else {
                    qz0Var3.U();
                }
                break;
        }
        return tx8.a;
    }
}
