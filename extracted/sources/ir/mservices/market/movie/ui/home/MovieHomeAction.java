package ir.mservices.market.movie.ui.home;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface MovieHomeAction extends r50 {

    public static final class InitAction implements MovieHomeAction {
        private final boolean hasSideNavigation;

        public InitAction(boolean z) {
            this.hasSideNavigation = z;
        }

        public static /* synthetic */ InitAction copy$default(InitAction initAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = initAction.hasSideNavigation;
            }
            return initAction.copy(z);
        }

        public final boolean component1() {
            return this.hasSideNavigation;
        }

        public final InitAction copy(boolean z) {
            return new InitAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof InitAction) && this.hasSideNavigation == ((InitAction) obj).hasSideNavigation;
        }

        public final boolean getHasSideNavigation() {
            return this.hasSideNavigation;
        }

        public int hashCode() {
            return this.hasSideNavigation ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("InitAction(hasSideNavigation=", ")", this.hasSideNavigation);
        }
    }
}
