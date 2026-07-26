package defpackage;

import ir.mservices.market.versionNote.ui.VersionNoteDialogFragment;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes3.dex */
public final class l49 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ VersionNoteDialogFragment b;

    public /* synthetic */ l49(VersionNoteDialogFragment versionNoteDialogFragment, int i) {
        this.a = i;
        this.b = versionNoteDialogFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        xe2 xe2Var;
        switch (this.a) {
            case 0:
                Object objE = ((k49) this.b.e1.getValue()).E((a06) obj, g51Var);
                if (objE != CoroutineSingletons.a) {
                    break;
                }
                break;
            default:
                bz6 bz6Var = (bz6) obj;
                if (bz6Var == null || (xe2Var = bz6Var.a) == null || (r4 = xe2Var.a(new l49(this.b, 0), g51Var)) != CoroutineSingletons.a) {
                }
                break;
        }
        return tx8.a;
    }
}
