package ir.mservices.market.myAccount.city;

import defpackage.js3;
import defpackage.o40;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface SelectCityAction extends r50 {

    public static final class CheckCityListContainmentAction implements SelectCityAction {
        public static final CheckCityListContainmentAction INSTANCE = new CheckCityListContainmentAction();

        private CheckCityListContainmentAction() {
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof CheckCityListContainmentAction);
        }

        public int hashCode() {
            return -1439152804;
        }

        public String toString() {
            return "CheckCityListContainmentAction";
        }
    }

    public static final class UpdateQueryAction implements SelectCityAction {
        private final String query;

        public UpdateQueryAction(String str) {
            js3.p(str, "query");
            this.query = str;
        }

        public static /* synthetic */ UpdateQueryAction copy$default(UpdateQueryAction updateQueryAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = updateQueryAction.query;
            }
            return updateQueryAction.copy(str);
        }

        public final String component1() {
            return this.query;
        }

        public final UpdateQueryAction copy(String str) {
            js3.p(str, "query");
            return new UpdateQueryAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UpdateQueryAction) && js3.i(this.query, ((UpdateQueryAction) obj).query);
        }

        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return o40.y("UpdateQueryAction(query=", this.query, ")");
        }
    }
}
