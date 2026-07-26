package ir.mservices.market.app.home;

import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface HomeAction extends r50 {

    public static final class InitAction implements HomeAction {
        private final String categoryId;
        private final boolean hasSideNavigation;

        public InitAction(String str, boolean z) {
            js3.p(str, "categoryId");
            this.categoryId = str;
            this.hasSideNavigation = z;
        }

        public static /* synthetic */ InitAction copy$default(InitAction initAction, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initAction.categoryId;
            }
            if ((i & 2) != 0) {
                z = initAction.hasSideNavigation;
            }
            return initAction.copy(str, z);
        }

        public final String component1() {
            return this.categoryId;
        }

        public final boolean component2() {
            return this.hasSideNavigation;
        }

        public final InitAction copy(String str, boolean z) {
            js3.p(str, "categoryId");
            return new InitAction(str, z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitAction)) {
                return false;
            }
            InitAction initAction = (InitAction) obj;
            return js3.i(this.categoryId, initAction.categoryId) && this.hasSideNavigation == initAction.hasSideNavigation;
        }

        public final String getCategoryId() {
            return this.categoryId;
        }

        public final boolean getHasSideNavigation() {
            return this.hasSideNavigation;
        }

        public int hashCode() {
            return (this.categoryId.hashCode() * 31) + (this.hasSideNavigation ? 1231 : 1237);
        }

        public String toString() {
            return "InitAction(categoryId=" + this.categoryId + ", hasSideNavigation=" + this.hasSideNavigation + ")";
        }
    }
}
