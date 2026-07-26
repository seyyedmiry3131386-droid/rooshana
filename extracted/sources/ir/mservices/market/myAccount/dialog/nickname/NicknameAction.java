package ir.mservices.market.myAccount.dialog.nickname;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface NicknameAction extends r50 {

    public static final class UpdateNicknameAction implements NicknameAction {
        private final String nickname;

        public UpdateNicknameAction(String str) {
            js3.p(str, "nickname");
            this.nickname = str;
        }

        public final String getNickname() {
            return this.nickname;
        }
    }
}
