package ir.mservices.market.app.detail.ui;

import defpackage.js3;
import defpackage.r50;
import defpackage.t61;

/* JADX INFO: loaded from: classes3.dex */
public interface AppDetailAction extends r50 {

    public static final class DisableNotification implements AppDetailAction {
        public static final DisableNotification INSTANCE = new DisableNotification();

        private DisableNotification() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof DisableNotification);
        }

        public int hashCode() {
            return -598377799;
        }

        public String toString() {
            return "DisableNotification";
        }
    }

    public static final class InitAction implements AppDetailAction {
        private final boolean isTabletDevice;
        private final boolean isTabletLand;
        private final boolean isTvDevice;
        private final int minHeight;
        private final float screenWidth;

        public InitAction(float f, int i, boolean z, boolean z2, boolean z3) {
            this.screenWidth = f;
            this.minHeight = i;
            this.isTvDevice = z;
            this.isTabletLand = z2;
            this.isTabletDevice = z3;
        }

        public static /* synthetic */ InitAction copy$default(InitAction initAction, float f, int i, boolean z, boolean z2, boolean z3, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                f = initAction.screenWidth;
            }
            if ((i2 & 2) != 0) {
                i = initAction.minHeight;
            }
            if ((i2 & 4) != 0) {
                z = initAction.isTvDevice;
            }
            if ((i2 & 8) != 0) {
                z2 = initAction.isTabletLand;
            }
            if ((i2 & 16) != 0) {
                z3 = initAction.isTabletDevice;
            }
            boolean z4 = z3;
            boolean z5 = z;
            return initAction.copy(f, i, z5, z2, z4);
        }

        public final float component1() {
            return this.screenWidth;
        }

        public final int component2() {
            return this.minHeight;
        }

        public final boolean component3() {
            return this.isTvDevice;
        }

        public final boolean component4() {
            return this.isTabletLand;
        }

        public final boolean component5() {
            return this.isTabletDevice;
        }

        public final InitAction copy(float f, int i, boolean z, boolean z2, boolean z3) {
            return new InitAction(f, i, z, z2, z3);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof InitAction)) {
                return false;
            }
            InitAction initAction = (InitAction) obj;
            return Float.compare(this.screenWidth, initAction.screenWidth) == 0 && this.minHeight == initAction.minHeight && this.isTvDevice == initAction.isTvDevice && this.isTabletLand == initAction.isTabletLand && this.isTabletDevice == initAction.isTabletDevice;
        }

        public final int getMinHeight() {
            return this.minHeight;
        }

        public final float getScreenWidth() {
            return this.screenWidth;
        }

        public int hashCode() {
            return (((((((Float.floatToIntBits(this.screenWidth) * 31) + this.minHeight) * 31) + (this.isTvDevice ? 1231 : 1237)) * 31) + (this.isTabletLand ? 1231 : 1237)) * 31) + (this.isTabletDevice ? 1231 : 1237);
        }

        public final boolean isTabletDevice() {
            return this.isTabletDevice;
        }

        public final boolean isTabletLand() {
            return this.isTabletLand;
        }

        public final boolean isTvDevice() {
            return this.isTvDevice;
        }

        public String toString() {
            float f = this.screenWidth;
            int i = this.minHeight;
            boolean z = this.isTvDevice;
            boolean z2 = this.isTabletLand;
            boolean z3 = this.isTabletDevice;
            StringBuilder sb = new StringBuilder("InitAction(screenWidth=");
            sb.append(f);
            sb.append(", minHeight=");
            sb.append(i);
            sb.append(", isTvDevice=");
            t61.A(sb, z, ", isTabletLand=", z2, ", isTabletDevice=");
            return t61.l(sb, z3, ")");
        }
    }

    public static final class ReviewAILikeAction implements AppDetailAction {
        private final String id;
        private final boolean isPositive;

        public ReviewAILikeAction(boolean z, String str) {
            js3.p(str, "id");
            this.isPositive = z;
            this.id = str;
        }

        public static /* synthetic */ ReviewAILikeAction copy$default(ReviewAILikeAction reviewAILikeAction, boolean z, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                z = reviewAILikeAction.isPositive;
            }
            if ((i & 2) != 0) {
                str = reviewAILikeAction.id;
            }
            return reviewAILikeAction.copy(z, str);
        }

        public final boolean component1() {
            return this.isPositive;
        }

        public final String component2() {
            return this.id;
        }

        public final ReviewAILikeAction copy(boolean z, String str) {
            js3.p(str, "id");
            return new ReviewAILikeAction(z, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ReviewAILikeAction)) {
                return false;
            }
            ReviewAILikeAction reviewAILikeAction = (ReviewAILikeAction) obj;
            return this.isPositive == reviewAILikeAction.isPositive && js3.i(this.id, reviewAILikeAction.id);
        }

        public final String getId() {
            return this.id;
        }

        public int hashCode() {
            return this.id.hashCode() + ((this.isPositive ? 1231 : 1237) * 31);
        }

        public final boolean isPositive() {
            return this.isPositive;
        }

        public String toString() {
            return "ReviewAILikeAction(isPositive=" + this.isPositive + ", id=" + this.id + ")";
        }
    }

    public static final class ShowMoreAIAction implements AppDetailAction {
        public static final ShowMoreAIAction INSTANCE = new ShowMoreAIAction();

        private ShowMoreAIAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof ShowMoreAIAction);
        }

        public int hashCode() {
            return -2071939734;
        }

        public String toString() {
            return "ShowMoreAIAction";
        }
    }
}
