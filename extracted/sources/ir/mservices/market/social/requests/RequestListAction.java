package ir.mservices.market.social.requests;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface RequestListAction extends r50 {

    public static final class ApproveAction implements RequestListAction {
        private final String accountKey;

        public ApproveAction(String str) {
            js3.p(str, "accountKey");
            this.accountKey = str;
        }

        public final String getAccountKey() {
            return this.accountKey;
        }
    }

    public static final class DismissAction implements RequestListAction {
        private final String accountKey;

        public DismissAction(String str) {
            js3.p(str, "accountKey");
            this.accountKey = str;
        }

        public final String getAccountKey() {
            return this.accountKey;
        }
    }
}
