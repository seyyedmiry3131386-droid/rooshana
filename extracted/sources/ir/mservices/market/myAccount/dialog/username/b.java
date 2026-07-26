package ir.mservices.market.myAccount.dialog.username;

import defpackage.bt2;
import defpackage.g51;
import defpackage.r50;
import defpackage.tx8;
import defpackage.y97;
import defpackage.ze2;
import ir.mservices.market.myAccount.dialog.username.UsernameAction;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ze2 {
    public final /* synthetic */ UsernameDialogViewModel a;

    public b(UsernameDialogViewModel usernameDialogViewModel) {
        this.a = usernameDialogViewModel;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        UsernameAction usernameAction = (UsernameAction) ((r50) obj);
        if (!(usernameAction instanceof UsernameAction.UpdateUsernameAction)) {
            throw new NoWhenBranchMatchedException();
        }
        UsernameDialogViewModel usernameDialogViewModel = this.a;
        bt2.G(y97.G(usernameDialogViewModel), null, null, new UsernameDialogViewModel$onUploadUsernameAction$1(usernameDialogViewModel, (UsernameAction.UpdateUsernameAction) usernameAction, null), 3);
        return tx8.a;
    }
}
