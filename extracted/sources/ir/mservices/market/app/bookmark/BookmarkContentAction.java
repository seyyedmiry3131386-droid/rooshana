package ir.mservices.market.app.bookmark;

import defpackage.bl4;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface BookmarkContentAction extends r50 {

    public static final class UpdateSelectedPageAction implements BookmarkContentAction {
        private final int page;

        public UpdateSelectedPageAction(int i) {
            this.page = i;
        }

        public static /* synthetic */ UpdateSelectedPageAction copy$default(UpdateSelectedPageAction updateSelectedPageAction, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                i = updateSelectedPageAction.page;
            }
            return updateSelectedPageAction.copy(i);
        }

        public final int component1() {
            return this.page;
        }

        public final UpdateSelectedPageAction copy(int i) {
            return new UpdateSelectedPageAction(i);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateSelectedPageAction) && this.page == ((UpdateSelectedPageAction) obj).page;
        }

        public final int getPage() {
            return this.page;
        }

        public int hashCode() {
            return this.page;
        }

        public String toString() {
            return bl4.q(this.page, "UpdateSelectedPageAction(page=", ")");
        }
    }
}
