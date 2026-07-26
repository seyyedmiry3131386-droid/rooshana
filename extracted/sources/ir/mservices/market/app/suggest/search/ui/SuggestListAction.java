package ir.mservices.market.app.suggest.search.ui;

import defpackage.js3;
import defpackage.o40;
import defpackage.r50;

/* JADX INFO: loaded from: classes3.dex */
public interface SuggestListAction extends r50 {

    public static final class GoogleResultReceivedAction implements SuggestListAction {
        private final String html;

        public GoogleResultReceivedAction(String str) {
            this.html = str;
        }

        public static /* synthetic */ GoogleResultReceivedAction copy$default(GoogleResultReceivedAction googleResultReceivedAction, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googleResultReceivedAction.html;
            }
            return googleResultReceivedAction.copy(str);
        }

        public final String component1() {
            return this.html;
        }

        public final GoogleResultReceivedAction copy(String str) {
            return new GoogleResultReceivedAction(str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof GoogleResultReceivedAction) && js3.i(this.html, ((GoogleResultReceivedAction) obj).html);
        }

        public final String getHtml() {
            return this.html;
        }

        public int hashCode() {
            String str = this.html;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            return o40.y("GoogleResultReceivedAction(html=", this.html, ")");
        }
    }
}
