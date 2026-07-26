package ir.mservices.market.social.list.search;

import defpackage.bl4;
import defpackage.js3;
import defpackage.o40;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface SearchProfileListAction extends r50 {

    public static final class Init implements SearchProfileListAction {
        private final boolean isApp;

        public Init(boolean z) {
            this.isApp = z;
        }

        public static /* synthetic */ Init copy$default(Init init, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = init.isApp;
            }
            return init.copy(z);
        }

        public final boolean component1() {
            return this.isApp;
        }

        public final Init copy(boolean z) {
            return new Init(z);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Init) && this.isApp == ((Init) obj).isApp;
        }

        public int hashCode() {
            return this.isApp ? 1231 : 1237;
        }

        public final boolean isApp() {
            return this.isApp;
        }

        public String toString() {
            return bl4.x("Init(isApp=", ")", this.isApp);
        }
    }

    public static final class Search implements SearchProfileListAction {
        private final String query;

        public Search(String str) {
            js3.p(str, "query");
            this.query = str;
        }

        public static /* synthetic */ Search copy$default(Search search, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = search.query;
            }
            return search.copy(str);
        }

        public final String component1() {
            return this.query;
        }

        public final Search copy(String str) {
            js3.p(str, "query");
            return new Search(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Search) && js3.i(this.query, ((Search) obj).query);
        }

        public final String getQuery() {
            return this.query;
        }

        public int hashCode() {
            return this.query.hashCode();
        }

        public String toString() {
            return o40.y("Search(query=", this.query, ")");
        }
    }
}
