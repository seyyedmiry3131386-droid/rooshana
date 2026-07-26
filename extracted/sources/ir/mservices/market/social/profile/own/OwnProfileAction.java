package ir.mservices.market.social.profile.own;

import defpackage.bl4;
import defpackage.js3;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface OwnProfileAction extends r50 {

    public static final class ScrollYAction implements OwnProfileAction {
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

    public static final class TabAction implements OwnProfileAction {
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

    public static final class TabAnimationAction implements OwnProfileAction {
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
