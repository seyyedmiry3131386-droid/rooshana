package ir.mservices.market.search.history.ui;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface SearchAction extends r50 {

    public static final class OpenAction implements SearchAction {
        private final boolean open;

        public OpenAction(boolean z) {
            this.open = z;
        }

        public static /* synthetic */ OpenAction copy$default(OpenAction openAction, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = openAction.open;
            }
            return openAction.copy(z);
        }

        public final boolean component1() {
            return this.open;
        }

        public final OpenAction copy(boolean z) {
            return new OpenAction(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof OpenAction) && this.open == ((OpenAction) obj).open;
        }

        public final boolean getOpen() {
            return this.open;
        }

        public int hashCode() {
            return this.open ? 1231 : 1237;
        }

        public String toString() {
            return bl4.x("OpenAction(open=", ")", this.open);
        }
    }
}
