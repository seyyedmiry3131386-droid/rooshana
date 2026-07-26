package ir.mservices.market.myAccount.dialog.username;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface UsernameAction extends r50 {

    public static final class UpdateUsernameAction implements UsernameAction {
        private final String username;

        public UpdateUsernameAction(String str) {
            js3.p(str, "username");
            this.username = str;
        }

        public final String getUsername() {
            return this.username;
        }
    }
}
