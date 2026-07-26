package ir.mservices.market.social.profile.user;

import defpackage.bl4;
import defpackage.dw1;
import defpackage.js3;
import defpackage.r50;
import ir.mservices.market.social.profile.user.data.ReportType;

/* JADX INFO: loaded from: classes3.dex */
public interface UserProfileAction extends r50 {

    public static final class ReportAction implements UserProfileAction {
        private final String accountKey;
        private final String description;
        private final ReportType type;

        public ReportAction(String str, ReportType reportType, String str2) {
            js3.p(str, "accountKey");
            js3.p(reportType, "type");
            this.accountKey = str;
            this.type = reportType;
            this.description = str2;
        }

        public static /* synthetic */ ReportAction copy$default(ReportAction reportAction, String str, ReportType reportType, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = reportAction.accountKey;
            }
            if ((i & 2) != 0) {
                reportType = reportAction.type;
            }
            if ((i & 4) != 0) {
                str2 = reportAction.description;
            }
            return reportAction.copy(str, reportType, str2);
        }

        public final String component1() {
            return this.accountKey;
        }

        public final ReportType component2() {
            return this.type;
        }

        public final String component3() {
            return this.description;
        }

        public final ReportAction copy(String str, ReportType reportType, String str2) {
            js3.p(str, "accountKey");
            js3.p(reportType, "type");
            return new ReportAction(str, reportType, str2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReportAction)) {
                return false;
            }
            ReportAction reportAction = (ReportAction) obj;
            return js3.i(this.accountKey, reportAction.accountKey) && this.type == reportAction.type && js3.i(this.description, reportAction.description);
        }

        public final String getAccountKey() {
            return this.accountKey;
        }

        public final String getDescription() {
            return this.description;
        }

        public final ReportType getType() {
            return this.type;
        }

        public int hashCode() {
            int iHashCode = (this.type.hashCode() + (this.accountKey.hashCode() * 31)) * 31;
            String str = this.description;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            String str = this.accountKey;
            ReportType reportType = this.type;
            String str2 = this.description;
            StringBuilder sb = new StringBuilder("ReportAction(accountKey=");
            sb.append(str);
            sb.append(", type=");
            sb.append(reportType);
            sb.append(", description=");
            return dw1.s(sb, str2, ")");
        }
    }

    public static final class ScrollYAction implements UserProfileAction {
        private final Integer scrollY;

        public ScrollYAction(Integer num) {
            this.scrollY = num;
        }

        public static /* synthetic */ ScrollYAction copy$default(ScrollYAction scrollYAction, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                num = scrollYAction.scrollY;
            }
            return scrollYAction.copy(num);
        }

        public final Integer component1() {
            return this.scrollY;
        }

        public final ScrollYAction copy(Integer num) {
            return new ScrollYAction(num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ScrollYAction) && js3.i(this.scrollY, ((ScrollYAction) obj).scrollY);
        }

        public final Integer getScrollY() {
            return this.scrollY;
        }

        public int hashCode() {
            Integer num = this.scrollY;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        public String toString() {
            return "ScrollYAction(scrollY=" + this.scrollY + ")";
        }
    }

    public static final class TabAction implements UserProfileAction {
        private final int selectedTab;

        public TabAction(int i) {
            this.selectedTab = i;
        }

        public static /* synthetic */ TabAction copy$default(TabAction tabAction, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = tabAction.selectedTab;
            }
            return tabAction.copy(i);
        }

        public final int component1() {
            return this.selectedTab;
        }

        public final TabAction copy(int i) {
            return new TabAction(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabAction) && this.selectedTab == ((TabAction) obj).selectedTab;
        }

        public final int getSelectedTab() {
            return this.selectedTab;
        }

        public int hashCode() {
            return this.selectedTab;
        }

        public String toString() {
            return bl4.q(this.selectedTab, "TabAction(selectedTab=", ")");
        }
    }

    public static final class TabAnimationAction implements UserProfileAction {
        private final boolean animation;

        public TabAnimationAction(boolean z) {
            this.animation = z;
        }

        public static /* synthetic */ TabAnimationAction copy$default(TabAnimationAction tabAnimationAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = tabAnimationAction.animation;
            }
            return tabAnimationAction.copy(z);
        }

        public final boolean component1() {
            return this.animation;
        }

        public final TabAnimationAction copy(boolean z) {
            return new TabAnimationAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TabAnimationAction) && this.animation == ((TabAnimationAction) obj).animation;
        }

        public final boolean getAnimation() {
            return this.animation;
        }

        public int hashCode() {
            return this.animation ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("TabAnimationAction(animation=", ")", this.animation);
        }
    }
}
